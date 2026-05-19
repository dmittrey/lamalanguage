// Generated from /workspace/language/src/main/java/com/oracle/truffle/lama/parser/Lama.g4 by ANTLR 4.13.2
package com.oracle.truffle.lama.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LamaParser}.
 */
public interface LamaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LamaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LamaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LamaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#topScope}.
	 * @param ctx the parse tree
	 */
	void enterTopScope(LamaParser.TopScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#topScope}.
	 * @param ctx the parse tree
	 */
	void exitTopScope(LamaParser.TopScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(LamaParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(LamaParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#scopeExpression}.
	 * @param ctx the parse tree
	 */
	void enterScopeExpression(LamaParser.ScopeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#scopeExpression}.
	 * @param ctx the parse tree
	 */
	void exitScopeExpression(LamaParser.ScopeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(LamaParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(LamaParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#varDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVarDefinition(LamaParser.VarDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#varDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVarDefinition(LamaParser.VarDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#varInit}.
	 * @param ctx the parse tree
	 */
	void enterVarInit(LamaParser.VarInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#varInit}.
	 * @param ctx the parse tree
	 */
	void exitVarInit(LamaParser.VarInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#funDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunDefinition(LamaParser.FunDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#funDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunDefinition(LamaParser.FunDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#infixDefinition}.
	 * @param ctx the parse tree
	 */
	void enterInfixDefinition(LamaParser.InfixDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#infixDefinition}.
	 * @param ctx the parse tree
	 */
	void exitInfixDefinition(LamaParser.InfixDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#patternList}.
	 * @param ctx the parse tree
	 */
	void enterPatternList(LamaParser.PatternListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#patternList}.
	 * @param ctx the parse tree
	 */
	void exitPatternList(LamaParser.PatternListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listPattern}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterListPattern(LamaParser.ListPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listPattern}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitListPattern(LamaParser.ListPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenPattern}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterParenPattern(LamaParser.ParenPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenPattern}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitParenPattern(LamaParser.ParenPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code truePattern}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterTruePattern(LamaParser.TruePatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code truePattern}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitTruePattern(LamaParser.TruePatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalPattern}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterDecimalPattern(LamaParser.DecimalPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalPattern}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitDecimalPattern(LamaParser.DecimalPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sharpStrPattern}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterSharpStrPattern(LamaParser.SharpStrPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sharpStrPattern}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitSharpStrPattern(LamaParser.SharpStrPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sexpPatternNoArgs}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterSexpPatternNoArgs(LamaParser.SexpPatternNoArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sexpPatternNoArgs}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitSexpPatternNoArgs(LamaParser.SexpPatternNoArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wildcardPattern}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterWildcardPattern(LamaParser.WildcardPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wildcardPattern}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitWildcardPattern(LamaParser.WildcardPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aliasPattern}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterAliasPattern(LamaParser.AliasPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasPattern}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitAliasPattern(LamaParser.AliasPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sharpSexpPattern}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterSharpSexpPattern(LamaParser.SharpSexpPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sharpSexpPattern}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitSharpSexpPattern(LamaParser.SharpSexpPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sharpFunPattern}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterSharpFunPattern(LamaParser.SharpFunPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sharpFunPattern}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitSharpFunPattern(LamaParser.SharpFunPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varPattern}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterVarPattern(LamaParser.VarPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varPattern}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitVarPattern(LamaParser.VarPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charPattern}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterCharPattern(LamaParser.CharPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charPattern}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitCharPattern(LamaParser.CharPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code consPattern}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterConsPattern(LamaParser.ConsPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code consPattern}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitConsPattern(LamaParser.ConsPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringPattern}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterStringPattern(LamaParser.StringPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringPattern}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitStringPattern(LamaParser.StringPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sharpBoxPattern}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterSharpBoxPattern(LamaParser.SharpBoxPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sharpBoxPattern}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitSharpBoxPattern(LamaParser.SharpBoxPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falsePattern}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterFalsePattern(LamaParser.FalsePatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falsePattern}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitFalsePattern(LamaParser.FalsePatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sharpValPattern}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterSharpValPattern(LamaParser.SharpValPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sharpValPattern}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitSharpValPattern(LamaParser.SharpValPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sharpArrayPattern}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterSharpArrayPattern(LamaParser.SharpArrayPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sharpArrayPattern}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitSharpArrayPattern(LamaParser.SharpArrayPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sexpPatternWithArgs}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterSexpPatternWithArgs(LamaParser.SexpPatternWithArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sexpPatternWithArgs}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitSexpPatternWithArgs(LamaParser.SexpPatternWithArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayPattern}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterArrayPattern(LamaParser.ArrayPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayPattern}
	 * labeled alternative in {@link LamaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitArrayPattern(LamaParser.ArrayPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LamaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LamaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#sequenceExpression}.
	 * @param ctx the parse tree
	 */
	void enterSequenceExpression(LamaParser.SequenceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#sequenceExpression}.
	 * @param ctx the parse tree
	 */
	void exitSequenceExpression(LamaParser.SequenceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#assignExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpression(LamaParser.AssignExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#assignExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpression(LamaParser.AssignExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpression(LamaParser.BinaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpression(LamaParser.BinaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOp(LamaParser.BinaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOp(LamaParser.BinaryOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#prefixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrefixExpression(LamaParser.PrefixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#prefixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrefixExpression(LamaParser.PrefixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callSuffix}
	 * labeled alternative in {@link LamaParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterCallSuffix(LamaParser.CallSuffixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callSuffix}
	 * labeled alternative in {@link LamaParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitCallSuffix(LamaParser.CallSuffixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dotSuffix}
	 * labeled alternative in {@link LamaParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterDotSuffix(LamaParser.DotSuffixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dotSuffix}
	 * labeled alternative in {@link LamaParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitDotSuffix(LamaParser.DotSuffixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code basePrimary}
	 * labeled alternative in {@link LamaParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterBasePrimary(LamaParser.BasePrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code basePrimary}
	 * labeled alternative in {@link LamaParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitBasePrimary(LamaParser.BasePrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indexSuffix}
	 * labeled alternative in {@link LamaParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterIndexSuffix(LamaParser.IndexSuffixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexSuffix}
	 * labeled alternative in {@link LamaParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitIndexSuffix(LamaParser.IndexSuffixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code litPrimary}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterLitPrimary(LamaParser.LitPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code litPrimary}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitLitPrimary(LamaParser.LitPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sexpPrimary}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterSexpPrimary(LamaParser.SexpPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sexpPrimary}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitSexpPrimary(LamaParser.SexpPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idPrimary}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterIdPrimary(LamaParser.IdPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idPrimary}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitIdPrimary(LamaParser.IdPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenPrimary}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterParenPrimary(LamaParser.ParenPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenPrimary}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitParenPrimary(LamaParser.ParenPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayPrimary}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayPrimary(LamaParser.ArrayPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayPrimary}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayPrimary(LamaParser.ArrayPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listPrimary}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterListPrimary(LamaParser.ListPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listPrimary}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitListPrimary(LamaParser.ListPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifPrimary}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterIfPrimary(LamaParser.IfPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifPrimary}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitIfPrimary(LamaParser.IfPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code letPrimary}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterLetPrimary(LamaParser.LetPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code letPrimary}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitLetPrimary(LamaParser.LetPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code casePrimary}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterCasePrimary(LamaParser.CasePrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code casePrimary}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitCasePrimary(LamaParser.CasePrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loopPrimary}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterLoopPrimary(LamaParser.LoopPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loopPrimary}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitLoopPrimary(LamaParser.LoopPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code skipPrimary}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterSkipPrimary(LamaParser.SkipPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code skipPrimary}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitSkipPrimary(LamaParser.SkipPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambdaPrimary}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterLambdaPrimary(LamaParser.LambdaPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambdaPrimary}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitLambdaPrimary(LamaParser.LambdaPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code etaPrimary}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterEtaPrimary(LamaParser.EtaPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code etaPrimary}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitEtaPrimary(LamaParser.EtaPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code infixIdPrimary}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterInfixIdPrimary(LamaParser.InfixIdPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code infixIdPrimary}
	 * labeled alternative in {@link LamaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitInfixIdPrimary(LamaParser.InfixIdPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#etaExpression}.
	 * @param ctx the parse tree
	 */
	void enterEtaExpression(LamaParser.EtaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#etaExpression}.
	 * @param ctx the parse tree
	 */
	void exitEtaExpression(LamaParser.EtaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(LamaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(LamaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(LamaParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(LamaParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(LamaParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(LamaParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void enterListLiteral(LamaParser.ListLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void exitListLiteral(LamaParser.ListLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#sexp}.
	 * @param ctx the parse tree
	 */
	void enterSexp(LamaParser.SexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#sexp}.
	 * @param ctx the parse tree
	 */
	void exitSexp(LamaParser.SexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void enterIfExpression(LamaParser.IfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void exitIfExpression(LamaParser.IfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#letExpression}.
	 * @param ctx the parse tree
	 */
	void enterLetExpression(LamaParser.LetExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#letExpression}.
	 * @param ctx the parse tree
	 */
	void exitLetExpression(LamaParser.LetExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpression(LamaParser.CaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpression(LamaParser.CaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#caseBranch}.
	 * @param ctx the parse tree
	 */
	void enterCaseBranch(LamaParser.CaseBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#caseBranch}.
	 * @param ctx the parse tree
	 */
	void exitCaseBranch(LamaParser.CaseBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#loopExpression}.
	 * @param ctx the parse tree
	 */
	void enterLoopExpression(LamaParser.LoopExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#loopExpression}.
	 * @param ctx the parse tree
	 */
	void exitLoopExpression(LamaParser.LoopExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(LamaParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(LamaParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#doWhileLoop}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileLoop(LamaParser.DoWhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#doWhileLoop}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileLoop(LamaParser.DoWhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(LamaParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(LamaParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(LamaParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(LamaParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#forStep}.
	 * @param ctx the parse tree
	 */
	void enterForStep(LamaParser.ForStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#forStep}.
	 * @param ctx the parse tree
	 */
	void exitForStep(LamaParser.ForStepContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(LamaParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(LamaParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamaParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(LamaParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamaParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(LamaParser.ArgumentListContext ctx);
}