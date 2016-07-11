// Generated from NGC.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NGCParser}.
 */
public interface NGCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NGCParser#translationunit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationunit(NGCParser.TranslationunitContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#translationunit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationunit(NGCParser.TranslationunitContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#primaryexpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryexpression(NGCParser.PrimaryexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#primaryexpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryexpression(NGCParser.PrimaryexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#idexpression}.
	 * @param ctx the parse tree
	 */
	void enterIdexpression(NGCParser.IdexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#idexpression}.
	 * @param ctx the parse tree
	 */
	void exitIdexpression(NGCParser.IdexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#unqualifiedid}.
	 * @param ctx the parse tree
	 */
	void enterUnqualifiedid(NGCParser.UnqualifiedidContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#unqualifiedid}.
	 * @param ctx the parse tree
	 */
	void exitUnqualifiedid(NGCParser.UnqualifiedidContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#qualifiedid}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedid(NGCParser.QualifiedidContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#qualifiedid}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedid(NGCParser.QualifiedidContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#nestednamespecifier}.
	 * @param ctx the parse tree
	 */
	void enterNestednamespecifier(NGCParser.NestednamespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#nestednamespecifier}.
	 * @param ctx the parse tree
	 */
	void exitNestednamespecifier(NGCParser.NestednamespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#lambdaexpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaexpression(NGCParser.LambdaexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#lambdaexpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaexpression(NGCParser.LambdaexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#lambdaintroducer}.
	 * @param ctx the parse tree
	 */
	void enterLambdaintroducer(NGCParser.LambdaintroducerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#lambdaintroducer}.
	 * @param ctx the parse tree
	 */
	void exitLambdaintroducer(NGCParser.LambdaintroducerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#lambdacapture}.
	 * @param ctx the parse tree
	 */
	void enterLambdacapture(NGCParser.LambdacaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#lambdacapture}.
	 * @param ctx the parse tree
	 */
	void exitLambdacapture(NGCParser.LambdacaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#capturedefault}.
	 * @param ctx the parse tree
	 */
	void enterCapturedefault(NGCParser.CapturedefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#capturedefault}.
	 * @param ctx the parse tree
	 */
	void exitCapturedefault(NGCParser.CapturedefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#capturelist}.
	 * @param ctx the parse tree
	 */
	void enterCapturelist(NGCParser.CapturelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#capturelist}.
	 * @param ctx the parse tree
	 */
	void exitCapturelist(NGCParser.CapturelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#capture}.
	 * @param ctx the parse tree
	 */
	void enterCapture(NGCParser.CaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#capture}.
	 * @param ctx the parse tree
	 */
	void exitCapture(NGCParser.CaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#simplecapture}.
	 * @param ctx the parse tree
	 */
	void enterSimplecapture(NGCParser.SimplecaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#simplecapture}.
	 * @param ctx the parse tree
	 */
	void exitSimplecapture(NGCParser.SimplecaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#initcapture}.
	 * @param ctx the parse tree
	 */
	void enterInitcapture(NGCParser.InitcaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#initcapture}.
	 * @param ctx the parse tree
	 */
	void exitInitcapture(NGCParser.InitcaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#lambdadeclarator}.
	 * @param ctx the parse tree
	 */
	void enterLambdadeclarator(NGCParser.LambdadeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#lambdadeclarator}.
	 * @param ctx the parse tree
	 */
	void exitLambdadeclarator(NGCParser.LambdadeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#postfixexpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixexpression(NGCParser.PostfixexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#postfixexpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixexpression(NGCParser.PostfixexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#expressionlist}.
	 * @param ctx the parse tree
	 */
	void enterExpressionlist(NGCParser.ExpressionlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#expressionlist}.
	 * @param ctx the parse tree
	 */
	void exitExpressionlist(NGCParser.ExpressionlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#pseudodestructorname}.
	 * @param ctx the parse tree
	 */
	void enterPseudodestructorname(NGCParser.PseudodestructornameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#pseudodestructorname}.
	 * @param ctx the parse tree
	 */
	void exitPseudodestructorname(NGCParser.PseudodestructornameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#unaryexpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryexpression(NGCParser.UnaryexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#unaryexpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryexpression(NGCParser.UnaryexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#unaryoperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryoperator(NGCParser.UnaryoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#unaryoperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryoperator(NGCParser.UnaryoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#newexpression}.
	 * @param ctx the parse tree
	 */
	void enterNewexpression(NGCParser.NewexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#newexpression}.
	 * @param ctx the parse tree
	 */
	void exitNewexpression(NGCParser.NewexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#newplacement}.
	 * @param ctx the parse tree
	 */
	void enterNewplacement(NGCParser.NewplacementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#newplacement}.
	 * @param ctx the parse tree
	 */
	void exitNewplacement(NGCParser.NewplacementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#newtypeid}.
	 * @param ctx the parse tree
	 */
	void enterNewtypeid(NGCParser.NewtypeidContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#newtypeid}.
	 * @param ctx the parse tree
	 */
	void exitNewtypeid(NGCParser.NewtypeidContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#newdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNewdeclarator(NGCParser.NewdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#newdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNewdeclarator(NGCParser.NewdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#noptrnewdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoptrnewdeclarator(NGCParser.NoptrnewdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#noptrnewdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoptrnewdeclarator(NGCParser.NoptrnewdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#newinitializer}.
	 * @param ctx the parse tree
	 */
	void enterNewinitializer(NGCParser.NewinitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#newinitializer}.
	 * @param ctx the parse tree
	 */
	void exitNewinitializer(NGCParser.NewinitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#deleteexpression}.
	 * @param ctx the parse tree
	 */
	void enterDeleteexpression(NGCParser.DeleteexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#deleteexpression}.
	 * @param ctx the parse tree
	 */
	void exitDeleteexpression(NGCParser.DeleteexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#noexceptexpression}.
	 * @param ctx the parse tree
	 */
	void enterNoexceptexpression(NGCParser.NoexceptexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#noexceptexpression}.
	 * @param ctx the parse tree
	 */
	void exitNoexceptexpression(NGCParser.NoexceptexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#castexpression}.
	 * @param ctx the parse tree
	 */
	void enterCastexpression(NGCParser.CastexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#castexpression}.
	 * @param ctx the parse tree
	 */
	void exitCastexpression(NGCParser.CastexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#pmexpression}.
	 * @param ctx the parse tree
	 */
	void enterPmexpression(NGCParser.PmexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#pmexpression}.
	 * @param ctx the parse tree
	 */
	void exitPmexpression(NGCParser.PmexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#multiplicativeexpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeexpression(NGCParser.MultiplicativeexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#multiplicativeexpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeexpression(NGCParser.MultiplicativeexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#additiveexpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveexpression(NGCParser.AdditiveexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#additiveexpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveexpression(NGCParser.AdditiveexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#shiftexpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftexpression(NGCParser.ShiftexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#shiftexpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftexpression(NGCParser.ShiftexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#relationalexpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalexpression(NGCParser.RelationalexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#relationalexpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalexpression(NGCParser.RelationalexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#equalityexpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityexpression(NGCParser.EqualityexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#equalityexpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityexpression(NGCParser.EqualityexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#andexpression}.
	 * @param ctx the parse tree
	 */
	void enterAndexpression(NGCParser.AndexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#andexpression}.
	 * @param ctx the parse tree
	 */
	void exitAndexpression(NGCParser.AndexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#exclusiveorexpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveorexpression(NGCParser.ExclusiveorexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#exclusiveorexpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveorexpression(NGCParser.ExclusiveorexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#inclusiveorexpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveorexpression(NGCParser.InclusiveorexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#inclusiveorexpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveorexpression(NGCParser.InclusiveorexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#logicalandexpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalandexpression(NGCParser.LogicalandexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#logicalandexpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalandexpression(NGCParser.LogicalandexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#logicalorexpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalorexpression(NGCParser.LogicalorexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#logicalorexpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalorexpression(NGCParser.LogicalorexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#conditionalexpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalexpression(NGCParser.ConditionalexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#conditionalexpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalexpression(NGCParser.ConditionalexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#assignmentexpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentexpression(NGCParser.AssignmentexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#assignmentexpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentexpression(NGCParser.AssignmentexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#assignmentoperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentoperator(NGCParser.AssignmentoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#assignmentoperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentoperator(NGCParser.AssignmentoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(NGCParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(NGCParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#constantexpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantexpression(NGCParser.ConstantexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#constantexpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantexpression(NGCParser.ConstantexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(NGCParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(NGCParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#labeledstatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledstatement(NGCParser.LabeledstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#labeledstatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledstatement(NGCParser.LabeledstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionstatement(NGCParser.ExpressionstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionstatement(NGCParser.ExpressionstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#compoundstatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundstatement(NGCParser.CompoundstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#compoundstatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundstatement(NGCParser.CompoundstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#statementseq}.
	 * @param ctx the parse tree
	 */
	void enterStatementseq(NGCParser.StatementseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#statementseq}.
	 * @param ctx the parse tree
	 */
	void exitStatementseq(NGCParser.StatementseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#selectionstatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionstatement(NGCParser.SelectionstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#selectionstatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionstatement(NGCParser.SelectionstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#ngc_selectionstatement}.
	 * @param ctx the parse tree
	 */
	void enterNgc_selectionstatement(NGCParser.Ngc_selectionstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#ngc_selectionstatement}.
	 * @param ctx the parse tree
	 */
	void exitNgc_selectionstatement(NGCParser.Ngc_selectionstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(NGCParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(NGCParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#iterationstatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationstatement(NGCParser.IterationstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#iterationstatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationstatement(NGCParser.IterationstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#forinitstatement}.
	 * @param ctx the parse tree
	 */
	void enterForinitstatement(NGCParser.ForinitstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#forinitstatement}.
	 * @param ctx the parse tree
	 */
	void exitForinitstatement(NGCParser.ForinitstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#forrangedeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForrangedeclaration(NGCParser.ForrangedeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#forrangedeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForrangedeclaration(NGCParser.ForrangedeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#forrangeinitializer}.
	 * @param ctx the parse tree
	 */
	void enterForrangeinitializer(NGCParser.ForrangeinitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#forrangeinitializer}.
	 * @param ctx the parse tree
	 */
	void exitForrangeinitializer(NGCParser.ForrangeinitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#jumpstatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpstatement(NGCParser.JumpstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#jumpstatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpstatement(NGCParser.JumpstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#declarationstatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationstatement(NGCParser.DeclarationstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#declarationstatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationstatement(NGCParser.DeclarationstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#declarationseq}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationseq(NGCParser.DeclarationseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#declarationseq}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationseq(NGCParser.DeclarationseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(NGCParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(NGCParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#blockdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBlockdeclaration(NGCParser.BlockdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#blockdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBlockdeclaration(NGCParser.BlockdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#aliasdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAliasdeclaration(NGCParser.AliasdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#aliasdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAliasdeclaration(NGCParser.AliasdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#simpledeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSimpledeclaration(NGCParser.SimpledeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#simpledeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSimpledeclaration(NGCParser.SimpledeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#static_assertdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStatic_assertdeclaration(NGCParser.Static_assertdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#static_assertdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStatic_assertdeclaration(NGCParser.Static_assertdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#emptydeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEmptydeclaration(NGCParser.EmptydeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#emptydeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEmptydeclaration(NGCParser.EmptydeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#attributedeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAttributedeclaration(NGCParser.AttributedeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#attributedeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAttributedeclaration(NGCParser.AttributedeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#declspecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclspecifier(NGCParser.DeclspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#declspecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclspecifier(NGCParser.DeclspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#declspecifierseq}.
	 * @param ctx the parse tree
	 */
	void enterDeclspecifierseq(NGCParser.DeclspecifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#declspecifierseq}.
	 * @param ctx the parse tree
	 */
	void exitDeclspecifierseq(NGCParser.DeclspecifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#storageclassspecifier}.
	 * @param ctx the parse tree
	 */
	void enterStorageclassspecifier(NGCParser.StorageclassspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#storageclassspecifier}.
	 * @param ctx the parse tree
	 */
	void exitStorageclassspecifier(NGCParser.StorageclassspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#functionspecifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionspecifier(NGCParser.FunctionspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#functionspecifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionspecifier(NGCParser.FunctionspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#typedefname}.
	 * @param ctx the parse tree
	 */
	void enterTypedefname(NGCParser.TypedefnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#typedefname}.
	 * @param ctx the parse tree
	 */
	void exitTypedefname(NGCParser.TypedefnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#typespecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypespecifier(NGCParser.TypespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#typespecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypespecifier(NGCParser.TypespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#trailingtypespecifier}.
	 * @param ctx the parse tree
	 */
	void enterTrailingtypespecifier(NGCParser.TrailingtypespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#trailingtypespecifier}.
	 * @param ctx the parse tree
	 */
	void exitTrailingtypespecifier(NGCParser.TrailingtypespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#typespecifierseq}.
	 * @param ctx the parse tree
	 */
	void enterTypespecifierseq(NGCParser.TypespecifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#typespecifierseq}.
	 * @param ctx the parse tree
	 */
	void exitTypespecifierseq(NGCParser.TypespecifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#trailingtypespecifierseq}.
	 * @param ctx the parse tree
	 */
	void enterTrailingtypespecifierseq(NGCParser.TrailingtypespecifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#trailingtypespecifierseq}.
	 * @param ctx the parse tree
	 */
	void exitTrailingtypespecifierseq(NGCParser.TrailingtypespecifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#simpletypespecifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpletypespecifier(NGCParser.SimpletypespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#simpletypespecifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpletypespecifier(NGCParser.SimpletypespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#typename}.
	 * @param ctx the parse tree
	 */
	void enterTypename(NGCParser.TypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#typename}.
	 * @param ctx the parse tree
	 */
	void exitTypename(NGCParser.TypenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#decltypespecifier}.
	 * @param ctx the parse tree
	 */
	void enterDecltypespecifier(NGCParser.DecltypespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#decltypespecifier}.
	 * @param ctx the parse tree
	 */
	void exitDecltypespecifier(NGCParser.DecltypespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#elaboratedtypespecifier}.
	 * @param ctx the parse tree
	 */
	void enterElaboratedtypespecifier(NGCParser.ElaboratedtypespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#elaboratedtypespecifier}.
	 * @param ctx the parse tree
	 */
	void exitElaboratedtypespecifier(NGCParser.ElaboratedtypespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#enumname}.
	 * @param ctx the parse tree
	 */
	void enterEnumname(NGCParser.EnumnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#enumname}.
	 * @param ctx the parse tree
	 */
	void exitEnumname(NGCParser.EnumnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#enumspecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumspecifier(NGCParser.EnumspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#enumspecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumspecifier(NGCParser.EnumspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#enumhead}.
	 * @param ctx the parse tree
	 */
	void enterEnumhead(NGCParser.EnumheadContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#enumhead}.
	 * @param ctx the parse tree
	 */
	void exitEnumhead(NGCParser.EnumheadContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#opaqueenumdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterOpaqueenumdeclaration(NGCParser.OpaqueenumdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#opaqueenumdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitOpaqueenumdeclaration(NGCParser.OpaqueenumdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#enumkey}.
	 * @param ctx the parse tree
	 */
	void enterEnumkey(NGCParser.EnumkeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#enumkey}.
	 * @param ctx the parse tree
	 */
	void exitEnumkey(NGCParser.EnumkeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#enumbase}.
	 * @param ctx the parse tree
	 */
	void enterEnumbase(NGCParser.EnumbaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#enumbase}.
	 * @param ctx the parse tree
	 */
	void exitEnumbase(NGCParser.EnumbaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#enumeratorlist}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorlist(NGCParser.EnumeratorlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#enumeratorlist}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorlist(NGCParser.EnumeratorlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#enumeratordefinition}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratordefinition(NGCParser.EnumeratordefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#enumeratordefinition}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratordefinition(NGCParser.EnumeratordefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(NGCParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(NGCParser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#namespacename}.
	 * @param ctx the parse tree
	 */
	void enterNamespacename(NGCParser.NamespacenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#namespacename}.
	 * @param ctx the parse tree
	 */
	void exitNamespacename(NGCParser.NamespacenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#originalnamespacename}.
	 * @param ctx the parse tree
	 */
	void enterOriginalnamespacename(NGCParser.OriginalnamespacenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#originalnamespacename}.
	 * @param ctx the parse tree
	 */
	void exitOriginalnamespacename(NGCParser.OriginalnamespacenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#namespacedefinition}.
	 * @param ctx the parse tree
	 */
	void enterNamespacedefinition(NGCParser.NamespacedefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#namespacedefinition}.
	 * @param ctx the parse tree
	 */
	void exitNamespacedefinition(NGCParser.NamespacedefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#namednamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void enterNamednamespacedefinition(NGCParser.NamednamespacedefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#namednamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void exitNamednamespacedefinition(NGCParser.NamednamespacedefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#originalnamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void enterOriginalnamespacedefinition(NGCParser.OriginalnamespacedefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#originalnamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void exitOriginalnamespacedefinition(NGCParser.OriginalnamespacedefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#extensionnamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void enterExtensionnamespacedefinition(NGCParser.ExtensionnamespacedefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#extensionnamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void exitExtensionnamespacedefinition(NGCParser.ExtensionnamespacedefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#unnamednamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void enterUnnamednamespacedefinition(NGCParser.UnnamednamespacedefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#unnamednamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void exitUnnamednamespacedefinition(NGCParser.UnnamednamespacedefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#namespacebody}.
	 * @param ctx the parse tree
	 */
	void enterNamespacebody(NGCParser.NamespacebodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#namespacebody}.
	 * @param ctx the parse tree
	 */
	void exitNamespacebody(NGCParser.NamespacebodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#namespacealias}.
	 * @param ctx the parse tree
	 */
	void enterNamespacealias(NGCParser.NamespacealiasContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#namespacealias}.
	 * @param ctx the parse tree
	 */
	void exitNamespacealias(NGCParser.NamespacealiasContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#namespacealiasdefinition}.
	 * @param ctx the parse tree
	 */
	void enterNamespacealiasdefinition(NGCParser.NamespacealiasdefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#namespacealiasdefinition}.
	 * @param ctx the parse tree
	 */
	void exitNamespacealiasdefinition(NGCParser.NamespacealiasdefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#qualifiednamespacespecifier}.
	 * @param ctx the parse tree
	 */
	void enterQualifiednamespacespecifier(NGCParser.QualifiednamespacespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#qualifiednamespacespecifier}.
	 * @param ctx the parse tree
	 */
	void exitQualifiednamespacespecifier(NGCParser.QualifiednamespacespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#usingdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUsingdeclaration(NGCParser.UsingdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#usingdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUsingdeclaration(NGCParser.UsingdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#usingdirective}.
	 * @param ctx the parse tree
	 */
	void enterUsingdirective(NGCParser.UsingdirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#usingdirective}.
	 * @param ctx the parse tree
	 */
	void exitUsingdirective(NGCParser.UsingdirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#asmdefinition}.
	 * @param ctx the parse tree
	 */
	void enterAsmdefinition(NGCParser.AsmdefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#asmdefinition}.
	 * @param ctx the parse tree
	 */
	void exitAsmdefinition(NGCParser.AsmdefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#linkagespecification}.
	 * @param ctx the parse tree
	 */
	void enterLinkagespecification(NGCParser.LinkagespecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#linkagespecification}.
	 * @param ctx the parse tree
	 */
	void exitLinkagespecification(NGCParser.LinkagespecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#attributespecifierseq}.
	 * @param ctx the parse tree
	 */
	void enterAttributespecifierseq(NGCParser.AttributespecifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#attributespecifierseq}.
	 * @param ctx the parse tree
	 */
	void exitAttributespecifierseq(NGCParser.AttributespecifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#attributespecifier}.
	 * @param ctx the parse tree
	 */
	void enterAttributespecifier(NGCParser.AttributespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#attributespecifier}.
	 * @param ctx the parse tree
	 */
	void exitAttributespecifier(NGCParser.AttributespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#alignmentspecifier}.
	 * @param ctx the parse tree
	 */
	void enterAlignmentspecifier(NGCParser.AlignmentspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#alignmentspecifier}.
	 * @param ctx the parse tree
	 */
	void exitAlignmentspecifier(NGCParser.AlignmentspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#attributelist}.
	 * @param ctx the parse tree
	 */
	void enterAttributelist(NGCParser.AttributelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#attributelist}.
	 * @param ctx the parse tree
	 */
	void exitAttributelist(NGCParser.AttributelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(NGCParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(NGCParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#attributetoken}.
	 * @param ctx the parse tree
	 */
	void enterAttributetoken(NGCParser.AttributetokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#attributetoken}.
	 * @param ctx the parse tree
	 */
	void exitAttributetoken(NGCParser.AttributetokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#attributescopedtoken}.
	 * @param ctx the parse tree
	 */
	void enterAttributescopedtoken(NGCParser.AttributescopedtokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#attributescopedtoken}.
	 * @param ctx the parse tree
	 */
	void exitAttributescopedtoken(NGCParser.AttributescopedtokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#attributenamespace}.
	 * @param ctx the parse tree
	 */
	void enterAttributenamespace(NGCParser.AttributenamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#attributenamespace}.
	 * @param ctx the parse tree
	 */
	void exitAttributenamespace(NGCParser.AttributenamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#attributeargumentclause}.
	 * @param ctx the parse tree
	 */
	void enterAttributeargumentclause(NGCParser.AttributeargumentclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#attributeargumentclause}.
	 * @param ctx the parse tree
	 */
	void exitAttributeargumentclause(NGCParser.AttributeargumentclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#balancedtokenseq}.
	 * @param ctx the parse tree
	 */
	void enterBalancedtokenseq(NGCParser.BalancedtokenseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#balancedtokenseq}.
	 * @param ctx the parse tree
	 */
	void exitBalancedtokenseq(NGCParser.BalancedtokenseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#balancedtoken}.
	 * @param ctx the parse tree
	 */
	void enterBalancedtoken(NGCParser.BalancedtokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#balancedtoken}.
	 * @param ctx the parse tree
	 */
	void exitBalancedtoken(NGCParser.BalancedtokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#initdeclaratorlist}.
	 * @param ctx the parse tree
	 */
	void enterInitdeclaratorlist(NGCParser.InitdeclaratorlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#initdeclaratorlist}.
	 * @param ctx the parse tree
	 */
	void exitInitdeclaratorlist(NGCParser.InitdeclaratorlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#initdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitdeclarator(NGCParser.InitdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#initdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitdeclarator(NGCParser.InitdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(NGCParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(NGCParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#ptrdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterPtrdeclarator(NGCParser.PtrdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#ptrdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitPtrdeclarator(NGCParser.PtrdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#noptrdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoptrdeclarator(NGCParser.NoptrdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#noptrdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoptrdeclarator(NGCParser.NoptrdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#parametersandqualifiers}.
	 * @param ctx the parse tree
	 */
	void enterParametersandqualifiers(NGCParser.ParametersandqualifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#parametersandqualifiers}.
	 * @param ctx the parse tree
	 */
	void exitParametersandqualifiers(NGCParser.ParametersandqualifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#trailingreturntype}.
	 * @param ctx the parse tree
	 */
	void enterTrailingreturntype(NGCParser.TrailingreturntypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#trailingreturntype}.
	 * @param ctx the parse tree
	 */
	void exitTrailingreturntype(NGCParser.TrailingreturntypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#ptroperator}.
	 * @param ctx the parse tree
	 */
	void enterPtroperator(NGCParser.PtroperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#ptroperator}.
	 * @param ctx the parse tree
	 */
	void exitPtroperator(NGCParser.PtroperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#cvqualifierseq}.
	 * @param ctx the parse tree
	 */
	void enterCvqualifierseq(NGCParser.CvqualifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#cvqualifierseq}.
	 * @param ctx the parse tree
	 */
	void exitCvqualifierseq(NGCParser.CvqualifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#cvqualifier}.
	 * @param ctx the parse tree
	 */
	void enterCvqualifier(NGCParser.CvqualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#cvqualifier}.
	 * @param ctx the parse tree
	 */
	void exitCvqualifier(NGCParser.CvqualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#refqualifier}.
	 * @param ctx the parse tree
	 */
	void enterRefqualifier(NGCParser.RefqualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#refqualifier}.
	 * @param ctx the parse tree
	 */
	void exitRefqualifier(NGCParser.RefqualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#declaratorid}.
	 * @param ctx the parse tree
	 */
	void enterDeclaratorid(NGCParser.DeclaratoridContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#declaratorid}.
	 * @param ctx the parse tree
	 */
	void exitDeclaratorid(NGCParser.DeclaratoridContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#typeid}.
	 * @param ctx the parse tree
	 */
	void enterTypeid(NGCParser.TypeidContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#typeid}.
	 * @param ctx the parse tree
	 */
	void exitTypeid(NGCParser.TypeidContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#abstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractdeclarator(NGCParser.AbstractdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#abstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractdeclarator(NGCParser.AbstractdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#ptrabstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterPtrabstractdeclarator(NGCParser.PtrabstractdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#ptrabstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitPtrabstractdeclarator(NGCParser.PtrabstractdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#noptrabstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoptrabstractdeclarator(NGCParser.NoptrabstractdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#noptrabstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoptrabstractdeclarator(NGCParser.NoptrabstractdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#abstractpackdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractpackdeclarator(NGCParser.AbstractpackdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#abstractpackdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractpackdeclarator(NGCParser.AbstractpackdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#noptrabstractpackdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoptrabstractpackdeclarator(NGCParser.NoptrabstractpackdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#noptrabstractpackdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoptrabstractpackdeclarator(NGCParser.NoptrabstractpackdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#parameterdeclarationclause}.
	 * @param ctx the parse tree
	 */
	void enterParameterdeclarationclause(NGCParser.ParameterdeclarationclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#parameterdeclarationclause}.
	 * @param ctx the parse tree
	 */
	void exitParameterdeclarationclause(NGCParser.ParameterdeclarationclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#parameterdeclarationlist}.
	 * @param ctx the parse tree
	 */
	void enterParameterdeclarationlist(NGCParser.ParameterdeclarationlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#parameterdeclarationlist}.
	 * @param ctx the parse tree
	 */
	void exitParameterdeclarationlist(NGCParser.ParameterdeclarationlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#parameterdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterdeclaration(NGCParser.ParameterdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#parameterdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterdeclaration(NGCParser.ParameterdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#functiondefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondefinition(NGCParser.FunctiondefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#functiondefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondefinition(NGCParser.FunctiondefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#functionbody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionbody(NGCParser.FunctionbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#functionbody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionbody(NGCParser.FunctionbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(NGCParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(NGCParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#braceorequalinitializer}.
	 * @param ctx the parse tree
	 */
	void enterBraceorequalinitializer(NGCParser.BraceorequalinitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#braceorequalinitializer}.
	 * @param ctx the parse tree
	 */
	void exitBraceorequalinitializer(NGCParser.BraceorequalinitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#initializerclause}.
	 * @param ctx the parse tree
	 */
	void enterInitializerclause(NGCParser.InitializerclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#initializerclause}.
	 * @param ctx the parse tree
	 */
	void exitInitializerclause(NGCParser.InitializerclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#initializerlist}.
	 * @param ctx the parse tree
	 */
	void enterInitializerlist(NGCParser.InitializerlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#initializerlist}.
	 * @param ctx the parse tree
	 */
	void exitInitializerlist(NGCParser.InitializerlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#bracedinitlist}.
	 * @param ctx the parse tree
	 */
	void enterBracedinitlist(NGCParser.BracedinitlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#bracedinitlist}.
	 * @param ctx the parse tree
	 */
	void exitBracedinitlist(NGCParser.BracedinitlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#classname}.
	 * @param ctx the parse tree
	 */
	void enterClassname(NGCParser.ClassnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#classname}.
	 * @param ctx the parse tree
	 */
	void exitClassname(NGCParser.ClassnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#classspecifier}.
	 * @param ctx the parse tree
	 */
	void enterClassspecifier(NGCParser.ClassspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#classspecifier}.
	 * @param ctx the parse tree
	 */
	void exitClassspecifier(NGCParser.ClassspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#classhead}.
	 * @param ctx the parse tree
	 */
	void enterClasshead(NGCParser.ClassheadContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#classhead}.
	 * @param ctx the parse tree
	 */
	void exitClasshead(NGCParser.ClassheadContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#classheadname}.
	 * @param ctx the parse tree
	 */
	void enterClassheadname(NGCParser.ClassheadnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#classheadname}.
	 * @param ctx the parse tree
	 */
	void exitClassheadname(NGCParser.ClassheadnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#classvirtspecifier}.
	 * @param ctx the parse tree
	 */
	void enterClassvirtspecifier(NGCParser.ClassvirtspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#classvirtspecifier}.
	 * @param ctx the parse tree
	 */
	void exitClassvirtspecifier(NGCParser.ClassvirtspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#classkey}.
	 * @param ctx the parse tree
	 */
	void enterClasskey(NGCParser.ClasskeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#classkey}.
	 * @param ctx the parse tree
	 */
	void exitClasskey(NGCParser.ClasskeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#memberspecification}.
	 * @param ctx the parse tree
	 */
	void enterMemberspecification(NGCParser.MemberspecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#memberspecification}.
	 * @param ctx the parse tree
	 */
	void exitMemberspecification(NGCParser.MemberspecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#memberdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberdeclaration(NGCParser.MemberdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#memberdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberdeclaration(NGCParser.MemberdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#memberdeclaratorlist}.
	 * @param ctx the parse tree
	 */
	void enterMemberdeclaratorlist(NGCParser.MemberdeclaratorlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#memberdeclaratorlist}.
	 * @param ctx the parse tree
	 */
	void exitMemberdeclaratorlist(NGCParser.MemberdeclaratorlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#memberdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMemberdeclarator(NGCParser.MemberdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#memberdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMemberdeclarator(NGCParser.MemberdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#virtspecifierseq}.
	 * @param ctx the parse tree
	 */
	void enterVirtspecifierseq(NGCParser.VirtspecifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#virtspecifierseq}.
	 * @param ctx the parse tree
	 */
	void exitVirtspecifierseq(NGCParser.VirtspecifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#virtspecifier}.
	 * @param ctx the parse tree
	 */
	void enterVirtspecifier(NGCParser.VirtspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#virtspecifier}.
	 * @param ctx the parse tree
	 */
	void exitVirtspecifier(NGCParser.VirtspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#purespecifier}.
	 * @param ctx the parse tree
	 */
	void enterPurespecifier(NGCParser.PurespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#purespecifier}.
	 * @param ctx the parse tree
	 */
	void exitPurespecifier(NGCParser.PurespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#baseclause}.
	 * @param ctx the parse tree
	 */
	void enterBaseclause(NGCParser.BaseclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#baseclause}.
	 * @param ctx the parse tree
	 */
	void exitBaseclause(NGCParser.BaseclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#basespecifierlist}.
	 * @param ctx the parse tree
	 */
	void enterBasespecifierlist(NGCParser.BasespecifierlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#basespecifierlist}.
	 * @param ctx the parse tree
	 */
	void exitBasespecifierlist(NGCParser.BasespecifierlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#basespecifier}.
	 * @param ctx the parse tree
	 */
	void enterBasespecifier(NGCParser.BasespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#basespecifier}.
	 * @param ctx the parse tree
	 */
	void exitBasespecifier(NGCParser.BasespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#classordecltype}.
	 * @param ctx the parse tree
	 */
	void enterClassordecltype(NGCParser.ClassordecltypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#classordecltype}.
	 * @param ctx the parse tree
	 */
	void exitClassordecltype(NGCParser.ClassordecltypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#basetypespecifier}.
	 * @param ctx the parse tree
	 */
	void enterBasetypespecifier(NGCParser.BasetypespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#basetypespecifier}.
	 * @param ctx the parse tree
	 */
	void exitBasetypespecifier(NGCParser.BasetypespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#accessspecifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessspecifier(NGCParser.AccessspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#accessspecifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessspecifier(NGCParser.AccessspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#conversionfunctionid}.
	 * @param ctx the parse tree
	 */
	void enterConversionfunctionid(NGCParser.ConversionfunctionidContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#conversionfunctionid}.
	 * @param ctx the parse tree
	 */
	void exitConversionfunctionid(NGCParser.ConversionfunctionidContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#conversiontypeid}.
	 * @param ctx the parse tree
	 */
	void enterConversiontypeid(NGCParser.ConversiontypeidContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#conversiontypeid}.
	 * @param ctx the parse tree
	 */
	void exitConversiontypeid(NGCParser.ConversiontypeidContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#conversiondeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConversiondeclarator(NGCParser.ConversiondeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#conversiondeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConversiondeclarator(NGCParser.ConversiondeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#ctorinitializer}.
	 * @param ctx the parse tree
	 */
	void enterCtorinitializer(NGCParser.CtorinitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#ctorinitializer}.
	 * @param ctx the parse tree
	 */
	void exitCtorinitializer(NGCParser.CtorinitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#meminitializerlist}.
	 * @param ctx the parse tree
	 */
	void enterMeminitializerlist(NGCParser.MeminitializerlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#meminitializerlist}.
	 * @param ctx the parse tree
	 */
	void exitMeminitializerlist(NGCParser.MeminitializerlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#meminitializer}.
	 * @param ctx the parse tree
	 */
	void enterMeminitializer(NGCParser.MeminitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#meminitializer}.
	 * @param ctx the parse tree
	 */
	void exitMeminitializer(NGCParser.MeminitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#meminitializerid}.
	 * @param ctx the parse tree
	 */
	void enterMeminitializerid(NGCParser.MeminitializeridContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#meminitializerid}.
	 * @param ctx the parse tree
	 */
	void exitMeminitializerid(NGCParser.MeminitializeridContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#operatorfunctionid}.
	 * @param ctx the parse tree
	 */
	void enterOperatorfunctionid(NGCParser.OperatorfunctionidContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#operatorfunctionid}.
	 * @param ctx the parse tree
	 */
	void exitOperatorfunctionid(NGCParser.OperatorfunctionidContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#literaloperatorid}.
	 * @param ctx the parse tree
	 */
	void enterLiteraloperatorid(NGCParser.LiteraloperatoridContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#literaloperatorid}.
	 * @param ctx the parse tree
	 */
	void exitLiteraloperatorid(NGCParser.LiteraloperatoridContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#templatedeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTemplatedeclaration(NGCParser.TemplatedeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#templatedeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTemplatedeclaration(NGCParser.TemplatedeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#templateparameterlist}.
	 * @param ctx the parse tree
	 */
	void enterTemplateparameterlist(NGCParser.TemplateparameterlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#templateparameterlist}.
	 * @param ctx the parse tree
	 */
	void exitTemplateparameterlist(NGCParser.TemplateparameterlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#templateparameter}.
	 * @param ctx the parse tree
	 */
	void enterTemplateparameter(NGCParser.TemplateparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#templateparameter}.
	 * @param ctx the parse tree
	 */
	void exitTemplateparameter(NGCParser.TemplateparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#typeparameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeparameter(NGCParser.TypeparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#typeparameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeparameter(NGCParser.TypeparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#simpletemplateid}.
	 * @param ctx the parse tree
	 */
	void enterSimpletemplateid(NGCParser.SimpletemplateidContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#simpletemplateid}.
	 * @param ctx the parse tree
	 */
	void exitSimpletemplateid(NGCParser.SimpletemplateidContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#templateid}.
	 * @param ctx the parse tree
	 */
	void enterTemplateid(NGCParser.TemplateidContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#templateid}.
	 * @param ctx the parse tree
	 */
	void exitTemplateid(NGCParser.TemplateidContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#templatename}.
	 * @param ctx the parse tree
	 */
	void enterTemplatename(NGCParser.TemplatenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#templatename}.
	 * @param ctx the parse tree
	 */
	void exitTemplatename(NGCParser.TemplatenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#templateargumentlist}.
	 * @param ctx the parse tree
	 */
	void enterTemplateargumentlist(NGCParser.TemplateargumentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#templateargumentlist}.
	 * @param ctx the parse tree
	 */
	void exitTemplateargumentlist(NGCParser.TemplateargumentlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#templateargument}.
	 * @param ctx the parse tree
	 */
	void enterTemplateargument(NGCParser.TemplateargumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#templateargument}.
	 * @param ctx the parse tree
	 */
	void exitTemplateargument(NGCParser.TemplateargumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#typenamespecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypenamespecifier(NGCParser.TypenamespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#typenamespecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypenamespecifier(NGCParser.TypenamespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#explicitinstantiation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitinstantiation(NGCParser.ExplicitinstantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#explicitinstantiation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitinstantiation(NGCParser.ExplicitinstantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#explicitspecialization}.
	 * @param ctx the parse tree
	 */
	void enterExplicitspecialization(NGCParser.ExplicitspecializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#explicitspecialization}.
	 * @param ctx the parse tree
	 */
	void exitExplicitspecialization(NGCParser.ExplicitspecializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#tryblock}.
	 * @param ctx the parse tree
	 */
	void enterTryblock(NGCParser.TryblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#tryblock}.
	 * @param ctx the parse tree
	 */
	void exitTryblock(NGCParser.TryblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#functiontryblock}.
	 * @param ctx the parse tree
	 */
	void enterFunctiontryblock(NGCParser.FunctiontryblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#functiontryblock}.
	 * @param ctx the parse tree
	 */
	void exitFunctiontryblock(NGCParser.FunctiontryblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#handlerseq}.
	 * @param ctx the parse tree
	 */
	void enterHandlerseq(NGCParser.HandlerseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#handlerseq}.
	 * @param ctx the parse tree
	 */
	void exitHandlerseq(NGCParser.HandlerseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#handler}.
	 * @param ctx the parse tree
	 */
	void enterHandler(NGCParser.HandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#handler}.
	 * @param ctx the parse tree
	 */
	void exitHandler(NGCParser.HandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#exceptiondeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExceptiondeclaration(NGCParser.ExceptiondeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#exceptiondeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExceptiondeclaration(NGCParser.ExceptiondeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#throwexpression}.
	 * @param ctx the parse tree
	 */
	void enterThrowexpression(NGCParser.ThrowexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#throwexpression}.
	 * @param ctx the parse tree
	 */
	void exitThrowexpression(NGCParser.ThrowexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#exceptionspecification}.
	 * @param ctx the parse tree
	 */
	void enterExceptionspecification(NGCParser.ExceptionspecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#exceptionspecification}.
	 * @param ctx the parse tree
	 */
	void exitExceptionspecification(NGCParser.ExceptionspecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#dynamicexceptionspecification}.
	 * @param ctx the parse tree
	 */
	void enterDynamicexceptionspecification(NGCParser.DynamicexceptionspecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#dynamicexceptionspecification}.
	 * @param ctx the parse tree
	 */
	void exitDynamicexceptionspecification(NGCParser.DynamicexceptionspecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#typeidlist}.
	 * @param ctx the parse tree
	 */
	void enterTypeidlist(NGCParser.TypeidlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#typeidlist}.
	 * @param ctx the parse tree
	 */
	void exitTypeidlist(NGCParser.TypeidlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#noexceptspecification}.
	 * @param ctx the parse tree
	 */
	void enterNoexceptspecification(NGCParser.NoexceptspecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#noexceptspecification}.
	 * @param ctx the parse tree
	 */
	void exitNoexceptspecification(NGCParser.NoexceptspecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#rightShift}.
	 * @param ctx the parse tree
	 */
	void enterRightShift(NGCParser.RightShiftContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#rightShift}.
	 * @param ctx the parse tree
	 */
	void exitRightShift(NGCParser.RightShiftContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#rightShiftAssign}.
	 * @param ctx the parse tree
	 */
	void enterRightShiftAssign(NGCParser.RightShiftAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#rightShiftAssign}.
	 * @param ctx the parse tree
	 */
	void exitRightShiftAssign(NGCParser.RightShiftAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(NGCParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(NGCParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(NGCParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(NGCParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#booleanliteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanliteral(NGCParser.BooleanliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#booleanliteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanliteral(NGCParser.BooleanliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#pointerliteral}.
	 * @param ctx the parse tree
	 */
	void enterPointerliteral(NGCParser.PointerliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#pointerliteral}.
	 * @param ctx the parse tree
	 */
	void exitPointerliteral(NGCParser.PointerliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link NGCParser#userdefinedliteral}.
	 * @param ctx the parse tree
	 */
	void enterUserdefinedliteral(NGCParser.UserdefinedliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link NGCParser#userdefinedliteral}.
	 * @param ctx the parse tree
	 */
	void exitUserdefinedliteral(NGCParser.UserdefinedliteralContext ctx);
}