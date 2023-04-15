// Generated from org/parsotangue/ParsoTangue.g4 by ANTLR 4.9.3
package org.parsotangue;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParsoTangueParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParsoTangueVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(ParsoTangueParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(ParsoTangueParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#paramsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamsList(ParsoTangueParser.ParamsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(ParsoTangueParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ParsoTangueParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#voidType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidType(ParsoTangueParser.VoidTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ParsoTangueParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#inFuncDescription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInFuncDescription(ParsoTangueParser.InFuncDescriptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varExpr}
	 * labeled alternative in {@link ParsoTangueParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExpr(ParsoTangueParser.VarExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code infixExpr}
	 * labeled alternative in {@link ParsoTangueParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixExpr(ParsoTangueParser.InfixExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link ParsoTangueParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(ParsoTangueParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link ParsoTangueParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpr(ParsoTangueParser.LiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallExpr}
	 * labeled alternative in {@link ParsoTangueParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpr(ParsoTangueParser.FunctionCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracketsExpr}
	 * labeled alternative in {@link ParsoTangueParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketsExpr(ParsoTangueParser.BracketsExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#argsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgsList(ParsoTangueParser.ArgsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ParsoTangueParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignOp}
	 * labeled alternative in {@link ParsoTangueParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignOp(ParsoTangueParser.AssignOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDeclOp}
	 * labeled alternative in {@link ParsoTangueParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclOp(ParsoTangueParser.VarDeclOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifOp}
	 * labeled alternative in {@link ParsoTangueParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfOp(ParsoTangueParser.IfOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockOp}
	 * labeled alternative in {@link ParsoTangueParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockOp(ParsoTangueParser.BlockOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code retOp}
	 * labeled alternative in {@link ParsoTangueParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetOp(ParsoTangueParser.RetOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#assignOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignOperator(ParsoTangueParser.AssignOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParsoTangueParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(ParsoTangueParser.VarDeclarationContext ctx);
}