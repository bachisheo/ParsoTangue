// Generated from org/parsotangue/ParsoTangue.g4 by ANTLR 4.9.3
package org.parsotangue;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParsoTangueParser}.
 */
public interface ParsoTangueListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(ParsoTangueParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(ParsoTangueParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(ParsoTangueParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(ParsoTangueParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#paramsList}.
	 * @param ctx the parse tree
	 */
	void enterParamsList(ParsoTangueParser.ParamsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#paramsList}.
	 * @param ctx the parse tree
	 */
	void exitParamsList(ParsoTangueParser.ParamsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(ParsoTangueParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(ParsoTangueParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ParsoTangueParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ParsoTangueParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#voidType}.
	 * @param ctx the parse tree
	 */
	void enterVoidType(ParsoTangueParser.VoidTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#voidType}.
	 * @param ctx the parse tree
	 */
	void exitVoidType(ParsoTangueParser.VoidTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ParsoTangueParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ParsoTangueParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#inFuncDescription}.
	 * @param ctx the parse tree
	 */
	void enterInFuncDescription(ParsoTangueParser.InFuncDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#inFuncDescription}.
	 * @param ctx the parse tree
	 */
	void exitInFuncDescription(ParsoTangueParser.InFuncDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varExpr}
	 * labeled alternative in {@link ParsoTangueParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVarExpr(ParsoTangueParser.VarExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varExpr}
	 * labeled alternative in {@link ParsoTangueParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVarExpr(ParsoTangueParser.VarExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code infixExpr}
	 * labeled alternative in {@link ParsoTangueParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInfixExpr(ParsoTangueParser.InfixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code infixExpr}
	 * labeled alternative in {@link ParsoTangueParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInfixExpr(ParsoTangueParser.InfixExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link ParsoTangueParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(ParsoTangueParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link ParsoTangueParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(ParsoTangueParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link ParsoTangueParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpr(ParsoTangueParser.LiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link ParsoTangueParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpr(ParsoTangueParser.LiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExpr}
	 * labeled alternative in {@link ParsoTangueParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpr(ParsoTangueParser.FunctionCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpr}
	 * labeled alternative in {@link ParsoTangueParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpr(ParsoTangueParser.FunctionCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketsExpr}
	 * labeled alternative in {@link ParsoTangueParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBracketsExpr(ParsoTangueParser.BracketsExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketsExpr}
	 * labeled alternative in {@link ParsoTangueParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBracketsExpr(ParsoTangueParser.BracketsExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#argsList}.
	 * @param ctx the parse tree
	 */
	void enterArgsList(ParsoTangueParser.ArgsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#argsList}.
	 * @param ctx the parse tree
	 */
	void exitArgsList(ParsoTangueParser.ArgsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ParsoTangueParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ParsoTangueParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignOp}
	 * labeled alternative in {@link ParsoTangueParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignOp(ParsoTangueParser.AssignOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignOp}
	 * labeled alternative in {@link ParsoTangueParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignOp(ParsoTangueParser.AssignOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDeclOp}
	 * labeled alternative in {@link ParsoTangueParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclOp(ParsoTangueParser.VarDeclOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDeclOp}
	 * labeled alternative in {@link ParsoTangueParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclOp(ParsoTangueParser.VarDeclOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifOp}
	 * labeled alternative in {@link ParsoTangueParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterIfOp(ParsoTangueParser.IfOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifOp}
	 * labeled alternative in {@link ParsoTangueParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitIfOp(ParsoTangueParser.IfOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockOp}
	 * labeled alternative in {@link ParsoTangueParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterBlockOp(ParsoTangueParser.BlockOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockOp}
	 * labeled alternative in {@link ParsoTangueParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitBlockOp(ParsoTangueParser.BlockOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code retOp}
	 * labeled alternative in {@link ParsoTangueParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterRetOp(ParsoTangueParser.RetOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code retOp}
	 * labeled alternative in {@link ParsoTangueParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitRetOp(ParsoTangueParser.RetOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#assignOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignOperator(ParsoTangueParser.AssignOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#assignOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignOperator(ParsoTangueParser.AssignOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParsoTangueParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(ParsoTangueParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParsoTangueParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(ParsoTangueParser.VarDeclarationContext ctx);
}