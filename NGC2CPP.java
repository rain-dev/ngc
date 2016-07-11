import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DiagnosticErrorListener;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.PredictionMode;

import org.antlr.v4.gui.Trees;

import javax.print.PrintException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/** Run a lexer/parser combo, optionally printing tree string or generating
 *  postscript file. Optionally taking input file.
 *
 *  $ java org.antlr.v4.runtime.misc.TestRig GrammarName startRuleName
 *        [-tree]
 *        [-tokens] [-gui] [-ps file.ps]
 *        [-trace]
 *        [-diagnostics]
 *        [-SLL]
 *        [input-filename(s)]
 */

public class NGC2CPP {

	public static final String LEXER_START_RULE_NAME = "tokens";

	protected String grammarName;
	protected String startRuleName;
	protected final List<String> inputFiles = new ArrayList<String>();
	protected boolean printTree = false;
	protected boolean gui = false;
	protected String psFile = null;
	protected boolean showTokens = false;
	protected boolean trace = false;
	protected boolean diagnostics = false;
	protected String encoding = null;
	protected boolean SLL = false;
	
	private String InputFileName;

	public NGC2CPP(String[] args) throws Exception {
		if ( args.length < 2 ) {
			System.err.println("java ngc2cpp.NGC2CPP GrammarName startRuleName\n" +
							   "  [-tokens] [-tree] [-gui] [-ps file.ps] [-encoding encodingname]\n" +
							   "  [-trace] [-diagnostics] [-SLL]\n"+
							   "  [input-filename(s)]");
			System.err.println("Use startRuleName='tokens' if GrammarName is a lexer grammar.");
			System.err.println("Omitting input-filename makes NGC2CPP read from stdin.");
			return;
		}
		int i=0;
		grammarName = args[i];
		i++;
		startRuleName = args[i];
		i++;
		while ( i<args.length ) {
			String arg = args[i];
			i++;
			if ( arg.charAt(0)!='-' ) { // input file name
				inputFiles.add(arg);
				continue;
			}
			if ( arg.equals("-tree") ) {
				printTree = true;
			}
			if ( arg.equals("-gui") ) {
				gui = true;
			}
			if ( arg.equals("-tokens") ) {
				showTokens = true;
			}
			else if ( arg.equals("-trace") ) {
				trace = true;
			}
			else if ( arg.equals("-SLL") ) {
				SLL = true;
			}
			else if ( arg.equals("-diagnostics") ) {
				diagnostics = true;
			}
			else if ( arg.equals("-encoding") ) {
				if ( i>=args.length ) {
					System.err.println("missing encoding on -encoding");
					return;
				}
				encoding = args[i];
				i++;
			}
			else if ( arg.equals("-ps") ) {
				if ( i>=args.length ) {
					System.err.println("missing filename on -ps");
					return;
				}
				psFile = args[i];
				i++;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		NGC2CPP ngc2cpp = new NGC2CPP(args);
 		if(args.length >= 2) {
 			ngc2cpp.process();
		}
	}

	public void process() throws Exception {
//		System.out.println("exec "+grammarName+"."+startRuleName);
		String lexerName = grammarName+"Lexer";
		ClassLoader cl = Thread.currentThread().getContextClassLoader();
		Class<? extends Lexer> lexerClass = null;
		try {
			lexerClass = cl.loadClass(lexerName).asSubclass(Lexer.class);
		}
		catch (java.lang.ClassNotFoundException cnfe) {
			// might be pure lexer grammar; no Lexer suffix then
			lexerName = grammarName;
			try {
				lexerClass = cl.loadClass(lexerName).asSubclass(Lexer.class);
			}
			catch (ClassNotFoundException cnfe2) {
				System.err.println("Can't load "+lexerName+" as lexer or parser");
				return;
			}
		}

		Constructor<? extends Lexer> lexerCtor = lexerClass.getConstructor(CharStream.class);
		Lexer lexer = lexerCtor.newInstance((CharStream)null);

		Class<? extends Parser> parserClass = null;
		Parser parser = null;
		if ( !startRuleName.equals(LEXER_START_RULE_NAME) ) {
			String parserName = grammarName+"Parser";
			parserClass = cl.loadClass(parserName).asSubclass(Parser.class);
			Constructor<? extends Parser> parserCtor = parserClass.getConstructor(TokenStream.class);
			parser = parserCtor.newInstance((TokenStream)null);
		}

		if ( inputFiles.size()==0 ) {
			InputStream is = System.in;
			Reader r;
			if ( encoding!=null ) {
				r = new InputStreamReader(is, encoding);
			}
			else {
				r = new InputStreamReader(is);
			}

			process(lexer, parserClass, parser, is, r);
			return;
		}
		for (String inputFile : inputFiles) {
			InputStream is = System.in;
			if ( inputFile!=null ) {
				is = new FileInputStream(inputFile);
				this.InputFileName = inputFile;
			}
			Reader r;
			if ( encoding!=null ) {
				r = new InputStreamReader(is, encoding);
			}
			else {
				r = new InputStreamReader(is);
			}

			if ( inputFiles.size()>1 ) {
				System.err.println(inputFile);
			}
			process(lexer, parserClass, parser, is, r);
		}
	}

	protected void process(Lexer lexer, Class<? extends Parser> parserClass, Parser parser, InputStream is, Reader r) throws IOException, IllegalAccessException, InvocationTargetException, PrintException {
		try {
			ANTLRInputStream input = new ANTLRInputStream(r);
			lexer.setInputStream(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);

			tokens.fill();

			if ( showTokens ) {
				for (Object tok : tokens.getTokens()) {
					System.out.println(tok);
				}
			}

			if ( startRuleName.equals(LEXER_START_RULE_NAME) ) return;

			if ( diagnostics ) {
				parser.addErrorListener(new DiagnosticErrorListener());
				parser.getInterpreter().setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);
			}

			if ( printTree || gui || psFile!=null ) {
				parser.setBuildParseTree(true);
			}

			if ( SLL ) { // overrides diagnostics
				parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
			}

			parser.setTokenStream(tokens);
			parser.setTrace(trace);

			try {
				Method startRule = parserClass.getMethod(startRuleName);
				ParserRuleContext tree = (ParserRuleContext)startRule.invoke(parser, (Object[])null);

				if ( printTree ) {
					System.out.println(tree.toStringTree(parser));
				}
				if ( gui ) {
					Trees.inspect(tree, parser);
				}
				if ( psFile!=null ) {
					Trees.save(tree, parser, psFile); // Generate postscript
				}
				
				this.convert(tree);
			}
			catch (NoSuchMethodException nsme) {
				System.err.println("No method for rule "+startRuleName+" or it has arguments");
			}
		}
		finally {
			if ( r!=null ) r.close();
			if ( is!=null ) is.close();
		}
		
	}
	
	/****************/
	/*Convert to CPP*/
	
	public void convert(ParserRuleContext tree)
	{
		NGC2CPPWalker walker = new NGC2CPPWalker();
		NGC2CPPListener listener = new NGC2CPPListener(walker, null);
	    walker.walk(listener, tree);
		
		try {
			listener.save(this.InputFileName + ".cpp");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
