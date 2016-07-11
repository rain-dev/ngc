// Generated from NGC.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NGCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Directive=1, Alignas=2, Alignof=3, Asm=4, Auto=5, Bool=6, Break=7, Case=8, 
		Catch=9, Char=10, Char16=11, Char32=12, Class=13, Const=14, Constexpr=15, 
		Const_cast=16, Continue=17, Decltype=18, Default=19, Delete=20, Do=21, 
		Double=22, Dynamic_cast=23, Else=24, Enum=25, Explicit=26, Export=27, 
		Extern=28, False=29, Final=30, Float=31, For=32, Friend=33, Goto=34, If=35, 
		Inline=36, Int=37, Long=38, Mutable=39, Namespace=40, New=41, Noexcept=42, 
		Nullptr=43, Operator=44, Override=45, Private=46, Protected=47, Public=48, 
		Register=49, Reinterpret_cast=50, Return=51, Short=52, Signed=53, Sizeof=54, 
		Static=55, Static_assert=56, Static_cast=57, Struct=58, Switch=59, Template=60, 
		This=61, Thread_local=62, Throw=63, True=64, Try=65, Typedef=66, Typeid=67, 
		Typename=68, Union=69, Unsigned=70, Using=71, Virtual=72, Void=73, Volatile=74, 
		Wchar=75, While=76, LeftParen=77, RightParen=78, LeftBracket=79, RightBracket=80, 
		LeftBrace=81, RightBrace=82, Plus=83, Minus=84, Star=85, Div=86, Mod=87, 
		Caret=88, And=89, Or=90, Tilde=91, Not=92, Assign=93, Less=94, Greater=95, 
		PlusAssign=96, MinusAssign=97, StarAssign=98, DivAssign=99, ModAssign=100, 
		XorAssign=101, AndAssign=102, OrAssign=103, LeftShift=104, LeftShiftAssign=105, 
		Equal=106, NotEqual=107, LessEqual=108, GreaterEqual=109, AndAnd=110, 
		OrOr=111, PlusPlus=112, MinusMinus=113, Comma=114, ArrowStar=115, Arrow=116, 
		Question=117, Colon=118, Doublecolon=119, Semi=120, Dot=121, DotStar=122, 
		Ellipsis=123, Identifier=124, Integerliteral=125, Decimalliteral=126, 
		Octalliteral=127, Hexadecimalliteral=128, Binaryliteral=129, Integersuffix=130, 
		Characterliteral=131, Floatingliteral=132, Stringliteral=133, Userdefinedintegerliteral=134, 
		Userdefinedfloatingliteral=135, Userdefinedstringliteral=136, Userdefinedcharacterliteral=137, 
		Whitespace=138, Newline=139, BlockComment=140, LineComment=141;
	public static final int
		RULE_translationunit = 0, RULE_primaryexpression = 1, RULE_idexpression = 2, 
		RULE_unqualifiedid = 3, RULE_qualifiedid = 4, RULE_nestednamespecifier = 5, 
		RULE_lambdaexpression = 6, RULE_lambdaintroducer = 7, RULE_lambdacapture = 8, 
		RULE_capturedefault = 9, RULE_capturelist = 10, RULE_capture = 11, RULE_simplecapture = 12, 
		RULE_initcapture = 13, RULE_lambdadeclarator = 14, RULE_postfixexpression = 15, 
		RULE_expressionlist = 16, RULE_pseudodestructorname = 17, RULE_unaryexpression = 18, 
		RULE_unaryoperator = 19, RULE_newexpression = 20, RULE_newplacement = 21, 
		RULE_newtypeid = 22, RULE_newdeclarator = 23, RULE_noptrnewdeclarator = 24, 
		RULE_newinitializer = 25, RULE_deleteexpression = 26, RULE_noexceptexpression = 27, 
		RULE_castexpression = 28, RULE_pmexpression = 29, RULE_multiplicativeexpression = 30, 
		RULE_additiveexpression = 31, RULE_shiftexpression = 32, RULE_relationalexpression = 33, 
		RULE_equalityexpression = 34, RULE_andexpression = 35, RULE_exclusiveorexpression = 36, 
		RULE_inclusiveorexpression = 37, RULE_logicalandexpression = 38, RULE_logicalorexpression = 39, 
		RULE_conditionalexpression = 40, RULE_assignmentexpression = 41, RULE_assignmentoperator = 42, 
		RULE_expression = 43, RULE_constantexpression = 44, RULE_statement = 45, 
		RULE_labeledstatement = 46, RULE_expressionstatement = 47, RULE_compoundstatement = 48, 
		RULE_statementseq = 49, RULE_selectionstatement = 50, RULE_ngc_selectionstatement = 51, 
		RULE_condition = 52, RULE_iterationstatement = 53, RULE_forinitstatement = 54, 
		RULE_forrangedeclaration = 55, RULE_forrangeinitializer = 56, RULE_jumpstatement = 57, 
		RULE_declarationstatement = 58, RULE_declarationseq = 59, RULE_declaration = 60, 
		RULE_blockdeclaration = 61, RULE_aliasdeclaration = 62, RULE_simpledeclaration = 63, 
		RULE_static_assertdeclaration = 64, RULE_emptydeclaration = 65, RULE_attributedeclaration = 66, 
		RULE_declspecifier = 67, RULE_declspecifierseq = 68, RULE_storageclassspecifier = 69, 
		RULE_functionspecifier = 70, RULE_typedefname = 71, RULE_typespecifier = 72, 
		RULE_trailingtypespecifier = 73, RULE_typespecifierseq = 74, RULE_trailingtypespecifierseq = 75, 
		RULE_simpletypespecifier = 76, RULE_typename = 77, RULE_decltypespecifier = 78, 
		RULE_elaboratedtypespecifier = 79, RULE_enumname = 80, RULE_enumspecifier = 81, 
		RULE_enumhead = 82, RULE_opaqueenumdeclaration = 83, RULE_enumkey = 84, 
		RULE_enumbase = 85, RULE_enumeratorlist = 86, RULE_enumeratordefinition = 87, 
		RULE_enumerator = 88, RULE_namespacename = 89, RULE_originalnamespacename = 90, 
		RULE_namespacedefinition = 91, RULE_namednamespacedefinition = 92, RULE_originalnamespacedefinition = 93, 
		RULE_extensionnamespacedefinition = 94, RULE_unnamednamespacedefinition = 95, 
		RULE_namespacebody = 96, RULE_namespacealias = 97, RULE_namespacealiasdefinition = 98, 
		RULE_qualifiednamespacespecifier = 99, RULE_usingdeclaration = 100, RULE_usingdirective = 101, 
		RULE_asmdefinition = 102, RULE_linkagespecification = 103, RULE_attributespecifierseq = 104, 
		RULE_attributespecifier = 105, RULE_alignmentspecifier = 106, RULE_attributelist = 107, 
		RULE_attribute = 108, RULE_attributetoken = 109, RULE_attributescopedtoken = 110, 
		RULE_attributenamespace = 111, RULE_attributeargumentclause = 112, RULE_balancedtokenseq = 113, 
		RULE_balancedtoken = 114, RULE_initdeclaratorlist = 115, RULE_initdeclarator = 116, 
		RULE_declarator = 117, RULE_ptrdeclarator = 118, RULE_noptrdeclarator = 119, 
		RULE_parametersandqualifiers = 120, RULE_trailingreturntype = 121, RULE_ptroperator = 122, 
		RULE_cvqualifierseq = 123, RULE_cvqualifier = 124, RULE_refqualifier = 125, 
		RULE_declaratorid = 126, RULE_typeid = 127, RULE_abstractdeclarator = 128, 
		RULE_ptrabstractdeclarator = 129, RULE_noptrabstractdeclarator = 130, 
		RULE_abstractpackdeclarator = 131, RULE_noptrabstractpackdeclarator = 132, 
		RULE_parameterdeclarationclause = 133, RULE_parameterdeclarationlist = 134, 
		RULE_parameterdeclaration = 135, RULE_functiondefinition = 136, RULE_functionbody = 137, 
		RULE_initializer = 138, RULE_braceorequalinitializer = 139, RULE_initializerclause = 140, 
		RULE_initializerlist = 141, RULE_bracedinitlist = 142, RULE_classname = 143, 
		RULE_classspecifier = 144, RULE_classhead = 145, RULE_classheadname = 146, 
		RULE_classvirtspecifier = 147, RULE_classkey = 148, RULE_memberspecification = 149, 
		RULE_memberdeclaration = 150, RULE_memberdeclaratorlist = 151, RULE_memberdeclarator = 152, 
		RULE_virtspecifierseq = 153, RULE_virtspecifier = 154, RULE_purespecifier = 155, 
		RULE_baseclause = 156, RULE_basespecifierlist = 157, RULE_basespecifier = 158, 
		RULE_classordecltype = 159, RULE_basetypespecifier = 160, RULE_accessspecifier = 161, 
		RULE_conversionfunctionid = 162, RULE_conversiontypeid = 163, RULE_conversiondeclarator = 164, 
		RULE_ctorinitializer = 165, RULE_meminitializerlist = 166, RULE_meminitializer = 167, 
		RULE_meminitializerid = 168, RULE_operatorfunctionid = 169, RULE_literaloperatorid = 170, 
		RULE_templatedeclaration = 171, RULE_templateparameterlist = 172, RULE_templateparameter = 173, 
		RULE_typeparameter = 174, RULE_simpletemplateid = 175, RULE_templateid = 176, 
		RULE_templatename = 177, RULE_templateargumentlist = 178, RULE_templateargument = 179, 
		RULE_typenamespecifier = 180, RULE_explicitinstantiation = 181, RULE_explicitspecialization = 182, 
		RULE_tryblock = 183, RULE_functiontryblock = 184, RULE_handlerseq = 185, 
		RULE_handler = 186, RULE_exceptiondeclaration = 187, RULE_throwexpression = 188, 
		RULE_exceptionspecification = 189, RULE_dynamicexceptionspecification = 190, 
		RULE_typeidlist = 191, RULE_noexceptspecification = 192, RULE_rightShift = 193, 
		RULE_rightShiftAssign = 194, RULE_operator = 195, RULE_literal = 196, 
		RULE_booleanliteral = 197, RULE_pointerliteral = 198, RULE_userdefinedliteral = 199;
	public static final String[] ruleNames = {
		"translationunit", "primaryexpression", "idexpression", "unqualifiedid", 
		"qualifiedid", "nestednamespecifier", "lambdaexpression", "lambdaintroducer", 
		"lambdacapture", "capturedefault", "capturelist", "capture", "simplecapture", 
		"initcapture", "lambdadeclarator", "postfixexpression", "expressionlist", 
		"pseudodestructorname", "unaryexpression", "unaryoperator", "newexpression", 
		"newplacement", "newtypeid", "newdeclarator", "noptrnewdeclarator", "newinitializer", 
		"deleteexpression", "noexceptexpression", "castexpression", "pmexpression", 
		"multiplicativeexpression", "additiveexpression", "shiftexpression", "relationalexpression", 
		"equalityexpression", "andexpression", "exclusiveorexpression", "inclusiveorexpression", 
		"logicalandexpression", "logicalorexpression", "conditionalexpression", 
		"assignmentexpression", "assignmentoperator", "expression", "constantexpression", 
		"statement", "labeledstatement", "expressionstatement", "compoundstatement", 
		"statementseq", "selectionstatement", "ngc_selectionstatement", "condition", 
		"iterationstatement", "forinitstatement", "forrangedeclaration", "forrangeinitializer", 
		"jumpstatement", "declarationstatement", "declarationseq", "declaration", 
		"blockdeclaration", "aliasdeclaration", "simpledeclaration", "static_assertdeclaration", 
		"emptydeclaration", "attributedeclaration", "declspecifier", "declspecifierseq", 
		"storageclassspecifier", "functionspecifier", "typedefname", "typespecifier", 
		"trailingtypespecifier", "typespecifierseq", "trailingtypespecifierseq", 
		"simpletypespecifier", "typename", "decltypespecifier", "elaboratedtypespecifier", 
		"enumname", "enumspecifier", "enumhead", "opaqueenumdeclaration", "enumkey", 
		"enumbase", "enumeratorlist", "enumeratordefinition", "enumerator", "namespacename", 
		"originalnamespacename", "namespacedefinition", "namednamespacedefinition", 
		"originalnamespacedefinition", "extensionnamespacedefinition", "unnamednamespacedefinition", 
		"namespacebody", "namespacealias", "namespacealiasdefinition", "qualifiednamespacespecifier", 
		"usingdeclaration", "usingdirective", "asmdefinition", "linkagespecification", 
		"attributespecifierseq", "attributespecifier", "alignmentspecifier", "attributelist", 
		"attribute", "attributetoken", "attributescopedtoken", "attributenamespace", 
		"attributeargumentclause", "balancedtokenseq", "balancedtoken", "initdeclaratorlist", 
		"initdeclarator", "declarator", "ptrdeclarator", "noptrdeclarator", "parametersandqualifiers", 
		"trailingreturntype", "ptroperator", "cvqualifierseq", "cvqualifier", 
		"refqualifier", "declaratorid", "typeid", "abstractdeclarator", "ptrabstractdeclarator", 
		"noptrabstractdeclarator", "abstractpackdeclarator", "noptrabstractpackdeclarator", 
		"parameterdeclarationclause", "parameterdeclarationlist", "parameterdeclaration", 
		"functiondefinition", "functionbody", "initializer", "braceorequalinitializer", 
		"initializerclause", "initializerlist", "bracedinitlist", "classname", 
		"classspecifier", "classhead", "classheadname", "classvirtspecifier", 
		"classkey", "memberspecification", "memberdeclaration", "memberdeclaratorlist", 
		"memberdeclarator", "virtspecifierseq", "virtspecifier", "purespecifier", 
		"baseclause", "basespecifierlist", "basespecifier", "classordecltype", 
		"basetypespecifier", "accessspecifier", "conversionfunctionid", "conversiontypeid", 
		"conversiondeclarator", "ctorinitializer", "meminitializerlist", "meminitializer", 
		"meminitializerid", "operatorfunctionid", "literaloperatorid", "templatedeclaration", 
		"templateparameterlist", "templateparameter", "typeparameter", "simpletemplateid", 
		"templateid", "templatename", "templateargumentlist", "templateargument", 
		"typenamespecifier", "explicitinstantiation", "explicitspecialization", 
		"tryblock", "functiontryblock", "handlerseq", "handler", "exceptiondeclaration", 
		"throwexpression", "exceptionspecification", "dynamicexceptionspecification", 
		"typeidlist", "noexceptspecification", "rightShift", "rightShiftAssign", 
		"operator", "literal", "booleanliteral", "pointerliteral", "userdefinedliteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'alignas'", "'alignof'", "'asm'", "'auto'", "'bool'", "'break'", 
		"'case'", "'catch'", "'char'", "'char16_t'", "'char32_t'", "'class'", 
		"'const'", "'constexpr'", "'const_cast'", "'continue'", "'decltype'", 
		"'default'", "'delete'", "'do'", "'double'", "'dynamic_cast'", "'else'", 
		"'enum'", "'explicit'", "'export'", "'extern'", "'false'", "'final'", 
		"'float'", "'for'", "'friend'", "'goto'", "'if'", "'inline'", "'int'", 
		"'long'", "'mutable'", "'namespace'", "'new'", "'noexcept'", "'nullptr'", 
		"'operator'", "'override'", "'private'", "'protected'", "'public'", "'register'", 
		"'reinterpret_cast'", "'return'", "'short'", "'signed'", "'sizeof'", "'static'", 
		"'static_assert'", "'static_cast'", "'struct'", "'switch'", "'template'", 
		"'this'", "'thread_local'", "'throw'", "'true'", "'try'", "'typedef'", 
		"'typeid'", "'typename'", "'union'", "'unsigned'", "'using'", "'virtual'", 
		"'void'", "'volatile'", "'wchar_t'", "'while'", "'('", "')'", "'['", "']'", 
		"'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'&'", "'|'", 
		"'~'", "'!'", "'='", "'<'", "'>'", "'+='", "'-='", "'*='", "'/='", "'%='", 
		"'^='", "'&='", "'|='", "'<<'", "'<<='", "'=='", "'!='", "'<='", "'>='", 
		"'&&'", "'||'", "'++'", "'--'", "','", "'->*'", "'->'", "'?'", "':'", 
		"'::'", "';'", "'.'", "'.*'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Directive", "Alignas", "Alignof", "Asm", "Auto", "Bool", "Break", 
		"Case", "Catch", "Char", "Char16", "Char32", "Class", "Const", "Constexpr", 
		"Const_cast", "Continue", "Decltype", "Default", "Delete", "Do", "Double", 
		"Dynamic_cast", "Else", "Enum", "Explicit", "Export", "Extern", "False", 
		"Final", "Float", "For", "Friend", "Goto", "If", "Inline", "Int", "Long", 
		"Mutable", "Namespace", "New", "Noexcept", "Nullptr", "Operator", "Override", 
		"Private", "Protected", "Public", "Register", "Reinterpret_cast", "Return", 
		"Short", "Signed", "Sizeof", "Static", "Static_assert", "Static_cast", 
		"Struct", "Switch", "Template", "This", "Thread_local", "Throw", "True", 
		"Try", "Typedef", "Typeid", "Typename", "Union", "Unsigned", "Using", 
		"Virtual", "Void", "Volatile", "Wchar", "While", "LeftParen", "RightParen", 
		"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "Plus", "Minus", 
		"Star", "Div", "Mod", "Caret", "And", "Or", "Tilde", "Not", "Assign", 
		"Less", "Greater", "PlusAssign", "MinusAssign", "StarAssign", "DivAssign", 
		"ModAssign", "XorAssign", "AndAssign", "OrAssign", "LeftShift", "LeftShiftAssign", 
		"Equal", "NotEqual", "LessEqual", "GreaterEqual", "AndAnd", "OrOr", "PlusPlus", 
		"MinusMinus", "Comma", "ArrowStar", "Arrow", "Question", "Colon", "Doublecolon", 
		"Semi", "Dot", "DotStar", "Ellipsis", "Identifier", "Integerliteral", 
		"Decimalliteral", "Octalliteral", "Hexadecimalliteral", "Binaryliteral", 
		"Integersuffix", "Characterliteral", "Floatingliteral", "Stringliteral", 
		"Userdefinedintegerliteral", "Userdefinedfloatingliteral", "Userdefinedstringliteral", 
		"Userdefinedcharacterliteral", "Whitespace", "Newline", "BlockComment", 
		"LineComment"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "NGC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NGCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TranslationunitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(NGCParser.EOF, 0); }
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public TranslationunitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationunit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterTranslationunit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitTranslationunit(this);
		}
	}

	public final TranslationunitContext translationunit() throws RecognitionException {
		TranslationunitContext _localctx = new TranslationunitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translationunit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Using - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Tilde - 66)) | (1L << (AndAnd - 66)) | (1L << (Doublecolon - 66)) | (1L << (Semi - 66)) | (1L << (Ellipsis - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(400);
				declarationseq(0);
				}
			}

			setState(403);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryexpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode This() { return getToken(NGCParser.This, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public LambdaexpressionContext lambdaexpression() {
			return getRuleContext(LambdaexpressionContext.class,0);
		}
		public PrimaryexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterPrimaryexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitPrimaryexpression(this);
		}
	}

	public final PrimaryexpressionContext primaryexpression() throws RecognitionException {
		PrimaryexpressionContext _localctx = new PrimaryexpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_primaryexpression);
		try {
			setState(413);
			switch (_input.LA(1)) {
			case False:
			case Nullptr:
			case True:
			case Integerliteral:
			case Characterliteral:
			case Floatingliteral:
			case Stringliteral:
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				literal();
				}
				break;
			case This:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				match(This);
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(407);
				match(LeftParen);
				setState(408);
				expression(0);
				setState(409);
				match(RightParen);
				}
				break;
			case Decltype:
			case Operator:
			case Tilde:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(411);
				idexpression();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 5);
				{
				setState(412);
				lambdaexpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdexpressionContext extends ParserRuleContext {
		public UnqualifiedidContext unqualifiedid() {
			return getRuleContext(UnqualifiedidContext.class,0);
		}
		public QualifiedidContext qualifiedid() {
			return getRuleContext(QualifiedidContext.class,0);
		}
		public IdexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterIdexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitIdexpression(this);
		}
	}

	public final IdexpressionContext idexpression() throws RecognitionException {
		IdexpressionContext _localctx = new IdexpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_idexpression);
		try {
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				unqualifiedid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				qualifiedid();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnqualifiedidContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(NGCParser.Identifier, 0); }
		public OperatorfunctionidContext operatorfunctionid() {
			return getRuleContext(OperatorfunctionidContext.class,0);
		}
		public ConversionfunctionidContext conversionfunctionid() {
			return getRuleContext(ConversionfunctionidContext.class,0);
		}
		public LiteraloperatoridContext literaloperatorid() {
			return getRuleContext(LiteraloperatoridContext.class,0);
		}
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public TemplateidContext templateid() {
			return getRuleContext(TemplateidContext.class,0);
		}
		public UnqualifiedidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unqualifiedid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterUnqualifiedid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitUnqualifiedid(this);
		}
	}

	public final UnqualifiedidContext unqualifiedid() throws RecognitionException {
		UnqualifiedidContext _localctx = new UnqualifiedidContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unqualifiedid);
		try {
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				operatorfunctionid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(421);
				conversionfunctionid();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(422);
				literaloperatorid();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(423);
				match(Tilde);
				setState(424);
				classname();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(425);
				match(Tilde);
				setState(426);
				decltypespecifier();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(427);
				templateid();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedidContext extends ParserRuleContext {
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public UnqualifiedidContext unqualifiedid() {
			return getRuleContext(UnqualifiedidContext.class,0);
		}
		public TerminalNode Template() { return getToken(NGCParser.Template, 0); }
		public QualifiedidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterQualifiedid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitQualifiedid(this);
		}
	}

	public final QualifiedidContext qualifiedid() throws RecognitionException {
		QualifiedidContext _localctx = new QualifiedidContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_qualifiedid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			nestednamespecifier(0);
			setState(432);
			_la = _input.LA(1);
			if (_la==Template) {
				{
				setState(431);
				match(Template);
				}
			}

			setState(434);
			unqualifiedid();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestednamespecifierContext extends ParserRuleContext {
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public NamespacenameContext namespacename() {
			return getRuleContext(NamespacenameContext.class,0);
		}
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(NGCParser.Identifier, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TerminalNode Template() { return getToken(NGCParser.Template, 0); }
		public NestednamespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestednamespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterNestednamespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitNestednamespecifier(this);
		}
	}

	public final NestednamespecifierContext nestednamespecifier() throws RecognitionException {
		return nestednamespecifier(0);
	}

	private NestednamespecifierContext nestednamespecifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NestednamespecifierContext _localctx = new NestednamespecifierContext(_ctx, _parentState);
		NestednamespecifierContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_nestednamespecifier, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(437);
				match(Doublecolon);
				}
				break;
			case 2:
				{
				setState(438);
				typename();
				setState(439);
				match(Doublecolon);
				}
				break;
			case 3:
				{
				setState(441);
				namespacename();
				setState(442);
				match(Doublecolon);
				}
				break;
			case 4:
				{
				setState(444);
				decltypespecifier();
				setState(445);
				match(Doublecolon);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(461);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(459);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new NestednamespecifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nestednamespecifier);
						setState(449);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(450);
						match(Identifier);
						setState(451);
						match(Doublecolon);
						}
						break;
					case 2:
						{
						_localctx = new NestednamespecifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nestednamespecifier);
						setState(452);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(454);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(453);
							match(Template);
							}
						}

						setState(456);
						simpletemplateid();
						setState(457);
						match(Doublecolon);
						}
						break;
					}
					} 
				}
				setState(463);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LambdaexpressionContext extends ParserRuleContext {
		public LambdaintroducerContext lambdaintroducer() {
			return getRuleContext(LambdaintroducerContext.class,0);
		}
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public LambdadeclaratorContext lambdadeclarator() {
			return getRuleContext(LambdadeclaratorContext.class,0);
		}
		public LambdaexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterLambdaexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitLambdaexpression(this);
		}
	}

	public final LambdaexpressionContext lambdaexpression() throws RecognitionException {
		LambdaexpressionContext _localctx = new LambdaexpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lambdaexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			lambdaintroducer();
			setState(466);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(465);
				lambdadeclarator();
				}
			}

			setState(468);
			compoundstatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaintroducerContext extends ParserRuleContext {
		public LambdacaptureContext lambdacapture() {
			return getRuleContext(LambdacaptureContext.class,0);
		}
		public LambdaintroducerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaintroducer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterLambdaintroducer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitLambdaintroducer(this);
		}
	}

	public final LambdaintroducerContext lambdaintroducer() throws RecognitionException {
		LambdaintroducerContext _localctx = new LambdaintroducerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lambdaintroducer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(LeftBracket);
			setState(472);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (This - 61)) | (1L << (And - 61)) | (1L << (Assign - 61)) | (1L << (Identifier - 61)))) != 0)) {
				{
				setState(471);
				lambdacapture();
				}
			}

			setState(474);
			match(RightBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdacaptureContext extends ParserRuleContext {
		public CapturedefaultContext capturedefault() {
			return getRuleContext(CapturedefaultContext.class,0);
		}
		public CapturelistContext capturelist() {
			return getRuleContext(CapturelistContext.class,0);
		}
		public LambdacaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdacapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterLambdacapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitLambdacapture(this);
		}
	}

	public final LambdacaptureContext lambdacapture() throws RecognitionException {
		LambdacaptureContext _localctx = new LambdacaptureContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lambdacapture);
		try {
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				capturedefault();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
				capturelist(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(478);
				capturedefault();
				setState(479);
				match(Comma);
				setState(480);
				capturelist(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CapturedefaultContext extends ParserRuleContext {
		public CapturedefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capturedefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterCapturedefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitCapturedefault(this);
		}
	}

	public final CapturedefaultContext capturedefault() throws RecognitionException {
		CapturedefaultContext _localctx = new CapturedefaultContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_capturedefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			_la = _input.LA(1);
			if ( !(_la==And || _la==Assign) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CapturelistContext extends ParserRuleContext {
		public CaptureContext capture() {
			return getRuleContext(CaptureContext.class,0);
		}
		public CapturelistContext capturelist() {
			return getRuleContext(CapturelistContext.class,0);
		}
		public CapturelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capturelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterCapturelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitCapturelist(this);
		}
	}

	public final CapturelistContext capturelist() throws RecognitionException {
		return capturelist(0);
	}

	private CapturelistContext capturelist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CapturelistContext _localctx = new CapturelistContext(_ctx, _parentState);
		CapturelistContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_capturelist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(487);
			capture();
			setState(489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(488);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(499);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CapturelistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_capturelist);
					setState(491);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(492);
					match(Comma);
					setState(493);
					capture();
					setState(495);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(494);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(501);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CaptureContext extends ParserRuleContext {
		public SimplecaptureContext simplecapture() {
			return getRuleContext(SimplecaptureContext.class,0);
		}
		public InitcaptureContext initcapture() {
			return getRuleContext(InitcaptureContext.class,0);
		}
		public CaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterCapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitCapture(this);
		}
	}

	public final CaptureContext capture() throws RecognitionException {
		CaptureContext _localctx = new CaptureContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_capture);
		try {
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				simplecapture();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				initcapture();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimplecaptureContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(NGCParser.Identifier, 0); }
		public TerminalNode This() { return getToken(NGCParser.This, 0); }
		public SimplecaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplecapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterSimplecapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitSimplecapture(this);
		}
	}

	public final SimplecaptureContext simplecapture() throws RecognitionException {
		SimplecaptureContext _localctx = new SimplecaptureContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_simplecapture);
		try {
			setState(510);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				match(Identifier);
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				match(And);
				setState(508);
				match(Identifier);
				}
				break;
			case This:
				enterOuterAlt(_localctx, 3);
				{
				setState(509);
				match(This);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitcaptureContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(NGCParser.Identifier, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitcaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initcapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterInitcapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitInitcapture(this);
		}
	}

	public final InitcaptureContext initcapture() throws RecognitionException {
		InitcaptureContext _localctx = new InitcaptureContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_initcapture);
		try {
			setState(517);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				match(Identifier);
				setState(513);
				initializer();
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(514);
				match(And);
				setState(515);
				match(Identifier);
				setState(516);
				initializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdadeclaratorContext extends ParserRuleContext {
		public ParameterdeclarationclauseContext parameterdeclarationclause() {
			return getRuleContext(ParameterdeclarationclauseContext.class,0);
		}
		public TerminalNode Mutable() { return getToken(NGCParser.Mutable, 0); }
		public ExceptionspecificationContext exceptionspecification() {
			return getRuleContext(ExceptionspecificationContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TrailingreturntypeContext trailingreturntype() {
			return getRuleContext(TrailingreturntypeContext.class,0);
		}
		public LambdadeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdadeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterLambdadeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitLambdadeclarator(this);
		}
	}

	public final LambdadeclaratorContext lambdadeclarator() throws RecognitionException {
		LambdadeclaratorContext _localctx = new LambdadeclaratorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_lambdadeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(LeftParen);
			setState(520);
			parameterdeclarationclause();
			setState(521);
			match(RightParen);
			setState(523);
			_la = _input.LA(1);
			if (_la==Mutable) {
				{
				setState(522);
				match(Mutable);
				}
			}

			setState(526);
			_la = _input.LA(1);
			if (_la==Noexcept || _la==Throw) {
				{
				setState(525);
				exceptionspecification();
				}
			}

			setState(529);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(528);
				attributespecifierseq(0);
				}
			}

			setState(532);
			_la = _input.LA(1);
			if (_la==Arrow) {
				{
				setState(531);
				trailingreturntype();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixexpressionContext extends ParserRuleContext {
		public PrimaryexpressionContext primaryexpression() {
			return getRuleContext(PrimaryexpressionContext.class,0);
		}
		public SimpletypespecifierContext simpletypespecifier() {
			return getRuleContext(SimpletypespecifierContext.class,0);
		}
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public TypenamespecifierContext typenamespecifier() {
			return getRuleContext(TypenamespecifierContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public TerminalNode Dynamic_cast() { return getToken(NGCParser.Dynamic_cast, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Static_cast() { return getToken(NGCParser.Static_cast, 0); }
		public TerminalNode Reinterpret_cast() { return getToken(NGCParser.Reinterpret_cast, 0); }
		public TerminalNode Const_cast() { return getToken(NGCParser.Const_cast, 0); }
		public TerminalNode Typeid() { return getToken(NGCParser.Typeid, 0); }
		public PostfixexpressionContext postfixexpression() {
			return getRuleContext(PostfixexpressionContext.class,0);
		}
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public TerminalNode Template() { return getToken(NGCParser.Template, 0); }
		public PseudodestructornameContext pseudodestructorname() {
			return getRuleContext(PseudodestructornameContext.class,0);
		}
		public PostfixexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterPostfixexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitPostfixexpression(this);
		}
	}

	public final PostfixexpressionContext postfixexpression() throws RecognitionException {
		return postfixexpression(0);
	}

	private PostfixexpressionContext postfixexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixexpressionContext _localctx = new PostfixexpressionContext(_ctx, _parentState);
		PostfixexpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_postfixexpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(535);
				primaryexpression();
				}
				break;
			case 2:
				{
				setState(536);
				simpletypespecifier();
				setState(537);
				match(LeftParen);
				setState(539);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (True - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(538);
					expressionlist();
					}
				}

				setState(541);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(543);
				typenamespecifier();
				setState(544);
				match(LeftParen);
				setState(546);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (True - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(545);
					expressionlist();
					}
				}

				setState(548);
				match(RightParen);
				}
				break;
			case 4:
				{
				setState(550);
				simpletypespecifier();
				setState(551);
				bracedinitlist();
				}
				break;
			case 5:
				{
				setState(553);
				typenamespecifier();
				setState(554);
				bracedinitlist();
				}
				break;
			case 6:
				{
				setState(556);
				match(Dynamic_cast);
				setState(557);
				match(Less);
				setState(558);
				typeid();
				setState(559);
				match(Greater);
				setState(560);
				match(LeftParen);
				setState(561);
				expression(0);
				setState(562);
				match(RightParen);
				}
				break;
			case 7:
				{
				setState(564);
				match(Static_cast);
				setState(565);
				match(Less);
				setState(566);
				typeid();
				setState(567);
				match(Greater);
				setState(568);
				match(LeftParen);
				setState(569);
				expression(0);
				setState(570);
				match(RightParen);
				}
				break;
			case 8:
				{
				setState(572);
				match(Reinterpret_cast);
				setState(573);
				match(Less);
				setState(574);
				typeid();
				setState(575);
				match(Greater);
				setState(576);
				match(LeftParen);
				setState(577);
				expression(0);
				setState(578);
				match(RightParen);
				}
				break;
			case 9:
				{
				setState(580);
				match(Const_cast);
				setState(581);
				match(Less);
				setState(582);
				typeid();
				setState(583);
				match(Greater);
				setState(584);
				match(LeftParen);
				setState(585);
				expression(0);
				setState(586);
				match(RightParen);
				}
				break;
			case 10:
				{
				setState(588);
				match(Typeid);
				setState(589);
				match(LeftParen);
				setState(590);
				expression(0);
				setState(591);
				match(RightParen);
				}
				break;
			case 11:
				{
				setState(593);
				match(Typeid);
				setState(594);
				match(LeftParen);
				setState(595);
				typeid();
				setState(596);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(640);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(638);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(600);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(601);
						match(LeftBracket);
						setState(602);
						expression(0);
						setState(603);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(605);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(606);
						match(LeftBracket);
						setState(607);
						bracedinitlist();
						setState(608);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(610);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(611);
						match(LeftParen);
						setState(613);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (True - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
							{
							setState(612);
							expressionlist();
							}
						}

						setState(615);
						match(RightParen);
						}
						break;
					case 4:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(616);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(617);
						match(Dot);
						setState(619);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(618);
							match(Template);
							}
						}

						setState(621);
						idexpression();
						}
						break;
					case 5:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(622);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(623);
						match(Arrow);
						setState(625);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(624);
							match(Template);
							}
						}

						setState(627);
						idexpression();
						}
						break;
					case 6:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(628);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(629);
						match(Dot);
						setState(630);
						pseudodestructorname();
						}
						break;
					case 7:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(631);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(632);
						match(Arrow);
						setState(633);
						pseudodestructorname();
						}
						break;
					case 8:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(634);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(635);
						match(PlusPlus);
						}
						break;
					case 9:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(636);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(637);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(642);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionlistContext extends ParserRuleContext {
		public InitializerlistContext initializerlist() {
			return getRuleContext(InitializerlistContext.class,0);
		}
		public ExpressionlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterExpressionlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitExpressionlist(this);
		}
	}

	public final ExpressionlistContext expressionlist() throws RecognitionException {
		ExpressionlistContext _localctx = new ExpressionlistContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expressionlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			initializerlist(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PseudodestructornameContext extends ParserRuleContext {
		public List<TypenameContext> typename() {
			return getRuleContexts(TypenameContext.class);
		}
		public TypenameContext typename(int i) {
			return getRuleContext(TypenameContext.class,i);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public TerminalNode Template() { return getToken(NGCParser.Template, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public PseudodestructornameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudodestructorname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterPseudodestructorname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitPseudodestructorname(this);
		}
	}

	public final PseudodestructornameContext pseudodestructorname() throws RecognitionException {
		PseudodestructornameContext _localctx = new PseudodestructornameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pseudodestructorname);
		int _la;
		try {
			setState(667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(646);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(645);
					nestednamespecifier(0);
					}
					break;
				}
				setState(648);
				typename();
				setState(649);
				match(Doublecolon);
				setState(650);
				match(Tilde);
				setState(651);
				typename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(653);
				nestednamespecifier(0);
				setState(654);
				match(Template);
				setState(655);
				simpletemplateid();
				setState(656);
				match(Doublecolon);
				setState(657);
				match(Tilde);
				setState(658);
				typename();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(661);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Doublecolon || _la==Identifier) {
					{
					setState(660);
					nestednamespecifier(0);
					}
				}

				setState(663);
				match(Tilde);
				setState(664);
				typename();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(665);
				match(Tilde);
				setState(666);
				decltypespecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryexpressionContext extends ParserRuleContext {
		public PostfixexpressionContext postfixexpression() {
			return getRuleContext(PostfixexpressionContext.class,0);
		}
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public UnaryoperatorContext unaryoperator() {
			return getRuleContext(UnaryoperatorContext.class,0);
		}
		public TerminalNode Sizeof() { return getToken(NGCParser.Sizeof, 0); }
		public UnaryexpressionContext unaryexpression() {
			return getRuleContext(UnaryexpressionContext.class,0);
		}
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(NGCParser.Identifier, 0); }
		public TerminalNode Alignof() { return getToken(NGCParser.Alignof, 0); }
		public NoexceptexpressionContext noexceptexpression() {
			return getRuleContext(NoexceptexpressionContext.class,0);
		}
		public NewexpressionContext newexpression() {
			return getRuleContext(NewexpressionContext.class,0);
		}
		public DeleteexpressionContext deleteexpression() {
			return getRuleContext(DeleteexpressionContext.class,0);
		}
		public UnaryexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterUnaryexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitUnaryexpression(this);
		}
	}

	public final UnaryexpressionContext unaryexpression() throws RecognitionException {
		UnaryexpressionContext _localctx = new UnaryexpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_unaryexpression);
		try {
			setState(697);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(669);
				postfixexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(670);
				match(PlusPlus);
				setState(671);
				castexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(672);
				match(MinusMinus);
				setState(673);
				castexpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(674);
				unaryoperator();
				setState(675);
				castexpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(677);
				match(Sizeof);
				setState(678);
				unaryexpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(679);
				match(Sizeof);
				setState(680);
				match(LeftParen);
				setState(681);
				typeid();
				setState(682);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(684);
				match(Sizeof);
				setState(685);
				match(Ellipsis);
				setState(686);
				match(LeftParen);
				setState(687);
				match(Identifier);
				setState(688);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(689);
				match(Alignof);
				setState(690);
				match(LeftParen);
				setState(691);
				typeid();
				setState(692);
				match(RightParen);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(694);
				noexceptexpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(695);
				newexpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(696);
				deleteexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryoperatorContext extends ParserRuleContext {
		public UnaryoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterUnaryoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitUnaryoperator(this);
		}
	}

	public final UnaryoperatorContext unaryoperator() throws RecognitionException {
		UnaryoperatorContext _localctx = new UnaryoperatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_unaryoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			_la = _input.LA(1);
			if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (Plus - 83)) | (1L << (Minus - 83)) | (1L << (Star - 83)) | (1L << (And - 83)) | (1L << (Or - 83)) | (1L << (Tilde - 83)) | (1L << (Not - 83)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewexpressionContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(NGCParser.New, 0); }
		public NewtypeidContext newtypeid() {
			return getRuleContext(NewtypeidContext.class,0);
		}
		public NewplacementContext newplacement() {
			return getRuleContext(NewplacementContext.class,0);
		}
		public NewinitializerContext newinitializer() {
			return getRuleContext(NewinitializerContext.class,0);
		}
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public NewexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterNewexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitNewexpression(this);
		}
	}

	public final NewexpressionContext newexpression() throws RecognitionException {
		NewexpressionContext _localctx = new NewexpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_newexpression);
		int _la;
		try {
			setState(725);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(702);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(701);
					match(Doublecolon);
					}
				}

				setState(704);
				match(New);
				setState(706);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(705);
					newplacement();
					}
				}

				setState(708);
				newtypeid();
				setState(710);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(709);
					newinitializer();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(713);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(712);
					match(Doublecolon);
					}
				}

				setState(715);
				match(New);
				setState(717);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(716);
					newplacement();
					}
					break;
				}
				setState(719);
				match(LeftParen);
				setState(720);
				typeid();
				setState(721);
				match(RightParen);
				setState(723);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(722);
					newinitializer();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewplacementContext extends ParserRuleContext {
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public NewplacementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newplacement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterNewplacement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitNewplacement(this);
		}
	}

	public final NewplacementContext newplacement() throws RecognitionException {
		NewplacementContext _localctx = new NewplacementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_newplacement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			match(LeftParen);
			setState(728);
			expressionlist();
			setState(729);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewtypeidContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public NewdeclaratorContext newdeclarator() {
			return getRuleContext(NewdeclaratorContext.class,0);
		}
		public NewtypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newtypeid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterNewtypeid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitNewtypeid(this);
		}
	}

	public final NewtypeidContext newtypeid() throws RecognitionException {
		NewtypeidContext _localctx = new NewtypeidContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_newtypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			typespecifierseq();
			setState(733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(732);
				newdeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewdeclaratorContext extends ParserRuleContext {
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public NewdeclaratorContext newdeclarator() {
			return getRuleContext(NewdeclaratorContext.class,0);
		}
		public NoptrnewdeclaratorContext noptrnewdeclarator() {
			return getRuleContext(NoptrnewdeclaratorContext.class,0);
		}
		public NewdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterNewdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitNewdeclarator(this);
		}
	}

	public final NewdeclaratorContext newdeclarator() throws RecognitionException {
		NewdeclaratorContext _localctx = new NewdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_newdeclarator);
		try {
			setState(740);
			switch (_input.LA(1)) {
			case Decltype:
			case Star:
			case And:
			case AndAnd:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(735);
				ptroperator();
				setState(737);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(736);
					newdeclarator();
					}
					break;
				}
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(739);
				noptrnewdeclarator(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoptrnewdeclaratorContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NoptrnewdeclaratorContext noptrnewdeclarator() {
			return getRuleContext(NoptrnewdeclaratorContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public NoptrnewdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrnewdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterNoptrnewdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitNoptrnewdeclarator(this);
		}
	}

	public final NoptrnewdeclaratorContext noptrnewdeclarator() throws RecognitionException {
		return noptrnewdeclarator(0);
	}

	private NoptrnewdeclaratorContext noptrnewdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrnewdeclaratorContext _localctx = new NoptrnewdeclaratorContext(_ctx, _parentState);
		NoptrnewdeclaratorContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_noptrnewdeclarator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(743);
			match(LeftBracket);
			setState(744);
			expression(0);
			setState(745);
			match(RightBracket);
			setState(747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(746);
				attributespecifierseq(0);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(758);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoptrnewdeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noptrnewdeclarator);
					setState(749);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(750);
					match(LeftBracket);
					setState(751);
					constantexpression();
					setState(752);
					match(RightBracket);
					setState(754);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						setState(753);
						attributespecifierseq(0);
						}
						break;
					}
					}
					} 
				}
				setState(760);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NewinitializerContext extends ParserRuleContext {
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public NewinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newinitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterNewinitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitNewinitializer(this);
		}
	}

	public final NewinitializerContext newinitializer() throws RecognitionException {
		NewinitializerContext _localctx = new NewinitializerContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_newinitializer);
		int _la;
		try {
			setState(767);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(761);
				match(LeftParen);
				setState(763);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (True - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(762);
					expressionlist();
					}
				}

				setState(765);
				match(RightParen);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(766);
				bracedinitlist();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteexpressionContext extends ParserRuleContext {
		public TerminalNode Delete() { return getToken(NGCParser.Delete, 0); }
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public DeleteexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterDeleteexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitDeleteexpression(this);
		}
	}

	public final DeleteexpressionContext deleteexpression() throws RecognitionException {
		DeleteexpressionContext _localctx = new DeleteexpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_deleteexpression);
		int _la;
		try {
			setState(781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(770);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(769);
					match(Doublecolon);
					}
				}

				setState(772);
				match(Delete);
				setState(773);
				castexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(775);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(774);
					match(Doublecolon);
					}
				}

				setState(777);
				match(Delete);
				setState(778);
				match(LeftBracket);
				setState(779);
				match(RightBracket);
				setState(780);
				castexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoexceptexpressionContext extends ParserRuleContext {
		public TerminalNode Noexcept() { return getToken(NGCParser.Noexcept, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NoexceptexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noexceptexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterNoexceptexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitNoexceptexpression(this);
		}
	}

	public final NoexceptexpressionContext noexceptexpression() throws RecognitionException {
		NoexceptexpressionContext _localctx = new NoexceptexpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_noexceptexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			match(Noexcept);
			setState(784);
			match(LeftParen);
			setState(785);
			expression(0);
			setState(786);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastexpressionContext extends ParserRuleContext {
		public UnaryexpressionContext unaryexpression() {
			return getRuleContext(UnaryexpressionContext.class,0);
		}
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public CastexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterCastexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitCastexpression(this);
		}
	}

	public final CastexpressionContext castexpression() throws RecognitionException {
		CastexpressionContext _localctx = new CastexpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_castexpression);
		try {
			setState(794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(788);
				unaryexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(789);
				match(LeftParen);
				setState(790);
				typeid();
				setState(791);
				match(RightParen);
				setState(792);
				castexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PmexpressionContext extends ParserRuleContext {
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public PmexpressionContext pmexpression() {
			return getRuleContext(PmexpressionContext.class,0);
		}
		public PmexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pmexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterPmexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitPmexpression(this);
		}
	}

	public final PmexpressionContext pmexpression() throws RecognitionException {
		return pmexpression(0);
	}

	private PmexpressionContext pmexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PmexpressionContext _localctx = new PmexpressionContext(_ctx, _parentState);
		PmexpressionContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_pmexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(797);
			castexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(807);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(805);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						_localctx = new PmexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pmexpression);
						setState(799);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(800);
						match(DotStar);
						setState(801);
						castexpression();
						}
						break;
					case 2:
						{
						_localctx = new PmexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pmexpression);
						setState(802);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(803);
						match(ArrowStar);
						setState(804);
						castexpression();
						}
						break;
					}
					} 
				}
				setState(809);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicativeexpressionContext extends ParserRuleContext {
		public PmexpressionContext pmexpression() {
			return getRuleContext(PmexpressionContext.class,0);
		}
		public MultiplicativeexpressionContext multiplicativeexpression() {
			return getRuleContext(MultiplicativeexpressionContext.class,0);
		}
		public MultiplicativeexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterMultiplicativeexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitMultiplicativeexpression(this);
		}
	}

	public final MultiplicativeexpressionContext multiplicativeexpression() throws RecognitionException {
		return multiplicativeexpression(0);
	}

	private MultiplicativeexpressionContext multiplicativeexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeexpressionContext _localctx = new MultiplicativeexpressionContext(_ctx, _parentState);
		MultiplicativeexpressionContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_multiplicativeexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(811);
			pmexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(824);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(822);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(813);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(814);
						match(Star);
						setState(815);
						pmexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(816);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(817);
						match(Div);
						setState(818);
						pmexpression(0);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(819);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(820);
						match(Mod);
						setState(821);
						pmexpression(0);
						}
						break;
					}
					} 
				}
				setState(826);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveexpressionContext extends ParserRuleContext {
		public MultiplicativeexpressionContext multiplicativeexpression() {
			return getRuleContext(MultiplicativeexpressionContext.class,0);
		}
		public AdditiveexpressionContext additiveexpression() {
			return getRuleContext(AdditiveexpressionContext.class,0);
		}
		public AdditiveexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterAdditiveexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitAdditiveexpression(this);
		}
	}

	public final AdditiveexpressionContext additiveexpression() throws RecognitionException {
		return additiveexpression(0);
	}

	private AdditiveexpressionContext additiveexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveexpressionContext _localctx = new AdditiveexpressionContext(_ctx, _parentState);
		AdditiveexpressionContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_additiveexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(828);
			multiplicativeexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(838);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(836);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveexpression);
						setState(830);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(831);
						match(Plus);
						setState(832);
						multiplicativeexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveexpression);
						setState(833);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(834);
						match(Minus);
						setState(835);
						multiplicativeexpression(0);
						}
						break;
					}
					} 
				}
				setState(840);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftexpressionContext extends ParserRuleContext {
		public AdditiveexpressionContext additiveexpression() {
			return getRuleContext(AdditiveexpressionContext.class,0);
		}
		public ShiftexpressionContext shiftexpression() {
			return getRuleContext(ShiftexpressionContext.class,0);
		}
		public RightShiftContext rightShift() {
			return getRuleContext(RightShiftContext.class,0);
		}
		public ShiftexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterShiftexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitShiftexpression(this);
		}
	}

	public final ShiftexpressionContext shiftexpression() throws RecognitionException {
		return shiftexpression(0);
	}

	private ShiftexpressionContext shiftexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftexpressionContext _localctx = new ShiftexpressionContext(_ctx, _parentState);
		ShiftexpressionContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_shiftexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(842);
			additiveexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(853);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(851);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftexpression);
						setState(844);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(845);
						match(LeftShift);
						setState(846);
						additiveexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftexpression);
						setState(847);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(848);
						rightShift();
						setState(849);
						additiveexpression(0);
						}
						break;
					}
					} 
				}
				setState(855);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalexpressionContext extends ParserRuleContext {
		public ShiftexpressionContext shiftexpression() {
			return getRuleContext(ShiftexpressionContext.class,0);
		}
		public RelationalexpressionContext relationalexpression() {
			return getRuleContext(RelationalexpressionContext.class,0);
		}
		public RelationalexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterRelationalexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitRelationalexpression(this);
		}
	}

	public final RelationalexpressionContext relationalexpression() throws RecognitionException {
		return relationalexpression(0);
	}

	private RelationalexpressionContext relationalexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalexpressionContext _localctx = new RelationalexpressionContext(_ctx, _parentState);
		RelationalexpressionContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_relationalexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(857);
			shiftexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(873);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(871);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(859);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(860);
						match(Less);
						setState(861);
						shiftexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(862);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(863);
						match(Greater);
						setState(864);
						shiftexpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(865);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(866);
						match(LessEqual);
						setState(867);
						shiftexpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(868);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(869);
						match(GreaterEqual);
						setState(870);
						shiftexpression(0);
						}
						break;
					}
					} 
				}
				setState(875);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityexpressionContext extends ParserRuleContext {
		public RelationalexpressionContext relationalexpression() {
			return getRuleContext(RelationalexpressionContext.class,0);
		}
		public EqualityexpressionContext equalityexpression() {
			return getRuleContext(EqualityexpressionContext.class,0);
		}
		public EqualityexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterEqualityexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitEqualityexpression(this);
		}
	}

	public final EqualityexpressionContext equalityexpression() throws RecognitionException {
		return equalityexpression(0);
	}

	private EqualityexpressionContext equalityexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityexpressionContext _localctx = new EqualityexpressionContext(_ctx, _parentState);
		EqualityexpressionContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_equalityexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(877);
			relationalexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(887);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(885);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(879);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(880);
						match(Equal);
						setState(881);
						relationalexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(882);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(883);
						match(NotEqual);
						setState(884);
						relationalexpression(0);
						}
						break;
					}
					} 
				}
				setState(889);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndexpressionContext extends ParserRuleContext {
		public EqualityexpressionContext equalityexpression() {
			return getRuleContext(EqualityexpressionContext.class,0);
		}
		public AndexpressionContext andexpression() {
			return getRuleContext(AndexpressionContext.class,0);
		}
		public AndexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterAndexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitAndexpression(this);
		}
	}

	public final AndexpressionContext andexpression() throws RecognitionException {
		return andexpression(0);
	}

	private AndexpressionContext andexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndexpressionContext _localctx = new AndexpressionContext(_ctx, _parentState);
		AndexpressionContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_andexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(891);
			equalityexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(898);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andexpression);
					setState(893);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(894);
					match(And);
					setState(895);
					equalityexpression(0);
					}
					} 
				}
				setState(900);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveorexpressionContext extends ParserRuleContext {
		public AndexpressionContext andexpression() {
			return getRuleContext(AndexpressionContext.class,0);
		}
		public ExclusiveorexpressionContext exclusiveorexpression() {
			return getRuleContext(ExclusiveorexpressionContext.class,0);
		}
		public ExclusiveorexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveorexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterExclusiveorexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitExclusiveorexpression(this);
		}
	}

	public final ExclusiveorexpressionContext exclusiveorexpression() throws RecognitionException {
		return exclusiveorexpression(0);
	}

	private ExclusiveorexpressionContext exclusiveorexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveorexpressionContext _localctx = new ExclusiveorexpressionContext(_ctx, _parentState);
		ExclusiveorexpressionContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_exclusiveorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(902);
			andexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(909);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveorexpression);
					setState(904);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(905);
					match(Caret);
					setState(906);
					andexpression(0);
					}
					} 
				}
				setState(911);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveorexpressionContext extends ParserRuleContext {
		public ExclusiveorexpressionContext exclusiveorexpression() {
			return getRuleContext(ExclusiveorexpressionContext.class,0);
		}
		public InclusiveorexpressionContext inclusiveorexpression() {
			return getRuleContext(InclusiveorexpressionContext.class,0);
		}
		public InclusiveorexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveorexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterInclusiveorexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitInclusiveorexpression(this);
		}
	}

	public final InclusiveorexpressionContext inclusiveorexpression() throws RecognitionException {
		return inclusiveorexpression(0);
	}

	private InclusiveorexpressionContext inclusiveorexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveorexpressionContext _localctx = new InclusiveorexpressionContext(_ctx, _parentState);
		InclusiveorexpressionContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_inclusiveorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(913);
			exclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(920);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveorexpression);
					setState(915);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(916);
					match(Or);
					setState(917);
					exclusiveorexpression(0);
					}
					} 
				}
				setState(922);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalandexpressionContext extends ParserRuleContext {
		public InclusiveorexpressionContext inclusiveorexpression() {
			return getRuleContext(InclusiveorexpressionContext.class,0);
		}
		public LogicalandexpressionContext logicalandexpression() {
			return getRuleContext(LogicalandexpressionContext.class,0);
		}
		public LogicalandexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalandexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterLogicalandexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitLogicalandexpression(this);
		}
	}

	public final LogicalandexpressionContext logicalandexpression() throws RecognitionException {
		return logicalandexpression(0);
	}

	private LogicalandexpressionContext logicalandexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalandexpressionContext _localctx = new LogicalandexpressionContext(_ctx, _parentState);
		LogicalandexpressionContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_logicalandexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(924);
			inclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(931);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalandexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalandexpression);
					setState(926);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(927);
					match(AndAnd);
					setState(928);
					inclusiveorexpression(0);
					}
					} 
				}
				setState(933);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalorexpressionContext extends ParserRuleContext {
		public LogicalandexpressionContext logicalandexpression() {
			return getRuleContext(LogicalandexpressionContext.class,0);
		}
		public LogicalorexpressionContext logicalorexpression() {
			return getRuleContext(LogicalorexpressionContext.class,0);
		}
		public LogicalorexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalorexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterLogicalorexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitLogicalorexpression(this);
		}
	}

	public final LogicalorexpressionContext logicalorexpression() throws RecognitionException {
		return logicalorexpression(0);
	}

	private LogicalorexpressionContext logicalorexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalorexpressionContext _localctx = new LogicalorexpressionContext(_ctx, _parentState);
		LogicalorexpressionContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_logicalorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(935);
			logicalandexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(942);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalorexpression);
					setState(937);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(938);
					match(OrOr);
					setState(939);
					logicalandexpression(0);
					}
					} 
				}
				setState(944);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalexpressionContext extends ParserRuleContext {
		public LogicalorexpressionContext logicalorexpression() {
			return getRuleContext(LogicalorexpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public ConditionalexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterConditionalexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitConditionalexpression(this);
		}
	}

	public final ConditionalexpressionContext conditionalexpression() throws RecognitionException {
		ConditionalexpressionContext _localctx = new ConditionalexpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_conditionalexpression);
		try {
			setState(952);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(945);
				logicalorexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(946);
				logicalorexpression(0);
				setState(947);
				match(Question);
				setState(948);
				expression(0);
				setState(949);
				match(Colon);
				setState(950);
				assignmentexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentexpressionContext extends ParserRuleContext {
		public ConditionalexpressionContext conditionalexpression() {
			return getRuleContext(ConditionalexpressionContext.class,0);
		}
		public LogicalorexpressionContext logicalorexpression() {
			return getRuleContext(LogicalorexpressionContext.class,0);
		}
		public AssignmentoperatorContext assignmentoperator() {
			return getRuleContext(AssignmentoperatorContext.class,0);
		}
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public ThrowexpressionContext throwexpression() {
			return getRuleContext(ThrowexpressionContext.class,0);
		}
		public AssignmentexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterAssignmentexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitAssignmentexpression(this);
		}
	}

	public final AssignmentexpressionContext assignmentexpression() throws RecognitionException {
		AssignmentexpressionContext _localctx = new AssignmentexpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_assignmentexpression);
		try {
			setState(960);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(954);
				conditionalexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(955);
				logicalorexpression(0);
				setState(956);
				assignmentoperator();
				setState(957);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(959);
				throwexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentoperatorContext extends ParserRuleContext {
		public RightShiftAssignContext rightShiftAssign() {
			return getRuleContext(RightShiftAssignContext.class,0);
		}
		public AssignmentoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterAssignmentoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitAssignmentoperator(this);
		}
	}

	public final AssignmentoperatorContext assignmentoperator() throws RecognitionException {
		AssignmentoperatorContext _localctx = new AssignmentoperatorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_assignmentoperator);
		try {
			setState(973);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(962);
				match(Assign);
				}
				break;
			case StarAssign:
				enterOuterAlt(_localctx, 2);
				{
				setState(963);
				match(StarAssign);
				}
				break;
			case DivAssign:
				enterOuterAlt(_localctx, 3);
				{
				setState(964);
				match(DivAssign);
				}
				break;
			case ModAssign:
				enterOuterAlt(_localctx, 4);
				{
				setState(965);
				match(ModAssign);
				}
				break;
			case PlusAssign:
				enterOuterAlt(_localctx, 5);
				{
				setState(966);
				match(PlusAssign);
				}
				break;
			case MinusAssign:
				enterOuterAlt(_localctx, 6);
				{
				setState(967);
				match(MinusAssign);
				}
				break;
			case Greater:
				enterOuterAlt(_localctx, 7);
				{
				setState(968);
				rightShiftAssign();
				}
				break;
			case LeftShiftAssign:
				enterOuterAlt(_localctx, 8);
				{
				setState(969);
				match(LeftShiftAssign);
				}
				break;
			case AndAssign:
				enterOuterAlt(_localctx, 9);
				{
				setState(970);
				match(AndAssign);
				}
				break;
			case XorAssign:
				enterOuterAlt(_localctx, 10);
				{
				setState(971);
				match(XorAssign);
				}
				break;
			case OrAssign:
				enterOuterAlt(_localctx, 11);
				{
				setState(972);
				match(OrAssign);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(976);
			assignmentexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(983);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(978);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(979);
					match(Comma);
					setState(980);
					assignmentexpression();
					}
					} 
				}
				setState(985);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantexpressionContext extends ParserRuleContext {
		public ConditionalexpressionContext conditionalexpression() {
			return getRuleContext(ConditionalexpressionContext.class,0);
		}
		public ConstantexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterConstantexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitConstantexpression(this);
		}
	}

	public final ConstantexpressionContext constantexpression() throws RecognitionException {
		ConstantexpressionContext _localctx = new ConstantexpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_constantexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			conditionalexpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public LabeledstatementContext labeledstatement() {
			return getRuleContext(LabeledstatementContext.class,0);
		}
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public SelectionstatementContext selectionstatement() {
			return getRuleContext(SelectionstatementContext.class,0);
		}
		public IterationstatementContext iterationstatement() {
			return getRuleContext(IterationstatementContext.class,0);
		}
		public JumpstatementContext jumpstatement() {
			return getRuleContext(JumpstatementContext.class,0);
		}
		public DeclarationstatementContext declarationstatement() {
			return getRuleContext(DeclarationstatementContext.class,0);
		}
		public TryblockContext tryblock() {
			return getRuleContext(TryblockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_statement);
		int _la;
		try {
			setState(1014);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(988);
				labeledstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(990);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(989);
					attributespecifierseq(0);
					}
					break;
				}
				setState(992);
				expressionstatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(994);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(993);
					attributespecifierseq(0);
					}
				}

				setState(996);
				compoundstatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(998);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(997);
					attributespecifierseq(0);
					}
				}

				setState(1000);
				selectionstatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1002);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1001);
					attributespecifierseq(0);
					}
				}

				setState(1004);
				iterationstatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1006);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1005);
					attributespecifierseq(0);
					}
				}

				setState(1008);
				jumpstatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1009);
				declarationstatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1011);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1010);
					attributespecifierseq(0);
					}
				}

				setState(1013);
				tryblock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledstatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(NGCParser.Identifier, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TerminalNode Case() { return getToken(NGCParser.Case, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public TerminalNode Default() { return getToken(NGCParser.Default, 0); }
		public LabeledstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterLabeledstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitLabeledstatement(this);
		}
	}

	public final LabeledstatementContext labeledstatement() throws RecognitionException {
		LabeledstatementContext _localctx = new LabeledstatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_labeledstatement);
		int _la;
		try {
			setState(1036);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1017);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1016);
					attributespecifierseq(0);
					}
				}

				setState(1019);
				match(Identifier);
				setState(1020);
				match(Colon);
				setState(1021);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1023);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1022);
					attributespecifierseq(0);
					}
				}

				setState(1025);
				match(Case);
				setState(1026);
				constantexpression();
				setState(1027);
				match(Colon);
				setState(1028);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1031);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1030);
					attributespecifierseq(0);
					}
				}

				setState(1033);
				match(Default);
				setState(1034);
				match(Colon);
				setState(1035);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionstatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterExpressionstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitExpressionstatement(this);
		}
	}

	public final ExpressionstatementContext expressionstatement() throws RecognitionException {
		ExpressionstatementContext _localctx = new ExpressionstatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_expressionstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1039);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (True - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
				{
				setState(1038);
				expression(0);
				}
			}

			setState(1041);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundstatementContext extends ParserRuleContext {
		public StatementseqContext statementseq() {
			return getRuleContext(StatementseqContext.class,0);
		}
		public CompoundstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterCompoundstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitCompoundstatement(this);
		}
	}

	public final CompoundstatementContext compoundstatement() throws RecognitionException {
		CompoundstatementContext _localctx = new CompoundstatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_compoundstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043);
			match(LeftBrace);
			setState(1045);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Alignof) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Decltype) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << False) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Static_assert) | (1L << Static_cast) | (1L << Struct) | (1L << Switch) | (1L << This) | (1L << Thread_local) | (1L << Throw))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (True - 64)) | (1L << (Try - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (While - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (AndAnd - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Semi - 64)) | (1L << (Ellipsis - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
				{
				setState(1044);
				statementseq(0);
				}
			}

			setState(1047);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementseqContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementseqContext statementseq() {
			return getRuleContext(StatementseqContext.class,0);
		}
		public StatementseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterStatementseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitStatementseq(this);
		}
	}

	public final StatementseqContext statementseq() throws RecognitionException {
		return statementseq(0);
	}

	private StatementseqContext statementseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementseqContext _localctx = new StatementseqContext(_ctx, _parentState);
		StatementseqContext _prevctx = _localctx;
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_statementseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1050);
			statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(1056);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statementseq);
					setState(1052);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1053);
					statement();
					}
					} 
				}
				setState(1058);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SelectionstatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(NGCParser.If, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(NGCParser.Else, 0); }
		public TerminalNode Switch() { return getToken(NGCParser.Switch, 0); }
		public Ngc_selectionstatementContext ngc_selectionstatement() {
			return getRuleContext(Ngc_selectionstatementContext.class,0);
		}
		public SelectionstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterSelectionstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitSelectionstatement(this);
		}
	}

	public final SelectionstatementContext selectionstatement() throws RecognitionException {
		SelectionstatementContext _localctx = new SelectionstatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_selectionstatement);
		try {
			setState(1080);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1059);
				match(If);
				setState(1060);
				match(LeftParen);
				setState(1061);
				condition();
				setState(1062);
				match(RightParen);
				setState(1063);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1065);
				match(If);
				setState(1066);
				match(LeftParen);
				setState(1067);
				condition();
				setState(1068);
				match(RightParen);
				setState(1069);
				statement();
				setState(1070);
				match(Else);
				setState(1071);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1073);
				match(Switch);
				setState(1074);
				match(LeftParen);
				setState(1075);
				condition();
				setState(1076);
				match(RightParen);
				setState(1077);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1079);
				ngc_selectionstatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ngc_selectionstatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(NGCParser.If, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(NGCParser.Else, 0); }
		public Ngc_selectionstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngc_selectionstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterNgc_selectionstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitNgc_selectionstatement(this);
		}
	}

	public final Ngc_selectionstatementContext ngc_selectionstatement() throws RecognitionException {
		Ngc_selectionstatementContext _localctx = new Ngc_selectionstatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_ngc_selectionstatement);
		try {
			setState(1096);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1082);
				match(If);
				setState(1083);
				match(Less);
				setState(1084);
				condition();
				setState(1085);
				match(Greater);
				setState(1086);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1088);
				match(If);
				setState(1089);
				match(Less);
				setState(1090);
				condition();
				setState(1091);
				match(Greater);
				setState(1092);
				statement();
				setState(1093);
				match(Else);
				setState(1094);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_condition);
		int _la;
		try {
			setState(1114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1098);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1100);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1099);
					attributespecifierseq(0);
					}
				}

				setState(1102);
				declspecifierseq();
				setState(1103);
				declarator();
				setState(1104);
				match(Assign);
				setState(1105);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1108);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1107);
					attributespecifierseq(0);
					}
				}

				setState(1110);
				declspecifierseq();
				setState(1111);
				declarator();
				setState(1112);
				bracedinitlist();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationstatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(NGCParser.While, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Do() { return getToken(NGCParser.Do, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode For() { return getToken(NGCParser.For, 0); }
		public ForinitstatementContext forinitstatement() {
			return getRuleContext(ForinitstatementContext.class,0);
		}
		public ForrangedeclarationContext forrangedeclaration() {
			return getRuleContext(ForrangedeclarationContext.class,0);
		}
		public ForrangeinitializerContext forrangeinitializer() {
			return getRuleContext(ForrangeinitializerContext.class,0);
		}
		public IterationstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterIterationstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitIterationstatement(this);
		}
	}

	public final IterationstatementContext iterationstatement() throws RecognitionException {
		IterationstatementContext _localctx = new IterationstatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_iterationstatement);
		int _la;
		try {
			setState(1151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1116);
				match(While);
				setState(1117);
				match(LeftParen);
				setState(1118);
				condition();
				setState(1119);
				match(RightParen);
				setState(1120);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1122);
				match(Do);
				setState(1123);
				statement();
				setState(1124);
				match(While);
				setState(1125);
				match(LeftParen);
				setState(1126);
				expression(0);
				setState(1127);
				match(RightParen);
				setState(1128);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1130);
				match(For);
				setState(1131);
				match(LeftParen);
				setState(1132);
				forinitstatement();
				setState(1134);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << False) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Static_cast) | (1L << Struct) | (1L << This) | (1L << Thread_local) | (1L << Throw))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (True - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(1133);
					condition();
					}
				}

				setState(1136);
				match(Semi);
				setState(1138);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (True - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(1137);
					expression(0);
					}
				}

				setState(1140);
				match(RightParen);
				setState(1141);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1143);
				match(For);
				setState(1144);
				match(LeftParen);
				setState(1145);
				forrangedeclaration();
				setState(1146);
				match(Colon);
				setState(1147);
				forrangeinitializer();
				setState(1148);
				match(RightParen);
				setState(1149);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForinitstatementContext extends ParserRuleContext {
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public SimpledeclarationContext simpledeclaration() {
			return getRuleContext(SimpledeclarationContext.class,0);
		}
		public ForinitstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forinitstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterForinitstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitForinitstatement(this);
		}
	}

	public final ForinitstatementContext forinitstatement() throws RecognitionException {
		ForinitstatementContext _localctx = new ForinitstatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_forinitstatement);
		try {
			setState(1155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1153);
				expressionstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1154);
				simpledeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForrangedeclarationContext extends ParserRuleContext {
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public ForrangedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forrangedeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterForrangedeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitForrangedeclaration(this);
		}
	}

	public final ForrangedeclarationContext forrangedeclaration() throws RecognitionException {
		ForrangedeclarationContext _localctx = new ForrangedeclarationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_forrangedeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1158);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1157);
				attributespecifierseq(0);
				}
			}

			setState(1160);
			declspecifierseq();
			setState(1161);
			declarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForrangeinitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public ForrangeinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forrangeinitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterForrangeinitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitForrangeinitializer(this);
		}
	}

	public final ForrangeinitializerContext forrangeinitializer() throws RecognitionException {
		ForrangeinitializerContext _localctx = new ForrangeinitializerContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_forrangeinitializer);
		try {
			setState(1165);
			switch (_input.LA(1)) {
			case Alignof:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Const_cast:
			case Decltype:
			case Delete:
			case Double:
			case Dynamic_cast:
			case False:
			case Float:
			case Int:
			case Long:
			case New:
			case Noexcept:
			case Nullptr:
			case Operator:
			case Reinterpret_cast:
			case Short:
			case Signed:
			case Sizeof:
			case Static_cast:
			case This:
			case Throw:
			case True:
			case Typeid:
			case Typename:
			case Unsigned:
			case Void:
			case Wchar:
			case LeftParen:
			case LeftBracket:
			case Plus:
			case Minus:
			case Star:
			case And:
			case Or:
			case Tilde:
			case Not:
			case PlusPlus:
			case MinusMinus:
			case Doublecolon:
			case Identifier:
			case Integerliteral:
			case Characterliteral:
			case Floatingliteral:
			case Stringliteral:
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1163);
				expression(0);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1164);
				bracedinitlist();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JumpstatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(NGCParser.Break, 0); }
		public TerminalNode Continue() { return getToken(NGCParser.Continue, 0); }
		public TerminalNode Return() { return getToken(NGCParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public TerminalNode Goto() { return getToken(NGCParser.Goto, 0); }
		public TerminalNode Identifier() { return getToken(NGCParser.Identifier, 0); }
		public JumpstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterJumpstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitJumpstatement(this);
		}
	}

	public final JumpstatementContext jumpstatement() throws RecognitionException {
		JumpstatementContext _localctx = new JumpstatementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_jumpstatement);
		int _la;
		try {
			setState(1183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1167);
				match(Break);
				setState(1168);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1169);
				match(Continue);
				setState(1170);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1171);
				match(Return);
				setState(1173);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (True - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(1172);
					expression(0);
					}
				}

				setState(1175);
				match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1176);
				match(Return);
				setState(1177);
				bracedinitlist();
				setState(1178);
				match(Semi);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1180);
				match(Goto);
				setState(1181);
				match(Identifier);
				setState(1182);
				match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationstatementContext extends ParserRuleContext {
		public BlockdeclarationContext blockdeclaration() {
			return getRuleContext(BlockdeclarationContext.class,0);
		}
		public DeclarationstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterDeclarationstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitDeclarationstatement(this);
		}
	}

	public final DeclarationstatementContext declarationstatement() throws RecognitionException {
		DeclarationstatementContext _localctx = new DeclarationstatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_declarationstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1185);
			blockdeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationseqContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public DeclarationseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterDeclarationseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitDeclarationseq(this);
		}
	}

	public final DeclarationseqContext declarationseq() throws RecognitionException {
		return declarationseq(0);
	}

	private DeclarationseqContext declarationseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclarationseqContext _localctx = new DeclarationseqContext(_ctx, _parentState);
		DeclarationseqContext _prevctx = _localctx;
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_declarationseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1188);
			declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declarationseq);
					setState(1190);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1191);
					declaration();
					}
					} 
				}
				setState(1196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public BlockdeclarationContext blockdeclaration() {
			return getRuleContext(BlockdeclarationContext.class,0);
		}
		public FunctiondefinitionContext functiondefinition() {
			return getRuleContext(FunctiondefinitionContext.class,0);
		}
		public TemplatedeclarationContext templatedeclaration() {
			return getRuleContext(TemplatedeclarationContext.class,0);
		}
		public ExplicitinstantiationContext explicitinstantiation() {
			return getRuleContext(ExplicitinstantiationContext.class,0);
		}
		public ExplicitspecializationContext explicitspecialization() {
			return getRuleContext(ExplicitspecializationContext.class,0);
		}
		public LinkagespecificationContext linkagespecification() {
			return getRuleContext(LinkagespecificationContext.class,0);
		}
		public NamespacedefinitionContext namespacedefinition() {
			return getRuleContext(NamespacedefinitionContext.class,0);
		}
		public EmptydeclarationContext emptydeclaration() {
			return getRuleContext(EmptydeclarationContext.class,0);
		}
		public AttributedeclarationContext attributedeclaration() {
			return getRuleContext(AttributedeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_declaration);
		try {
			setState(1206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1197);
				blockdeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1198);
				functiondefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1199);
				templatedeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1200);
				explicitinstantiation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1201);
				explicitspecialization();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1202);
				linkagespecification();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1203);
				namespacedefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1204);
				emptydeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1205);
				attributedeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockdeclarationContext extends ParserRuleContext {
		public SimpledeclarationContext simpledeclaration() {
			return getRuleContext(SimpledeclarationContext.class,0);
		}
		public AsmdefinitionContext asmdefinition() {
			return getRuleContext(AsmdefinitionContext.class,0);
		}
		public NamespacealiasdefinitionContext namespacealiasdefinition() {
			return getRuleContext(NamespacealiasdefinitionContext.class,0);
		}
		public UsingdeclarationContext usingdeclaration() {
			return getRuleContext(UsingdeclarationContext.class,0);
		}
		public UsingdirectiveContext usingdirective() {
			return getRuleContext(UsingdirectiveContext.class,0);
		}
		public Static_assertdeclarationContext static_assertdeclaration() {
			return getRuleContext(Static_assertdeclarationContext.class,0);
		}
		public AliasdeclarationContext aliasdeclaration() {
			return getRuleContext(AliasdeclarationContext.class,0);
		}
		public OpaqueenumdeclarationContext opaqueenumdeclaration() {
			return getRuleContext(OpaqueenumdeclarationContext.class,0);
		}
		public BlockdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterBlockdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitBlockdeclaration(this);
		}
	}

	public final BlockdeclarationContext blockdeclaration() throws RecognitionException {
		BlockdeclarationContext _localctx = new BlockdeclarationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_blockdeclaration);
		try {
			setState(1216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1208);
				simpledeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1209);
				asmdefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1210);
				namespacealiasdefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1211);
				usingdeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1212);
				usingdirective();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1213);
				static_assertdeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1214);
				aliasdeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1215);
				opaqueenumdeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasdeclarationContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(NGCParser.Using, 0); }
		public TerminalNode Identifier() { return getToken(NGCParser.Identifier, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public AliasdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterAliasdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitAliasdeclaration(this);
		}
	}

	public final AliasdeclarationContext aliasdeclaration() throws RecognitionException {
		AliasdeclarationContext _localctx = new AliasdeclarationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_aliasdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1218);
			match(Using);
			setState(1219);
			match(Identifier);
			setState(1221);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1220);
				attributespecifierseq(0);
				}
			}

			setState(1223);
			match(Assign);
			setState(1224);
			typeid();
			setState(1225);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpledeclarationContext extends ParserRuleContext {
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public InitdeclaratorlistContext initdeclaratorlist() {
			return getRuleContext(InitdeclaratorlistContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public SimpledeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpledeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterSimpledeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitSimpledeclaration(this);
		}
	}

	public final SimpledeclarationContext simpledeclaration() throws RecognitionException {
		SimpledeclarationContext _localctx = new SimpledeclarationContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_simpledeclaration);
		int _la;
		try {
			setState(1241);
			switch (_input.LA(1)) {
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Constexpr:
			case Decltype:
			case Double:
			case Enum:
			case Explicit:
			case Extern:
			case Float:
			case Friend:
			case Inline:
			case Int:
			case Long:
			case Mutable:
			case Operator:
			case Register:
			case Short:
			case Signed:
			case Static:
			case Struct:
			case Thread_local:
			case Typedef:
			case Typename:
			case Union:
			case Unsigned:
			case Virtual:
			case Void:
			case Volatile:
			case Wchar:
			case LeftParen:
			case Star:
			case And:
			case Tilde:
			case AndAnd:
			case Doublecolon:
			case Semi:
			case Ellipsis:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1228);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(1227);
					declspecifierseq();
					}
					break;
				}
				setState(1231);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Operator || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (LeftParen - 77)) | (1L << (Star - 77)) | (1L << (And - 77)) | (1L << (Tilde - 77)) | (1L << (AndAnd - 77)) | (1L << (Doublecolon - 77)) | (1L << (Ellipsis - 77)) | (1L << (Identifier - 77)))) != 0)) {
					{
					setState(1230);
					initdeclaratorlist(0);
					}
				}

				setState(1233);
				match(Semi);
				}
				break;
			case Alignas:
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1234);
				attributespecifierseq(0);
				setState(1236);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(1235);
					declspecifierseq();
					}
					break;
				}
				setState(1238);
				initdeclaratorlist(0);
				setState(1239);
				match(Semi);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Static_assertdeclarationContext extends ParserRuleContext {
		public TerminalNode Static_assert() { return getToken(NGCParser.Static_assert, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public TerminalNode Stringliteral() { return getToken(NGCParser.Stringliteral, 0); }
		public Static_assertdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static_assertdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterStatic_assertdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitStatic_assertdeclaration(this);
		}
	}

	public final Static_assertdeclarationContext static_assertdeclaration() throws RecognitionException {
		Static_assertdeclarationContext _localctx = new Static_assertdeclarationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_static_assertdeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243);
			match(Static_assert);
			setState(1244);
			match(LeftParen);
			setState(1245);
			constantexpression();
			setState(1246);
			match(Comma);
			setState(1247);
			match(Stringliteral);
			setState(1248);
			match(RightParen);
			setState(1249);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptydeclarationContext extends ParserRuleContext {
		public EmptydeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptydeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterEmptydeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitEmptydeclaration(this);
		}
	}

	public final EmptydeclarationContext emptydeclaration() throws RecognitionException {
		EmptydeclarationContext _localctx = new EmptydeclarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_emptydeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributedeclarationContext extends ParserRuleContext {
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public AttributedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributedeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterAttributedeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitAttributedeclaration(this);
		}
	}

	public final AttributedeclarationContext attributedeclaration() throws RecognitionException {
		AttributedeclarationContext _localctx = new AttributedeclarationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_attributedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1253);
			attributespecifierseq(0);
			setState(1254);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclspecifierContext extends ParserRuleContext {
		public StorageclassspecifierContext storageclassspecifier() {
			return getRuleContext(StorageclassspecifierContext.class,0);
		}
		public TypespecifierContext typespecifier() {
			return getRuleContext(TypespecifierContext.class,0);
		}
		public FunctionspecifierContext functionspecifier() {
			return getRuleContext(FunctionspecifierContext.class,0);
		}
		public TerminalNode Friend() { return getToken(NGCParser.Friend, 0); }
		public TerminalNode Typedef() { return getToken(NGCParser.Typedef, 0); }
		public TerminalNode Constexpr() { return getToken(NGCParser.Constexpr, 0); }
		public DeclspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterDeclspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitDeclspecifier(this);
		}
	}

	public final DeclspecifierContext declspecifier() throws RecognitionException {
		DeclspecifierContext _localctx = new DeclspecifierContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_declspecifier);
		try {
			setState(1262);
			switch (_input.LA(1)) {
			case Extern:
			case Mutable:
			case Register:
			case Static:
			case Thread_local:
				enterOuterAlt(_localctx, 1);
				{
				setState(1256);
				storageclassspecifier();
				}
				break;
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Decltype:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Struct:
			case Typename:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Wchar:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1257);
				typespecifier();
				}
				break;
			case Explicit:
			case Inline:
			case Virtual:
				enterOuterAlt(_localctx, 3);
				{
				setState(1258);
				functionspecifier();
				}
				break;
			case Friend:
				enterOuterAlt(_localctx, 4);
				{
				setState(1259);
				match(Friend);
				}
				break;
			case Typedef:
				enterOuterAlt(_localctx, 5);
				{
				setState(1260);
				match(Typedef);
				}
				break;
			case Constexpr:
				enterOuterAlt(_localctx, 6);
				{
				setState(1261);
				match(Constexpr);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclspecifierseqContext extends ParserRuleContext {
		public DeclspecifierContext declspecifier() {
			return getRuleContext(DeclspecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public DeclspecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declspecifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterDeclspecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitDeclspecifierseq(this);
		}
	}

	public final DeclspecifierseqContext declspecifierseq() throws RecognitionException {
		DeclspecifierseqContext _localctx = new DeclspecifierseqContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_declspecifierseq);
		try {
			setState(1271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1264);
				declspecifier();
				setState(1266);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(1265);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1268);
				declspecifier();
				setState(1269);
				declspecifierseq();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageclassspecifierContext extends ParserRuleContext {
		public TerminalNode Register() { return getToken(NGCParser.Register, 0); }
		public TerminalNode Static() { return getToken(NGCParser.Static, 0); }
		public TerminalNode Thread_local() { return getToken(NGCParser.Thread_local, 0); }
		public TerminalNode Extern() { return getToken(NGCParser.Extern, 0); }
		public TerminalNode Mutable() { return getToken(NGCParser.Mutable, 0); }
		public StorageclassspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageclassspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterStorageclassspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitStorageclassspecifier(this);
		}
	}

	public final StorageclassspecifierContext storageclassspecifier() throws RecognitionException {
		StorageclassspecifierContext _localctx = new StorageclassspecifierContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_storageclassspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1273);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Extern) | (1L << Mutable) | (1L << Register) | (1L << Static) | (1L << Thread_local))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionspecifierContext extends ParserRuleContext {
		public TerminalNode Inline() { return getToken(NGCParser.Inline, 0); }
		public TerminalNode Virtual() { return getToken(NGCParser.Virtual, 0); }
		public TerminalNode Explicit() { return getToken(NGCParser.Explicit, 0); }
		public FunctionspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterFunctionspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitFunctionspecifier(this);
		}
	}

	public final FunctionspecifierContext functionspecifier() throws RecognitionException {
		FunctionspecifierContext _localctx = new FunctionspecifierContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_functionspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1275);
			_la = _input.LA(1);
			if ( !(((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (Explicit - 26)) | (1L << (Inline - 26)) | (1L << (Virtual - 26)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedefnameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(NGCParser.Identifier, 0); }
		public TypedefnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterTypedefname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitTypedefname(this);
		}
	}

	public final TypedefnameContext typedefname() throws RecognitionException {
		TypedefnameContext _localctx = new TypedefnameContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_typedefname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1277);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypespecifierContext extends ParserRuleContext {
		public TrailingtypespecifierContext trailingtypespecifier() {
			return getRuleContext(TrailingtypespecifierContext.class,0);
		}
		public ClassspecifierContext classspecifier() {
			return getRuleContext(ClassspecifierContext.class,0);
		}
		public EnumspecifierContext enumspecifier() {
			return getRuleContext(EnumspecifierContext.class,0);
		}
		public TypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterTypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitTypespecifier(this);
		}
	}

	public final TypespecifierContext typespecifier() throws RecognitionException {
		TypespecifierContext _localctx = new TypespecifierContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_typespecifier);
		try {
			setState(1282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1279);
				trailingtypespecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1280);
				classspecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1281);
				enumspecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrailingtypespecifierContext extends ParserRuleContext {
		public SimpletypespecifierContext simpletypespecifier() {
			return getRuleContext(SimpletypespecifierContext.class,0);
		}
		public ElaboratedtypespecifierContext elaboratedtypespecifier() {
			return getRuleContext(ElaboratedtypespecifierContext.class,0);
		}
		public TypenamespecifierContext typenamespecifier() {
			return getRuleContext(TypenamespecifierContext.class,0);
		}
		public CvqualifierContext cvqualifier() {
			return getRuleContext(CvqualifierContext.class,0);
		}
		public TrailingtypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingtypespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterTrailingtypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitTrailingtypespecifier(this);
		}
	}

	public final TrailingtypespecifierContext trailingtypespecifier() throws RecognitionException {
		TrailingtypespecifierContext _localctx = new TrailingtypespecifierContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_trailingtypespecifier);
		try {
			setState(1288);
			switch (_input.LA(1)) {
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Decltype:
			case Double:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Unsigned:
			case Void:
			case Wchar:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1284);
				simpletypespecifier();
				}
				break;
			case Class:
			case Enum:
			case Struct:
			case Union:
				enterOuterAlt(_localctx, 2);
				{
				setState(1285);
				elaboratedtypespecifier();
				}
				break;
			case Typename:
				enterOuterAlt(_localctx, 3);
				{
				setState(1286);
				typenamespecifier();
				}
				break;
			case Const:
			case Volatile:
				enterOuterAlt(_localctx, 4);
				{
				setState(1287);
				cvqualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypespecifierseqContext extends ParserRuleContext {
		public TypespecifierContext typespecifier() {
			return getRuleContext(TypespecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public TypespecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typespecifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterTypespecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitTypespecifierseq(this);
		}
	}

	public final TypespecifierseqContext typespecifierseq() throws RecognitionException {
		TypespecifierseqContext _localctx = new TypespecifierseqContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_typespecifierseq);
		try {
			setState(1297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1290);
				typespecifier();
				setState(1292);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(1291);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1294);
				typespecifier();
				setState(1295);
				typespecifierseq();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrailingtypespecifierseqContext extends ParserRuleContext {
		public TrailingtypespecifierContext trailingtypespecifier() {
			return getRuleContext(TrailingtypespecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TrailingtypespecifierseqContext trailingtypespecifierseq() {
			return getRuleContext(TrailingtypespecifierseqContext.class,0);
		}
		public TrailingtypespecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingtypespecifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterTrailingtypespecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitTrailingtypespecifierseq(this);
		}
	}

	public final TrailingtypespecifierseqContext trailingtypespecifierseq() throws RecognitionException {
		TrailingtypespecifierseqContext _localctx = new TrailingtypespecifierseqContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_trailingtypespecifierseq);
		try {
			setState(1306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1299);
				trailingtypespecifier();
				setState(1301);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(1300);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1303);
				trailingtypespecifier();
				setState(1304);
				trailingtypespecifierseq();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpletypespecifierContext extends ParserRuleContext {
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public TerminalNode Template() { return getToken(NGCParser.Template, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TerminalNode Char() { return getToken(NGCParser.Char, 0); }
		public TerminalNode Char16() { return getToken(NGCParser.Char16, 0); }
		public TerminalNode Char32() { return getToken(NGCParser.Char32, 0); }
		public TerminalNode Wchar() { return getToken(NGCParser.Wchar, 0); }
		public TerminalNode Bool() { return getToken(NGCParser.Bool, 0); }
		public TerminalNode Short() { return getToken(NGCParser.Short, 0); }
		public TerminalNode Int() { return getToken(NGCParser.Int, 0); }
		public TerminalNode Long() { return getToken(NGCParser.Long, 0); }
		public TerminalNode Signed() { return getToken(NGCParser.Signed, 0); }
		public TerminalNode Unsigned() { return getToken(NGCParser.Unsigned, 0); }
		public TerminalNode Float() { return getToken(NGCParser.Float, 0); }
		public TerminalNode Double() { return getToken(NGCParser.Double, 0); }
		public TerminalNode Void() { return getToken(NGCParser.Void, 0); }
		public TerminalNode Auto() { return getToken(NGCParser.Auto, 0); }
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public SimpletypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpletypespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterSimpletypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitSimpletypespecifier(this);
		}
	}

	public final SimpletypespecifierContext simpletypespecifier() throws RecognitionException {
		SimpletypespecifierContext _localctx = new SimpletypespecifierContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_simpletypespecifier);
		try {
			setState(1331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1309);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(1308);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1311);
				typename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1312);
				nestednamespecifier(0);
				setState(1313);
				match(Template);
				setState(1314);
				simpletemplateid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1316);
				match(Char);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1317);
				match(Char16);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1318);
				match(Char32);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1319);
				match(Wchar);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1320);
				match(Bool);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1321);
				match(Short);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1322);
				match(Int);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1323);
				match(Long);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1324);
				match(Signed);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1325);
				match(Unsigned);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1326);
				match(Float);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1327);
				match(Double);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1328);
				match(Void);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1329);
				match(Auto);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1330);
				decltypespecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypenameContext extends ParserRuleContext {
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public EnumnameContext enumname() {
			return getRuleContext(EnumnameContext.class,0);
		}
		public TypedefnameContext typedefname() {
			return getRuleContext(TypedefnameContext.class,0);
		}
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TypenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterTypename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitTypename(this);
		}
	}

	public final TypenameContext typename() throws RecognitionException {
		TypenameContext _localctx = new TypenameContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_typename);
		try {
			setState(1337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1333);
				classname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1334);
				enumname();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1335);
				typedefname();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1336);
				simpletemplateid();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecltypespecifierContext extends ParserRuleContext {
		public TerminalNode Decltype() { return getToken(NGCParser.Decltype, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Auto() { return getToken(NGCParser.Auto, 0); }
		public DecltypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decltypespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterDecltypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitDecltypespecifier(this);
		}
	}

	public final DecltypespecifierContext decltypespecifier() throws RecognitionException {
		DecltypespecifierContext _localctx = new DecltypespecifierContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_decltypespecifier);
		try {
			setState(1348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1339);
				match(Decltype);
				setState(1340);
				match(LeftParen);
				setState(1341);
				expression(0);
				setState(1342);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1344);
				match(Decltype);
				setState(1345);
				match(LeftParen);
				setState(1346);
				match(Auto);
				setState(1347);
				match(RightParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElaboratedtypespecifierContext extends ParserRuleContext {
		public ClasskeyContext classkey() {
			return getRuleContext(ClasskeyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(NGCParser.Identifier, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TerminalNode Template() { return getToken(NGCParser.Template, 0); }
		public TerminalNode Enum() { return getToken(NGCParser.Enum, 0); }
		public ElaboratedtypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elaboratedtypespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterElaboratedtypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitElaboratedtypespecifier(this);
		}
	}

	public final ElaboratedtypespecifierContext elaboratedtypespecifier() throws RecognitionException {
		ElaboratedtypespecifierContext _localctx = new ElaboratedtypespecifierContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_elaboratedtypespecifier);
		int _la;
		try {
			setState(1374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1350);
				classkey();
				setState(1352);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1351);
					attributespecifierseq(0);
					}
				}

				setState(1355);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(1354);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1357);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1359);
				classkey();
				setState(1360);
				simpletemplateid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1362);
				classkey();
				setState(1363);
				nestednamespecifier(0);
				setState(1365);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(1364);
					match(Template);
					}
				}

				setState(1367);
				simpletemplateid();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1369);
				match(Enum);
				setState(1371);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1370);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1373);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumnameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(NGCParser.Identifier, 0); }
		public EnumnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterEnumname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitEnumname(this);
		}
	}

	public final EnumnameContext enumname() throws RecognitionException {
		EnumnameContext _localctx = new EnumnameContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_enumname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1376);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumspecifierContext extends ParserRuleContext {
		public EnumheadContext enumhead() {
			return getRuleContext(EnumheadContext.class,0);
		}
		public EnumeratorlistContext enumeratorlist() {
			return getRuleContext(EnumeratorlistContext.class,0);
		}
		public EnumspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterEnumspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitEnumspecifier(this);
		}
	}

	public final EnumspecifierContext enumspecifier() throws RecognitionException {
		EnumspecifierContext _localctx = new EnumspecifierContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_enumspecifier);
		int _la;
		try {
			setState(1391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1378);
				enumhead();
				setState(1379);
				match(LeftBrace);
				setState(1381);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1380);
					enumeratorlist(0);
					}
				}

				setState(1383);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1385);
				enumhead();
				setState(1386);
				match(LeftBrace);
				setState(1387);
				enumeratorlist(0);
				setState(1388);
				match(Comma);
				setState(1389);
				match(RightBrace);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumheadContext extends ParserRuleContext {
		public EnumkeyContext enumkey() {
			return getRuleContext(EnumkeyContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(NGCParser.Identifier, 0); }
		public EnumbaseContext enumbase() {
			return getRuleContext(EnumbaseContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public EnumheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumhead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterEnumhead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitEnumhead(this);
		}
	}

	public final EnumheadContext enumhead() throws RecognitionException {
		EnumheadContext _localctx = new EnumheadContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_enumhead);
		int _la;
		try {
			setState(1412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1393);
				enumkey();
				setState(1395);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1394);
					attributespecifierseq(0);
					}
				}

				setState(1398);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1397);
					match(Identifier);
					}
				}

				setState(1401);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1400);
					enumbase();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1403);
				enumkey();
				setState(1405);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1404);
					attributespecifierseq(0);
					}
				}

				setState(1407);
				nestednamespecifier(0);
				setState(1408);
				match(Identifier);
				setState(1410);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1409);
					enumbase();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpaqueenumdeclarationContext extends ParserRuleContext {
		public EnumkeyContext enumkey() {
			return getRuleContext(EnumkeyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(NGCParser.Identifier, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public EnumbaseContext enumbase() {
			return getRuleContext(EnumbaseContext.class,0);
		}
		public OpaqueenumdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opaqueenumdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterOpaqueenumdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitOpaqueenumdeclaration(this);
		}
	}

	public final OpaqueenumdeclarationContext opaqueenumdeclaration() throws RecognitionException {
		OpaqueenumdeclarationContext _localctx = new OpaqueenumdeclarationContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_opaqueenumdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1414);
			enumkey();
			setState(1416);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1415);
				attributespecifierseq(0);
				}
			}

			setState(1418);
			match(Identifier);
			setState(1420);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1419);
				enumbase();
				}
			}

			setState(1422);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumkeyContext extends ParserRuleContext {
		public TerminalNode Enum() { return getToken(NGCParser.Enum, 0); }
		public TerminalNode Class() { return getToken(NGCParser.Class, 0); }
		public TerminalNode Struct() { return getToken(NGCParser.Struct, 0); }
		public EnumkeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumkey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterEnumkey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitEnumkey(this);
		}
	}

	public final EnumkeyContext enumkey() throws RecognitionException {
		EnumkeyContext _localctx = new EnumkeyContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_enumkey);
		try {
			setState(1429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1424);
				match(Enum);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1425);
				match(Enum);
				setState(1426);
				match(Class);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1427);
				match(Enum);
				setState(1428);
				match(Struct);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumbaseContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public EnumbaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumbase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterEnumbase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitEnumbase(this);
		}
	}

	public final EnumbaseContext enumbase() throws RecognitionException {
		EnumbaseContext _localctx = new EnumbaseContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_enumbase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1431);
			match(Colon);
			setState(1432);
			typespecifierseq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorlistContext extends ParserRuleContext {
		public EnumeratordefinitionContext enumeratordefinition() {
			return getRuleContext(EnumeratordefinitionContext.class,0);
		}
		public EnumeratorlistContext enumeratorlist() {
			return getRuleContext(EnumeratorlistContext.class,0);
		}
		public EnumeratorlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterEnumeratorlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitEnumeratorlist(this);
		}
	}

	public final EnumeratorlistContext enumeratorlist() throws RecognitionException {
		return enumeratorlist(0);
	}

	private EnumeratorlistContext enumeratorlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EnumeratorlistContext _localctx = new EnumeratorlistContext(_ctx, _parentState);
		EnumeratorlistContext _prevctx = _localctx;
		int _startState = 172;
		enterRecursionRule(_localctx, 172, RULE_enumeratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1435);
			enumeratordefinition();
			}
			_ctx.stop = _input.LT(-1);
			setState(1442);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EnumeratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_enumeratorlist);
					setState(1437);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1438);
					match(Comma);
					setState(1439);
					enumeratordefinition();
					}
					} 
				}
				setState(1444);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EnumeratordefinitionContext extends ParserRuleContext {
		public EnumeratorContext enumerator() {
			return getRuleContext(EnumeratorContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public EnumeratordefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratordefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterEnumeratordefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitEnumeratordefinition(this);
		}
	}

	public final EnumeratordefinitionContext enumeratordefinition() throws RecognitionException {
		EnumeratordefinitionContext _localctx = new EnumeratordefinitionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_enumeratordefinition);
		try {
			setState(1450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1445);
				enumerator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1446);
				enumerator();
				setState(1447);
				match(Assign);
				setState(1448);
				constantexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(NGCParser.Identifier, 0); }
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterEnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitEnumerator(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_enumerator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1452);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespacenameContext extends ParserRuleContext {
		public OriginalnamespacenameContext originalnamespacename() {
			return getRuleContext(OriginalnamespacenameContext.class,0);
		}
		public NamespacealiasContext namespacealias() {
			return getRuleContext(NamespacealiasContext.class,0);
		}
		public NamespacenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterNamespacename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitNamespacename(this);
		}
	}

	public final NamespacenameContext namespacename() throws RecognitionException {
		NamespacenameContext _localctx = new NamespacenameContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_namespacename);
		try {
			setState(1456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1454);
				originalnamespacename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1455);
				namespacealias();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OriginalnamespacenameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(NGCParser.Identifier, 0); }
		public OriginalnamespacenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originalnamespacename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterOriginalnamespacename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitOriginalnamespacename(this);
		}
	}

	public final OriginalnamespacenameContext originalnamespacename() throws RecognitionException {
		OriginalnamespacenameContext _localctx = new OriginalnamespacenameContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_originalnamespacename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1458);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespacedefinitionContext extends ParserRuleContext {
		public NamednamespacedefinitionContext namednamespacedefinition() {
			return getRuleContext(NamednamespacedefinitionContext.class,0);
		}
		public UnnamednamespacedefinitionContext unnamednamespacedefinition() {
			return getRuleContext(UnnamednamespacedefinitionContext.class,0);
		}
		public NamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterNamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitNamespacedefinition(this);
		}
	}

	public final NamespacedefinitionContext namespacedefinition() throws RecognitionException {
		NamespacedefinitionContext _localctx = new NamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_namespacedefinition);
		try {
			setState(1462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1460);
				namednamespacedefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1461);
				unnamednamespacedefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamednamespacedefinitionContext extends ParserRuleContext {
		public OriginalnamespacedefinitionContext originalnamespacedefinition() {
			return getRuleContext(OriginalnamespacedefinitionContext.class,0);
		}
		public ExtensionnamespacedefinitionContext extensionnamespacedefinition() {
			return getRuleContext(ExtensionnamespacedefinitionContext.class,0);
		}
		public NamednamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namednamespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterNamednamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitNamednamespacedefinition(this);
		}
	}

	public final NamednamespacedefinitionContext namednamespacedefinition() throws RecognitionException {
		NamednamespacedefinitionContext _localctx = new NamednamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_namednamespacedefinition);
		try {
			setState(1466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1464);
				originalnamespacedefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1465);
				extensionnamespacedefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OriginalnamespacedefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(NGCParser.Namespace, 0); }
		public TerminalNode Identifier() { return getToken(NGCParser.Identifier, 0); }
		public NamespacebodyContext namespacebody() {
			return getRuleContext(NamespacebodyContext.class,0);
		}
		public TerminalNode Inline() { return getToken(NGCParser.Inline, 0); }
		public OriginalnamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originalnamespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterOriginalnamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitOriginalnamespacedefinition(this);
		}
	}

	public final OriginalnamespacedefinitionContext originalnamespacedefinition() throws RecognitionException {
		OriginalnamespacedefinitionContext _localctx = new OriginalnamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_originalnamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1469);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1468);
				match(Inline);
				}
			}

			setState(1471);
			match(Namespace);
			setState(1472);
			match(Identifier);
			setState(1473);
			match(LeftBrace);
			setState(1474);
			namespacebody();
			setState(1475);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtensionnamespacedefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(NGCParser.Namespace, 0); }
		public OriginalnamespacenameContext originalnamespacename() {
			return getRuleContext(OriginalnamespacenameContext.class,0);
		}
		public NamespacebodyContext namespacebody() {
			return getRuleContext(NamespacebodyContext.class,0);
		}
		public TerminalNode Inline() { return getToken(NGCParser.Inline, 0); }
		public ExtensionnamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionnamespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterExtensionnamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitExtensionnamespacedefinition(this);
		}
	}

	public final ExtensionnamespacedefinitionContext extensionnamespacedefinition() throws RecognitionException {
		ExtensionnamespacedefinitionContext _localctx = new ExtensionnamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_extensionnamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1478);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1477);
				match(Inline);
				}
			}

			setState(1480);
			match(Namespace);
			setState(1481);
			originalnamespacename();
			setState(1482);
			match(LeftBrace);
			setState(1483);
			namespacebody();
			setState(1484);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnnamednamespacedefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(NGCParser.Namespace, 0); }
		public NamespacebodyContext namespacebody() {
			return getRuleContext(NamespacebodyContext.class,0);
		}
		public TerminalNode Inline() { return getToken(NGCParser.Inline, 0); }
		public UnnamednamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unnamednamespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterUnnamednamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitUnnamednamespacedefinition(this);
		}
	}

	public final UnnamednamespacedefinitionContext unnamednamespacedefinition() throws RecognitionException {
		UnnamednamespacedefinitionContext _localctx = new UnnamednamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_unnamednamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1487);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1486);
				match(Inline);
				}
			}

			setState(1489);
			match(Namespace);
			setState(1490);
			match(LeftBrace);
			setState(1491);
			namespacebody();
			setState(1492);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespacebodyContext extends ParserRuleContext {
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public NamespacebodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacebody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterNamespacebody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitNamespacebody(this);
		}
	}

	public final NamespacebodyContext namespacebody() throws RecognitionException {
		NamespacebodyContext _localctx = new NamespacebodyContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_namespacebody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1495);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Using - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Tilde - 66)) | (1L << (AndAnd - 66)) | (1L << (Doublecolon - 66)) | (1L << (Semi - 66)) | (1L << (Ellipsis - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(1494);
				declarationseq(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespacealiasContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(NGCParser.Identifier, 0); }
		public NamespacealiasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacealias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterNamespacealias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitNamespacealias(this);
		}
	}

	public final NamespacealiasContext namespacealias() throws RecognitionException {
		NamespacealiasContext _localctx = new NamespacealiasContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_namespacealias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1497);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespacealiasdefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(NGCParser.Namespace, 0); }
		public TerminalNode Identifier() { return getToken(NGCParser.Identifier, 0); }
		public QualifiednamespacespecifierContext qualifiednamespacespecifier() {
			return getRuleContext(QualifiednamespacespecifierContext.class,0);
		}
		public NamespacealiasdefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacealiasdefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterNamespacealiasdefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitNamespacealiasdefinition(this);
		}
	}

	public final NamespacealiasdefinitionContext namespacealiasdefinition() throws RecognitionException {
		NamespacealiasdefinitionContext _localctx = new NamespacealiasdefinitionContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_namespacealiasdefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1499);
			match(Namespace);
			setState(1500);
			match(Identifier);
			setState(1501);
			match(Assign);
			setState(1502);
			qualifiednamespacespecifier();
			setState(1503);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiednamespacespecifierContext extends ParserRuleContext {
		public NamespacenameContext namespacename() {
			return getRuleContext(NamespacenameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public QualifiednamespacespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiednamespacespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterQualifiednamespacespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitQualifiednamespacespecifier(this);
		}
	}

	public final QualifiednamespacespecifierContext qualifiednamespacespecifier() throws RecognitionException {
		QualifiednamespacespecifierContext _localctx = new QualifiednamespacespecifierContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_qualifiednamespacespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1505);
				nestednamespecifier(0);
				}
				break;
			}
			setState(1508);
			namespacename();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingdeclarationContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(NGCParser.Using, 0); }
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public UnqualifiedidContext unqualifiedid() {
			return getRuleContext(UnqualifiedidContext.class,0);
		}
		public TerminalNode Typename() { return getToken(NGCParser.Typename, 0); }
		public UsingdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterUsingdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitUsingdeclaration(this);
		}
	}

	public final UsingdeclarationContext usingdeclaration() throws RecognitionException {
		UsingdeclarationContext _localctx = new UsingdeclarationContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_usingdeclaration);
		int _la;
		try {
			setState(1523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1510);
				match(Using);
				setState(1512);
				_la = _input.LA(1);
				if (_la==Typename) {
					{
					setState(1511);
					match(Typename);
					}
				}

				setState(1514);
				nestednamespecifier(0);
				setState(1515);
				unqualifiedid();
				setState(1516);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1518);
				match(Using);
				setState(1519);
				match(Doublecolon);
				setState(1520);
				unqualifiedid();
				setState(1521);
				match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingdirectiveContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(NGCParser.Using, 0); }
		public TerminalNode Namespace() { return getToken(NGCParser.Namespace, 0); }
		public NamespacenameContext namespacename() {
			return getRuleContext(NamespacenameContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public UsingdirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingdirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterUsingdirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitUsingdirective(this);
		}
	}

	public final UsingdirectiveContext usingdirective() throws RecognitionException {
		UsingdirectiveContext _localctx = new UsingdirectiveContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_usingdirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1526);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1525);
				attributespecifierseq(0);
				}
			}

			setState(1528);
			match(Using);
			setState(1529);
			match(Namespace);
			setState(1531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				{
				setState(1530);
				nestednamespecifier(0);
				}
				break;
			}
			setState(1533);
			namespacename();
			setState(1534);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsmdefinitionContext extends ParserRuleContext {
		public TerminalNode Asm() { return getToken(NGCParser.Asm, 0); }
		public TerminalNode Stringliteral() { return getToken(NGCParser.Stringliteral, 0); }
		public AsmdefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmdefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterAsmdefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitAsmdefinition(this);
		}
	}

	public final AsmdefinitionContext asmdefinition() throws RecognitionException {
		AsmdefinitionContext _localctx = new AsmdefinitionContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_asmdefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1536);
			match(Asm);
			setState(1537);
			match(LeftParen);
			setState(1538);
			match(Stringliteral);
			setState(1539);
			match(RightParen);
			setState(1540);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LinkagespecificationContext extends ParserRuleContext {
		public TerminalNode Extern() { return getToken(NGCParser.Extern, 0); }
		public TerminalNode Stringliteral() { return getToken(NGCParser.Stringliteral, 0); }
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public LinkagespecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkagespecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterLinkagespecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitLinkagespecification(this);
		}
	}

	public final LinkagespecificationContext linkagespecification() throws RecognitionException {
		LinkagespecificationContext _localctx = new LinkagespecificationContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_linkagespecification);
		int _la;
		try {
			setState(1552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1542);
				match(Extern);
				setState(1543);
				match(Stringliteral);
				setState(1544);
				match(LeftBrace);
				setState(1546);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Using - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Tilde - 66)) | (1L << (AndAnd - 66)) | (1L << (Doublecolon - 66)) | (1L << (Semi - 66)) | (1L << (Ellipsis - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(1545);
					declarationseq(0);
					}
				}

				setState(1548);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1549);
				match(Extern);
				setState(1550);
				match(Stringliteral);
				setState(1551);
				declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributespecifierseqContext extends ParserRuleContext {
		public AttributespecifierContext attributespecifier() {
			return getRuleContext(AttributespecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public AttributespecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributespecifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterAttributespecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitAttributespecifierseq(this);
		}
	}

	public final AttributespecifierseqContext attributespecifierseq() throws RecognitionException {
		return attributespecifierseq(0);
	}

	private AttributespecifierseqContext attributespecifierseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AttributespecifierseqContext _localctx = new AttributespecifierseqContext(_ctx, _parentState);
		AttributespecifierseqContext _prevctx = _localctx;
		int _startState = 208;
		enterRecursionRule(_localctx, 208, RULE_attributespecifierseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1555);
			attributespecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1561);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AttributespecifierseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_attributespecifierseq);
					setState(1557);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1558);
					attributespecifier();
					}
					} 
				}
				setState(1563);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AttributespecifierContext extends ParserRuleContext {
		public AttributelistContext attributelist() {
			return getRuleContext(AttributelistContext.class,0);
		}
		public AlignmentspecifierContext alignmentspecifier() {
			return getRuleContext(AlignmentspecifierContext.class,0);
		}
		public AttributespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterAttributespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitAttributespecifier(this);
		}
	}

	public final AttributespecifierContext attributespecifier() throws RecognitionException {
		AttributespecifierContext _localctx = new AttributespecifierContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_attributespecifier);
		try {
			setState(1571);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1564);
				match(LeftBracket);
				setState(1565);
				match(LeftBracket);
				setState(1566);
				attributelist(0);
				setState(1567);
				match(RightBracket);
				setState(1568);
				match(RightBracket);
				}
				break;
			case Alignas:
				enterOuterAlt(_localctx, 2);
				{
				setState(1570);
				alignmentspecifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlignmentspecifierContext extends ParserRuleContext {
		public TerminalNode Alignas() { return getToken(NGCParser.Alignas, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public AlignmentspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignmentspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterAlignmentspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitAlignmentspecifier(this);
		}
	}

	public final AlignmentspecifierContext alignmentspecifier() throws RecognitionException {
		AlignmentspecifierContext _localctx = new AlignmentspecifierContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_alignmentspecifier);
		int _la;
		try {
			setState(1589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1573);
				match(Alignas);
				setState(1574);
				match(LeftParen);
				setState(1575);
				typeid();
				setState(1577);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1576);
					match(Ellipsis);
					}
				}

				setState(1579);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1581);
				match(Alignas);
				setState(1582);
				match(LeftParen);
				setState(1583);
				constantexpression();
				setState(1585);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1584);
					match(Ellipsis);
					}
				}

				setState(1587);
				match(RightParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributelistContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public AttributelistContext attributelist() {
			return getRuleContext(AttributelistContext.class,0);
		}
		public AttributelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterAttributelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitAttributelist(this);
		}
	}

	public final AttributelistContext attributelist() throws RecognitionException {
		return attributelist(0);
	}

	private AttributelistContext attributelist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AttributelistContext _localctx = new AttributelistContext(_ctx, _parentState);
		AttributelistContext _prevctx = _localctx;
		int _startState = 214;
		enterRecursionRule(_localctx, 214, RULE_attributelist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(1593);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1592);
					attribute();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1595);
				attribute();
				setState(1596);
				match(Ellipsis);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1612);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1610);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
					case 1:
						{
						_localctx = new AttributelistContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_attributelist);
						setState(1600);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1601);
						match(Comma);
						setState(1603);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
						case 1:
							{
							setState(1602);
							attribute();
							}
							break;
						}
						}
						break;
					case 2:
						{
						_localctx = new AttributelistContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_attributelist);
						setState(1605);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1606);
						match(Comma);
						setState(1607);
						attribute();
						setState(1608);
						match(Ellipsis);
						}
						break;
					}
					} 
				}
				setState(1614);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public AttributetokenContext attributetoken() {
			return getRuleContext(AttributetokenContext.class,0);
		}
		public AttributeargumentclauseContext attributeargumentclause() {
			return getRuleContext(AttributeargumentclauseContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1615);
			attributetoken();
			setState(1617);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				{
				setState(1616);
				attributeargumentclause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributetokenContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(NGCParser.Identifier, 0); }
		public AttributescopedtokenContext attributescopedtoken() {
			return getRuleContext(AttributescopedtokenContext.class,0);
		}
		public AttributetokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributetoken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterAttributetoken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitAttributetoken(this);
		}
	}

	public final AttributetokenContext attributetoken() throws RecognitionException {
		AttributetokenContext _localctx = new AttributetokenContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_attributetoken);
		try {
			setState(1621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1619);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1620);
				attributescopedtoken();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributescopedtokenContext extends ParserRuleContext {
		public AttributenamespaceContext attributenamespace() {
			return getRuleContext(AttributenamespaceContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(NGCParser.Identifier, 0); }
		public AttributescopedtokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributescopedtoken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterAttributescopedtoken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitAttributescopedtoken(this);
		}
	}

	public final AttributescopedtokenContext attributescopedtoken() throws RecognitionException {
		AttributescopedtokenContext _localctx = new AttributescopedtokenContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_attributescopedtoken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1623);
			attributenamespace();
			setState(1624);
			match(Doublecolon);
			setState(1625);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributenamespaceContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(NGCParser.Identifier, 0); }
		public AttributenamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributenamespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterAttributenamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitAttributenamespace(this);
		}
	}

	public final AttributenamespaceContext attributenamespace() throws RecognitionException {
		AttributenamespaceContext _localctx = new AttributenamespaceContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_attributenamespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1627);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeargumentclauseContext extends ParserRuleContext {
		public BalancedtokenseqContext balancedtokenseq() {
			return getRuleContext(BalancedtokenseqContext.class,0);
		}
		public AttributeargumentclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeargumentclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterAttributeargumentclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitAttributeargumentclause(this);
		}
	}

	public final AttributeargumentclauseContext attributeargumentclause() throws RecognitionException {
		AttributeargumentclauseContext _localctx = new AttributeargumentclauseContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_attributeargumentclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1629);
			match(LeftParen);
			setState(1630);
			balancedtokenseq(0);
			setState(1631);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BalancedtokenseqContext extends ParserRuleContext {
		public BalancedtokenContext balancedtoken() {
			return getRuleContext(BalancedtokenContext.class,0);
		}
		public BalancedtokenseqContext balancedtokenseq() {
			return getRuleContext(BalancedtokenseqContext.class,0);
		}
		public BalancedtokenseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balancedtokenseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterBalancedtokenseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitBalancedtokenseq(this);
		}
	}

	public final BalancedtokenseqContext balancedtokenseq() throws RecognitionException {
		return balancedtokenseq(0);
	}

	private BalancedtokenseqContext balancedtokenseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BalancedtokenseqContext _localctx = new BalancedtokenseqContext(_ctx, _parentState);
		BalancedtokenseqContext _prevctx = _localctx;
		int _startState = 226;
		enterRecursionRule(_localctx, 226, RULE_balancedtokenseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1635);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				{
				setState(1634);
				balancedtoken();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(1641);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BalancedtokenseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_balancedtokenseq);
					setState(1637);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1638);
					balancedtoken();
					}
					} 
				}
				setState(1643);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BalancedtokenContext extends ParserRuleContext {
		public BalancedtokenseqContext balancedtokenseq() {
			return getRuleContext(BalancedtokenseqContext.class,0);
		}
		public BalancedtokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balancedtoken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterBalancedtoken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitBalancedtoken(this);
		}
	}

	public final BalancedtokenContext balancedtoken() throws RecognitionException {
		BalancedtokenContext _localctx = new BalancedtokenContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_balancedtoken);
		try {
			setState(1656);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(1644);
				match(LeftParen);
				setState(1645);
				balancedtokenseq(0);
				setState(1646);
				match(RightParen);
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1648);
				match(LeftBracket);
				setState(1649);
				balancedtokenseq(0);
				setState(1650);
				match(RightBracket);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(1652);
				match(LeftBrace);
				setState(1653);
				balancedtokenseq(0);
				setState(1654);
				match(RightBrace);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitdeclaratorlistContext extends ParserRuleContext {
		public InitdeclaratorContext initdeclarator() {
			return getRuleContext(InitdeclaratorContext.class,0);
		}
		public InitdeclaratorlistContext initdeclaratorlist() {
			return getRuleContext(InitdeclaratorlistContext.class,0);
		}
		public InitdeclaratorlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initdeclaratorlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterInitdeclaratorlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitInitdeclaratorlist(this);
		}
	}

	public final InitdeclaratorlistContext initdeclaratorlist() throws RecognitionException {
		return initdeclaratorlist(0);
	}

	private InitdeclaratorlistContext initdeclaratorlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitdeclaratorlistContext _localctx = new InitdeclaratorlistContext(_ctx, _parentState);
		InitdeclaratorlistContext _prevctx = _localctx;
		int _startState = 230;
		enterRecursionRule(_localctx, 230, RULE_initdeclaratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1659);
			initdeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(1666);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitdeclaratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initdeclaratorlist);
					setState(1661);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1662);
					match(Comma);
					setState(1663);
					initdeclarator();
					}
					} 
				}
				setState(1668);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InitdeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterInitdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitInitdeclarator(this);
		}
	}

	public final InitdeclaratorContext initdeclarator() throws RecognitionException {
		InitdeclaratorContext _localctx = new InitdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_initdeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1669);
			declarator();
			setState(1671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1670);
				initializer();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorContext extends ParserRuleContext {
		public PtrdeclaratorContext ptrdeclarator() {
			return getRuleContext(PtrdeclaratorContext.class,0);
		}
		public NoptrdeclaratorContext noptrdeclarator() {
			return getRuleContext(NoptrdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public TrailingreturntypeContext trailingreturntype() {
			return getRuleContext(TrailingreturntypeContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitDeclarator(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_declarator);
		try {
			setState(1678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1673);
				ptrdeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1674);
				noptrdeclarator(0);
				setState(1675);
				parametersandqualifiers();
				setState(1676);
				trailingreturntype();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PtrdeclaratorContext extends ParserRuleContext {
		public NoptrdeclaratorContext noptrdeclarator() {
			return getRuleContext(NoptrdeclaratorContext.class,0);
		}
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public PtrdeclaratorContext ptrdeclarator() {
			return getRuleContext(PtrdeclaratorContext.class,0);
		}
		public PtrdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterPtrdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitPtrdeclarator(this);
		}
	}

	public final PtrdeclaratorContext ptrdeclarator() throws RecognitionException {
		PtrdeclaratorContext _localctx = new PtrdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_ptrdeclarator);
		try {
			setState(1684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1680);
				noptrdeclarator(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1681);
				ptroperator();
				setState(1682);
				ptrdeclarator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoptrdeclaratorContext extends ParserRuleContext {
		public DeclaratoridContext declaratorid() {
			return getRuleContext(DeclaratoridContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public PtrdeclaratorContext ptrdeclarator() {
			return getRuleContext(PtrdeclaratorContext.class,0);
		}
		public NoptrdeclaratorContext noptrdeclarator() {
			return getRuleContext(NoptrdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public NoptrdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterNoptrdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitNoptrdeclarator(this);
		}
	}

	public final NoptrdeclaratorContext noptrdeclarator() throws RecognitionException {
		return noptrdeclarator(0);
	}

	private NoptrdeclaratorContext noptrdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrdeclaratorContext _localctx = new NoptrdeclaratorContext(_ctx, _parentState);
		NoptrdeclaratorContext _prevctx = _localctx;
		int _startState = 238;
		enterRecursionRule(_localctx, 238, RULE_noptrdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1695);
			switch (_input.LA(1)) {
			case Decltype:
			case Operator:
			case Tilde:
			case Doublecolon:
			case Ellipsis:
			case Identifier:
				{
				setState(1687);
				declaratorid();
				setState(1689);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1688);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case LeftParen:
				{
				setState(1691);
				match(LeftParen);
				setState(1692);
				ptrdeclarator();
				setState(1693);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1710);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1708);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrdeclarator);
						setState(1697);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1698);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrdeclarator);
						setState(1699);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1700);
						match(LeftBracket);
						setState(1702);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (True - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
							{
							setState(1701);
							constantexpression();
							}
						}

						setState(1704);
						match(RightBracket);
						setState(1706);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
						case 1:
							{
							setState(1705);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1712);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParametersandqualifiersContext extends ParserRuleContext {
		public ParameterdeclarationclauseContext parameterdeclarationclause() {
			return getRuleContext(ParameterdeclarationclauseContext.class,0);
		}
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public RefqualifierContext refqualifier() {
			return getRuleContext(RefqualifierContext.class,0);
		}
		public ExceptionspecificationContext exceptionspecification() {
			return getRuleContext(ExceptionspecificationContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public ParametersandqualifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersandqualifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterParametersandqualifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitParametersandqualifiers(this);
		}
	}

	public final ParametersandqualifiersContext parametersandqualifiers() throws RecognitionException {
		ParametersandqualifiersContext _localctx = new ParametersandqualifiersContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_parametersandqualifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1713);
			match(LeftParen);
			setState(1714);
			parameterdeclarationclause();
			setState(1715);
			match(RightParen);
			setState(1717);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				{
				setState(1716);
				cvqualifierseq();
				}
				break;
			}
			setState(1720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				setState(1719);
				refqualifier();
				}
				break;
			}
			setState(1723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1722);
				exceptionspecification();
				}
				break;
			}
			setState(1726);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1725);
				attributespecifierseq(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrailingreturntypeContext extends ParserRuleContext {
		public TrailingtypespecifierseqContext trailingtypespecifierseq() {
			return getRuleContext(TrailingtypespecifierseqContext.class,0);
		}
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public TrailingreturntypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingreturntype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterTrailingreturntype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitTrailingreturntype(this);
		}
	}

	public final TrailingreturntypeContext trailingreturntype() throws RecognitionException {
		TrailingreturntypeContext _localctx = new TrailingreturntypeContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_trailingreturntype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1728);
			match(Arrow);
			setState(1729);
			trailingtypespecifierseq();
			setState(1731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1730);
				abstractdeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PtroperatorContext extends ParserRuleContext {
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public PtroperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptroperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterPtroperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitPtroperator(this);
		}
	}

	public final PtroperatorContext ptroperator() throws RecognitionException {
		PtroperatorContext _localctx = new PtroperatorContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_ptroperator);
		try {
			setState(1756);
			switch (_input.LA(1)) {
			case Star:
				enterOuterAlt(_localctx, 1);
				{
				setState(1733);
				match(Star);
				setState(1735);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
				case 1:
					{
					setState(1734);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1738);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1737);
					cvqualifierseq();
					}
					break;
				}
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(1740);
				match(And);
				setState(1742);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1741);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case AndAnd:
				enterOuterAlt(_localctx, 3);
				{
				setState(1744);
				match(AndAnd);
				setState(1746);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					{
					setState(1745);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case Decltype:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(1748);
				nestednamespecifier(0);
				setState(1749);
				match(Star);
				setState(1751);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(1750);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1754);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1753);
					cvqualifierseq();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CvqualifierseqContext extends ParserRuleContext {
		public CvqualifierContext cvqualifier() {
			return getRuleContext(CvqualifierContext.class,0);
		}
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public CvqualifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cvqualifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterCvqualifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitCvqualifierseq(this);
		}
	}

	public final CvqualifierseqContext cvqualifierseq() throws RecognitionException {
		CvqualifierseqContext _localctx = new CvqualifierseqContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_cvqualifierseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1758);
			cvqualifier();
			setState(1760);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1759);
				cvqualifierseq();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CvqualifierContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(NGCParser.Const, 0); }
		public TerminalNode Volatile() { return getToken(NGCParser.Volatile, 0); }
		public CvqualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cvqualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterCvqualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitCvqualifier(this);
		}
	}

	public final CvqualifierContext cvqualifier() throws RecognitionException {
		CvqualifierContext _localctx = new CvqualifierContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_cvqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1762);
			_la = _input.LA(1);
			if ( !(_la==Const || _la==Volatile) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RefqualifierContext extends ParserRuleContext {
		public RefqualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refqualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterRefqualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitRefqualifier(this);
		}
	}

	public final RefqualifierContext refqualifier() throws RecognitionException {
		RefqualifierContext _localctx = new RefqualifierContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_refqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1764);
			_la = _input.LA(1);
			if ( !(_la==And || _la==AndAnd) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratoridContext extends ParserRuleContext {
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public DeclaratoridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaratorid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterDeclaratorid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitDeclaratorid(this);
		}
	}

	public final DeclaratoridContext declaratorid() throws RecognitionException {
		DeclaratoridContext _localctx = new DeclaratoridContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_declaratorid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1767);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1766);
				match(Ellipsis);
				}
			}

			setState(1769);
			idexpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeidContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public TypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterTypeid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitTypeid(this);
		}
	}

	public final TypeidContext typeid() throws RecognitionException {
		TypeidContext _localctx = new TypeidContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_typeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1771);
			typespecifierseq();
			setState(1773);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				{
				setState(1772);
				abstractdeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractdeclaratorContext extends ParserRuleContext {
		public PtrabstractdeclaratorContext ptrabstractdeclarator() {
			return getRuleContext(PtrabstractdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public TrailingreturntypeContext trailingreturntype() {
			return getRuleContext(TrailingreturntypeContext.class,0);
		}
		public NoptrabstractdeclaratorContext noptrabstractdeclarator() {
			return getRuleContext(NoptrabstractdeclaratorContext.class,0);
		}
		public AbstractpackdeclaratorContext abstractpackdeclarator() {
			return getRuleContext(AbstractpackdeclaratorContext.class,0);
		}
		public AbstractdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterAbstractdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitAbstractdeclarator(this);
		}
	}

	public final AbstractdeclaratorContext abstractdeclarator() throws RecognitionException {
		AbstractdeclaratorContext _localctx = new AbstractdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_abstractdeclarator);
		try {
			setState(1783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1775);
				ptrabstractdeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1777);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1776);
					noptrabstractdeclarator(0);
					}
					break;
				}
				setState(1779);
				parametersandqualifiers();
				setState(1780);
				trailingreturntype();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1782);
				abstractpackdeclarator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PtrabstractdeclaratorContext extends ParserRuleContext {
		public NoptrabstractdeclaratorContext noptrabstractdeclarator() {
			return getRuleContext(NoptrabstractdeclaratorContext.class,0);
		}
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public PtrabstractdeclaratorContext ptrabstractdeclarator() {
			return getRuleContext(PtrabstractdeclaratorContext.class,0);
		}
		public PtrabstractdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrabstractdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterPtrabstractdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitPtrabstractdeclarator(this);
		}
	}

	public final PtrabstractdeclaratorContext ptrabstractdeclarator() throws RecognitionException {
		PtrabstractdeclaratorContext _localctx = new PtrabstractdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_ptrabstractdeclarator);
		try {
			setState(1790);
			switch (_input.LA(1)) {
			case LeftParen:
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1785);
				noptrabstractdeclarator(0);
				}
				break;
			case Decltype:
			case Star:
			case And:
			case AndAnd:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1786);
				ptroperator();
				setState(1788);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1787);
					ptrabstractdeclarator();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoptrabstractdeclaratorContext extends ParserRuleContext {
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public PtrabstractdeclaratorContext ptrabstractdeclarator() {
			return getRuleContext(PtrabstractdeclaratorContext.class,0);
		}
		public NoptrabstractdeclaratorContext noptrabstractdeclarator() {
			return getRuleContext(NoptrabstractdeclaratorContext.class,0);
		}
		public NoptrabstractdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrabstractdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterNoptrabstractdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitNoptrabstractdeclarator(this);
		}
	}

	public final NoptrabstractdeclaratorContext noptrabstractdeclarator() throws RecognitionException {
		return noptrabstractdeclarator(0);
	}

	private NoptrabstractdeclaratorContext noptrabstractdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrabstractdeclaratorContext _localctx = new NoptrabstractdeclaratorContext(_ctx, _parentState);
		NoptrabstractdeclaratorContext _prevctx = _localctx;
		int _startState = 260;
		enterRecursionRule(_localctx, 260, RULE_noptrabstractdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1806);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1793);
				parametersandqualifiers();
				}
				break;
			case 2:
				{
				setState(1794);
				match(LeftBracket);
				setState(1796);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (True - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(1795);
					constantexpression();
					}
				}

				setState(1798);
				match(RightBracket);
				setState(1800);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(1799);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1802);
				match(LeftParen);
				setState(1803);
				ptrabstractdeclarator();
				setState(1804);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1821);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1819);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrabstractdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractdeclarator);
						setState(1808);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1809);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrabstractdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractdeclarator);
						setState(1810);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1811);
						match(LeftBracket);
						setState(1813);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (True - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
							{
							setState(1812);
							constantexpression();
							}
						}

						setState(1815);
						match(RightBracket);
						setState(1817);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
						case 1:
							{
							setState(1816);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1823);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AbstractpackdeclaratorContext extends ParserRuleContext {
		public NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator() {
			return getRuleContext(NoptrabstractpackdeclaratorContext.class,0);
		}
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public AbstractpackdeclaratorContext abstractpackdeclarator() {
			return getRuleContext(AbstractpackdeclaratorContext.class,0);
		}
		public AbstractpackdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractpackdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterAbstractpackdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitAbstractpackdeclarator(this);
		}
	}

	public final AbstractpackdeclaratorContext abstractpackdeclarator() throws RecognitionException {
		AbstractpackdeclaratorContext _localctx = new AbstractpackdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_abstractpackdeclarator);
		try {
			setState(1828);
			switch (_input.LA(1)) {
			case Ellipsis:
				enterOuterAlt(_localctx, 1);
				{
				setState(1824);
				noptrabstractpackdeclarator(0);
				}
				break;
			case Decltype:
			case Star:
			case And:
			case AndAnd:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1825);
				ptroperator();
				setState(1826);
				abstractpackdeclarator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoptrabstractpackdeclaratorContext extends ParserRuleContext {
		public NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator() {
			return getRuleContext(NoptrabstractpackdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NoptrabstractpackdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrabstractpackdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterNoptrabstractpackdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitNoptrabstractpackdeclarator(this);
		}
	}

	public final NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator() throws RecognitionException {
		return noptrabstractpackdeclarator(0);
	}

	private NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrabstractpackdeclaratorContext _localctx = new NoptrabstractpackdeclaratorContext(_ctx, _parentState);
		NoptrabstractpackdeclaratorContext _prevctx = _localctx;
		int _startState = 264;
		enterRecursionRule(_localctx, 264, RULE_noptrabstractpackdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1831);
			match(Ellipsis);
			}
			_ctx.stop = _input.LT(-1);
			setState(1846);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1844);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrabstractpackdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractpackdeclarator);
						setState(1833);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1834);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrabstractpackdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractpackdeclarator);
						setState(1835);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1836);
						match(LeftBracket);
						setState(1838);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (True - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
							{
							setState(1837);
							constantexpression();
							}
						}

						setState(1840);
						match(RightBracket);
						setState(1842);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
						case 1:
							{
							setState(1841);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1848);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterdeclarationclauseContext extends ParserRuleContext {
		public ParameterdeclarationlistContext parameterdeclarationlist() {
			return getRuleContext(ParameterdeclarationlistContext.class,0);
		}
		public ParameterdeclarationclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclarationclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterParameterdeclarationclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitParameterdeclarationclause(this);
		}
	}

	public final ParameterdeclarationclauseContext parameterdeclarationclause() throws RecognitionException {
		ParameterdeclarationclauseContext _localctx = new ParameterdeclarationclauseContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_parameterdeclarationclause);
		int _la;
		try {
			setState(1859);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1850);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftBracket - 66)) | (1L << (Doublecolon - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(1849);
					parameterdeclarationlist(0);
					}
				}

				setState(1853);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1852);
					match(Ellipsis);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1855);
				parameterdeclarationlist(0);
				setState(1856);
				match(Comma);
				setState(1857);
				match(Ellipsis);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterdeclarationlistContext extends ParserRuleContext {
		public ParameterdeclarationContext parameterdeclaration() {
			return getRuleContext(ParameterdeclarationContext.class,0);
		}
		public ParameterdeclarationlistContext parameterdeclarationlist() {
			return getRuleContext(ParameterdeclarationlistContext.class,0);
		}
		public ParameterdeclarationlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclarationlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterParameterdeclarationlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitParameterdeclarationlist(this);
		}
	}

	public final ParameterdeclarationlistContext parameterdeclarationlist() throws RecognitionException {
		return parameterdeclarationlist(0);
	}

	private ParameterdeclarationlistContext parameterdeclarationlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParameterdeclarationlistContext _localctx = new ParameterdeclarationlistContext(_ctx, _parentState);
		ParameterdeclarationlistContext _prevctx = _localctx;
		int _startState = 268;
		enterRecursionRule(_localctx, 268, RULE_parameterdeclarationlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1862);
			parameterdeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1869);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterdeclarationlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterdeclarationlist);
					setState(1864);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1865);
					match(Comma);
					setState(1866);
					parameterdeclaration();
					}
					} 
				}
				setState(1871);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterdeclarationContext extends ParserRuleContext {
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public ParameterdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterParameterdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitParameterdeclaration(this);
		}
	}

	public final ParameterdeclarationContext parameterdeclaration() throws RecognitionException {
		ParameterdeclarationContext _localctx = new ParameterdeclarationContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_parameterdeclaration);
		int _la;
		try {
			setState(1903);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1873);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1872);
					attributespecifierseq(0);
					}
				}

				setState(1875);
				declspecifierseq();
				setState(1876);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1879);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1878);
					attributespecifierseq(0);
					}
				}

				setState(1881);
				declspecifierseq();
				setState(1882);
				declarator();
				setState(1883);
				match(Assign);
				setState(1884);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1887);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1886);
					attributespecifierseq(0);
					}
				}

				setState(1889);
				declspecifierseq();
				setState(1891);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
				case 1:
					{
					setState(1890);
					abstractdeclarator();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1894);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1893);
					attributespecifierseq(0);
					}
				}

				setState(1896);
				declspecifierseq();
				setState(1898);
				_la = _input.LA(1);
				if (_la==Decltype || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (LeftParen - 77)) | (1L << (LeftBracket - 77)) | (1L << (Star - 77)) | (1L << (And - 77)) | (1L << (AndAnd - 77)) | (1L << (Doublecolon - 77)) | (1L << (Ellipsis - 77)) | (1L << (Identifier - 77)))) != 0)) {
					{
					setState(1897);
					abstractdeclarator();
					}
				}

				setState(1900);
				match(Assign);
				setState(1901);
				initializerclause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctiondefinitionContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public FunctionbodyContext functionbody() {
			return getRuleContext(FunctionbodyContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public VirtspecifierseqContext virtspecifierseq() {
			return getRuleContext(VirtspecifierseqContext.class,0);
		}
		public FunctiondefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterFunctiondefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitFunctiondefinition(this);
		}
	}

	public final FunctiondefinitionContext functiondefinition() throws RecognitionException {
		FunctiondefinitionContext _localctx = new FunctiondefinitionContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_functiondefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1906);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1905);
				attributespecifierseq(0);
				}
			}

			setState(1909);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				{
				setState(1908);
				declspecifierseq();
				}
				break;
			}
			setState(1911);
			declarator();
			setState(1913);
			_la = _input.LA(1);
			if (_la==Final || _la==Override) {
				{
				setState(1912);
				virtspecifierseq(0);
				}
			}

			setState(1915);
			functionbody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionbodyContext extends ParserRuleContext {
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public CtorinitializerContext ctorinitializer() {
			return getRuleContext(CtorinitializerContext.class,0);
		}
		public FunctiontryblockContext functiontryblock() {
			return getRuleContext(FunctiontryblockContext.class,0);
		}
		public TerminalNode Default() { return getToken(NGCParser.Default, 0); }
		public TerminalNode Delete() { return getToken(NGCParser.Delete, 0); }
		public FunctionbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterFunctionbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitFunctionbody(this);
		}
	}

	public final FunctionbodyContext functionbody() throws RecognitionException {
		FunctionbodyContext _localctx = new FunctionbodyContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_functionbody);
		int _la;
		try {
			setState(1928);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1918);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1917);
					ctorinitializer();
					}
				}

				setState(1920);
				compoundstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1921);
				functiontryblock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1922);
				match(Assign);
				setState(1923);
				match(Default);
				setState(1924);
				match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1925);
				match(Assign);
				setState(1926);
				match(Delete);
				setState(1927);
				match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public BraceorequalinitializerContext braceorequalinitializer() {
			return getRuleContext(BraceorequalinitializerContext.class,0);
		}
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitInitializer(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_initializer);
		try {
			setState(1935);
			switch (_input.LA(1)) {
			case LeftBrace:
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(1930);
				braceorequalinitializer();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(1931);
				match(LeftParen);
				setState(1932);
				expressionlist();
				setState(1933);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BraceorequalinitializerContext extends ParserRuleContext {
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public BraceorequalinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_braceorequalinitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterBraceorequalinitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitBraceorequalinitializer(this);
		}
	}

	public final BraceorequalinitializerContext braceorequalinitializer() throws RecognitionException {
		BraceorequalinitializerContext _localctx = new BraceorequalinitializerContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_braceorequalinitializer);
		try {
			setState(1940);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(1937);
				match(Assign);
				setState(1938);
				initializerclause();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1939);
				bracedinitlist();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerclauseContext extends ParserRuleContext {
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public InitializerclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterInitializerclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitInitializerclause(this);
		}
	}

	public final InitializerclauseContext initializerclause() throws RecognitionException {
		InitializerclauseContext _localctx = new InitializerclauseContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_initializerclause);
		try {
			setState(1944);
			switch (_input.LA(1)) {
			case Alignof:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Const_cast:
			case Decltype:
			case Delete:
			case Double:
			case Dynamic_cast:
			case False:
			case Float:
			case Int:
			case Long:
			case New:
			case Noexcept:
			case Nullptr:
			case Operator:
			case Reinterpret_cast:
			case Short:
			case Signed:
			case Sizeof:
			case Static_cast:
			case This:
			case Throw:
			case True:
			case Typeid:
			case Typename:
			case Unsigned:
			case Void:
			case Wchar:
			case LeftParen:
			case LeftBracket:
			case Plus:
			case Minus:
			case Star:
			case And:
			case Or:
			case Tilde:
			case Not:
			case PlusPlus:
			case MinusMinus:
			case Doublecolon:
			case Identifier:
			case Integerliteral:
			case Characterliteral:
			case Floatingliteral:
			case Stringliteral:
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1942);
				assignmentexpression();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1943);
				bracedinitlist();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerlistContext extends ParserRuleContext {
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public InitializerlistContext initializerlist() {
			return getRuleContext(InitializerlistContext.class,0);
		}
		public InitializerlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterInitializerlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitInitializerlist(this);
		}
	}

	public final InitializerlistContext initializerlist() throws RecognitionException {
		return initializerlist(0);
	}

	private InitializerlistContext initializerlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitializerlistContext _localctx = new InitializerlistContext(_ctx, _parentState);
		InitializerlistContext _prevctx = _localctx;
		int _startState = 282;
		enterRecursionRule(_localctx, 282, RULE_initializerlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1947);
			initializerclause();
			setState(1949);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				{
				setState(1948);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(1959);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitializerlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initializerlist);
					setState(1951);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1952);
					match(Comma);
					setState(1953);
					initializerclause();
					setState(1955);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
					case 1:
						{
						setState(1954);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(1961);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BracedinitlistContext extends ParserRuleContext {
		public InitializerlistContext initializerlist() {
			return getRuleContext(InitializerlistContext.class,0);
		}
		public BracedinitlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracedinitlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterBracedinitlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitBracedinitlist(this);
		}
	}

	public final BracedinitlistContext bracedinitlist() throws RecognitionException {
		BracedinitlistContext _localctx = new BracedinitlistContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_bracedinitlist);
		int _la;
		try {
			setState(1971);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1962);
				match(LeftBrace);
				setState(1963);
				initializerlist(0);
				setState(1965);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1964);
					match(Comma);
					}
				}

				setState(1967);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1969);
				match(LeftBrace);
				setState(1970);
				match(RightBrace);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassnameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(NGCParser.Identifier, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public ClassnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterClassname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitClassname(this);
		}
	}

	public final ClassnameContext classname() throws RecognitionException {
		ClassnameContext _localctx = new ClassnameContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_classname);
		try {
			setState(1975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1973);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1974);
				simpletemplateid();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassspecifierContext extends ParserRuleContext {
		public ClassheadContext classhead() {
			return getRuleContext(ClassheadContext.class,0);
		}
		public MemberspecificationContext memberspecification() {
			return getRuleContext(MemberspecificationContext.class,0);
		}
		public ClassspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterClassspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitClassspecifier(this);
		}
	}

	public final ClassspecifierContext classspecifier() throws RecognitionException {
		ClassspecifierContext _localctx = new ClassspecifierContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_classspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1977);
			classhead();
			setState(1978);
			match(LeftBrace);
			setState(1980);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Using - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Tilde - 66)) | (1L << (AndAnd - 66)) | (1L << (Colon - 66)) | (1L << (Doublecolon - 66)) | (1L << (Semi - 66)) | (1L << (Ellipsis - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(1979);
				memberspecification();
				}
			}

			setState(1982);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassheadContext extends ParserRuleContext {
		public ClasskeyContext classkey() {
			return getRuleContext(ClasskeyContext.class,0);
		}
		public ClassheadnameContext classheadname() {
			return getRuleContext(ClassheadnameContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public ClassvirtspecifierContext classvirtspecifier() {
			return getRuleContext(ClassvirtspecifierContext.class,0);
		}
		public BaseclauseContext baseclause() {
			return getRuleContext(BaseclauseContext.class,0);
		}
		public ClassheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classhead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterClasshead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitClasshead(this);
		}
	}

	public final ClassheadContext classhead() throws RecognitionException {
		ClassheadContext _localctx = new ClassheadContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_classhead);
		int _la;
		try {
			setState(2002);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1984);
				classkey();
				setState(1986);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1985);
					attributespecifierseq(0);
					}
				}

				setState(1988);
				classheadname();
				setState(1990);
				_la = _input.LA(1);
				if (_la==Final) {
					{
					setState(1989);
					classvirtspecifier();
					}
				}

				setState(1993);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1992);
					baseclause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1995);
				classkey();
				setState(1997);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1996);
					attributespecifierseq(0);
					}
				}

				setState(2000);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1999);
					baseclause();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassheadnameContext extends ParserRuleContext {
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public ClassheadnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classheadname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterClassheadname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitClassheadname(this);
		}
	}

	public final ClassheadnameContext classheadname() throws RecognitionException {
		ClassheadnameContext _localctx = new ClassheadnameContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_classheadname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2005);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				{
				setState(2004);
				nestednamespecifier(0);
				}
				break;
			}
			setState(2007);
			classname();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassvirtspecifierContext extends ParserRuleContext {
		public TerminalNode Final() { return getToken(NGCParser.Final, 0); }
		public ClassvirtspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classvirtspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterClassvirtspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitClassvirtspecifier(this);
		}
	}

	public final ClassvirtspecifierContext classvirtspecifier() throws RecognitionException {
		ClassvirtspecifierContext _localctx = new ClassvirtspecifierContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_classvirtspecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2009);
			match(Final);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClasskeyContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(NGCParser.Class, 0); }
		public TerminalNode Struct() { return getToken(NGCParser.Struct, 0); }
		public TerminalNode Union() { return getToken(NGCParser.Union, 0); }
		public ClasskeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classkey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterClasskey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitClasskey(this);
		}
	}

	public final ClasskeyContext classkey() throws RecognitionException {
		ClasskeyContext _localctx = new ClasskeyContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_classkey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2011);
			_la = _input.LA(1);
			if ( !(((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (Class - 13)) | (1L << (Struct - 13)) | (1L << (Union - 13)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberspecificationContext extends ParserRuleContext {
		public MemberdeclarationContext memberdeclaration() {
			return getRuleContext(MemberdeclarationContext.class,0);
		}
		public MemberspecificationContext memberspecification() {
			return getRuleContext(MemberspecificationContext.class,0);
		}
		public AccessspecifierContext accessspecifier() {
			return getRuleContext(AccessspecifierContext.class,0);
		}
		public MemberspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberspecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterMemberspecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitMemberspecification(this);
		}
	}

	public final MemberspecificationContext memberspecification() throws RecognitionException {
		MemberspecificationContext _localctx = new MemberspecificationContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_memberspecification);
		int _la;
		try {
			setState(2022);
			switch (_input.LA(1)) {
			case Alignas:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Constexpr:
			case Decltype:
			case Double:
			case Enum:
			case Explicit:
			case Extern:
			case Float:
			case Friend:
			case Inline:
			case Int:
			case Long:
			case Mutable:
			case Operator:
			case Register:
			case Short:
			case Signed:
			case Static:
			case Static_assert:
			case Struct:
			case Template:
			case Thread_local:
			case Typedef:
			case Typename:
			case Union:
			case Unsigned:
			case Using:
			case Virtual:
			case Void:
			case Volatile:
			case Wchar:
			case LeftParen:
			case LeftBracket:
			case Star:
			case And:
			case Tilde:
			case AndAnd:
			case Colon:
			case Doublecolon:
			case Semi:
			case Ellipsis:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2013);
				memberdeclaration();
				setState(2015);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Using - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Tilde - 66)) | (1L << (AndAnd - 66)) | (1L << (Colon - 66)) | (1L << (Doublecolon - 66)) | (1L << (Semi - 66)) | (1L << (Ellipsis - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(2014);
					memberspecification();
					}
				}

				}
				break;
			case Private:
			case Protected:
			case Public:
				enterOuterAlt(_localctx, 2);
				{
				setState(2017);
				accessspecifier();
				setState(2018);
				match(Colon);
				setState(2020);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Typedef - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Using - 66)) | (1L << (Virtual - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Tilde - 66)) | (1L << (AndAnd - 66)) | (1L << (Colon - 66)) | (1L << (Doublecolon - 66)) | (1L << (Semi - 66)) | (1L << (Ellipsis - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(2019);
					memberspecification();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberdeclarationContext extends ParserRuleContext {
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public MemberdeclaratorlistContext memberdeclaratorlist() {
			return getRuleContext(MemberdeclaratorlistContext.class,0);
		}
		public FunctiondefinitionContext functiondefinition() {
			return getRuleContext(FunctiondefinitionContext.class,0);
		}
		public UsingdeclarationContext usingdeclaration() {
			return getRuleContext(UsingdeclarationContext.class,0);
		}
		public Static_assertdeclarationContext static_assertdeclaration() {
			return getRuleContext(Static_assertdeclarationContext.class,0);
		}
		public TemplatedeclarationContext templatedeclaration() {
			return getRuleContext(TemplatedeclarationContext.class,0);
		}
		public AliasdeclarationContext aliasdeclaration() {
			return getRuleContext(AliasdeclarationContext.class,0);
		}
		public EmptydeclarationContext emptydeclaration() {
			return getRuleContext(EmptydeclarationContext.class,0);
		}
		public MemberdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterMemberdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitMemberdeclaration(this);
		}
	}

	public final MemberdeclarationContext memberdeclaration() throws RecognitionException {
		MemberdeclarationContext _localctx = new MemberdeclarationContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_memberdeclaration);
		int _la;
		try {
			setState(2040);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2025);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
				case 1:
					{
					setState(2024);
					attributespecifierseq(0);
					}
					break;
				}
				setState(2028);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
				case 1:
					{
					setState(2027);
					declspecifierseq();
					}
					break;
				}
				setState(2031);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Decltype) | (1L << Operator))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (LeftParen - 77)) | (1L << (LeftBracket - 77)) | (1L << (Star - 77)) | (1L << (And - 77)) | (1L << (Tilde - 77)) | (1L << (AndAnd - 77)) | (1L << (Colon - 77)) | (1L << (Doublecolon - 77)) | (1L << (Ellipsis - 77)) | (1L << (Identifier - 77)))) != 0)) {
					{
					setState(2030);
					memberdeclaratorlist(0);
					}
				}

				setState(2033);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2034);
				functiondefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2035);
				usingdeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2036);
				static_assertdeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2037);
				templatedeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2038);
				aliasdeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2039);
				emptydeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberdeclaratorlistContext extends ParserRuleContext {
		public MemberdeclaratorContext memberdeclarator() {
			return getRuleContext(MemberdeclaratorContext.class,0);
		}
		public MemberdeclaratorlistContext memberdeclaratorlist() {
			return getRuleContext(MemberdeclaratorlistContext.class,0);
		}
		public MemberdeclaratorlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberdeclaratorlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterMemberdeclaratorlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitMemberdeclaratorlist(this);
		}
	}

	public final MemberdeclaratorlistContext memberdeclaratorlist() throws RecognitionException {
		return memberdeclaratorlist(0);
	}

	private MemberdeclaratorlistContext memberdeclaratorlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MemberdeclaratorlistContext _localctx = new MemberdeclaratorlistContext(_ctx, _parentState);
		MemberdeclaratorlistContext _prevctx = _localctx;
		int _startState = 302;
		enterRecursionRule(_localctx, 302, RULE_memberdeclaratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2043);
			memberdeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(2050);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MemberdeclaratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_memberdeclaratorlist);
					setState(2045);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2046);
					match(Comma);
					setState(2047);
					memberdeclarator();
					}
					} 
				}
				setState(2052);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MemberdeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public VirtspecifierseqContext virtspecifierseq() {
			return getRuleContext(VirtspecifierseqContext.class,0);
		}
		public PurespecifierContext purespecifier() {
			return getRuleContext(PurespecifierContext.class,0);
		}
		public BraceorequalinitializerContext braceorequalinitializer() {
			return getRuleContext(BraceorequalinitializerContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(NGCParser.Identifier, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public MemberdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterMemberdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitMemberdeclarator(this);
		}
	}

	public final MemberdeclaratorContext memberdeclarator() throws RecognitionException {
		MemberdeclaratorContext _localctx = new MemberdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_memberdeclarator);
		int _la;
		try {
			setState(2072);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2053);
				declarator();
				setState(2055);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
				case 1:
					{
					setState(2054);
					virtspecifierseq(0);
					}
					break;
				}
				setState(2058);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
				case 1:
					{
					setState(2057);
					purespecifier();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2060);
				declarator();
				setState(2062);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
				case 1:
					{
					setState(2061);
					braceorequalinitializer();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2065);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2064);
					match(Identifier);
					}
				}

				setState(2068);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2067);
					attributespecifierseq(0);
					}
				}

				setState(2070);
				match(Colon);
				setState(2071);
				constantexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VirtspecifierseqContext extends ParserRuleContext {
		public VirtspecifierContext virtspecifier() {
			return getRuleContext(VirtspecifierContext.class,0);
		}
		public VirtspecifierseqContext virtspecifierseq() {
			return getRuleContext(VirtspecifierseqContext.class,0);
		}
		public VirtspecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtspecifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterVirtspecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitVirtspecifierseq(this);
		}
	}

	public final VirtspecifierseqContext virtspecifierseq() throws RecognitionException {
		return virtspecifierseq(0);
	}

	private VirtspecifierseqContext virtspecifierseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VirtspecifierseqContext _localctx = new VirtspecifierseqContext(_ctx, _parentState);
		VirtspecifierseqContext _prevctx = _localctx;
		int _startState = 306;
		enterRecursionRule(_localctx, 306, RULE_virtspecifierseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2075);
			virtspecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(2081);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VirtspecifierseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_virtspecifierseq);
					setState(2077);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2078);
					virtspecifier();
					}
					} 
				}
				setState(2083);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VirtspecifierContext extends ParserRuleContext {
		public TerminalNode Override() { return getToken(NGCParser.Override, 0); }
		public TerminalNode Final() { return getToken(NGCParser.Final, 0); }
		public VirtspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterVirtspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitVirtspecifier(this);
		}
	}

	public final VirtspecifierContext virtspecifier() throws RecognitionException {
		VirtspecifierContext _localctx = new VirtspecifierContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_virtspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2084);
			_la = _input.LA(1);
			if ( !(_la==Final || _la==Override) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PurespecifierContext extends ParserRuleContext {
		public Token val;
		public TerminalNode Assign() { return getToken(NGCParser.Assign, 0); }
		public TerminalNode Octalliteral() { return getToken(NGCParser.Octalliteral, 0); }
		public PurespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_purespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterPurespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitPurespecifier(this);
		}
	}

	public final PurespecifierContext purespecifier() throws RecognitionException {
		PurespecifierContext _localctx = new PurespecifierContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_purespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2086);
			match(Assign);
			setState(2087);
			((PurespecifierContext)_localctx).val = match(Octalliteral);
			if((((PurespecifierContext)_localctx).val!=null?((PurespecifierContext)_localctx).val.getText():null).compareTo("0")!=0) throw new InputMismatchException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseclauseContext extends ParserRuleContext {
		public BasespecifierlistContext basespecifierlist() {
			return getRuleContext(BasespecifierlistContext.class,0);
		}
		public BaseclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterBaseclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitBaseclause(this);
		}
	}

	public final BaseclauseContext baseclause() throws RecognitionException {
		BaseclauseContext _localctx = new BaseclauseContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_baseclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2090);
			match(Colon);
			setState(2091);
			basespecifierlist(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasespecifierlistContext extends ParserRuleContext {
		public BasespecifierContext basespecifier() {
			return getRuleContext(BasespecifierContext.class,0);
		}
		public BasespecifierlistContext basespecifierlist() {
			return getRuleContext(BasespecifierlistContext.class,0);
		}
		public BasespecifierlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basespecifierlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterBasespecifierlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitBasespecifierlist(this);
		}
	}

	public final BasespecifierlistContext basespecifierlist() throws RecognitionException {
		return basespecifierlist(0);
	}

	private BasespecifierlistContext basespecifierlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BasespecifierlistContext _localctx = new BasespecifierlistContext(_ctx, _parentState);
		BasespecifierlistContext _prevctx = _localctx;
		int _startState = 314;
		enterRecursionRule(_localctx, 314, RULE_basespecifierlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2094);
			basespecifier();
			setState(2096);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				{
				setState(2095);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BasespecifierlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_basespecifierlist);
					setState(2098);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2099);
					match(Comma);
					setState(2100);
					basespecifier();
					setState(2102);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
					case 1:
						{
						setState(2101);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BasespecifierContext extends ParserRuleContext {
		public BasetypespecifierContext basetypespecifier() {
			return getRuleContext(BasetypespecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TerminalNode Virtual() { return getToken(NGCParser.Virtual, 0); }
		public AccessspecifierContext accessspecifier() {
			return getRuleContext(AccessspecifierContext.class,0);
		}
		public BasespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterBasespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitBasespecifier(this);
		}
	}

	public final BasespecifierContext basespecifier() throws RecognitionException {
		BasespecifierContext _localctx = new BasespecifierContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_basespecifier);
		int _la;
		try {
			setState(2130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2110);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2109);
					attributespecifierseq(0);
					}
				}

				setState(2112);
				basetypespecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2114);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2113);
					attributespecifierseq(0);
					}
				}

				setState(2116);
				match(Virtual);
				setState(2118);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Private) | (1L << Protected) | (1L << Public))) != 0)) {
					{
					setState(2117);
					accessspecifier();
					}
				}

				setState(2120);
				basetypespecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2122);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2121);
					attributespecifierseq(0);
					}
				}

				setState(2124);
				accessspecifier();
				setState(2126);
				_la = _input.LA(1);
				if (_la==Virtual) {
					{
					setState(2125);
					match(Virtual);
					}
				}

				setState(2128);
				basetypespecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassordecltypeContext extends ParserRuleContext {
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public ClassordecltypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classordecltype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterClassordecltype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitClassordecltype(this);
		}
	}

	public final ClassordecltypeContext classordecltype() throws RecognitionException {
		ClassordecltypeContext _localctx = new ClassordecltypeContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_classordecltype);
		try {
			setState(2137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2133);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
				case 1:
					{
					setState(2132);
					nestednamespecifier(0);
					}
					break;
				}
				setState(2135);
				classname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2136);
				decltypespecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasetypespecifierContext extends ParserRuleContext {
		public ClassordecltypeContext classordecltype() {
			return getRuleContext(ClassordecltypeContext.class,0);
		}
		public BasetypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basetypespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterBasetypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitBasetypespecifier(this);
		}
	}

	public final BasetypespecifierContext basetypespecifier() throws RecognitionException {
		BasetypespecifierContext _localctx = new BasetypespecifierContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_basetypespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2139);
			classordecltype();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessspecifierContext extends ParserRuleContext {
		public TerminalNode Private() { return getToken(NGCParser.Private, 0); }
		public TerminalNode Protected() { return getToken(NGCParser.Protected, 0); }
		public TerminalNode Public() { return getToken(NGCParser.Public, 0); }
		public AccessspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterAccessspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitAccessspecifier(this);
		}
	}

	public final AccessspecifierContext accessspecifier() throws RecognitionException {
		AccessspecifierContext _localctx = new AccessspecifierContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_accessspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2141);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Private) | (1L << Protected) | (1L << Public))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConversionfunctionidContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(NGCParser.Operator, 0); }
		public ConversiontypeidContext conversiontypeid() {
			return getRuleContext(ConversiontypeidContext.class,0);
		}
		public ConversionfunctionidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversionfunctionid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterConversionfunctionid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitConversionfunctionid(this);
		}
	}

	public final ConversionfunctionidContext conversionfunctionid() throws RecognitionException {
		ConversionfunctionidContext _localctx = new ConversionfunctionidContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_conversionfunctionid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2143);
			match(Operator);
			setState(2144);
			conversiontypeid();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConversiontypeidContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public ConversiondeclaratorContext conversiondeclarator() {
			return getRuleContext(ConversiondeclaratorContext.class,0);
		}
		public ConversiontypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversiontypeid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterConversiontypeid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitConversiontypeid(this);
		}
	}

	public final ConversiontypeidContext conversiontypeid() throws RecognitionException {
		ConversiontypeidContext _localctx = new ConversiontypeidContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_conversiontypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2146);
			typespecifierseq();
			setState(2148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
			case 1:
				{
				setState(2147);
				conversiondeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConversiondeclaratorContext extends ParserRuleContext {
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public ConversiondeclaratorContext conversiondeclarator() {
			return getRuleContext(ConversiondeclaratorContext.class,0);
		}
		public ConversiondeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversiondeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterConversiondeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitConversiondeclarator(this);
		}
	}

	public final ConversiondeclaratorContext conversiondeclarator() throws RecognitionException {
		ConversiondeclaratorContext _localctx = new ConversiondeclaratorContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_conversiondeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2150);
			ptroperator();
			setState(2152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				{
				setState(2151);
				conversiondeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CtorinitializerContext extends ParserRuleContext {
		public MeminitializerlistContext meminitializerlist() {
			return getRuleContext(MeminitializerlistContext.class,0);
		}
		public CtorinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctorinitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterCtorinitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitCtorinitializer(this);
		}
	}

	public final CtorinitializerContext ctorinitializer() throws RecognitionException {
		CtorinitializerContext _localctx = new CtorinitializerContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_ctorinitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2154);
			match(Colon);
			setState(2155);
			meminitializerlist();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeminitializerlistContext extends ParserRuleContext {
		public MeminitializerContext meminitializer() {
			return getRuleContext(MeminitializerContext.class,0);
		}
		public MeminitializerlistContext meminitializerlist() {
			return getRuleContext(MeminitializerlistContext.class,0);
		}
		public MeminitializerlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializerlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterMeminitializerlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitMeminitializerlist(this);
		}
	}

	public final MeminitializerlistContext meminitializerlist() throws RecognitionException {
		MeminitializerlistContext _localctx = new MeminitializerlistContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_meminitializerlist);
		int _la;
		try {
			setState(2168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2157);
				meminitializer();
				setState(2159);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2158);
					match(Ellipsis);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2161);
				meminitializer();
				setState(2163);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2162);
					match(Ellipsis);
					}
				}

				setState(2165);
				match(Comma);
				setState(2166);
				meminitializerlist();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeminitializerContext extends ParserRuleContext {
		public MeminitializeridContext meminitializerid() {
			return getRuleContext(MeminitializeridContext.class,0);
		}
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public MeminitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterMeminitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitMeminitializer(this);
		}
	}

	public final MeminitializerContext meminitializer() throws RecognitionException {
		MeminitializerContext _localctx = new MeminitializerContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_meminitializer);
		int _la;
		try {
			setState(2180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2170);
				meminitializerid();
				setState(2171);
				match(LeftParen);
				setState(2173);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This) | (1L << Throw))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (True - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(2172);
					expressionlist();
					}
				}

				setState(2175);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2177);
				meminitializerid();
				setState(2178);
				bracedinitlist();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeminitializeridContext extends ParserRuleContext {
		public ClassordecltypeContext classordecltype() {
			return getRuleContext(ClassordecltypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(NGCParser.Identifier, 0); }
		public MeminitializeridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializerid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterMeminitializerid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitMeminitializerid(this);
		}
	}

	public final MeminitializeridContext meminitializerid() throws RecognitionException {
		MeminitializeridContext _localctx = new MeminitializeridContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_meminitializerid);
		try {
			setState(2184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2182);
				classordecltype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2183);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorfunctionidContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(NGCParser.Operator, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public OperatorfunctionidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorfunctionid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterOperatorfunctionid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitOperatorfunctionid(this);
		}
	}

	public final OperatorfunctionidContext operatorfunctionid() throws RecognitionException {
		OperatorfunctionidContext _localctx = new OperatorfunctionidContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_operatorfunctionid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2186);
			match(Operator);
			setState(2187);
			operator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteraloperatoridContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(NGCParser.Operator, 0); }
		public TerminalNode Stringliteral() { return getToken(NGCParser.Stringliteral, 0); }
		public TerminalNode Identifier() { return getToken(NGCParser.Identifier, 0); }
		public TerminalNode Userdefinedstringliteral() { return getToken(NGCParser.Userdefinedstringliteral, 0); }
		public LiteraloperatoridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literaloperatorid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterLiteraloperatorid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitLiteraloperatorid(this);
		}
	}

	public final LiteraloperatoridContext literaloperatorid() throws RecognitionException {
		LiteraloperatoridContext _localctx = new LiteraloperatoridContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_literaloperatorid);
		try {
			setState(2194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2189);
				match(Operator);
				setState(2190);
				match(Stringliteral);
				setState(2191);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2192);
				match(Operator);
				setState(2193);
				match(Userdefinedstringliteral);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplatedeclarationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(NGCParser.Template, 0); }
		public TemplateparameterlistContext templateparameterlist() {
			return getRuleContext(TemplateparameterlistContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TemplatedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templatedeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterTemplatedeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitTemplatedeclaration(this);
		}
	}

	public final TemplatedeclarationContext templatedeclaration() throws RecognitionException {
		TemplatedeclarationContext _localctx = new TemplatedeclarationContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_templatedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2196);
			match(Template);
			setState(2197);
			match(Less);
			setState(2198);
			templateparameterlist(0);
			setState(2199);
			match(Greater);
			setState(2200);
			declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateparameterlistContext extends ParserRuleContext {
		public TemplateparameterContext templateparameter() {
			return getRuleContext(TemplateparameterContext.class,0);
		}
		public TemplateparameterlistContext templateparameterlist() {
			return getRuleContext(TemplateparameterlistContext.class,0);
		}
		public TemplateparameterlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateparameterlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterTemplateparameterlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitTemplateparameterlist(this);
		}
	}

	public final TemplateparameterlistContext templateparameterlist() throws RecognitionException {
		return templateparameterlist(0);
	}

	private TemplateparameterlistContext templateparameterlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TemplateparameterlistContext _localctx = new TemplateparameterlistContext(_ctx, _parentState);
		TemplateparameterlistContext _prevctx = _localctx;
		int _startState = 344;
		enterRecursionRule(_localctx, 344, RULE_templateparameterlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2203);
			templateparameter();
			}
			_ctx.stop = _input.LT(-1);
			setState(2210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,278,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TemplateparameterlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_templateparameterlist);
					setState(2205);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2206);
					match(Comma);
					setState(2207);
					templateparameter();
					}
					} 
				}
				setState(2212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,278,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TemplateparameterContext extends ParserRuleContext {
		public TypeparameterContext typeparameter() {
			return getRuleContext(TypeparameterContext.class,0);
		}
		public ParameterdeclarationContext parameterdeclaration() {
			return getRuleContext(ParameterdeclarationContext.class,0);
		}
		public TemplateparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateparameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterTemplateparameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitTemplateparameter(this);
		}
	}

	public final TemplateparameterContext templateparameter() throws RecognitionException {
		TemplateparameterContext _localctx = new TemplateparameterContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_templateparameter);
		try {
			setState(2215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2213);
				typeparameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2214);
				parameterdeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeparameterContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(NGCParser.Class, 0); }
		public TerminalNode Identifier() { return getToken(NGCParser.Identifier, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TerminalNode Typename() { return getToken(NGCParser.Typename, 0); }
		public TerminalNode Template() { return getToken(NGCParser.Template, 0); }
		public TemplateparameterlistContext templateparameterlist() {
			return getRuleContext(TemplateparameterlistContext.class,0);
		}
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public TypeparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeparameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterTypeparameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitTypeparameter(this);
		}
	}

	public final TypeparameterContext typeparameter() throws RecognitionException {
		TypeparameterContext _localctx = new TypeparameterContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_typeparameter);
		int _la;
		try {
			setState(2265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2217);
				match(Class);
				setState(2219);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
				case 1:
					{
					setState(2218);
					match(Ellipsis);
					}
					break;
				}
				setState(2222);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
				case 1:
					{
					setState(2221);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2224);
				match(Class);
				setState(2226);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2225);
					match(Identifier);
					}
				}

				setState(2228);
				match(Assign);
				setState(2229);
				typeid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2230);
				match(Typename);
				setState(2232);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
				case 1:
					{
					setState(2231);
					match(Ellipsis);
					}
					break;
				}
				setState(2235);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
				case 1:
					{
					setState(2234);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2237);
				match(Typename);
				setState(2239);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2238);
					match(Identifier);
					}
				}

				setState(2241);
				match(Assign);
				setState(2242);
				typeid();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2243);
				match(Template);
				setState(2244);
				match(Less);
				setState(2245);
				templateparameterlist(0);
				setState(2246);
				match(Greater);
				setState(2247);
				match(Class);
				setState(2249);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
				case 1:
					{
					setState(2248);
					match(Ellipsis);
					}
					break;
				}
				setState(2252);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
				case 1:
					{
					setState(2251);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2254);
				match(Template);
				setState(2255);
				match(Less);
				setState(2256);
				templateparameterlist(0);
				setState(2257);
				match(Greater);
				setState(2258);
				match(Class);
				setState(2260);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2259);
					match(Identifier);
					}
				}

				setState(2262);
				match(Assign);
				setState(2263);
				idexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpletemplateidContext extends ParserRuleContext {
		public TemplatenameContext templatename() {
			return getRuleContext(TemplatenameContext.class,0);
		}
		public TemplateargumentlistContext templateargumentlist() {
			return getRuleContext(TemplateargumentlistContext.class,0);
		}
		public SimpletemplateidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpletemplateid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterSimpletemplateid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitSimpletemplateid(this);
		}
	}

	public final SimpletemplateidContext simpletemplateid() throws RecognitionException {
		SimpletemplateidContext _localctx = new SimpletemplateidContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_simpletemplateid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2267);
			templatename();
			setState(2268);
			match(Less);
			setState(2270);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << Struct) | (1L << This))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (True - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
				{
				setState(2269);
				templateargumentlist(0);
				}
			}

			setState(2272);
			match(Greater);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateidContext extends ParserRuleContext {
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public OperatorfunctionidContext operatorfunctionid() {
			return getRuleContext(OperatorfunctionidContext.class,0);
		}
		public TemplateargumentlistContext templateargumentlist() {
			return getRuleContext(TemplateargumentlistContext.class,0);
		}
		public LiteraloperatoridContext literaloperatorid() {
			return getRuleContext(LiteraloperatoridContext.class,0);
		}
		public TemplateidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterTemplateid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitTemplateid(this);
		}
	}

	public final TemplateidContext templateid() throws RecognitionException {
		TemplateidContext _localctx = new TemplateidContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_templateid);
		int _la;
		try {
			setState(2289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2274);
				simpletemplateid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2275);
				operatorfunctionid();
				setState(2276);
				match(Less);
				setState(2278);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << Struct) | (1L << This))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (True - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(2277);
					templateargumentlist(0);
					}
				}

				setState(2280);
				match(Greater);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2282);
				literaloperatorid();
				setState(2283);
				match(Less);
				setState(2285);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << Struct) | (1L << This))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (True - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (Characterliteral - 131)) | (1L << (Floatingliteral - 131)) | (1L << (Stringliteral - 131)) | (1L << (Userdefinedintegerliteral - 131)) | (1L << (Userdefinedfloatingliteral - 131)) | (1L << (Userdefinedstringliteral - 131)) | (1L << (Userdefinedcharacterliteral - 131)))) != 0)) {
					{
					setState(2284);
					templateargumentlist(0);
					}
				}

				setState(2287);
				match(Greater);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplatenameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(NGCParser.Identifier, 0); }
		public TemplatenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templatename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterTemplatename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitTemplatename(this);
		}
	}

	public final TemplatenameContext templatename() throws RecognitionException {
		TemplatenameContext _localctx = new TemplatenameContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_templatename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2291);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateargumentlistContext extends ParserRuleContext {
		public TemplateargumentContext templateargument() {
			return getRuleContext(TemplateargumentContext.class,0);
		}
		public TemplateargumentlistContext templateargumentlist() {
			return getRuleContext(TemplateargumentlistContext.class,0);
		}
		public TemplateargumentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateargumentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterTemplateargumentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitTemplateargumentlist(this);
		}
	}

	public final TemplateargumentlistContext templateargumentlist() throws RecognitionException {
		return templateargumentlist(0);
	}

	private TemplateargumentlistContext templateargumentlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TemplateargumentlistContext _localctx = new TemplateargumentlistContext(_ctx, _parentState);
		TemplateargumentlistContext _prevctx = _localctx;
		int _startState = 356;
		enterRecursionRule(_localctx, 356, RULE_templateargumentlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2294);
			templateargument();
			setState(2296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
			case 1:
				{
				setState(2295);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,296,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TemplateargumentlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_templateargumentlist);
					setState(2298);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2299);
					match(Comma);
					setState(2300);
					templateargument();
					setState(2302);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
					case 1:
						{
						setState(2301);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,296,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TemplateargumentContext extends ParserRuleContext {
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public TemplateargumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateargument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterTemplateargument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitTemplateargument(this);
		}
	}

	public final TemplateargumentContext templateargument() throws RecognitionException {
		TemplateargumentContext _localctx = new TemplateargumentContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_templateargument);
		try {
			setState(2312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2309);
				constantexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2310);
				typeid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2311);
				idexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypenamespecifierContext extends ParserRuleContext {
		public TerminalNode Typename() { return getToken(NGCParser.Typename, 0); }
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(NGCParser.Identifier, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TerminalNode Template() { return getToken(NGCParser.Template, 0); }
		public TypenamespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typenamespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterTypenamespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitTypenamespecifier(this);
		}
	}

	public final TypenamespecifierContext typenamespecifier() throws RecognitionException {
		TypenamespecifierContext _localctx = new TypenamespecifierContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_typenamespecifier);
		int _la;
		try {
			setState(2325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2314);
				match(Typename);
				setState(2315);
				nestednamespecifier(0);
				setState(2316);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2318);
				match(Typename);
				setState(2319);
				nestednamespecifier(0);
				setState(2321);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(2320);
					match(Template);
					}
				}

				setState(2323);
				simpletemplateid();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitinstantiationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(NGCParser.Template, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode Extern() { return getToken(NGCParser.Extern, 0); }
		public ExplicitinstantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitinstantiation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterExplicitinstantiation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitExplicitinstantiation(this);
		}
	}

	public final ExplicitinstantiationContext explicitinstantiation() throws RecognitionException {
		ExplicitinstantiationContext _localctx = new ExplicitinstantiationContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_explicitinstantiation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2328);
			_la = _input.LA(1);
			if (_la==Extern) {
				{
				setState(2327);
				match(Extern);
				}
			}

			setState(2330);
			match(Template);
			setState(2331);
			declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitspecializationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(NGCParser.Template, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExplicitspecializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitspecialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterExplicitspecialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitExplicitspecialization(this);
		}
	}

	public final ExplicitspecializationContext explicitspecialization() throws RecognitionException {
		ExplicitspecializationContext _localctx = new ExplicitspecializationContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_explicitspecialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2333);
			match(Template);
			setState(2334);
			match(Less);
			setState(2335);
			match(Greater);
			setState(2336);
			declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryblockContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(NGCParser.Try, 0); }
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public HandlerseqContext handlerseq() {
			return getRuleContext(HandlerseqContext.class,0);
		}
		public TryblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterTryblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitTryblock(this);
		}
	}

	public final TryblockContext tryblock() throws RecognitionException {
		TryblockContext _localctx = new TryblockContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_tryblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2338);
			match(Try);
			setState(2339);
			compoundstatement();
			setState(2340);
			handlerseq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctiontryblockContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(NGCParser.Try, 0); }
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public HandlerseqContext handlerseq() {
			return getRuleContext(HandlerseqContext.class,0);
		}
		public CtorinitializerContext ctorinitializer() {
			return getRuleContext(CtorinitializerContext.class,0);
		}
		public FunctiontryblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiontryblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterFunctiontryblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitFunctiontryblock(this);
		}
	}

	public final FunctiontryblockContext functiontryblock() throws RecognitionException {
		FunctiontryblockContext _localctx = new FunctiontryblockContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_functiontryblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2342);
			match(Try);
			setState(2344);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(2343);
				ctorinitializer();
				}
			}

			setState(2346);
			compoundstatement();
			setState(2347);
			handlerseq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HandlerseqContext extends ParserRuleContext {
		public HandlerContext handler() {
			return getRuleContext(HandlerContext.class,0);
		}
		public HandlerseqContext handlerseq() {
			return getRuleContext(HandlerseqContext.class,0);
		}
		public HandlerseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handlerseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterHandlerseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitHandlerseq(this);
		}
	}

	public final HandlerseqContext handlerseq() throws RecognitionException {
		HandlerseqContext _localctx = new HandlerseqContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_handlerseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2349);
			handler();
			setState(2351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
			case 1:
				{
				setState(2350);
				handlerseq();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HandlerContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(NGCParser.Catch, 0); }
		public ExceptiondeclarationContext exceptiondeclaration() {
			return getRuleContext(ExceptiondeclarationContext.class,0);
		}
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public HandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitHandler(this);
		}
	}

	public final HandlerContext handler() throws RecognitionException {
		HandlerContext _localctx = new HandlerContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_handler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2353);
			match(Catch);
			setState(2354);
			match(LeftParen);
			setState(2355);
			exceptiondeclaration();
			setState(2356);
			match(RightParen);
			setState(2357);
			compoundstatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptiondeclarationContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public ExceptiondeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptiondeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterExceptiondeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitExceptiondeclaration(this);
		}
	}

	public final ExceptiondeclarationContext exceptiondeclaration() throws RecognitionException {
		ExceptiondeclarationContext _localctx = new ExceptiondeclarationContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_exceptiondeclaration);
		int _la;
		try {
			setState(2373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2360);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2359);
					attributespecifierseq(0);
					}
				}

				setState(2362);
				typespecifierseq();
				setState(2363);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2366);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2365);
					attributespecifierseq(0);
					}
				}

				setState(2368);
				typespecifierseq();
				setState(2370);
				_la = _input.LA(1);
				if (_la==Decltype || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (LeftParen - 77)) | (1L << (LeftBracket - 77)) | (1L << (Star - 77)) | (1L << (And - 77)) | (1L << (AndAnd - 77)) | (1L << (Doublecolon - 77)) | (1L << (Ellipsis - 77)) | (1L << (Identifier - 77)))) != 0)) {
					{
					setState(2369);
					abstractdeclarator();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2372);
				match(Ellipsis);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowexpressionContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(NGCParser.Throw, 0); }
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public ThrowexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterThrowexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitThrowexpression(this);
		}
	}

	public final ThrowexpressionContext throwexpression() throws RecognitionException {
		ThrowexpressionContext _localctx = new ThrowexpressionContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_throwexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2375);
			match(Throw);
			setState(2377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
			case 1:
				{
				setState(2376);
				assignmentexpression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionspecificationContext extends ParserRuleContext {
		public DynamicexceptionspecificationContext dynamicexceptionspecification() {
			return getRuleContext(DynamicexceptionspecificationContext.class,0);
		}
		public NoexceptspecificationContext noexceptspecification() {
			return getRuleContext(NoexceptspecificationContext.class,0);
		}
		public ExceptionspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionspecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterExceptionspecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitExceptionspecification(this);
		}
	}

	public final ExceptionspecificationContext exceptionspecification() throws RecognitionException {
		ExceptionspecificationContext _localctx = new ExceptionspecificationContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_exceptionspecification);
		try {
			setState(2381);
			switch (_input.LA(1)) {
			case Throw:
				enterOuterAlt(_localctx, 1);
				{
				setState(2379);
				dynamicexceptionspecification();
				}
				break;
			case Noexcept:
				enterOuterAlt(_localctx, 2);
				{
				setState(2380);
				noexceptspecification();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DynamicexceptionspecificationContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(NGCParser.Throw, 0); }
		public TypeidlistContext typeidlist() {
			return getRuleContext(TypeidlistContext.class,0);
		}
		public DynamicexceptionspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamicexceptionspecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterDynamicexceptionspecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitDynamicexceptionspecification(this);
		}
	}

	public final DynamicexceptionspecificationContext dynamicexceptionspecification() throws RecognitionException {
		DynamicexceptionspecificationContext _localctx = new DynamicexceptionspecificationContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_dynamicexceptionspecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2383);
			match(Throw);
			setState(2384);
			match(LeftParen);
			setState(2386);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Struct))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Typename - 68)) | (1L << (Union - 68)) | (1L << (Unsigned - 68)) | (1L << (Void - 68)) | (1L << (Volatile - 68)) | (1L << (Wchar - 68)) | (1L << (Doublecolon - 68)) | (1L << (Identifier - 68)))) != 0)) {
				{
				setState(2385);
				typeidlist(0);
				}
			}

			setState(2388);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeidlistContext extends ParserRuleContext {
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TypeidlistContext typeidlist() {
			return getRuleContext(TypeidlistContext.class,0);
		}
		public TypeidlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeidlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterTypeidlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitTypeidlist(this);
		}
	}

	public final TypeidlistContext typeidlist() throws RecognitionException {
		return typeidlist(0);
	}

	private TypeidlistContext typeidlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeidlistContext _localctx = new TypeidlistContext(_ctx, _parentState);
		TypeidlistContext _prevctx = _localctx;
		int _startState = 382;
		enterRecursionRule(_localctx, 382, RULE_typeidlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2391);
			typeid();
			setState(2393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				{
				setState(2392);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2403);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeidlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeidlist);
					setState(2395);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2396);
					match(Comma);
					setState(2397);
					typeid();
					setState(2399);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
					case 1:
						{
						setState(2398);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2405);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NoexceptspecificationContext extends ParserRuleContext {
		public TerminalNode Noexcept() { return getToken(NGCParser.Noexcept, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public NoexceptspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noexceptspecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterNoexceptspecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitNoexceptspecification(this);
		}
	}

	public final NoexceptspecificationContext noexceptspecification() throws RecognitionException {
		NoexceptspecificationContext _localctx = new NoexceptspecificationContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_noexceptspecification);
		try {
			setState(2412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2406);
				match(Noexcept);
				setState(2407);
				match(LeftParen);
				setState(2408);
				constantexpression();
				setState(2409);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2411);
				match(Noexcept);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RightShiftContext extends ParserRuleContext {
		public List<TerminalNode> Greater() { return getTokens(NGCParser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(NGCParser.Greater, i);
		}
		public RightShiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightShift; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterRightShift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitRightShift(this);
		}
	}

	public final RightShiftContext rightShift() throws RecognitionException {
		RightShiftContext _localctx = new RightShiftContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_rightShift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2414);
			match(Greater);
			setState(2415);
			match(Greater);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RightShiftAssignContext extends ParserRuleContext {
		public List<TerminalNode> Greater() { return getTokens(NGCParser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(NGCParser.Greater, i);
		}
		public TerminalNode Assign() { return getToken(NGCParser.Assign, 0); }
		public RightShiftAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightShiftAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterRightShiftAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitRightShiftAssign(this);
		}
	}

	public final RightShiftAssignContext rightShiftAssign() throws RecognitionException {
		RightShiftAssignContext _localctx = new RightShiftAssignContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_rightShiftAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2417);
			match(Greater);
			setState(2418);
			match(Greater);
			setState(2419);
			match(Assign);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(NGCParser.New, 0); }
		public TerminalNode Delete() { return getToken(NGCParser.Delete, 0); }
		public RightShiftContext rightShift() {
			return getRuleContext(RightShiftContext.class,0);
		}
		public RightShiftAssignContext rightShiftAssign() {
			return getRuleContext(RightShiftAssignContext.class,0);
		}
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_operator);
		try {
			setState(2469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2421);
				match(New);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2422);
				match(Delete);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2423);
				match(New);
				setState(2424);
				match(LeftBracket);
				setState(2425);
				match(RightBracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2426);
				match(Delete);
				setState(2427);
				match(LeftBracket);
				setState(2428);
				match(RightBracket);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2429);
				match(Plus);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2430);
				match(Minus);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2431);
				match(Star);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2432);
				match(Div);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2433);
				match(Mod);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2434);
				match(Caret);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2435);
				match(And);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2436);
				match(Or);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2437);
				match(Tilde);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2438);
				match(Not);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2439);
				match(Assign);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2440);
				match(Less);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2441);
				match(Greater);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2442);
				match(PlusAssign);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2443);
				match(MinusAssign);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2444);
				match(StarAssign);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2445);
				match(DivAssign);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2446);
				match(ModAssign);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2447);
				match(XorAssign);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2448);
				match(AndAssign);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2449);
				match(OrAssign);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2450);
				match(LeftShift);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2451);
				rightShift();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2452);
				rightShiftAssign();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(2453);
				match(LeftShiftAssign);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(2454);
				match(Equal);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(2455);
				match(NotEqual);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(2456);
				match(LessEqual);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(2457);
				match(GreaterEqual);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(2458);
				match(AndAnd);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(2459);
				match(OrOr);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(2460);
				match(PlusPlus);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(2461);
				match(MinusMinus);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(2462);
				match(Comma);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(2463);
				match(ArrowStar);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(2464);
				match(Arrow);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(2465);
				match(LeftParen);
				setState(2466);
				match(RightParen);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(2467);
				match(LeftBracket);
				setState(2468);
				match(RightBracket);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode Integerliteral() { return getToken(NGCParser.Integerliteral, 0); }
		public TerminalNode Characterliteral() { return getToken(NGCParser.Characterliteral, 0); }
		public TerminalNode Floatingliteral() { return getToken(NGCParser.Floatingliteral, 0); }
		public TerminalNode Stringliteral() { return getToken(NGCParser.Stringliteral, 0); }
		public BooleanliteralContext booleanliteral() {
			return getRuleContext(BooleanliteralContext.class,0);
		}
		public PointerliteralContext pointerliteral() {
			return getRuleContext(PointerliteralContext.class,0);
		}
		public UserdefinedliteralContext userdefinedliteral() {
			return getRuleContext(UserdefinedliteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_literal);
		try {
			setState(2478);
			switch (_input.LA(1)) {
			case Integerliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2471);
				match(Integerliteral);
				}
				break;
			case Characterliteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(2472);
				match(Characterliteral);
				}
				break;
			case Floatingliteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(2473);
				match(Floatingliteral);
				}
				break;
			case Stringliteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(2474);
				match(Stringliteral);
				}
				break;
			case False:
			case True:
				enterOuterAlt(_localctx, 5);
				{
				setState(2475);
				booleanliteral();
				}
				break;
			case Nullptr:
				enterOuterAlt(_localctx, 6);
				{
				setState(2476);
				pointerliteral();
				}
				break;
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 7);
				{
				setState(2477);
				userdefinedliteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanliteralContext extends ParserRuleContext {
		public TerminalNode False() { return getToken(NGCParser.False, 0); }
		public TerminalNode True() { return getToken(NGCParser.True, 0); }
		public BooleanliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterBooleanliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitBooleanliteral(this);
		}
	}

	public final BooleanliteralContext booleanliteral() throws RecognitionException {
		BooleanliteralContext _localctx = new BooleanliteralContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_booleanliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2480);
			_la = _input.LA(1);
			if ( !(_la==False || _la==True) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerliteralContext extends ParserRuleContext {
		public TerminalNode Nullptr() { return getToken(NGCParser.Nullptr, 0); }
		public PointerliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterPointerliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitPointerliteral(this);
		}
	}

	public final PointerliteralContext pointerliteral() throws RecognitionException {
		PointerliteralContext _localctx = new PointerliteralContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_pointerliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2482);
			match(Nullptr);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UserdefinedliteralContext extends ParserRuleContext {
		public TerminalNode Userdefinedintegerliteral() { return getToken(NGCParser.Userdefinedintegerliteral, 0); }
		public TerminalNode Userdefinedfloatingliteral() { return getToken(NGCParser.Userdefinedfloatingliteral, 0); }
		public TerminalNode Userdefinedstringliteral() { return getToken(NGCParser.Userdefinedstringliteral, 0); }
		public TerminalNode Userdefinedcharacterliteral() { return getToken(NGCParser.Userdefinedcharacterliteral, 0); }
		public UserdefinedliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userdefinedliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterUserdefinedliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitUserdefinedliteral(this);
		}
	}

	public final UserdefinedliteralContext userdefinedliteral() throws RecognitionException {
		UserdefinedliteralContext _localctx = new UserdefinedliteralContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_userdefinedliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2484);
			_la = _input.LA(1);
			if ( !(((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (Userdefinedintegerliteral - 134)) | (1L << (Userdefinedfloatingliteral - 134)) | (1L << (Userdefinedstringliteral - 134)) | (1L << (Userdefinedcharacterliteral - 134)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return nestednamespecifier_sempred((NestednamespecifierContext)_localctx, predIndex);
		case 10:
			return capturelist_sempred((CapturelistContext)_localctx, predIndex);
		case 15:
			return postfixexpression_sempred((PostfixexpressionContext)_localctx, predIndex);
		case 24:
			return noptrnewdeclarator_sempred((NoptrnewdeclaratorContext)_localctx, predIndex);
		case 29:
			return pmexpression_sempred((PmexpressionContext)_localctx, predIndex);
		case 30:
			return multiplicativeexpression_sempred((MultiplicativeexpressionContext)_localctx, predIndex);
		case 31:
			return additiveexpression_sempred((AdditiveexpressionContext)_localctx, predIndex);
		case 32:
			return shiftexpression_sempred((ShiftexpressionContext)_localctx, predIndex);
		case 33:
			return relationalexpression_sempred((RelationalexpressionContext)_localctx, predIndex);
		case 34:
			return equalityexpression_sempred((EqualityexpressionContext)_localctx, predIndex);
		case 35:
			return andexpression_sempred((AndexpressionContext)_localctx, predIndex);
		case 36:
			return exclusiveorexpression_sempred((ExclusiveorexpressionContext)_localctx, predIndex);
		case 37:
			return inclusiveorexpression_sempred((InclusiveorexpressionContext)_localctx, predIndex);
		case 38:
			return logicalandexpression_sempred((LogicalandexpressionContext)_localctx, predIndex);
		case 39:
			return logicalorexpression_sempred((LogicalorexpressionContext)_localctx, predIndex);
		case 43:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 49:
			return statementseq_sempred((StatementseqContext)_localctx, predIndex);
		case 59:
			return declarationseq_sempred((DeclarationseqContext)_localctx, predIndex);
		case 86:
			return enumeratorlist_sempred((EnumeratorlistContext)_localctx, predIndex);
		case 104:
			return attributespecifierseq_sempred((AttributespecifierseqContext)_localctx, predIndex);
		case 107:
			return attributelist_sempred((AttributelistContext)_localctx, predIndex);
		case 113:
			return balancedtokenseq_sempred((BalancedtokenseqContext)_localctx, predIndex);
		case 115:
			return initdeclaratorlist_sempred((InitdeclaratorlistContext)_localctx, predIndex);
		case 119:
			return noptrdeclarator_sempred((NoptrdeclaratorContext)_localctx, predIndex);
		case 130:
			return noptrabstractdeclarator_sempred((NoptrabstractdeclaratorContext)_localctx, predIndex);
		case 132:
			return noptrabstractpackdeclarator_sempred((NoptrabstractpackdeclaratorContext)_localctx, predIndex);
		case 134:
			return parameterdeclarationlist_sempred((ParameterdeclarationlistContext)_localctx, predIndex);
		case 141:
			return initializerlist_sempred((InitializerlistContext)_localctx, predIndex);
		case 151:
			return memberdeclaratorlist_sempred((MemberdeclaratorlistContext)_localctx, predIndex);
		case 153:
			return virtspecifierseq_sempred((VirtspecifierseqContext)_localctx, predIndex);
		case 157:
			return basespecifierlist_sempred((BasespecifierlistContext)_localctx, predIndex);
		case 172:
			return templateparameterlist_sempred((TemplateparameterlistContext)_localctx, predIndex);
		case 178:
			return templateargumentlist_sempred((TemplateargumentlistContext)_localctx, predIndex);
		case 191:
			return typeidlist_sempred((TypeidlistContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean nestednamespecifier_sempred(NestednamespecifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean capturelist_sempred(CapturelistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfixexpression_sempred(PostfixexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 19);
		case 4:
			return precpred(_ctx, 18);
		case 5:
			return precpred(_ctx, 17);
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 11);
		case 8:
			return precpred(_ctx, 10);
		case 9:
			return precpred(_ctx, 9);
		case 10:
			return precpred(_ctx, 8);
		case 11:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean noptrnewdeclarator_sempred(NoptrnewdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean pmexpression_sempred(PmexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeexpression_sempred(MultiplicativeexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveexpression_sempred(AdditiveexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 2);
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftexpression_sempred(ShiftexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 2);
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalexpression_sempred(RelationalexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 4);
		case 23:
			return precpred(_ctx, 3);
		case 24:
			return precpred(_ctx, 2);
		case 25:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityexpression_sempred(EqualityexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 2);
		case 27:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andexpression_sempred(AndexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveorexpression_sempred(ExclusiveorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveorexpression_sempred(InclusiveorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalandexpression_sempred(LogicalandexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalorexpression_sempred(LogicalorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 33:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean statementseq_sempred(StatementseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 34:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declarationseq_sempred(DeclarationseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 35:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean enumeratorlist_sempred(EnumeratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 36:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean attributespecifierseq_sempred(AttributespecifierseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean attributelist_sempred(AttributelistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 38:
			return precpred(_ctx, 3);
		case 39:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean balancedtokenseq_sempred(BalancedtokenseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 40:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initdeclaratorlist_sempred(InitdeclaratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 41:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean noptrdeclarator_sempred(NoptrdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 42:
			return precpred(_ctx, 3);
		case 43:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean noptrabstractdeclarator_sempred(NoptrabstractdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 44:
			return precpred(_ctx, 5);
		case 45:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean noptrabstractpackdeclarator_sempred(NoptrabstractpackdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 46:
			return precpred(_ctx, 3);
		case 47:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean parameterdeclarationlist_sempred(ParameterdeclarationlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 48:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initializerlist_sempred(InitializerlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 49:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean memberdeclaratorlist_sempred(MemberdeclaratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 50:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean virtspecifierseq_sempred(VirtspecifierseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 51:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean basespecifierlist_sempred(BasespecifierlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 52:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean templateparameterlist_sempred(TemplateparameterlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 53:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean templateargumentlist_sempred(TemplateargumentlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 54:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeidlist_sempred(TypeidlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 55:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u008f\u09b9\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\3\2\5\2\u0194\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3\u01a0\n\3\3\4\3\4\5\4\u01a4\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5\u01af\n\5\3\6\3\6\5\6\u01b3\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u01c2\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u01c9\n"+
		"\7\3\7\3\7\3\7\7\7\u01ce\n\7\f\7\16\7\u01d1\13\7\3\b\3\b\5\b\u01d5\n\b"+
		"\3\b\3\b\3\t\3\t\5\t\u01db\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u01e5"+
		"\n\n\3\13\3\13\3\f\3\f\3\f\5\f\u01ec\n\f\3\f\3\f\3\f\3\f\5\f\u01f2\n\f"+
		"\7\f\u01f4\n\f\f\f\16\f\u01f7\13\f\3\r\3\r\5\r\u01fb\n\r\3\16\3\16\3\16"+
		"\3\16\5\16\u0201\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u0208\n\17\3\20\3"+
		"\20\3\20\3\20\5\20\u020e\n\20\3\20\5\20\u0211\n\20\3\20\5\20\u0214\n\20"+
		"\3\20\5\20\u0217\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u021e\n\21\3\21\3"+
		"\21\3\21\3\21\3\21\5\21\u0225\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u0259\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u0268\n\21\3\21\3\21\3\21\3\21\5\21\u026e\n\21\3"+
		"\21\3\21\3\21\3\21\5\21\u0274\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\7\21\u0281\n\21\f\21\16\21\u0284\13\21\3\22\3\22"+
		"\3\23\5\23\u0289\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u0298\n\23\3\23\3\23\3\23\3\23\5\23\u029e\n\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5"+
		"\24\u02bc\n\24\3\25\3\25\3\26\5\26\u02c1\n\26\3\26\3\26\5\26\u02c5\n\26"+
		"\3\26\3\26\5\26\u02c9\n\26\3\26\5\26\u02cc\n\26\3\26\3\26\5\26\u02d0\n"+
		"\26\3\26\3\26\3\26\3\26\5\26\u02d6\n\26\5\26\u02d8\n\26\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\5\30\u02e0\n\30\3\31\3\31\5\31\u02e4\n\31\3\31\5\31\u02e7"+
		"\n\31\3\32\3\32\3\32\3\32\3\32\5\32\u02ee\n\32\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u02f5\n\32\7\32\u02f7\n\32\f\32\16\32\u02fa\13\32\3\33\3\33\5\33"+
		"\u02fe\n\33\3\33\3\33\5\33\u0302\n\33\3\34\5\34\u0305\n\34\3\34\3\34\3"+
		"\34\5\34\u030a\n\34\3\34\3\34\3\34\3\34\5\34\u0310\n\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u031d\n\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0328\n\37\f\37\16\37\u032b\13\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u0339\n \f \16 \u033c\13 \3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\7!\u0347\n!\f!\16!\u034a\13!\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\7\"\u0356\n\"\f\"\16\"\u0359\13\"\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u036a\n#\f#\16#\u036d\13#\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\7$\u0378\n$\f$\16$\u037b\13$\3%\3%\3%\3%\3%\3%\7%\u0383"+
		"\n%\f%\16%\u0386\13%\3&\3&\3&\3&\3&\3&\7&\u038e\n&\f&\16&\u0391\13&\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\7\'\u0399\n\'\f\'\16\'\u039c\13\'\3(\3(\3(\3(\3"+
		"(\3(\7(\u03a4\n(\f(\16(\u03a7\13(\3)\3)\3)\3)\3)\3)\7)\u03af\n)\f)\16"+
		")\u03b2\13)\3*\3*\3*\3*\3*\3*\3*\5*\u03bb\n*\3+\3+\3+\3+\3+\3+\5+\u03c3"+
		"\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u03d0\n,\3-\3-\3-\3-\3-\3-\7-"+
		"\u03d8\n-\f-\16-\u03db\13-\3.\3.\3/\3/\5/\u03e1\n/\3/\3/\5/\u03e5\n/\3"+
		"/\3/\5/\u03e9\n/\3/\3/\5/\u03ed\n/\3/\3/\5/\u03f1\n/\3/\3/\3/\5/\u03f6"+
		"\n/\3/\5/\u03f9\n/\3\60\5\60\u03fc\n\60\3\60\3\60\3\60\3\60\5\60\u0402"+
		"\n\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u040a\n\60\3\60\3\60\3\60\5\60"+
		"\u040f\n\60\3\61\5\61\u0412\n\61\3\61\3\61\3\62\3\62\5\62\u0418\n\62\3"+
		"\62\3\62\3\63\3\63\3\63\3\63\3\63\7\63\u0421\n\63\f\63\16\63\u0424\13"+
		"\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u043b\n\64\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u044b\n\65"+
		"\3\66\3\66\5\66\u044f\n\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0457\n"+
		"\66\3\66\3\66\3\66\3\66\5\66\u045d\n\66\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0471"+
		"\n\67\3\67\3\67\5\67\u0475\n\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\5\67\u0482\n\67\38\38\58\u0486\n8\39\59\u0489\n9\39\3"+
		"9\39\3:\3:\5:\u0490\n:\3;\3;\3;\3;\3;\3;\5;\u0498\n;\3;\3;\3;\3;\3;\3"+
		";\3;\3;\5;\u04a2\n;\3<\3<\3=\3=\3=\3=\3=\7=\u04ab\n=\f=\16=\u04ae\13="+
		"\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u04b9\n>\3?\3?\3?\3?\3?\3?\3?\3?\5?\u04c3"+
		"\n?\3@\3@\3@\5@\u04c8\n@\3@\3@\3@\3@\3A\5A\u04cf\nA\3A\5A\u04d2\nA\3A"+
		"\3A\3A\5A\u04d7\nA\3A\3A\3A\5A\u04dc\nA\3B\3B\3B\3B\3B\3B\3B\3B\3C\3C"+
		"\3D\3D\3D\3E\3E\3E\3E\3E\3E\5E\u04f1\nE\3F\3F\5F\u04f5\nF\3F\3F\3F\5F"+
		"\u04fa\nF\3G\3G\3H\3H\3I\3I\3J\3J\3J\5J\u0505\nJ\3K\3K\3K\3K\5K\u050b"+
		"\nK\3L\3L\5L\u050f\nL\3L\3L\3L\5L\u0514\nL\3M\3M\5M\u0518\nM\3M\3M\3M"+
		"\5M\u051d\nM\3N\5N\u0520\nN\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N"+
		"\3N\3N\3N\3N\3N\3N\5N\u0536\nN\3O\3O\3O\3O\5O\u053c\nO\3P\3P\3P\3P\3P"+
		"\3P\3P\3P\3P\5P\u0547\nP\3Q\3Q\5Q\u054b\nQ\3Q\5Q\u054e\nQ\3Q\3Q\3Q\3Q"+
		"\3Q\3Q\3Q\3Q\5Q\u0558\nQ\3Q\3Q\3Q\3Q\5Q\u055e\nQ\3Q\5Q\u0561\nQ\3R\3R"+
		"\3S\3S\3S\5S\u0568\nS\3S\3S\3S\3S\3S\3S\3S\3S\5S\u0572\nS\3T\3T\5T\u0576"+
		"\nT\3T\5T\u0579\nT\3T\5T\u057c\nT\3T\3T\5T\u0580\nT\3T\3T\3T\5T\u0585"+
		"\nT\5T\u0587\nT\3U\3U\5U\u058b\nU\3U\3U\5U\u058f\nU\3U\3U\3V\3V\3V\3V"+
		"\3V\5V\u0598\nV\3W\3W\3W\3X\3X\3X\3X\3X\3X\7X\u05a3\nX\fX\16X\u05a6\13"+
		"X\3Y\3Y\3Y\3Y\3Y\5Y\u05ad\nY\3Z\3Z\3[\3[\5[\u05b3\n[\3\\\3\\\3]\3]\5]"+
		"\u05b9\n]\3^\3^\5^\u05bd\n^\3_\5_\u05c0\n_\3_\3_\3_\3_\3_\3_\3`\5`\u05c9"+
		"\n`\3`\3`\3`\3`\3`\3`\3a\5a\u05d2\na\3a\3a\3a\3a\3a\3b\5b\u05da\nb\3c"+
		"\3c\3d\3d\3d\3d\3d\3d\3e\5e\u05e5\ne\3e\3e\3f\3f\5f\u05eb\nf\3f\3f\3f"+
		"\3f\3f\3f\3f\3f\3f\5f\u05f6\nf\3g\5g\u05f9\ng\3g\3g\3g\5g\u05fe\ng\3g"+
		"\3g\3g\3h\3h\3h\3h\3h\3h\3i\3i\3i\3i\5i\u060d\ni\3i\3i\3i\3i\5i\u0613"+
		"\ni\3j\3j\3j\3j\3j\7j\u061a\nj\fj\16j\u061d\13j\3k\3k\3k\3k\3k\3k\3k\5"+
		"k\u0626\nk\3l\3l\3l\3l\5l\u062c\nl\3l\3l\3l\3l\3l\3l\5l\u0634\nl\3l\3"+
		"l\5l\u0638\nl\3m\3m\5m\u063c\nm\3m\3m\3m\5m\u0641\nm\3m\3m\3m\5m\u0646"+
		"\nm\3m\3m\3m\3m\3m\7m\u064d\nm\fm\16m\u0650\13m\3n\3n\5n\u0654\nn\3o\3"+
		"o\5o\u0658\no\3p\3p\3p\3p\3q\3q\3r\3r\3r\3r\3s\3s\5s\u0666\ns\3s\3s\7"+
		"s\u066a\ns\fs\16s\u066d\13s\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\3t\5t\u067b"+
		"\nt\3u\3u\3u\3u\3u\3u\7u\u0683\nu\fu\16u\u0686\13u\3v\3v\5v\u068a\nv\3"+
		"w\3w\3w\3w\3w\5w\u0691\nw\3x\3x\3x\3x\5x\u0697\nx\3y\3y\3y\5y\u069c\n"+
		"y\3y\3y\3y\3y\5y\u06a2\ny\3y\3y\3y\3y\3y\5y\u06a9\ny\3y\3y\5y\u06ad\n"+
		"y\7y\u06af\ny\fy\16y\u06b2\13y\3z\3z\3z\3z\5z\u06b8\nz\3z\5z\u06bb\nz"+
		"\3z\5z\u06be\nz\3z\5z\u06c1\nz\3{\3{\3{\5{\u06c6\n{\3|\3|\5|\u06ca\n|"+
		"\3|\5|\u06cd\n|\3|\3|\5|\u06d1\n|\3|\3|\5|\u06d5\n|\3|\3|\3|\5|\u06da"+
		"\n|\3|\5|\u06dd\n|\5|\u06df\n|\3}\3}\5}\u06e3\n}\3~\3~\3\177\3\177\3\u0080"+
		"\5\u0080\u06ea\n\u0080\3\u0080\3\u0080\3\u0081\3\u0081\5\u0081\u06f0\n"+
		"\u0081\3\u0082\3\u0082\5\u0082\u06f4\n\u0082\3\u0082\3\u0082\3\u0082\3"+
		"\u0082\5\u0082\u06fa\n\u0082\3\u0083\3\u0083\3\u0083\5\u0083\u06ff\n\u0083"+
		"\5\u0083\u0701\n\u0083\3\u0084\3\u0084\3\u0084\3\u0084\5\u0084\u0707\n"+
		"\u0084\3\u0084\3\u0084\5\u0084\u070b\n\u0084\3\u0084\3\u0084\3\u0084\3"+
		"\u0084\5\u0084\u0711\n\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\5"+
		"\u0084\u0718\n\u0084\3\u0084\3\u0084\5\u0084\u071c\n\u0084\7\u0084\u071e"+
		"\n\u0084\f\u0084\16\u0084\u0721\13\u0084\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\5\u0085\u0727\n\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\5\u0086\u0731\n\u0086\3\u0086\3\u0086\5\u0086\u0735\n"+
		"\u0086\7\u0086\u0737\n\u0086\f\u0086\16\u0086\u073a\13\u0086\3\u0087\5"+
		"\u0087\u073d\n\u0087\3\u0087\5\u0087\u0740\n\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\5\u0087\u0746\n\u0087\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\7\u0088\u074e\n\u0088\f\u0088\16\u0088\u0751\13\u0088\3\u0089"+
		"\5\u0089\u0754\n\u0089\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u075a\n"+
		"\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u0762\n"+
		"\u0089\3\u0089\3\u0089\5\u0089\u0766\n\u0089\3\u0089\5\u0089\u0769\n\u0089"+
		"\3\u0089\3\u0089\5\u0089\u076d\n\u0089\3\u0089\3\u0089\3\u0089\5\u0089"+
		"\u0772\n\u0089\3\u008a\5\u008a\u0775\n\u008a\3\u008a\5\u008a\u0778\n\u008a"+
		"\3\u008a\3\u008a\5\u008a\u077c\n\u008a\3\u008a\3\u008a\3\u008b\5\u008b"+
		"\u0781\n\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\5\u008b\u078b\n\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\5\u008c\u0792\n\u008c\3\u008d\3\u008d\3\u008d\5\u008d\u0797\n\u008d\3"+
		"\u008e\3\u008e\5\u008e\u079b\n\u008e\3\u008f\3\u008f\3\u008f\5\u008f\u07a0"+
		"\n\u008f\3\u008f\3\u008f\3\u008f\3\u008f\5\u008f\u07a6\n\u008f\7\u008f"+
		"\u07a8\n\u008f\f\u008f\16\u008f\u07ab\13\u008f\3\u0090\3\u0090\3\u0090"+
		"\5\u0090\u07b0\n\u0090\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u07b6\n"+
		"\u0090\3\u0091\3\u0091\5\u0091\u07ba\n\u0091\3\u0092\3\u0092\3\u0092\5"+
		"\u0092\u07bf\n\u0092\3\u0092\3\u0092\3\u0093\3\u0093\5\u0093\u07c5\n\u0093"+
		"\3\u0093\3\u0093\5\u0093\u07c9\n\u0093\3\u0093\5\u0093\u07cc\n\u0093\3"+
		"\u0093\3\u0093\5\u0093\u07d0\n\u0093\3\u0093\5\u0093\u07d3\n\u0093\5\u0093"+
		"\u07d5\n\u0093\3\u0094\5\u0094\u07d8\n\u0094\3\u0094\3\u0094\3\u0095\3"+
		"\u0095\3\u0096\3\u0096\3\u0097\3\u0097\5\u0097\u07e2\n\u0097\3\u0097\3"+
		"\u0097\3\u0097\5\u0097\u07e7\n\u0097\5\u0097\u07e9\n\u0097\3\u0098\5\u0098"+
		"\u07ec\n\u0098\3\u0098\5\u0098\u07ef\n\u0098\3\u0098\5\u0098\u07f2\n\u0098"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\5\u0098\u07fb"+
		"\n\u0098\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\7\u0099\u0803"+
		"\n\u0099\f\u0099\16\u0099\u0806\13\u0099\3\u009a\3\u009a\5\u009a\u080a"+
		"\n\u009a\3\u009a\5\u009a\u080d\n\u009a\3\u009a\3\u009a\5\u009a\u0811\n"+
		"\u009a\3\u009a\5\u009a\u0814\n\u009a\3\u009a\5\u009a\u0817\n\u009a\3\u009a"+
		"\3\u009a\5\u009a\u081b\n\u009a\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\7\u009b\u0822\n\u009b\f\u009b\16\u009b\u0825\13\u009b\3\u009c\3\u009c"+
		"\3\u009d\3\u009d\3\u009d\3\u009d\3\u009e\3\u009e\3\u009e\3\u009f\3\u009f"+
		"\3\u009f\5\u009f\u0833\n\u009f\3\u009f\3\u009f\3\u009f\3\u009f\5\u009f"+
		"\u0839\n\u009f\7\u009f\u083b\n\u009f\f\u009f\16\u009f\u083e\13\u009f\3"+
		"\u00a0\5\u00a0\u0841\n\u00a0\3\u00a0\3\u00a0\5\u00a0\u0845\n\u00a0\3\u00a0"+
		"\3\u00a0\5\u00a0\u0849\n\u00a0\3\u00a0\3\u00a0\5\u00a0\u084d\n\u00a0\3"+
		"\u00a0\3\u00a0\5\u00a0\u0851\n\u00a0\3\u00a0\3\u00a0\5\u00a0\u0855\n\u00a0"+
		"\3\u00a1\5\u00a1\u0858\n\u00a1\3\u00a1\3\u00a1\5\u00a1\u085c\n\u00a1\3"+
		"\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5"+
		"\5\u00a5\u0867\n\u00a5\3\u00a6\3\u00a6\5\u00a6\u086b\n\u00a6\3\u00a7\3"+
		"\u00a7\3\u00a7\3\u00a8\3\u00a8\5\u00a8\u0872\n\u00a8\3\u00a8\3\u00a8\5"+
		"\u00a8\u0876\n\u00a8\3\u00a8\3\u00a8\3\u00a8\5\u00a8\u087b\n\u00a8\3\u00a9"+
		"\3\u00a9\3\u00a9\5\u00a9\u0880\n\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\5\u00a9\u0887\n\u00a9\3\u00aa\3\u00aa\5\u00aa\u088b\n\u00aa\3"+
		"\u00ab\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\5\u00ac"+
		"\u0895\n\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ad\3\u00ae"+
		"\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\7\u00ae\u08a3\n\u00ae\f\u00ae"+
		"\16\u00ae\u08a6\13\u00ae\3\u00af\3\u00af\5\u00af\u08aa\n\u00af\3\u00b0"+
		"\3\u00b0\5\u00b0\u08ae\n\u00b0\3\u00b0\5\u00b0\u08b1\n\u00b0\3\u00b0\3"+
		"\u00b0\5\u00b0\u08b5\n\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u08bb"+
		"\n\u00b0\3\u00b0\5\u00b0\u08be\n\u00b0\3\u00b0\3\u00b0\5\u00b0\u08c2\n"+
		"\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0"+
		"\5\u00b0\u08cc\n\u00b0\3\u00b0\5\u00b0\u08cf\n\u00b0\3\u00b0\3\u00b0\3"+
		"\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u08d7\n\u00b0\3\u00b0\3\u00b0\3"+
		"\u00b0\5\u00b0\u08dc\n\u00b0\3\u00b1\3\u00b1\3\u00b1\5\u00b1\u08e1\n\u00b1"+
		"\3\u00b1\3\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u08e9\n\u00b2"+
		"\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u08f0\n\u00b2\3\u00b2"+
		"\3\u00b2\5\u00b2\u08f4\n\u00b2\3\u00b3\3\u00b3\3\u00b4\3\u00b4\3\u00b4"+
		"\5\u00b4\u08fb\n\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u0901\n"+
		"\u00b4\7\u00b4\u0903\n\u00b4\f\u00b4\16\u00b4\u0906\13\u00b4\3\u00b5\3"+
		"\u00b5\3\u00b5\5\u00b5\u090b\n\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3"+
		"\u00b6\3\u00b6\3\u00b6\5\u00b6\u0914\n\u00b6\3\u00b6\3\u00b6\5\u00b6\u0918"+
		"\n\u00b6\3\u00b7\5\u00b7\u091b\n\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b8"+
		"\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00ba"+
		"\3\u00ba\5\u00ba\u092b\n\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00bb\3\u00bb"+
		"\5\u00bb\u0932\n\u00bb\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bd\5\u00bd\u093b\n\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd"+
		"\u0941\n\u00bd\3\u00bd\3\u00bd\5\u00bd\u0945\n\u00bd\3\u00bd\5\u00bd\u0948"+
		"\n\u00bd\3\u00be\3\u00be\5\u00be\u094c\n\u00be\3\u00bf\3\u00bf\5\u00bf"+
		"\u0950\n\u00bf\3\u00c0\3\u00c0\3\u00c0\5\u00c0\u0955\n\u00c0\3\u00c0\3"+
		"\u00c0\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u095c\n\u00c1\3\u00c1\3\u00c1\3"+
		"\u00c1\3\u00c1\5\u00c1\u0962\n\u00c1\7\u00c1\u0964\n\u00c1\f\u00c1\16"+
		"\u00c1\u0967\13\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2"+
		"\5\u00c2\u096f\n\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u09a8\n\u00c5\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u09b1\n\u00c6\3\u00c7"+
		"\3\u00c7\3\u00c8\3\u00c8\3\u00c9\3\u00c9\3\u00c9\2$\f\26 \62<>@BDFHJL"+
		"NPXdx\u00ae\u00d2\u00d8\u00e4\u00e8\u00f0\u0106\u010a\u010e\u011c\u0130"+
		"\u0134\u013c\u015a\u0166\u0180\u00ca\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8"+
		"\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110"+
		"\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128"+
		"\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140"+
		"\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158"+
		"\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170"+
		"\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188"+
		"\u018a\u018c\u018e\u0190\2\r\4\2[[__\4\2UW[^\7\2\36\36))\63\6399@@\5\2"+
		"\34\34&&JJ\4\2\20\20LL\4\2[[pp\5\2\17\17<<GG\4\2  //\3\2\60\62\4\2\37"+
		"\37BB\3\2\u0088\u008b\u0adb\2\u0193\3\2\2\2\4\u019f\3\2\2\2\6\u01a3\3"+
		"\2\2\2\b\u01ae\3\2\2\2\n\u01b0\3\2\2\2\f\u01c1\3\2\2\2\16\u01d2\3\2\2"+
		"\2\20\u01d8\3\2\2\2\22\u01e4\3\2\2\2\24\u01e6\3\2\2\2\26\u01e8\3\2\2\2"+
		"\30\u01fa\3\2\2\2\32\u0200\3\2\2\2\34\u0207\3\2\2\2\36\u0209\3\2\2\2 "+
		"\u0258\3\2\2\2\"\u0285\3\2\2\2$\u029d\3\2\2\2&\u02bb\3\2\2\2(\u02bd\3"+
		"\2\2\2*\u02d7\3\2\2\2,\u02d9\3\2\2\2.\u02dd\3\2\2\2\60\u02e6\3\2\2\2\62"+
		"\u02e8\3\2\2\2\64\u0301\3\2\2\2\66\u030f\3\2\2\28\u0311\3\2\2\2:\u031c"+
		"\3\2\2\2<\u031e\3\2\2\2>\u032c\3\2\2\2@\u033d\3\2\2\2B\u034b\3\2\2\2D"+
		"\u035a\3\2\2\2F\u036e\3\2\2\2H\u037c\3\2\2\2J\u0387\3\2\2\2L\u0392\3\2"+
		"\2\2N\u039d\3\2\2\2P\u03a8\3\2\2\2R\u03ba\3\2\2\2T\u03c2\3\2\2\2V\u03cf"+
		"\3\2\2\2X\u03d1\3\2\2\2Z\u03dc\3\2\2\2\\\u03f8\3\2\2\2^\u040e\3\2\2\2"+
		"`\u0411\3\2\2\2b\u0415\3\2\2\2d\u041b\3\2\2\2f\u043a\3\2\2\2h\u044a\3"+
		"\2\2\2j\u045c\3\2\2\2l\u0481\3\2\2\2n\u0485\3\2\2\2p\u0488\3\2\2\2r\u048f"+
		"\3\2\2\2t\u04a1\3\2\2\2v\u04a3\3\2\2\2x\u04a5\3\2\2\2z\u04b8\3\2\2\2|"+
		"\u04c2\3\2\2\2~\u04c4\3\2\2\2\u0080\u04db\3\2\2\2\u0082\u04dd\3\2\2\2"+
		"\u0084\u04e5\3\2\2\2\u0086\u04e7\3\2\2\2\u0088\u04f0\3\2\2\2\u008a\u04f9"+
		"\3\2\2\2\u008c\u04fb\3\2\2\2\u008e\u04fd\3\2\2\2\u0090\u04ff\3\2\2\2\u0092"+
		"\u0504\3\2\2\2\u0094\u050a\3\2\2\2\u0096\u0513\3\2\2\2\u0098\u051c\3\2"+
		"\2\2\u009a\u0535\3\2\2\2\u009c\u053b\3\2\2\2\u009e\u0546\3\2\2\2\u00a0"+
		"\u0560\3\2\2\2\u00a2\u0562\3\2\2\2\u00a4\u0571\3\2\2\2\u00a6\u0586\3\2"+
		"\2\2\u00a8\u0588\3\2\2\2\u00aa\u0597\3\2\2\2\u00ac\u0599\3\2\2\2\u00ae"+
		"\u059c\3\2\2\2\u00b0\u05ac\3\2\2\2\u00b2\u05ae\3\2\2\2\u00b4\u05b2\3\2"+
		"\2\2\u00b6\u05b4\3\2\2\2\u00b8\u05b8\3\2\2\2\u00ba\u05bc\3\2\2\2\u00bc"+
		"\u05bf\3\2\2\2\u00be\u05c8\3\2\2\2\u00c0\u05d1\3\2\2\2\u00c2\u05d9\3\2"+
		"\2\2\u00c4\u05db\3\2\2\2\u00c6\u05dd\3\2\2\2\u00c8\u05e4\3\2\2\2\u00ca"+
		"\u05f5\3\2\2\2\u00cc\u05f8\3\2\2\2\u00ce\u0602\3\2\2\2\u00d0\u0612\3\2"+
		"\2\2\u00d2\u0614\3\2\2\2\u00d4\u0625\3\2\2\2\u00d6\u0637\3\2\2\2\u00d8"+
		"\u0640\3\2\2\2\u00da\u0651\3\2\2\2\u00dc\u0657\3\2\2\2\u00de\u0659\3\2"+
		"\2\2\u00e0\u065d\3\2\2\2\u00e2\u065f\3\2\2\2\u00e4\u0663\3\2\2\2\u00e6"+
		"\u067a\3\2\2\2\u00e8\u067c\3\2\2\2\u00ea\u0687\3\2\2\2\u00ec\u0690\3\2"+
		"\2\2\u00ee\u0696\3\2\2\2\u00f0\u06a1\3\2\2\2\u00f2\u06b3\3\2\2\2\u00f4"+
		"\u06c2\3\2\2\2\u00f6\u06de\3\2\2\2\u00f8\u06e0\3\2\2\2\u00fa\u06e4\3\2"+
		"\2\2\u00fc\u06e6\3\2\2\2\u00fe\u06e9\3\2\2\2\u0100\u06ed\3\2\2\2\u0102"+
		"\u06f9\3\2\2\2\u0104\u0700\3\2\2\2\u0106\u0710\3\2\2\2\u0108\u0726\3\2"+
		"\2\2\u010a\u0728\3\2\2\2\u010c\u0745\3\2\2\2\u010e\u0747\3\2\2\2\u0110"+
		"\u0771\3\2\2\2\u0112\u0774\3\2\2\2\u0114\u078a\3\2\2\2\u0116\u0791\3\2"+
		"\2\2\u0118\u0796\3\2\2\2\u011a\u079a\3\2\2\2\u011c\u079c\3\2\2\2\u011e"+
		"\u07b5\3\2\2\2\u0120\u07b9\3\2\2\2\u0122\u07bb\3\2\2\2\u0124\u07d4\3\2"+
		"\2\2\u0126\u07d7\3\2\2\2\u0128\u07db\3\2\2\2\u012a\u07dd\3\2\2\2\u012c"+
		"\u07e8\3\2\2\2\u012e\u07fa\3\2\2\2\u0130\u07fc\3\2\2\2\u0132\u081a\3\2"+
		"\2\2\u0134\u081c\3\2\2\2\u0136\u0826\3\2\2\2\u0138\u0828\3\2\2\2\u013a"+
		"\u082c\3\2\2\2\u013c\u082f\3\2\2\2\u013e\u0854\3\2\2\2\u0140\u085b\3\2"+
		"\2\2\u0142\u085d\3\2\2\2\u0144\u085f\3\2\2\2\u0146\u0861\3\2\2\2\u0148"+
		"\u0864\3\2\2\2\u014a\u0868\3\2\2\2\u014c\u086c\3\2\2\2\u014e\u087a\3\2"+
		"\2\2\u0150\u0886\3\2\2\2\u0152\u088a\3\2\2\2\u0154\u088c\3\2\2\2\u0156"+
		"\u0894\3\2\2\2\u0158\u0896\3\2\2\2\u015a\u089c\3\2\2\2\u015c\u08a9\3\2"+
		"\2\2\u015e\u08db\3\2\2\2\u0160\u08dd\3\2\2\2\u0162\u08f3\3\2\2\2\u0164"+
		"\u08f5\3\2\2\2\u0166\u08f7\3\2\2\2\u0168\u090a\3\2\2\2\u016a\u0917\3\2"+
		"\2\2\u016c\u091a\3\2\2\2\u016e\u091f\3\2\2\2\u0170\u0924\3\2\2\2\u0172"+
		"\u0928\3\2\2\2\u0174\u092f\3\2\2\2\u0176\u0933\3\2\2\2\u0178\u0947\3\2"+
		"\2\2\u017a\u0949\3\2\2\2\u017c\u094f\3\2\2\2\u017e\u0951\3\2\2\2\u0180"+
		"\u0958\3\2\2\2\u0182\u096e\3\2\2\2\u0184\u0970\3\2\2\2\u0186\u0973\3\2"+
		"\2\2\u0188\u09a7\3\2\2\2\u018a\u09b0\3\2\2\2\u018c\u09b2\3\2\2\2\u018e"+
		"\u09b4\3\2\2\2\u0190\u09b6\3\2\2\2\u0192\u0194\5x=\2\u0193\u0192\3\2\2"+
		"\2\u0193\u0194\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\7\2\2\3\u0196\3"+
		"\3\2\2\2\u0197\u01a0\5\u018a\u00c6\2\u0198\u01a0\7?\2\2\u0199\u019a\7"+
		"O\2\2\u019a\u019b\5X-\2\u019b\u019c\7P\2\2\u019c\u01a0\3\2\2\2\u019d\u01a0"+
		"\5\6\4\2\u019e\u01a0\5\16\b\2\u019f\u0197\3\2\2\2\u019f\u0198\3\2\2\2"+
		"\u019f\u0199\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u019e\3\2\2\2\u01a0\5\3"+
		"\2\2\2\u01a1\u01a4\5\b\5\2\u01a2\u01a4\5\n\6\2\u01a3\u01a1\3\2\2\2\u01a3"+
		"\u01a2\3\2\2\2\u01a4\7\3\2\2\2\u01a5\u01af\7~\2\2\u01a6\u01af\5\u0154"+
		"\u00ab\2\u01a7\u01af\5\u0146\u00a4\2\u01a8\u01af\5\u0156\u00ac\2\u01a9"+
		"\u01aa\7]\2\2\u01aa\u01af\5\u0120\u0091\2\u01ab\u01ac\7]\2\2\u01ac\u01af"+
		"\5\u009eP\2\u01ad\u01af\5\u0162\u00b2\2\u01ae\u01a5\3\2\2\2\u01ae\u01a6"+
		"\3\2\2\2\u01ae\u01a7\3\2\2\2\u01ae\u01a8\3\2\2\2\u01ae\u01a9\3\2\2\2\u01ae"+
		"\u01ab\3\2\2\2\u01ae\u01ad\3\2\2\2\u01af\t\3\2\2\2\u01b0\u01b2\5\f\7\2"+
		"\u01b1\u01b3\7>\2\2\u01b2\u01b1\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4"+
		"\3\2\2\2\u01b4\u01b5\5\b\5\2\u01b5\13\3\2\2\2\u01b6\u01b7\b\7\1\2\u01b7"+
		"\u01c2\7y\2\2\u01b8\u01b9\5\u009cO\2\u01b9\u01ba\7y\2\2\u01ba\u01c2\3"+
		"\2\2\2\u01bb\u01bc\5\u00b4[\2\u01bc\u01bd\7y\2\2\u01bd\u01c2\3\2\2\2\u01be"+
		"\u01bf\5\u009eP\2\u01bf\u01c0\7y\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01b6\3"+
		"\2\2\2\u01c1\u01b8\3\2\2\2\u01c1\u01bb\3\2\2\2\u01c1\u01be\3\2\2\2\u01c2"+
		"\u01cf\3\2\2\2\u01c3\u01c4\f\4\2\2\u01c4\u01c5\7~\2\2\u01c5\u01ce\7y\2"+
		"\2\u01c6\u01c8\f\3\2\2\u01c7\u01c9\7>\2\2\u01c8\u01c7\3\2\2\2\u01c8\u01c9"+
		"\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\5\u0160\u00b1\2\u01cb\u01cc\7"+
		"y\2\2\u01cc\u01ce\3\2\2\2\u01cd\u01c3\3\2\2\2\u01cd\u01c6\3\2\2\2\u01ce"+
		"\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\r\3\2\2\2"+
		"\u01d1\u01cf\3\2\2\2\u01d2\u01d4\5\20\t\2\u01d3\u01d5\5\36\20\2\u01d4"+
		"\u01d3\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\5b"+
		"\62\2\u01d7\17\3\2\2\2\u01d8\u01da\7Q\2\2\u01d9\u01db\5\22\n\2\u01da\u01d9"+
		"\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\7R\2\2\u01dd"+
		"\21\3\2\2\2\u01de\u01e5\5\24\13\2\u01df\u01e5\5\26\f\2\u01e0\u01e1\5\24"+
		"\13\2\u01e1\u01e2\7t\2\2\u01e2\u01e3\5\26\f\2\u01e3\u01e5\3\2\2\2\u01e4"+
		"\u01de\3\2\2\2\u01e4\u01df\3\2\2\2\u01e4\u01e0\3\2\2\2\u01e5\23\3\2\2"+
		"\2\u01e6\u01e7\t\2\2\2\u01e7\25\3\2\2\2\u01e8\u01e9\b\f\1\2\u01e9\u01eb"+
		"\5\30\r\2\u01ea\u01ec\7}\2\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec"+
		"\u01f5\3\2\2\2\u01ed\u01ee\f\3\2\2\u01ee\u01ef\7t\2\2\u01ef\u01f1\5\30"+
		"\r\2\u01f0\u01f2\7}\2\2\u01f1\u01f0\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2"+
		"\u01f4\3\2\2\2\u01f3\u01ed\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2"+
		"\2\2\u01f5\u01f6\3\2\2\2\u01f6\27\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01fb"+
		"\5\32\16\2\u01f9\u01fb\5\34\17\2\u01fa\u01f8\3\2\2\2\u01fa\u01f9\3\2\2"+
		"\2\u01fb\31\3\2\2\2\u01fc\u0201\7~\2\2\u01fd\u01fe\7[\2\2\u01fe\u0201"+
		"\7~\2\2\u01ff\u0201\7?\2\2\u0200\u01fc\3\2\2\2\u0200\u01fd\3\2\2\2\u0200"+
		"\u01ff\3\2\2\2\u0201\33\3\2\2\2\u0202\u0203\7~\2\2\u0203\u0208\5\u0116"+
		"\u008c\2\u0204\u0205\7[\2\2\u0205\u0206\7~\2\2\u0206\u0208\5\u0116\u008c"+
		"\2\u0207\u0202\3\2\2\2\u0207\u0204\3\2\2\2\u0208\35\3\2\2\2\u0209\u020a"+
		"\7O\2\2\u020a\u020b\5\u010c\u0087\2\u020b\u020d\7P\2\2\u020c\u020e\7)"+
		"\2\2\u020d\u020c\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0210\3\2\2\2\u020f"+
		"\u0211\5\u017c\u00bf\2\u0210\u020f\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0213"+
		"\3\2\2\2\u0212\u0214\5\u00d2j\2\u0213\u0212\3\2\2\2\u0213\u0214\3\2\2"+
		"\2\u0214\u0216\3\2\2\2\u0215\u0217\5\u00f4{\2\u0216\u0215\3\2\2\2\u0216"+
		"\u0217\3\2\2\2\u0217\37\3\2\2\2\u0218\u0219\b\21\1\2\u0219\u0259\5\4\3"+
		"\2\u021a\u021b\5\u009aN\2\u021b\u021d\7O\2\2\u021c\u021e\5\"\22\2\u021d"+
		"\u021c\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220\7P"+
		"\2\2\u0220\u0259\3\2\2\2\u0221\u0222\5\u016a\u00b6\2\u0222\u0224\7O\2"+
		"\2\u0223\u0225\5\"\22\2\u0224\u0223\3\2\2\2\u0224\u0225\3\2\2\2\u0225"+
		"\u0226\3\2\2\2\u0226\u0227\7P\2\2\u0227\u0259\3\2\2\2\u0228\u0229\5\u009a"+
		"N\2\u0229\u022a\5\u011e\u0090\2\u022a\u0259\3\2\2\2\u022b\u022c\5\u016a"+
		"\u00b6\2\u022c\u022d\5\u011e\u0090\2\u022d\u0259\3\2\2\2\u022e\u022f\7"+
		"\31\2\2\u022f\u0230\7`\2\2\u0230\u0231\5\u0100\u0081\2\u0231\u0232\7a"+
		"\2\2\u0232\u0233\7O\2\2\u0233\u0234\5X-\2\u0234\u0235\7P\2\2\u0235\u0259"+
		"\3\2\2\2\u0236\u0237\7;\2\2\u0237\u0238\7`\2\2\u0238\u0239\5\u0100\u0081"+
		"\2\u0239\u023a\7a\2\2\u023a\u023b\7O\2\2\u023b\u023c\5X-\2\u023c\u023d"+
		"\7P\2\2\u023d\u0259\3\2\2\2\u023e\u023f\7\64\2\2\u023f\u0240\7`\2\2\u0240"+
		"\u0241\5\u0100\u0081\2\u0241\u0242\7a\2\2\u0242\u0243\7O\2\2\u0243\u0244"+
		"\5X-\2\u0244\u0245\7P\2\2\u0245\u0259\3\2\2\2\u0246\u0247\7\22\2\2\u0247"+
		"\u0248\7`\2\2\u0248\u0249\5\u0100\u0081\2\u0249\u024a\7a\2\2\u024a\u024b"+
		"\7O\2\2\u024b\u024c\5X-\2\u024c\u024d\7P\2\2\u024d\u0259\3\2\2\2\u024e"+
		"\u024f\7E\2\2\u024f\u0250\7O\2\2\u0250\u0251\5X-\2\u0251\u0252\7P\2\2"+
		"\u0252\u0259\3\2\2\2\u0253\u0254\7E\2\2\u0254\u0255\7O\2\2\u0255\u0256"+
		"\5\u0100\u0081\2\u0256\u0257\7P\2\2\u0257\u0259\3\2\2\2\u0258\u0218\3"+
		"\2\2\2\u0258\u021a\3\2\2\2\u0258\u0221\3\2\2\2\u0258\u0228\3\2\2\2\u0258"+
		"\u022b\3\2\2\2\u0258\u022e\3\2\2\2\u0258\u0236\3\2\2\2\u0258\u023e\3\2"+
		"\2\2\u0258\u0246\3\2\2\2\u0258\u024e\3\2\2\2\u0258\u0253\3\2\2\2\u0259"+
		"\u0282\3\2\2\2\u025a\u025b\f\25\2\2\u025b\u025c\7Q\2\2\u025c\u025d\5X"+
		"-\2\u025d\u025e\7R\2\2\u025e\u0281\3\2\2\2\u025f\u0260\f\24\2\2\u0260"+
		"\u0261\7Q\2\2\u0261\u0262\5\u011e\u0090\2\u0262\u0263\7R\2\2\u0263\u0281"+
		"\3\2\2\2\u0264\u0265\f\23\2\2\u0265\u0267\7O\2\2\u0266\u0268\5\"\22\2"+
		"\u0267\u0266\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u0281"+
		"\7P\2\2\u026a\u026b\f\16\2\2\u026b\u026d\7{\2\2\u026c\u026e\7>\2\2\u026d"+
		"\u026c\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0281\5\6"+
		"\4\2\u0270\u0271\f\r\2\2\u0271\u0273\7v\2\2\u0272\u0274\7>\2\2\u0273\u0272"+
		"\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0281\5\6\4\2\u0276"+
		"\u0277\f\f\2\2\u0277\u0278\7{\2\2\u0278\u0281\5$\23\2\u0279\u027a\f\13"+
		"\2\2\u027a\u027b\7v\2\2\u027b\u0281\5$\23\2\u027c\u027d\f\n\2\2\u027d"+
		"\u0281\7r\2\2\u027e\u027f\f\t\2\2\u027f\u0281\7s\2\2\u0280\u025a\3\2\2"+
		"\2\u0280\u025f\3\2\2\2\u0280\u0264\3\2\2\2\u0280\u026a\3\2\2\2\u0280\u0270"+
		"\3\2\2\2\u0280\u0276\3\2\2\2\u0280\u0279\3\2\2\2\u0280\u027c\3\2\2\2\u0280"+
		"\u027e\3\2\2\2\u0281\u0284\3\2\2\2\u0282\u0280\3\2\2\2\u0282\u0283\3\2"+
		"\2\2\u0283!\3\2\2\2\u0284\u0282\3\2\2\2\u0285\u0286\5\u011c\u008f\2\u0286"+
		"#\3\2\2\2\u0287\u0289\5\f\7\2\u0288\u0287\3\2\2\2\u0288\u0289\3\2\2\2"+
		"\u0289\u028a\3\2\2\2\u028a\u028b\5\u009cO\2\u028b\u028c\7y\2\2\u028c\u028d"+
		"\7]\2\2\u028d\u028e\5\u009cO\2\u028e\u029e\3\2\2\2\u028f\u0290\5\f\7\2"+
		"\u0290\u0291\7>\2\2\u0291\u0292\5\u0160\u00b1\2\u0292\u0293\7y\2\2\u0293"+
		"\u0294\7]\2\2\u0294\u0295\5\u009cO\2\u0295\u029e\3\2\2\2\u0296\u0298\5"+
		"\f\7\2\u0297\u0296\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299\3\2\2\2\u0299"+
		"\u029a\7]\2\2\u029a\u029e\5\u009cO\2\u029b\u029c\7]\2\2\u029c\u029e\5"+
		"\u009eP\2\u029d\u0288\3\2\2\2\u029d\u028f\3\2\2\2\u029d\u0297\3\2\2\2"+
		"\u029d\u029b\3\2\2\2\u029e%\3\2\2\2\u029f\u02bc\5 \21\2\u02a0\u02a1\7"+
		"r\2\2\u02a1\u02bc\5:\36\2\u02a2\u02a3\7s\2\2\u02a3\u02bc\5:\36\2\u02a4"+
		"\u02a5\5(\25\2\u02a5\u02a6\5:\36\2\u02a6\u02bc\3\2\2\2\u02a7\u02a8\78"+
		"\2\2\u02a8\u02bc\5&\24\2\u02a9\u02aa\78\2\2\u02aa\u02ab\7O\2\2\u02ab\u02ac"+
		"\5\u0100\u0081\2\u02ac\u02ad\7P\2\2\u02ad\u02bc\3\2\2\2\u02ae\u02af\7"+
		"8\2\2\u02af\u02b0\7}\2\2\u02b0\u02b1\7O\2\2\u02b1\u02b2\7~\2\2\u02b2\u02bc"+
		"\7P\2\2\u02b3\u02b4\7\5\2\2\u02b4\u02b5\7O\2\2\u02b5\u02b6\5\u0100\u0081"+
		"\2\u02b6\u02b7\7P\2\2\u02b7\u02bc\3\2\2\2\u02b8\u02bc\58\35\2\u02b9\u02bc"+
		"\5*\26\2\u02ba\u02bc\5\66\34\2\u02bb\u029f\3\2\2\2\u02bb\u02a0\3\2\2\2"+
		"\u02bb\u02a2\3\2\2\2\u02bb\u02a4\3\2\2\2\u02bb\u02a7\3\2\2\2\u02bb\u02a9"+
		"\3\2\2\2\u02bb\u02ae\3\2\2\2\u02bb\u02b3\3\2\2\2\u02bb\u02b8\3\2\2\2\u02bb"+
		"\u02b9\3\2\2\2\u02bb\u02ba\3\2\2\2\u02bc\'\3\2\2\2\u02bd\u02be\t\3\2\2"+
		"\u02be)\3\2\2\2\u02bf\u02c1\7y\2\2\u02c0\u02bf\3\2\2\2\u02c0\u02c1\3\2"+
		"\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c4\7+\2\2\u02c3\u02c5\5,\27\2\u02c4"+
		"\u02c3\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c8\5."+
		"\30\2\u02c7\u02c9\5\64\33\2\u02c8\u02c7\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9"+
		"\u02d8\3\2\2\2\u02ca\u02cc\7y\2\2\u02cb\u02ca\3\2\2\2\u02cb\u02cc\3\2"+
		"\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02cf\7+\2\2\u02ce\u02d0\5,\27\2\u02cf"+
		"\u02ce\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d2\7O"+
		"\2\2\u02d2\u02d3\5\u0100\u0081\2\u02d3\u02d5\7P\2\2\u02d4\u02d6\5\64\33"+
		"\2\u02d5\u02d4\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d8\3\2\2\2\u02d7\u02c0"+
		"\3\2\2\2\u02d7\u02cb\3\2\2\2\u02d8+\3\2\2\2\u02d9\u02da\7O\2\2\u02da\u02db"+
		"\5\"\22\2\u02db\u02dc\7P\2\2\u02dc-\3\2\2\2\u02dd\u02df\5\u0096L\2\u02de"+
		"\u02e0\5\60\31\2\u02df\u02de\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0/\3\2\2"+
		"\2\u02e1\u02e3\5\u00f6|\2\u02e2\u02e4\5\60\31\2\u02e3\u02e2\3\2\2\2\u02e3"+
		"\u02e4\3\2\2\2\u02e4\u02e7\3\2\2\2\u02e5\u02e7\5\62\32\2\u02e6\u02e1\3"+
		"\2\2\2\u02e6\u02e5\3\2\2\2\u02e7\61\3\2\2\2\u02e8\u02e9\b\32\1\2\u02e9"+
		"\u02ea\7Q\2\2\u02ea\u02eb\5X-\2\u02eb\u02ed\7R\2\2\u02ec\u02ee\5\u00d2"+
		"j\2\u02ed\u02ec\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02f8\3\2\2\2\u02ef"+
		"\u02f0\f\3\2\2\u02f0\u02f1\7Q\2\2\u02f1\u02f2\5Z.\2\u02f2\u02f4\7R\2\2"+
		"\u02f3\u02f5\5\u00d2j\2\u02f4\u02f3\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5"+
		"\u02f7\3\2\2\2\u02f6\u02ef\3\2\2\2\u02f7\u02fa\3\2\2\2\u02f8\u02f6\3\2"+
		"\2\2\u02f8\u02f9\3\2\2\2\u02f9\63\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fb\u02fd"+
		"\7O\2\2\u02fc\u02fe\5\"\22\2\u02fd\u02fc\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe"+
		"\u02ff\3\2\2\2\u02ff\u0302\7P\2\2\u0300\u0302\5\u011e\u0090\2\u0301\u02fb"+
		"\3\2\2\2\u0301\u0300\3\2\2\2\u0302\65\3\2\2\2\u0303\u0305\7y\2\2\u0304"+
		"\u0303\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0307\7\26"+
		"\2\2\u0307\u0310\5:\36\2\u0308\u030a\7y\2\2\u0309\u0308\3\2\2\2\u0309"+
		"\u030a\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030c\7\26\2\2\u030c\u030d\7"+
		"Q\2\2\u030d\u030e\7R\2\2\u030e\u0310\5:\36\2\u030f\u0304\3\2\2\2\u030f"+
		"\u0309\3\2\2\2\u0310\67\3\2\2\2\u0311\u0312\7,\2\2\u0312\u0313\7O\2\2"+
		"\u0313\u0314\5X-\2\u0314\u0315\7P\2\2\u03159\3\2\2\2\u0316\u031d\5&\24"+
		"\2\u0317\u0318\7O\2\2\u0318\u0319\5\u0100\u0081\2\u0319\u031a\7P\2\2\u031a"+
		"\u031b\5:\36\2\u031b\u031d\3\2\2\2\u031c\u0316\3\2\2\2\u031c\u0317\3\2"+
		"\2\2\u031d;\3\2\2\2\u031e\u031f\b\37\1\2\u031f\u0320\5:\36\2\u0320\u0329"+
		"\3\2\2\2\u0321\u0322\f\4\2\2\u0322\u0323\7|\2\2\u0323\u0328\5:\36\2\u0324"+
		"\u0325\f\3\2\2\u0325\u0326\7u\2\2\u0326\u0328\5:\36\2\u0327\u0321\3\2"+
		"\2\2\u0327\u0324\3\2\2\2\u0328\u032b\3\2\2\2\u0329\u0327\3\2\2\2\u0329"+
		"\u032a\3\2\2\2\u032a=\3\2\2\2\u032b\u0329\3\2\2\2\u032c\u032d\b \1\2\u032d"+
		"\u032e\5<\37\2\u032e\u033a\3\2\2\2\u032f\u0330\f\5\2\2\u0330\u0331\7W"+
		"\2\2\u0331\u0339\5<\37\2\u0332\u0333\f\4\2\2\u0333\u0334\7X\2\2\u0334"+
		"\u0339\5<\37\2\u0335\u0336\f\3\2\2\u0336\u0337\7Y\2\2\u0337\u0339\5<\37"+
		"\2\u0338\u032f\3\2\2\2\u0338\u0332\3\2\2\2\u0338\u0335\3\2\2\2\u0339\u033c"+
		"\3\2\2\2\u033a\u0338\3\2\2\2\u033a\u033b\3\2\2\2\u033b?\3\2\2\2\u033c"+
		"\u033a\3\2\2\2\u033d\u033e\b!\1\2\u033e\u033f\5> \2\u033f\u0348\3\2\2"+
		"\2\u0340\u0341\f\4\2\2\u0341\u0342\7U\2\2\u0342\u0347\5> \2\u0343\u0344"+
		"\f\3\2\2\u0344\u0345\7V\2\2\u0345\u0347\5> \2\u0346\u0340\3\2\2\2\u0346"+
		"\u0343\3\2\2\2\u0347\u034a\3\2\2\2\u0348\u0346\3\2\2\2\u0348\u0349\3\2"+
		"\2\2\u0349A\3\2\2\2\u034a\u0348\3\2\2\2\u034b\u034c\b\"\1\2\u034c\u034d"+
		"\5@!\2\u034d\u0357\3\2\2\2\u034e\u034f\f\4\2\2\u034f\u0350\7j\2\2\u0350"+
		"\u0356\5@!\2\u0351\u0352\f\3\2\2\u0352\u0353\5\u0184\u00c3\2\u0353\u0354"+
		"\5@!\2\u0354\u0356\3\2\2\2\u0355\u034e\3\2\2\2\u0355\u0351\3\2\2\2\u0356"+
		"\u0359\3\2\2\2\u0357\u0355\3\2\2\2\u0357\u0358\3\2\2\2\u0358C\3\2\2\2"+
		"\u0359\u0357\3\2\2\2\u035a\u035b\b#\1\2\u035b\u035c\5B\"\2\u035c\u036b"+
		"\3\2\2\2\u035d\u035e\f\6\2\2\u035e\u035f\7`\2\2\u035f\u036a\5B\"\2\u0360"+
		"\u0361\f\5\2\2\u0361\u0362\7a\2\2\u0362\u036a\5B\"\2\u0363\u0364\f\4\2"+
		"\2\u0364\u0365\7n\2\2\u0365\u036a\5B\"\2\u0366\u0367\f\3\2\2\u0367\u0368"+
		"\7o\2\2\u0368\u036a\5B\"\2\u0369\u035d\3\2\2\2\u0369\u0360\3\2\2\2\u0369"+
		"\u0363\3\2\2\2\u0369\u0366\3\2\2\2\u036a\u036d\3\2\2\2\u036b\u0369\3\2"+
		"\2\2\u036b\u036c\3\2\2\2\u036cE\3\2\2\2\u036d\u036b\3\2\2\2\u036e\u036f"+
		"\b$\1\2\u036f\u0370\5D#\2\u0370\u0379\3\2\2\2\u0371\u0372\f\4\2\2\u0372"+
		"\u0373\7l\2\2\u0373\u0378\5D#\2\u0374\u0375\f\3\2\2\u0375\u0376\7m\2\2"+
		"\u0376\u0378\5D#\2\u0377\u0371\3\2\2\2\u0377\u0374\3\2\2\2\u0378\u037b"+
		"\3\2\2\2\u0379\u0377\3\2\2\2\u0379\u037a\3\2\2\2\u037aG\3\2\2\2\u037b"+
		"\u0379\3\2\2\2\u037c\u037d\b%\1\2\u037d\u037e\5F$\2\u037e\u0384\3\2\2"+
		"\2\u037f\u0380\f\3\2\2\u0380\u0381\7[\2\2\u0381\u0383\5F$\2\u0382\u037f"+
		"\3\2\2\2\u0383\u0386\3\2\2\2\u0384\u0382\3\2\2\2\u0384\u0385\3\2\2\2\u0385"+
		"I\3\2\2\2\u0386\u0384\3\2\2\2\u0387\u0388\b&\1\2\u0388\u0389\5H%\2\u0389"+
		"\u038f\3\2\2\2\u038a\u038b\f\3\2\2\u038b\u038c\7Z\2\2\u038c\u038e\5H%"+
		"\2\u038d\u038a\3\2\2\2\u038e\u0391\3\2\2\2\u038f\u038d\3\2\2\2\u038f\u0390"+
		"\3\2\2\2\u0390K\3\2\2\2\u0391\u038f\3\2\2\2\u0392\u0393\b\'\1\2\u0393"+
		"\u0394\5J&\2\u0394\u039a\3\2\2\2\u0395\u0396\f\3\2\2\u0396\u0397\7\\\2"+
		"\2\u0397\u0399\5J&\2\u0398\u0395\3\2\2\2\u0399\u039c\3\2\2\2\u039a\u0398"+
		"\3\2\2\2\u039a\u039b\3\2\2\2\u039bM\3\2\2\2\u039c\u039a\3\2\2\2\u039d"+
		"\u039e\b(\1\2\u039e\u039f\5L\'\2\u039f\u03a5\3\2\2\2\u03a0\u03a1\f\3\2"+
		"\2\u03a1\u03a2\7p\2\2\u03a2\u03a4\5L\'\2\u03a3\u03a0\3\2\2\2\u03a4\u03a7"+
		"\3\2\2\2\u03a5\u03a3\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6O\3\2\2\2\u03a7"+
		"\u03a5\3\2\2\2\u03a8\u03a9\b)\1\2\u03a9\u03aa\5N(\2\u03aa\u03b0\3\2\2"+
		"\2\u03ab\u03ac\f\3\2\2\u03ac\u03ad\7q\2\2\u03ad\u03af\5N(\2\u03ae\u03ab"+
		"\3\2\2\2\u03af\u03b2\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1"+
		"Q\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b3\u03bb\5P)\2\u03b4\u03b5\5P)\2\u03b5"+
		"\u03b6\7w\2\2\u03b6\u03b7\5X-\2\u03b7\u03b8\7x\2\2\u03b8\u03b9\5T+\2\u03b9"+
		"\u03bb\3\2\2\2\u03ba\u03b3\3\2\2\2\u03ba\u03b4\3\2\2\2\u03bbS\3\2\2\2"+
		"\u03bc\u03c3\5R*\2\u03bd\u03be\5P)\2\u03be\u03bf\5V,\2\u03bf\u03c0\5\u011a"+
		"\u008e\2\u03c0\u03c3\3\2\2\2\u03c1\u03c3\5\u017a\u00be\2\u03c2\u03bc\3"+
		"\2\2\2\u03c2\u03bd\3\2\2\2\u03c2\u03c1\3\2\2\2\u03c3U\3\2\2\2\u03c4\u03d0"+
		"\7_\2\2\u03c5\u03d0\7d\2\2\u03c6\u03d0\7e\2\2\u03c7\u03d0\7f\2\2\u03c8"+
		"\u03d0\7b\2\2\u03c9\u03d0\7c\2\2\u03ca\u03d0\5\u0186\u00c4\2\u03cb\u03d0"+
		"\7k\2\2\u03cc\u03d0\7h\2\2\u03cd\u03d0\7g\2\2\u03ce\u03d0\7i\2\2\u03cf"+
		"\u03c4\3\2\2\2\u03cf\u03c5\3\2\2\2\u03cf\u03c6\3\2\2\2\u03cf\u03c7\3\2"+
		"\2\2\u03cf\u03c8\3\2\2\2\u03cf\u03c9\3\2\2\2\u03cf\u03ca\3\2\2\2\u03cf"+
		"\u03cb\3\2\2\2\u03cf\u03cc\3\2\2\2\u03cf\u03cd\3\2\2\2\u03cf\u03ce\3\2"+
		"\2\2\u03d0W\3\2\2\2\u03d1\u03d2\b-\1\2\u03d2\u03d3\5T+\2\u03d3\u03d9\3"+
		"\2\2\2\u03d4\u03d5\f\3\2\2\u03d5\u03d6\7t\2\2\u03d6\u03d8\5T+\2\u03d7"+
		"\u03d4\3\2\2\2\u03d8\u03db\3\2\2\2\u03d9\u03d7\3\2\2\2\u03d9\u03da\3\2"+
		"\2\2\u03daY\3\2\2\2\u03db\u03d9\3\2\2\2\u03dc\u03dd\5R*\2\u03dd[\3\2\2"+
		"\2\u03de\u03f9\5^\60\2\u03df\u03e1\5\u00d2j\2\u03e0\u03df\3\2\2\2\u03e0"+
		"\u03e1\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03f9\5`\61\2\u03e3\u03e5\5\u00d2"+
		"j\2\u03e4\u03e3\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6"+
		"\u03f9\5b\62\2\u03e7\u03e9\5\u00d2j\2\u03e8\u03e7\3\2\2\2\u03e8\u03e9"+
		"\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03f9\5f\64\2\u03eb\u03ed\5\u00d2j"+
		"\2\u03ec\u03eb\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03f9"+
		"\5l\67\2\u03ef\u03f1\5\u00d2j\2\u03f0\u03ef\3\2\2\2\u03f0\u03f1\3\2\2"+
		"\2\u03f1\u03f2\3\2\2\2\u03f2\u03f9\5t;\2\u03f3\u03f9\5v<\2\u03f4\u03f6"+
		"\5\u00d2j\2\u03f5\u03f4\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u03f7\3\2\2"+
		"\2\u03f7\u03f9\5\u0170\u00b9\2\u03f8\u03de\3\2\2\2\u03f8\u03e0\3\2\2\2"+
		"\u03f8\u03e4\3\2\2\2\u03f8\u03e8\3\2\2\2\u03f8\u03ec\3\2\2\2\u03f8\u03f0"+
		"\3\2\2\2\u03f8\u03f3\3\2\2\2\u03f8\u03f5\3\2\2\2\u03f9]\3\2\2\2\u03fa"+
		"\u03fc\5\u00d2j\2\u03fb\u03fa\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03fd"+
		"\3\2\2\2\u03fd\u03fe\7~\2\2\u03fe\u03ff\7x\2\2\u03ff\u040f\5\\/\2\u0400"+
		"\u0402\5\u00d2j\2\u0401\u0400\3\2\2\2\u0401\u0402\3\2\2\2\u0402\u0403"+
		"\3\2\2\2\u0403\u0404\7\n\2\2\u0404\u0405\5Z.\2\u0405\u0406\7x\2\2\u0406"+
		"\u0407\5\\/\2\u0407\u040f\3\2\2\2\u0408\u040a\5\u00d2j\2\u0409\u0408\3"+
		"\2\2\2\u0409\u040a\3\2\2\2\u040a\u040b\3\2\2\2\u040b\u040c\7\25\2\2\u040c"+
		"\u040d\7x\2\2\u040d\u040f\5\\/\2\u040e\u03fb\3\2\2\2\u040e\u0401\3\2\2"+
		"\2\u040e\u0409\3\2\2\2\u040f_\3\2\2\2\u0410\u0412\5X-\2\u0411\u0410\3"+
		"\2\2\2\u0411\u0412\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u0414\7z\2\2\u0414"+
		"a\3\2\2\2\u0415\u0417\7S\2\2\u0416\u0418\5d\63\2\u0417\u0416\3\2\2\2\u0417"+
		"\u0418\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u041a\7T\2\2\u041ac\3\2\2\2\u041b"+
		"\u041c\b\63\1\2\u041c\u041d\5\\/\2\u041d\u0422\3\2\2\2\u041e\u041f\f\3"+
		"\2\2\u041f\u0421\5\\/\2\u0420\u041e\3\2\2\2\u0421\u0424\3\2\2\2\u0422"+
		"\u0420\3\2\2\2\u0422\u0423\3\2\2\2\u0423e\3\2\2\2\u0424\u0422\3\2\2\2"+
		"\u0425\u0426\7%\2\2\u0426\u0427\7O\2\2\u0427\u0428\5j\66\2\u0428\u0429"+
		"\7P\2\2\u0429\u042a\5\\/\2\u042a\u043b\3\2\2\2\u042b\u042c\7%\2\2\u042c"+
		"\u042d\7O\2\2\u042d\u042e\5j\66\2\u042e\u042f\7P\2\2\u042f\u0430\5\\/"+
		"\2\u0430\u0431\7\32\2\2\u0431\u0432\5\\/\2\u0432\u043b\3\2\2\2\u0433\u0434"+
		"\7=\2\2\u0434\u0435\7O\2\2\u0435\u0436\5j\66\2\u0436\u0437\7P\2\2\u0437"+
		"\u0438\5\\/\2\u0438\u043b\3\2\2\2\u0439\u043b\5h\65\2\u043a\u0425\3\2"+
		"\2\2\u043a\u042b\3\2\2\2\u043a\u0433\3\2\2\2\u043a\u0439\3\2\2\2\u043b"+
		"g\3\2\2\2\u043c\u043d\7%\2\2\u043d\u043e\7`\2\2\u043e\u043f\5j\66\2\u043f"+
		"\u0440\7a\2\2\u0440\u0441\5\\/\2\u0441\u044b\3\2\2\2\u0442\u0443\7%\2"+
		"\2\u0443\u0444\7`\2\2\u0444\u0445\5j\66\2\u0445\u0446\7a\2\2\u0446\u0447"+
		"\5\\/\2\u0447\u0448\7\32\2\2\u0448\u0449\5\\/\2\u0449\u044b\3\2\2\2\u044a"+
		"\u043c\3\2\2\2\u044a\u0442\3\2\2\2\u044bi\3\2\2\2\u044c\u045d\5X-\2\u044d"+
		"\u044f\5\u00d2j\2\u044e\u044d\3\2\2\2\u044e\u044f\3\2\2\2\u044f\u0450"+
		"\3\2\2\2\u0450\u0451\5\u008aF\2\u0451\u0452\5\u00ecw\2\u0452\u0453\7_"+
		"\2\2\u0453\u0454\5\u011a\u008e\2\u0454\u045d\3\2\2\2\u0455\u0457\5\u00d2"+
		"j\2\u0456\u0455\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u0458\3\2\2\2\u0458"+
		"\u0459\5\u008aF\2\u0459\u045a\5\u00ecw\2\u045a\u045b\5\u011e\u0090\2\u045b"+
		"\u045d\3\2\2\2\u045c\u044c\3\2\2\2\u045c\u044e\3\2\2\2\u045c\u0456\3\2"+
		"\2\2\u045dk\3\2\2\2\u045e\u045f\7N\2\2\u045f\u0460\7O\2\2\u0460\u0461"+
		"\5j\66\2\u0461\u0462\7P\2\2\u0462\u0463\5\\/\2\u0463\u0482\3\2\2\2\u0464"+
		"\u0465\7\27\2\2\u0465\u0466\5\\/\2\u0466\u0467\7N\2\2\u0467\u0468\7O\2"+
		"\2\u0468\u0469\5X-\2\u0469\u046a\7P\2\2\u046a\u046b\7z\2\2\u046b\u0482"+
		"\3\2\2\2\u046c\u046d\7\"\2\2\u046d\u046e\7O\2\2\u046e\u0470\5n8\2\u046f"+
		"\u0471\5j\66\2\u0470\u046f\3\2\2\2\u0470\u0471\3\2\2\2\u0471\u0472\3\2"+
		"\2\2\u0472\u0474\7z\2\2\u0473\u0475\5X-\2\u0474\u0473\3\2\2\2\u0474\u0475"+
		"\3\2\2\2\u0475\u0476\3\2\2\2\u0476\u0477\7P\2\2\u0477\u0478\5\\/\2\u0478"+
		"\u0482\3\2\2\2\u0479\u047a\7\"\2\2\u047a\u047b\7O\2\2\u047b\u047c\5p9"+
		"\2\u047c\u047d\7x\2\2\u047d\u047e\5r:\2\u047e\u047f\7P\2\2\u047f\u0480"+
		"\5\\/\2\u0480\u0482\3\2\2\2\u0481\u045e\3\2\2\2\u0481\u0464\3\2\2\2\u0481"+
		"\u046c\3\2\2\2\u0481\u0479\3\2\2\2\u0482m\3\2\2\2\u0483\u0486\5`\61\2"+
		"\u0484\u0486\5\u0080A\2\u0485\u0483\3\2\2\2\u0485\u0484\3\2\2\2\u0486"+
		"o\3\2\2\2\u0487\u0489\5\u00d2j\2\u0488\u0487\3\2\2\2\u0488\u0489\3\2\2"+
		"\2\u0489\u048a\3\2\2\2\u048a\u048b\5\u008aF\2\u048b\u048c\5\u00ecw\2\u048c"+
		"q\3\2\2\2\u048d\u0490\5X-\2\u048e\u0490\5\u011e\u0090\2\u048f\u048d\3"+
		"\2\2\2\u048f\u048e\3\2\2\2\u0490s\3\2\2\2\u0491\u0492\7\t\2\2\u0492\u04a2"+
		"\7z\2\2\u0493\u0494\7\23\2\2\u0494\u04a2\7z\2\2\u0495\u0497\7\65\2\2\u0496"+
		"\u0498\5X-\2\u0497\u0496\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u0499\3\2\2"+
		"\2\u0499\u04a2\7z\2\2\u049a\u049b\7\65\2\2\u049b\u049c\5\u011e\u0090\2"+
		"\u049c\u049d\7z\2\2\u049d\u04a2\3\2\2\2\u049e\u049f\7$\2\2\u049f\u04a0"+
		"\7~\2\2\u04a0\u04a2\7z\2\2\u04a1\u0491\3\2\2\2\u04a1\u0493\3\2\2\2\u04a1"+
		"\u0495\3\2\2\2\u04a1\u049a\3\2\2\2\u04a1\u049e\3\2\2\2\u04a2u\3\2\2\2"+
		"\u04a3\u04a4\5|?\2\u04a4w\3\2\2\2\u04a5\u04a6\b=\1\2\u04a6\u04a7\5z>\2"+
		"\u04a7\u04ac\3\2\2\2\u04a8\u04a9\f\3\2\2\u04a9\u04ab\5z>\2\u04aa\u04a8"+
		"\3\2\2\2\u04ab\u04ae\3\2\2\2\u04ac\u04aa\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad"+
		"y\3\2\2\2\u04ae\u04ac\3\2\2\2\u04af\u04b9\5|?\2\u04b0\u04b9\5\u0112\u008a"+
		"\2\u04b1\u04b9\5\u0158\u00ad\2\u04b2\u04b9\5\u016c\u00b7\2\u04b3\u04b9"+
		"\5\u016e\u00b8\2\u04b4\u04b9\5\u00d0i\2\u04b5\u04b9\5\u00b8]\2\u04b6\u04b9"+
		"\5\u0084C\2\u04b7\u04b9\5\u0086D\2\u04b8\u04af\3\2\2\2\u04b8\u04b0\3\2"+
		"\2\2\u04b8\u04b1\3\2\2\2\u04b8\u04b2\3\2\2\2\u04b8\u04b3\3\2\2\2\u04b8"+
		"\u04b4\3\2\2\2\u04b8\u04b5\3\2\2\2\u04b8\u04b6\3\2\2\2\u04b8\u04b7\3\2"+
		"\2\2\u04b9{\3\2\2\2\u04ba\u04c3\5\u0080A\2\u04bb\u04c3\5\u00ceh\2\u04bc"+
		"\u04c3\5\u00c6d\2\u04bd\u04c3\5\u00caf\2\u04be\u04c3\5\u00ccg\2\u04bf"+
		"\u04c3\5\u0082B\2\u04c0\u04c3\5~@\2\u04c1\u04c3\5\u00a8U\2\u04c2\u04ba"+
		"\3\2\2\2\u04c2\u04bb\3\2\2\2\u04c2\u04bc\3\2\2\2\u04c2\u04bd\3\2\2\2\u04c2"+
		"\u04be\3\2\2\2\u04c2\u04bf\3\2\2\2\u04c2\u04c0\3\2\2\2\u04c2\u04c1\3\2"+
		"\2\2\u04c3}\3\2\2\2\u04c4\u04c5\7I\2\2\u04c5\u04c7\7~\2\2\u04c6\u04c8"+
		"\5\u00d2j\2\u04c7\u04c6\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04c9\3\2\2"+
		"\2\u04c9\u04ca\7_\2\2\u04ca\u04cb\5\u0100\u0081\2\u04cb\u04cc\7z\2\2\u04cc"+
		"\177\3\2\2\2\u04cd\u04cf\5\u008aF\2\u04ce\u04cd\3\2\2\2\u04ce\u04cf\3"+
		"\2\2\2\u04cf\u04d1\3\2\2\2\u04d0\u04d2\5\u00e8u\2\u04d1\u04d0\3\2\2\2"+
		"\u04d1\u04d2\3\2\2\2\u04d2\u04d3\3\2\2\2\u04d3\u04dc\7z\2\2\u04d4\u04d6"+
		"\5\u00d2j\2\u04d5\u04d7\5\u008aF\2\u04d6\u04d5\3\2\2\2\u04d6\u04d7\3\2"+
		"\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04d9\5\u00e8u\2\u04d9\u04da\7z\2\2\u04da"+
		"\u04dc\3\2\2\2\u04db\u04ce\3\2\2\2\u04db\u04d4\3\2\2\2\u04dc\u0081\3\2"+
		"\2\2\u04dd\u04de\7:\2\2\u04de\u04df\7O\2\2\u04df\u04e0\5Z.\2\u04e0\u04e1"+
		"\7t\2\2\u04e1\u04e2\7\u0087\2\2\u04e2\u04e3\7P\2\2\u04e3\u04e4\7z\2\2"+
		"\u04e4\u0083\3\2\2\2\u04e5\u04e6\7z\2\2\u04e6\u0085\3\2\2\2\u04e7\u04e8"+
		"\5\u00d2j\2\u04e8\u04e9\7z\2\2\u04e9\u0087\3\2\2\2\u04ea\u04f1\5\u008c"+
		"G\2\u04eb\u04f1\5\u0092J\2\u04ec\u04f1\5\u008eH\2\u04ed\u04f1\7#\2\2\u04ee"+
		"\u04f1\7D\2\2\u04ef\u04f1\7\21\2\2\u04f0\u04ea\3\2\2\2\u04f0\u04eb\3\2"+
		"\2\2\u04f0\u04ec\3\2\2\2\u04f0\u04ed\3\2\2\2\u04f0\u04ee\3\2\2\2\u04f0"+
		"\u04ef\3\2\2\2\u04f1\u0089\3\2\2\2\u04f2\u04f4\5\u0088E\2\u04f3\u04f5"+
		"\5\u00d2j\2\u04f4\u04f3\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u04fa\3\2\2"+
		"\2\u04f6\u04f7\5\u0088E\2\u04f7\u04f8\5\u008aF\2\u04f8\u04fa\3\2\2\2\u04f9"+
		"\u04f2\3\2\2\2\u04f9\u04f6\3\2\2\2\u04fa\u008b\3\2\2\2\u04fb\u04fc\t\4"+
		"\2\2\u04fc\u008d\3\2\2\2\u04fd\u04fe\t\5\2\2\u04fe\u008f\3\2\2\2\u04ff"+
		"\u0500\7~\2\2\u0500\u0091\3\2\2\2\u0501\u0505\5\u0094K\2\u0502\u0505\5"+
		"\u0122\u0092\2\u0503\u0505\5\u00a4S\2\u0504\u0501\3\2\2\2\u0504\u0502"+
		"\3\2\2\2\u0504\u0503\3\2\2\2\u0505\u0093\3\2\2\2\u0506\u050b\5\u009aN"+
		"\2\u0507\u050b\5\u00a0Q\2\u0508\u050b\5\u016a\u00b6\2\u0509\u050b\5\u00fa"+
		"~\2\u050a\u0506\3\2\2\2\u050a\u0507\3\2\2\2\u050a\u0508\3\2\2\2\u050a"+
		"\u0509\3\2\2\2\u050b\u0095\3\2\2\2\u050c\u050e\5\u0092J\2\u050d\u050f"+
		"\5\u00d2j\2\u050e\u050d\3\2\2\2\u050e\u050f\3\2\2\2\u050f\u0514\3\2\2"+
		"\2\u0510\u0511\5\u0092J\2\u0511\u0512\5\u0096L\2\u0512\u0514\3\2\2\2\u0513"+
		"\u050c\3\2\2\2\u0513\u0510\3\2\2\2\u0514\u0097\3\2\2\2\u0515\u0517\5\u0094"+
		"K\2\u0516\u0518\5\u00d2j\2\u0517\u0516\3\2\2\2\u0517\u0518\3\2\2\2\u0518"+
		"\u051d\3\2\2\2\u0519\u051a\5\u0094K\2\u051a\u051b\5\u0098M\2\u051b\u051d"+
		"\3\2\2\2\u051c\u0515\3\2\2\2\u051c\u0519\3\2\2\2\u051d\u0099\3\2\2\2\u051e"+
		"\u0520\5\f\7\2\u051f\u051e\3\2\2\2\u051f\u0520\3\2\2\2\u0520\u0521\3\2"+
		"\2\2\u0521\u0536\5\u009cO\2\u0522\u0523\5\f\7\2\u0523\u0524\7>\2\2\u0524"+
		"\u0525\5\u0160\u00b1\2\u0525\u0536\3\2\2\2\u0526\u0536\7\f\2\2\u0527\u0536"+
		"\7\r\2\2\u0528\u0536\7\16\2\2\u0529\u0536\7M\2\2\u052a\u0536\7\b\2\2\u052b"+
		"\u0536\7\66\2\2\u052c\u0536\7\'\2\2\u052d\u0536\7(\2\2\u052e\u0536\7\67"+
		"\2\2\u052f\u0536\7H\2\2\u0530\u0536\7!\2\2\u0531\u0536\7\30\2\2\u0532"+
		"\u0536\7K\2\2\u0533\u0536\7\7\2\2\u0534\u0536\5\u009eP\2\u0535\u051f\3"+
		"\2\2\2\u0535\u0522\3\2\2\2\u0535\u0526\3\2\2\2\u0535\u0527\3\2\2\2\u0535"+
		"\u0528\3\2\2\2\u0535\u0529\3\2\2\2\u0535\u052a\3\2\2\2\u0535\u052b\3\2"+
		"\2\2\u0535\u052c\3\2\2\2\u0535\u052d\3\2\2\2\u0535\u052e\3\2\2\2\u0535"+
		"\u052f\3\2\2\2\u0535\u0530\3\2\2\2\u0535\u0531\3\2\2\2\u0535\u0532\3\2"+
		"\2\2\u0535\u0533\3\2\2\2\u0535\u0534\3\2\2\2\u0536\u009b\3\2\2\2\u0537"+
		"\u053c\5\u0120\u0091\2\u0538\u053c\5\u00a2R\2\u0539\u053c\5\u0090I\2\u053a"+
		"\u053c\5\u0160\u00b1\2\u053b\u0537\3\2\2\2\u053b\u0538\3\2\2\2\u053b\u0539"+
		"\3\2\2\2\u053b\u053a\3\2\2\2\u053c\u009d\3\2\2\2\u053d\u053e\7\24\2\2"+
		"\u053e\u053f\7O\2\2\u053f\u0540\5X-\2\u0540\u0541\7P\2\2\u0541\u0547\3"+
		"\2\2\2\u0542\u0543\7\24\2\2\u0543\u0544\7O\2\2\u0544\u0545\7\7\2\2\u0545"+
		"\u0547\7P\2\2\u0546\u053d\3\2\2\2\u0546\u0542\3\2\2\2\u0547\u009f\3\2"+
		"\2\2\u0548\u054a\5\u012a\u0096\2\u0549\u054b\5\u00d2j\2\u054a\u0549\3"+
		"\2\2\2\u054a\u054b\3\2\2\2\u054b\u054d\3\2\2\2\u054c\u054e\5\f\7\2\u054d"+
		"\u054c\3\2\2\2\u054d\u054e\3\2\2\2\u054e\u054f\3\2\2\2\u054f\u0550\7~"+
		"\2\2\u0550\u0561\3\2\2\2\u0551\u0552\5\u012a\u0096\2\u0552\u0553\5\u0160"+
		"\u00b1\2\u0553\u0561\3\2\2\2\u0554\u0555\5\u012a\u0096\2\u0555\u0557\5"+
		"\f\7\2\u0556\u0558\7>\2\2\u0557\u0556\3\2\2\2\u0557\u0558\3\2\2\2\u0558"+
		"\u0559\3\2\2\2\u0559\u055a\5\u0160\u00b1\2\u055a\u0561\3\2\2\2\u055b\u055d"+
		"\7\33\2\2\u055c\u055e\5\f\7\2\u055d\u055c\3\2\2\2\u055d\u055e\3\2\2\2"+
		"\u055e\u055f\3\2\2\2\u055f\u0561\7~\2\2\u0560\u0548\3\2\2\2\u0560\u0551"+
		"\3\2\2\2\u0560\u0554\3\2\2\2\u0560\u055b\3\2\2\2\u0561\u00a1\3\2\2\2\u0562"+
		"\u0563\7~\2\2\u0563\u00a3\3\2\2\2\u0564\u0565\5\u00a6T\2\u0565\u0567\7"+
		"S\2\2\u0566\u0568\5\u00aeX\2\u0567\u0566\3\2\2\2\u0567\u0568\3\2\2\2\u0568"+
		"\u0569\3\2\2\2\u0569\u056a\7T\2\2\u056a\u0572\3\2\2\2\u056b\u056c\5\u00a6"+
		"T\2\u056c\u056d\7S\2\2\u056d\u056e\5\u00aeX\2\u056e\u056f\7t\2\2\u056f"+
		"\u0570\7T\2\2\u0570\u0572\3\2\2\2\u0571\u0564\3\2\2\2\u0571\u056b\3\2"+
		"\2\2\u0572\u00a5\3\2\2\2\u0573\u0575\5\u00aaV\2\u0574\u0576\5\u00d2j\2"+
		"\u0575\u0574\3\2\2\2\u0575\u0576\3\2\2\2\u0576\u0578\3\2\2\2\u0577\u0579"+
		"\7~\2\2\u0578\u0577\3\2\2\2\u0578\u0579\3\2\2\2\u0579\u057b\3\2\2\2\u057a"+
		"\u057c\5\u00acW\2\u057b\u057a\3\2\2\2\u057b\u057c\3\2\2\2\u057c\u0587"+
		"\3\2\2\2\u057d\u057f\5\u00aaV\2\u057e\u0580\5\u00d2j\2\u057f\u057e\3\2"+
		"\2\2\u057f\u0580\3\2\2\2\u0580\u0581\3\2\2\2\u0581\u0582\5\f\7\2\u0582"+
		"\u0584\7~\2\2\u0583\u0585\5\u00acW\2\u0584\u0583\3\2\2\2\u0584\u0585\3"+
		"\2\2\2\u0585\u0587\3\2\2\2\u0586\u0573\3\2\2\2\u0586\u057d\3\2\2\2\u0587"+
		"\u00a7\3\2\2\2\u0588\u058a\5\u00aaV\2\u0589\u058b\5\u00d2j\2\u058a\u0589"+
		"\3\2\2\2\u058a\u058b\3\2\2\2\u058b\u058c\3\2\2\2\u058c\u058e\7~\2\2\u058d"+
		"\u058f\5\u00acW\2\u058e\u058d\3\2\2\2\u058e\u058f\3\2\2\2\u058f\u0590"+
		"\3\2\2\2\u0590\u0591\7z\2\2\u0591\u00a9\3\2\2\2\u0592\u0598\7\33\2\2\u0593"+
		"\u0594\7\33\2\2\u0594\u0598\7\17\2\2\u0595\u0596\7\33\2\2\u0596\u0598"+
		"\7<\2\2\u0597\u0592\3\2\2\2\u0597\u0593\3\2\2\2\u0597\u0595\3\2\2\2\u0598"+
		"\u00ab\3\2\2\2\u0599\u059a\7x\2\2\u059a\u059b\5\u0096L\2\u059b\u00ad\3"+
		"\2\2\2\u059c\u059d\bX\1\2\u059d\u059e\5\u00b0Y\2\u059e\u05a4\3\2\2\2\u059f"+
		"\u05a0\f\3\2\2\u05a0\u05a1\7t\2\2\u05a1\u05a3\5\u00b0Y\2\u05a2\u059f\3"+
		"\2\2\2\u05a3\u05a6\3\2\2\2\u05a4\u05a2\3\2\2\2\u05a4\u05a5\3\2\2\2\u05a5"+
		"\u00af\3\2\2\2\u05a6\u05a4\3\2\2\2\u05a7\u05ad\5\u00b2Z\2\u05a8\u05a9"+
		"\5\u00b2Z\2\u05a9\u05aa\7_\2\2\u05aa\u05ab\5Z.\2\u05ab\u05ad\3\2\2\2\u05ac"+
		"\u05a7\3\2\2\2\u05ac\u05a8\3\2\2\2\u05ad\u00b1\3\2\2\2\u05ae\u05af\7~"+
		"\2\2\u05af\u00b3\3\2\2\2\u05b0\u05b3\5\u00b6\\\2\u05b1\u05b3\5\u00c4c"+
		"\2\u05b2\u05b0\3\2\2\2\u05b2\u05b1\3\2\2\2\u05b3\u00b5\3\2\2\2\u05b4\u05b5"+
		"\7~\2\2\u05b5\u00b7\3\2\2\2\u05b6\u05b9\5\u00ba^\2\u05b7\u05b9\5\u00c0"+
		"a\2\u05b8\u05b6\3\2\2\2\u05b8\u05b7\3\2\2\2\u05b9\u00b9\3\2\2\2\u05ba"+
		"\u05bd\5\u00bc_\2\u05bb\u05bd\5\u00be`\2\u05bc\u05ba\3\2\2\2\u05bc\u05bb"+
		"\3\2\2\2\u05bd\u00bb\3\2\2\2\u05be\u05c0\7&\2\2\u05bf\u05be\3\2\2\2\u05bf"+
		"\u05c0\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1\u05c2\7*\2\2\u05c2\u05c3\7~\2"+
		"\2\u05c3\u05c4\7S\2\2\u05c4\u05c5\5\u00c2b\2\u05c5\u05c6\7T\2\2\u05c6"+
		"\u00bd\3\2\2\2\u05c7\u05c9\7&\2\2\u05c8\u05c7\3\2\2\2\u05c8\u05c9\3\2"+
		"\2\2\u05c9\u05ca\3\2\2\2\u05ca\u05cb\7*\2\2\u05cb\u05cc\5\u00b6\\\2\u05cc"+
		"\u05cd\7S\2\2\u05cd\u05ce\5\u00c2b\2\u05ce\u05cf\7T\2\2\u05cf\u00bf\3"+
		"\2\2\2\u05d0\u05d2\7&\2\2\u05d1\u05d0\3\2\2\2\u05d1\u05d2\3\2\2\2\u05d2"+
		"\u05d3\3\2\2\2\u05d3\u05d4\7*\2\2\u05d4\u05d5\7S\2\2\u05d5\u05d6\5\u00c2"+
		"b\2\u05d6\u05d7\7T\2\2\u05d7\u00c1\3\2\2\2\u05d8\u05da\5x=\2\u05d9\u05d8"+
		"\3\2\2\2\u05d9\u05da\3\2\2\2\u05da\u00c3\3\2\2\2\u05db\u05dc\7~\2\2\u05dc"+
		"\u00c5\3\2\2\2\u05dd\u05de\7*\2\2\u05de\u05df\7~\2\2\u05df\u05e0\7_\2"+
		"\2\u05e0\u05e1\5\u00c8e\2\u05e1\u05e2\7z\2\2\u05e2\u00c7\3\2\2\2\u05e3"+
		"\u05e5\5\f\7\2\u05e4\u05e3\3\2\2\2\u05e4\u05e5\3\2\2\2\u05e5\u05e6\3\2"+
		"\2\2\u05e6\u05e7\5\u00b4[\2\u05e7\u00c9\3\2\2\2\u05e8\u05ea\7I\2\2\u05e9"+
		"\u05eb\7F\2\2\u05ea\u05e9\3\2\2\2\u05ea\u05eb\3\2\2\2\u05eb\u05ec\3\2"+
		"\2\2\u05ec\u05ed\5\f\7\2\u05ed\u05ee\5\b\5\2\u05ee\u05ef\7z\2\2\u05ef"+
		"\u05f6\3\2\2\2\u05f0\u05f1\7I\2\2\u05f1\u05f2\7y\2\2\u05f2\u05f3\5\b\5"+
		"\2\u05f3\u05f4\7z\2\2\u05f4\u05f6\3\2\2\2\u05f5\u05e8\3\2\2\2\u05f5\u05f0"+
		"\3\2\2\2\u05f6\u00cb\3\2\2\2\u05f7\u05f9\5\u00d2j\2\u05f8\u05f7\3\2\2"+
		"\2\u05f8\u05f9\3\2\2\2\u05f9\u05fa\3\2\2\2\u05fa\u05fb\7I\2\2\u05fb\u05fd"+
		"\7*\2\2\u05fc\u05fe\5\f\7\2\u05fd\u05fc\3\2\2\2\u05fd\u05fe\3\2\2\2\u05fe"+
		"\u05ff\3\2\2\2\u05ff\u0600\5\u00b4[\2\u0600\u0601\7z\2\2\u0601\u00cd\3"+
		"\2\2\2\u0602\u0603\7\6\2\2\u0603\u0604\7O\2\2\u0604\u0605\7\u0087\2\2"+
		"\u0605\u0606\7P\2\2\u0606\u0607\7z\2\2\u0607\u00cf\3\2\2\2\u0608\u0609"+
		"\7\36\2\2\u0609\u060a\7\u0087\2\2\u060a\u060c\7S\2\2\u060b\u060d\5x=\2"+
		"\u060c\u060b\3\2\2\2\u060c\u060d\3\2\2\2\u060d\u060e\3\2\2\2\u060e\u0613"+
		"\7T\2\2\u060f\u0610\7\36\2\2\u0610\u0611\7\u0087\2\2\u0611\u0613\5z>\2"+
		"\u0612\u0608\3\2\2\2\u0612\u060f\3\2\2\2\u0613\u00d1\3\2\2\2\u0614\u0615"+
		"\bj\1\2\u0615\u0616\5\u00d4k\2\u0616\u061b\3\2\2\2\u0617\u0618\f\3\2\2"+
		"\u0618\u061a\5\u00d4k\2\u0619\u0617\3\2\2\2\u061a\u061d\3\2\2\2\u061b"+
		"\u0619\3\2\2\2\u061b\u061c\3\2\2\2\u061c\u00d3\3\2\2\2\u061d\u061b\3\2"+
		"\2\2\u061e\u061f\7Q\2\2\u061f\u0620\7Q\2\2\u0620\u0621\5\u00d8m\2\u0621"+
		"\u0622\7R\2\2\u0622\u0623\7R\2\2\u0623\u0626\3\2\2\2\u0624\u0626\5\u00d6"+
		"l\2\u0625\u061e\3\2\2\2\u0625\u0624\3\2\2\2\u0626\u00d5\3\2\2\2\u0627"+
		"\u0628\7\4\2\2\u0628\u0629\7O\2\2\u0629\u062b\5\u0100\u0081\2\u062a\u062c"+
		"\7}\2\2\u062b\u062a\3\2\2\2\u062b\u062c\3\2\2\2\u062c\u062d\3\2\2\2\u062d"+
		"\u062e\7P\2\2\u062e\u0638\3\2\2\2\u062f\u0630\7\4\2\2\u0630\u0631\7O\2"+
		"\2\u0631\u0633\5Z.\2\u0632\u0634\7}\2\2\u0633\u0632\3\2\2\2\u0633\u0634"+
		"\3\2\2\2\u0634\u0635\3\2\2\2\u0635\u0636\7P\2\2\u0636\u0638\3\2\2\2\u0637"+
		"\u0627\3\2\2\2\u0637\u062f\3\2\2\2\u0638\u00d7\3\2\2\2\u0639\u063b\bm"+
		"\1\2\u063a\u063c\5\u00dan\2\u063b\u063a\3\2\2\2\u063b\u063c\3\2\2\2\u063c"+
		"\u0641\3\2\2\2\u063d\u063e\5\u00dan\2\u063e\u063f\7}\2\2\u063f\u0641\3"+
		"\2\2\2\u0640\u0639\3\2\2\2\u0640\u063d\3\2\2\2\u0641\u064e\3\2\2\2\u0642"+
		"\u0643\f\5\2\2\u0643\u0645\7t\2\2\u0644\u0646\5\u00dan\2\u0645\u0644\3"+
		"\2\2\2\u0645\u0646\3\2\2\2\u0646\u064d\3\2\2\2\u0647\u0648\f\3\2\2\u0648"+
		"\u0649\7t\2\2\u0649\u064a\5\u00dan\2\u064a\u064b\7}\2\2\u064b\u064d\3"+
		"\2\2\2\u064c\u0642\3\2\2\2\u064c\u0647\3\2\2\2\u064d\u0650\3\2\2\2\u064e"+
		"\u064c\3\2\2\2\u064e\u064f\3\2\2\2\u064f\u00d9\3\2\2\2\u0650\u064e\3\2"+
		"\2\2\u0651\u0653\5\u00dco\2\u0652\u0654\5\u00e2r\2\u0653\u0652\3\2\2\2"+
		"\u0653\u0654\3\2\2\2\u0654\u00db\3\2\2\2\u0655\u0658\7~\2\2\u0656\u0658"+
		"\5\u00dep\2\u0657\u0655\3\2\2\2\u0657\u0656\3\2\2\2\u0658\u00dd\3\2\2"+
		"\2\u0659\u065a\5\u00e0q\2\u065a\u065b\7y\2\2\u065b\u065c\7~\2\2\u065c"+
		"\u00df\3\2\2\2\u065d\u065e\7~\2\2\u065e\u00e1\3\2\2\2\u065f\u0660\7O\2"+
		"\2\u0660\u0661\5\u00e4s\2\u0661\u0662\7P\2\2\u0662\u00e3\3\2\2\2\u0663"+
		"\u0665\bs\1\2\u0664\u0666\5\u00e6t\2\u0665\u0664\3\2\2\2\u0665\u0666\3"+
		"\2\2\2\u0666\u066b\3\2\2\2\u0667\u0668\f\3\2\2\u0668\u066a\5\u00e6t\2"+
		"\u0669\u0667\3\2\2\2\u066a\u066d\3\2\2\2\u066b\u0669\3\2\2\2\u066b\u066c"+
		"\3\2\2\2\u066c\u00e5\3\2\2\2\u066d\u066b\3\2\2\2\u066e\u066f\7O\2\2\u066f"+
		"\u0670\5\u00e4s\2\u0670\u0671\7P\2\2\u0671\u067b\3\2\2\2\u0672\u0673\7"+
		"Q\2\2\u0673\u0674\5\u00e4s\2\u0674\u0675\7R\2\2\u0675\u067b\3\2\2\2\u0676"+
		"\u0677\7S\2\2\u0677\u0678\5\u00e4s\2\u0678\u0679\7T\2\2\u0679\u067b\3"+
		"\2\2\2\u067a\u066e\3\2\2\2\u067a\u0672\3\2\2\2\u067a\u0676\3\2\2\2\u067b"+
		"\u00e7\3\2\2\2\u067c\u067d\bu\1\2\u067d\u067e\5\u00eav\2\u067e\u0684\3"+
		"\2\2\2\u067f\u0680\f\3\2\2\u0680\u0681\7t\2\2\u0681\u0683\5\u00eav\2\u0682"+
		"\u067f\3\2\2\2\u0683\u0686\3\2\2\2\u0684\u0682\3\2\2\2\u0684\u0685\3\2"+
		"\2\2\u0685\u00e9\3\2\2\2\u0686\u0684\3\2\2\2\u0687\u0689\5\u00ecw\2\u0688"+
		"\u068a\5\u0116\u008c\2\u0689\u0688\3\2\2\2\u0689\u068a\3\2\2\2\u068a\u00eb"+
		"\3\2\2\2\u068b\u0691\5\u00eex\2\u068c\u068d\5\u00f0y\2\u068d\u068e\5\u00f2"+
		"z\2\u068e\u068f\5\u00f4{\2\u068f\u0691\3\2\2\2\u0690\u068b\3\2\2\2\u0690"+
		"\u068c\3\2\2\2\u0691\u00ed\3\2\2\2\u0692\u0697\5\u00f0y\2\u0693\u0694"+
		"\5\u00f6|\2\u0694\u0695\5\u00eex\2\u0695\u0697\3\2\2\2\u0696\u0692\3\2"+
		"\2\2\u0696\u0693\3\2\2\2\u0697\u00ef\3\2\2\2\u0698\u0699\by\1\2\u0699"+
		"\u069b\5\u00fe\u0080\2\u069a\u069c\5\u00d2j\2\u069b\u069a\3\2\2\2\u069b"+
		"\u069c\3\2\2\2\u069c\u06a2\3\2\2\2\u069d\u069e\7O\2\2\u069e\u069f\5\u00ee"+
		"x\2\u069f\u06a0\7P\2\2\u06a0\u06a2\3\2\2\2\u06a1\u0698\3\2\2\2\u06a1\u069d"+
		"\3\2\2\2\u06a2\u06b0\3\2\2\2\u06a3\u06a4\f\5\2\2\u06a4\u06af\5\u00f2z"+
		"\2\u06a5\u06a6\f\4\2\2\u06a6\u06a8\7Q\2\2\u06a7\u06a9\5Z.\2\u06a8\u06a7"+
		"\3\2\2\2\u06a8\u06a9\3\2\2\2\u06a9\u06aa\3\2\2\2\u06aa\u06ac\7R\2\2\u06ab"+
		"\u06ad\5\u00d2j\2\u06ac\u06ab\3\2\2\2\u06ac\u06ad\3\2\2\2\u06ad\u06af"+
		"\3\2\2\2\u06ae\u06a3\3\2\2\2\u06ae\u06a5\3\2\2\2\u06af\u06b2\3\2\2\2\u06b0"+
		"\u06ae\3\2\2\2\u06b0\u06b1\3\2\2\2\u06b1\u00f1\3\2\2\2\u06b2\u06b0\3\2"+
		"\2\2\u06b3\u06b4\7O\2\2\u06b4\u06b5\5\u010c\u0087\2\u06b5\u06b7\7P\2\2"+
		"\u06b6\u06b8\5\u00f8}\2\u06b7\u06b6\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8"+
		"\u06ba\3\2\2\2\u06b9\u06bb\5\u00fc\177\2\u06ba\u06b9\3\2\2\2\u06ba\u06bb"+
		"\3\2\2\2\u06bb\u06bd\3\2\2\2\u06bc\u06be\5\u017c\u00bf\2\u06bd\u06bc\3"+
		"\2\2\2\u06bd\u06be\3\2\2\2\u06be\u06c0\3\2\2\2\u06bf\u06c1\5\u00d2j\2"+
		"\u06c0\u06bf\3\2\2\2\u06c0\u06c1\3\2\2\2\u06c1\u00f3\3\2\2\2\u06c2\u06c3"+
		"\7v\2\2\u06c3\u06c5\5\u0098M\2\u06c4\u06c6\5\u0102\u0082\2\u06c5\u06c4"+
		"\3\2\2\2\u06c5\u06c6\3\2\2\2\u06c6\u00f5\3\2\2\2\u06c7\u06c9\7W\2\2\u06c8"+
		"\u06ca\5\u00d2j\2\u06c9\u06c8\3\2\2\2\u06c9\u06ca\3\2\2\2\u06ca\u06cc"+
		"\3\2\2\2\u06cb\u06cd\5\u00f8}\2\u06cc\u06cb\3\2\2\2\u06cc\u06cd\3\2\2"+
		"\2\u06cd\u06df\3\2\2\2\u06ce\u06d0\7[\2\2\u06cf\u06d1\5\u00d2j\2\u06d0"+
		"\u06cf\3\2\2\2\u06d0\u06d1\3\2\2\2\u06d1\u06df\3\2\2\2\u06d2\u06d4\7p"+
		"\2\2\u06d3\u06d5\5\u00d2j\2\u06d4\u06d3\3\2\2\2\u06d4\u06d5\3\2\2\2\u06d5"+
		"\u06df\3\2\2\2\u06d6\u06d7\5\f\7\2\u06d7\u06d9\7W\2\2\u06d8\u06da\5\u00d2"+
		"j\2\u06d9\u06d8\3\2\2\2\u06d9\u06da\3\2\2\2\u06da\u06dc\3\2\2\2\u06db"+
		"\u06dd\5\u00f8}\2\u06dc\u06db\3\2\2\2\u06dc\u06dd\3\2\2\2\u06dd\u06df"+
		"\3\2\2\2\u06de\u06c7\3\2\2\2\u06de\u06ce\3\2\2\2\u06de\u06d2\3\2\2\2\u06de"+
		"\u06d6\3\2\2\2\u06df\u00f7\3\2\2\2\u06e0\u06e2\5\u00fa~\2\u06e1\u06e3"+
		"\5\u00f8}\2\u06e2\u06e1\3\2\2\2\u06e2\u06e3\3\2\2\2\u06e3\u00f9\3\2\2"+
		"\2\u06e4\u06e5\t\6\2\2\u06e5\u00fb\3\2\2\2\u06e6\u06e7\t\7\2\2\u06e7\u00fd"+
		"\3\2\2\2\u06e8\u06ea\7}\2\2\u06e9\u06e8\3\2\2\2\u06e9\u06ea\3\2\2\2\u06ea"+
		"\u06eb\3\2\2\2\u06eb\u06ec\5\6\4\2\u06ec\u00ff\3\2\2\2\u06ed\u06ef\5\u0096"+
		"L\2\u06ee\u06f0\5\u0102\u0082\2\u06ef\u06ee\3\2\2\2\u06ef\u06f0\3\2\2"+
		"\2\u06f0\u0101\3\2\2\2\u06f1\u06fa\5\u0104\u0083\2\u06f2\u06f4\5\u0106"+
		"\u0084\2\u06f3\u06f2\3\2\2\2\u06f3\u06f4\3\2\2\2\u06f4\u06f5\3\2\2\2\u06f5"+
		"\u06f6\5\u00f2z\2\u06f6\u06f7\5\u00f4{\2\u06f7\u06fa\3\2\2\2\u06f8\u06fa"+
		"\5\u0108\u0085\2\u06f9\u06f1\3\2\2\2\u06f9\u06f3\3\2\2\2\u06f9\u06f8\3"+
		"\2\2\2\u06fa\u0103\3\2\2\2\u06fb\u0701\5\u0106\u0084\2\u06fc\u06fe\5\u00f6"+
		"|\2\u06fd\u06ff\5\u0104\u0083\2\u06fe\u06fd\3\2\2\2\u06fe\u06ff\3\2\2"+
		"\2\u06ff\u0701\3\2\2\2\u0700\u06fb\3\2\2\2\u0700\u06fc\3\2\2\2\u0701\u0105"+
		"\3\2\2\2\u0702\u0703\b\u0084\1\2\u0703\u0711\5\u00f2z\2\u0704\u0706\7"+
		"Q\2\2\u0705\u0707\5Z.\2\u0706\u0705\3\2\2\2\u0706\u0707\3\2\2\2\u0707"+
		"\u0708\3\2\2\2\u0708\u070a\7R\2\2\u0709\u070b\5\u00d2j\2\u070a\u0709\3"+
		"\2\2\2\u070a\u070b\3\2\2\2\u070b\u0711\3\2\2\2\u070c\u070d\7O\2\2\u070d"+
		"\u070e\5\u0104\u0083\2\u070e\u070f\7P\2\2\u070f\u0711\3\2\2\2\u0710\u0702"+
		"\3\2\2\2\u0710\u0704\3\2\2\2\u0710\u070c\3\2\2\2\u0711\u071f\3\2\2\2\u0712"+
		"\u0713\f\7\2\2\u0713\u071e\5\u00f2z\2\u0714\u0715\f\5\2\2\u0715\u0717"+
		"\7Q\2\2\u0716\u0718\5Z.\2\u0717\u0716\3\2\2\2\u0717\u0718\3\2\2\2\u0718"+
		"\u0719\3\2\2\2\u0719\u071b\7R\2\2\u071a\u071c\5\u00d2j\2\u071b\u071a\3"+
		"\2\2\2\u071b\u071c\3\2\2\2\u071c\u071e\3\2\2\2\u071d\u0712\3\2\2\2\u071d"+
		"\u0714\3\2\2\2\u071e\u0721\3\2\2\2\u071f\u071d\3\2\2\2\u071f\u0720\3\2"+
		"\2\2\u0720\u0107\3\2\2\2\u0721\u071f\3\2\2\2\u0722\u0727\5\u010a\u0086"+
		"\2\u0723\u0724\5\u00f6|\2\u0724\u0725\5\u0108\u0085\2\u0725\u0727\3\2"+
		"\2\2\u0726\u0722\3\2\2\2\u0726\u0723\3\2\2\2\u0727\u0109\3\2\2\2\u0728"+
		"\u0729\b\u0086\1\2\u0729\u072a\7}\2\2\u072a\u0738\3\2\2\2\u072b\u072c"+
		"\f\5\2\2\u072c\u0737\5\u00f2z\2\u072d\u072e\f\4\2\2\u072e\u0730\7Q\2\2"+
		"\u072f\u0731\5Z.\2\u0730\u072f\3\2\2\2\u0730\u0731\3\2\2\2\u0731\u0732"+
		"\3\2\2\2\u0732\u0734\7R\2\2\u0733\u0735\5\u00d2j\2\u0734\u0733\3\2\2\2"+
		"\u0734\u0735\3\2\2\2\u0735\u0737\3\2\2\2\u0736\u072b\3\2\2\2\u0736\u072d"+
		"\3\2\2\2\u0737\u073a\3\2\2\2\u0738\u0736\3\2\2\2\u0738\u0739\3\2\2\2\u0739"+
		"\u010b\3\2\2\2\u073a\u0738\3\2\2\2\u073b\u073d\5\u010e\u0088\2\u073c\u073b"+
		"\3\2\2\2\u073c\u073d\3\2\2\2\u073d\u073f\3\2\2\2\u073e\u0740\7}\2\2\u073f"+
		"\u073e\3\2\2\2\u073f\u0740\3\2\2\2\u0740\u0746\3\2\2\2\u0741\u0742\5\u010e"+
		"\u0088\2\u0742\u0743\7t\2\2\u0743\u0744\7}\2\2\u0744\u0746\3\2\2\2\u0745"+
		"\u073c\3\2\2\2\u0745\u0741\3\2\2\2\u0746\u010d\3\2\2\2\u0747\u0748\b\u0088"+
		"\1\2\u0748\u0749\5\u0110\u0089\2\u0749\u074f\3\2\2\2\u074a\u074b\f\3\2"+
		"\2\u074b\u074c\7t\2\2\u074c\u074e\5\u0110\u0089\2\u074d\u074a\3\2\2\2"+
		"\u074e\u0751\3\2\2\2\u074f\u074d\3\2\2\2\u074f\u0750\3\2\2\2\u0750\u010f"+
		"\3\2\2\2\u0751\u074f\3\2\2\2\u0752\u0754\5\u00d2j\2\u0753\u0752\3\2\2"+
		"\2\u0753\u0754\3\2\2\2\u0754\u0755\3\2\2\2\u0755\u0756\5\u008aF\2\u0756"+
		"\u0757\5\u00ecw\2\u0757\u0772\3\2\2\2\u0758\u075a\5\u00d2j\2\u0759\u0758"+
		"\3\2\2\2\u0759\u075a\3\2\2\2\u075a\u075b\3\2\2\2\u075b\u075c\5\u008aF"+
		"\2\u075c\u075d\5\u00ecw\2\u075d\u075e\7_\2\2\u075e\u075f\5\u011a\u008e"+
		"\2\u075f\u0772\3\2\2\2\u0760\u0762\5\u00d2j\2\u0761\u0760\3\2\2\2\u0761"+
		"\u0762\3\2\2\2\u0762\u0763\3\2\2\2\u0763\u0765\5\u008aF\2\u0764\u0766"+
		"\5\u0102\u0082\2\u0765\u0764\3\2\2\2\u0765\u0766\3\2\2\2\u0766\u0772\3"+
		"\2\2\2\u0767\u0769\5\u00d2j\2\u0768\u0767\3\2\2\2\u0768\u0769\3\2\2\2"+
		"\u0769\u076a\3\2\2\2\u076a\u076c\5\u008aF\2\u076b\u076d\5\u0102\u0082"+
		"\2\u076c\u076b\3\2\2\2\u076c\u076d\3\2\2\2\u076d\u076e\3\2\2\2\u076e\u076f"+
		"\7_\2\2\u076f\u0770\5\u011a\u008e\2\u0770\u0772\3\2\2\2\u0771\u0753\3"+
		"\2\2\2\u0771\u0759\3\2\2\2\u0771\u0761\3\2\2\2\u0771\u0768\3\2\2\2\u0772"+
		"\u0111\3\2\2\2\u0773\u0775\5\u00d2j\2\u0774\u0773\3\2\2\2\u0774\u0775"+
		"\3\2\2\2\u0775\u0777\3\2\2\2\u0776\u0778\5\u008aF\2\u0777\u0776\3\2\2"+
		"\2\u0777\u0778\3\2\2\2\u0778\u0779\3\2\2\2\u0779\u077b\5\u00ecw\2\u077a"+
		"\u077c\5\u0134\u009b\2\u077b\u077a\3\2\2\2\u077b\u077c\3\2\2\2\u077c\u077d"+
		"\3\2\2\2\u077d\u077e\5\u0114\u008b\2\u077e\u0113\3\2\2\2\u077f\u0781\5"+
		"\u014c\u00a7\2\u0780\u077f\3\2\2\2\u0780\u0781\3\2\2\2\u0781\u0782\3\2"+
		"\2\2\u0782\u078b\5b\62\2\u0783\u078b\5\u0172\u00ba\2\u0784\u0785\7_\2"+
		"\2\u0785\u0786\7\25\2\2\u0786\u078b\7z\2\2\u0787\u0788\7_\2\2\u0788\u0789"+
		"\7\26\2\2\u0789\u078b\7z\2\2\u078a\u0780\3\2\2\2\u078a\u0783\3\2\2\2\u078a"+
		"\u0784\3\2\2\2\u078a\u0787\3\2\2\2\u078b\u0115\3\2\2\2\u078c\u0792\5\u0118"+
		"\u008d\2\u078d\u078e\7O\2\2\u078e\u078f\5\"\22\2\u078f\u0790\7P\2\2\u0790"+
		"\u0792\3\2\2\2\u0791\u078c\3\2\2\2\u0791\u078d\3\2\2\2\u0792\u0117\3\2"+
		"\2\2\u0793\u0794\7_\2\2\u0794\u0797\5\u011a\u008e\2\u0795\u0797\5\u011e"+
		"\u0090\2\u0796\u0793\3\2\2\2\u0796\u0795\3\2\2\2\u0797\u0119\3\2\2\2\u0798"+
		"\u079b\5T+\2\u0799\u079b\5\u011e\u0090\2\u079a\u0798\3\2\2\2\u079a\u0799"+
		"\3\2\2\2\u079b\u011b\3\2\2\2\u079c\u079d\b\u008f\1\2\u079d\u079f\5\u011a"+
		"\u008e\2\u079e\u07a0\7}\2\2\u079f\u079e\3\2\2\2\u079f\u07a0\3\2\2\2\u07a0"+
		"\u07a9\3\2\2\2\u07a1\u07a2\f\3\2\2\u07a2\u07a3\7t\2\2\u07a3\u07a5\5\u011a"+
		"\u008e\2\u07a4\u07a6\7}\2\2\u07a5\u07a4\3\2\2\2\u07a5\u07a6\3\2\2\2\u07a6"+
		"\u07a8\3\2\2\2\u07a7\u07a1\3\2\2\2\u07a8\u07ab\3\2\2\2\u07a9\u07a7\3\2"+
		"\2\2\u07a9\u07aa\3\2\2\2\u07aa\u011d\3\2\2\2\u07ab\u07a9\3\2\2\2\u07ac"+
		"\u07ad\7S\2\2\u07ad\u07af\5\u011c\u008f\2\u07ae\u07b0\7t\2\2\u07af\u07ae"+
		"\3\2\2\2\u07af\u07b0\3\2\2\2\u07b0\u07b1\3\2\2\2\u07b1\u07b2\7T\2\2\u07b2"+
		"\u07b6\3\2\2\2\u07b3\u07b4\7S\2\2\u07b4\u07b6\7T\2\2\u07b5\u07ac\3\2\2"+
		"\2\u07b5\u07b3\3\2\2\2\u07b6\u011f\3\2\2\2\u07b7\u07ba\7~\2\2\u07b8\u07ba"+
		"\5\u0160\u00b1\2\u07b9\u07b7\3\2\2\2\u07b9\u07b8\3\2\2\2\u07ba\u0121\3"+
		"\2\2\2\u07bb\u07bc\5\u0124\u0093\2\u07bc\u07be\7S\2\2\u07bd\u07bf\5\u012c"+
		"\u0097\2\u07be\u07bd\3\2\2\2\u07be\u07bf\3\2\2\2\u07bf\u07c0\3\2\2\2\u07c0"+
		"\u07c1\7T\2\2\u07c1\u0123\3\2\2\2\u07c2\u07c4\5\u012a\u0096\2\u07c3\u07c5"+
		"\5\u00d2j\2\u07c4\u07c3\3\2\2\2\u07c4\u07c5\3\2\2\2\u07c5\u07c6\3\2\2"+
		"\2\u07c6\u07c8\5\u0126\u0094\2\u07c7\u07c9\5\u0128\u0095\2\u07c8\u07c7"+
		"\3\2\2\2\u07c8\u07c9\3\2\2\2\u07c9\u07cb\3\2\2\2\u07ca\u07cc\5\u013a\u009e"+
		"\2\u07cb\u07ca\3\2\2\2\u07cb\u07cc\3\2\2\2\u07cc\u07d5\3\2\2\2\u07cd\u07cf"+
		"\5\u012a\u0096\2\u07ce\u07d0\5\u00d2j\2\u07cf\u07ce\3\2\2\2\u07cf\u07d0"+
		"\3\2\2\2\u07d0\u07d2\3\2\2\2\u07d1\u07d3\5\u013a\u009e\2\u07d2\u07d1\3"+
		"\2\2\2\u07d2\u07d3\3\2\2\2\u07d3\u07d5\3\2\2\2\u07d4\u07c2\3\2\2\2\u07d4"+
		"\u07cd\3\2\2\2\u07d5\u0125\3\2\2\2\u07d6\u07d8\5\f\7\2\u07d7\u07d6\3\2"+
		"\2\2\u07d7\u07d8\3\2\2\2\u07d8\u07d9\3\2\2\2\u07d9\u07da\5\u0120\u0091"+
		"\2\u07da\u0127\3\2\2\2\u07db\u07dc\7 \2\2\u07dc\u0129\3\2\2\2\u07dd\u07de"+
		"\t\b\2\2\u07de\u012b\3\2\2\2\u07df\u07e1\5\u012e\u0098\2\u07e0\u07e2\5"+
		"\u012c\u0097\2\u07e1\u07e0\3\2\2\2\u07e1\u07e2\3\2\2\2\u07e2\u07e9\3\2"+
		"\2\2\u07e3\u07e4\5\u0144\u00a3\2\u07e4\u07e6\7x\2\2\u07e5\u07e7\5\u012c"+
		"\u0097\2\u07e6\u07e5\3\2\2\2\u07e6\u07e7\3\2\2\2\u07e7\u07e9\3\2\2\2\u07e8"+
		"\u07df\3\2\2\2\u07e8\u07e3\3\2\2\2\u07e9\u012d\3\2\2\2\u07ea\u07ec\5\u00d2"+
		"j\2\u07eb\u07ea\3\2\2\2\u07eb\u07ec\3\2\2\2\u07ec\u07ee\3\2\2\2\u07ed"+
		"\u07ef\5\u008aF\2\u07ee\u07ed\3\2\2\2\u07ee\u07ef\3\2\2\2\u07ef\u07f1"+
		"\3\2\2\2\u07f0\u07f2\5\u0130\u0099\2\u07f1\u07f0\3\2\2\2\u07f1\u07f2\3"+
		"\2\2\2\u07f2\u07f3\3\2\2\2\u07f3\u07fb\7z\2\2\u07f4\u07fb\5\u0112\u008a"+
		"\2\u07f5\u07fb\5\u00caf\2\u07f6\u07fb\5\u0082B\2\u07f7\u07fb\5\u0158\u00ad"+
		"\2\u07f8\u07fb\5~@\2\u07f9\u07fb\5\u0084C\2\u07fa\u07eb\3\2\2\2\u07fa"+
		"\u07f4\3\2\2\2\u07fa\u07f5\3\2\2\2\u07fa\u07f6\3\2\2\2\u07fa\u07f7\3\2"+
		"\2\2\u07fa\u07f8\3\2\2\2\u07fa\u07f9\3\2\2\2\u07fb\u012f\3\2\2\2\u07fc"+
		"\u07fd\b\u0099\1\2\u07fd\u07fe\5\u0132\u009a\2\u07fe\u0804\3\2\2\2\u07ff"+
		"\u0800\f\3\2\2\u0800\u0801\7t\2\2\u0801\u0803\5\u0132\u009a\2\u0802\u07ff"+
		"\3\2\2\2\u0803\u0806\3\2\2\2\u0804\u0802\3\2\2\2\u0804\u0805\3\2\2\2\u0805"+
		"\u0131\3\2\2\2\u0806\u0804\3\2\2\2\u0807\u0809\5\u00ecw\2\u0808\u080a"+
		"\5\u0134\u009b\2\u0809\u0808\3\2\2\2\u0809\u080a\3\2\2\2\u080a\u080c\3"+
		"\2\2\2\u080b\u080d\5\u0138\u009d\2\u080c\u080b\3\2\2\2\u080c\u080d\3\2"+
		"\2\2\u080d\u081b\3\2\2\2\u080e\u0810\5\u00ecw\2\u080f\u0811\5\u0118\u008d"+
		"\2\u0810\u080f\3\2\2\2\u0810\u0811\3\2\2\2\u0811\u081b\3\2\2\2\u0812\u0814"+
		"\7~\2\2\u0813\u0812\3\2\2\2\u0813\u0814\3\2\2\2\u0814\u0816\3\2\2\2\u0815"+
		"\u0817\5\u00d2j\2\u0816\u0815\3\2\2\2\u0816\u0817\3\2\2\2\u0817\u0818"+
		"\3\2\2\2\u0818\u0819\7x\2\2\u0819\u081b\5Z.\2\u081a\u0807\3\2\2\2\u081a"+
		"\u080e\3\2\2\2\u081a\u0813\3\2\2\2\u081b\u0133\3\2\2\2\u081c\u081d\b\u009b"+
		"\1\2\u081d\u081e\5\u0136\u009c\2\u081e\u0823\3\2\2\2\u081f\u0820\f\3\2"+
		"\2\u0820\u0822\5\u0136\u009c\2\u0821\u081f\3\2\2\2\u0822\u0825\3\2\2\2"+
		"\u0823\u0821\3\2\2\2\u0823\u0824\3\2\2\2\u0824\u0135\3\2\2\2\u0825\u0823"+
		"\3\2\2\2\u0826\u0827\t\t\2\2\u0827\u0137\3\2\2\2\u0828\u0829\7_\2\2\u0829"+
		"\u082a\7\u0081\2\2\u082a\u082b\b\u009d\1\2\u082b\u0139\3\2\2\2\u082c\u082d"+
		"\7x\2\2\u082d\u082e\5\u013c\u009f\2\u082e\u013b\3\2\2\2\u082f\u0830\b"+
		"\u009f\1\2\u0830\u0832\5\u013e\u00a0\2\u0831\u0833\7}\2\2\u0832\u0831"+
		"\3\2\2\2\u0832\u0833\3\2\2\2\u0833\u083c\3\2\2\2\u0834\u0835\f\3\2\2\u0835"+
		"\u0836\7t\2\2\u0836\u0838\5\u013e\u00a0\2\u0837\u0839\7}\2\2\u0838\u0837"+
		"\3\2\2\2\u0838\u0839\3\2\2\2\u0839\u083b\3\2\2\2\u083a\u0834\3\2\2\2\u083b"+
		"\u083e\3\2\2\2\u083c\u083a\3\2\2\2\u083c\u083d\3\2\2\2\u083d\u013d\3\2"+
		"\2\2\u083e\u083c\3\2\2\2\u083f\u0841\5\u00d2j\2\u0840\u083f\3\2\2\2\u0840"+
		"\u0841\3\2\2\2\u0841\u0842\3\2\2\2\u0842\u0855\5\u0142\u00a2\2\u0843\u0845"+
		"\5\u00d2j\2\u0844\u0843\3\2\2\2\u0844\u0845\3\2\2\2\u0845\u0846\3\2\2"+
		"\2\u0846\u0848\7J\2\2\u0847\u0849\5\u0144\u00a3\2\u0848\u0847\3\2\2\2"+
		"\u0848\u0849\3\2\2\2\u0849\u084a\3\2\2\2\u084a\u0855\5\u0142\u00a2\2\u084b"+
		"\u084d\5\u00d2j\2\u084c\u084b\3\2\2\2\u084c\u084d\3\2\2\2\u084d\u084e"+
		"\3\2\2\2\u084e\u0850\5\u0144\u00a3\2\u084f\u0851\7J\2\2\u0850\u084f\3"+
		"\2\2\2\u0850\u0851\3\2\2\2\u0851\u0852\3\2\2\2\u0852\u0853\5\u0142\u00a2"+
		"\2\u0853\u0855\3\2\2\2\u0854\u0840\3\2\2\2\u0854\u0844\3\2\2\2\u0854\u084c"+
		"\3\2\2\2\u0855\u013f\3\2\2\2\u0856\u0858\5\f\7\2\u0857\u0856\3\2\2\2\u0857"+
		"\u0858\3\2\2\2\u0858\u0859\3\2\2\2\u0859\u085c\5\u0120\u0091\2\u085a\u085c"+
		"\5\u009eP\2\u085b\u0857\3\2\2\2\u085b\u085a\3\2\2\2\u085c\u0141\3\2\2"+
		"\2\u085d\u085e\5\u0140\u00a1\2\u085e\u0143\3\2\2\2\u085f\u0860\t\n\2\2"+
		"\u0860\u0145\3\2\2\2\u0861\u0862\7.\2\2\u0862\u0863\5\u0148\u00a5\2\u0863"+
		"\u0147\3\2\2\2\u0864\u0866\5\u0096L\2\u0865\u0867\5\u014a\u00a6\2\u0866"+
		"\u0865\3\2\2\2\u0866\u0867\3\2\2\2\u0867\u0149\3\2\2\2\u0868\u086a\5\u00f6"+
		"|\2\u0869\u086b\5\u014a\u00a6\2\u086a\u0869\3\2\2\2\u086a\u086b\3\2\2"+
		"\2\u086b\u014b\3\2\2\2\u086c\u086d\7x\2\2\u086d\u086e\5\u014e\u00a8\2"+
		"\u086e\u014d\3\2\2\2\u086f\u0871\5\u0150\u00a9\2\u0870\u0872\7}\2\2\u0871"+
		"\u0870\3\2\2\2\u0871\u0872\3\2\2\2\u0872\u087b\3\2\2\2\u0873\u0875\5\u0150"+
		"\u00a9\2\u0874\u0876\7}\2\2\u0875\u0874\3\2\2\2\u0875\u0876\3\2\2\2\u0876"+
		"\u0877\3\2\2\2\u0877\u0878\7t\2\2\u0878\u0879\5\u014e\u00a8\2\u0879\u087b"+
		"\3\2\2\2\u087a\u086f\3\2\2\2\u087a\u0873\3\2\2\2\u087b\u014f\3\2\2\2\u087c"+
		"\u087d\5\u0152\u00aa\2\u087d\u087f\7O\2\2\u087e\u0880\5\"\22\2\u087f\u087e"+
		"\3\2\2\2\u087f\u0880\3\2\2\2\u0880\u0881\3\2\2\2\u0881\u0882\7P\2\2\u0882"+
		"\u0887\3\2\2\2\u0883\u0884\5\u0152\u00aa\2\u0884\u0885\5\u011e\u0090\2"+
		"\u0885\u0887\3\2\2\2\u0886\u087c\3\2\2\2\u0886\u0883\3\2\2\2\u0887\u0151"+
		"\3\2\2\2\u0888\u088b\5\u0140\u00a1\2\u0889\u088b\7~\2\2\u088a\u0888\3"+
		"\2\2\2\u088a\u0889\3\2\2\2\u088b\u0153\3\2\2\2\u088c\u088d\7.\2\2\u088d"+
		"\u088e\5\u0188\u00c5\2\u088e\u0155\3\2\2\2\u088f\u0890\7.\2\2\u0890\u0891"+
		"\7\u0087\2\2\u0891\u0895\7~\2\2\u0892\u0893\7.\2\2\u0893\u0895\7\u008a"+
		"\2\2\u0894\u088f\3\2\2\2\u0894\u0892\3\2\2\2\u0895\u0157\3\2\2\2\u0896"+
		"\u0897\7>\2\2\u0897\u0898\7`\2\2\u0898\u0899\5\u015a\u00ae\2\u0899\u089a"+
		"\7a\2\2\u089a\u089b\5z>\2\u089b\u0159\3\2\2\2\u089c\u089d\b\u00ae\1\2"+
		"\u089d\u089e\5\u015c\u00af\2\u089e\u08a4\3\2\2\2\u089f\u08a0\f\3\2\2\u08a0"+
		"\u08a1\7t\2\2\u08a1\u08a3\5\u015c\u00af\2\u08a2\u089f\3\2\2\2\u08a3\u08a6"+
		"\3\2\2\2\u08a4\u08a2\3\2\2\2\u08a4\u08a5\3\2\2\2\u08a5\u015b\3\2\2\2\u08a6"+
		"\u08a4\3\2\2\2\u08a7\u08aa\5\u015e\u00b0\2\u08a8\u08aa\5\u0110\u0089\2"+
		"\u08a9\u08a7\3\2\2\2\u08a9\u08a8\3\2\2\2\u08aa\u015d\3\2\2\2\u08ab\u08ad"+
		"\7\17\2\2\u08ac\u08ae\7}\2\2\u08ad\u08ac\3\2\2\2\u08ad\u08ae\3\2\2\2\u08ae"+
		"\u08b0\3\2\2\2\u08af\u08b1\7~\2\2\u08b0\u08af\3\2\2\2\u08b0\u08b1\3\2"+
		"\2\2\u08b1\u08dc\3\2\2\2\u08b2\u08b4\7\17\2\2\u08b3\u08b5\7~\2\2\u08b4"+
		"\u08b3\3\2\2\2\u08b4\u08b5\3\2\2\2\u08b5\u08b6\3\2\2\2\u08b6\u08b7\7_"+
		"\2\2\u08b7\u08dc\5\u0100\u0081\2\u08b8\u08ba\7F\2\2\u08b9\u08bb\7}\2\2"+
		"\u08ba\u08b9\3\2\2\2\u08ba\u08bb\3\2\2\2\u08bb\u08bd\3\2\2\2\u08bc\u08be"+
		"\7~\2\2\u08bd\u08bc\3\2\2\2\u08bd\u08be\3\2\2\2\u08be\u08dc\3\2\2\2\u08bf"+
		"\u08c1\7F\2\2\u08c0\u08c2\7~\2\2\u08c1\u08c0\3\2\2\2\u08c1\u08c2\3\2\2"+
		"\2\u08c2\u08c3\3\2\2\2\u08c3\u08c4\7_\2\2\u08c4\u08dc\5\u0100\u0081\2"+
		"\u08c5\u08c6\7>\2\2\u08c6\u08c7\7`\2\2\u08c7\u08c8\5\u015a\u00ae\2\u08c8"+
		"\u08c9\7a\2\2\u08c9\u08cb\7\17\2\2\u08ca\u08cc\7}\2\2\u08cb\u08ca\3\2"+
		"\2\2\u08cb\u08cc\3\2\2\2\u08cc\u08ce\3\2\2\2\u08cd\u08cf\7~\2\2\u08ce"+
		"\u08cd\3\2\2\2\u08ce\u08cf\3\2\2\2\u08cf\u08dc\3\2\2\2\u08d0\u08d1\7>"+
		"\2\2\u08d1\u08d2\7`\2\2\u08d2\u08d3\5\u015a\u00ae\2\u08d3\u08d4\7a\2\2"+
		"\u08d4\u08d6\7\17\2\2\u08d5\u08d7\7~\2\2\u08d6\u08d5\3\2\2\2\u08d6\u08d7"+
		"\3\2\2\2\u08d7\u08d8\3\2\2\2\u08d8\u08d9\7_\2\2\u08d9\u08da\5\6\4\2\u08da"+
		"\u08dc\3\2\2\2\u08db\u08ab\3\2\2\2\u08db\u08b2\3\2\2\2\u08db\u08b8\3\2"+
		"\2\2\u08db\u08bf\3\2\2\2\u08db\u08c5\3\2\2\2\u08db\u08d0\3\2\2\2\u08dc"+
		"\u015f\3\2\2\2\u08dd\u08de\5\u0164\u00b3\2\u08de\u08e0\7`\2\2\u08df\u08e1"+
		"\5\u0166\u00b4\2\u08e0\u08df\3\2\2\2\u08e0\u08e1\3\2\2\2\u08e1\u08e2\3"+
		"\2\2\2\u08e2\u08e3\7a\2\2\u08e3\u0161\3\2\2\2\u08e4\u08f4\5\u0160\u00b1"+
		"\2\u08e5\u08e6\5\u0154\u00ab\2\u08e6\u08e8\7`\2\2\u08e7\u08e9\5\u0166"+
		"\u00b4\2\u08e8\u08e7\3\2\2\2\u08e8\u08e9\3\2\2\2\u08e9\u08ea\3\2\2\2\u08ea"+
		"\u08eb\7a\2\2\u08eb\u08f4\3\2\2\2\u08ec\u08ed\5\u0156\u00ac\2\u08ed\u08ef"+
		"\7`\2\2\u08ee\u08f0\5\u0166\u00b4\2\u08ef\u08ee\3\2\2\2\u08ef\u08f0\3"+
		"\2\2\2\u08f0\u08f1\3\2\2\2\u08f1\u08f2\7a\2\2\u08f2\u08f4\3\2\2\2\u08f3"+
		"\u08e4\3\2\2\2\u08f3\u08e5\3\2\2\2\u08f3\u08ec\3\2\2\2\u08f4\u0163\3\2"+
		"\2\2\u08f5\u08f6\7~\2\2\u08f6\u0165\3\2\2\2\u08f7\u08f8\b\u00b4\1\2\u08f8"+
		"\u08fa\5\u0168\u00b5\2\u08f9\u08fb\7}\2\2\u08fa\u08f9\3\2\2\2\u08fa\u08fb"+
		"\3\2\2\2\u08fb\u0904\3\2\2\2\u08fc\u08fd\f\3\2\2\u08fd\u08fe\7t\2\2\u08fe"+
		"\u0900\5\u0168\u00b5\2\u08ff\u0901\7}\2\2\u0900\u08ff\3\2\2\2\u0900\u0901"+
		"\3\2\2\2\u0901\u0903\3\2\2\2\u0902\u08fc\3\2\2\2\u0903\u0906\3\2\2\2\u0904"+
		"\u0902\3\2\2\2\u0904\u0905\3\2\2\2\u0905\u0167\3\2\2\2\u0906\u0904\3\2"+
		"\2\2\u0907\u090b\5Z.\2\u0908\u090b\5\u0100\u0081\2\u0909\u090b\5\6\4\2"+
		"\u090a\u0907\3\2\2\2\u090a\u0908\3\2\2\2\u090a\u0909\3\2\2\2\u090b\u0169"+
		"\3\2\2\2\u090c\u090d\7F\2\2\u090d\u090e\5\f\7\2\u090e\u090f\7~\2\2\u090f"+
		"\u0918\3\2\2\2\u0910\u0911\7F\2\2\u0911\u0913\5\f\7\2\u0912\u0914\7>\2"+
		"\2\u0913\u0912\3\2\2\2\u0913\u0914\3\2\2\2\u0914\u0915\3\2\2\2\u0915\u0916"+
		"\5\u0160\u00b1\2\u0916\u0918\3\2\2\2\u0917\u090c\3\2\2\2\u0917\u0910\3"+
		"\2\2\2\u0918\u016b\3\2\2\2\u0919\u091b\7\36\2\2\u091a\u0919\3\2\2\2\u091a"+
		"\u091b\3\2\2\2\u091b\u091c\3\2\2\2\u091c\u091d\7>\2\2\u091d\u091e\5z>"+
		"\2\u091e\u016d\3\2\2\2\u091f\u0920\7>\2\2\u0920\u0921\7`\2\2\u0921\u0922"+
		"\7a\2\2\u0922\u0923\5z>\2\u0923\u016f\3\2\2\2\u0924\u0925\7C\2\2\u0925"+
		"\u0926\5b\62\2\u0926\u0927\5\u0174\u00bb\2\u0927\u0171\3\2\2\2\u0928\u092a"+
		"\7C\2\2\u0929\u092b\5\u014c\u00a7\2\u092a\u0929\3\2\2\2\u092a\u092b\3"+
		"\2\2\2\u092b\u092c\3\2\2\2\u092c\u092d\5b\62\2\u092d\u092e\5\u0174\u00bb"+
		"\2\u092e\u0173\3\2\2\2\u092f\u0931\5\u0176\u00bc\2\u0930\u0932\5\u0174"+
		"\u00bb\2\u0931\u0930\3\2\2\2\u0931\u0932\3\2\2\2\u0932\u0175\3\2\2\2\u0933"+
		"\u0934\7\13\2\2\u0934\u0935\7O\2\2\u0935\u0936\5\u0178\u00bd\2\u0936\u0937"+
		"\7P\2\2\u0937\u0938\5b\62\2\u0938\u0177\3\2\2\2\u0939\u093b\5\u00d2j\2"+
		"\u093a\u0939\3\2\2\2\u093a\u093b\3\2\2\2\u093b\u093c\3\2\2\2\u093c\u093d"+
		"\5\u0096L\2\u093d\u093e\5\u00ecw\2\u093e\u0948\3\2\2\2\u093f\u0941\5\u00d2"+
		"j\2\u0940\u093f\3\2\2\2\u0940\u0941\3\2\2\2\u0941\u0942\3\2\2\2\u0942"+
		"\u0944\5\u0096L\2\u0943\u0945\5\u0102\u0082\2\u0944\u0943\3\2\2\2\u0944"+
		"\u0945\3\2\2\2\u0945\u0948\3\2\2\2\u0946\u0948\7}\2\2\u0947\u093a\3\2"+
		"\2\2\u0947\u0940\3\2\2\2\u0947\u0946\3\2\2\2\u0948\u0179\3\2\2\2\u0949"+
		"\u094b\7A\2\2\u094a\u094c\5T+\2\u094b\u094a\3\2\2\2\u094b\u094c\3\2\2"+
		"\2\u094c\u017b\3\2\2\2\u094d\u0950\5\u017e\u00c0\2\u094e\u0950\5\u0182"+
		"\u00c2\2\u094f\u094d\3\2\2\2\u094f\u094e\3\2\2\2\u0950\u017d\3\2\2\2\u0951"+
		"\u0952\7A\2\2\u0952\u0954\7O\2\2\u0953\u0955\5\u0180\u00c1\2\u0954\u0953"+
		"\3\2\2\2\u0954\u0955\3\2\2\2\u0955\u0956\3\2\2\2\u0956\u0957\7P\2\2\u0957"+
		"\u017f\3\2\2\2\u0958\u0959\b\u00c1\1\2\u0959\u095b\5\u0100\u0081\2\u095a"+
		"\u095c\7}\2\2\u095b\u095a\3\2\2\2\u095b\u095c\3\2\2\2\u095c\u0965\3\2"+
		"\2\2\u095d\u095e\f\3\2\2\u095e\u095f\7t\2\2\u095f\u0961\5\u0100\u0081"+
		"\2\u0960\u0962\7}\2\2\u0961\u0960\3\2\2\2\u0961\u0962\3\2\2\2\u0962\u0964"+
		"\3\2\2\2\u0963\u095d\3\2\2\2\u0964\u0967\3\2\2\2\u0965\u0963\3\2\2\2\u0965"+
		"\u0966\3\2\2\2\u0966\u0181\3\2\2\2\u0967\u0965\3\2\2\2\u0968\u0969\7,"+
		"\2\2\u0969\u096a\7O\2\2\u096a\u096b\5Z.\2\u096b\u096c\7P\2\2\u096c\u096f"+
		"\3\2\2\2\u096d\u096f\7,\2\2\u096e\u0968\3\2\2\2\u096e\u096d\3\2\2\2\u096f"+
		"\u0183\3\2\2\2\u0970\u0971\7a\2\2\u0971\u0972\7a\2\2\u0972\u0185\3\2\2"+
		"\2\u0973\u0974\7a\2\2\u0974\u0975\7a\2\2\u0975\u0976\7_\2\2\u0976\u0187"+
		"\3\2\2\2\u0977\u09a8\7+\2\2\u0978\u09a8\7\26\2\2\u0979\u097a\7+\2\2\u097a"+
		"\u097b\7Q\2\2\u097b\u09a8\7R\2\2\u097c\u097d\7\26\2\2\u097d\u097e\7Q\2"+
		"\2\u097e\u09a8\7R\2\2\u097f\u09a8\7U\2\2\u0980\u09a8\7V\2\2\u0981\u09a8"+
		"\7W\2\2\u0982\u09a8\7X\2\2\u0983\u09a8\7Y\2\2\u0984\u09a8\7Z\2\2\u0985"+
		"\u09a8\7[\2\2\u0986\u09a8\7\\\2\2\u0987\u09a8\7]\2\2\u0988\u09a8\7^\2"+
		"\2\u0989\u09a8\7_\2\2\u098a\u09a8\7`\2\2\u098b\u09a8\7a\2\2\u098c\u09a8"+
		"\7b\2\2\u098d\u09a8\7c\2\2\u098e\u09a8\7d\2\2\u098f\u09a8\7e\2\2\u0990"+
		"\u09a8\7f\2\2\u0991\u09a8\7g\2\2\u0992\u09a8\7h\2\2\u0993\u09a8\7i\2\2"+
		"\u0994\u09a8\7j\2\2\u0995\u09a8\5\u0184\u00c3\2\u0996\u09a8\5\u0186\u00c4"+
		"\2\u0997\u09a8\7k\2\2\u0998\u09a8\7l\2\2\u0999\u09a8\7m\2\2\u099a\u09a8"+
		"\7n\2\2\u099b\u09a8\7";
	private static final String _serializedATNSegment1 =
		"o\2\2\u099c\u09a8\7p\2\2\u099d\u09a8\7q\2\2\u099e\u09a8\7r\2\2\u099f\u09a8"+
		"\7s\2\2\u09a0\u09a8\7t\2\2\u09a1\u09a8\7u\2\2\u09a2\u09a8\7v\2\2\u09a3"+
		"\u09a4\7O\2\2\u09a4\u09a8\7P\2\2\u09a5\u09a6\7Q\2\2\u09a6\u09a8\7R\2\2"+
		"\u09a7\u0977\3\2\2\2\u09a7\u0978\3\2\2\2\u09a7\u0979\3\2\2\2\u09a7\u097c"+
		"\3\2\2\2\u09a7\u097f\3\2\2\2\u09a7\u0980\3\2\2\2\u09a7\u0981\3\2\2\2\u09a7"+
		"\u0982\3\2\2\2\u09a7\u0983\3\2\2\2\u09a7\u0984\3\2\2\2\u09a7\u0985\3\2"+
		"\2\2\u09a7\u0986\3\2\2\2\u09a7\u0987\3\2\2\2\u09a7\u0988\3\2\2\2\u09a7"+
		"\u0989\3\2\2\2\u09a7\u098a\3\2\2\2\u09a7\u098b\3\2\2\2\u09a7\u098c\3\2"+
		"\2\2\u09a7\u098d\3\2\2\2\u09a7\u098e\3\2\2\2\u09a7\u098f\3\2\2\2\u09a7"+
		"\u0990\3\2\2\2\u09a7\u0991\3\2\2\2\u09a7\u0992\3\2\2\2\u09a7\u0993\3\2"+
		"\2\2\u09a7\u0994\3\2\2\2\u09a7\u0995\3\2\2\2\u09a7\u0996\3\2\2\2\u09a7"+
		"\u0997\3\2\2\2\u09a7\u0998\3\2\2\2\u09a7\u0999\3\2\2\2\u09a7\u099a\3\2"+
		"\2\2\u09a7\u099b\3\2\2\2\u09a7\u099c\3\2\2\2\u09a7\u099d\3\2\2\2\u09a7"+
		"\u099e\3\2\2\2\u09a7\u099f\3\2\2\2\u09a7\u09a0\3\2\2\2\u09a7\u09a1\3\2"+
		"\2\2\u09a7\u09a2\3\2\2\2\u09a7\u09a3\3\2\2\2\u09a7\u09a5\3\2\2\2\u09a8"+
		"\u0189\3\2\2\2\u09a9\u09b1\7\177\2\2\u09aa\u09b1\7\u0085\2\2\u09ab\u09b1"+
		"\7\u0086\2\2\u09ac\u09b1\7\u0087\2\2\u09ad\u09b1\5\u018c\u00c7\2\u09ae"+
		"\u09b1\5\u018e\u00c8\2\u09af\u09b1\5\u0190\u00c9\2\u09b0\u09a9\3\2\2\2"+
		"\u09b0\u09aa\3\2\2\2\u09b0\u09ab\3\2\2\2\u09b0\u09ac\3\2\2\2\u09b0\u09ad"+
		"\3\2\2\2\u09b0\u09ae\3\2\2\2\u09b0\u09af\3\2\2\2\u09b1\u018b\3\2\2\2\u09b2"+
		"\u09b3\t\13\2\2\u09b3\u018d\3\2\2\2\u09b4\u09b5\7-\2\2\u09b5\u018f\3\2"+
		"\2\2\u09b6\u09b7\t\f\2\2\u09b7\u0191\3\2\2\2\u013e\u0193\u019f\u01a3\u01ae"+
		"\u01b2\u01c1\u01c8\u01cd\u01cf\u01d4\u01da\u01e4\u01eb\u01f1\u01f5\u01fa"+
		"\u0200\u0207\u020d\u0210\u0213\u0216\u021d\u0224\u0258\u0267\u026d\u0273"+
		"\u0280\u0282\u0288\u0297\u029d\u02bb\u02c0\u02c4\u02c8\u02cb\u02cf\u02d5"+
		"\u02d7\u02df\u02e3\u02e6\u02ed\u02f4\u02f8\u02fd\u0301\u0304\u0309\u030f"+
		"\u031c\u0327\u0329\u0338\u033a\u0346\u0348\u0355\u0357\u0369\u036b\u0377"+
		"\u0379\u0384\u038f\u039a\u03a5\u03b0\u03ba\u03c2\u03cf\u03d9\u03e0\u03e4"+
		"\u03e8\u03ec\u03f0\u03f5\u03f8\u03fb\u0401\u0409\u040e\u0411\u0417\u0422"+
		"\u043a\u044a\u044e\u0456\u045c\u0470\u0474\u0481\u0485\u0488\u048f\u0497"+
		"\u04a1\u04ac\u04b8\u04c2\u04c7\u04ce\u04d1\u04d6\u04db\u04f0\u04f4\u04f9"+
		"\u0504\u050a\u050e\u0513\u0517\u051c\u051f\u0535\u053b\u0546\u054a\u054d"+
		"\u0557\u055d\u0560\u0567\u0571\u0575\u0578\u057b\u057f\u0584\u0586\u058a"+
		"\u058e\u0597\u05a4\u05ac\u05b2\u05b8\u05bc\u05bf\u05c8\u05d1\u05d9\u05e4"+
		"\u05ea\u05f5\u05f8\u05fd\u060c\u0612\u061b\u0625\u062b\u0633\u0637\u063b"+
		"\u0640\u0645\u064c\u064e\u0653\u0657\u0665\u066b\u067a\u0684\u0689\u0690"+
		"\u0696\u069b\u06a1\u06a8\u06ac\u06ae\u06b0\u06b7\u06ba\u06bd\u06c0\u06c5"+
		"\u06c9\u06cc\u06d0\u06d4\u06d9\u06dc\u06de\u06e2\u06e9\u06ef\u06f3\u06f9"+
		"\u06fe\u0700\u0706\u070a\u0710\u0717\u071b\u071d\u071f\u0726\u0730\u0734"+
		"\u0736\u0738\u073c\u073f\u0745\u074f\u0753\u0759\u0761\u0765\u0768\u076c"+
		"\u0771\u0774\u0777\u077b\u0780\u078a\u0791\u0796\u079a\u079f\u07a5\u07a9"+
		"\u07af\u07b5\u07b9\u07be\u07c4\u07c8\u07cb\u07cf\u07d2\u07d4\u07d7\u07e1"+
		"\u07e6\u07e8\u07eb\u07ee\u07f1\u07fa\u0804\u0809\u080c\u0810\u0813\u0816"+
		"\u081a\u0823\u0832\u0838\u083c\u0840\u0844\u0848\u084c\u0850\u0854\u0857"+
		"\u085b\u0866\u086a\u0871\u0875\u087a\u087f\u0886\u088a\u0894\u08a4\u08a9"+
		"\u08ad\u08b0\u08b4\u08ba\u08bd\u08c1\u08cb\u08ce\u08d6\u08db\u08e0\u08e8"+
		"\u08ef\u08f3\u08fa\u0900\u0904\u090a\u0913\u0917\u091a\u092a\u0931\u093a"+
		"\u0940\u0944\u0947\u094b\u094f\u0954\u095b\u0961\u0965\u096e\u09a7\u09b0";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}