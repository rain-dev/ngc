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
		T__0=1, Directive=2, Alignas=3, Alignof=4, Asm=5, Auto=6, Bool=7, Break=8, 
		Case=9, Catch=10, Char=11, Char16=12, Char32=13, Class=14, Const=15, Constexpr=16, 
		Const_cast=17, Continue=18, Decltype=19, Default=20, Delete=21, Do=22, 
		Double=23, Dynamic_cast=24, Else=25, Enum=26, Explicit=27, Export=28, 
		Extern=29, False=30, Final=31, Float=32, For=33, Friend=34, Goto=35, Guard=36, 
		If=37, Inline=38, Int=39, Long=40, Mutable=41, Namespace=42, New=43, Noexcept=44, 
		Nullptr=45, Operator=46, Override=47, Private=48, Protected=49, Public=50, 
		Register=51, Reinterpret_cast=52, Return=53, Short=54, Signed=55, Sizeof=56, 
		Static=57, Static_assert=58, Static_cast=59, Struct=60, Switch=61, Template=62, 
		This=63, Thread_local=64, Throw=65, True=66, Try=67, Typedef=68, Typeid=69, 
		Typename=70, Union=71, Unsigned=72, Using=73, Virtual=74, Void=75, Volatile=76, 
		Wchar=77, While=78, LeftParen=79, RightParen=80, LeftBracket=81, RightBracket=82, 
		LeftBrace=83, RightBrace=84, Plus=85, Minus=86, Star=87, Div=88, Mod=89, 
		Caret=90, And=91, Or=92, Tilde=93, Not=94, Assign=95, Less=96, Greater=97, 
		PlusAssign=98, MinusAssign=99, StarAssign=100, DivAssign=101, ModAssign=102, 
		XorAssign=103, AndAssign=104, OrAssign=105, LeftShift=106, LeftShiftAssign=107, 
		Equal=108, NotEqual=109, LessEqual=110, GreaterEqual=111, AndAnd=112, 
		OrOr=113, PlusPlus=114, MinusMinus=115, Comma=116, ArrowStar=117, Arrow=118, 
		Question=119, Colon=120, Doublecolon=121, Semi=122, Dot=123, DotStar=124, 
		Ellipsis=125, Identifier=126, Integerliteral=127, Decimalliteral=128, 
		Octalliteral=129, Hexadecimalliteral=130, Binaryliteral=131, Integersuffix=132, 
		Characterliteral=133, Floatingliteral=134, Stringliteral=135, Userdefinedintegerliteral=136, 
		Userdefinedfloatingliteral=137, Userdefinedstringliteral=138, Userdefinedcharacterliteral=139, 
		Whitespace=140, Newline=141, BlockComment=142, LineComment=143;
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
		RULE_expression = 43, RULE_ngc_optionalunpackexpression = 44, RULE_constantexpression = 45, 
		RULE_statement = 46, RULE_ngc_optionalguardstatement = 47, RULE_labeledstatement = 48, 
		RULE_expressionstatement = 49, RULE_compoundstatement = 50, RULE_statementseq = 51, 
		RULE_selectionstatement = 52, RULE_ngc_selectionstatement = 53, RULE_condition = 54, 
		RULE_ngc_optionalcondition = 55, RULE_iterationstatement = 56, RULE_forinitstatement = 57, 
		RULE_forrangedeclaration = 58, RULE_forrangeinitializer = 59, RULE_jumpstatement = 60, 
		RULE_declarationstatement = 61, RULE_declarationseq = 62, RULE_declaration = 63, 
		RULE_blockdeclaration = 64, RULE_aliasdeclaration = 65, RULE_simpledeclaration = 66, 
		RULE_ngc_optionaldeclaration = 67, RULE_static_assertdeclaration = 68, 
		RULE_emptydeclaration = 69, RULE_attributedeclaration = 70, RULE_declspecifier = 71, 
		RULE_declspecifierseq = 72, RULE_storageclassspecifier = 73, RULE_functionspecifier = 74, 
		RULE_typedefname = 75, RULE_typespecifier = 76, RULE_trailingtypespecifier = 77, 
		RULE_typespecifierseq = 78, RULE_trailingtypespecifierseq = 79, RULE_simpletypespecifier = 80, 
		RULE_typename = 81, RULE_decltypespecifier = 82, RULE_elaboratedtypespecifier = 83, 
		RULE_enumname = 84, RULE_enumspecifier = 85, RULE_enumhead = 86, RULE_opaqueenumdeclaration = 87, 
		RULE_enumkey = 88, RULE_enumbase = 89, RULE_enumeratorlist = 90, RULE_enumeratordefinition = 91, 
		RULE_enumerator = 92, RULE_namespacename = 93, RULE_originalnamespacename = 94, 
		RULE_namespacedefinition = 95, RULE_namednamespacedefinition = 96, RULE_originalnamespacedefinition = 97, 
		RULE_extensionnamespacedefinition = 98, RULE_unnamednamespacedefinition = 99, 
		RULE_namespacebody = 100, RULE_namespacealias = 101, RULE_namespacealiasdefinition = 102, 
		RULE_qualifiednamespacespecifier = 103, RULE_usingdeclaration = 104, RULE_usingdirective = 105, 
		RULE_asmdefinition = 106, RULE_linkagespecification = 107, RULE_attributespecifierseq = 108, 
		RULE_attributespecifier = 109, RULE_alignmentspecifier = 110, RULE_attributelist = 111, 
		RULE_attribute = 112, RULE_attributetoken = 113, RULE_attributescopedtoken = 114, 
		RULE_attributenamespace = 115, RULE_attributeargumentclause = 116, RULE_balancedtokenseq = 117, 
		RULE_balancedtoken = 118, RULE_initdeclaratorlist = 119, RULE_initdeclarator = 120, 
		RULE_declarator = 121, RULE_ptrdeclarator = 122, RULE_noptrdeclarator = 123, 
		RULE_parametersandqualifiers = 124, RULE_trailingreturntype = 125, RULE_ptroperator = 126, 
		RULE_cvqualifierseq = 127, RULE_cvqualifier = 128, RULE_refqualifier = 129, 
		RULE_declaratorid = 130, RULE_typeid = 131, RULE_abstractdeclarator = 132, 
		RULE_ptrabstractdeclarator = 133, RULE_noptrabstractdeclarator = 134, 
		RULE_abstractpackdeclarator = 135, RULE_noptrabstractpackdeclarator = 136, 
		RULE_parameterdeclarationclause = 137, RULE_parameterdeclarationlist = 138, 
		RULE_parameterdeclaration = 139, RULE_functiondefinition = 140, RULE_functionbody = 141, 
		RULE_initializer = 142, RULE_braceorequalinitializer = 143, RULE_ngc_optionaldefaultinitializer = 144, 
		RULE_initializerclause = 145, RULE_initializerlist = 146, RULE_bracedinitlist = 147, 
		RULE_classname = 148, RULE_classspecifier = 149, RULE_classhead = 150, 
		RULE_classheadname = 151, RULE_classvirtspecifier = 152, RULE_classkey = 153, 
		RULE_memberspecification = 154, RULE_memberdeclaration = 155, RULE_memberdeclaratorlist = 156, 
		RULE_memberdeclarator = 157, RULE_virtspecifierseq = 158, RULE_virtspecifier = 159, 
		RULE_purespecifier = 160, RULE_baseclause = 161, RULE_basespecifierlist = 162, 
		RULE_basespecifier = 163, RULE_classordecltype = 164, RULE_basetypespecifier = 165, 
		RULE_accessspecifier = 166, RULE_conversionfunctionid = 167, RULE_conversiontypeid = 168, 
		RULE_conversiondeclarator = 169, RULE_ctorinitializer = 170, RULE_meminitializerlist = 171, 
		RULE_meminitializer = 172, RULE_meminitializerid = 173, RULE_operatorfunctionid = 174, 
		RULE_literaloperatorid = 175, RULE_templatedeclaration = 176, RULE_templateparameterlist = 177, 
		RULE_templateparameter = 178, RULE_typeparameter = 179, RULE_simpletemplateid = 180, 
		RULE_templateid = 181, RULE_templatename = 182, RULE_templateargumentlist = 183, 
		RULE_templateargument = 184, RULE_typenamespecifier = 185, RULE_explicitinstantiation = 186, 
		RULE_explicitspecialization = 187, RULE_tryblock = 188, RULE_functiontryblock = 189, 
		RULE_handlerseq = 190, RULE_handler = 191, RULE_exceptiondeclaration = 192, 
		RULE_throwexpression = 193, RULE_exceptionspecification = 194, RULE_dynamicexceptionspecification = 195, 
		RULE_typeidlist = 196, RULE_noexceptspecification = 197, RULE_rightShift = 198, 
		RULE_rightShiftAssign = 199, RULE_operator = 200, RULE_literal = 201, 
		RULE_booleanliteral = 202, RULE_pointerliteral = 203, RULE_userdefinedliteral = 204;
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
		"assignmentexpression", "assignmentoperator", "expression", "ngc_optionalunpackexpression", 
		"constantexpression", "statement", "ngc_optionalguardstatement", "labeledstatement", 
		"expressionstatement", "compoundstatement", "statementseq", "selectionstatement", 
		"ngc_selectionstatement", "condition", "ngc_optionalcondition", "iterationstatement", 
		"forinitstatement", "forrangedeclaration", "forrangeinitializer", "jumpstatement", 
		"declarationstatement", "declarationseq", "declaration", "blockdeclaration", 
		"aliasdeclaration", "simpledeclaration", "ngc_optionaldeclaration", "static_assertdeclaration", 
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
		"ngc_optionaldefaultinitializer", "initializerclause", "initializerlist", 
		"bracedinitlist", "classname", "classspecifier", "classhead", "classheadname", 
		"classvirtspecifier", "classkey", "memberspecification", "memberdeclaration", 
		"memberdeclaratorlist", "memberdeclarator", "virtspecifierseq", "virtspecifier", 
		"purespecifier", "baseclause", "basespecifierlist", "basespecifier", "classordecltype", 
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
		null, "'??'", null, "'alignas'", "'alignof'", "'asm'", "'auto'", "'bool'", 
		"'break'", "'case'", "'catch'", "'char'", "'char16_t'", "'char32_t'", 
		"'class'", "'const'", "'constexpr'", "'const_cast'", "'continue'", "'decltype'", 
		"'default'", "'delete'", "'do'", "'double'", "'dynamic_cast'", "'else'", 
		"'enum'", "'explicit'", "'export'", "'extern'", "'false'", "'final'", 
		"'float'", "'for'", "'friend'", "'goto'", "'guard'", "'if'", "'inline'", 
		"'int'", "'long'", "'mutable'", "'namespace'", "'new'", "'noexcept'", 
		"'nullptr'", "'operator'", "'override'", "'private'", "'protected'", "'public'", 
		"'register'", "'reinterpret_cast'", "'return'", "'short'", "'signed'", 
		"'sizeof'", "'static'", "'static_assert'", "'static_cast'", "'struct'", 
		"'switch'", "'template'", "'this'", "'thread_local'", "'throw'", "'true'", 
		"'try'", "'typedef'", "'typeid'", "'typename'", "'union'", "'unsigned'", 
		"'using'", "'virtual'", "'void'", "'volatile'", "'wchar_t'", "'while'", 
		"'('", "')'", "'['", "']'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'^'", "'&'", "'|'", "'~'", "'!'", "'='", "'<'", "'>'", "'+='", 
		"'-='", "'*='", "'/='", "'%='", "'^='", "'&='", "'|='", "'<<'", "'<<='", 
		"'=='", "'!='", "'<='", "'>='", "'&&'", "'||'", "'++'", "'--'", "','", 
		"'->*'", "'->'", "'?'", "':'", "'::'", "';'", "'.'", "'.*'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "Directive", "Alignas", "Alignof", "Asm", "Auto", "Bool", 
		"Break", "Case", "Catch", "Char", "Char16", "Char32", "Class", "Const", 
		"Constexpr", "Const_cast", "Continue", "Decltype", "Default", "Delete", 
		"Do", "Double", "Dynamic_cast", "Else", "Enum", "Explicit", "Export", 
		"Extern", "False", "Final", "Float", "For", "Friend", "Goto", "Guard", 
		"If", "Inline", "Int", "Long", "Mutable", "Namespace", "New", "Noexcept", 
		"Nullptr", "Operator", "Override", "Private", "Protected", "Public", "Register", 
		"Reinterpret_cast", "Return", "Short", "Signed", "Sizeof", "Static", "Static_assert", 
		"Static_cast", "Struct", "Switch", "Template", "This", "Thread_local", 
		"Throw", "True", "Try", "Typedef", "Typeid", "Typename", "Union", "Unsigned", 
		"Using", "Virtual", "Void", "Volatile", "Wchar", "While", "LeftParen", 
		"RightParen", "LeftBracket", "RightBracket", "LeftBrace", "RightBrace", 
		"Plus", "Minus", "Star", "Div", "Mod", "Caret", "And", "Or", "Tilde", 
		"Not", "Assign", "Less", "Greater", "PlusAssign", "MinusAssign", "StarAssign", 
		"DivAssign", "ModAssign", "XorAssign", "AndAssign", "OrAssign", "LeftShift", 
		"LeftShiftAssign", "Equal", "NotEqual", "LessEqual", "GreaterEqual", "AndAnd", 
		"OrOr", "PlusPlus", "MinusMinus", "Comma", "ArrowStar", "Arrow", "Question", 
		"Colon", "Doublecolon", "Semi", "Dot", "DotStar", "Ellipsis", "Identifier", 
		"Integerliteral", "Decimalliteral", "Octalliteral", "Hexadecimalliteral", 
		"Binaryliteral", "Integersuffix", "Characterliteral", "Floatingliteral", 
		"Stringliteral", "Userdefinedintegerliteral", "Userdefinedfloatingliteral", 
		"Userdefinedstringliteral", "Userdefinedcharacterliteral", "Whitespace", 
		"Newline", "BlockComment", "LineComment"
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
			setState(411);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Thread_local - 64)) | (1L << (Typedef - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Tilde - 64)) | (1L << (AndAnd - 64)) | (1L << (Question - 64)) | (1L << (Doublecolon - 64)) | (1L << (Semi - 64)) | (1L << (Ellipsis - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(410);
				declarationseq(0);
				}
			}

			setState(413);
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
			setState(423);
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
				setState(415);
				literal();
				}
				break;
			case This:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				match(This);
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(417);
				match(LeftParen);
				setState(418);
				expression(0);
				setState(419);
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
				setState(421);
				idexpression();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 5);
				{
				setState(422);
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
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				unqualifiedid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
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
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				operatorfunctionid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(431);
				conversionfunctionid();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(432);
				literaloperatorid();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(433);
				match(Tilde);
				setState(434);
				classname();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(435);
				match(Tilde);
				setState(436);
				decltypespecifier();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(437);
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
			setState(440);
			nestednamespecifier(0);
			setState(442);
			_la = _input.LA(1);
			if (_la==Template) {
				{
				setState(441);
				match(Template);
				}
			}

			setState(444);
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
			setState(457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(447);
				match(Doublecolon);
				}
				break;
			case 2:
				{
				setState(448);
				typename();
				setState(449);
				match(Doublecolon);
				}
				break;
			case 3:
				{
				setState(451);
				namespacename();
				setState(452);
				match(Doublecolon);
				}
				break;
			case 4:
				{
				setState(454);
				decltypespecifier();
				setState(455);
				match(Doublecolon);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(471);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(469);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new NestednamespecifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nestednamespecifier);
						setState(459);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(460);
						match(Identifier);
						setState(461);
						match(Doublecolon);
						}
						break;
					case 2:
						{
						_localctx = new NestednamespecifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nestednamespecifier);
						setState(462);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(464);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(463);
							match(Template);
							}
						}

						setState(466);
						simpletemplateid();
						setState(467);
						match(Doublecolon);
						}
						break;
					}
					} 
				}
				setState(473);
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
			setState(474);
			lambdaintroducer();
			setState(476);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(475);
				lambdadeclarator();
				}
			}

			setState(478);
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
			setState(480);
			match(LeftBracket);
			setState(482);
			_la = _input.LA(1);
			if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (This - 63)) | (1L << (And - 63)) | (1L << (Assign - 63)) | (1L << (Identifier - 63)))) != 0)) {
				{
				setState(481);
				lambdacapture();
				}
			}

			setState(484);
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
			setState(492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				capturedefault();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				capturelist(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(488);
				capturedefault();
				setState(489);
				match(Comma);
				setState(490);
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
			setState(494);
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
			setState(497);
			capture();
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(498);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(509);
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
					setState(501);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(502);
					match(Comma);
					setState(503);
					capture();
					setState(505);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(504);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(511);
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
			setState(514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				simplecapture();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(513);
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
			setState(520);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(516);
				match(Identifier);
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
				match(And);
				setState(518);
				match(Identifier);
				}
				break;
			case This:
				enterOuterAlt(_localctx, 3);
				{
				setState(519);
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
			setState(527);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(522);
				match(Identifier);
				setState(523);
				initializer();
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				match(And);
				setState(525);
				match(Identifier);
				setState(526);
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
			setState(529);
			match(LeftParen);
			setState(530);
			parameterdeclarationclause();
			setState(531);
			match(RightParen);
			setState(533);
			_la = _input.LA(1);
			if (_la==Mutable) {
				{
				setState(532);
				match(Mutable);
				}
			}

			setState(536);
			_la = _input.LA(1);
			if (_la==Noexcept || _la==Throw) {
				{
				setState(535);
				exceptionspecification();
				}
			}

			setState(539);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(538);
				attributespecifierseq(0);
				}
			}

			setState(542);
			_la = _input.LA(1);
			if (_la==Arrow) {
				{
				setState(541);
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
			setState(608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(545);
				primaryexpression();
				}
				break;
			case 2:
				{
				setState(546);
				simpletypespecifier();
				setState(547);
				match(LeftParen);
				setState(549);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Throw - 65)) | (1L << (True - 65)) | (1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)) | (1L << (Identifier - 65)) | (1L << (Integerliteral - 65)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (Characterliteral - 133)) | (1L << (Floatingliteral - 133)) | (1L << (Stringliteral - 133)) | (1L << (Userdefinedintegerliteral - 133)) | (1L << (Userdefinedfloatingliteral - 133)) | (1L << (Userdefinedstringliteral - 133)) | (1L << (Userdefinedcharacterliteral - 133)))) != 0)) {
					{
					setState(548);
					expressionlist();
					}
				}

				setState(551);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(553);
				typenamespecifier();
				setState(554);
				match(LeftParen);
				setState(556);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Throw - 65)) | (1L << (True - 65)) | (1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)) | (1L << (Identifier - 65)) | (1L << (Integerliteral - 65)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (Characterliteral - 133)) | (1L << (Floatingliteral - 133)) | (1L << (Stringliteral - 133)) | (1L << (Userdefinedintegerliteral - 133)) | (1L << (Userdefinedfloatingliteral - 133)) | (1L << (Userdefinedstringliteral - 133)) | (1L << (Userdefinedcharacterliteral - 133)))) != 0)) {
					{
					setState(555);
					expressionlist();
					}
				}

				setState(558);
				match(RightParen);
				}
				break;
			case 4:
				{
				setState(560);
				simpletypespecifier();
				setState(561);
				bracedinitlist();
				}
				break;
			case 5:
				{
				setState(563);
				typenamespecifier();
				setState(564);
				bracedinitlist();
				}
				break;
			case 6:
				{
				setState(566);
				match(Dynamic_cast);
				setState(567);
				match(Less);
				setState(568);
				typeid();
				setState(569);
				match(Greater);
				setState(570);
				match(LeftParen);
				setState(571);
				expression(0);
				setState(572);
				match(RightParen);
				}
				break;
			case 7:
				{
				setState(574);
				match(Static_cast);
				setState(575);
				match(Less);
				setState(576);
				typeid();
				setState(577);
				match(Greater);
				setState(578);
				match(LeftParen);
				setState(579);
				expression(0);
				setState(580);
				match(RightParen);
				}
				break;
			case 8:
				{
				setState(582);
				match(Reinterpret_cast);
				setState(583);
				match(Less);
				setState(584);
				typeid();
				setState(585);
				match(Greater);
				setState(586);
				match(LeftParen);
				setState(587);
				expression(0);
				setState(588);
				match(RightParen);
				}
				break;
			case 9:
				{
				setState(590);
				match(Const_cast);
				setState(591);
				match(Less);
				setState(592);
				typeid();
				setState(593);
				match(Greater);
				setState(594);
				match(LeftParen);
				setState(595);
				expression(0);
				setState(596);
				match(RightParen);
				}
				break;
			case 10:
				{
				setState(598);
				match(Typeid);
				setState(599);
				match(LeftParen);
				setState(600);
				expression(0);
				setState(601);
				match(RightParen);
				}
				break;
			case 11:
				{
				setState(603);
				match(Typeid);
				setState(604);
				match(LeftParen);
				setState(605);
				typeid();
				setState(606);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(650);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(648);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(610);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(611);
						match(LeftBracket);
						setState(612);
						expression(0);
						setState(613);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(615);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(616);
						match(LeftBracket);
						setState(617);
						bracedinitlist();
						setState(618);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(620);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(621);
						match(LeftParen);
						setState(623);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Throw - 65)) | (1L << (True - 65)) | (1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)) | (1L << (Identifier - 65)) | (1L << (Integerliteral - 65)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (Characterliteral - 133)) | (1L << (Floatingliteral - 133)) | (1L << (Stringliteral - 133)) | (1L << (Userdefinedintegerliteral - 133)) | (1L << (Userdefinedfloatingliteral - 133)) | (1L << (Userdefinedstringliteral - 133)) | (1L << (Userdefinedcharacterliteral - 133)))) != 0)) {
							{
							setState(622);
							expressionlist();
							}
						}

						setState(625);
						match(RightParen);
						}
						break;
					case 4:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(626);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(627);
						match(Dot);
						setState(629);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(628);
							match(Template);
							}
						}

						setState(631);
						idexpression();
						}
						break;
					case 5:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(632);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(633);
						match(Arrow);
						setState(635);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(634);
							match(Template);
							}
						}

						setState(637);
						idexpression();
						}
						break;
					case 6:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(638);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(639);
						match(Dot);
						setState(640);
						pseudodestructorname();
						}
						break;
					case 7:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(641);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(642);
						match(Arrow);
						setState(643);
						pseudodestructorname();
						}
						break;
					case 8:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(644);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(645);
						match(PlusPlus);
						}
						break;
					case 9:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(646);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(647);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(652);
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
			setState(653);
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
			setState(677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(656);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(655);
					nestednamespecifier(0);
					}
					break;
				}
				setState(658);
				typename();
				setState(659);
				match(Doublecolon);
				setState(660);
				match(Tilde);
				setState(661);
				typename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(663);
				nestednamespecifier(0);
				setState(664);
				match(Template);
				setState(665);
				simpletemplateid();
				setState(666);
				match(Doublecolon);
				setState(667);
				match(Tilde);
				setState(668);
				typename();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(671);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Doublecolon || _la==Identifier) {
					{
					setState(670);
					nestednamespecifier(0);
					}
				}

				setState(673);
				match(Tilde);
				setState(674);
				typename();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(675);
				match(Tilde);
				setState(676);
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
			setState(707);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(679);
				postfixexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(680);
				match(PlusPlus);
				setState(681);
				castexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(682);
				match(MinusMinus);
				setState(683);
				castexpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(684);
				unaryoperator();
				setState(685);
				castexpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(687);
				match(Sizeof);
				setState(688);
				unaryexpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(689);
				match(Sizeof);
				setState(690);
				match(LeftParen);
				setState(691);
				typeid();
				setState(692);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(694);
				match(Sizeof);
				setState(695);
				match(Ellipsis);
				setState(696);
				match(LeftParen);
				setState(697);
				match(Identifier);
				setState(698);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(699);
				match(Alignof);
				setState(700);
				match(LeftParen);
				setState(701);
				typeid();
				setState(702);
				match(RightParen);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(704);
				noexceptexpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(705);
				newexpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(706);
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
			setState(709);
			_la = _input.LA(1);
			if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (Plus - 85)) | (1L << (Minus - 85)) | (1L << (Star - 85)) | (1L << (And - 85)) | (1L << (Or - 85)) | (1L << (Tilde - 85)) | (1L << (Not - 85)))) != 0)) ) {
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
			setState(735);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(712);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(711);
					match(Doublecolon);
					}
				}

				setState(714);
				match(New);
				setState(716);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(715);
					newplacement();
					}
				}

				setState(718);
				newtypeid();
				setState(720);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(719);
					newinitializer();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(723);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(722);
					match(Doublecolon);
					}
				}

				setState(725);
				match(New);
				setState(727);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(726);
					newplacement();
					}
					break;
				}
				setState(729);
				match(LeftParen);
				setState(730);
				typeid();
				setState(731);
				match(RightParen);
				setState(733);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(732);
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
			setState(737);
			match(LeftParen);
			setState(738);
			expressionlist();
			setState(739);
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
			setState(741);
			typespecifierseq();
			setState(743);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(742);
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
			setState(750);
			switch (_input.LA(1)) {
			case Decltype:
			case Star:
			case And:
			case AndAnd:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(745);
				ptroperator();
				setState(747);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(746);
					newdeclarator();
					}
					break;
				}
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(749);
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
			setState(753);
			match(LeftBracket);
			setState(754);
			expression(0);
			setState(755);
			match(RightBracket);
			setState(757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(756);
				attributespecifierseq(0);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(768);
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
					setState(759);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(760);
					match(LeftBracket);
					setState(761);
					constantexpression();
					setState(762);
					match(RightBracket);
					setState(764);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						setState(763);
						attributespecifierseq(0);
						}
						break;
					}
					}
					} 
				}
				setState(770);
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
			setState(777);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(771);
				match(LeftParen);
				setState(773);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Throw - 65)) | (1L << (True - 65)) | (1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)) | (1L << (Identifier - 65)) | (1L << (Integerliteral - 65)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (Characterliteral - 133)) | (1L << (Floatingliteral - 133)) | (1L << (Stringliteral - 133)) | (1L << (Userdefinedintegerliteral - 133)) | (1L << (Userdefinedfloatingliteral - 133)) | (1L << (Userdefinedstringliteral - 133)) | (1L << (Userdefinedcharacterliteral - 133)))) != 0)) {
					{
					setState(772);
					expressionlist();
					}
				}

				setState(775);
				match(RightParen);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(776);
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
			setState(791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(780);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(779);
					match(Doublecolon);
					}
				}

				setState(782);
				match(Delete);
				setState(783);
				castexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(785);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(784);
					match(Doublecolon);
					}
				}

				setState(787);
				match(Delete);
				setState(788);
				match(LeftBracket);
				setState(789);
				match(RightBracket);
				setState(790);
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
			setState(793);
			match(Noexcept);
			setState(794);
			match(LeftParen);
			setState(795);
			expression(0);
			setState(796);
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
			setState(804);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(798);
				unaryexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(799);
				match(LeftParen);
				setState(800);
				typeid();
				setState(801);
				match(RightParen);
				setState(802);
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
			setState(807);
			castexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(817);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(815);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						_localctx = new PmexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pmexpression);
						setState(809);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(810);
						match(DotStar);
						setState(811);
						castexpression();
						}
						break;
					case 2:
						{
						_localctx = new PmexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pmexpression);
						setState(812);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(813);
						match(ArrowStar);
						setState(814);
						castexpression();
						}
						break;
					}
					} 
				}
				setState(819);
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
			setState(821);
			pmexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(834);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(832);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(823);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(824);
						match(Star);
						setState(825);
						pmexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(826);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(827);
						match(Div);
						setState(828);
						pmexpression(0);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(829);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(830);
						match(Mod);
						setState(831);
						pmexpression(0);
						}
						break;
					}
					} 
				}
				setState(836);
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
			setState(838);
			multiplicativeexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(848);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(846);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveexpression);
						setState(840);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(841);
						match(Plus);
						setState(842);
						multiplicativeexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveexpression);
						setState(843);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(844);
						match(Minus);
						setState(845);
						multiplicativeexpression(0);
						}
						break;
					}
					} 
				}
				setState(850);
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
		public Ngc_optionalunpackexpressionContext ngc_optionalunpackexpression() {
			return getRuleContext(Ngc_optionalunpackexpressionContext.class,0);
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
			setState(852);
			additiveexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(866);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(864);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftexpression);
						setState(854);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(855);
						match(LeftShift);
						setState(856);
						additiveexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftexpression);
						setState(857);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(858);
						rightShift();
						setState(859);
						additiveexpression(0);
						}
						break;
					case 3:
						{
						_localctx = new ShiftexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftexpression);
						setState(861);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(862);
						match(LeftShift);
						setState(863);
						ngc_optionalunpackexpression();
						}
						break;
					}
					} 
				}
				setState(868);
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
			setState(870);
			shiftexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(886);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(884);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(872);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(873);
						match(Less);
						setState(874);
						shiftexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(875);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(876);
						match(Greater);
						setState(877);
						shiftexpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(878);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(879);
						match(LessEqual);
						setState(880);
						shiftexpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(881);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(882);
						match(GreaterEqual);
						setState(883);
						shiftexpression(0);
						}
						break;
					}
					} 
				}
				setState(888);
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
			setState(890);
			relationalexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(900);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(898);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(892);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(893);
						match(Equal);
						setState(894);
						relationalexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(895);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(896);
						match(NotEqual);
						setState(897);
						relationalexpression(0);
						}
						break;
					}
					} 
				}
				setState(902);
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
			setState(904);
			equalityexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(911);
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
					setState(906);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(907);
					match(And);
					setState(908);
					equalityexpression(0);
					}
					} 
				}
				setState(913);
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
			setState(915);
			andexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(922);
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
					setState(917);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(918);
					match(Caret);
					setState(919);
					andexpression(0);
					}
					} 
				}
				setState(924);
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
			setState(926);
			exclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(933);
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
					setState(928);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(929);
					match(Or);
					setState(930);
					exclusiveorexpression(0);
					}
					} 
				}
				setState(935);
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
			setState(937);
			inclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(944);
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
					setState(939);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(940);
					match(AndAnd);
					setState(941);
					inclusiveorexpression(0);
					}
					} 
				}
				setState(946);
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
			setState(948);
			logicalandexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(955);
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
					setState(950);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(951);
					match(OrOr);
					setState(952);
					logicalandexpression(0);
					}
					} 
				}
				setState(957);
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
			setState(965);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(958);
				logicalorexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(959);
				logicalorexpression(0);
				setState(960);
				match(Question);
				setState(961);
				expression(0);
				setState(962);
				match(Colon);
				setState(963);
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
			setState(973);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(967);
				conditionalexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(968);
				logicalorexpression(0);
				setState(969);
				assignmentoperator();
				setState(970);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(972);
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
			setState(986);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(975);
				match(Assign);
				}
				break;
			case StarAssign:
				enterOuterAlt(_localctx, 2);
				{
				setState(976);
				match(StarAssign);
				}
				break;
			case DivAssign:
				enterOuterAlt(_localctx, 3);
				{
				setState(977);
				match(DivAssign);
				}
				break;
			case ModAssign:
				enterOuterAlt(_localctx, 4);
				{
				setState(978);
				match(ModAssign);
				}
				break;
			case PlusAssign:
				enterOuterAlt(_localctx, 5);
				{
				setState(979);
				match(PlusAssign);
				}
				break;
			case MinusAssign:
				enterOuterAlt(_localctx, 6);
				{
				setState(980);
				match(MinusAssign);
				}
				break;
			case Greater:
				enterOuterAlt(_localctx, 7);
				{
				setState(981);
				rightShiftAssign();
				}
				break;
			case LeftShiftAssign:
				enterOuterAlt(_localctx, 8);
				{
				setState(982);
				match(LeftShiftAssign);
				}
				break;
			case AndAssign:
				enterOuterAlt(_localctx, 9);
				{
				setState(983);
				match(AndAssign);
				}
				break;
			case XorAssign:
				enterOuterAlt(_localctx, 10);
				{
				setState(984);
				match(XorAssign);
				}
				break;
			case OrAssign:
				enterOuterAlt(_localctx, 11);
				{
				setState(985);
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
		public Ngc_optionalunpackexpressionContext ngc_optionalunpackexpression() {
			return getRuleContext(Ngc_optionalunpackexpressionContext.class,0);
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
			setState(991);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(989);
				assignmentexpression();
				}
				break;
			case 2:
				{
				setState(990);
				ngc_optionalunpackexpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(998);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(993);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(994);
					match(Comma);
					setState(995);
					assignmentexpression();
					}
					} 
				}
				setState(1000);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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

	public static class Ngc_optionalunpackexpressionContext extends ParserRuleContext {
		public UnqualifiedidContext unqualifiedid() {
			return getRuleContext(UnqualifiedidContext.class,0);
		}
		public QualifiedidContext qualifiedid() {
			return getRuleContext(QualifiedidContext.class,0);
		}
		public Ngc_optionalunpackexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngc_optionalunpackexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterNgc_optionalunpackexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitNgc_optionalunpackexpression(this);
		}
	}

	public final Ngc_optionalunpackexpressionContext ngc_optionalunpackexpression() throws RecognitionException {
		Ngc_optionalunpackexpressionContext _localctx = new Ngc_optionalunpackexpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_ngc_optionalunpackexpression);
		try {
			setState(1007);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1001);
				unqualifiedid();
				setState(1002);
				match(Not);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1004);
				qualifiedid();
				setState(1005);
				match(Not);
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
		enterRule(_localctx, 90, RULE_constantexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1009);
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
		public Ngc_optionalguardstatementContext ngc_optionalguardstatement() {
			return getRuleContext(Ngc_optionalguardstatementContext.class,0);
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
		enterRule(_localctx, 92, RULE_statement);
		int _la;
		try {
			setState(1038);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1011);
				labeledstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1013);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(1012);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1015);
				expressionstatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
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
				compoundstatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1021);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1020);
					attributespecifierseq(0);
					}
				}

				setState(1023);
				selectionstatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1025);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1024);
					attributespecifierseq(0);
					}
				}

				setState(1027);
				iterationstatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1029);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1028);
					attributespecifierseq(0);
					}
				}

				setState(1031);
				jumpstatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1032);
				declarationstatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1034);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1033);
					attributespecifierseq(0);
					}
				}

				setState(1036);
				tryblock();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1037);
				ngc_optionalguardstatement();
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

	public static class Ngc_optionalguardstatementContext extends ParserRuleContext {
		public TerminalNode Guard() { return getToken(NGCParser.Guard, 0); }
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Ngc_optionalguardstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngc_optionalguardstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterNgc_optionalguardstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitNgc_optionalguardstatement(this);
		}
	}

	public final Ngc_optionalguardstatementContext ngc_optionalguardstatement() throws RecognitionException {
		Ngc_optionalguardstatementContext _localctx = new Ngc_optionalguardstatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_ngc_optionalguardstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
			match(Guard);
			setState(1041);
			match(LeftParen);
			setState(1042);
			assignmentexpression();
			setState(1043);
			match(RightParen);
			setState(1044);
			statement();
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
		enterRule(_localctx, 96, RULE_labeledstatement);
		int _la;
		try {
			setState(1066);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1047);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1046);
					attributespecifierseq(0);
					}
				}

				setState(1049);
				match(Identifier);
				setState(1050);
				match(Colon);
				setState(1051);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1053);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1052);
					attributespecifierseq(0);
					}
				}

				setState(1055);
				match(Case);
				setState(1056);
				constantexpression();
				setState(1057);
				match(Colon);
				setState(1058);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1061);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1060);
					attributespecifierseq(0);
					}
				}

				setState(1063);
				match(Default);
				setState(1064);
				match(Colon);
				setState(1065);
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
		enterRule(_localctx, 98, RULE_expressionstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Throw - 65)) | (1L << (True - 65)) | (1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)) | (1L << (Identifier - 65)) | (1L << (Integerliteral - 65)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (Characterliteral - 133)) | (1L << (Floatingliteral - 133)) | (1L << (Stringliteral - 133)) | (1L << (Userdefinedintegerliteral - 133)) | (1L << (Userdefinedfloatingliteral - 133)) | (1L << (Userdefinedstringliteral - 133)) | (1L << (Userdefinedcharacterliteral - 133)))) != 0)) {
				{
				setState(1068);
				expression(0);
				}
			}

			setState(1071);
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
		enterRule(_localctx, 100, RULE_compoundstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1073);
			match(LeftBrace);
			setState(1075);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Alignof) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Decltype) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << False) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << Guard) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Static_assert) | (1L << Static_cast) | (1L << Struct) | (1L << Switch) | (1L << This))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Thread_local - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Try - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (While - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (AndAnd - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Question - 64)) | (1L << (Doublecolon - 64)) | (1L << (Semi - 64)) | (1L << (Ellipsis - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (Characterliteral - 133)) | (1L << (Floatingliteral - 133)) | (1L << (Stringliteral - 133)) | (1L << (Userdefinedintegerliteral - 133)) | (1L << (Userdefinedfloatingliteral - 133)) | (1L << (Userdefinedstringliteral - 133)) | (1L << (Userdefinedcharacterliteral - 133)))) != 0)) {
				{
				setState(1074);
				statementseq(0);
				}
			}

			setState(1077);
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
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_statementseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1080);
			statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(1086);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statementseq);
					setState(1082);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1083);
					statement();
					}
					} 
				}
				setState(1088);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
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
		enterRule(_localctx, 104, RULE_selectionstatement);
		try {
			setState(1110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1089);
				match(If);
				setState(1090);
				match(LeftParen);
				setState(1091);
				condition();
				setState(1092);
				match(RightParen);
				setState(1093);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1095);
				match(If);
				setState(1096);
				match(LeftParen);
				setState(1097);
				condition();
				setState(1098);
				match(RightParen);
				setState(1099);
				statement();
				setState(1100);
				match(Else);
				setState(1101);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1103);
				match(Switch);
				setState(1104);
				match(LeftParen);
				setState(1105);
				condition();
				setState(1106);
				match(RightParen);
				setState(1107);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1109);
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
		enterRule(_localctx, 106, RULE_ngc_selectionstatement);
		try {
			setState(1126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1112);
				match(If);
				setState(1113);
				match(Less);
				setState(1114);
				condition();
				setState(1115);
				match(Greater);
				setState(1116);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1118);
				match(If);
				setState(1119);
				match(Less);
				setState(1120);
				condition();
				setState(1121);
				match(Greater);
				setState(1122);
				statement();
				setState(1123);
				match(Else);
				setState(1124);
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
		public Ngc_optionalconditionContext ngc_optionalcondition() {
			return getRuleContext(Ngc_optionalconditionContext.class,0);
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
		enterRule(_localctx, 108, RULE_condition);
		int _la;
		try {
			setState(1145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1128);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1130);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1129);
					attributespecifierseq(0);
					}
				}

				setState(1132);
				declspecifierseq();
				setState(1133);
				declarator();
				setState(1134);
				match(Assign);
				setState(1135);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1138);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1137);
					attributespecifierseq(0);
					}
				}

				setState(1140);
				declspecifierseq();
				setState(1141);
				declarator();
				setState(1142);
				bracedinitlist();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1144);
				ngc_optionalcondition();
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

	public static class Ngc_optionalconditionContext extends ParserRuleContext {
		public UnqualifiedidContext unqualifiedid() {
			return getRuleContext(UnqualifiedidContext.class,0);
		}
		public QualifiedidContext qualifiedid() {
			return getRuleContext(QualifiedidContext.class,0);
		}
		public Ngc_optionalconditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngc_optionalcondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterNgc_optionalcondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitNgc_optionalcondition(this);
		}
	}

	public final Ngc_optionalconditionContext ngc_optionalcondition() throws RecognitionException {
		Ngc_optionalconditionContext _localctx = new Ngc_optionalconditionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_ngc_optionalcondition);
		try {
			setState(1153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1147);
				unqualifiedid();
				setState(1148);
				match(Question);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1150);
				qualifiedid();
				setState(1151);
				match(Question);
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
		enterRule(_localctx, 112, RULE_iterationstatement);
		int _la;
		try {
			setState(1190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1155);
				match(While);
				setState(1156);
				match(LeftParen);
				setState(1157);
				condition();
				setState(1158);
				match(RightParen);
				setState(1159);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1161);
				match(Do);
				setState(1162);
				statement();
				setState(1163);
				match(While);
				setState(1164);
				match(LeftParen);
				setState(1165);
				expression(0);
				setState(1166);
				match(RightParen);
				setState(1167);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1169);
				match(For);
				setState(1170);
				match(LeftParen);
				setState(1171);
				forinitstatement();
				setState(1173);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << False) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Static_cast) | (1L << Struct) | (1L << This))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Thread_local - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (Characterliteral - 133)) | (1L << (Floatingliteral - 133)) | (1L << (Stringliteral - 133)) | (1L << (Userdefinedintegerliteral - 133)) | (1L << (Userdefinedfloatingliteral - 133)) | (1L << (Userdefinedstringliteral - 133)) | (1L << (Userdefinedcharacterliteral - 133)))) != 0)) {
					{
					setState(1172);
					condition();
					}
				}

				setState(1175);
				match(Semi);
				setState(1177);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Throw - 65)) | (1L << (True - 65)) | (1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)) | (1L << (Identifier - 65)) | (1L << (Integerliteral - 65)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (Characterliteral - 133)) | (1L << (Floatingliteral - 133)) | (1L << (Stringliteral - 133)) | (1L << (Userdefinedintegerliteral - 133)) | (1L << (Userdefinedfloatingliteral - 133)) | (1L << (Userdefinedstringliteral - 133)) | (1L << (Userdefinedcharacterliteral - 133)))) != 0)) {
					{
					setState(1176);
					expression(0);
					}
				}

				setState(1179);
				match(RightParen);
				setState(1180);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1182);
				match(For);
				setState(1183);
				match(LeftParen);
				setState(1184);
				forrangedeclaration();
				setState(1185);
				match(Colon);
				setState(1186);
				forrangeinitializer();
				setState(1187);
				match(RightParen);
				setState(1188);
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
		enterRule(_localctx, 114, RULE_forinitstatement);
		try {
			setState(1194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1192);
				expressionstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1193);
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
		enterRule(_localctx, 116, RULE_forrangedeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1197);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1196);
				attributespecifierseq(0);
				}
			}

			setState(1199);
			declspecifierseq();
			setState(1200);
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
		enterRule(_localctx, 118, RULE_forrangeinitializer);
		try {
			setState(1204);
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
				setState(1202);
				expression(0);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1203);
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
		enterRule(_localctx, 120, RULE_jumpstatement);
		int _la;
		try {
			setState(1222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1206);
				match(Break);
				setState(1207);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1208);
				match(Continue);
				setState(1209);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1210);
				match(Return);
				setState(1212);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Throw - 65)) | (1L << (True - 65)) | (1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)) | (1L << (Identifier - 65)) | (1L << (Integerliteral - 65)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (Characterliteral - 133)) | (1L << (Floatingliteral - 133)) | (1L << (Stringliteral - 133)) | (1L << (Userdefinedintegerliteral - 133)) | (1L << (Userdefinedfloatingliteral - 133)) | (1L << (Userdefinedstringliteral - 133)) | (1L << (Userdefinedcharacterliteral - 133)))) != 0)) {
					{
					setState(1211);
					expression(0);
					}
				}

				setState(1214);
				match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1215);
				match(Return);
				setState(1216);
				bracedinitlist();
				setState(1217);
				match(Semi);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1219);
				match(Goto);
				setState(1220);
				match(Identifier);
				setState(1221);
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
		enterRule(_localctx, 122, RULE_declarationstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1224);
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
		int _startState = 124;
		enterRecursionRule(_localctx, 124, RULE_declarationseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1227);
			declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declarationseq);
					setState(1229);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1230);
					declaration();
					}
					} 
				}
				setState(1235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
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
		enterRule(_localctx, 126, RULE_declaration);
		try {
			setState(1245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1236);
				blockdeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1237);
				functiondefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1238);
				templatedeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1239);
				explicitinstantiation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1240);
				explicitspecialization();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1241);
				linkagespecification();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1242);
				namespacedefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1243);
				emptydeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1244);
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
		enterRule(_localctx, 128, RULE_blockdeclaration);
		try {
			setState(1255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1247);
				simpledeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1248);
				asmdefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1249);
				namespacealiasdefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1250);
				usingdeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1251);
				usingdirective();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1252);
				static_assertdeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1253);
				aliasdeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1254);
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
		enterRule(_localctx, 130, RULE_aliasdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1257);
			match(Using);
			setState(1258);
			match(Identifier);
			setState(1260);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1259);
				attributespecifierseq(0);
				}
			}

			setState(1262);
			match(Assign);
			setState(1263);
			typeid();
			setState(1264);
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
		public Ngc_optionaldeclarationContext ngc_optionaldeclaration() {
			return getRuleContext(Ngc_optionaldeclarationContext.class,0);
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
		enterRule(_localctx, 132, RULE_simpledeclaration);
		int _la;
		try {
			setState(1281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1267);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(1266);
					declspecifierseq();
					}
					break;
				}
				setState(1270);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Operator || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (LeftParen - 79)) | (1L << (Star - 79)) | (1L << (And - 79)) | (1L << (Tilde - 79)) | (1L << (AndAnd - 79)) | (1L << (Doublecolon - 79)) | (1L << (Ellipsis - 79)) | (1L << (Identifier - 79)))) != 0)) {
					{
					setState(1269);
					initdeclaratorlist(0);
					}
				}

				setState(1272);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1273);
				attributespecifierseq(0);
				setState(1275);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(1274);
					declspecifierseq();
					}
					break;
				}
				setState(1277);
				initdeclaratorlist(0);
				setState(1278);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1280);
				ngc_optionaldeclaration();
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

	public static class Ngc_optionaldeclarationContext extends ParserRuleContext {
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public InitdeclaratorlistContext initdeclaratorlist() {
			return getRuleContext(InitdeclaratorlistContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public Ngc_optionaldeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngc_optionaldeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterNgc_optionaldeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitNgc_optionaldeclaration(this);
		}
	}

	public final Ngc_optionaldeclarationContext ngc_optionaldeclaration() throws RecognitionException {
		Ngc_optionaldeclarationContext _localctx = new Ngc_optionaldeclarationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_ngc_optionaldeclaration);
		int _la;
		try {
			setState(1299);
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
			case Question:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1284);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Thread_local - 64)) | (1L << (Typedef - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1283);
					declspecifierseq();
					}
				}

				setState(1286);
				match(Question);
				setState(1288);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Operator || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (LeftParen - 79)) | (1L << (Star - 79)) | (1L << (And - 79)) | (1L << (Tilde - 79)) | (1L << (AndAnd - 79)) | (1L << (Doublecolon - 79)) | (1L << (Ellipsis - 79)) | (1L << (Identifier - 79)))) != 0)) {
					{
					setState(1287);
					initdeclaratorlist(0);
					}
				}

				setState(1290);
				match(Semi);
				}
				break;
			case Alignas:
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1291);
				attributespecifierseq(0);
				setState(1293);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Thread_local - 64)) | (1L << (Typedef - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1292);
					declspecifierseq();
					}
				}

				setState(1295);
				match(Question);
				setState(1296);
				initdeclaratorlist(0);
				setState(1297);
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
		enterRule(_localctx, 136, RULE_static_assertdeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1301);
			match(Static_assert);
			setState(1302);
			match(LeftParen);
			setState(1303);
			constantexpression();
			setState(1304);
			match(Comma);
			setState(1305);
			match(Stringliteral);
			setState(1306);
			match(RightParen);
			setState(1307);
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
		enterRule(_localctx, 138, RULE_emptydeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1309);
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
		enterRule(_localctx, 140, RULE_attributedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1311);
			attributespecifierseq(0);
			setState(1312);
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
		enterRule(_localctx, 142, RULE_declspecifier);
		try {
			setState(1320);
			switch (_input.LA(1)) {
			case Extern:
			case Mutable:
			case Register:
			case Static:
			case Thread_local:
				enterOuterAlt(_localctx, 1);
				{
				setState(1314);
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
				setState(1315);
				typespecifier();
				}
				break;
			case Explicit:
			case Inline:
			case Virtual:
				enterOuterAlt(_localctx, 3);
				{
				setState(1316);
				functionspecifier();
				}
				break;
			case Friend:
				enterOuterAlt(_localctx, 4);
				{
				setState(1317);
				match(Friend);
				}
				break;
			case Typedef:
				enterOuterAlt(_localctx, 5);
				{
				setState(1318);
				match(Typedef);
				}
				break;
			case Constexpr:
				enterOuterAlt(_localctx, 6);
				{
				setState(1319);
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
		enterRule(_localctx, 144, RULE_declspecifierseq);
		try {
			setState(1329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1322);
				declspecifier();
				setState(1324);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(1323);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1326);
				declspecifier();
				setState(1327);
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
		enterRule(_localctx, 146, RULE_storageclassspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1331);
			_la = _input.LA(1);
			if ( !(((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & ((1L << (Extern - 29)) | (1L << (Mutable - 29)) | (1L << (Register - 29)) | (1L << (Static - 29)) | (1L << (Thread_local - 29)))) != 0)) ) {
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
		enterRule(_localctx, 148, RULE_functionspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1333);
			_la = _input.LA(1);
			if ( !(((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (Explicit - 27)) | (1L << (Inline - 27)) | (1L << (Virtual - 27)))) != 0)) ) {
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
		enterRule(_localctx, 150, RULE_typedefname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1335);
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
		enterRule(_localctx, 152, RULE_typespecifier);
		try {
			setState(1340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1337);
				trailingtypespecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1338);
				classspecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1339);
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
		enterRule(_localctx, 154, RULE_trailingtypespecifier);
		try {
			setState(1346);
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
				setState(1342);
				simpletypespecifier();
				}
				break;
			case Class:
			case Enum:
			case Struct:
			case Union:
				enterOuterAlt(_localctx, 2);
				{
				setState(1343);
				elaboratedtypespecifier();
				}
				break;
			case Typename:
				enterOuterAlt(_localctx, 3);
				{
				setState(1344);
				typenamespecifier();
				}
				break;
			case Const:
			case Volatile:
				enterOuterAlt(_localctx, 4);
				{
				setState(1345);
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
		enterRule(_localctx, 156, RULE_typespecifierseq);
		try {
			setState(1355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1348);
				typespecifier();
				setState(1350);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(1349);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1352);
				typespecifier();
				setState(1353);
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
		enterRule(_localctx, 158, RULE_trailingtypespecifierseq);
		try {
			setState(1364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1357);
				trailingtypespecifier();
				setState(1359);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(1358);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1361);
				trailingtypespecifier();
				setState(1362);
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
		enterRule(_localctx, 160, RULE_simpletypespecifier);
		try {
			setState(1389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1367);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1366);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1369);
				typename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1370);
				nestednamespecifier(0);
				setState(1371);
				match(Template);
				setState(1372);
				simpletemplateid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1374);
				match(Char);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1375);
				match(Char16);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1376);
				match(Char32);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1377);
				match(Wchar);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1378);
				match(Bool);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1379);
				match(Short);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1380);
				match(Int);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1381);
				match(Long);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1382);
				match(Signed);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1383);
				match(Unsigned);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1384);
				match(Float);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1385);
				match(Double);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1386);
				match(Void);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1387);
				match(Auto);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1388);
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
		enterRule(_localctx, 162, RULE_typename);
		try {
			setState(1395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1391);
				classname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1392);
				enumname();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1393);
				typedefname();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1394);
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
		enterRule(_localctx, 164, RULE_decltypespecifier);
		try {
			setState(1406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1397);
				match(Decltype);
				setState(1398);
				match(LeftParen);
				setState(1399);
				expression(0);
				setState(1400);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1402);
				match(Decltype);
				setState(1403);
				match(LeftParen);
				setState(1404);
				match(Auto);
				setState(1405);
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
		enterRule(_localctx, 166, RULE_elaboratedtypespecifier);
		int _la;
		try {
			setState(1432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1408);
				classkey();
				setState(1410);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1409);
					attributespecifierseq(0);
					}
				}

				setState(1413);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(1412);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1415);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1417);
				classkey();
				setState(1418);
				simpletemplateid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1420);
				classkey();
				setState(1421);
				nestednamespecifier(0);
				setState(1423);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(1422);
					match(Template);
					}
				}

				setState(1425);
				simpletemplateid();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1427);
				match(Enum);
				setState(1429);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
				case 1:
					{
					setState(1428);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1431);
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
		enterRule(_localctx, 168, RULE_enumname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1434);
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
		enterRule(_localctx, 170, RULE_enumspecifier);
		int _la;
		try {
			setState(1449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1436);
				enumhead();
				setState(1437);
				match(LeftBrace);
				setState(1439);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1438);
					enumeratorlist(0);
					}
				}

				setState(1441);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1443);
				enumhead();
				setState(1444);
				match(LeftBrace);
				setState(1445);
				enumeratorlist(0);
				setState(1446);
				match(Comma);
				setState(1447);
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
		enterRule(_localctx, 172, RULE_enumhead);
		int _la;
		try {
			setState(1470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1451);
				enumkey();
				setState(1453);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1452);
					attributespecifierseq(0);
					}
				}

				setState(1456);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1455);
					match(Identifier);
					}
				}

				setState(1459);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1458);
					enumbase();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1461);
				enumkey();
				setState(1463);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1462);
					attributespecifierseq(0);
					}
				}

				setState(1465);
				nestednamespecifier(0);
				setState(1466);
				match(Identifier);
				setState(1468);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1467);
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
		enterRule(_localctx, 174, RULE_opaqueenumdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1472);
			enumkey();
			setState(1474);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1473);
				attributespecifierseq(0);
				}
			}

			setState(1476);
			match(Identifier);
			setState(1478);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1477);
				enumbase();
				}
			}

			setState(1480);
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
		enterRule(_localctx, 176, RULE_enumkey);
		try {
			setState(1487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1482);
				match(Enum);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1483);
				match(Enum);
				setState(1484);
				match(Class);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1485);
				match(Enum);
				setState(1486);
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
		enterRule(_localctx, 178, RULE_enumbase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1489);
			match(Colon);
			setState(1490);
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
		int _startState = 180;
		enterRecursionRule(_localctx, 180, RULE_enumeratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1493);
			enumeratordefinition();
			}
			_ctx.stop = _input.LT(-1);
			setState(1500);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EnumeratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_enumeratorlist);
					setState(1495);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1496);
					match(Comma);
					setState(1497);
					enumeratordefinition();
					}
					} 
				}
				setState(1502);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
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
		enterRule(_localctx, 182, RULE_enumeratordefinition);
		try {
			setState(1508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1503);
				enumerator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1504);
				enumerator();
				setState(1505);
				match(Assign);
				setState(1506);
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
		enterRule(_localctx, 184, RULE_enumerator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1510);
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
		enterRule(_localctx, 186, RULE_namespacename);
		try {
			setState(1514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1512);
				originalnamespacename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1513);
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
		enterRule(_localctx, 188, RULE_originalnamespacename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1516);
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
		enterRule(_localctx, 190, RULE_namespacedefinition);
		try {
			setState(1520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1518);
				namednamespacedefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1519);
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
		enterRule(_localctx, 192, RULE_namednamespacedefinition);
		try {
			setState(1524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1522);
				originalnamespacedefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1523);
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
		enterRule(_localctx, 194, RULE_originalnamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1527);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1526);
				match(Inline);
				}
			}

			setState(1529);
			match(Namespace);
			setState(1530);
			match(Identifier);
			setState(1531);
			match(LeftBrace);
			setState(1532);
			namespacebody();
			setState(1533);
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
		enterRule(_localctx, 196, RULE_extensionnamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1536);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1535);
				match(Inline);
				}
			}

			setState(1538);
			match(Namespace);
			setState(1539);
			originalnamespacename();
			setState(1540);
			match(LeftBrace);
			setState(1541);
			namespacebody();
			setState(1542);
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
		enterRule(_localctx, 198, RULE_unnamednamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1545);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1544);
				match(Inline);
				}
			}

			setState(1547);
			match(Namespace);
			setState(1548);
			match(LeftBrace);
			setState(1549);
			namespacebody();
			setState(1550);
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
		enterRule(_localctx, 200, RULE_namespacebody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1553);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Thread_local - 64)) | (1L << (Typedef - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Tilde - 64)) | (1L << (AndAnd - 64)) | (1L << (Question - 64)) | (1L << (Doublecolon - 64)) | (1L << (Semi - 64)) | (1L << (Ellipsis - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(1552);
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
		enterRule(_localctx, 202, RULE_namespacealias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1555);
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
		enterRule(_localctx, 204, RULE_namespacealiasdefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1557);
			match(Namespace);
			setState(1558);
			match(Identifier);
			setState(1559);
			match(Assign);
			setState(1560);
			qualifiednamespacespecifier();
			setState(1561);
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
		enterRule(_localctx, 206, RULE_qualifiednamespacespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(1563);
				nestednamespecifier(0);
				}
				break;
			}
			setState(1566);
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
		enterRule(_localctx, 208, RULE_usingdeclaration);
		int _la;
		try {
			setState(1581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1568);
				match(Using);
				setState(1570);
				_la = _input.LA(1);
				if (_la==Typename) {
					{
					setState(1569);
					match(Typename);
					}
				}

				setState(1572);
				nestednamespecifier(0);
				setState(1573);
				unqualifiedid();
				setState(1574);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1576);
				match(Using);
				setState(1577);
				match(Doublecolon);
				setState(1578);
				unqualifiedid();
				setState(1579);
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
		enterRule(_localctx, 210, RULE_usingdirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1584);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1583);
				attributespecifierseq(0);
				}
			}

			setState(1586);
			match(Using);
			setState(1587);
			match(Namespace);
			setState(1589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				setState(1588);
				nestednamespecifier(0);
				}
				break;
			}
			setState(1591);
			namespacename();
			setState(1592);
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
		enterRule(_localctx, 212, RULE_asmdefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1594);
			match(Asm);
			setState(1595);
			match(LeftParen);
			setState(1596);
			match(Stringliteral);
			setState(1597);
			match(RightParen);
			setState(1598);
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
		enterRule(_localctx, 214, RULE_linkagespecification);
		int _la;
		try {
			setState(1610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1600);
				match(Extern);
				setState(1601);
				match(Stringliteral);
				setState(1602);
				match(LeftBrace);
				setState(1604);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Thread_local - 64)) | (1L << (Typedef - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Tilde - 64)) | (1L << (AndAnd - 64)) | (1L << (Question - 64)) | (1L << (Doublecolon - 64)) | (1L << (Semi - 64)) | (1L << (Ellipsis - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1603);
					declarationseq(0);
					}
				}

				setState(1606);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1607);
				match(Extern);
				setState(1608);
				match(Stringliteral);
				setState(1609);
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
		int _startState = 216;
		enterRecursionRule(_localctx, 216, RULE_attributespecifierseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1613);
			attributespecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1619);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AttributespecifierseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_attributespecifierseq);
					setState(1615);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1616);
					attributespecifier();
					}
					} 
				}
				setState(1621);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
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
		enterRule(_localctx, 218, RULE_attributespecifier);
		try {
			setState(1629);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1622);
				match(LeftBracket);
				setState(1623);
				match(LeftBracket);
				setState(1624);
				attributelist(0);
				setState(1625);
				match(RightBracket);
				setState(1626);
				match(RightBracket);
				}
				break;
			case Alignas:
				enterOuterAlt(_localctx, 2);
				{
				setState(1628);
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
		enterRule(_localctx, 220, RULE_alignmentspecifier);
		int _la;
		try {
			setState(1647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1631);
				match(Alignas);
				setState(1632);
				match(LeftParen);
				setState(1633);
				typeid();
				setState(1635);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1634);
					match(Ellipsis);
					}
				}

				setState(1637);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1639);
				match(Alignas);
				setState(1640);
				match(LeftParen);
				setState(1641);
				constantexpression();
				setState(1643);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1642);
					match(Ellipsis);
					}
				}

				setState(1645);
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
		int _startState = 222;
		enterRecursionRule(_localctx, 222, RULE_attributelist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1651);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
				case 1:
					{
					setState(1650);
					attribute();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1653);
				attribute();
				setState(1654);
				match(Ellipsis);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1670);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1668);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
					case 1:
						{
						_localctx = new AttributelistContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_attributelist);
						setState(1658);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1659);
						match(Comma);
						setState(1661);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
						case 1:
							{
							setState(1660);
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
						setState(1663);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1664);
						match(Comma);
						setState(1665);
						attribute();
						setState(1666);
						match(Ellipsis);
						}
						break;
					}
					} 
				}
				setState(1672);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
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
		enterRule(_localctx, 224, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1673);
			attributetoken();
			setState(1675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1674);
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
		enterRule(_localctx, 226, RULE_attributetoken);
		try {
			setState(1679);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1677);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1678);
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
		enterRule(_localctx, 228, RULE_attributescopedtoken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1681);
			attributenamespace();
			setState(1682);
			match(Doublecolon);
			setState(1683);
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
		enterRule(_localctx, 230, RULE_attributenamespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1685);
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
		enterRule(_localctx, 232, RULE_attributeargumentclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1687);
			match(LeftParen);
			setState(1688);
			balancedtokenseq(0);
			setState(1689);
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
		int _startState = 234;
		enterRecursionRule(_localctx, 234, RULE_balancedtokenseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1692);
				balancedtoken();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(1699);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BalancedtokenseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_balancedtokenseq);
					setState(1695);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1696);
					balancedtoken();
					}
					} 
				}
				setState(1701);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
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
		enterRule(_localctx, 236, RULE_balancedtoken);
		try {
			setState(1714);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(1702);
				match(LeftParen);
				setState(1703);
				balancedtokenseq(0);
				setState(1704);
				match(RightParen);
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1706);
				match(LeftBracket);
				setState(1707);
				balancedtokenseq(0);
				setState(1708);
				match(RightBracket);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(1710);
				match(LeftBrace);
				setState(1711);
				balancedtokenseq(0);
				setState(1712);
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
		int _startState = 238;
		enterRecursionRule(_localctx, 238, RULE_initdeclaratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1717);
			initdeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(1724);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitdeclaratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initdeclaratorlist);
					setState(1719);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1720);
					match(Comma);
					setState(1721);
					initdeclarator();
					}
					} 
				}
				setState(1726);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
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
		enterRule(_localctx, 240, RULE_initdeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1727);
			declarator();
			setState(1729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1728);
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
		enterRule(_localctx, 242, RULE_declarator);
		try {
			setState(1736);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1731);
				ptrdeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1732);
				noptrdeclarator(0);
				setState(1733);
				parametersandqualifiers();
				setState(1734);
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
		enterRule(_localctx, 244, RULE_ptrdeclarator);
		try {
			setState(1742);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1738);
				noptrdeclarator(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1739);
				ptroperator();
				setState(1740);
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
		int _startState = 246;
		enterRecursionRule(_localctx, 246, RULE_noptrdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1753);
			switch (_input.LA(1)) {
			case Decltype:
			case Operator:
			case Tilde:
			case Doublecolon:
			case Ellipsis:
			case Identifier:
				{
				setState(1745);
				declaratorid();
				setState(1747);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1746);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case LeftParen:
				{
				setState(1749);
				match(LeftParen);
				setState(1750);
				ptrdeclarator();
				setState(1751);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1768);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1766);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrdeclarator);
						setState(1755);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1756);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrdeclarator);
						setState(1757);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1758);
						match(LeftBracket);
						setState(1760);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (True - 66)) | (1L << (Typeid - 66)) | (1L << (Typename - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (Not - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Doublecolon - 66)) | (1L << (Identifier - 66)) | (1L << (Integerliteral - 66)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (Characterliteral - 133)) | (1L << (Floatingliteral - 133)) | (1L << (Stringliteral - 133)) | (1L << (Userdefinedintegerliteral - 133)) | (1L << (Userdefinedfloatingliteral - 133)) | (1L << (Userdefinedstringliteral - 133)) | (1L << (Userdefinedcharacterliteral - 133)))) != 0)) {
							{
							setState(1759);
							constantexpression();
							}
						}

						setState(1762);
						match(RightBracket);
						setState(1764);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
						case 1:
							{
							setState(1763);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1770);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
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
		enterRule(_localctx, 248, RULE_parametersandqualifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1771);
			match(LeftParen);
			setState(1772);
			parameterdeclarationclause();
			setState(1773);
			match(RightParen);
			setState(1775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1774);
				cvqualifierseq();
				}
				break;
			}
			setState(1778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1777);
				refqualifier();
				}
				break;
			}
			setState(1781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1780);
				exceptionspecification();
				}
				break;
			}
			setState(1784);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1783);
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
		enterRule(_localctx, 250, RULE_trailingreturntype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1786);
			match(Arrow);
			setState(1787);
			trailingtypespecifierseq();
			setState(1789);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				{
				setState(1788);
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
		enterRule(_localctx, 252, RULE_ptroperator);
		try {
			setState(1814);
			switch (_input.LA(1)) {
			case Star:
				enterOuterAlt(_localctx, 1);
				{
				setState(1791);
				match(Star);
				setState(1793);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1792);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1796);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1795);
					cvqualifierseq();
					}
					break;
				}
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(1798);
				match(And);
				setState(1800);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1799);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case AndAnd:
				enterOuterAlt(_localctx, 3);
				{
				setState(1802);
				match(AndAnd);
				setState(1804);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1803);
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
				setState(1806);
				nestednamespecifier(0);
				setState(1807);
				match(Star);
				setState(1809);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1808);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1812);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1811);
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
		enterRule(_localctx, 254, RULE_cvqualifierseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1816);
			cvqualifier();
			setState(1818);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				{
				setState(1817);
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
		enterRule(_localctx, 256, RULE_cvqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1820);
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
		enterRule(_localctx, 258, RULE_refqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1822);
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
		enterRule(_localctx, 260, RULE_declaratorid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1825);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1824);
				match(Ellipsis);
				}
			}

			setState(1827);
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
		enterRule(_localctx, 262, RULE_typeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1829);
			typespecifierseq();
			setState(1831);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1830);
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
		enterRule(_localctx, 264, RULE_abstractdeclarator);
		try {
			setState(1841);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1833);
				ptrabstractdeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1835);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1834);
					noptrabstractdeclarator(0);
					}
					break;
				}
				setState(1837);
				parametersandqualifiers();
				setState(1838);
				trailingreturntype();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1840);
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
		enterRule(_localctx, 266, RULE_ptrabstractdeclarator);
		try {
			setState(1848);
			switch (_input.LA(1)) {
			case LeftParen:
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1843);
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
				setState(1844);
				ptroperator();
				setState(1846);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
				case 1:
					{
					setState(1845);
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
		int _startState = 268;
		enterRecursionRule(_localctx, 268, RULE_noptrabstractdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1864);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				{
				setState(1851);
				parametersandqualifiers();
				}
				break;
			case 2:
				{
				setState(1852);
				match(LeftBracket);
				setState(1854);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (True - 66)) | (1L << (Typeid - 66)) | (1L << (Typename - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (Not - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Doublecolon - 66)) | (1L << (Identifier - 66)) | (1L << (Integerliteral - 66)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (Characterliteral - 133)) | (1L << (Floatingliteral - 133)) | (1L << (Stringliteral - 133)) | (1L << (Userdefinedintegerliteral - 133)) | (1L << (Userdefinedfloatingliteral - 133)) | (1L << (Userdefinedstringliteral - 133)) | (1L << (Userdefinedcharacterliteral - 133)))) != 0)) {
					{
					setState(1853);
					constantexpression();
					}
				}

				setState(1856);
				match(RightBracket);
				setState(1858);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1857);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1860);
				match(LeftParen);
				setState(1861);
				ptrabstractdeclarator();
				setState(1862);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1879);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1877);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrabstractdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractdeclarator);
						setState(1866);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1867);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrabstractdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractdeclarator);
						setState(1868);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1869);
						match(LeftBracket);
						setState(1871);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (True - 66)) | (1L << (Typeid - 66)) | (1L << (Typename - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (Not - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Doublecolon - 66)) | (1L << (Identifier - 66)) | (1L << (Integerliteral - 66)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (Characterliteral - 133)) | (1L << (Floatingliteral - 133)) | (1L << (Stringliteral - 133)) | (1L << (Userdefinedintegerliteral - 133)) | (1L << (Userdefinedfloatingliteral - 133)) | (1L << (Userdefinedstringliteral - 133)) | (1L << (Userdefinedcharacterliteral - 133)))) != 0)) {
							{
							setState(1870);
							constantexpression();
							}
						}

						setState(1873);
						match(RightBracket);
						setState(1875);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
						case 1:
							{
							setState(1874);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1881);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
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
		enterRule(_localctx, 270, RULE_abstractpackdeclarator);
		try {
			setState(1886);
			switch (_input.LA(1)) {
			case Ellipsis:
				enterOuterAlt(_localctx, 1);
				{
				setState(1882);
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
				setState(1883);
				ptroperator();
				setState(1884);
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
		int _startState = 272;
		enterRecursionRule(_localctx, 272, RULE_noptrabstractpackdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1889);
			match(Ellipsis);
			}
			_ctx.stop = _input.LT(-1);
			setState(1904);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1902);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrabstractpackdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractpackdeclarator);
						setState(1891);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1892);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrabstractpackdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractpackdeclarator);
						setState(1893);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1894);
						match(LeftBracket);
						setState(1896);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (True - 66)) | (1L << (Typeid - 66)) | (1L << (Typename - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (Not - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Doublecolon - 66)) | (1L << (Identifier - 66)) | (1L << (Integerliteral - 66)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (Characterliteral - 133)) | (1L << (Floatingliteral - 133)) | (1L << (Stringliteral - 133)) | (1L << (Userdefinedintegerliteral - 133)) | (1L << (Userdefinedfloatingliteral - 133)) | (1L << (Userdefinedstringliteral - 133)) | (1L << (Userdefinedcharacterliteral - 133)))) != 0)) {
							{
							setState(1895);
							constantexpression();
							}
						}

						setState(1898);
						match(RightBracket);
						setState(1900);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
						case 1:
							{
							setState(1899);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1906);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
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
		enterRule(_localctx, 274, RULE_parameterdeclarationclause);
		int _la;
		try {
			setState(1917);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1908);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Thread_local - 64)) | (1L << (Typedef - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftBracket - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(1907);
					parameterdeclarationlist(0);
					}
				}

				setState(1911);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1910);
					match(Ellipsis);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1913);
				parameterdeclarationlist(0);
				setState(1914);
				match(Comma);
				setState(1915);
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
		int _startState = 276;
		enterRecursionRule(_localctx, 276, RULE_parameterdeclarationlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1920);
			parameterdeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1927);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterdeclarationlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterdeclarationlist);
					setState(1922);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1923);
					match(Comma);
					setState(1924);
					parameterdeclaration();
					}
					} 
				}
				setState(1929);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
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
		enterRule(_localctx, 278, RULE_parameterdeclaration);
		int _la;
		try {
			setState(1961);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1931);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1930);
					attributespecifierseq(0);
					}
				}

				setState(1933);
				declspecifierseq();
				setState(1934);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1937);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1936);
					attributespecifierseq(0);
					}
				}

				setState(1939);
				declspecifierseq();
				setState(1940);
				declarator();
				setState(1941);
				match(Assign);
				setState(1942);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1945);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1944);
					attributespecifierseq(0);
					}
				}

				setState(1947);
				declspecifierseq();
				setState(1949);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
				case 1:
					{
					setState(1948);
					abstractdeclarator();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1952);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1951);
					attributespecifierseq(0);
					}
				}

				setState(1954);
				declspecifierseq();
				setState(1956);
				_la = _input.LA(1);
				if (_la==Decltype || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (LeftParen - 79)) | (1L << (LeftBracket - 79)) | (1L << (Star - 79)) | (1L << (And - 79)) | (1L << (AndAnd - 79)) | (1L << (Doublecolon - 79)) | (1L << (Ellipsis - 79)) | (1L << (Identifier - 79)))) != 0)) {
					{
					setState(1955);
					abstractdeclarator();
					}
				}

				setState(1958);
				match(Assign);
				setState(1959);
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
		enterRule(_localctx, 280, RULE_functiondefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1964);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1963);
				attributespecifierseq(0);
				}
			}

			setState(1967);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				{
				setState(1966);
				declspecifierseq();
				}
				break;
			}
			setState(1969);
			declarator();
			setState(1971);
			_la = _input.LA(1);
			if (_la==Final || _la==Override) {
				{
				setState(1970);
				virtspecifierseq(0);
				}
			}

			setState(1973);
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
		enterRule(_localctx, 282, RULE_functionbody);
		int _la;
		try {
			setState(1986);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1976);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1975);
					ctorinitializer();
					}
				}

				setState(1978);
				compoundstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1979);
				functiontryblock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1980);
				match(Assign);
				setState(1981);
				match(Default);
				setState(1982);
				match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1983);
				match(Assign);
				setState(1984);
				match(Delete);
				setState(1985);
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
		enterRule(_localctx, 284, RULE_initializer);
		try {
			setState(1993);
			switch (_input.LA(1)) {
			case LeftBrace:
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(1988);
				braceorequalinitializer();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(1989);
				match(LeftParen);
				setState(1990);
				expressionlist();
				setState(1991);
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
		public Ngc_optionaldefaultinitializerContext ngc_optionaldefaultinitializer() {
			return getRuleContext(Ngc_optionaldefaultinitializerContext.class,0);
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
		enterRule(_localctx, 286, RULE_braceorequalinitializer);
		try {
			setState(1999);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1995);
				match(Assign);
				setState(1996);
				initializerclause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1997);
				bracedinitlist();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1998);
				ngc_optionaldefaultinitializer();
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

	public static class Ngc_optionaldefaultinitializerContext extends ParserRuleContext {
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public PrimaryexpressionContext primaryexpression() {
			return getRuleContext(PrimaryexpressionContext.class,0);
		}
		public Ngc_optionaldefaultinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngc_optionaldefaultinitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).enterNgc_optionaldefaultinitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NGCListener ) ((NGCListener)listener).exitNgc_optionaldefaultinitializer(this);
		}
	}

	public final Ngc_optionaldefaultinitializerContext ngc_optionaldefaultinitializer() throws RecognitionException {
		Ngc_optionaldefaultinitializerContext _localctx = new Ngc_optionaldefaultinitializerContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_ngc_optionaldefaultinitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2001);
			match(Assign);
			setState(2002);
			assignmentexpression();
			setState(2003);
			match(T__0);
			setState(2004);
			primaryexpression();
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
		enterRule(_localctx, 290, RULE_initializerclause);
		try {
			setState(2008);
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
				setState(2006);
				assignmentexpression();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(2007);
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
		int _startState = 292;
		enterRecursionRule(_localctx, 292, RULE_initializerlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2011);
			initializerclause();
			setState(2013);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				{
				setState(2012);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2023);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitializerlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initializerlist);
					setState(2015);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2016);
					match(Comma);
					setState(2017);
					initializerclause();
					setState(2019);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
					case 1:
						{
						setState(2018);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2025);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
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
		enterRule(_localctx, 294, RULE_bracedinitlist);
		int _la;
		try {
			setState(2035);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2026);
				match(LeftBrace);
				setState(2027);
				initializerlist(0);
				setState(2029);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(2028);
					match(Comma);
					}
				}

				setState(2031);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2033);
				match(LeftBrace);
				setState(2034);
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
		enterRule(_localctx, 296, RULE_classname);
		try {
			setState(2039);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2037);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2038);
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
		enterRule(_localctx, 298, RULE_classspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2041);
			classhead();
			setState(2042);
			match(LeftBrace);
			setState(2044);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Thread_local - 64)) | (1L << (Typedef - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Tilde - 64)) | (1L << (AndAnd - 64)) | (1L << (Question - 64)) | (1L << (Colon - 64)) | (1L << (Doublecolon - 64)) | (1L << (Semi - 64)) | (1L << (Ellipsis - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(2043);
				memberspecification();
				}
			}

			setState(2046);
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
		enterRule(_localctx, 300, RULE_classhead);
		int _la;
		try {
			setState(2066);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2048);
				classkey();
				setState(2050);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2049);
					attributespecifierseq(0);
					}
				}

				setState(2052);
				classheadname();
				setState(2054);
				_la = _input.LA(1);
				if (_la==Final) {
					{
					setState(2053);
					classvirtspecifier();
					}
				}

				setState(2057);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(2056);
					baseclause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2059);
				classkey();
				setState(2061);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2060);
					attributespecifierseq(0);
					}
				}

				setState(2064);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(2063);
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
		enterRule(_localctx, 302, RULE_classheadname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2069);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				{
				setState(2068);
				nestednamespecifier(0);
				}
				break;
			}
			setState(2071);
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
		enterRule(_localctx, 304, RULE_classvirtspecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2073);
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
		enterRule(_localctx, 306, RULE_classkey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2075);
			_la = _input.LA(1);
			if ( !(((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (Class - 14)) | (1L << (Struct - 14)) | (1L << (Union - 14)))) != 0)) ) {
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
		enterRule(_localctx, 308, RULE_memberspecification);
		int _la;
		try {
			setState(2086);
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
			case Question:
			case Colon:
			case Doublecolon:
			case Semi:
			case Ellipsis:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2077);
				memberdeclaration();
				setState(2079);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Thread_local - 64)) | (1L << (Typedef - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Tilde - 64)) | (1L << (AndAnd - 64)) | (1L << (Question - 64)) | (1L << (Colon - 64)) | (1L << (Doublecolon - 64)) | (1L << (Semi - 64)) | (1L << (Ellipsis - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(2078);
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
				setState(2081);
				accessspecifier();
				setState(2082);
				match(Colon);
				setState(2084);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Thread_local - 64)) | (1L << (Typedef - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Tilde - 64)) | (1L << (AndAnd - 64)) | (1L << (Question - 64)) | (1L << (Colon - 64)) | (1L << (Doublecolon - 64)) | (1L << (Semi - 64)) | (1L << (Ellipsis - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(2083);
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
		public Ngc_optionaldeclarationContext ngc_optionaldeclaration() {
			return getRuleContext(Ngc_optionaldeclarationContext.class,0);
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
		enterRule(_localctx, 310, RULE_memberdeclaration);
		int _la;
		try {
			setState(2105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2089);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
				case 1:
					{
					setState(2088);
					attributespecifierseq(0);
					}
					break;
				}
				setState(2092);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
				case 1:
					{
					setState(2091);
					declspecifierseq();
					}
					break;
				}
				setState(2095);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Decltype) | (1L << Operator))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (LeftParen - 79)) | (1L << (LeftBracket - 79)) | (1L << (Star - 79)) | (1L << (And - 79)) | (1L << (Tilde - 79)) | (1L << (AndAnd - 79)) | (1L << (Colon - 79)) | (1L << (Doublecolon - 79)) | (1L << (Ellipsis - 79)) | (1L << (Identifier - 79)))) != 0)) {
					{
					setState(2094);
					memberdeclaratorlist(0);
					}
				}

				setState(2097);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2098);
				functiondefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2099);
				usingdeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2100);
				static_assertdeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2101);
				templatedeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2102);
				aliasdeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2103);
				emptydeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2104);
				ngc_optionaldeclaration();
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
		int _startState = 312;
		enterRecursionRule(_localctx, 312, RULE_memberdeclaratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2108);
			memberdeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(2115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MemberdeclaratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_memberdeclaratorlist);
					setState(2110);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2111);
					match(Comma);
					setState(2112);
					memberdeclarator();
					}
					} 
				}
				setState(2117);
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
		enterRule(_localctx, 314, RULE_memberdeclarator);
		int _la;
		try {
			setState(2137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2118);
				declarator();
				setState(2120);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
				case 1:
					{
					setState(2119);
					virtspecifierseq(0);
					}
					break;
				}
				setState(2123);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
				case 1:
					{
					setState(2122);
					purespecifier();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2125);
				declarator();
				setState(2127);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
				case 1:
					{
					setState(2126);
					braceorequalinitializer();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2130);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2129);
					match(Identifier);
					}
				}

				setState(2133);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2132);
					attributespecifierseq(0);
					}
				}

				setState(2135);
				match(Colon);
				setState(2136);
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
		int _startState = 316;
		enterRecursionRule(_localctx, 316, RULE_virtspecifierseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2140);
			virtspecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(2146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VirtspecifierseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_virtspecifierseq);
					setState(2142);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2143);
					virtspecifier();
					}
					} 
				}
				setState(2148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
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
		enterRule(_localctx, 318, RULE_virtspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2149);
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
		enterRule(_localctx, 320, RULE_purespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2151);
			match(Assign);
			setState(2152);
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
		enterRule(_localctx, 322, RULE_baseclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2155);
			match(Colon);
			setState(2156);
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
		int _startState = 324;
		enterRecursionRule(_localctx, 324, RULE_basespecifierlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2159);
			basespecifier();
			setState(2161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
			case 1:
				{
				setState(2160);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BasespecifierlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_basespecifierlist);
					setState(2163);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2164);
					match(Comma);
					setState(2165);
					basespecifier();
					setState(2167);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
					case 1:
						{
						setState(2166);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
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
		enterRule(_localctx, 326, RULE_basespecifier);
		int _la;
		try {
			setState(2195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2175);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2174);
					attributespecifierseq(0);
					}
				}

				setState(2177);
				basetypespecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2179);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2178);
					attributespecifierseq(0);
					}
				}

				setState(2181);
				match(Virtual);
				setState(2183);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Private) | (1L << Protected) | (1L << Public))) != 0)) {
					{
					setState(2182);
					accessspecifier();
					}
				}

				setState(2185);
				basetypespecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2187);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2186);
					attributespecifierseq(0);
					}
				}

				setState(2189);
				accessspecifier();
				setState(2191);
				_la = _input.LA(1);
				if (_la==Virtual) {
					{
					setState(2190);
					match(Virtual);
					}
				}

				setState(2193);
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
		enterRule(_localctx, 328, RULE_classordecltype);
		try {
			setState(2202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2198);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
				case 1:
					{
					setState(2197);
					nestednamespecifier(0);
					}
					break;
				}
				setState(2200);
				classname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2201);
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
		enterRule(_localctx, 330, RULE_basetypespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2204);
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
		enterRule(_localctx, 332, RULE_accessspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2206);
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
		enterRule(_localctx, 334, RULE_conversionfunctionid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2208);
			match(Operator);
			setState(2209);
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
		enterRule(_localctx, 336, RULE_conversiontypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2211);
			typespecifierseq();
			setState(2213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				{
				setState(2212);
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
		enterRule(_localctx, 338, RULE_conversiondeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2215);
			ptroperator();
			setState(2217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
			case 1:
				{
				setState(2216);
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
		enterRule(_localctx, 340, RULE_ctorinitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2219);
			match(Colon);
			setState(2220);
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
		enterRule(_localctx, 342, RULE_meminitializerlist);
		int _la;
		try {
			setState(2233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2222);
				meminitializer();
				setState(2224);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2223);
					match(Ellipsis);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2226);
				meminitializer();
				setState(2228);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2227);
					match(Ellipsis);
					}
				}

				setState(2230);
				match(Comma);
				setState(2231);
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
		enterRule(_localctx, 344, RULE_meminitializer);
		int _la;
		try {
			setState(2245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2235);
				meminitializerid();
				setState(2236);
				match(LeftParen);
				setState(2238);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Throw - 65)) | (1L << (True - 65)) | (1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)) | (1L << (Identifier - 65)) | (1L << (Integerliteral - 65)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (Characterliteral - 133)) | (1L << (Floatingliteral - 133)) | (1L << (Stringliteral - 133)) | (1L << (Userdefinedintegerliteral - 133)) | (1L << (Userdefinedfloatingliteral - 133)) | (1L << (Userdefinedstringliteral - 133)) | (1L << (Userdefinedcharacterliteral - 133)))) != 0)) {
					{
					setState(2237);
					expressionlist();
					}
				}

				setState(2240);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2242);
				meminitializerid();
				setState(2243);
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
		enterRule(_localctx, 346, RULE_meminitializerid);
		try {
			setState(2249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2247);
				classordecltype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2248);
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
		enterRule(_localctx, 348, RULE_operatorfunctionid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2251);
			match(Operator);
			setState(2252);
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
		enterRule(_localctx, 350, RULE_literaloperatorid);
		try {
			setState(2259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2254);
				match(Operator);
				setState(2255);
				match(Stringliteral);
				setState(2256);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2257);
				match(Operator);
				setState(2258);
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
		enterRule(_localctx, 352, RULE_templatedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2261);
			match(Template);
			setState(2262);
			match(Less);
			setState(2263);
			templateparameterlist(0);
			setState(2264);
			match(Greater);
			setState(2265);
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
		int _startState = 354;
		enterRecursionRule(_localctx, 354, RULE_templateparameterlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2268);
			templateparameter();
			}
			_ctx.stop = _input.LT(-1);
			setState(2275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,285,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TemplateparameterlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_templateparameterlist);
					setState(2270);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2271);
					match(Comma);
					setState(2272);
					templateparameter();
					}
					} 
				}
				setState(2277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,285,_ctx);
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
		enterRule(_localctx, 356, RULE_templateparameter);
		try {
			setState(2280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2278);
				typeparameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2279);
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
		enterRule(_localctx, 358, RULE_typeparameter);
		int _la;
		try {
			setState(2330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2282);
				match(Class);
				setState(2284);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
				case 1:
					{
					setState(2283);
					match(Ellipsis);
					}
					break;
				}
				setState(2287);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
				case 1:
					{
					setState(2286);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2289);
				match(Class);
				setState(2291);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2290);
					match(Identifier);
					}
				}

				setState(2293);
				match(Assign);
				setState(2294);
				typeid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2295);
				match(Typename);
				setState(2297);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
				case 1:
					{
					setState(2296);
					match(Ellipsis);
					}
					break;
				}
				setState(2300);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
				case 1:
					{
					setState(2299);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2302);
				match(Typename);
				setState(2304);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2303);
					match(Identifier);
					}
				}

				setState(2306);
				match(Assign);
				setState(2307);
				typeid();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2308);
				match(Template);
				setState(2309);
				match(Less);
				setState(2310);
				templateparameterlist(0);
				setState(2311);
				match(Greater);
				setState(2312);
				match(Class);
				setState(2314);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
				case 1:
					{
					setState(2313);
					match(Ellipsis);
					}
					break;
				}
				setState(2317);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
				case 1:
					{
					setState(2316);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2319);
				match(Template);
				setState(2320);
				match(Less);
				setState(2321);
				templateparameterlist(0);
				setState(2322);
				match(Greater);
				setState(2323);
				match(Class);
				setState(2325);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2324);
					match(Identifier);
					}
				}

				setState(2327);
				match(Assign);
				setState(2328);
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
		enterRule(_localctx, 360, RULE_simpletemplateid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2332);
			templatename();
			setState(2333);
			match(Less);
			setState(2335);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << Struct) | (1L << This))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (True - 66)) | (1L << (Typeid - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (Not - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Doublecolon - 66)) | (1L << (Identifier - 66)) | (1L << (Integerliteral - 66)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (Characterliteral - 133)) | (1L << (Floatingliteral - 133)) | (1L << (Stringliteral - 133)) | (1L << (Userdefinedintegerliteral - 133)) | (1L << (Userdefinedfloatingliteral - 133)) | (1L << (Userdefinedstringliteral - 133)) | (1L << (Userdefinedcharacterliteral - 133)))) != 0)) {
				{
				setState(2334);
				templateargumentlist(0);
				}
			}

			setState(2337);
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
		enterRule(_localctx, 362, RULE_templateid);
		int _la;
		try {
			setState(2354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2339);
				simpletemplateid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2340);
				operatorfunctionid();
				setState(2341);
				match(Less);
				setState(2343);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << Struct) | (1L << This))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (True - 66)) | (1L << (Typeid - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (Not - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Doublecolon - 66)) | (1L << (Identifier - 66)) | (1L << (Integerliteral - 66)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (Characterliteral - 133)) | (1L << (Floatingliteral - 133)) | (1L << (Stringliteral - 133)) | (1L << (Userdefinedintegerliteral - 133)) | (1L << (Userdefinedfloatingliteral - 133)) | (1L << (Userdefinedstringliteral - 133)) | (1L << (Userdefinedcharacterliteral - 133)))) != 0)) {
					{
					setState(2342);
					templateargumentlist(0);
					}
				}

				setState(2345);
				match(Greater);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2347);
				literaloperatorid();
				setState(2348);
				match(Less);
				setState(2350);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << Struct) | (1L << This))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (True - 66)) | (1L << (Typeid - 66)) | (1L << (Typename - 66)) | (1L << (Union - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (Not - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Doublecolon - 66)) | (1L << (Identifier - 66)) | (1L << (Integerliteral - 66)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (Characterliteral - 133)) | (1L << (Floatingliteral - 133)) | (1L << (Stringliteral - 133)) | (1L << (Userdefinedintegerliteral - 133)) | (1L << (Userdefinedfloatingliteral - 133)) | (1L << (Userdefinedstringliteral - 133)) | (1L << (Userdefinedcharacterliteral - 133)))) != 0)) {
					{
					setState(2349);
					templateargumentlist(0);
					}
				}

				setState(2352);
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
		enterRule(_localctx, 364, RULE_templatename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2356);
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
		int _startState = 366;
		enterRecursionRule(_localctx, 366, RULE_templateargumentlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2359);
			templateargument();
			setState(2361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
			case 1:
				{
				setState(2360);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2371);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TemplateargumentlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_templateargumentlist);
					setState(2363);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2364);
					match(Comma);
					setState(2365);
					templateargument();
					setState(2367);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
					case 1:
						{
						setState(2366);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2373);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
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
		enterRule(_localctx, 368, RULE_templateargument);
		try {
			setState(2377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2374);
				constantexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2375);
				typeid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2376);
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
		enterRule(_localctx, 370, RULE_typenamespecifier);
		int _la;
		try {
			setState(2390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2379);
				match(Typename);
				setState(2380);
				nestednamespecifier(0);
				setState(2381);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2383);
				match(Typename);
				setState(2384);
				nestednamespecifier(0);
				setState(2386);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(2385);
					match(Template);
					}
				}

				setState(2388);
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
		enterRule(_localctx, 372, RULE_explicitinstantiation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2393);
			_la = _input.LA(1);
			if (_la==Extern) {
				{
				setState(2392);
				match(Extern);
				}
			}

			setState(2395);
			match(Template);
			setState(2396);
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
		enterRule(_localctx, 374, RULE_explicitspecialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2398);
			match(Template);
			setState(2399);
			match(Less);
			setState(2400);
			match(Greater);
			setState(2401);
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
		enterRule(_localctx, 376, RULE_tryblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2403);
			match(Try);
			setState(2404);
			compoundstatement();
			setState(2405);
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
		enterRule(_localctx, 378, RULE_functiontryblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2407);
			match(Try);
			setState(2409);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(2408);
				ctorinitializer();
				}
			}

			setState(2411);
			compoundstatement();
			setState(2412);
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
		enterRule(_localctx, 380, RULE_handlerseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2414);
			handler();
			setState(2416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
			case 1:
				{
				setState(2415);
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
		enterRule(_localctx, 382, RULE_handler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2418);
			match(Catch);
			setState(2419);
			match(LeftParen);
			setState(2420);
			exceptiondeclaration();
			setState(2421);
			match(RightParen);
			setState(2422);
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
		enterRule(_localctx, 384, RULE_exceptiondeclaration);
		int _la;
		try {
			setState(2438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2425);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2424);
					attributespecifierseq(0);
					}
				}

				setState(2427);
				typespecifierseq();
				setState(2428);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2431);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2430);
					attributespecifierseq(0);
					}
				}

				setState(2433);
				typespecifierseq();
				setState(2435);
				_la = _input.LA(1);
				if (_la==Decltype || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (LeftParen - 79)) | (1L << (LeftBracket - 79)) | (1L << (Star - 79)) | (1L << (And - 79)) | (1L << (AndAnd - 79)) | (1L << (Doublecolon - 79)) | (1L << (Ellipsis - 79)) | (1L << (Identifier - 79)))) != 0)) {
					{
					setState(2434);
					abstractdeclarator();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2437);
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
		enterRule(_localctx, 386, RULE_throwexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2440);
			match(Throw);
			setState(2442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
			case 1:
				{
				setState(2441);
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
		enterRule(_localctx, 388, RULE_exceptionspecification);
		try {
			setState(2446);
			switch (_input.LA(1)) {
			case Throw:
				enterOuterAlt(_localctx, 1);
				{
				setState(2444);
				dynamicexceptionspecification();
				}
				break;
			case Noexcept:
				enterOuterAlt(_localctx, 2);
				{
				setState(2445);
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
		enterRule(_localctx, 390, RULE_dynamicexceptionspecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2448);
			match(Throw);
			setState(2449);
			match(LeftParen);
			setState(2451);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Struct))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Typename - 70)) | (1L << (Union - 70)) | (1L << (Unsigned - 70)) | (1L << (Void - 70)) | (1L << (Volatile - 70)) | (1L << (Wchar - 70)) | (1L << (Doublecolon - 70)) | (1L << (Identifier - 70)))) != 0)) {
				{
				setState(2450);
				typeidlist(0);
				}
			}

			setState(2453);
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
		int _startState = 392;
		enterRecursionRule(_localctx, 392, RULE_typeidlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2456);
			typeid();
			setState(2458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,317,_ctx) ) {
			case 1:
				{
				setState(2457);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2468);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,319,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeidlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeidlist);
					setState(2460);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2461);
					match(Comma);
					setState(2462);
					typeid();
					setState(2464);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
					case 1:
						{
						setState(2463);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2470);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,319,_ctx);
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
		enterRule(_localctx, 394, RULE_noexceptspecification);
		try {
			setState(2477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2471);
				match(Noexcept);
				setState(2472);
				match(LeftParen);
				setState(2473);
				constantexpression();
				setState(2474);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2476);
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
		enterRule(_localctx, 396, RULE_rightShift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2479);
			match(Greater);
			setState(2480);
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
		enterRule(_localctx, 398, RULE_rightShiftAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2482);
			match(Greater);
			setState(2483);
			match(Greater);
			setState(2484);
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
		enterRule(_localctx, 400, RULE_operator);
		try {
			setState(2534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2486);
				match(New);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2487);
				match(Delete);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2488);
				match(New);
				setState(2489);
				match(LeftBracket);
				setState(2490);
				match(RightBracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2491);
				match(Delete);
				setState(2492);
				match(LeftBracket);
				setState(2493);
				match(RightBracket);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2494);
				match(Plus);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2495);
				match(Minus);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2496);
				match(Star);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2497);
				match(Div);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2498);
				match(Mod);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2499);
				match(Caret);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2500);
				match(And);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2501);
				match(Or);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2502);
				match(Tilde);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2503);
				match(Not);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2504);
				match(Assign);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2505);
				match(Less);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2506);
				match(Greater);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2507);
				match(PlusAssign);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2508);
				match(MinusAssign);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2509);
				match(StarAssign);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2510);
				match(DivAssign);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2511);
				match(ModAssign);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2512);
				match(XorAssign);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2513);
				match(AndAssign);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2514);
				match(OrAssign);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2515);
				match(LeftShift);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2516);
				rightShift();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2517);
				rightShiftAssign();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(2518);
				match(LeftShiftAssign);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(2519);
				match(Equal);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(2520);
				match(NotEqual);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(2521);
				match(LessEqual);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(2522);
				match(GreaterEqual);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(2523);
				match(AndAnd);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(2524);
				match(OrOr);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(2525);
				match(PlusPlus);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(2526);
				match(MinusMinus);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(2527);
				match(Comma);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(2528);
				match(ArrowStar);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(2529);
				match(Arrow);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(2530);
				match(LeftParen);
				setState(2531);
				match(RightParen);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(2532);
				match(LeftBracket);
				setState(2533);
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
		enterRule(_localctx, 402, RULE_literal);
		try {
			setState(2543);
			switch (_input.LA(1)) {
			case Integerliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2536);
				match(Integerliteral);
				}
				break;
			case Characterliteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(2537);
				match(Characterliteral);
				}
				break;
			case Floatingliteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(2538);
				match(Floatingliteral);
				}
				break;
			case Stringliteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(2539);
				match(Stringliteral);
				}
				break;
			case False:
			case True:
				enterOuterAlt(_localctx, 5);
				{
				setState(2540);
				booleanliteral();
				}
				break;
			case Nullptr:
				enterOuterAlt(_localctx, 6);
				{
				setState(2541);
				pointerliteral();
				}
				break;
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 7);
				{
				setState(2542);
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
		enterRule(_localctx, 404, RULE_booleanliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2545);
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
		enterRule(_localctx, 406, RULE_pointerliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2547);
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
		enterRule(_localctx, 408, RULE_userdefinedliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2549);
			_la = _input.LA(1);
			if ( !(((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (Userdefinedintegerliteral - 136)) | (1L << (Userdefinedfloatingliteral - 136)) | (1L << (Userdefinedstringliteral - 136)) | (1L << (Userdefinedcharacterliteral - 136)))) != 0)) ) {
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
		case 51:
			return statementseq_sempred((StatementseqContext)_localctx, predIndex);
		case 62:
			return declarationseq_sempred((DeclarationseqContext)_localctx, predIndex);
		case 90:
			return enumeratorlist_sempred((EnumeratorlistContext)_localctx, predIndex);
		case 108:
			return attributespecifierseq_sempred((AttributespecifierseqContext)_localctx, predIndex);
		case 111:
			return attributelist_sempred((AttributelistContext)_localctx, predIndex);
		case 117:
			return balancedtokenseq_sempred((BalancedtokenseqContext)_localctx, predIndex);
		case 119:
			return initdeclaratorlist_sempred((InitdeclaratorlistContext)_localctx, predIndex);
		case 123:
			return noptrdeclarator_sempred((NoptrdeclaratorContext)_localctx, predIndex);
		case 134:
			return noptrabstractdeclarator_sempred((NoptrabstractdeclaratorContext)_localctx, predIndex);
		case 136:
			return noptrabstractpackdeclarator_sempred((NoptrabstractpackdeclaratorContext)_localctx, predIndex);
		case 138:
			return parameterdeclarationlist_sempred((ParameterdeclarationlistContext)_localctx, predIndex);
		case 146:
			return initializerlist_sempred((InitializerlistContext)_localctx, predIndex);
		case 156:
			return memberdeclaratorlist_sempred((MemberdeclaratorlistContext)_localctx, predIndex);
		case 158:
			return virtspecifierseq_sempred((VirtspecifierseqContext)_localctx, predIndex);
		case 162:
			return basespecifierlist_sempred((BasespecifierlistContext)_localctx, predIndex);
		case 177:
			return templateparameterlist_sempred((TemplateparameterlistContext)_localctx, predIndex);
		case 183:
			return templateargumentlist_sempred((TemplateargumentlistContext)_localctx, predIndex);
		case 196:
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
			return precpred(_ctx, 3);
		case 21:
			return precpred(_ctx, 2);
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalexpression_sempred(RelationalexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 4);
		case 24:
			return precpred(_ctx, 3);
		case 25:
			return precpred(_ctx, 2);
		case 26:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityexpression_sempred(EqualityexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return precpred(_ctx, 2);
		case 28:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andexpression_sempred(AndexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveorexpression_sempred(ExclusiveorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveorexpression_sempred(InclusiveorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalandexpression_sempred(LogicalandexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalorexpression_sempred(LogicalorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 33:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 34:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean statementseq_sempred(StatementseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 35:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declarationseq_sempred(DeclarationseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 36:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean enumeratorlist_sempred(EnumeratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean attributespecifierseq_sempred(AttributespecifierseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 38:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean attributelist_sempred(AttributelistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 39:
			return precpred(_ctx, 3);
		case 40:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean balancedtokenseq_sempred(BalancedtokenseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 41:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initdeclaratorlist_sempred(InitdeclaratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 42:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean noptrdeclarator_sempred(NoptrdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 43:
			return precpred(_ctx, 3);
		case 44:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean noptrabstractdeclarator_sempred(NoptrabstractdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 45:
			return precpred(_ctx, 5);
		case 46:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean noptrabstractpackdeclarator_sempred(NoptrabstractpackdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 47:
			return precpred(_ctx, 3);
		case 48:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean parameterdeclarationlist_sempred(ParameterdeclarationlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 49:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initializerlist_sempred(InitializerlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 50:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean memberdeclaratorlist_sempred(MemberdeclaratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 51:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean virtspecifierseq_sempred(VirtspecifierseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 52:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean basespecifierlist_sempred(BasespecifierlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 53:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean templateparameterlist_sempred(TemplateparameterlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 54:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean templateargumentlist_sempred(TemplateargumentlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 55:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeidlist_sempred(TypeidlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 56:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0091\u09fa\4\2\t"+
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
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\3\2\5\2\u019e\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3\u01aa\n\3\3\4\3\4\5\4\u01ae\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5\u01b9\n\5\3\6\3\6\5\6\u01bd\n\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u01cc\n\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\u01d3\n\7\3\7\3\7\3\7\7\7\u01d8\n\7\f\7\16\7\u01db\13\7\3\b\3\b\5\b\u01df"+
		"\n\b\3\b\3\b\3\t\3\t\5\t\u01e5\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u01ef\n\n\3\13\3\13\3\f\3\f\3\f\5\f\u01f6\n\f\3\f\3\f\3\f\3\f\5\f\u01fc"+
		"\n\f\7\f\u01fe\n\f\f\f\16\f\u0201\13\f\3\r\3\r\5\r\u0205\n\r\3\16\3\16"+
		"\3\16\3\16\5\16\u020b\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u0212\n\17\3"+
		"\20\3\20\3\20\3\20\5\20\u0218\n\20\3\20\5\20\u021b\n\20\3\20\5\20\u021e"+
		"\n\20\3\20\5\20\u0221\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u0228\n\21\3"+
		"\21\3\21\3\21\3\21\3\21\5\21\u022f\n\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u0263\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u0272\n\21\3\21\3\21\3\21\3\21\5\21\u0278\n"+
		"\21\3\21\3\21\3\21\3\21\5\21\u027e\n\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\7\21\u028b\n\21\f\21\16\21\u028e\13\21\3\22"+
		"\3\22\3\23\5\23\u0293\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u02a2\n\23\3\23\3\23\3\23\3\23\5\23\u02a8\n"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\5\24\u02c6\n\24\3\25\3\25\3\26\5\26\u02cb\n\26\3\26\3\26\5\26\u02cf"+
		"\n\26\3\26\3\26\5\26\u02d3\n\26\3\26\5\26\u02d6\n\26\3\26\3\26\5\26\u02da"+
		"\n\26\3\26\3\26\3\26\3\26\5\26\u02e0\n\26\5\26\u02e2\n\26\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\5\30\u02ea\n\30\3\31\3\31\5\31\u02ee\n\31\3\31\5\31"+
		"\u02f1\n\31\3\32\3\32\3\32\3\32\3\32\5\32\u02f8\n\32\3\32\3\32\3\32\3"+
		"\32\3\32\5\32\u02ff\n\32\7\32\u0301\n\32\f\32\16\32\u0304\13\32\3\33\3"+
		"\33\5\33\u0308\n\33\3\33\3\33\5\33\u030c\n\33\3\34\5\34\u030f\n\34\3\34"+
		"\3\34\3\34\5\34\u0314\n\34\3\34\3\34\3\34\3\34\5\34\u031a\n\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0327\n\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0332\n\37\f\37\16\37\u0335"+
		"\13\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u0343\n \f \16 \u0346\13"+
		" \3!\3!\3!\3!\3!\3!\3!\3!\3!\7!\u0351\n!\f!\16!\u0354\13!\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0363\n\"\f\"\16\"\u0366"+
		"\13\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u0377\n#\f#\16#"+
		"\u037a\13#\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u0385\n$\f$\16$\u0388\13$\3%"+
		"\3%\3%\3%\3%\3%\7%\u0390\n%\f%\16%\u0393\13%\3&\3&\3&\3&\3&\3&\7&\u039b"+
		"\n&\f&\16&\u039e\13&\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u03a6\n\'\f\'\16\'\u03a9"+
		"\13\'\3(\3(\3(\3(\3(\3(\7(\u03b1\n(\f(\16(\u03b4\13(\3)\3)\3)\3)\3)\3"+
		")\7)\u03bc\n)\f)\16)\u03bf\13)\3*\3*\3*\3*\3*\3*\3*\5*\u03c8\n*\3+\3+"+
		"\3+\3+\3+\3+\5+\u03d0\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u03dd\n,"+
		"\3-\3-\3-\5-\u03e2\n-\3-\3-\3-\7-\u03e7\n-\f-\16-\u03ea\13-\3.\3.\3.\3"+
		".\3.\3.\5.\u03f2\n.\3/\3/\3\60\3\60\5\60\u03f8\n\60\3\60\3\60\5\60\u03fc"+
		"\n\60\3\60\3\60\5\60\u0400\n\60\3\60\3\60\5\60\u0404\n\60\3\60\3\60\5"+
		"\60\u0408\n\60\3\60\3\60\3\60\5\60\u040d\n\60\3\60\3\60\5\60\u0411\n\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\62\5\62\u041a\n\62\3\62\3\62\3\62\3\62"+
		"\5\62\u0420\n\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0428\n\62\3\62\3"+
		"\62\3\62\5\62\u042d\n\62\3\63\5\63\u0430\n\63\3\63\3\63\3\64\3\64\5\64"+
		"\u0436\n\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\7\65\u043f\n\65\f\65\16"+
		"\65\u0442\13\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0459\n\66\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67"+
		"\u0469\n\67\38\38\58\u046d\n8\38\38\38\38\38\38\58\u0475\n8\38\38\38\3"+
		"8\38\58\u047c\n8\39\39\39\39\39\39\59\u0484\n9\3:\3:\3:\3:\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u0498\n:\3:\3:\5:\u049c\n:\3:\3:\3"+
		":\3:\3:\3:\3:\3:\3:\3:\3:\5:\u04a9\n:\3;\3;\5;\u04ad\n;\3<\5<\u04b0\n"+
		"<\3<\3<\3<\3=\3=\5=\u04b7\n=\3>\3>\3>\3>\3>\3>\5>\u04bf\n>\3>\3>\3>\3"+
		">\3>\3>\3>\3>\5>\u04c9\n>\3?\3?\3@\3@\3@\3@\3@\7@\u04d2\n@\f@\16@\u04d5"+
		"\13@\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u04e0\nA\3B\3B\3B\3B\3B\3B\3B\3B\5"+
		"B\u04ea\nB\3C\3C\3C\5C\u04ef\nC\3C\3C\3C\3C\3D\5D\u04f6\nD\3D\5D\u04f9"+
		"\nD\3D\3D\3D\5D\u04fe\nD\3D\3D\3D\3D\5D\u0504\nD\3E\5E\u0507\nE\3E\3E"+
		"\5E\u050b\nE\3E\3E\3E\5E\u0510\nE\3E\3E\3E\3E\5E\u0516\nE\3F\3F\3F\3F"+
		"\3F\3F\3F\3F\3G\3G\3H\3H\3H\3I\3I\3I\3I\3I\3I\5I\u052b\nI\3J\3J\5J\u052f"+
		"\nJ\3J\3J\3J\5J\u0534\nJ\3K\3K\3L\3L\3M\3M\3N\3N\3N\5N\u053f\nN\3O\3O"+
		"\3O\3O\5O\u0545\nO\3P\3P\5P\u0549\nP\3P\3P\3P\5P\u054e\nP\3Q\3Q\5Q\u0552"+
		"\nQ\3Q\3Q\3Q\5Q\u0557\nQ\3R\5R\u055a\nR\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R"+
		"\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u0570\nR\3S\3S\3S\3S\5S\u0576\nS\3T"+
		"\3T\3T\3T\3T\3T\3T\3T\3T\5T\u0581\nT\3U\3U\5U\u0585\nU\3U\5U\u0588\nU"+
		"\3U\3U\3U\3U\3U\3U\3U\3U\5U\u0592\nU\3U\3U\3U\3U\5U\u0598\nU\3U\5U\u059b"+
		"\nU\3V\3V\3W\3W\3W\5W\u05a2\nW\3W\3W\3W\3W\3W\3W\3W\3W\5W\u05ac\nW\3X"+
		"\3X\5X\u05b0\nX\3X\5X\u05b3\nX\3X\5X\u05b6\nX\3X\3X\5X\u05ba\nX\3X\3X"+
		"\3X\5X\u05bf\nX\5X\u05c1\nX\3Y\3Y\5Y\u05c5\nY\3Y\3Y\5Y\u05c9\nY\3Y\3Y"+
		"\3Z\3Z\3Z\3Z\3Z\5Z\u05d2\nZ\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\7\\\u05dd"+
		"\n\\\f\\\16\\\u05e0\13\\\3]\3]\3]\3]\3]\5]\u05e7\n]\3^\3^\3_\3_\5_\u05ed"+
		"\n_\3`\3`\3a\3a\5a\u05f3\na\3b\3b\5b\u05f7\nb\3c\5c\u05fa\nc\3c\3c\3c"+
		"\3c\3c\3c\3d\5d\u0603\nd\3d\3d\3d\3d\3d\3d\3e\5e\u060c\ne\3e\3e\3e\3e"+
		"\3e\3f\5f\u0614\nf\3g\3g\3h\3h\3h\3h\3h\3h\3i\5i\u061f\ni\3i\3i\3j\3j"+
		"\5j\u0625\nj\3j\3j\3j\3j\3j\3j\3j\3j\3j\5j\u0630\nj\3k\5k\u0633\nk\3k"+
		"\3k\3k\5k\u0638\nk\3k\3k\3k\3l\3l\3l\3l\3l\3l\3m\3m\3m\3m\5m\u0647\nm"+
		"\3m\3m\3m\3m\5m\u064d\nm\3n\3n\3n\3n\3n\7n\u0654\nn\fn\16n\u0657\13n\3"+
		"o\3o\3o\3o\3o\3o\3o\5o\u0660\no\3p\3p\3p\3p\5p\u0666\np\3p\3p\3p\3p\3"+
		"p\3p\5p\u066e\np\3p\3p\5p\u0672\np\3q\3q\5q\u0676\nq\3q\3q\3q\5q\u067b"+
		"\nq\3q\3q\3q\5q\u0680\nq\3q\3q\3q\3q\3q\7q\u0687\nq\fq\16q\u068a\13q\3"+
		"r\3r\5r\u068e\nr\3s\3s\5s\u0692\ns\3t\3t\3t\3t\3u\3u\3v\3v\3v\3v\3w\3"+
		"w\5w\u06a0\nw\3w\3w\7w\u06a4\nw\fw\16w\u06a7\13w\3x\3x\3x\3x\3x\3x\3x"+
		"\3x\3x\3x\3x\3x\5x\u06b5\nx\3y\3y\3y\3y\3y\3y\7y\u06bd\ny\fy\16y\u06c0"+
		"\13y\3z\3z\5z\u06c4\nz\3{\3{\3{\3{\3{\5{\u06cb\n{\3|\3|\3|\3|\5|\u06d1"+
		"\n|\3}\3}\3}\5}\u06d6\n}\3}\3}\3}\3}\5}\u06dc\n}\3}\3}\3}\3}\3}\5}\u06e3"+
		"\n}\3}\3}\5}\u06e7\n}\7}\u06e9\n}\f}\16}\u06ec\13}\3~\3~\3~\3~\5~\u06f2"+
		"\n~\3~\5~\u06f5\n~\3~\5~\u06f8\n~\3~\5~\u06fb\n~\3\177\3\177\3\177\5\177"+
		"\u0700\n\177\3\u0080\3\u0080\5\u0080\u0704\n\u0080\3\u0080\5\u0080\u0707"+
		"\n\u0080\3\u0080\3\u0080\5\u0080\u070b\n\u0080\3\u0080\3\u0080\5\u0080"+
		"\u070f\n\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u0714\n\u0080\3\u0080\5"+
		"\u0080\u0717\n\u0080\5\u0080\u0719\n\u0080\3\u0081\3\u0081\5\u0081\u071d"+
		"\n\u0081\3\u0082\3\u0082\3\u0083\3\u0083\3\u0084\5\u0084\u0724\n\u0084"+
		"\3\u0084\3\u0084\3\u0085\3\u0085\5\u0085\u072a\n\u0085\3\u0086\3\u0086"+
		"\5\u0086\u072e\n\u0086\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u0734\n"+
		"\u0086\3\u0087\3\u0087\3\u0087\5\u0087\u0739\n\u0087\5\u0087\u073b\n\u0087"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u0741\n\u0088\3\u0088\3\u0088"+
		"\5\u0088\u0745\n\u0088\3\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u074b\n"+
		"\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u0752\n\u0088\3"+
		"\u0088\3\u0088\5\u0088\u0756\n\u0088\7\u0088\u0758\n\u0088\f\u0088\16"+
		"\u0088\u075b\13\u0088\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u0761\n"+
		"\u0089\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\5\u008a\u076b\n\u008a\3\u008a\3\u008a\5\u008a\u076f\n\u008a\7\u008a\u0771"+
		"\n\u008a\f\u008a\16\u008a\u0774\13\u008a\3\u008b\5\u008b\u0777\n\u008b"+
		"\3\u008b\5\u008b\u077a\n\u008b\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b"+
		"\u0780\n\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\7\u008c"+
		"\u0788\n\u008c\f\u008c\16\u008c\u078b\13\u008c\3\u008d\5\u008d\u078e\n"+
		"\u008d\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u0794\n\u008d\3\u008d\3"+
		"\u008d\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u079c\n\u008d\3\u008d\3"+
		"\u008d\5\u008d\u07a0\n\u008d\3\u008d\5\u008d\u07a3\n\u008d\3\u008d\3\u008d"+
		"\5\u008d\u07a7\n\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u07ac\n\u008d\3"+
		"\u008e\5\u008e\u07af\n\u008e\3\u008e\5\u008e\u07b2\n\u008e\3\u008e\3\u008e"+
		"\5\u008e\u07b6\n\u008e\3\u008e\3\u008e\3\u008f\5\u008f\u07bb\n\u008f\3"+
		"\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\5\u008f"+
		"\u07c5\n\u008f\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u07cc\n"+
		"\u0090\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u07d2\n\u0091\3\u0092\3"+
		"\u0092\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093\5\u0093\u07db\n\u0093\3"+
		"\u0094\3\u0094\3\u0094\5\u0094\u07e0\n\u0094\3\u0094\3\u0094\3\u0094\3"+
		"\u0094\5\u0094\u07e6\n\u0094\7\u0094\u07e8\n\u0094\f\u0094\16\u0094\u07eb"+
		"\13\u0094\3\u0095\3\u0095\3\u0095\5\u0095\u07f0\n\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\5\u0095\u07f6\n\u0095\3\u0096\3\u0096\5\u0096\u07fa\n"+
		"\u0096\3\u0097\3\u0097\3\u0097\5\u0097\u07ff\n\u0097\3\u0097\3\u0097\3"+
		"\u0098\3\u0098\5\u0098\u0805\n\u0098\3\u0098\3\u0098\5\u0098\u0809\n\u0098"+
		"\3\u0098\5\u0098\u080c\n\u0098\3\u0098\3\u0098\5\u0098\u0810\n\u0098\3"+
		"\u0098\5\u0098\u0813\n\u0098\5\u0098\u0815\n\u0098\3\u0099\5\u0099\u0818"+
		"\n\u0099\3\u0099\3\u0099\3\u009a\3\u009a\3\u009b\3\u009b\3\u009c\3\u009c"+
		"\5\u009c\u0822\n\u009c\3\u009c\3\u009c\3\u009c\5\u009c\u0827\n\u009c\5"+
		"\u009c\u0829\n\u009c\3\u009d\5\u009d\u082c\n\u009d\3\u009d\5\u009d\u082f"+
		"\n\u009d\3\u009d\5\u009d\u0832\n\u009d\3\u009d\3\u009d\3\u009d\3\u009d"+
		"\3\u009d\3\u009d\3\u009d\3\u009d\5\u009d\u083c\n\u009d\3\u009e\3\u009e"+
		"\3\u009e\3\u009e\3\u009e\3\u009e\7\u009e\u0844\n\u009e\f\u009e\16\u009e"+
		"\u0847\13\u009e\3\u009f\3\u009f\5\u009f\u084b\n\u009f\3\u009f\5\u009f"+
		"\u084e\n\u009f\3\u009f\3\u009f\5\u009f\u0852\n\u009f\3\u009f\5\u009f\u0855"+
		"\n\u009f\3\u009f\5\u009f\u0858\n\u009f\3\u009f\3\u009f\5\u009f\u085c\n"+
		"\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\7\u00a0\u0863\n\u00a0\f"+
		"\u00a0\16\u00a0\u0866\13\u00a0\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a4\5\u00a4\u0874"+
		"\n\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\5\u00a4\u087a\n\u00a4\7\u00a4"+
		"\u087c\n\u00a4\f\u00a4\16\u00a4\u087f\13\u00a4\3\u00a5\5\u00a5\u0882\n"+
		"\u00a5\3\u00a5\3\u00a5\5\u00a5\u0886\n\u00a5\3\u00a5\3\u00a5\5\u00a5\u088a"+
		"\n\u00a5\3\u00a5\3\u00a5\5\u00a5\u088e\n\u00a5\3\u00a5\3\u00a5\5\u00a5"+
		"\u0892\n\u00a5\3\u00a5\3\u00a5\5\u00a5\u0896\n\u00a5\3\u00a6\5\u00a6\u0899"+
		"\n\u00a6\3\u00a6\3\u00a6\5\u00a6\u089d\n\u00a6\3\u00a7\3\u00a7\3\u00a8"+
		"\3\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00aa\3\u00aa\5\u00aa\u08a8\n\u00aa"+
		"\3\u00ab\3\u00ab\5\u00ab\u08ac\n\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ad"+
		"\3\u00ad\5\u00ad\u08b3\n\u00ad\3\u00ad\3\u00ad\5\u00ad\u08b7\n\u00ad\3"+
		"\u00ad\3\u00ad\3\u00ad\5\u00ad\u08bc\n\u00ad\3\u00ae\3\u00ae\3\u00ae\5"+
		"\u00ae\u08c1\n\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae\5\u00ae\u08c8"+
		"\n\u00ae\3\u00af\3\u00af\5\u00af\u08cc\n\u00af\3\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\5\u00b1\u08d6\n\u00b1\3\u00b2"+
		"\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b3\7\u00b3\u08e4\n\u00b3\f\u00b3\16\u00b3\u08e7\13\u00b3"+
		"\3\u00b4\3\u00b4\5\u00b4\u08eb\n\u00b4\3\u00b5\3\u00b5\5\u00b5\u08ef\n"+
		"\u00b5\3\u00b5\5\u00b5\u08f2\n\u00b5\3\u00b5\3\u00b5\5\u00b5\u08f6\n\u00b5"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u08fc\n\u00b5\3\u00b5\5\u00b5"+
		"\u08ff\n\u00b5\3\u00b5\3\u00b5\5\u00b5\u0903\n\u00b5\3\u00b5\3\u00b5\3"+
		"\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u090d\n\u00b5\3"+
		"\u00b5\5\u00b5\u0910\n\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3"+
		"\u00b5\5\u00b5\u0918\n\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u091d\n\u00b5"+
		"\3\u00b6\3\u00b6\3\u00b6\5\u00b6\u0922\n\u00b6\3\u00b6\3\u00b6\3\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u092a\n\u00b7\3\u00b7\3\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b7\5\u00b7\u0931\n\u00b7\3\u00b7\3\u00b7\5\u00b7\u0935\n"+
		"\u00b7\3\u00b8\3\u00b8\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u093c\n\u00b9\3"+
		"\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u0942\n\u00b9\7\u00b9\u0944\n\u00b9"+
		"\f\u00b9\16\u00b9\u0947\13\u00b9\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u094c"+
		"\n\u00ba\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\5\u00bb"+
		"\u0955\n\u00bb\3\u00bb\3\u00bb\5\u00bb\u0959\n\u00bb\3\u00bc\5\u00bc\u095c"+
		"\n\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00bf\3\u00bf\5\u00bf\u096c\n\u00bf"+
		"\3\u00bf\3\u00bf\3\u00bf\3\u00c0\3\u00c0\5\u00c0\u0973\n\u00c0\3\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c2\5\u00c2\u097c\n\u00c2"+
		"\3\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u0982\n\u00c2\3\u00c2\3\u00c2"+
		"\5\u00c2\u0986\n\u00c2\3\u00c2\5\u00c2\u0989\n\u00c2\3\u00c3\3\u00c3\5"+
		"\u00c3\u098d\n\u00c3\3\u00c4\3\u00c4\5\u00c4\u0991\n\u00c4\3\u00c5\3\u00c5"+
		"\3\u00c5\5\u00c5\u0996\n\u00c5\3\u00c5\3\u00c5\3\u00c6\3\u00c6\3\u00c6"+
		"\5\u00c6\u099d\n\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u09a3\n"+
		"\u00c6\7\u00c6\u09a5\n\u00c6\f\u00c6\16\u00c6\u09a8\13\u00c6\3\u00c7\3"+
		"\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u09b0\n\u00c7\3\u00c8\3"+
		"\u00c8\3\u00c8\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\5\u00ca\u09e9\n\u00ca\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\5\u00cb\u09f2\n\u00cb\3\u00cc\3\u00cc\3\u00cd\3\u00cd\3\u00ce"+
		"\3\u00ce\3\u00ce\2$\f\26 \62<>@BDFHJLNPXh~\u00b6\u00da\u00e0\u00ec\u00f0"+
		"\u00f8\u010e\u0112\u0116\u0126\u013a\u013e\u0146\u0164\u0170\u018a\u00cf"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
		"\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104"+
		"\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c"+
		"\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134"+
		"\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c"+
		"\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164"+
		"\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c"+
		"\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194"+
		"\u0196\u0198\u019a\2\r\4\2]]aa\4\2WY]`\7\2\37\37++\65\65;;BB\5\2\35\35"+
		"((LL\4\2\21\21NN\4\2]]rr\5\2\20\20>>II\4\2!!\61\61\3\2\62\64\4\2  DD\3"+
		"\2\u008a\u008d\u0b24\2\u019d\3\2\2\2\4\u01a9\3\2\2\2\6\u01ad\3\2\2\2\b"+
		"\u01b8\3\2\2\2\n\u01ba\3\2\2\2\f\u01cb\3\2\2\2\16\u01dc\3\2\2\2\20\u01e2"+
		"\3\2\2\2\22\u01ee\3\2\2\2\24\u01f0\3\2\2\2\26\u01f2\3\2\2\2\30\u0204\3"+
		"\2\2\2\32\u020a\3\2\2\2\34\u0211\3\2\2\2\36\u0213\3\2\2\2 \u0262\3\2\2"+
		"\2\"\u028f\3\2\2\2$\u02a7\3\2\2\2&\u02c5\3\2\2\2(\u02c7\3\2\2\2*\u02e1"+
		"\3\2\2\2,\u02e3\3\2\2\2.\u02e7\3\2\2\2\60\u02f0\3\2\2\2\62\u02f2\3\2\2"+
		"\2\64\u030b\3\2\2\2\66\u0319\3\2\2\28\u031b\3\2\2\2:\u0326\3\2\2\2<\u0328"+
		"\3\2\2\2>\u0336\3\2\2\2@\u0347\3\2\2\2B\u0355\3\2\2\2D\u0367\3\2\2\2F"+
		"\u037b\3\2\2\2H\u0389\3\2\2\2J\u0394\3\2\2\2L\u039f\3\2\2\2N\u03aa\3\2"+
		"\2\2P\u03b5\3\2\2\2R\u03c7\3\2\2\2T\u03cf\3\2\2\2V\u03dc\3\2\2\2X\u03e1"+
		"\3\2\2\2Z\u03f1\3\2\2\2\\\u03f3\3\2\2\2^\u0410\3\2\2\2`\u0412\3\2\2\2"+
		"b\u042c\3\2\2\2d\u042f\3\2\2\2f\u0433\3\2\2\2h\u0439\3\2\2\2j\u0458\3"+
		"\2\2\2l\u0468\3\2\2\2n\u047b\3\2\2\2p\u0483\3\2\2\2r\u04a8\3\2\2\2t\u04ac"+
		"\3\2\2\2v\u04af\3\2\2\2x\u04b6\3\2\2\2z\u04c8\3\2\2\2|\u04ca\3\2\2\2~"+
		"\u04cc\3\2\2\2\u0080\u04df\3\2\2\2\u0082\u04e9\3\2\2\2\u0084\u04eb\3\2"+
		"\2\2\u0086\u0503\3\2\2\2\u0088\u0515\3\2\2\2\u008a\u0517\3\2\2\2\u008c"+
		"\u051f\3\2\2\2\u008e\u0521\3\2\2\2\u0090\u052a\3\2\2\2\u0092\u0533\3\2"+
		"\2\2\u0094\u0535\3\2\2\2\u0096\u0537\3\2\2\2\u0098\u0539\3\2\2\2\u009a"+
		"\u053e\3\2\2\2\u009c\u0544\3\2\2\2\u009e\u054d\3\2\2\2\u00a0\u0556\3\2"+
		"\2\2\u00a2\u056f\3\2\2\2\u00a4\u0575\3\2\2\2\u00a6\u0580\3\2\2\2\u00a8"+
		"\u059a\3\2\2\2\u00aa\u059c\3\2\2\2\u00ac\u05ab\3\2\2\2\u00ae\u05c0\3\2"+
		"\2\2\u00b0\u05c2\3\2\2\2\u00b2\u05d1\3\2\2\2\u00b4\u05d3\3\2\2\2\u00b6"+
		"\u05d6\3\2\2\2\u00b8\u05e6\3\2\2\2\u00ba\u05e8\3\2\2\2\u00bc\u05ec\3\2"+
		"\2\2\u00be\u05ee\3\2\2\2\u00c0\u05f2\3\2\2\2\u00c2\u05f6\3\2\2\2\u00c4"+
		"\u05f9\3\2\2\2\u00c6\u0602\3\2\2\2\u00c8\u060b\3\2\2\2\u00ca\u0613\3\2"+
		"\2\2\u00cc\u0615\3\2\2\2\u00ce\u0617\3\2\2\2\u00d0\u061e\3\2\2\2\u00d2"+
		"\u062f\3\2\2\2\u00d4\u0632\3\2\2\2\u00d6\u063c\3\2\2\2\u00d8\u064c\3\2"+
		"\2\2\u00da\u064e\3\2\2\2\u00dc\u065f\3\2\2\2\u00de\u0671\3\2\2\2\u00e0"+
		"\u067a\3\2\2\2\u00e2\u068b\3\2\2\2\u00e4\u0691\3\2\2\2\u00e6\u0693\3\2"+
		"\2\2\u00e8\u0697\3\2\2\2\u00ea\u0699\3\2\2\2\u00ec\u069d\3\2\2\2\u00ee"+
		"\u06b4\3\2\2\2\u00f0\u06b6\3\2\2\2\u00f2\u06c1\3\2\2\2\u00f4\u06ca\3\2"+
		"\2\2\u00f6\u06d0\3\2\2\2\u00f8\u06db\3\2\2\2\u00fa\u06ed\3\2\2\2\u00fc"+
		"\u06fc\3\2\2\2\u00fe\u0718\3\2\2\2\u0100\u071a\3\2\2\2\u0102\u071e\3\2"+
		"\2\2\u0104\u0720\3\2\2\2\u0106\u0723\3\2\2\2\u0108\u0727\3\2\2\2\u010a"+
		"\u0733\3\2\2\2\u010c\u073a\3\2\2\2\u010e\u074a\3\2\2\2\u0110\u0760\3\2"+
		"\2\2\u0112\u0762\3\2\2\2\u0114\u077f\3\2\2\2\u0116\u0781\3\2\2\2\u0118"+
		"\u07ab\3\2\2\2\u011a\u07ae\3\2\2\2\u011c\u07c4\3\2\2\2\u011e\u07cb\3\2"+
		"\2\2\u0120\u07d1\3\2\2\2\u0122\u07d3\3\2\2\2\u0124\u07da\3\2\2\2\u0126"+
		"\u07dc\3\2\2\2\u0128\u07f5\3\2\2\2\u012a\u07f9\3\2\2\2\u012c\u07fb\3\2"+
		"\2\2\u012e\u0814\3\2\2\2\u0130\u0817\3\2\2\2\u0132\u081b\3\2\2\2\u0134"+
		"\u081d\3\2\2\2\u0136\u0828\3\2\2\2\u0138\u083b\3\2\2\2\u013a\u083d\3\2"+
		"\2\2\u013c\u085b\3\2\2\2\u013e\u085d\3\2\2\2\u0140\u0867\3\2\2\2\u0142"+
		"\u0869\3\2\2\2\u0144\u086d\3\2\2\2\u0146\u0870\3\2\2\2\u0148\u0895\3\2"+
		"\2\2\u014a\u089c\3\2\2\2\u014c\u089e\3\2\2\2\u014e\u08a0\3\2\2\2\u0150"+
		"\u08a2\3\2\2\2\u0152\u08a5\3\2\2\2\u0154\u08a9\3\2\2\2\u0156\u08ad\3\2"+
		"\2\2\u0158\u08bb\3\2\2\2\u015a\u08c7\3\2\2\2\u015c\u08cb\3\2\2\2\u015e"+
		"\u08cd\3\2\2\2\u0160\u08d5\3\2\2\2\u0162\u08d7\3\2\2\2\u0164\u08dd\3\2"+
		"\2\2\u0166\u08ea\3\2\2\2\u0168\u091c\3\2\2\2\u016a\u091e\3\2\2\2\u016c"+
		"\u0934\3\2\2\2\u016e\u0936\3\2\2\2\u0170\u0938\3\2\2\2\u0172\u094b\3\2"+
		"\2\2\u0174\u0958\3\2\2\2\u0176\u095b\3\2\2\2\u0178\u0960\3\2\2\2\u017a"+
		"\u0965\3\2\2\2\u017c\u0969\3\2\2\2\u017e\u0970\3\2\2\2\u0180\u0974\3\2"+
		"\2\2\u0182\u0988\3\2\2\2\u0184\u098a\3\2\2\2\u0186\u0990\3\2\2\2\u0188"+
		"\u0992\3\2\2\2\u018a\u0999\3\2\2\2\u018c\u09af\3\2\2\2\u018e\u09b1\3\2"+
		"\2\2\u0190\u09b4\3\2\2\2\u0192\u09e8\3\2\2\2\u0194\u09f1\3\2\2\2\u0196"+
		"\u09f3\3\2\2\2\u0198\u09f5\3\2\2\2\u019a\u09f7\3\2\2\2\u019c\u019e\5~"+
		"@\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f"+
		"\u01a0\7\2\2\3\u01a0\3\3\2\2\2\u01a1\u01aa\5\u0194\u00cb\2\u01a2\u01aa"+
		"\7A\2\2\u01a3\u01a4\7Q\2\2\u01a4\u01a5\5X-\2\u01a5\u01a6\7R\2\2\u01a6"+
		"\u01aa\3\2\2\2\u01a7\u01aa\5\6\4\2\u01a8\u01aa\5\16\b\2\u01a9\u01a1\3"+
		"\2\2\2\u01a9\u01a2\3\2\2\2\u01a9\u01a3\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9"+
		"\u01a8\3\2\2\2\u01aa\5\3\2\2\2\u01ab\u01ae\5\b\5\2\u01ac\u01ae\5\n\6\2"+
		"\u01ad\u01ab\3\2\2\2\u01ad\u01ac\3\2\2\2\u01ae\7\3\2\2\2\u01af\u01b9\7"+
		"\u0080\2\2\u01b0\u01b9\5\u015e\u00b0\2\u01b1\u01b9\5\u0150\u00a9\2\u01b2"+
		"\u01b9\5\u0160\u00b1\2\u01b3\u01b4\7_\2\2\u01b4\u01b9\5\u012a\u0096\2"+
		"\u01b5\u01b6\7_\2\2\u01b6\u01b9\5\u00a6T\2\u01b7\u01b9\5\u016c\u00b7\2"+
		"\u01b8\u01af\3\2\2\2\u01b8\u01b0\3\2\2\2\u01b8\u01b1\3\2\2\2\u01b8\u01b2"+
		"\3\2\2\2\u01b8\u01b3\3\2\2\2\u01b8\u01b5\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b9"+
		"\t\3\2\2\2\u01ba\u01bc\5\f\7\2\u01bb\u01bd\7@\2\2\u01bc\u01bb\3\2\2\2"+
		"\u01bc\u01bd\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\5\b\5\2\u01bf\13"+
		"\3\2\2\2\u01c0\u01c1\b\7\1\2\u01c1\u01cc\7{\2\2\u01c2\u01c3\5\u00a4S\2"+
		"\u01c3\u01c4\7{\2\2\u01c4\u01cc\3\2\2\2\u01c5\u01c6\5\u00bc_\2\u01c6\u01c7"+
		"\7{\2\2\u01c7\u01cc\3\2\2\2\u01c8\u01c9\5\u00a6T\2\u01c9\u01ca\7{\2\2"+
		"\u01ca\u01cc\3\2\2\2\u01cb\u01c0\3\2\2\2\u01cb\u01c2\3\2\2\2\u01cb\u01c5"+
		"\3\2\2\2\u01cb\u01c8\3\2\2\2\u01cc\u01d9\3\2\2\2\u01cd\u01ce\f\4\2\2\u01ce"+
		"\u01cf\7\u0080\2\2\u01cf\u01d8\7{\2\2\u01d0\u01d2\f\3\2\2\u01d1\u01d3"+
		"\7@\2\2\u01d2\u01d1\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4"+
		"\u01d5\5\u016a\u00b6\2\u01d5\u01d6\7{\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01cd"+
		"\3\2\2\2\u01d7\u01d0\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9"+
		"\u01da\3\2\2\2\u01da\r\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01de\5\20\t"+
		"\2\u01dd\u01df\5\36\20\2\u01de\u01dd\3\2\2\2\u01de\u01df\3\2\2\2\u01df"+
		"\u01e0\3\2\2\2\u01e0\u01e1\5f\64\2\u01e1\17\3\2\2\2\u01e2\u01e4\7S\2\2"+
		"\u01e3\u01e5\5\22\n\2\u01e4\u01e3\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6"+
		"\3\2\2\2\u01e6\u01e7\7T\2\2\u01e7\21\3\2\2\2\u01e8\u01ef\5\24\13\2\u01e9"+
		"\u01ef\5\26\f\2\u01ea\u01eb\5\24\13\2\u01eb\u01ec\7v\2\2\u01ec\u01ed\5"+
		"\26\f\2\u01ed\u01ef\3\2\2\2\u01ee\u01e8\3\2\2\2\u01ee\u01e9\3\2\2\2\u01ee"+
		"\u01ea\3\2\2\2\u01ef\23\3\2\2\2\u01f0\u01f1\t\2\2\2\u01f1\25\3\2\2\2\u01f2"+
		"\u01f3\b\f\1\2\u01f3\u01f5\5\30\r\2\u01f4\u01f6\7\177\2\2\u01f5\u01f4"+
		"\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01ff\3\2\2\2\u01f7\u01f8\f\3\2\2\u01f8"+
		"\u01f9\7v\2\2\u01f9\u01fb\5\30\r\2\u01fa\u01fc\7\177\2\2\u01fb\u01fa\3"+
		"\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01f7\3\2\2\2\u01fe"+
		"\u0201\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\27\3\2\2"+
		"\2\u0201\u01ff\3\2\2\2\u0202\u0205\5\32\16\2\u0203\u0205\5\34\17\2\u0204"+
		"\u0202\3\2\2\2\u0204\u0203\3\2\2\2\u0205\31\3\2\2\2\u0206\u020b\7\u0080"+
		"\2\2\u0207\u0208\7]\2\2\u0208\u020b\7\u0080\2\2\u0209\u020b\7A\2\2\u020a"+
		"\u0206\3\2\2\2\u020a\u0207\3\2\2\2\u020a\u0209\3\2\2\2\u020b\33\3\2\2"+
		"\2\u020c\u020d\7\u0080\2\2\u020d\u0212\5\u011e\u0090\2\u020e\u020f\7]"+
		"\2\2\u020f\u0210\7\u0080\2\2\u0210\u0212\5\u011e\u0090\2\u0211\u020c\3"+
		"\2\2\2\u0211\u020e\3\2\2\2\u0212\35\3\2\2\2\u0213\u0214\7Q\2\2\u0214\u0215"+
		"\5\u0114\u008b\2\u0215\u0217\7R\2\2\u0216\u0218\7+\2\2\u0217\u0216\3\2"+
		"\2\2\u0217\u0218\3\2\2\2\u0218\u021a\3\2\2\2\u0219\u021b\5\u0186\u00c4"+
		"\2\u021a\u0219\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021d\3\2\2\2\u021c\u021e"+
		"\5\u00dan\2\u021d\u021c\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u0220\3\2\2"+
		"\2\u021f\u0221\5\u00fc\177\2\u0220\u021f\3\2\2\2\u0220\u0221\3\2\2\2\u0221"+
		"\37\3\2\2\2\u0222\u0223\b\21\1\2\u0223\u0263\5\4\3\2\u0224\u0225\5\u00a2"+
		"R\2\u0225\u0227\7Q\2\2\u0226\u0228\5\"\22\2\u0227\u0226\3\2\2\2\u0227"+
		"\u0228\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a\7R\2\2\u022a\u0263\3\2"+
		"\2\2\u022b\u022c\5\u0174\u00bb\2\u022c\u022e\7Q\2\2\u022d\u022f\5\"\22"+
		"\2\u022e\u022d\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0231"+
		"\7R\2\2\u0231\u0263\3\2\2\2\u0232\u0233\5\u00a2R\2\u0233\u0234\5\u0128"+
		"\u0095\2\u0234\u0263\3\2\2\2\u0235\u0236\5\u0174\u00bb\2\u0236\u0237\5"+
		"\u0128\u0095\2\u0237\u0263\3\2\2\2\u0238\u0239\7\32\2\2\u0239\u023a\7"+
		"b\2\2\u023a\u023b\5\u0108\u0085\2\u023b\u023c\7c\2\2\u023c\u023d\7Q\2"+
		"\2\u023d\u023e\5X-\2\u023e\u023f\7R\2\2\u023f\u0263\3\2\2\2\u0240\u0241"+
		"\7=\2\2\u0241\u0242\7b\2\2\u0242\u0243\5\u0108\u0085\2\u0243\u0244\7c"+
		"\2\2\u0244\u0245\7Q\2\2\u0245\u0246\5X-\2\u0246\u0247\7R\2\2\u0247\u0263"+
		"\3\2\2\2\u0248\u0249\7\66\2\2\u0249\u024a\7b\2\2\u024a\u024b\5\u0108\u0085"+
		"\2\u024b\u024c\7c\2\2\u024c\u024d\7Q\2\2\u024d\u024e\5X-\2\u024e\u024f"+
		"\7R\2\2\u024f\u0263\3\2\2\2\u0250\u0251\7\23\2\2\u0251\u0252\7b\2\2\u0252"+
		"\u0253\5\u0108\u0085\2\u0253\u0254\7c\2\2\u0254\u0255\7Q\2\2\u0255\u0256"+
		"\5X-\2\u0256\u0257\7R\2\2\u0257\u0263\3\2\2\2\u0258\u0259\7G\2\2\u0259"+
		"\u025a\7Q\2\2\u025a\u025b\5X-\2\u025b\u025c\7R\2\2\u025c\u0263\3\2\2\2"+
		"\u025d\u025e\7G\2\2\u025e\u025f\7Q\2\2\u025f\u0260\5\u0108\u0085\2\u0260"+
		"\u0261\7R\2\2\u0261\u0263\3\2\2\2\u0262\u0222\3\2\2\2\u0262\u0224\3\2"+
		"\2\2\u0262\u022b\3\2\2\2\u0262\u0232\3\2\2\2\u0262\u0235\3\2\2\2\u0262"+
		"\u0238\3\2\2\2\u0262\u0240\3\2\2\2\u0262\u0248\3\2\2\2\u0262\u0250\3\2"+
		"\2\2\u0262\u0258\3\2\2\2\u0262\u025d\3\2\2\2\u0263\u028c\3\2\2\2\u0264"+
		"\u0265\f\25\2\2\u0265\u0266\7S\2\2\u0266\u0267\5X-\2\u0267\u0268\7T\2"+
		"\2\u0268\u028b\3\2\2\2\u0269\u026a\f\24\2\2\u026a\u026b\7S\2\2\u026b\u026c"+
		"\5\u0128\u0095\2\u026c\u026d\7T\2\2\u026d\u028b\3\2\2\2\u026e\u026f\f"+
		"\23\2\2\u026f\u0271\7Q\2\2\u0270\u0272\5\"\22\2\u0271\u0270\3\2\2\2\u0271"+
		"\u0272\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u028b\7R\2\2\u0274\u0275\f\16"+
		"\2\2\u0275\u0277\7}\2\2\u0276\u0278\7@\2\2\u0277\u0276\3\2\2\2\u0277\u0278"+
		"\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u028b\5\6\4\2\u027a\u027b\f\r\2\2\u027b"+
		"\u027d\7x\2\2\u027c\u027e\7@\2\2\u027d\u027c\3\2\2\2\u027d\u027e\3\2\2"+
		"\2\u027e\u027f\3\2\2\2\u027f\u028b\5\6\4\2\u0280\u0281\f\f\2\2\u0281\u0282"+
		"\7}\2\2\u0282\u028b\5$\23\2\u0283\u0284\f\13\2\2\u0284\u0285\7x\2\2\u0285"+
		"\u028b\5$\23\2\u0286\u0287\f\n\2\2\u0287\u028b\7t\2\2\u0288\u0289\f\t"+
		"\2\2\u0289\u028b\7u\2\2\u028a\u0264\3\2\2\2\u028a\u0269\3\2\2\2\u028a"+
		"\u026e\3\2\2\2\u028a\u0274\3\2\2\2\u028a\u027a\3\2\2\2\u028a\u0280\3\2"+
		"\2\2\u028a\u0283\3\2\2\2\u028a\u0286\3\2\2\2\u028a\u0288\3\2\2\2\u028b"+
		"\u028e\3\2\2\2\u028c\u028a\3\2\2\2\u028c\u028d\3\2\2\2\u028d!\3\2\2\2"+
		"\u028e\u028c\3\2\2\2\u028f\u0290\5\u0126\u0094\2\u0290#\3\2\2\2\u0291"+
		"\u0293\5\f\7\2\u0292\u0291\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0294\3\2"+
		"\2\2\u0294\u0295\5\u00a4S\2\u0295\u0296\7{\2\2\u0296\u0297\7_\2\2\u0297"+
		"\u0298\5\u00a4S\2\u0298\u02a8\3\2\2\2\u0299\u029a\5\f\7\2\u029a\u029b"+
		"\7@\2\2\u029b\u029c\5\u016a\u00b6\2\u029c\u029d\7{\2\2\u029d\u029e\7_"+
		"\2\2\u029e\u029f\5\u00a4S\2\u029f\u02a8\3\2\2\2\u02a0\u02a2\5\f\7\2\u02a1"+
		"\u02a0\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a4\7_"+
		"\2\2\u02a4\u02a8\5\u00a4S\2\u02a5\u02a6\7_\2\2\u02a6\u02a8\5\u00a6T\2"+
		"\u02a7\u0292\3\2\2\2\u02a7\u0299\3\2\2\2\u02a7\u02a1\3\2\2\2\u02a7\u02a5"+
		"\3\2\2\2\u02a8%\3\2\2\2\u02a9\u02c6\5 \21\2\u02aa\u02ab\7t\2\2\u02ab\u02c6"+
		"\5:\36\2\u02ac\u02ad\7u\2\2\u02ad\u02c6\5:\36\2\u02ae\u02af\5(\25\2\u02af"+
		"\u02b0\5:\36\2\u02b0\u02c6\3\2\2\2\u02b1\u02b2\7:\2\2\u02b2\u02c6\5&\24"+
		"\2\u02b3\u02b4\7:\2\2\u02b4\u02b5\7Q\2\2\u02b5\u02b6\5\u0108\u0085\2\u02b6"+
		"\u02b7\7R\2\2\u02b7\u02c6\3\2\2\2\u02b8\u02b9\7:\2\2\u02b9\u02ba\7\177"+
		"\2\2\u02ba\u02bb\7Q\2\2\u02bb\u02bc\7\u0080\2\2\u02bc\u02c6\7R\2\2\u02bd"+
		"\u02be\7\6\2\2\u02be\u02bf\7Q\2\2\u02bf\u02c0\5\u0108\u0085\2\u02c0\u02c1"+
		"\7R\2\2\u02c1\u02c6\3\2\2\2\u02c2\u02c6\58\35\2\u02c3\u02c6\5*\26\2\u02c4"+
		"\u02c6\5\66\34\2\u02c5\u02a9\3\2\2\2\u02c5\u02aa\3\2\2\2\u02c5\u02ac\3"+
		"\2\2\2\u02c5\u02ae\3\2\2\2\u02c5\u02b1\3\2\2\2\u02c5\u02b3\3\2\2\2\u02c5"+
		"\u02b8\3\2\2\2\u02c5\u02bd\3\2\2\2\u02c5\u02c2\3\2\2\2\u02c5\u02c3\3\2"+
		"\2\2\u02c5\u02c4\3\2\2\2\u02c6\'\3\2\2\2\u02c7\u02c8\t\3\2\2\u02c8)\3"+
		"\2\2\2\u02c9\u02cb\7{\2\2\u02ca\u02c9\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb"+
		"\u02cc\3\2\2\2\u02cc\u02ce\7-\2\2\u02cd\u02cf\5,\27\2\u02ce\u02cd\3\2"+
		"\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d2\5.\30\2\u02d1"+
		"\u02d3\5\64\33\2\u02d2\u02d1\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02e2\3"+
		"\2\2\2\u02d4\u02d6\7{\2\2\u02d5\u02d4\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6"+
		"\u02d7\3\2\2\2\u02d7\u02d9\7-\2\2\u02d8\u02da\5,\27\2\u02d9\u02d8\3\2"+
		"\2\2\u02d9\u02da\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dc\7Q\2\2\u02dc"+
		"\u02dd\5\u0108\u0085\2\u02dd\u02df\7R\2\2\u02de\u02e0\5\64\33\2\u02df"+
		"\u02de\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e2\3\2\2\2\u02e1\u02ca\3\2"+
		"\2\2\u02e1\u02d5\3\2\2\2\u02e2+\3\2\2\2\u02e3\u02e4\7Q\2\2\u02e4\u02e5"+
		"\5\"\22\2\u02e5\u02e6\7R\2\2\u02e6-\3\2\2\2\u02e7\u02e9\5\u009eP\2\u02e8"+
		"\u02ea\5\60\31\2\u02e9\u02e8\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea/\3\2\2"+
		"\2\u02eb\u02ed\5\u00fe\u0080\2\u02ec\u02ee\5\60\31\2\u02ed\u02ec\3\2\2"+
		"\2\u02ed\u02ee\3\2\2\2\u02ee\u02f1\3\2\2\2\u02ef\u02f1\5\62\32\2\u02f0"+
		"\u02eb\3\2\2\2\u02f0\u02ef\3\2\2\2\u02f1\61\3\2\2\2\u02f2\u02f3\b\32\1"+
		"\2\u02f3\u02f4\7S\2\2\u02f4\u02f5\5X-\2\u02f5\u02f7\7T\2\2\u02f6\u02f8"+
		"\5\u00dan\2\u02f7\u02f6\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u0302\3\2\2"+
		"\2\u02f9\u02fa\f\3\2\2\u02fa\u02fb\7S\2\2\u02fb\u02fc\5\\/\2\u02fc\u02fe"+
		"\7T\2\2\u02fd\u02ff\5\u00dan\2\u02fe\u02fd\3\2\2\2\u02fe\u02ff\3\2\2\2"+
		"\u02ff\u0301\3\2\2\2\u0300\u02f9\3\2\2\2\u0301\u0304\3\2\2\2\u0302\u0300"+
		"\3\2\2\2\u0302\u0303\3\2\2\2\u0303\63\3\2\2\2\u0304\u0302\3\2\2\2\u0305"+
		"\u0307\7Q\2\2\u0306\u0308\5\"\22\2\u0307\u0306\3\2\2\2\u0307\u0308\3\2"+
		"\2\2\u0308\u0309\3\2\2\2\u0309\u030c\7R\2\2\u030a\u030c\5\u0128\u0095"+
		"\2\u030b\u0305\3\2\2\2\u030b\u030a\3\2\2\2\u030c\65\3\2\2\2\u030d\u030f"+
		"\7{\2\2\u030e\u030d\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0310\3\2\2\2\u0310"+
		"\u0311\7\27\2\2\u0311\u031a\5:\36\2\u0312\u0314\7{\2\2\u0313\u0312\3\2"+
		"\2\2\u0313\u0314\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0316\7\27\2\2\u0316"+
		"\u0317\7S\2\2\u0317\u0318\7T\2\2\u0318\u031a\5:\36\2\u0319\u030e\3\2\2"+
		"\2\u0319\u0313\3\2\2\2\u031a\67\3\2\2\2\u031b\u031c\7.\2\2\u031c\u031d"+
		"\7Q\2\2\u031d\u031e\5X-\2\u031e\u031f\7R\2\2\u031f9\3\2\2\2\u0320\u0327"+
		"\5&\24\2\u0321\u0322\7Q\2\2\u0322\u0323\5\u0108\u0085\2\u0323\u0324\7"+
		"R\2\2\u0324\u0325\5:\36\2\u0325\u0327\3\2\2\2\u0326\u0320\3\2\2\2\u0326"+
		"\u0321\3\2\2\2\u0327;\3\2\2\2\u0328\u0329\b\37\1\2\u0329\u032a\5:\36\2"+
		"\u032a\u0333\3\2\2\2\u032b\u032c\f\4\2\2\u032c\u032d\7~\2\2\u032d\u0332"+
		"\5:\36\2\u032e\u032f\f\3\2\2\u032f\u0330\7w\2\2\u0330\u0332\5:\36\2\u0331"+
		"\u032b\3\2\2\2\u0331\u032e\3\2\2\2\u0332\u0335\3\2\2\2\u0333\u0331\3\2"+
		"\2\2\u0333\u0334\3\2\2\2\u0334=\3\2\2\2\u0335\u0333\3\2\2\2\u0336\u0337"+
		"\b \1\2\u0337\u0338\5<\37\2\u0338\u0344\3\2\2\2\u0339\u033a\f\5\2\2\u033a"+
		"\u033b\7Y\2\2\u033b\u0343\5<\37\2\u033c\u033d\f\4\2\2\u033d\u033e\7Z\2"+
		"\2\u033e\u0343\5<\37\2\u033f\u0340\f\3\2\2\u0340\u0341\7[\2\2\u0341\u0343"+
		"\5<\37\2\u0342\u0339\3\2\2\2\u0342\u033c\3\2\2\2\u0342\u033f\3\2\2\2\u0343"+
		"\u0346\3\2\2\2\u0344\u0342\3\2\2\2\u0344\u0345\3\2\2\2\u0345?\3\2\2\2"+
		"\u0346\u0344\3\2\2\2\u0347\u0348\b!\1\2\u0348\u0349\5> \2\u0349\u0352"+
		"\3\2\2\2\u034a\u034b\f\4\2\2\u034b\u034c\7W\2\2\u034c\u0351\5> \2\u034d"+
		"\u034e\f\3\2\2\u034e\u034f\7X\2\2\u034f\u0351\5> \2\u0350\u034a\3\2\2"+
		"\2\u0350\u034d\3\2\2\2\u0351\u0354\3\2\2\2\u0352\u0350\3\2\2\2\u0352\u0353"+
		"\3\2\2\2\u0353A\3\2\2\2\u0354\u0352\3\2\2\2\u0355\u0356\b\"\1\2\u0356"+
		"\u0357\5@!\2\u0357\u0364\3\2\2\2\u0358\u0359\f\5\2\2\u0359\u035a\7l\2"+
		"\2\u035a\u0363\5@!\2\u035b\u035c\f\4\2\2\u035c\u035d\5\u018e\u00c8\2\u035d"+
		"\u035e\5@!\2\u035e\u0363\3\2\2\2\u035f\u0360\f\3\2\2\u0360\u0361\7l\2"+
		"\2\u0361\u0363\5Z.\2\u0362\u0358\3\2\2\2\u0362\u035b\3\2\2\2\u0362\u035f"+
		"\3\2\2\2\u0363\u0366\3\2\2\2\u0364\u0362\3\2\2\2\u0364\u0365\3\2\2\2\u0365"+
		"C\3\2\2\2\u0366\u0364\3\2\2\2\u0367\u0368\b#\1\2\u0368\u0369\5B\"\2\u0369"+
		"\u0378\3\2\2\2\u036a\u036b\f\6\2\2\u036b\u036c\7b\2\2\u036c\u0377\5B\""+
		"\2\u036d\u036e\f\5\2\2\u036e\u036f\7c\2\2\u036f\u0377\5B\"\2\u0370\u0371"+
		"\f\4\2\2\u0371\u0372\7p\2\2\u0372\u0377\5B\"\2\u0373\u0374\f\3\2\2\u0374"+
		"\u0375\7q\2\2\u0375\u0377\5B\"\2\u0376\u036a\3\2\2\2\u0376\u036d\3\2\2"+
		"\2\u0376\u0370\3\2\2\2\u0376\u0373\3\2\2\2\u0377\u037a\3\2\2\2\u0378\u0376"+
		"\3\2\2\2\u0378\u0379\3\2\2\2\u0379E\3\2\2\2\u037a\u0378\3\2\2\2\u037b"+
		"\u037c\b$\1\2\u037c\u037d\5D#\2\u037d\u0386\3\2\2\2\u037e\u037f\f\4\2"+
		"\2\u037f\u0380\7n\2\2\u0380\u0385\5D#\2\u0381\u0382\f\3\2\2\u0382\u0383"+
		"\7o\2\2\u0383\u0385\5D#\2\u0384\u037e\3\2\2\2\u0384\u0381\3\2\2\2\u0385"+
		"\u0388\3\2\2\2\u0386\u0384\3\2\2\2\u0386\u0387\3\2\2\2\u0387G\3\2\2\2"+
		"\u0388\u0386\3\2\2\2\u0389\u038a\b%\1\2\u038a\u038b\5F$\2\u038b\u0391"+
		"\3\2\2\2\u038c\u038d\f\3\2\2\u038d\u038e\7]\2\2\u038e\u0390\5F$\2\u038f"+
		"\u038c\3\2\2\2\u0390\u0393\3\2\2\2\u0391\u038f\3\2\2\2\u0391\u0392\3\2"+
		"\2\2\u0392I\3\2\2\2\u0393\u0391\3\2\2\2\u0394\u0395\b&\1\2\u0395\u0396"+
		"\5H%\2\u0396\u039c\3\2\2\2\u0397\u0398\f\3\2\2\u0398\u0399\7\\\2\2\u0399"+
		"\u039b\5H%\2\u039a\u0397\3\2\2\2\u039b\u039e\3\2\2\2\u039c\u039a\3\2\2"+
		"\2\u039c\u039d\3\2\2\2\u039dK\3\2\2\2\u039e\u039c\3\2\2\2\u039f\u03a0"+
		"\b\'\1\2\u03a0\u03a1\5J&\2\u03a1\u03a7\3\2\2\2\u03a2\u03a3\f\3\2\2\u03a3"+
		"\u03a4\7^\2\2\u03a4\u03a6\5J&\2\u03a5\u03a2\3\2\2\2\u03a6\u03a9\3\2\2"+
		"\2\u03a7\u03a5\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8M\3\2\2\2\u03a9\u03a7"+
		"\3\2\2\2\u03aa\u03ab\b(\1\2\u03ab\u03ac\5L\'\2\u03ac\u03b2\3\2\2\2\u03ad"+
		"\u03ae\f\3\2\2\u03ae\u03af\7r\2\2\u03af\u03b1\5L\'\2\u03b0\u03ad\3\2\2"+
		"\2\u03b1\u03b4\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3O"+
		"\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b5\u03b6\b)\1\2\u03b6\u03b7\5N(\2\u03b7"+
		"\u03bd\3\2\2\2\u03b8\u03b9\f\3\2\2\u03b9\u03ba\7s\2\2\u03ba\u03bc\5N("+
		"\2\u03bb\u03b8\3\2\2\2\u03bc\u03bf\3\2\2\2\u03bd\u03bb\3\2\2\2\u03bd\u03be"+
		"\3\2\2\2\u03beQ\3\2\2\2\u03bf\u03bd\3\2\2\2\u03c0\u03c8\5P)\2\u03c1\u03c2"+
		"\5P)\2\u03c2\u03c3\7y\2\2\u03c3\u03c4\5X-\2\u03c4\u03c5\7z\2\2\u03c5\u03c6"+
		"\5T+\2\u03c6\u03c8\3\2\2\2\u03c7\u03c0\3\2\2\2\u03c7\u03c1\3\2\2\2\u03c8"+
		"S\3\2\2\2\u03c9\u03d0\5R*\2\u03ca\u03cb\5P)\2\u03cb\u03cc\5V,\2\u03cc"+
		"\u03cd\5\u0124\u0093\2\u03cd\u03d0\3\2\2\2\u03ce\u03d0\5\u0184\u00c3\2"+
		"\u03cf\u03c9\3\2\2\2\u03cf\u03ca\3\2\2\2\u03cf\u03ce\3\2\2\2\u03d0U\3"+
		"\2\2\2\u03d1\u03dd\7a\2\2\u03d2\u03dd\7f\2\2\u03d3\u03dd\7g\2\2\u03d4"+
		"\u03dd\7h\2\2\u03d5\u03dd\7d\2\2\u03d6\u03dd\7e\2\2\u03d7\u03dd\5\u0190"+
		"\u00c9\2\u03d8\u03dd\7m\2\2\u03d9\u03dd\7j\2\2\u03da\u03dd\7i\2\2\u03db"+
		"\u03dd\7k\2\2\u03dc\u03d1\3\2\2\2\u03dc\u03d2\3\2\2\2\u03dc\u03d3\3\2"+
		"\2\2\u03dc\u03d4\3\2\2\2\u03dc\u03d5\3\2\2\2\u03dc\u03d6\3\2\2\2\u03dc"+
		"\u03d7\3\2\2\2\u03dc\u03d8\3\2\2\2\u03dc\u03d9\3\2\2\2\u03dc\u03da\3\2"+
		"\2\2\u03dc\u03db\3\2\2\2\u03ddW\3\2\2\2\u03de\u03df\b-\1\2\u03df\u03e2"+
		"\5T+\2\u03e0\u03e2\5Z.\2\u03e1\u03de\3\2\2\2\u03e1\u03e0\3\2\2\2\u03e2"+
		"\u03e8\3\2\2\2\u03e3\u03e4\f\4\2\2\u03e4\u03e5\7v\2\2\u03e5\u03e7\5T+"+
		"\2\u03e6\u03e3\3\2\2\2\u03e7\u03ea\3\2\2\2\u03e8\u03e6\3\2\2\2\u03e8\u03e9"+
		"\3\2\2\2\u03e9Y\3\2\2\2\u03ea\u03e8\3\2\2\2\u03eb\u03ec\5\b\5\2\u03ec"+
		"\u03ed\7`\2\2\u03ed\u03f2\3\2\2\2\u03ee\u03ef\5\n\6\2\u03ef\u03f0\7`\2"+
		"\2\u03f0\u03f2\3\2\2\2\u03f1\u03eb\3\2\2\2\u03f1\u03ee\3\2\2\2\u03f2["+
		"\3\2\2\2\u03f3\u03f4\5R*\2\u03f4]\3\2\2\2\u03f5\u0411\5b\62\2\u03f6\u03f8"+
		"\5\u00dan\2\u03f7\u03f6\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03f9\3\2\2"+
		"\2\u03f9\u0411\5d\63\2\u03fa\u03fc\5\u00dan\2\u03fb\u03fa\3\2\2\2\u03fb"+
		"\u03fc\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u0411\5f\64\2\u03fe\u0400\5\u00da"+
		"n\2\u03ff\u03fe\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0401\3\2\2\2\u0401"+
		"\u0411\5j\66\2\u0402\u0404\5\u00dan\2\u0403\u0402\3\2\2\2\u0403\u0404"+
		"\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0411\5r:\2\u0406\u0408\5\u00dan\2"+
		"\u0407\u0406\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u0411"+
		"\5z>\2\u040a\u0411\5|?\2\u040b\u040d\5\u00dan\2\u040c\u040b\3\2\2\2\u040c"+
		"\u040d\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u0411\5\u017a\u00be\2\u040f\u0411"+
		"\5`\61\2\u0410\u03f5\3\2\2\2\u0410\u03f7\3\2\2\2\u0410\u03fb\3\2\2\2\u0410"+
		"\u03ff\3\2\2\2\u0410\u0403\3\2\2\2\u0410\u0407\3\2\2\2\u0410\u040a\3\2"+
		"\2\2\u0410\u040c\3\2\2\2\u0410\u040f\3\2\2\2\u0411_\3\2\2\2\u0412\u0413"+
		"\7&\2\2\u0413\u0414\7Q\2\2\u0414\u0415\5T+\2\u0415\u0416\7R\2\2\u0416"+
		"\u0417\5^\60\2\u0417a\3\2\2\2\u0418\u041a\5\u00dan\2\u0419\u0418\3\2\2"+
		"\2\u0419\u041a\3\2\2\2\u041a\u041b\3\2\2\2\u041b\u041c\7\u0080\2\2\u041c"+
		"\u041d\7z\2\2\u041d\u042d\5^\60\2\u041e\u0420\5\u00dan\2\u041f\u041e\3"+
		"\2\2\2\u041f\u0420\3\2\2\2\u0420\u0421\3\2\2\2\u0421\u0422\7\13\2\2\u0422"+
		"\u0423\5\\/\2\u0423\u0424\7z\2\2\u0424\u0425\5^\60\2\u0425\u042d\3\2\2"+
		"\2\u0426\u0428\5\u00dan\2\u0427\u0426\3\2\2\2\u0427\u0428\3\2\2\2\u0428"+
		"\u0429\3\2\2\2\u0429\u042a\7\26\2\2\u042a\u042b\7z\2\2\u042b\u042d\5^"+
		"\60\2\u042c\u0419\3\2\2\2\u042c\u041f\3\2\2\2\u042c\u0427\3\2\2\2\u042d"+
		"c\3\2\2\2\u042e\u0430\5X-\2\u042f\u042e\3\2\2\2\u042f\u0430\3\2\2\2\u0430"+
		"\u0431\3\2\2\2\u0431\u0432\7|\2\2\u0432e\3\2\2\2\u0433\u0435\7U\2\2\u0434"+
		"\u0436\5h\65\2\u0435\u0434\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u0437\3\2"+
		"\2\2\u0437\u0438\7V\2\2\u0438g\3\2\2\2\u0439\u043a\b\65\1\2\u043a\u043b"+
		"\5^\60\2\u043b\u0440\3\2\2\2\u043c\u043d\f\3\2\2\u043d\u043f\5^\60\2\u043e"+
		"\u043c\3\2\2\2\u043f\u0442\3\2\2\2\u0440\u043e\3\2\2\2\u0440\u0441\3\2"+
		"\2\2\u0441i\3\2\2\2\u0442\u0440\3\2\2\2\u0443\u0444\7\'\2\2\u0444\u0445"+
		"\7Q\2\2\u0445\u0446\5n8\2\u0446\u0447\7R\2\2\u0447\u0448\5^\60\2\u0448"+
		"\u0459\3\2\2\2\u0449\u044a\7\'\2\2\u044a\u044b\7Q\2\2\u044b\u044c\5n8"+
		"\2\u044c\u044d\7R\2\2\u044d\u044e\5^\60\2\u044e\u044f\7\33\2\2\u044f\u0450"+
		"\5^\60\2\u0450\u0459\3\2\2\2\u0451\u0452\7?\2\2\u0452\u0453\7Q\2\2\u0453"+
		"\u0454\5n8\2\u0454\u0455\7R\2\2\u0455\u0456\5^\60\2\u0456\u0459\3\2\2"+
		"\2\u0457\u0459\5l\67\2\u0458\u0443\3\2\2\2\u0458\u0449\3\2\2\2\u0458\u0451"+
		"\3\2\2\2\u0458\u0457\3\2\2\2\u0459k\3\2\2\2\u045a\u045b\7\'\2\2\u045b"+
		"\u045c\7b\2\2\u045c\u045d\5n8\2\u045d\u045e\7c\2\2\u045e\u045f\5^\60\2"+
		"\u045f\u0469\3\2\2\2\u0460\u0461\7\'\2\2\u0461\u0462\7b\2\2\u0462\u0463"+
		"\5n8\2\u0463\u0464\7c\2\2\u0464\u0465\5^\60\2\u0465\u0466\7\33\2\2\u0466"+
		"\u0467\5^\60\2\u0467\u0469\3\2\2\2\u0468\u045a\3\2\2\2\u0468\u0460\3\2"+
		"\2\2\u0469m\3\2\2\2\u046a\u047c\5X-\2\u046b\u046d\5\u00dan\2\u046c\u046b"+
		"\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u046e\3\2\2\2\u046e\u046f\5\u0092J"+
		"\2\u046f\u0470\5\u00f4{\2\u0470\u0471\7a\2\2\u0471\u0472\5\u0124\u0093"+
		"\2\u0472\u047c\3\2\2\2\u0473\u0475\5\u00dan\2\u0474\u0473\3\2\2\2\u0474"+
		"\u0475\3\2\2\2\u0475\u0476\3\2\2\2\u0476\u0477\5\u0092J\2\u0477\u0478"+
		"\5\u00f4{\2\u0478\u0479\5\u0128\u0095\2\u0479\u047c\3\2\2\2\u047a\u047c"+
		"\5p9\2\u047b\u046a\3\2\2\2\u047b\u046c\3\2\2\2\u047b\u0474\3\2\2\2\u047b"+
		"\u047a\3\2\2\2\u047co\3\2\2\2\u047d\u047e\5\b\5\2\u047e\u047f\7y\2\2\u047f"+
		"\u0484\3\2\2\2\u0480\u0481\5\n\6\2\u0481\u0482\7y\2\2\u0482\u0484\3\2"+
		"\2\2\u0483\u047d\3\2\2\2\u0483\u0480\3\2\2\2\u0484q\3\2\2\2\u0485\u0486"+
		"\7P\2\2\u0486\u0487\7Q\2\2\u0487\u0488\5n8\2\u0488\u0489\7R\2\2\u0489"+
		"\u048a\5^\60\2\u048a\u04a9\3\2\2\2\u048b\u048c\7\30\2\2\u048c\u048d\5"+
		"^\60\2\u048d\u048e\7P\2\2\u048e\u048f\7Q\2\2\u048f\u0490\5X-\2\u0490\u0491"+
		"\7R\2\2\u0491\u0492\7|\2\2\u0492\u04a9\3\2\2\2\u0493\u0494\7#\2\2\u0494"+
		"\u0495\7Q\2\2\u0495\u0497\5t;\2\u0496\u0498\5n8\2\u0497\u0496\3\2\2\2"+
		"\u0497\u0498\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u049b\7|\2\2\u049a\u049c"+
		"\5X-\2\u049b\u049a\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u049d\3\2\2\2\u049d"+
		"\u049e\7R\2\2\u049e\u049f\5^\60\2\u049f\u04a9\3\2\2\2\u04a0\u04a1\7#\2"+
		"\2\u04a1\u04a2\7Q\2\2\u04a2\u04a3\5v<\2\u04a3\u04a4\7z\2\2\u04a4\u04a5"+
		"\5x=\2\u04a5\u04a6\7R\2\2\u04a6\u04a7\5^\60\2\u04a7\u04a9\3\2\2\2\u04a8"+
		"\u0485\3\2\2\2\u04a8\u048b\3\2\2\2\u04a8\u0493\3\2\2\2\u04a8\u04a0\3\2"+
		"\2\2\u04a9s\3\2\2\2\u04aa\u04ad\5d\63\2\u04ab\u04ad\5\u0086D\2\u04ac\u04aa"+
		"\3\2\2\2\u04ac\u04ab\3\2\2\2\u04adu\3\2\2\2\u04ae\u04b0\5\u00dan\2\u04af"+
		"\u04ae\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u04b2\5\u0092"+
		"J\2\u04b2\u04b3\5\u00f4{\2\u04b3w\3\2\2\2\u04b4\u04b7\5X-\2\u04b5\u04b7"+
		"\5\u0128\u0095\2\u04b6\u04b4\3\2\2\2\u04b6\u04b5\3\2\2\2\u04b7y\3\2\2"+
		"\2\u04b8\u04b9\7\n\2\2\u04b9\u04c9\7|\2\2\u04ba\u04bb\7\24\2\2\u04bb\u04c9"+
		"\7|\2\2\u04bc\u04be\7\67\2\2\u04bd\u04bf\5X-\2\u04be\u04bd\3\2\2\2\u04be"+
		"\u04bf\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04c9\7|\2\2\u04c1\u04c2\7\67"+
		"\2\2\u04c2\u04c3\5\u0128\u0095\2\u04c3\u04c4\7|\2\2\u04c4\u04c9\3\2\2"+
		"\2\u04c5\u04c6\7%\2\2\u04c6\u04c7\7\u0080\2\2\u04c7\u04c9\7|\2\2\u04c8"+
		"\u04b8\3\2\2\2\u04c8\u04ba\3\2\2\2\u04c8\u04bc\3\2\2\2\u04c8\u04c1\3\2"+
		"\2\2\u04c8\u04c5\3\2\2\2\u04c9{\3\2\2\2\u04ca\u04cb\5\u0082B\2\u04cb}"+
		"\3\2\2\2\u04cc\u04cd\b@\1\2\u04cd\u04ce\5\u0080A\2\u04ce\u04d3\3\2\2\2"+
		"\u04cf\u04d0\f\3\2\2\u04d0\u04d2\5\u0080A\2\u04d1\u04cf\3\2\2\2\u04d2"+
		"\u04d5\3\2\2\2\u04d3\u04d1\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\177\3\2\2"+
		"\2\u04d5\u04d3\3\2\2\2\u04d6\u04e0\5\u0082B\2\u04d7\u04e0\5\u011a\u008e"+
		"\2\u04d8\u04e0\5\u0162\u00b2\2\u04d9\u04e0\5\u0176\u00bc\2\u04da\u04e0"+
		"\5\u0178\u00bd\2\u04db\u04e0\5\u00d8m\2\u04dc\u04e0\5\u00c0a\2\u04dd\u04e0"+
		"\5\u008cG\2\u04de\u04e0\5\u008eH\2\u04df\u04d6\3\2\2\2\u04df\u04d7\3\2"+
		"\2\2\u04df\u04d8\3\2\2\2\u04df\u04d9\3\2\2\2\u04df\u04da\3\2\2\2\u04df"+
		"\u04db\3\2\2\2\u04df\u04dc\3\2\2\2\u04df\u04dd\3\2\2\2\u04df\u04de\3\2"+
		"\2\2\u04e0\u0081\3\2\2\2\u04e1\u04ea\5\u0086D\2\u04e2\u04ea\5\u00d6l\2"+
		"\u04e3\u04ea\5\u00ceh\2\u04e4\u04ea\5\u00d2j\2\u04e5\u04ea\5\u00d4k\2"+
		"\u04e6\u04ea\5\u008aF\2\u04e7\u04ea\5\u0084C\2\u04e8\u04ea\5\u00b0Y\2"+
		"\u04e9\u04e1\3\2\2\2\u04e9\u04e2\3\2\2\2\u04e9\u04e3\3\2\2\2\u04e9\u04e4"+
		"\3\2\2\2\u04e9\u04e5\3\2\2\2\u04e9\u04e6\3\2\2\2\u04e9\u04e7\3\2\2\2\u04e9"+
		"\u04e8\3\2\2\2\u04ea\u0083\3\2\2\2\u04eb\u04ec\7K\2\2\u04ec\u04ee\7\u0080"+
		"\2\2\u04ed\u04ef\5\u00dan\2\u04ee\u04ed\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef"+
		"\u04f0\3\2\2\2\u04f0\u04f1\7a\2\2\u04f1\u04f2\5\u0108\u0085\2\u04f2\u04f3"+
		"\7|\2\2\u04f3\u0085\3\2\2\2\u04f4\u04f6\5\u0092J\2\u04f5\u04f4\3\2\2\2"+
		"\u04f5\u04f6\3\2\2\2\u04f6\u04f8\3\2\2\2\u04f7\u04f9\5\u00f0y\2\u04f8"+
		"\u04f7\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\u0504\7|"+
		"\2\2\u04fb\u04fd\5\u00dan\2\u04fc\u04fe\5\u0092J\2\u04fd\u04fc\3\2\2\2"+
		"\u04fd\u04fe\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u0500\5\u00f0y\2\u0500"+
		"\u0501\7|\2\2\u0501\u0504\3\2\2\2\u0502\u0504\5\u0088E\2\u0503\u04f5\3"+
		"\2\2\2\u0503\u04fb\3\2\2\2\u0503\u0502\3\2\2\2\u0504\u0087\3\2\2\2\u0505"+
		"\u0507\5\u0092J\2\u0506\u0505\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u0508"+
		"\3\2\2\2\u0508\u050a\7y\2\2\u0509\u050b\5\u00f0y\2\u050a\u0509\3\2\2\2"+
		"\u050a\u050b\3\2\2\2\u050b\u050c\3\2\2\2\u050c\u0516\7|\2\2\u050d\u050f"+
		"\5\u00dan\2\u050e\u0510\5\u0092J\2\u050f\u050e\3\2\2\2\u050f\u0510\3\2"+
		"\2\2\u0510\u0511\3\2\2\2\u0511\u0512\7y\2\2\u0512\u0513\5\u00f0y\2\u0513"+
		"\u0514\7|\2\2\u0514\u0516\3\2\2\2\u0515\u0506\3\2\2\2\u0515\u050d\3\2"+
		"\2\2\u0516\u0089\3\2\2\2\u0517\u0518\7<\2\2\u0518\u0519\7Q\2\2\u0519\u051a"+
		"\5\\/\2\u051a\u051b\7v\2\2\u051b\u051c\7\u0089\2\2\u051c\u051d\7R\2\2"+
		"\u051d\u051e\7|\2\2\u051e\u008b\3\2\2\2\u051f\u0520\7|\2\2\u0520\u008d"+
		"\3\2\2\2\u0521\u0522\5\u00dan\2\u0522\u0523\7|\2\2\u0523\u008f\3\2\2\2"+
		"\u0524\u052b\5\u0094K\2\u0525\u052b\5\u009aN\2\u0526\u052b\5\u0096L\2"+
		"\u0527\u052b\7$\2\2\u0528\u052b\7F\2\2\u0529\u052b\7\22\2\2\u052a\u0524"+
		"\3\2\2\2\u052a\u0525\3\2\2\2\u052a\u0526\3\2\2\2\u052a\u0527\3\2\2\2\u052a"+
		"\u0528\3\2\2\2\u052a\u0529\3\2\2\2\u052b\u0091\3\2\2\2\u052c\u052e\5\u0090"+
		"I\2\u052d\u052f\5\u00dan\2\u052e\u052d\3\2\2\2\u052e\u052f\3\2\2\2\u052f"+
		"\u0534\3\2\2\2\u0530\u0531\5\u0090I\2\u0531\u0532\5\u0092J\2\u0532\u0534"+
		"\3\2\2\2\u0533\u052c\3\2\2\2\u0533\u0530\3\2\2\2\u0534\u0093\3\2\2\2\u0535"+
		"\u0536\t\4\2\2\u0536\u0095\3\2\2\2\u0537\u0538\t\5\2\2\u0538\u0097\3\2"+
		"\2\2\u0539\u053a\7\u0080\2\2\u053a\u0099\3\2\2\2\u053b\u053f\5\u009cO"+
		"\2\u053c\u053f\5\u012c\u0097\2\u053d\u053f\5\u00acW\2\u053e\u053b\3\2"+
		"\2\2\u053e\u053c\3\2\2\2\u053e\u053d\3\2\2\2\u053f\u009b\3\2\2\2\u0540"+
		"\u0545\5\u00a2R\2\u0541\u0545\5\u00a8U\2\u0542\u0545\5\u0174\u00bb\2\u0543"+
		"\u0545\5\u0102\u0082\2\u0544\u0540\3\2\2\2\u0544\u0541\3\2\2\2\u0544\u0542"+
		"\3\2\2\2\u0544\u0543\3\2\2\2\u0545\u009d\3\2\2\2\u0546\u0548\5\u009aN"+
		"\2\u0547\u0549\5\u00dan\2\u0548\u0547\3\2\2\2\u0548\u0549\3\2\2\2\u0549"+
		"\u054e\3\2\2\2\u054a\u054b\5\u009aN\2\u054b\u054c\5\u009eP\2\u054c\u054e"+
		"\3\2\2\2\u054d\u0546\3\2\2\2\u054d\u054a\3\2\2\2\u054e\u009f\3\2\2\2\u054f"+
		"\u0551\5\u009cO\2\u0550\u0552\5\u00dan\2\u0551\u0550\3\2\2\2\u0551\u0552"+
		"\3\2\2\2\u0552\u0557\3\2\2\2\u0553\u0554\5\u009cO\2\u0554\u0555\5\u00a0"+
		"Q\2\u0555\u0557\3\2\2\2\u0556\u054f\3\2\2\2\u0556\u0553\3\2\2\2\u0557"+
		"\u00a1\3\2\2\2\u0558\u055a\5\f\7\2\u0559\u0558\3\2\2\2\u0559\u055a\3\2"+
		"\2\2\u055a\u055b\3\2\2\2\u055b\u0570\5\u00a4S\2\u055c\u055d\5\f\7\2\u055d"+
		"\u055e\7@\2\2\u055e\u055f\5\u016a\u00b6\2\u055f\u0570\3\2\2\2\u0560\u0570"+
		"\7\r\2\2\u0561\u0570\7\16\2\2\u0562\u0570\7\17\2\2\u0563\u0570\7O\2\2"+
		"\u0564\u0570\7\t\2\2\u0565\u0570\78\2\2\u0566\u0570\7)\2\2\u0567\u0570"+
		"\7*\2\2\u0568\u0570\79\2\2\u0569\u0570\7J\2\2\u056a\u0570\7\"\2\2\u056b"+
		"\u0570\7\31\2\2\u056c\u0570\7M\2\2\u056d\u0570\7\b\2\2\u056e\u0570\5\u00a6"+
		"T\2\u056f\u0559\3\2\2\2\u056f\u055c\3\2\2\2\u056f\u0560\3\2\2\2\u056f"+
		"\u0561\3\2\2\2\u056f\u0562\3\2\2\2\u056f\u0563\3\2\2\2\u056f\u0564\3\2"+
		"\2\2\u056f\u0565\3\2\2\2\u056f\u0566\3\2\2\2\u056f\u0567\3\2\2\2\u056f"+
		"\u0568\3\2\2\2\u056f\u0569\3\2\2\2\u056f\u056a\3\2\2\2\u056f\u056b\3\2"+
		"\2\2\u056f\u056c\3\2\2\2\u056f\u056d\3\2\2\2\u056f\u056e\3\2\2\2\u0570"+
		"\u00a3\3\2\2\2\u0571\u0576\5\u012a\u0096\2\u0572\u0576\5\u00aaV\2\u0573"+
		"\u0576\5\u0098M\2\u0574\u0576\5\u016a\u00b6\2\u0575\u0571\3\2\2\2\u0575"+
		"\u0572\3\2\2\2\u0575\u0573\3\2\2\2\u0575\u0574\3\2\2\2\u0576\u00a5\3\2"+
		"\2\2\u0577\u0578\7\25\2\2\u0578\u0579\7Q\2\2\u0579\u057a\5X-\2\u057a\u057b"+
		"\7R\2\2\u057b\u0581\3\2\2\2\u057c\u057d\7\25\2\2\u057d\u057e\7Q\2\2\u057e"+
		"\u057f\7\b\2\2\u057f\u0581\7R\2\2\u0580\u0577\3\2\2\2\u0580\u057c\3\2"+
		"\2\2\u0581\u00a7\3\2\2\2\u0582\u0584\5\u0134\u009b\2\u0583\u0585\5\u00da"+
		"n\2\u0584\u0583\3\2\2\2\u0584\u0585\3\2\2\2\u0585\u0587\3\2\2\2\u0586"+
		"\u0588\5\f\7\2\u0587\u0586\3\2\2\2\u0587\u0588\3\2\2\2\u0588\u0589\3\2"+
		"\2\2\u0589\u058a\7\u0080\2\2\u058a\u059b\3\2\2\2\u058b\u058c\5\u0134\u009b"+
		"\2\u058c\u058d\5\u016a\u00b6\2\u058d\u059b\3\2\2\2\u058e\u058f\5\u0134"+
		"\u009b\2\u058f\u0591\5\f\7\2\u0590\u0592\7@\2\2\u0591\u0590\3\2\2\2\u0591"+
		"\u0592\3\2\2\2\u0592\u0593\3\2\2\2\u0593\u0594\5\u016a\u00b6\2\u0594\u059b"+
		"\3\2\2\2\u0595\u0597\7\34\2\2\u0596\u0598\5\f\7\2\u0597\u0596\3\2\2\2"+
		"\u0597\u0598\3\2\2\2\u0598\u0599\3\2\2\2\u0599\u059b\7\u0080\2\2\u059a"+
		"\u0582\3\2\2\2\u059a\u058b\3\2\2\2\u059a\u058e\3\2\2\2\u059a\u0595\3\2"+
		"\2\2\u059b\u00a9\3\2\2\2\u059c\u059d\7\u0080\2\2\u059d\u00ab\3\2\2\2\u059e"+
		"\u059f\5\u00aeX\2\u059f\u05a1\7U\2\2\u05a0\u05a2\5\u00b6\\\2\u05a1\u05a0"+
		"\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u05a4\7V\2\2\u05a4"+
		"\u05ac\3\2\2\2\u05a5\u05a6\5\u00aeX\2\u05a6\u05a7\7U\2\2\u05a7\u05a8\5"+
		"\u00b6\\\2\u05a8\u05a9\7v\2\2\u05a9\u05aa\7V\2\2\u05aa\u05ac\3\2\2\2\u05ab"+
		"\u059e\3\2\2\2\u05ab\u05a5\3\2\2\2\u05ac\u00ad\3\2\2\2\u05ad\u05af\5\u00b2"+
		"Z\2\u05ae\u05b0\5\u00dan\2\u05af\u05ae\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0"+
		"\u05b2\3\2\2\2\u05b1\u05b3\7\u0080\2\2\u05b2\u05b1\3\2\2\2\u05b2\u05b3"+
		"\3\2\2\2\u05b3\u05b5\3\2\2\2\u05b4\u05b6\5\u00b4[\2\u05b5\u05b4\3\2\2"+
		"\2\u05b5\u05b6\3\2\2\2\u05b6\u05c1\3\2\2\2\u05b7\u05b9\5\u00b2Z\2\u05b8"+
		"\u05ba\5\u00dan\2\u05b9\u05b8\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba\u05bb"+
		"\3\2\2\2\u05bb\u05bc\5\f\7\2\u05bc\u05be\7\u0080\2\2\u05bd\u05bf\5\u00b4"+
		"[\2\u05be\u05bd\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf\u05c1\3\2\2\2\u05c0"+
		"\u05ad\3\2\2\2\u05c0\u05b7\3\2\2\2\u05c1\u00af\3\2\2\2\u05c2\u05c4\5\u00b2"+
		"Z\2\u05c3\u05c5\5\u00dan\2\u05c4\u05c3\3\2\2\2\u05c4\u05c5\3\2\2\2\u05c5"+
		"\u05c6\3\2\2\2\u05c6\u05c8\7\u0080\2\2\u05c7\u05c9\5\u00b4[\2\u05c8\u05c7"+
		"\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u05ca\3\2\2\2\u05ca\u05cb\7|\2\2\u05cb"+
		"\u00b1\3\2\2\2\u05cc\u05d2\7\34\2\2\u05cd\u05ce\7\34\2\2\u05ce\u05d2\7"+
		"\20\2\2\u05cf\u05d0\7\34\2\2\u05d0\u05d2\7>\2\2\u05d1\u05cc\3\2\2\2\u05d1"+
		"\u05cd\3\2\2\2\u05d1\u05cf\3\2\2\2\u05d2\u00b3\3\2\2\2\u05d3\u05d4\7z"+
		"\2\2\u05d4\u05d5\5\u009eP\2\u05d5\u00b5\3\2\2\2\u05d6\u05d7\b\\\1\2\u05d7"+
		"\u05d8\5\u00b8]\2\u05d8\u05de\3\2\2\2\u05d9\u05da\f\3\2\2\u05da\u05db"+
		"\7v\2\2\u05db\u05dd\5\u00b8]\2\u05dc\u05d9\3\2\2\2\u05dd\u05e0\3\2\2\2"+
		"\u05de\u05dc\3\2\2\2\u05de\u05df\3\2\2\2\u05df\u00b7\3\2\2\2\u05e0\u05de"+
		"\3\2\2\2\u05e1\u05e7\5\u00ba^\2\u05e2\u05e3\5\u00ba^\2\u05e3\u05e4\7a"+
		"\2\2\u05e4\u05e5\5\\/\2\u05e5\u05e7\3\2\2\2\u05e6\u05e1\3\2\2\2\u05e6"+
		"\u05e2\3\2\2\2\u05e7\u00b9\3\2\2\2\u05e8\u05e9\7\u0080\2\2\u05e9\u00bb"+
		"\3\2\2\2\u05ea\u05ed\5\u00be`\2\u05eb\u05ed\5\u00ccg\2\u05ec\u05ea\3\2"+
		"\2\2\u05ec\u05eb\3\2\2\2\u05ed\u00bd\3\2\2\2\u05ee\u05ef\7\u0080\2\2\u05ef"+
		"\u00bf\3\2\2\2\u05f0\u05f3\5\u00c2b\2\u05f1\u05f3\5\u00c8e\2\u05f2\u05f0"+
		"\3\2\2\2\u05f2\u05f1\3\2\2\2\u05f3\u00c1\3\2\2\2\u05f4\u05f7\5\u00c4c"+
		"\2\u05f5\u05f7\5\u00c6d\2\u05f6\u05f4\3\2\2\2\u05f6\u05f5\3\2\2\2\u05f7"+
		"\u00c3\3\2\2\2\u05f8\u05fa\7(\2\2\u05f9\u05f8\3\2\2\2\u05f9\u05fa\3\2"+
		"\2\2\u05fa\u05fb\3\2\2\2\u05fb\u05fc\7,\2\2\u05fc\u05fd\7\u0080\2\2\u05fd"+
		"\u05fe\7U\2\2\u05fe\u05ff\5\u00caf\2\u05ff\u0600\7V\2\2\u0600\u00c5\3"+
		"\2\2\2\u0601\u0603\7(\2\2\u0602\u0601\3\2\2\2\u0602\u0603\3\2\2\2\u0603"+
		"\u0604\3\2\2\2\u0604\u0605\7,\2\2\u0605\u0606\5\u00be`\2\u0606\u0607\7"+
		"U\2\2\u0607\u0608\5\u00caf\2\u0608\u0609\7V\2\2\u0609\u00c7\3\2\2\2\u060a"+
		"\u060c\7(\2\2\u060b\u060a\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u060d\3\2"+
		"\2\2\u060d\u060e\7,\2\2\u060e\u060f\7U\2\2\u060f\u0610\5\u00caf\2\u0610"+
		"\u0611\7V\2\2\u0611\u00c9\3\2\2\2\u0612\u0614\5~@\2\u0613\u0612\3\2\2"+
		"\2\u0613\u0614\3\2\2\2\u0614\u00cb\3\2\2\2\u0615\u0616\7\u0080\2\2\u0616"+
		"\u00cd\3\2\2\2\u0617\u0618\7,\2\2\u0618\u0619\7\u0080\2\2\u0619\u061a"+
		"\7a\2\2\u061a\u061b\5\u00d0i\2\u061b\u061c\7|\2\2\u061c\u00cf\3\2\2\2"+
		"\u061d\u061f\5\f\7\2\u061e\u061d\3\2\2\2\u061e\u061f\3\2\2\2\u061f\u0620"+
		"\3\2\2\2\u0620\u0621\5\u00bc_\2\u0621\u00d1\3\2\2\2\u0622\u0624\7K\2\2"+
		"\u0623\u0625\7H\2\2\u0624\u0623\3\2\2\2\u0624\u0625\3\2\2\2\u0625\u0626"+
		"\3\2\2\2\u0626\u0627\5\f\7\2\u0627\u0628\5\b\5\2\u0628\u0629\7|\2\2\u0629"+
		"\u0630\3\2\2\2\u062a\u062b\7K\2\2\u062b\u062c\7{\2\2\u062c\u062d\5\b\5"+
		"\2\u062d\u062e\7|\2\2\u062e\u0630\3\2\2\2\u062f\u0622\3\2\2\2\u062f\u062a"+
		"\3\2\2\2\u0630\u00d3\3\2\2\2\u0631\u0633\5\u00dan\2\u0632\u0631\3\2\2"+
		"\2\u0632\u0633\3\2\2\2\u0633\u0634\3\2\2\2\u0634\u0635\7K\2\2\u0635\u0637"+
		"\7,\2\2\u0636\u0638\5\f\7\2\u0637\u0636\3\2\2\2\u0637\u0638\3\2\2\2\u0638"+
		"\u0639\3\2\2\2\u0639\u063a\5\u00bc_\2\u063a\u063b\7|\2\2\u063b\u00d5\3"+
		"\2\2\2\u063c\u063d\7\7\2\2\u063d\u063e\7Q\2\2\u063e\u063f\7\u0089\2\2"+
		"\u063f\u0640\7R\2\2\u0640\u0641\7|\2\2\u0641\u00d7\3\2\2\2\u0642\u0643"+
		"\7\37\2\2\u0643\u0644\7\u0089\2\2\u0644\u0646\7U\2\2\u0645\u0647\5~@\2"+
		"\u0646\u0645\3\2\2\2\u0646\u0647\3\2\2\2\u0647\u0648\3\2\2\2\u0648\u064d"+
		"\7V\2\2\u0649\u064a\7\37\2\2\u064a\u064b\7\u0089\2\2\u064b\u064d\5\u0080"+
		"A\2\u064c\u0642\3\2\2\2\u064c\u0649\3\2\2\2\u064d\u00d9\3\2\2\2\u064e"+
		"\u064f\bn\1\2\u064f\u0650\5\u00dco\2\u0650\u0655\3\2\2\2\u0651\u0652\f"+
		"\3\2\2\u0652\u0654\5\u00dco\2\u0653\u0651\3\2\2\2\u0654\u0657\3\2\2\2"+
		"\u0655\u0653\3\2\2\2\u0655\u0656\3\2\2\2\u0656\u00db\3\2\2\2\u0657\u0655"+
		"\3\2\2\2\u0658\u0659\7S\2\2\u0659\u065a\7S\2\2\u065a\u065b\5\u00e0q\2"+
		"\u065b\u065c\7T\2\2\u065c\u065d\7T\2\2\u065d\u0660\3\2\2\2\u065e\u0660"+
		"\5\u00dep\2\u065f\u0658\3\2\2\2\u065f\u065e\3\2\2\2\u0660\u00dd\3\2\2"+
		"\2\u0661\u0662\7\5\2\2\u0662\u0663\7Q\2\2\u0663\u0665\5\u0108\u0085\2"+
		"\u0664\u0666\7\177\2\2\u0665\u0664\3\2\2\2\u0665\u0666\3\2\2\2\u0666\u0667"+
		"\3\2\2\2\u0667\u0668\7R\2\2\u0668\u0672\3\2\2\2\u0669\u066a\7\5\2\2\u066a"+
		"\u066b\7Q\2\2\u066b\u066d\5\\/\2\u066c\u066e\7\177\2\2\u066d\u066c\3\2"+
		"\2\2\u066d\u066e\3\2\2\2\u066e\u066f\3\2\2\2\u066f\u0670\7R\2\2\u0670"+
		"\u0672\3\2\2\2\u0671\u0661\3\2\2\2\u0671\u0669\3\2\2\2\u0672\u00df\3\2"+
		"\2\2\u0673\u0675\bq\1\2\u0674\u0676\5\u00e2r\2\u0675\u0674\3\2\2\2\u0675"+
		"\u0676\3\2\2\2\u0676\u067b\3\2\2\2\u0677\u0678\5\u00e2r\2\u0678\u0679"+
		"\7\177\2\2\u0679\u067b\3\2\2\2\u067a\u0673\3\2\2\2\u067a\u0677\3\2\2\2"+
		"\u067b\u0688\3\2\2\2\u067c\u067d\f\5\2\2\u067d\u067f\7v\2\2\u067e\u0680"+
		"\5\u00e2r\2\u067f\u067e\3\2\2\2\u067f\u0680\3\2\2\2\u0680\u0687\3\2\2"+
		"\2\u0681\u0682\f\3\2\2\u0682\u0683\7v\2\2\u0683\u0684\5\u00e2r\2\u0684"+
		"\u0685\7\177\2\2\u0685\u0687\3\2\2\2\u0686\u067c\3\2\2\2\u0686\u0681\3"+
		"\2\2\2\u0687\u068a\3\2\2\2\u0688\u0686\3\2\2\2\u0688\u0689\3\2\2\2\u0689"+
		"\u00e1\3\2\2\2\u068a\u0688\3\2\2\2\u068b\u068d\5\u00e4s\2\u068c\u068e"+
		"\5\u00eav\2\u068d\u068c\3\2\2\2\u068d\u068e\3\2\2\2\u068e\u00e3\3\2\2"+
		"\2\u068f\u0692\7\u0080\2\2\u0690\u0692\5\u00e6t\2\u0691\u068f\3\2\2\2"+
		"\u0691\u0690\3\2\2\2\u0692\u00e5\3\2\2\2\u0693\u0694\5\u00e8u\2\u0694"+
		"\u0695\7{\2\2\u0695\u0696\7\u0080\2\2\u0696\u00e7\3\2\2\2\u0697\u0698"+
		"\7\u0080\2\2\u0698\u00e9\3\2\2\2\u0699\u069a\7Q\2\2\u069a\u069b\5\u00ec"+
		"w\2\u069b\u069c\7R\2\2\u069c\u00eb\3\2\2\2\u069d\u069f\bw\1\2\u069e\u06a0"+
		"\5\u00eex\2\u069f\u069e\3\2\2\2\u069f\u06a0\3\2\2\2\u06a0\u06a5\3\2\2"+
		"\2\u06a1\u06a2\f\3\2\2\u06a2\u06a4\5\u00eex\2\u06a3\u06a1\3\2\2\2\u06a4"+
		"\u06a7\3\2\2\2\u06a5\u06a3\3\2\2\2\u06a5\u06a6\3\2\2\2\u06a6\u00ed\3\2"+
		"\2\2\u06a7\u06a5\3\2\2\2\u06a8\u06a9\7Q\2\2\u06a9\u06aa\5\u00ecw\2\u06aa"+
		"\u06ab\7R\2\2\u06ab\u06b5\3\2\2\2\u06ac\u06ad\7S\2\2\u06ad\u06ae\5\u00ec"+
		"w\2\u06ae\u06af\7T\2\2\u06af\u06b5\3\2\2\2\u06b0\u06b1\7U\2\2\u06b1\u06b2"+
		"\5\u00ecw\2\u06b2\u06b3\7V\2\2\u06b3\u06b5\3\2\2\2\u06b4\u06a8\3\2\2\2"+
		"\u06b4\u06ac\3\2\2\2\u06b4\u06b0\3\2\2\2\u06b5\u00ef\3\2\2\2\u06b6\u06b7"+
		"\by\1\2\u06b7\u06b8\5\u00f2z\2\u06b8\u06be\3\2\2\2\u06b9\u06ba\f\3\2\2"+
		"\u06ba\u06bb\7v\2\2\u06bb\u06bd\5\u00f2z\2\u06bc\u06b9\3\2\2\2\u06bd\u06c0"+
		"\3\2\2\2\u06be\u06bc\3\2\2\2\u06be\u06bf\3\2\2\2\u06bf\u00f1\3\2\2\2\u06c0"+
		"\u06be\3\2\2\2\u06c1\u06c3\5\u00f4{\2\u06c2\u06c4\5\u011e\u0090\2\u06c3"+
		"\u06c2\3\2\2\2\u06c3\u06c4\3\2\2\2\u06c4\u00f3\3\2\2\2\u06c5\u06cb\5\u00f6"+
		"|\2\u06c6\u06c7\5\u00f8}\2\u06c7\u06c8\5\u00fa~\2\u06c8\u06c9\5\u00fc"+
		"\177\2\u06c9\u06cb\3\2\2\2\u06ca\u06c5\3\2\2\2\u06ca\u06c6\3\2\2\2\u06cb"+
		"\u00f5\3\2\2\2\u06cc\u06d1\5\u00f8}\2\u06cd\u06ce\5\u00fe\u0080\2\u06ce"+
		"\u06cf\5\u00f6|\2\u06cf\u06d1\3\2\2\2\u06d0\u06cc\3\2\2\2\u06d0\u06cd"+
		"\3\2\2\2\u06d1\u00f7\3\2\2\2\u06d2\u06d3\b}\1\2\u06d3\u06d5\5\u0106\u0084"+
		"\2\u06d4\u06d6\5\u00dan\2\u06d5\u06d4\3\2\2\2\u06d5\u06d6\3\2\2\2\u06d6"+
		"\u06dc\3\2\2\2\u06d7\u06d8\7Q\2\2\u06d8\u06d9\5\u00f6|\2\u06d9\u06da\7"+
		"R\2\2\u06da\u06dc\3\2\2\2\u06db\u06d2\3\2\2\2\u06db\u06d7\3\2\2\2\u06dc"+
		"\u06ea\3\2\2\2\u06dd\u06de\f\5\2\2\u06de\u06e9\5\u00fa~\2\u06df\u06e0"+
		"\f\4\2\2\u06e0\u06e2\7S\2\2\u06e1\u06e3\5\\/\2\u06e2\u06e1\3\2\2\2\u06e2"+
		"\u06e3\3\2\2\2\u06e3\u06e4\3\2\2\2\u06e4\u06e6\7T\2\2\u06e5\u06e7\5\u00da"+
		"n\2\u06e6\u06e5\3\2\2\2\u06e6\u06e7\3\2\2\2\u06e7\u06e9\3\2\2\2\u06e8"+
		"\u06dd\3\2\2\2\u06e8\u06df\3\2\2\2\u06e9\u06ec\3\2\2\2\u06ea\u06e8\3\2"+
		"\2\2\u06ea\u06eb\3\2\2\2\u06eb\u00f9\3\2\2\2\u06ec\u06ea\3\2\2\2\u06ed"+
		"\u06ee\7Q\2\2\u06ee\u06ef\5\u0114\u008b\2\u06ef\u06f1\7R\2\2\u06f0\u06f2"+
		"\5\u0100\u0081\2\u06f1\u06f0\3\2\2\2\u06f1\u06f2\3\2\2\2\u06f2\u06f4\3"+
		"\2\2\2\u06f3\u06f5\5\u0104\u0083\2\u06f4\u06f3\3\2\2\2\u06f4\u06f5\3\2"+
		"\2\2\u06f5\u06f7\3\2\2\2\u06f6\u06f8\5\u0186\u00c4\2\u06f7\u06f6\3\2\2"+
		"\2\u06f7\u06f8\3\2\2\2\u06f8\u06fa\3\2\2\2\u06f9\u06fb\5\u00dan\2\u06fa"+
		"\u06f9\3\2\2\2\u06fa\u06fb\3\2\2\2\u06fb\u00fb\3\2\2\2\u06fc\u06fd\7x"+
		"\2\2\u06fd\u06ff\5\u00a0Q\2\u06fe\u0700\5\u010a\u0086\2\u06ff\u06fe\3"+
		"\2\2\2\u06ff\u0700\3\2\2\2\u0700\u00fd\3\2\2\2\u0701\u0703\7Y\2\2\u0702"+
		"\u0704\5\u00dan\2\u0703\u0702\3\2\2\2\u0703\u0704\3\2\2\2\u0704\u0706"+
		"\3\2\2\2\u0705\u0707\5\u0100\u0081\2\u0706\u0705\3\2\2\2\u0706\u0707\3"+
		"\2\2\2\u0707\u0719\3\2\2\2\u0708\u070a\7]\2\2\u0709\u070b\5\u00dan\2\u070a"+
		"\u0709\3\2\2\2\u070a\u070b\3\2\2\2\u070b\u0719\3\2\2\2\u070c\u070e\7r"+
		"\2\2\u070d\u070f\5\u00dan\2\u070e\u070d\3\2\2\2\u070e\u070f\3\2\2\2\u070f"+
		"\u0719\3\2\2\2\u0710\u0711\5\f\7\2\u0711\u0713\7Y\2\2\u0712\u0714\5\u00da"+
		"n\2\u0713\u0712\3\2\2\2\u0713\u0714\3\2\2\2\u0714\u0716\3\2\2\2\u0715"+
		"\u0717\5\u0100\u0081\2\u0716\u0715\3\2\2\2\u0716\u0717\3\2\2\2\u0717\u0719"+
		"\3\2\2\2\u0718\u0701\3\2\2\2\u0718\u0708\3\2\2\2\u0718\u070c\3\2\2\2\u0718"+
		"\u0710\3\2\2\2\u0719\u00ff\3\2\2\2\u071a\u071c\5\u0102\u0082\2\u071b\u071d"+
		"\5\u0100\u0081\2\u071c\u071b\3\2\2\2\u071c\u071d\3\2\2\2\u071d\u0101\3"+
		"\2\2\2\u071e\u071f\t\6\2\2\u071f\u0103\3\2\2\2\u0720\u0721\t\7\2\2\u0721"+
		"\u0105\3\2\2\2\u0722\u0724\7\177\2\2\u0723\u0722\3\2\2\2\u0723\u0724\3"+
		"\2\2\2\u0724\u0725\3\2\2\2\u0725\u0726\5\6\4\2\u0726\u0107\3\2\2\2\u0727"+
		"\u0729\5\u009eP\2\u0728\u072a\5\u010a\u0086\2\u0729\u0728\3\2\2\2\u0729"+
		"\u072a\3\2\2\2\u072a\u0109\3\2\2\2\u072b\u0734\5\u010c\u0087\2\u072c\u072e"+
		"\5\u010e\u0088\2\u072d\u072c\3\2\2\2\u072d\u072e\3\2\2\2\u072e\u072f\3"+
		"\2\2\2\u072f\u0730\5\u00fa~\2\u0730\u0731\5\u00fc\177\2\u0731\u0734\3"+
		"\2\2\2\u0732\u0734\5\u0110\u0089\2\u0733\u072b\3\2\2\2\u0733\u072d\3\2"+
		"\2\2\u0733\u0732\3\2\2\2\u0734\u010b\3\2\2\2\u0735\u073b\5\u010e\u0088"+
		"\2\u0736\u0738\5\u00fe\u0080\2\u0737\u0739\5\u010c\u0087\2\u0738\u0737"+
		"\3\2\2\2\u0738\u0739\3\2\2\2\u0739\u073b\3\2\2\2\u073a\u0735\3\2\2\2\u073a"+
		"\u0736\3\2\2\2\u073b\u010d\3\2\2\2\u073c\u073d\b\u0088\1\2\u073d\u074b"+
		"\5\u00fa~\2\u073e\u0740\7S\2\2\u073f\u0741\5\\/\2\u0740\u073f\3\2\2\2"+
		"\u0740\u0741\3\2\2\2\u0741\u0742\3\2\2\2\u0742\u0744\7T\2\2\u0743\u0745"+
		"\5\u00dan\2\u0744\u0743\3\2\2\2\u0744\u0745\3\2\2\2\u0745\u074b\3\2\2"+
		"\2\u0746\u0747\7Q\2\2\u0747\u0748\5\u010c\u0087\2\u0748\u0749\7R\2\2\u0749"+
		"\u074b\3\2\2\2\u074a\u073c\3\2\2\2\u074a\u073e\3\2\2\2\u074a\u0746\3\2"+
		"\2\2\u074b\u0759\3\2\2\2\u074c\u074d\f\7\2\2\u074d\u0758\5\u00fa~\2\u074e"+
		"\u074f\f\5\2\2\u074f\u0751\7S\2\2\u0750\u0752\5\\/\2\u0751\u0750\3\2\2"+
		"\2\u0751\u0752\3\2\2\2\u0752\u0753\3\2\2\2\u0753\u0755\7T\2\2\u0754\u0756"+
		"\5\u00dan\2\u0755\u0754\3\2\2\2\u0755\u0756\3\2\2\2\u0756\u0758\3\2\2"+
		"\2\u0757\u074c\3\2\2\2\u0757\u074e\3\2\2\2\u0758\u075b\3\2\2\2\u0759\u0757"+
		"\3\2\2\2\u0759\u075a\3\2\2\2\u075a\u010f\3\2\2\2\u075b\u0759\3\2\2\2\u075c"+
		"\u0761\5\u0112\u008a\2\u075d\u075e\5\u00fe\u0080\2\u075e\u075f\5\u0110"+
		"\u0089\2\u075f\u0761\3\2\2\2\u0760\u075c\3\2\2\2\u0760\u075d\3\2\2\2\u0761"+
		"\u0111\3\2\2\2\u0762\u0763\b\u008a\1\2\u0763\u0764\7\177\2\2\u0764\u0772"+
		"\3\2\2\2\u0765\u0766\f\5\2\2\u0766\u0771\5\u00fa~\2\u0767\u0768\f\4\2"+
		"\2\u0768\u076a\7S\2\2\u0769\u076b\5\\/\2\u076a\u0769\3\2\2\2\u076a\u076b"+
		"\3\2\2\2\u076b\u076c\3\2\2\2\u076c\u076e\7T\2\2\u076d\u076f\5\u00dan\2"+
		"\u076e\u076d\3\2\2\2\u076e\u076f\3\2\2\2\u076f\u0771\3\2\2\2\u0770\u0765"+
		"\3\2\2\2\u0770\u0767\3\2\2\2\u0771\u0774\3\2\2\2\u0772\u0770\3\2\2\2\u0772"+
		"\u0773\3\2\2\2\u0773\u0113\3\2\2\2\u0774\u0772\3\2\2\2\u0775\u0777\5\u0116"+
		"\u008c\2\u0776\u0775\3\2\2\2\u0776\u0777\3\2\2\2\u0777\u0779\3\2\2\2\u0778"+
		"\u077a\7\177\2\2\u0779\u0778\3\2\2\2\u0779\u077a\3\2\2\2\u077a\u0780\3"+
		"\2\2\2\u077b\u077c\5\u0116\u008c\2\u077c\u077d\7v\2\2\u077d\u077e\7\177"+
		"\2\2\u077e\u0780\3\2\2\2\u077f\u0776\3\2\2\2\u077f\u077b\3\2\2\2\u0780"+
		"\u0115\3\2\2\2\u0781\u0782\b\u008c\1\2\u0782\u0783\5\u0118\u008d\2\u0783"+
		"\u0789\3\2\2\2\u0784\u0785\f\3\2\2\u0785\u0786\7v\2\2\u0786\u0788\5\u0118"+
		"\u008d\2\u0787\u0784\3\2\2\2\u0788\u078b\3\2\2\2\u0789\u0787\3\2\2\2\u0789"+
		"\u078a\3\2\2\2\u078a\u0117\3\2\2\2\u078b\u0789\3\2\2\2\u078c\u078e\5\u00da"+
		"n\2\u078d\u078c\3\2\2\2\u078d\u078e\3\2\2\2\u078e\u078f\3\2\2\2\u078f"+
		"\u0790\5\u0092J\2\u0790\u0791\5\u00f4{\2\u0791\u07ac\3\2\2\2\u0792\u0794"+
		"\5\u00dan\2\u0793\u0792\3\2\2\2\u0793\u0794\3\2\2\2\u0794\u0795\3\2\2"+
		"\2\u0795\u0796\5\u0092J\2\u0796\u0797\5\u00f4{\2\u0797\u0798\7a\2\2\u0798"+
		"\u0799\5\u0124\u0093\2\u0799\u07ac\3\2\2\2\u079a\u079c\5\u00dan\2\u079b"+
		"\u079a\3\2\2\2\u079b\u079c\3\2\2\2\u079c\u079d\3\2\2\2\u079d\u079f\5\u0092"+
		"J\2\u079e\u07a0\5\u010a\u0086\2\u079f\u079e\3\2\2\2\u079f\u07a0\3\2\2"+
		"\2\u07a0\u07ac\3\2\2\2\u07a1\u07a3\5\u00dan\2\u07a2\u07a1\3\2\2\2\u07a2"+
		"\u07a3\3\2\2\2\u07a3\u07a4\3\2\2\2\u07a4\u07a6\5\u0092J\2\u07a5\u07a7"+
		"\5\u010a\u0086\2\u07a6\u07a5\3\2\2\2\u07a6\u07a7\3\2\2\2\u07a7\u07a8\3"+
		"\2\2\2\u07a8\u07a9\7a\2\2\u07a9\u07aa\5\u0124\u0093\2\u07aa\u07ac\3\2"+
		"\2\2\u07ab\u078d\3\2\2\2\u07ab\u0793\3\2\2\2\u07ab\u079b\3\2\2\2\u07ab"+
		"\u07a2\3\2\2\2\u07ac\u0119\3\2\2\2\u07ad\u07af\5\u00dan\2\u07ae\u07ad"+
		"\3\2\2\2\u07ae\u07af\3\2\2\2\u07af\u07b1\3\2\2\2\u07b0\u07b2\5\u0092J"+
		"\2\u07b1\u07b0\3\2\2\2\u07b1\u07b2\3\2\2\2\u07b2\u07b3\3\2\2\2\u07b3\u07b5"+
		"\5\u00f4{\2\u07b4\u07b6\5\u013e\u00a0\2\u07b5\u07b4\3\2\2\2\u07b5\u07b6"+
		"\3\2\2\2\u07b6\u07b7\3\2\2\2\u07b7\u07b8\5\u011c\u008f\2\u07b8\u011b\3"+
		"\2\2\2\u07b9\u07bb\5\u0156\u00ac\2\u07ba\u07b9\3\2\2\2\u07ba\u07bb\3\2"+
		"\2\2\u07bb\u07bc\3\2\2\2\u07bc\u07c5\5f\64\2\u07bd\u07c5\5\u017c\u00bf"+
		"\2\u07be\u07bf\7a\2\2\u07bf\u07c0\7\26\2\2\u07c0\u07c5\7|\2\2\u07c1\u07c2"+
		"\7a\2\2\u07c2\u07c3\7\27\2\2\u07c3\u07c5\7|\2\2\u07c4\u07ba\3\2\2\2\u07c4"+
		"\u07bd\3\2\2\2\u07c4\u07be\3\2\2\2\u07c4\u07c1\3\2\2\2\u07c5\u011d\3\2"+
		"\2\2\u07c6\u07cc\5\u0120\u0091\2\u07c7\u07c8\7Q\2\2\u07c8\u07c9\5\"\22"+
		"\2\u07c9\u07ca\7R\2\2\u07ca\u07cc\3\2\2\2\u07cb\u07c6\3\2\2\2\u07cb\u07c7"+
		"\3\2\2\2\u07cc\u011f\3\2\2\2\u07cd\u07ce\7a\2\2\u07ce\u07d2\5\u0124\u0093"+
		"\2\u07cf\u07d2\5\u0128\u0095\2\u07d0\u07d2\5\u0122\u0092\2\u07d1\u07cd"+
		"\3\2\2\2\u07d1\u07cf\3\2\2\2\u07d1\u07d0\3\2\2\2\u07d2\u0121\3\2\2\2\u07d3"+
		"\u07d4\7a\2\2\u07d4\u07d5\5T+\2\u07d5\u07d6\7\3\2\2\u07d6\u07d7\5\4\3"+
		"\2\u07d7\u0123\3\2\2\2\u07d8\u07db\5T+\2\u07d9\u07db\5\u0128\u0095\2\u07da"+
		"\u07d8\3\2\2\2\u07da\u07d9\3\2\2\2\u07db\u0125\3\2\2\2\u07dc\u07dd\b\u0094"+
		"\1\2\u07dd\u07df\5\u0124\u0093\2\u07de\u07e0\7\177\2\2\u07df\u07de\3\2"+
		"\2\2\u07df\u07e0\3\2\2\2\u07e0\u07e9\3\2\2\2\u07e1\u07e2\f\3\2\2\u07e2"+
		"\u07e3\7v\2\2\u07e3\u07e5\5\u0124\u0093\2\u07e4\u07e6\7\177\2\2\u07e5"+
		"\u07e4\3\2\2\2\u07e5\u07e6\3\2\2\2\u07e6\u07e8\3\2\2\2\u07e7\u07e1\3\2"+
		"\2\2\u07e8\u07eb\3\2\2\2\u07e9\u07e7\3\2\2\2\u07e9\u07ea\3\2\2\2\u07ea"+
		"\u0127\3\2\2\2\u07eb\u07e9\3\2\2\2\u07ec\u07ed\7U\2\2\u07ed\u07ef\5\u0126"+
		"\u0094\2\u07ee\u07f0\7v\2\2\u07ef\u07ee\3\2\2\2\u07ef\u07f0\3\2\2\2\u07f0"+
		"\u07f1\3\2\2\2\u07f1\u07f2\7V\2\2\u07f2\u07f6\3\2\2\2\u07f3\u07f4\7U\2"+
		"\2\u07f4\u07f6\7V\2\2\u07f5\u07ec\3\2\2\2\u07f5\u07f3\3\2\2\2\u07f6\u0129"+
		"\3\2\2\2\u07f7\u07fa\7\u0080\2\2\u07f8\u07fa\5\u016a\u00b6\2\u07f9\u07f7"+
		"\3\2\2\2\u07f9\u07f8\3\2\2\2\u07fa\u012b\3\2\2\2\u07fb\u07fc\5\u012e\u0098"+
		"\2\u07fc\u07fe\7U\2\2\u07fd\u07ff\5\u0136\u009c\2\u07fe\u07fd\3\2\2\2"+
		"\u07fe\u07ff\3\2\2\2\u07ff\u0800\3\2\2\2\u0800\u0801\7V\2\2\u0801\u012d"+
		"\3\2\2\2\u0802\u0804\5\u0134\u009b\2\u0803\u0805\5\u00dan\2\u0804\u0803"+
		"\3\2\2\2\u0804\u0805\3\2\2\2\u0805\u0806\3\2\2\2\u0806\u0808\5\u0130\u0099"+
		"\2\u0807\u0809\5\u0132\u009a\2\u0808\u0807\3\2\2\2\u0808\u0809\3\2\2\2"+
		"\u0809\u080b\3\2\2\2\u080a\u080c\5\u0144\u00a3\2\u080b\u080a\3\2\2\2\u080b"+
		"\u080c\3\2\2\2\u080c\u0815\3\2\2\2\u080d\u080f\5\u0134\u009b\2\u080e\u0810"+
		"\5\u00dan\2\u080f\u080e\3\2\2\2\u080f\u0810\3\2\2\2\u0810\u0812\3\2\2"+
		"\2\u0811\u0813\5\u0144\u00a3\2\u0812\u0811\3\2\2\2\u0812\u0813\3\2\2\2"+
		"\u0813\u0815\3\2\2\2\u0814\u0802\3\2\2\2\u0814\u080d\3\2\2\2\u0815\u012f"+
		"\3\2\2\2\u0816\u0818\5\f\7\2\u0817\u0816\3\2\2\2\u0817\u0818\3\2\2\2\u0818"+
		"\u0819\3\2\2\2\u0819\u081a\5\u012a\u0096\2\u081a\u0131\3\2\2\2\u081b\u081c"+
		"\7!\2\2\u081c\u0133\3\2\2\2\u081d\u081e\t\b\2\2\u081e\u0135\3\2\2\2\u081f"+
		"\u0821\5\u0138\u009d\2\u0820\u0822\5\u0136\u009c\2\u0821\u0820\3\2\2\2"+
		"\u0821\u0822\3\2\2\2\u0822\u0829\3\2\2\2\u0823\u0824\5\u014e\u00a8\2\u0824"+
		"\u0826\7z\2\2\u0825\u0827\5\u0136\u009c\2\u0826\u0825\3\2\2\2\u0826\u0827"+
		"\3\2\2\2\u0827\u0829\3\2\2\2\u0828\u081f\3\2\2\2\u0828\u0823\3\2\2\2\u0829"+
		"\u0137\3\2\2\2\u082a\u082c\5\u00dan\2\u082b\u082a\3\2\2\2\u082b\u082c"+
		"\3\2\2\2\u082c\u082e\3\2\2\2\u082d\u082f\5\u0092J\2\u082e\u082d\3\2\2"+
		"\2\u082e\u082f\3\2\2\2\u082f\u0831\3\2\2\2\u0830\u0832\5\u013a\u009e\2"+
		"\u0831\u0830\3\2\2\2\u0831\u0832\3\2\2\2\u0832\u0833\3\2\2\2\u0833\u083c"+
		"\7|\2\2\u0834\u083c\5\u011a\u008e\2\u0835\u083c\5\u00d2j\2\u0836\u083c"+
		"\5\u008aF\2\u0837\u083c\5\u0162\u00b2\2\u0838\u083c\5\u0084C\2\u0839\u083c"+
		"\5\u008cG\2\u083a\u083c\5\u0088E\2\u083b\u082b\3\2\2\2\u083b\u0834\3\2"+
		"\2\2\u083b\u0835\3\2\2\2\u083b\u0836\3\2\2\2\u083b\u0837\3\2\2\2\u083b"+
		"\u0838\3\2\2\2\u083b\u0839\3\2\2\2\u083b\u083a\3\2\2\2\u083c\u0139\3\2"+
		"\2\2\u083d\u083e\b\u009e\1\2\u083e\u083f\5\u013c\u009f\2\u083f\u0845\3"+
		"\2\2\2\u0840\u0841\f\3\2\2\u0841\u0842\7v\2\2\u0842\u0844\5\u013c\u009f"+
		"\2\u0843\u0840\3\2\2\2\u0844\u0847\3\2\2\2\u0845\u0843\3\2\2\2\u0845\u0846"+
		"\3\2\2\2\u0846\u013b\3\2\2\2\u0847\u0845\3\2\2\2\u0848\u084a\5\u00f4{"+
		"\2\u0849\u084b\5\u013e\u00a0\2\u084a\u0849\3\2\2\2\u084a\u084b\3\2\2\2"+
		"\u084b\u084d\3\2\2\2\u084c\u084e\5\u0142\u00a2\2\u084d\u084c\3\2\2\2\u084d"+
		"\u084e\3\2\2\2\u084e\u085c\3\2\2\2\u084f\u0851\5\u00f4{\2\u0850\u0852"+
		"\5\u0120\u0091\2\u0851\u0850\3\2\2\2\u0851\u0852\3\2\2\2\u0852\u085c\3"+
		"\2\2\2\u0853\u0855\7\u0080\2\2\u0854\u0853\3\2\2\2\u0854\u0855\3\2\2\2"+
		"\u0855\u0857\3\2\2\2\u0856\u0858\5\u00dan\2\u0857\u0856\3\2\2\2\u0857"+
		"\u0858\3\2\2\2\u0858\u0859\3\2\2\2\u0859\u085a\7z\2\2\u085a\u085c\5\\"+
		"/\2\u085b\u0848\3\2\2\2\u085b\u084f\3\2\2\2\u085b\u0854\3\2\2\2\u085c"+
		"\u013d\3\2\2\2\u085d\u085e\b\u00a0\1\2\u085e\u085f\5\u0140\u00a1\2\u085f"+
		"\u0864\3\2\2\2\u0860\u0861\f\3\2\2\u0861\u0863\5\u0140\u00a1\2\u0862\u0860"+
		"\3\2\2\2\u0863\u0866\3\2\2\2\u0864\u0862\3\2\2\2\u0864\u0865\3\2\2\2\u0865"+
		"\u013f\3\2\2\2\u0866\u0864\3\2\2\2\u0867\u0868\t\t\2\2\u0868\u0141\3\2"+
		"\2\2\u0869\u086a\7a\2\2\u086a\u086b\7\u0083\2\2\u086b\u086c\b\u00a2\1"+
		"\2\u086c\u0143\3\2\2\2\u086d\u086e\7z\2\2\u086e\u086f\5\u0146\u00a4\2"+
		"\u086f\u0145\3\2\2\2\u0870\u0871\b\u00a4\1\2\u0871\u0873\5\u0148\u00a5"+
		"\2\u0872\u0874\7\177\2\2\u0873\u0872\3\2\2\2\u0873\u0874\3\2\2\2\u0874"+
		"\u087d\3\2\2\2\u0875\u0876\f\3\2\2\u0876\u0877\7v\2\2\u0877\u0879\5\u0148"+
		"\u00a5\2\u0878\u087a\7\177\2\2\u0879\u0878\3\2\2\2\u0879\u087a\3\2\2\2"+
		"\u087a\u087c\3\2\2\2\u087b\u0875\3\2\2\2\u087c\u087f\3\2\2\2\u087d\u087b"+
		"\3\2\2\2\u087d\u087e\3\2\2\2\u087e\u0147\3\2\2\2\u087f\u087d\3\2\2\2\u0880"+
		"\u0882\5\u00dan\2\u0881\u0880\3\2\2\2\u0881\u0882\3\2\2\2\u0882\u0883"+
		"\3\2\2\2\u0883\u0896\5\u014c\u00a7\2\u0884\u0886\5\u00dan\2\u0885\u0884"+
		"\3\2\2\2\u0885\u0886\3\2\2\2\u0886\u0887\3\2\2\2\u0887\u0889\7L\2\2\u0888"+
		"\u088a\5\u014e\u00a8\2\u0889\u0888\3\2\2\2\u0889\u088a\3\2\2\2\u088a\u088b"+
		"\3\2\2\2\u088b\u0896\5\u014c\u00a7\2\u088c\u088e\5\u00dan\2\u088d\u088c"+
		"\3\2\2\2\u088d\u088e\3\2\2\2\u088e\u088f\3\2\2\2\u088f\u0891\5\u014e\u00a8"+
		"\2\u0890\u0892\7L\2\2\u0891\u0890\3\2\2\2\u0891\u0892\3\2\2\2\u0892\u0893"+
		"\3\2\2\2\u0893\u0894\5\u014c\u00a7\2\u0894\u0896\3\2\2\2\u0895\u0881\3"+
		"\2\2\2\u0895\u0885\3\2\2\2\u0895\u088d\3\2\2\2\u0896\u0149\3\2\2\2\u0897"+
		"\u0899\5\f\7\2\u0898\u0897\3\2\2\2\u0898\u0899\3\2\2\2\u0899\u089a\3\2"+
		"\2\2\u089a\u089d\5\u012a\u0096\2\u089b\u089d\5\u00a6T\2\u089c\u0898\3"+
		"\2\2\2\u089c\u089b\3\2\2\2\u089d\u014b\3\2\2\2\u089e\u089f\5\u014a\u00a6"+
		"\2\u089f\u014d\3\2\2\2\u08a0\u08a1\t\n\2\2\u08a1\u014f\3\2\2\2\u08a2\u08a3"+
		"\7\60\2\2\u08a3\u08a4\5\u0152\u00aa\2\u08a4\u0151\3\2\2\2\u08a5\u08a7"+
		"\5\u009eP\2\u08a6\u08a8\5\u0154\u00ab\2\u08a7\u08a6\3\2\2\2\u08a7\u08a8"+
		"\3\2\2\2\u08a8\u0153\3\2\2\2\u08a9\u08ab\5\u00fe\u0080\2\u08aa\u08ac\5"+
		"\u0154\u00ab\2\u08ab\u08aa\3\2\2\2\u08ab\u08ac\3\2\2\2\u08ac\u0155\3\2"+
		"\2\2\u08ad\u08ae\7z\2\2\u08ae\u08af\5\u0158\u00ad\2\u08af\u0157\3\2\2"+
		"\2\u08b0\u08b2\5\u015a\u00ae\2\u08b1\u08b3\7\177\2\2\u08b2\u08b1\3\2\2"+
		"\2\u08b2\u08b3\3\2\2\2\u08b3\u08bc\3\2\2\2\u08b4\u08b6\5\u015a\u00ae\2"+
		"\u08b5\u08b7\7\177\2\2\u08b6\u08b5\3\2\2\2\u08b6\u08b7\3\2\2\2\u08b7\u08b8"+
		"\3\2\2\2\u08b8\u08b9\7v\2\2\u08b9\u08ba\5\u0158\u00ad\2\u08ba\u08bc\3"+
		"\2\2\2\u08bb\u08b0\3\2\2\2\u08bb\u08b4\3\2\2\2\u08bc\u0159\3\2\2\2\u08bd"+
		"\u08be\5\u015c\u00af\2\u08be\u08c0\7Q\2\2\u08bf\u08c1\5\"\22\2\u08c0\u08bf"+
		"\3\2\2\2\u08c0\u08c1\3\2\2\2\u08c1\u08c2\3\2\2\2\u08c2\u08c3\7R\2\2\u08c3"+
		"\u08c8\3\2\2\2\u08c4\u08c5\5\u015c\u00af\2\u08c5\u08c6\5\u0128\u0095\2"+
		"\u08c6\u08c8\3\2\2\2\u08c7\u08bd\3\2\2\2\u08c7\u08c4\3\2\2\2\u08c8\u015b"+
		"\3\2\2\2\u08c9\u08cc\5\u014a\u00a6\2\u08ca\u08cc\7\u0080\2\2\u08cb\u08c9"+
		"\3\2\2\2\u08cb\u08ca\3\2\2\2\u08cc\u015d\3\2\2\2\u08cd\u08ce\7\60\2\2"+
		"\u08ce\u08cf\5\u0192\u00ca\2\u08cf\u015f\3\2\2\2\u08d0\u08d1\7\60\2\2"+
		"\u08d1\u08d2\7\u0089\2\2\u08d2\u08d6\7\u0080\2\2\u08d3\u08d4\7\60\2\2"+
		"\u08d4\u08d6\7\u008c\2\2\u08d5\u08d0\3\2\2\2\u08d5\u08d3\3\2\2\2\u08d6"+
		"\u0161\3\2\2\2\u08d7\u08d8\7@\2\2\u08d8\u08d9\7b\2\2\u08d9\u08da\5\u0164"+
		"\u00b3\2\u08da\u08db\7c\2\2\u08db\u08dc\5\u0080A\2\u08dc\u0163\3\2\2\2"+
		"\u08dd\u08de\b\u00b3\1\2\u08de\u08df\5\u0166\u00b4\2\u08df\u08e5\3\2\2"+
		"\2\u08e0\u08e1\f\3\2\2\u08e1\u08e2\7v\2\2\u08e2\u08e4\5\u0166\u00b4\2"+
		"\u08e3\u08e0\3\2\2\2\u08e4\u08e7\3\2\2\2\u08e5\u08e3\3\2\2\2\u08e5\u08e6"+
		"\3\2\2\2\u08e6\u0165\3\2\2\2\u08e7\u08e5\3\2\2\2\u08e8\u08eb\5\u0168\u00b5"+
		"\2\u08e9\u08eb\5\u0118\u008d\2\u08ea\u08e8\3\2\2\2\u08ea\u08e9\3\2\2\2"+
		"\u08eb\u0167\3\2\2\2\u08ec\u08ee\7\20\2\2\u08ed\u08ef\7\177\2\2\u08ee"+
		"\u08ed\3\2\2\2\u08ee\u08ef\3\2\2\2\u08ef\u08f1\3\2\2\2\u08f0\u08f2\7\u0080"+
		"\2\2\u08f1\u08f0\3\2\2\2\u08f1\u08f2\3\2\2\2\u08f2\u091d\3\2\2\2\u08f3"+
		"\u08f5\7\20\2\2\u08f4\u08f6\7\u0080\2\2\u08f5\u08f4\3\2\2\2\u08f5\u08f6"+
		"\3\2\2\2\u08f6\u08f7\3\2\2\2\u08f7\u08f8\7a\2\2\u08f8\u091d\5\u0108\u0085"+
		"\2\u08f9\u08fb\7H\2\2\u08fa\u08fc\7\177\2\2\u08fb\u08fa\3\2\2\2\u08fb"+
		"\u08fc\3\2\2\2\u08fc\u08fe\3\2\2\2\u08fd\u08ff\7\u0080\2\2\u08fe\u08fd"+
		"\3\2\2\2\u08fe\u08ff\3\2\2\2\u08ff\u091d\3\2\2\2\u0900\u0902\7H\2\2\u0901"+
		"\u0903\7\u0080\2\2\u0902\u0901\3\2\2\2\u0902\u0903\3\2\2\2\u0903\u0904"+
		"\3\2\2\2\u0904\u0905\7a\2\2\u0905\u091d\5\u0108\u0085\2\u0906\u0907\7"+
		"@\2\2\u0907\u0908\7b\2\2\u0908\u0909\5\u0164\u00b3\2\u0909\u090a\7c\2"+
		"\2\u090a\u090c\7\20\2\2\u090b\u090d\7\177\2\2\u090c\u090b\3\2\2\2\u090c"+
		"\u090d\3\2\2\2\u090d\u090f\3\2\2\2\u090e\u0910\7\u0080\2\2\u090f\u090e"+
		"\3\2\2\2\u090f\u0910\3\2\2\2\u0910\u091d\3\2\2\2\u0911\u0912\7@\2\2\u0912"+
		"\u0913\7b\2\2\u0913\u0914\5\u0164\u00b3\2\u0914\u0915\7c\2\2\u0915\u0917"+
		"\7\20\2\2\u0916\u0918\7\u0080\2\2\u0917\u0916\3\2\2\2\u0917\u0918\3\2"+
		"\2\2\u0918\u0919\3\2\2\2\u0919\u091a\7a\2\2\u091a\u091b\5\6\4\2\u091b"+
		"\u091d\3\2\2\2\u091c\u08ec\3\2\2\2\u091c\u08f3\3\2\2\2\u091c\u08f9\3\2"+
		"\2\2\u091c\u0900\3\2\2\2\u091c\u0906\3\2\2\2\u091c\u0911\3\2\2\2\u091d"+
		"\u0169\3\2\2\2\u091e\u091f\5\u016e\u00b8\2\u091f\u0921\7b\2\2\u0920\u0922"+
		"\5\u0170\u00b9\2\u0921\u0920\3\2\2\2\u0921\u0922\3\2\2\2\u0922\u0923\3"+
		"\2\2\2\u0923\u0924\7c\2\2\u0924\u016b\3\2\2\2\u0925\u0935\5\u016a\u00b6"+
		"\2\u0926\u0927\5\u015e\u00b0\2\u0927\u0929\7b\2\2\u0928\u092a\5\u0170"+
		"\u00b9\2\u0929\u0928\3\2\2\2\u0929\u092a\3\2\2\2\u092a\u092b\3\2\2\2\u092b"+
		"\u092c\7c\2\2\u092c\u0935\3\2\2\2\u092d\u092e\5\u0160\u00b1\2\u092e\u0930"+
		"\7b\2\2\u092f\u0931\5\u0170\u00b9\2\u0930\u092f\3\2\2\2\u0930\u0931\3"+
		"\2\2\2\u0931\u0932\3\2\2\2\u0932\u0933\7c\2\2\u0933\u0935\3\2\2\2\u0934"+
		"\u0925\3\2\2\2\u0934\u0926\3\2\2\2\u0934\u092d\3\2\2\2\u0935\u016d\3\2"+
		"\2\2\u0936\u0937\7\u0080\2\2\u0937\u016f\3\2\2\2\u0938\u0939\b\u00b9\1"+
		"\2\u0939\u093b\5\u0172\u00ba\2\u093a\u093c\7\177\2\2\u093b\u093a\3\2\2"+
		"\2\u093b\u093c\3\2\2\2\u093c\u0945\3\2\2\2\u093d\u093e\f\3\2\2\u093e\u093f"+
		"\7v\2\2\u093f\u0941\5\u0172\u00ba\2\u0940\u0942\7\177\2\2\u0941\u0940"+
		"\3\2\2\2\u0941\u0942\3\2\2\2\u0942\u0944\3\2\2\2\u0943\u093d\3\2\2\2\u0944"+
		"\u0947\3\2\2\2\u0945\u0943\3\2\2\2\u0945\u0946\3\2\2\2\u0946\u0171\3\2"+
		"\2\2\u0947\u0945\3\2\2\2\u0948\u094c\5\\/\2\u0949\u094c\5\u0108\u0085"+
		"\2\u094a\u094c\5\6\4\2\u094b\u0948\3\2\2\2\u094b\u0949\3\2\2\2\u094b\u094a"+
		"\3\2\2\2\u094c\u0173\3\2\2\2\u094d\u094e\7H\2\2\u094e\u094f\5\f\7\2\u094f"+
		"\u0950\7\u0080\2\2\u0950\u0959\3\2\2\2\u0951\u0952\7H\2\2\u0952\u0954"+
		"\5\f\7\2\u0953\u0955\7@\2\2\u0954\u0953\3\2\2\2\u0954\u0955\3\2\2\2\u0955"+
		"\u0956\3\2\2\2\u0956\u0957\5\u016a\u00b6\2\u0957\u0959\3\2\2\2\u0958\u094d"+
		"\3\2\2\2\u0958\u0951\3\2\2\2\u0959\u0175\3\2\2\2\u095a\u095c\7\37\2\2"+
		"\u095b\u095a\3\2\2\2\u095b\u095c\3\2\2\2\u095c\u095d\3\2\2\2\u095d\u095e"+
		"\7@\2\2\u095e\u095f\5\u0080A\2\u095f\u0177\3\2\2\2\u0960\u0961\7@\2\2"+
		"\u0961\u0962\7b\2\2\u0962\u0963\7c\2\2\u0963\u0964\5\u0080A\2\u0964\u0179"+
		"\3\2\2\2\u0965\u0966\7E\2\2\u0966\u0967\5f\64\2\u0967\u0968\5\u017e\u00c0"+
		"\2\u0968\u017b\3\2\2\2\u0969\u096b\7E\2\2\u096a\u096c\5\u0156\u00ac\2"+
		"\u096b\u096a\3\2\2\2\u096b\u096c\3\2\2\2\u096c\u096d\3\2\2\2\u096d\u096e"+
		"\5f\64\2\u096e\u096f\5\u017e\u00c0\2\u096f\u017d\3\2\2\2\u0970\u0972\5"+
		"\u0180\u00c1\2\u0971\u0973\5\u017e\u00c0\2\u0972\u0971\3\2\2\2\u0972\u0973"+
		"\3\2\2\2\u0973\u017f\3\2\2\2\u0974\u0975\7\f\2\2\u0975\u0976\7Q\2\2\u0976"+
		"\u0977\5\u0182\u00c2\2\u0977\u0978\7R\2\2\u0978\u0979\5f\64\2\u0979\u0181"+
		"\3\2\2\2\u097a\u097c\5\u00dan\2\u097b\u097a\3\2\2\2\u097b\u097c\3\2\2"+
		"\2\u097c\u097d\3\2\2\2\u097d\u097e\5\u009eP\2\u097e\u097f\5\u00f4{\2\u097f"+
		"\u0989\3\2\2\2\u0980\u0982\5\u00dan\2\u0981\u0980\3\2\2\2\u0981\u0982"+
		"\3\2\2\2\u0982\u0983\3\2\2\2\u0983\u0985\5\u009eP\2\u0984\u0986\5\u010a"+
		"\u0086\2\u0985\u0984\3\2\2";
	private static final String _serializedATNSegment1 =
		"\2\u0985\u0986\3\2\2\2\u0986\u0989\3\2\2\2\u0987\u0989\7\177\2\2\u0988"+
		"\u097b\3\2\2\2\u0988\u0981\3\2\2\2\u0988\u0987\3\2\2\2\u0989\u0183\3\2"+
		"\2\2\u098a\u098c\7C\2\2\u098b\u098d\5T+\2\u098c\u098b\3\2\2\2\u098c\u098d"+
		"\3\2\2\2\u098d\u0185\3\2\2\2\u098e\u0991\5\u0188\u00c5\2\u098f\u0991\5"+
		"\u018c\u00c7\2\u0990\u098e\3\2\2\2\u0990\u098f\3\2\2\2\u0991\u0187\3\2"+
		"\2\2\u0992\u0993\7C\2\2\u0993\u0995\7Q\2\2\u0994\u0996\5\u018a\u00c6\2"+
		"\u0995\u0994\3\2\2\2\u0995\u0996\3\2\2\2\u0996\u0997\3\2\2\2\u0997\u0998"+
		"\7R\2\2\u0998\u0189\3\2\2\2\u0999\u099a\b\u00c6\1\2\u099a\u099c\5\u0108"+
		"\u0085\2\u099b\u099d\7\177\2\2\u099c\u099b\3\2\2\2\u099c\u099d\3\2\2\2"+
		"\u099d\u09a6\3\2\2\2\u099e\u099f\f\3\2\2\u099f\u09a0\7v\2\2\u09a0\u09a2"+
		"\5\u0108\u0085\2\u09a1\u09a3\7\177\2\2\u09a2\u09a1\3\2\2\2\u09a2\u09a3"+
		"\3\2\2\2\u09a3\u09a5\3\2\2\2\u09a4\u099e\3\2\2\2\u09a5\u09a8\3\2\2\2\u09a6"+
		"\u09a4\3\2\2\2\u09a6\u09a7\3\2\2\2\u09a7\u018b\3\2\2\2\u09a8\u09a6\3\2"+
		"\2\2\u09a9\u09aa\7.\2\2\u09aa\u09ab\7Q\2\2\u09ab\u09ac\5\\/\2\u09ac\u09ad"+
		"\7R\2\2\u09ad\u09b0\3\2\2\2\u09ae\u09b0\7.\2\2\u09af\u09a9\3\2\2\2\u09af"+
		"\u09ae\3\2\2\2\u09b0\u018d\3\2\2\2\u09b1\u09b2\7c\2\2\u09b2\u09b3\7c\2"+
		"\2\u09b3\u018f\3\2\2\2\u09b4\u09b5\7c\2\2\u09b5\u09b6\7c\2\2\u09b6\u09b7"+
		"\7a\2\2\u09b7\u0191\3\2\2\2\u09b8\u09e9\7-\2\2\u09b9\u09e9\7\27\2\2\u09ba"+
		"\u09bb\7-\2\2\u09bb\u09bc\7S\2\2\u09bc\u09e9\7T\2\2\u09bd\u09be\7\27\2"+
		"\2\u09be\u09bf\7S\2\2\u09bf\u09e9\7T\2\2\u09c0\u09e9\7W\2\2\u09c1\u09e9"+
		"\7X\2\2\u09c2\u09e9\7Y\2\2\u09c3\u09e9\7Z\2\2\u09c4\u09e9\7[\2\2\u09c5"+
		"\u09e9\7\\\2\2\u09c6\u09e9\7]\2\2\u09c7\u09e9\7^\2\2\u09c8\u09e9\7_\2"+
		"\2\u09c9\u09e9\7`\2\2\u09ca\u09e9\7a\2\2\u09cb\u09e9\7b\2\2\u09cc\u09e9"+
		"\7c\2\2\u09cd\u09e9\7d\2\2\u09ce\u09e9\7e\2\2\u09cf\u09e9\7f\2\2\u09d0"+
		"\u09e9\7g\2\2\u09d1\u09e9\7h\2\2\u09d2\u09e9\7i\2\2\u09d3\u09e9\7j\2\2"+
		"\u09d4\u09e9\7k\2\2\u09d5\u09e9\7l\2\2\u09d6\u09e9\5\u018e\u00c8\2\u09d7"+
		"\u09e9\5\u0190\u00c9\2\u09d8\u09e9\7m\2\2\u09d9\u09e9\7n\2\2\u09da\u09e9"+
		"\7o\2\2\u09db\u09e9\7p\2\2\u09dc\u09e9\7q\2\2\u09dd\u09e9\7r\2\2\u09de"+
		"\u09e9\7s\2\2\u09df\u09e9\7t\2\2\u09e0\u09e9\7u\2\2\u09e1\u09e9\7v\2\2"+
		"\u09e2\u09e9\7w\2\2\u09e3\u09e9\7x\2\2\u09e4\u09e5\7Q\2\2\u09e5\u09e9"+
		"\7R\2\2\u09e6\u09e7\7S\2\2\u09e7\u09e9\7T\2\2\u09e8\u09b8\3\2\2\2\u09e8"+
		"\u09b9\3\2\2\2\u09e8\u09ba\3\2\2\2\u09e8\u09bd\3\2\2\2\u09e8\u09c0\3\2"+
		"\2\2\u09e8\u09c1\3\2\2\2\u09e8\u09c2\3\2\2\2\u09e8\u09c3\3\2\2\2\u09e8"+
		"\u09c4\3\2\2\2\u09e8\u09c5\3\2\2\2\u09e8\u09c6\3\2\2\2\u09e8\u09c7\3\2"+
		"\2\2\u09e8\u09c8\3\2\2\2\u09e8\u09c9\3\2\2\2\u09e8\u09ca\3\2\2\2\u09e8"+
		"\u09cb\3\2\2\2\u09e8\u09cc\3\2\2\2\u09e8\u09cd\3\2\2\2\u09e8\u09ce\3\2"+
		"\2\2\u09e8\u09cf\3\2\2\2\u09e8\u09d0\3\2\2\2\u09e8\u09d1\3\2\2\2\u09e8"+
		"\u09d2\3\2\2\2\u09e8\u09d3\3\2\2\2\u09e8\u09d4\3\2\2\2\u09e8\u09d5\3\2"+
		"\2\2\u09e8\u09d6\3\2\2\2\u09e8\u09d7\3\2\2\2\u09e8\u09d8\3\2\2\2\u09e8"+
		"\u09d9\3\2\2\2\u09e8\u09da\3\2\2\2\u09e8\u09db\3\2\2\2\u09e8\u09dc\3\2"+
		"\2\2\u09e8\u09dd\3\2\2\2\u09e8\u09de\3\2\2\2\u09e8\u09df\3\2\2\2\u09e8"+
		"\u09e0\3\2\2\2\u09e8\u09e1\3\2\2\2\u09e8\u09e2\3\2\2\2\u09e8\u09e3\3\2"+
		"\2\2\u09e8\u09e4\3\2\2\2\u09e8\u09e6\3\2\2\2\u09e9\u0193\3\2\2\2\u09ea"+
		"\u09f2\7\u0081\2\2\u09eb\u09f2\7\u0087\2\2\u09ec\u09f2\7\u0088\2\2\u09ed"+
		"\u09f2\7\u0089\2\2\u09ee\u09f2\5\u0196\u00cc\2\u09ef\u09f2\5\u0198\u00cd"+
		"\2\u09f0\u09f2\5\u019a\u00ce\2\u09f1\u09ea\3\2\2\2\u09f1\u09eb\3\2\2\2"+
		"\u09f1\u09ec\3\2\2\2\u09f1\u09ed\3\2\2\2\u09f1\u09ee\3\2\2\2\u09f1\u09ef"+
		"\3\2\2\2\u09f1\u09f0\3\2\2\2\u09f2\u0195\3\2\2\2\u09f3\u09f4\t\13\2\2"+
		"\u09f4\u0197\3\2\2\2\u09f5\u09f6\7/\2\2\u09f6\u0199\3\2\2\2\u09f7\u09f8"+
		"\t\f\2\2\u09f8\u019b\3\2\2\2\u0145\u019d\u01a9\u01ad\u01b8\u01bc\u01cb"+
		"\u01d2\u01d7\u01d9\u01de\u01e4\u01ee\u01f5\u01fb\u01ff\u0204\u020a\u0211"+
		"\u0217\u021a\u021d\u0220\u0227\u022e\u0262\u0271\u0277\u027d\u028a\u028c"+
		"\u0292\u02a1\u02a7\u02c5\u02ca\u02ce\u02d2\u02d5\u02d9\u02df\u02e1\u02e9"+
		"\u02ed\u02f0\u02f7\u02fe\u0302\u0307\u030b\u030e\u0313\u0319\u0326\u0331"+
		"\u0333\u0342\u0344\u0350\u0352\u0362\u0364\u0376\u0378\u0384\u0386\u0391"+
		"\u039c\u03a7\u03b2\u03bd\u03c7\u03cf\u03dc\u03e1\u03e8\u03f1\u03f7\u03fb"+
		"\u03ff\u0403\u0407\u040c\u0410\u0419\u041f\u0427\u042c\u042f\u0435\u0440"+
		"\u0458\u0468\u046c\u0474\u047b\u0483\u0497\u049b\u04a8\u04ac\u04af\u04b6"+
		"\u04be\u04c8\u04d3\u04df\u04e9\u04ee\u04f5\u04f8\u04fd\u0503\u0506\u050a"+
		"\u050f\u0515\u052a\u052e\u0533\u053e\u0544\u0548\u054d\u0551\u0556\u0559"+
		"\u056f\u0575\u0580\u0584\u0587\u0591\u0597\u059a\u05a1\u05ab\u05af\u05b2"+
		"\u05b5\u05b9\u05be\u05c0\u05c4\u05c8\u05d1\u05de\u05e6\u05ec\u05f2\u05f6"+
		"\u05f9\u0602\u060b\u0613\u061e\u0624\u062f\u0632\u0637\u0646\u064c\u0655"+
		"\u065f\u0665\u066d\u0671\u0675\u067a\u067f\u0686\u0688\u068d\u0691\u069f"+
		"\u06a5\u06b4\u06be\u06c3\u06ca\u06d0\u06d5\u06db\u06e2\u06e6\u06e8\u06ea"+
		"\u06f1\u06f4\u06f7\u06fa\u06ff\u0703\u0706\u070a\u070e\u0713\u0716\u0718"+
		"\u071c\u0723\u0729\u072d\u0733\u0738\u073a\u0740\u0744\u074a\u0751\u0755"+
		"\u0757\u0759\u0760\u076a\u076e\u0770\u0772\u0776\u0779\u077f\u0789\u078d"+
		"\u0793\u079b\u079f\u07a2\u07a6\u07ab\u07ae\u07b1\u07b5\u07ba\u07c4\u07cb"+
		"\u07d1\u07da\u07df\u07e5\u07e9\u07ef\u07f5\u07f9\u07fe\u0804\u0808\u080b"+
		"\u080f\u0812\u0814\u0817\u0821\u0826\u0828\u082b\u082e\u0831\u083b\u0845"+
		"\u084a\u084d\u0851\u0854\u0857\u085b\u0864\u0873\u0879\u087d\u0881\u0885"+
		"\u0889\u088d\u0891\u0895\u0898\u089c\u08a7\u08ab\u08b2\u08b6\u08bb\u08c0"+
		"\u08c7\u08cb\u08d5\u08e5\u08ea\u08ee\u08f1\u08f5\u08fb\u08fe\u0902\u090c"+
		"\u090f\u0917\u091c\u0921\u0929\u0930\u0934\u093b\u0941\u0945\u094b\u0954"+
		"\u0958\u095b\u096b\u0972\u097b\u0981\u0985\u0988\u098c\u0990\u0995\u099c"+
		"\u09a2\u09a6\u09af\u09e8\u09f1";
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