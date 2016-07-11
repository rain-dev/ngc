import java.util.LinkedList;
import java.util.List;
import org.antlr.v4.runtime.tree.*;

public class NGC2CPPSelectionStatementTranslator 
{
	private int index;
	
	private NGC2CPPListener conditionListener;
	private NGC2CPPListener statementListener;
	private NGC2CPPListener elseListener;
	
	private NGC2CPPListener parent;
	
	public NGC2CPPSelectionStatementTranslator(NGC2CPPListener parent)
	{
		this.index = NGC2CPPFactory.getInstance().getSelectionStatementIndex();
		this.parent = parent;
		
		this.conditionListener = null;
		this.statementListener = null;
		this.elseListener = null;
	}
	
	public void translate(ParseTree t) 
	{
		int n = t.getChildCount();
		
		NGC2CPPWalker conditionWalker = new NGC2CPPWalker();
		this.conditionListener = new NGC2CPPListener(conditionWalker, parent);
		conditionWalker.walk(conditionListener, t.getChild(2));
		
		NGC2CPPWalker statementWalker = new NGC2CPPWalker();
		this.statementListener = new NGC2CPPListener(statementWalker, parent);
		statementWalker.walk(statementListener, t.getChild(4));
				
		if(n == 7)
		{
			NGC2CPPWalker elseWalker = new NGC2CPPWalker();
			this.elseListener = new NGC2CPPListener(elseWalker, parent);
			elseWalker.walk(elseListener, t.getChild(6));
		}
    }
	
	public void result(StringBuilder commonNgcCode, StringBuilder ngcCode, StringBuilder cppCode)
	{
		List<String> conditionUndefined = this.conditionListener.getUndefinedId();
		if(this.elseListener != null)
			conditionUndefined.addAll(this.elseListener.getUndefinedId());
		
		List<String> inCompileVariable = new LinkedList<String>();
		for(int i = 0; i < conditionUndefined.size(); i++)
		{
			String symbol = conditionUndefined.get(i);
			if(!parent.symbolDeclaration(symbol).isEmpty())
			{
				inCompileVariable.add(symbol);
			}
		}
				
		List<String> statementUndefined = this.statementListener.getUndefinedId();
		if(this.elseListener != null)
			statementUndefined.addAll(this.elseListener.getUndefinedId());
		
		List<String> inTemplate = new LinkedList<String>();
		for(int i = 0; i < statementUndefined.size(); i++)
		{
			String symbol = statementUndefined.get(i);

			if(!conditionUndefined.contains(symbol) && !parent.symbolDeclaration(symbol).isEmpty())
			{
				inTemplate.add(symbol);
				if(!parent.symbolDefined(symbol))
					parent.addUndefined(symbol);
			}
		}
		
		List<String> usingList = this.parent.usingList();
		List<String> constexprList = this.parent.constexprList();
		List<String> templateList = this.parent.templateList();
		
		StringBuilder completeTemplate = new StringBuilder();
		generateCompleteTemplate(completeTemplate, templateList, inTemplate);
		
		StringBuilder argument = new StringBuilder();
		generateArgument(argument, inTemplate);
		
		StringBuilder using = new StringBuilder();
		concatenateList(using, usingList);
		
		StringBuilder constexpr = new StringBuilder();
		concatenateList(constexpr, constexprList);
		
		List<String> templateListDependency = this.parent.templateListPopped();
		generateCompleteTemplate(ngcCode, templateListDependency, new LinkedList<>());
		
		ngcCode.append( " template <bool __ngc_" + this.index + "_dummy__> struct " + this.parent.functionQualified() + " __ngc_container__ <" + this.index + ", __ngc_" + this.index + "_dummy__> { ");
		
		ngcCode.append( " struct __ngc_conditional_true__ { template <unsigned long, bool> struct __ngc_container__; " );
		this.statementListener.ngcCode(ngcCode);
		ngcCode.append(completeTemplate);
		ngcCode.append( " static inline void execute( " );
		ngcCode.append(argument);
		ngcCode.append( " ) { " );
		ngcCode.append(using);
		ngcCode.append(constexpr);
		this.statementListener.cppCode(ngcCode);
		ngcCode.append( " } };" + System.lineSeparator() );
				
		ngcCode.append( " struct __ngc_conditional_false__ { template <unsigned long, bool> struct __ngc_container__; " );
		if(this.elseListener != null)
			this.elseListener.ngcCode(ngcCode);
		ngcCode.append(completeTemplate);
		ngcCode.append( " static inline void execute( " );
		ngcCode.append(argument);
		ngcCode.append( " ) { " );
		if(this.elseListener != null)
		{
			ngcCode.append(using);
			ngcCode.append(constexpr);
			this.elseListener.cppCode(ngcCode);
		}
		ngcCode.append( " } };" + System.lineSeparator() );
		
		ngcCode.append( " }; " );
		
		cppCode.append( " std :: conditional <" );
		this.conditionListener.cppCode(cppCode);
		if(usingList.isEmpty())
			cppCode.append( " , typename __ngc_container__ <" + this.index + ", false> :: __ngc_conditional_true__, typename __ngc_container__ <" + this.index + ", false> :: __ngc_conditional_false__> :: type :: " );
		else
			cppCode.append( " , typename :: __ngc_container__ <" + this.index + ", false> :: __ngc_conditional_true__, typename :: __ngc_container__ <" + this.index + ", false> :: __ngc_conditional_false__> :: type :: " );
		
		if(templateList.isEmpty())
			cppCode.append( " execute " );
		else
		{
			cppCode.append( " template execute <" );
			generateParameterTemplate(cppCode, this.parent.templateListSym());
			cppCode.append( " > " );
		}
		cppCode.append( " ( " );
		generateParameter(cppCode, inTemplate);
		cppCode.append( " ); " );
		
	}
	
	private void concatenateList(StringBuilder code, List<String> list) 
	{		
		for(String symbol : list)
		{
			code.append( symbol );
			code.append( " " );
		}
	}

	private void generateMemberTemplate(StringBuilder code, List<String> list) 
	{
		for(int i = 0; i < list.size(); i++)
		{
			code.append( "typename __ngc_type__" + i + "__" );
			if(i != list.size() - 1)
				code.append( ", " );
		}
	}
	
	private void generateParameterTemplate(StringBuilder code, List<String> list) 
	{
		for(int i = 0; i < list.size(); i++)
		{
			code.append( list.get(i) );
			if(i != list.size() - 1)
				code.append( ", " );
		}
	}
	
	private void generateCompleteTemplate(StringBuilder code, List<String> parameterList, List<String> memberList) 
	{
		if(memberList.size() == 0 && parameterList.size() == 0)
			return;
			
		code.append( "template <" );
		
		generateParameterTemplate(code, parameterList);
			
		if(memberList.size() != 0)
		{
			if(parameterList.size() != 0)
				code.append( ", " );
			generateMemberTemplate(code, memberList);
		}
		code.append( "> " );
	}
	
	private void generateArgument(StringBuilder code, List<String> list) 
	{
		for(int i = 0; i < list.size(); i++)
		{
			code.append( "__ngc_type__" + i + "__" + " & " + list.get(i) );
			if(i != list.size() - 1)
				code.append( ", " );
		}
	}
	
	private void generateParameter(StringBuilder code, List<String> list) 
	{
		for(int i = 0; i < list.size(); i++)
		{
			code.append( list.get(i) );
			if(i != list.size() - 1)
				code.append( ", " );
		}
	}
	
}
