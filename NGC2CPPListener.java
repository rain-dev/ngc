// Generated from NGC.g4 by ANTLR 4.5.3

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class NGC2CPPListener implements NGCListener 
{	
	private NGC2CPPListener parent;
	
	private NGC2CPPWalker walker;
	
	private Stack<List<String>> usingStack;
	private Stack<List<String>> constexprStack;
	
	Map<String, Integer> forwardInjectionPoints;
	
	private int templateDeclarationCounter;
	private int templateOffset;
	
	private boolean inTemplateParameter;
	private Queue<String> templateParameterQueue;
	private Queue<String> templateParameterQueuePopped;
	private Queue<String> templateParameterQueueSym;
	private boolean templateParameterQueueSymAdded;
	
	private Stack<String> namespaceDefinition;
	
	private String defaultAccessSpecifier;
	private String lastAccessSpecifier;
	
	private String className;
	private int memberSpecification;
	
	private boolean inMemberDeclaration;
	private boolean isFunction;
	private String memberName;
	private int memberOffset;

	private boolean inFunctionDefinition;
	private String functionQualifiedName;
	private int functionOffset;
	
	private boolean inQualifiedId;
	
	private StringBuilder commonNgcCode;
	private StringBuilder ngcCode;
	private StringBuilder cppCode;
	
	private Stack<Map<String, String>> declarationsStack;
	private Stack<Map<String, List<String>>> dependencyDeclarationsStack;
	
	private List<String> undefinedId;
	
	private String declaration;
	
	private boolean inSimpleDeclaration;
	private boolean inParameterAndQualifiers;
	private boolean inInitializer;
	
	public NGC2CPPListener(NGC2CPPWalker walker, NGC2CPPListener parent)
	{	
		super();
		
		this.parent = parent;
		
		this.walker = walker;
		
		List<String> globalUsing = new LinkedList<String>();
		this.usingStack = new Stack<List<String>>();
		this.usingStack.push(globalUsing);
		
		List<String> globalConstexpr = new LinkedList<String>();
		this.constexprStack = new Stack<List<String>>();
		this.constexprStack.push(globalConstexpr);
		
		this.forwardInjectionPoints = new HashMap<String, Integer>();
		
		this.templateDeclarationCounter = 0;
		this.templateOffset = -1;
		
		this.inTemplateParameter = false;
		this.templateParameterQueue = new LinkedList<String>();
		this.templateParameterQueuePopped = new LinkedList<String>();
		this.templateParameterQueueSym = new LinkedList<String>();
		this.templateParameterQueueSymAdded = false;
		
		this.namespaceDefinition = new Stack<String>();
		
		this.defaultAccessSpecifier = "";
		this.lastAccessSpecifier = "";
		
		this.className = "";
		this.memberSpecification = 0;
		
		this.inMemberDeclaration = false;
		this.isFunction = false;
		this.memberName = "";
		this.memberOffset = -1;
		
		this.inFunctionDefinition = false;
		this.functionQualifiedName = "";
		this.functionOffset = 0;
		
		this.inQualifiedId = false;
		
		/***/
		
		this.commonNgcCode = new StringBuilder();
		this.ngcCode = new StringBuilder();
		this.cppCode = new StringBuilder();
		
		Map<String, String> globalDeclarations = new HashMap<String, String>();
		this.declarationsStack = new Stack<Map<String, String>>();
		this.declarationsStack.push(globalDeclarations);
		Map<String, List<String>> globalDependencyDeclarations = new HashMap<String, List<String>>();
		this.dependencyDeclarationsStack = new Stack<Map<String, List<String>>>();
		this.dependencyDeclarationsStack.push(globalDependencyDeclarations);
		
		this.undefinedId = new LinkedList<String>();
		
		this.declaration = "";
		
		this.inSimpleDeclaration = false;
		this.inParameterAndQualifiers = false;
		this.inInitializer = false;

		if(this.parent == null)
		{
			this.commonNgcCode.append(NGC2CPPFactory.INCLUDE);
			this.ngcCode.append(NGC2CPPFactory.FORWARD);
		}
		else
		{
			this.templateParameterQueue = new LinkedList<String>(this.parent.templateParameterQueue);
			this.templateParameterQueueSym = new LinkedList<String>(this.parent.templateParameterQueueSym);
		}
		/***/
	}
	
	public void commonNgcCode(StringBuilder commonNgcCode)
	{
		commonNgcCode.append(this.commonNgcCode);
	}
	public void commonNgcCode(StringBuilder commonNgcCode, int offset)
	{
		commonNgcCode.insert(offset, this.commonNgcCode);
	}
	
	public void ngcCode(StringBuilder ngcCode)
	{
		ngcCode.append(this.ngcCode);
	}
	public void ngcCode(StringBuilder ngcCode, int offset)
	{
		ngcCode.insert(offset, this.ngcCode);
	}
	
	public void cppCode(StringBuilder cppCode)
	{
		cppCode.append(this.cppCode);
	}
	public void cppCode(StringBuilder cppCode, int offset)
	{
		cppCode.insert(offset, this.cppCode);
	}
	
	public void save(String filename) throws FileNotFoundException, UnsupportedEncodingException
	{
		PrintWriter writer = new PrintWriter(filename, "UTF-8");
		writer.println(commonNgcCode.toString() + System.lineSeparator());
		writer.println(ngcCode.toString() + System.lineSeparator());
		writer.println(cppCode.toString() + System.lineSeparator());
		writer.close();
	}
	
	public List<String> usingList()
	{
		List<String> res = new LinkedList<String>();
		
		if(this.parent != null)
			res.addAll(parent.usingList());
		
		for(int i = 0; i < this.usingStack.size(); i++)
			res.addAll(this.usingStack.get(i));
		
		return res;
	}
	
	public List<String> constexprList()
	{
		List<String> res = new LinkedList<String>();
		
		if(this.parent != null)
			res.addAll(parent.constexprList());
		
		for(int i = 0; i < this.constexprStack.size(); i++)
			res.addAll(this.constexprStack.get(i));
		
		return res;
	}
	
	@SuppressWarnings("unchecked")
	public List<String> templateList()
	{	
		return (List<String>) this.templateParameterQueue;
	}
	
	@SuppressWarnings("unchecked")
	public List<String> templateListPopped()
	{	
		return (List<String>) this.templateParameterQueuePopped;
	}
	
	@SuppressWarnings("unchecked")
	public List<String> templateListSym()
	{	
		return (List<String>) this.templateParameterQueueSym;
	}
	
	public String functionQualified()
	{	
		return this.functionQualifiedName;
	}
	
	public boolean symbolDefined(String symbol)
	{
		for(int i = this.declarationsStack.size() - 1; i >= 0; i--)
		{
			Map<String, String> symbols = this.declarationsStack.get(i);
			Object type = symbols.get(symbol);
			if(type != null)
			{
				return true;
			}
		}
		return false;
	}
	
	public String symbolDeclaration(String symbol)
	{
		String res = "";
		
		for(int i = this.declarationsStack.size() - 1; i >= 0; i--)
		{
			Map<String, String> symbols = this.declarationsStack.get(i);
			
			Object type = symbols.get(symbol);
			if(type != null)
			{
				res += (String) type;
				break;
			}
		}
		
		if(this.parent != null)
			return this.parent.symbolDeclaration(symbol);
		
		return res;
	}
	
	@SuppressWarnings("unchecked")
	public List<String> getDependencyList(String symbol) 
	{
		List<String> res = null;
		
		for(int i = this.dependencyDeclarationsStack.size() - 1; i >= 0; i--)
		{
			Map<String, List<String>> symbols = this.dependencyDeclarationsStack.get(i);
			Object type = symbols.get(symbol);
			if(type != null)
			{
				return (List<String>) type;
			}
		}
		
		if(this.parent != null)
			return this.parent.getDependencyList(symbol);
		
		return res; 
	}
	
	public List<String> getUndefinedId() 
	{
		return this.undefinedId;
	}
	
	public void addUndefined(String symbol)
	{
		if(!this.undefinedId.contains(symbol))
			this.undefinedId.add(symbol);
	}

	public String formatText(ParseTree ctx) 
	{
		String res = "";
		int n = ctx.getChildCount();
		if(n == 0)
			return ctx.getText() + " ";
		for(int i = 0; i < n; i++)
			res += formatText(ctx.getChild(i));
		return res;
	}
	
	public String formatText(ParseTree ctx, int start, int end) 
	{
		String res = "";
		int n = ctx.getChildCount();
		if(n == 0)
			return ctx.getText() + " ";
		for(int i = start; i < end; i++)
			res += formatText(ctx.getChild(i));
		return res;
	}

	public String formatNamespace() 
	{
		String res = "";
		for(int i = 0; i < this.namespaceDefinition.size(); i++)
		{
			res += this.namespaceDefinition.get(i) + " :: ";
		}
		return res;
	}
	
	public void updateOffset(int offset)
	{
		for(String key : this.forwardInjectionPoints.keySet())
		{
			int currentOffset = this.forwardInjectionPoints.get(key);
			if(currentOffset >= offset)
				this.forwardInjectionPoints.put(key, currentOffset + offset);
		}
	}
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTranslationunit(NGCParser.TranslationunitContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTranslationunit(NGCParser.TranslationunitContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPrimaryexpression(NGCParser.PrimaryexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPrimaryexpression(NGCParser.PrimaryexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIdexpression(NGCParser.IdexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIdexpression(NGCParser.IdexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUnqualifiedid(NGCParser.UnqualifiedidContext ctx) 
	{
		//TODO
		if(this.inMemberDeclaration)
		{
			this.memberName = this.formatNamespace();
			if(!this.className.isEmpty())
				this.memberName += this.className + "::";
			this.memberName += ctx.getText();
		}
		
		if(!this.inQualifiedId)
		{
			String symbol = ctx.getText();
			
			if(this.inParameterAndQualifiers)
			{
				if(!this.declarationsStack.peek().containsKey(symbol))
					this.declarationsStack.peek().put(symbol, "ARG");
			}
			else if(this.inSimpleDeclaration)
			{
				if(!this.inInitializer && this.declaration.contains("constexpr"))
					this.constexprStack.peek().add(this.declaration);
				else if(!this.declarationsStack.peek().containsKey(symbol) && !this.inInitializer)
					this.declarationsStack.peek().put(symbol, this.declaration);
				else if(this.inInitializer)
				{
					if(this.dependencyDeclarationsStack.peek().containsKey(this.declaration))
						this.dependencyDeclarationsStack.peek().get(this.declaration).add(symbol);
					else
					{
						List<String> symbolList = new LinkedList<String>();
						symbolList.add(symbol);
						this.dependencyDeclarationsStack.peek().put(this.declaration, symbolList);
					}
				}
			}
			else if(!symbolDefined(symbol))
				this.undefinedId.add(symbol);
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUnqualifiedid(NGCParser.UnqualifiedidContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterQualifiedid(NGCParser.QualifiedidContext ctx) 
	{
		//TODO
		this.inQualifiedId = true;
		
		if(this.inFunctionDefinition)
			this.functionQualifiedName += ctx.getChild(0).getText();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitQualifiedid(NGCParser.QualifiedidContext ctx) 
	{
		//TODO
		this.inQualifiedId = false;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNestednamespecifier(NGCParser.NestednamespecifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNestednamespecifier(NGCParser.NestednamespecifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLambdaexpression(NGCParser.LambdaexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLambdaexpression(NGCParser.LambdaexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLambdaintroducer(NGCParser.LambdaintroducerContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLambdaintroducer(NGCParser.LambdaintroducerContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLambdacapture(NGCParser.LambdacaptureContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLambdacapture(NGCParser.LambdacaptureContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCapturedefault(NGCParser.CapturedefaultContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCapturedefault(NGCParser.CapturedefaultContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCapturelist(NGCParser.CapturelistContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCapturelist(NGCParser.CapturelistContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCapture(NGCParser.CaptureContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCapture(NGCParser.CaptureContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSimplecapture(NGCParser.SimplecaptureContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSimplecapture(NGCParser.SimplecaptureContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInitcapture(NGCParser.InitcaptureContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInitcapture(NGCParser.InitcaptureContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLambdadeclarator(NGCParser.LambdadeclaratorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLambdadeclarator(NGCParser.LambdadeclaratorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPostfixexpression(NGCParser.PostfixexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPostfixexpression(NGCParser.PostfixexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExpressionlist(NGCParser.ExpressionlistContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExpressionlist(NGCParser.ExpressionlistContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPseudodestructorname(NGCParser.PseudodestructornameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPseudodestructorname(NGCParser.PseudodestructornameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUnaryexpression(NGCParser.UnaryexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUnaryexpression(NGCParser.UnaryexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUnaryoperator(NGCParser.UnaryoperatorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUnaryoperator(NGCParser.UnaryoperatorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNewexpression(NGCParser.NewexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNewexpression(NGCParser.NewexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNewplacement(NGCParser.NewplacementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNewplacement(NGCParser.NewplacementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNewtypeid(NGCParser.NewtypeidContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNewtypeid(NGCParser.NewtypeidContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNewdeclarator(NGCParser.NewdeclaratorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNewdeclarator(NGCParser.NewdeclaratorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNoptrnewdeclarator(NGCParser.NoptrnewdeclaratorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNoptrnewdeclarator(NGCParser.NoptrnewdeclaratorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNewinitializer(NGCParser.NewinitializerContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNewinitializer(NGCParser.NewinitializerContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDeleteexpression(NGCParser.DeleteexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDeleteexpression(NGCParser.DeleteexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNoexceptexpression(NGCParser.NoexceptexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNoexceptexpression(NGCParser.NoexceptexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCastexpression(NGCParser.CastexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCastexpression(NGCParser.CastexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPmexpression(NGCParser.PmexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPmexpression(NGCParser.PmexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMultiplicativeexpression(NGCParser.MultiplicativeexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMultiplicativeexpression(NGCParser.MultiplicativeexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAdditiveexpression(NGCParser.AdditiveexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAdditiveexpression(NGCParser.AdditiveexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterShiftexpression(NGCParser.ShiftexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitShiftexpression(NGCParser.ShiftexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRelationalexpression(NGCParser.RelationalexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRelationalexpression(NGCParser.RelationalexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEqualityexpression(NGCParser.EqualityexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEqualityexpression(NGCParser.EqualityexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAndexpression(NGCParser.AndexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAndexpression(NGCParser.AndexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExclusiveorexpression(NGCParser.ExclusiveorexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExclusiveorexpression(NGCParser.ExclusiveorexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInclusiveorexpression(NGCParser.InclusiveorexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInclusiveorexpression(NGCParser.InclusiveorexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLogicalandexpression(NGCParser.LogicalandexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLogicalandexpression(NGCParser.LogicalandexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLogicalorexpression(NGCParser.LogicalorexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLogicalorexpression(NGCParser.LogicalorexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterConditionalexpression(NGCParser.ConditionalexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitConditionalexpression(NGCParser.ConditionalexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAssignmentexpression(NGCParser.AssignmentexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAssignmentexpression(NGCParser.AssignmentexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAssignmentoperator(NGCParser.AssignmentoperatorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAssignmentoperator(NGCParser.AssignmentoperatorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExpression(NGCParser.ExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExpression(NGCParser.ExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterConstantexpression(NGCParser.ConstantexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitConstantexpression(NGCParser.ConstantexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStatement(NGCParser.StatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStatement(NGCParser.StatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLabeledstatement(NGCParser.LabeledstatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLabeledstatement(NGCParser.LabeledstatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExpressionstatement(NGCParser.ExpressionstatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExpressionstatement(NGCParser.ExpressionstatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCompoundstatement(NGCParser.CompoundstatementContext ctx) 
	{
		//TODO
		List<String> localUsing = new LinkedList<String>();
		this.usingStack.push(localUsing);
		List<String> localConstexpr = new LinkedList<String>();
		this.constexprStack.push(localConstexpr);
		
		Map<String, String> blockDeclaration = new HashMap<String, String>();
		this.declarationsStack.push(blockDeclaration);
		Map<String, List<String>> dependencyBlockDeclaration = new HashMap<String, List<String>>();
		this.dependencyDeclarationsStack.push(dependencyBlockDeclaration);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCompoundstatement(NGCParser.CompoundstatementContext ctx) 
	{
		//TODO
		this.usingStack.pop();
		this.constexprStack.pop();
		
		this.declarationsStack.pop();
		this.dependencyDeclarationsStack.pop();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStatementseq(NGCParser.StatementseqContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStatementseq(NGCParser.StatementseqContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSelectionstatement(NGCParser.SelectionstatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSelectionstatement(NGCParser.SelectionstatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCondition(NGCParser.ConditionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCondition(NGCParser.ConditionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIterationstatement(NGCParser.IterationstatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIterationstatement(NGCParser.IterationstatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterForinitstatement(NGCParser.ForinitstatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitForinitstatement(NGCParser.ForinitstatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterForrangedeclaration(NGCParser.ForrangedeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitForrangedeclaration(NGCParser.ForrangedeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterForrangeinitializer(NGCParser.ForrangeinitializerContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitForrangeinitializer(NGCParser.ForrangeinitializerContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterJumpstatement(NGCParser.JumpstatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitJumpstatement(NGCParser.JumpstatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDeclarationstatement(NGCParser.DeclarationstatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDeclarationstatement(NGCParser.DeclarationstatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDeclarationseq(NGCParser.DeclarationseqContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDeclarationseq(NGCParser.DeclarationseqContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDeclaration(NGCParser.DeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDeclaration(NGCParser.DeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBlockdeclaration(NGCParser.BlockdeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBlockdeclaration(NGCParser.BlockdeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAliasdeclaration(NGCParser.AliasdeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAliasdeclaration(NGCParser.AliasdeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSimpledeclaration(NGCParser.SimpledeclarationContext ctx) 
	{
		this.declaration = formatText(ctx);
		this.inSimpleDeclaration = true;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSimpledeclaration(NGCParser.SimpledeclarationContext ctx) 
	{
		this.declaration = "";
		this.inSimpleDeclaration = false;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStatic_assertdeclaration(NGCParser.Static_assertdeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStatic_assertdeclaration(NGCParser.Static_assertdeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEmptydeclaration(NGCParser.EmptydeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEmptydeclaration(NGCParser.EmptydeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAttributedeclaration(NGCParser.AttributedeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAttributedeclaration(NGCParser.AttributedeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDeclspecifier(NGCParser.DeclspecifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDeclspecifier(NGCParser.DeclspecifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDeclspecifierseq(NGCParser.DeclspecifierseqContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDeclspecifierseq(NGCParser.DeclspecifierseqContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStorageclassspecifier(NGCParser.StorageclassspecifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStorageclassspecifier(NGCParser.StorageclassspecifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFunctionspecifier(NGCParser.FunctionspecifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunctionspecifier(NGCParser.FunctionspecifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTypedefname(NGCParser.TypedefnameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTypedefname(NGCParser.TypedefnameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTypespecifier(NGCParser.TypespecifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTypespecifier(NGCParser.TypespecifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTrailingtypespecifier(NGCParser.TrailingtypespecifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTrailingtypespecifier(NGCParser.TrailingtypespecifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTypespecifierseq(NGCParser.TypespecifierseqContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTypespecifierseq(NGCParser.TypespecifierseqContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTrailingtypespecifierseq(NGCParser.TrailingtypespecifierseqContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTrailingtypespecifierseq(NGCParser.TrailingtypespecifierseqContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSimpletypespecifier(NGCParser.SimpletypespecifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSimpletypespecifier(NGCParser.SimpletypespecifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTypename(NGCParser.TypenameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTypename(NGCParser.TypenameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDecltypespecifier(NGCParser.DecltypespecifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDecltypespecifier(NGCParser.DecltypespecifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterElaboratedtypespecifier(NGCParser.ElaboratedtypespecifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitElaboratedtypespecifier(NGCParser.ElaboratedtypespecifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEnumname(NGCParser.EnumnameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEnumname(NGCParser.EnumnameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEnumspecifier(NGCParser.EnumspecifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEnumspecifier(NGCParser.EnumspecifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEnumhead(NGCParser.EnumheadContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEnumhead(NGCParser.EnumheadContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterOpaqueenumdeclaration(NGCParser.OpaqueenumdeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOpaqueenumdeclaration(NGCParser.OpaqueenumdeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEnumkey(NGCParser.EnumkeyContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEnumkey(NGCParser.EnumkeyContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEnumbase(NGCParser.EnumbaseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEnumbase(NGCParser.EnumbaseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEnumeratorlist(NGCParser.EnumeratorlistContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEnumeratorlist(NGCParser.EnumeratorlistContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEnumeratordefinition(NGCParser.EnumeratordefinitionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEnumeratordefinition(NGCParser.EnumeratordefinitionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEnumerator(NGCParser.EnumeratorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEnumerator(NGCParser.EnumeratorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNamespacename(NGCParser.NamespacenameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNamespacename(NGCParser.NamespacenameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterOriginalnamespacename(NGCParser.OriginalnamespacenameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOriginalnamespacename(NGCParser.OriginalnamespacenameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNamespacedefinition(NGCParser.NamespacedefinitionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNamespacedefinition(NGCParser.NamespacedefinitionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNamednamespacedefinition(NGCParser.NamednamespacedefinitionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNamednamespacedefinition(NGCParser.NamednamespacedefinitionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterOriginalnamespacedefinition(NGCParser.OriginalnamespacedefinitionContext ctx) 
	{
		this.namespaceDefinition.push(ctx.getChild(ctx.getChildCount() - 4).getText());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOriginalnamespacedefinition(NGCParser.OriginalnamespacedefinitionContext ctx) 
	{
		this.namespaceDefinition.pop();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExtensionnamespacedefinition(NGCParser.ExtensionnamespacedefinitionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExtensionnamespacedefinition(NGCParser.ExtensionnamespacedefinitionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUnnamednamespacedefinition(NGCParser.UnnamednamespacedefinitionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUnnamednamespacedefinition(NGCParser.UnnamednamespacedefinitionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNamespacebody(NGCParser.NamespacebodyContext ctx) 
	{
		//TODO
		this.cppCode.append(NGC2CPPFactory.FORWARD);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNamespacebody(NGCParser.NamespacebodyContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNamespacealias(NGCParser.NamespacealiasContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNamespacealias(NGCParser.NamespacealiasContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNamespacealiasdefinition(NGCParser.NamespacealiasdefinitionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNamespacealiasdefinition(NGCParser.NamespacealiasdefinitionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterQualifiednamespacespecifier(NGCParser.QualifiednamespacespecifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitQualifiednamespacespecifier(NGCParser.QualifiednamespacespecifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUsingdeclaration(NGCParser.UsingdeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUsingdeclaration(NGCParser.UsingdeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUsingdirective(NGCParser.UsingdirectiveContext ctx) 
	{
		this.usingStack.peek().add(formatText(ctx));
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUsingdirective(NGCParser.UsingdirectiveContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAsmdefinition(NGCParser.AsmdefinitionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAsmdefinition(NGCParser.AsmdefinitionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLinkagespecification(NGCParser.LinkagespecificationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLinkagespecification(NGCParser.LinkagespecificationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAttributespecifierseq(NGCParser.AttributespecifierseqContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAttributespecifierseq(NGCParser.AttributespecifierseqContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAttributespecifier(NGCParser.AttributespecifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAttributespecifier(NGCParser.AttributespecifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAlignmentspecifier(NGCParser.AlignmentspecifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAlignmentspecifier(NGCParser.AlignmentspecifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAttributelist(NGCParser.AttributelistContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAttributelist(NGCParser.AttributelistContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAttribute(NGCParser.AttributeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAttribute(NGCParser.AttributeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAttributetoken(NGCParser.AttributetokenContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAttributetoken(NGCParser.AttributetokenContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAttributescopedtoken(NGCParser.AttributescopedtokenContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAttributescopedtoken(NGCParser.AttributescopedtokenContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAttributenamespace(NGCParser.AttributenamespaceContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAttributenamespace(NGCParser.AttributenamespaceContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAttributeargumentclause(NGCParser.AttributeargumentclauseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAttributeargumentclause(NGCParser.AttributeargumentclauseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBalancedtokenseq(NGCParser.BalancedtokenseqContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBalancedtokenseq(NGCParser.BalancedtokenseqContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBalancedtoken(NGCParser.BalancedtokenContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBalancedtoken(NGCParser.BalancedtokenContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInitdeclaratorlist(NGCParser.InitdeclaratorlistContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInitdeclaratorlist(NGCParser.InitdeclaratorlistContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInitdeclarator(NGCParser.InitdeclaratorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInitdeclarator(NGCParser.InitdeclaratorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDeclarator(NGCParser.DeclaratorContext ctx) 
	{
		//TODO
		if(this.inTemplateParameter)
		{
			this.templateParameterQueueSymAdded = true;
			this.templateParameterQueueSym.add(this.formatText(ctx));
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDeclarator(NGCParser.DeclaratorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPtrdeclarator(NGCParser.PtrdeclaratorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPtrdeclarator(NGCParser.PtrdeclaratorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNoptrdeclarator(NGCParser.NoptrdeclaratorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNoptrdeclarator(NGCParser.NoptrdeclaratorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterParametersandqualifiers(NGCParser.ParametersandqualifiersContext ctx) 
	{
		//TODO
		this.inParameterAndQualifiers = true;
		this.isFunction = true;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitParametersandqualifiers(NGCParser.ParametersandqualifiersContext ctx) 
	{
		this.inParameterAndQualifiers = false;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTrailingreturntype(NGCParser.TrailingreturntypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTrailingreturntype(NGCParser.TrailingreturntypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPtroperator(NGCParser.PtroperatorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPtroperator(NGCParser.PtroperatorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCvqualifierseq(NGCParser.CvqualifierseqContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCvqualifierseq(NGCParser.CvqualifierseqContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCvqualifier(NGCParser.CvqualifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCvqualifier(NGCParser.CvqualifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRefqualifier(NGCParser.RefqualifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRefqualifier(NGCParser.RefqualifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDeclaratorid(NGCParser.DeclaratoridContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDeclaratorid(NGCParser.DeclaratoridContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTypeid(NGCParser.TypeidContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTypeid(NGCParser.TypeidContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAbstractdeclarator(NGCParser.AbstractdeclaratorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAbstractdeclarator(NGCParser.AbstractdeclaratorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPtrabstractdeclarator(NGCParser.PtrabstractdeclaratorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPtrabstractdeclarator(NGCParser.PtrabstractdeclaratorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNoptrabstractdeclarator(NGCParser.NoptrabstractdeclaratorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNoptrabstractdeclarator(NGCParser.NoptrabstractdeclaratorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAbstractpackdeclarator(NGCParser.AbstractpackdeclaratorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAbstractpackdeclarator(NGCParser.AbstractpackdeclaratorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNoptrabstractpackdeclarator(NGCParser.NoptrabstractpackdeclaratorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNoptrabstractpackdeclarator(NGCParser.NoptrabstractpackdeclaratorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterParameterdeclarationclause(NGCParser.ParameterdeclarationclauseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitParameterdeclarationclause(NGCParser.ParameterdeclarationclauseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterParameterdeclarationlist(NGCParser.ParameterdeclarationlistContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitParameterdeclarationlist(NGCParser.ParameterdeclarationlistContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterParameterdeclaration(NGCParser.ParameterdeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitParameterdeclaration(NGCParser.ParameterdeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFunctiondefinition(NGCParser.FunctiondefinitionContext ctx) 
	{
		//TODO
		this.inFunctionDefinition = true;
		this.functionOffset = this.cppCode.length();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunctiondefinition(NGCParser.FunctiondefinitionContext ctx) 
	{
		//TODO
		this.inFunctionDefinition = false;
		this.functionOffset = 0;
		this.templateParameterQueue.clear();
		this.templateParameterQueuePopped.clear();
		this.templateParameterQueueSym.clear();
		this.functionQualifiedName = "";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFunctionbody(NGCParser.FunctionbodyContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunctionbody(NGCParser.FunctionbodyContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInitializer(NGCParser.InitializerContext ctx) 
	{
		this.inInitializer = true;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInitializer(NGCParser.InitializerContext ctx) 
	{
		this.inInitializer = false;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBraceorequalinitializer(NGCParser.BraceorequalinitializerContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBraceorequalinitializer(NGCParser.BraceorequalinitializerContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInitializerclause(NGCParser.InitializerclauseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInitializerclause(NGCParser.InitializerclauseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterInitializerlist(NGCParser.InitializerlistContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInitializerlist(NGCParser.InitializerlistContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBracedinitlist(NGCParser.BracedinitlistContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBracedinitlist(NGCParser.BracedinitlistContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterClassname(NGCParser.ClassnameContext ctx) 
	{
		//TODO
		this.className = ctx.getText();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitClassname(NGCParser.ClassnameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterClassspecifier(NGCParser.ClassspecifierContext ctx) 
	{
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitClassspecifier(NGCParser.ClassspecifierContext ctx) 
	{
		this.className = "";
		
		this.defaultAccessSpecifier = "";
		this.lastAccessSpecifier = "";
		
		this.templateParameterQueue.clear();
		this.templateParameterQueueSym.clear();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterClasshead(NGCParser.ClassheadContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitClasshead(NGCParser.ClassheadContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterClassheadname(NGCParser.ClassheadnameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitClassheadname(NGCParser.ClassheadnameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterClassvirtspecifier(NGCParser.ClassvirtspecifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitClassvirtspecifier(NGCParser.ClassvirtspecifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterClasskey(NGCParser.ClasskeyContext ctx)
	{
		//TODO
		String classKey = ctx.getText(); 
		if(classKey.equals("class"))
			this.defaultAccessSpecifier = "private: ";
		else if(classKey.equals("class"))
			this.defaultAccessSpecifier = "public: ";
		else if(classKey.equals("union"))
			this.defaultAccessSpecifier = "public: ";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitClasskey(NGCParser.ClasskeyContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMemberspecification(NGCParser.MemberspecificationContext ctx) 
	{
		//TODO - code
		if(this.memberSpecification == 0)
		{
			this.cppCode.append("public: " + NGC2CPPFactory.FORWARD);
			this.cppCode.append(this.defaultAccessSpecifier);
		}
		this.memberSpecification++;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMemberspecification(NGCParser.MemberspecificationContext ctx) 
	{
		//TODO
		this.memberSpecification--;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMemberdeclaration(NGCParser.MemberdeclarationContext ctx) 
	{
		//TODO - code
		this.inMemberDeclaration = true;
		this.memberOffset = this.cppCode.length();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMemberdeclaration(NGCParser.MemberdeclarationContext ctx) 
	{
		//TODO
		this.inMemberDeclaration = false;
		if(this.isFunction)
		{
			this.forwardInjectionPoints.put(this.memberName, this.memberOffset);
			this.isFunction = false;
		}
		this.memberOffset = -1;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMemberdeclaratorlist(NGCParser.MemberdeclaratorlistContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMemberdeclaratorlist(NGCParser.MemberdeclaratorlistContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMemberdeclarator(NGCParser.MemberdeclaratorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMemberdeclarator(NGCParser.MemberdeclaratorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVirtspecifierseq(NGCParser.VirtspecifierseqContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVirtspecifierseq(NGCParser.VirtspecifierseqContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVirtspecifier(NGCParser.VirtspecifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVirtspecifier(NGCParser.VirtspecifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPurespecifier(NGCParser.PurespecifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPurespecifier(NGCParser.PurespecifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBaseclause(NGCParser.BaseclauseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBaseclause(NGCParser.BaseclauseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBasespecifierlist(NGCParser.BasespecifierlistContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBasespecifierlist(NGCParser.BasespecifierlistContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBasespecifier(NGCParser.BasespecifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBasespecifier(NGCParser.BasespecifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterClassordecltype(NGCParser.ClassordecltypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitClassordecltype(NGCParser.ClassordecltypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBasetypespecifier(NGCParser.BasetypespecifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBasetypespecifier(NGCParser.BasetypespecifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAccessspecifier(NGCParser.AccessspecifierContext ctx) 
	{
		this.lastAccessSpecifier = ctx.getText() + ": ";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAccessspecifier(NGCParser.AccessspecifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterConversionfunctionid(NGCParser.ConversionfunctionidContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitConversionfunctionid(NGCParser.ConversionfunctionidContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterConversiontypeid(NGCParser.ConversiontypeidContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitConversiontypeid(NGCParser.ConversiontypeidContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterConversiondeclarator(NGCParser.ConversiondeclaratorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitConversiondeclarator(NGCParser.ConversiondeclaratorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCtorinitializer(NGCParser.CtorinitializerContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCtorinitializer(NGCParser.CtorinitializerContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMeminitializerlist(NGCParser.MeminitializerlistContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMeminitializerlist(NGCParser.MeminitializerlistContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMeminitializer(NGCParser.MeminitializerContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMeminitializer(NGCParser.MeminitializerContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMeminitializerid(NGCParser.MeminitializeridContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMeminitializerid(NGCParser.MeminitializeridContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterOperatorfunctionid(NGCParser.OperatorfunctionidContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOperatorfunctionid(NGCParser.OperatorfunctionidContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLiteraloperatorid(NGCParser.LiteraloperatoridContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLiteraloperatorid(NGCParser.LiteraloperatoridContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTemplatedeclaration(NGCParser.TemplatedeclarationContext ctx) 
	{
		//TODO
		if(this.templateDeclarationCounter == 0)
			this.templateOffset = this.cppCode.length();
		this.templateDeclarationCounter++;
		formatText(ctx, 0, ctx.getChildCount() - 1);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTemplatedeclaration(NGCParser.TemplatedeclarationContext ctx) 
	{
		//TODO
		this.templateDeclarationCounter--;
		if(this.templateDeclarationCounter == 0)
		{
			this.templateOffset = -1;
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTemplateparameterlist(NGCParser.TemplateparameterlistContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTemplateparameterlist(NGCParser.TemplateparameterlistContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTemplateparameter(NGCParser.TemplateparameterContext ctx) 
	{
		//TODO
		this.inTemplateParameter = true;
		if(this.templateDeclarationCounter > 0)
			this.templateParameterQueue.add(this.formatText(ctx));
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTemplateparameter(NGCParser.TemplateparameterContext ctx) 
	{
		this.inTemplateParameter = false;
		if(!this.templateParameterQueueSymAdded)
		{
			this.templateParameterQueueSym.add("__ngc_placeholder__");
		}
		this.templateParameterQueueSymAdded = false;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTypeparameter(NGCParser.TypeparameterContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTypeparameter(NGCParser.TypeparameterContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSimpletemplateid(NGCParser.SimpletemplateidContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSimpletemplateid(NGCParser.SimpletemplateidContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTemplateid(NGCParser.TemplateidContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTemplateid(NGCParser.TemplateidContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTemplatename(NGCParser.TemplatenameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTemplatename(NGCParser.TemplatenameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTemplateargumentlist(NGCParser.TemplateargumentlistContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTemplateargumentlist(NGCParser.TemplateargumentlistContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTemplateargument(NGCParser.TemplateargumentContext ctx) 
	{
		//TODO
		if(this.templateDeclarationCounter > 0)
		{
			String popped = this.templateParameterQueue.poll();
			this.templateParameterQueueSym.poll();
			
			if(this.inFunctionDefinition && this.inQualifiedId)
				this.templateParameterQueuePopped.add(popped);
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTemplateargument(NGCParser.TemplateargumentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTypenamespecifier(NGCParser.TypenamespecifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTypenamespecifier(NGCParser.TypenamespecifierContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExplicitinstantiation(NGCParser.ExplicitinstantiationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExplicitinstantiation(NGCParser.ExplicitinstantiationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExplicitspecialization(NGCParser.ExplicitspecializationContext ctx) 
	{
		//TODO
		this.templateDeclarationCounter++;
		formatText(ctx, 0, ctx.getChildCount() - 1);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExplicitspecialization(NGCParser.ExplicitspecializationContext ctx) 
	{
		//TODO
		this.templateDeclarationCounter--;
		if(this.templateDeclarationCounter == 0) {
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTryblock(NGCParser.TryblockContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTryblock(NGCParser.TryblockContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFunctiontryblock(NGCParser.FunctiontryblockContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunctiontryblock(NGCParser.FunctiontryblockContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterHandlerseq(NGCParser.HandlerseqContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitHandlerseq(NGCParser.HandlerseqContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterHandler(NGCParser.HandlerContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitHandler(NGCParser.HandlerContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExceptiondeclaration(NGCParser.ExceptiondeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExceptiondeclaration(NGCParser.ExceptiondeclarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterThrowexpression(NGCParser.ThrowexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitThrowexpression(NGCParser.ThrowexpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExceptionspecification(NGCParser.ExceptionspecificationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExceptionspecification(NGCParser.ExceptionspecificationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDynamicexceptionspecification(NGCParser.DynamicexceptionspecificationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDynamicexceptionspecification(NGCParser.DynamicexceptionspecificationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTypeidlist(NGCParser.TypeidlistContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTypeidlist(NGCParser.TypeidlistContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNoexceptspecification(NGCParser.NoexceptspecificationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNoexceptspecification(NGCParser.NoexceptspecificationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRightShift(NGCParser.RightShiftContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRightShift(NGCParser.RightShiftContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRightShiftAssign(NGCParser.RightShiftAssignContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRightShiftAssign(NGCParser.RightShiftAssignContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterOperator(NGCParser.OperatorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOperator(NGCParser.OperatorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLiteral(NGCParser.LiteralContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLiteral(NGCParser.LiteralContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBooleanliteral(NGCParser.BooleanliteralContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBooleanliteral(NGCParser.BooleanliteralContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPointerliteral(NGCParser.PointerliteralContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPointerliteral(NGCParser.PointerliteralContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUserdefinedliteral(NGCParser.UserdefinedliteralContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUserdefinedliteral(NGCParser.UserdefinedliteralContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) 
	{
		//TODO
		this.cppCode.append(node.getText()).append(" ");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNgc_selectionstatement(NGCParser.Ngc_selectionstatementContext ctx) 
	{
		//TODO
		this.walker.setInspectChild(false);
		
		NGC2CPPSelectionStatementTranslator translator = new NGC2CPPSelectionStatementTranslator(this);
	    translator.translate(ctx);
	    
	    StringBuilder commonNgcCode = new StringBuilder();
	    StringBuilder ngcCode = new StringBuilder();
	    StringBuilder cppCode = new StringBuilder();
	    translator.result(commonNgcCode, ngcCode, cppCode);
	    
	    this.commonNgcCode.append(commonNgcCode);
	    
	    if(parent == null)
	    {
		    this.cppCode.insert(this.templateOffset < 0 ? this.functionOffset : this.templateOffset, ngcCode + this.lastAccessSpecifier);
		    this.cppCode.append(cppCode);
	    }
	    else
	    {
	    	this.ngcCode.append(ngcCode);
	    	this.cppCode.append(cppCode);
	    }
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNgc_selectionstatement(NGCParser.Ngc_selectionstatementContext ctx) 
	{
		//TODO
		this.walker.setInspectChild(true);
	}
}