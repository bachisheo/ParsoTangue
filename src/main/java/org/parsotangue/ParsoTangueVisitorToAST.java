package org.parsotangue;

import org.parsotangue.ast.nodes.*;
import org.parsotangue.ast.nodes.expr.*;
import org.parsotangue.ast.nodes.operators.*;

import java.util.ArrayList;

public class ParsoTangueVisitorToAST extends ParsoTangueBaseVisitor<ASTNode> {
    @Override
    public FileNode visitFile(ParsoTangueParser.FileContext ctx) {
        var fnode = new FileNode();
        ctx.functionDecl().stream()
                .map(this::visit)
                .forEach((node) -> fnode.addChild((FunctionDeclNode) node));
        return fnode;
    }

    @Override
    public VarDeclarationNode visitVarDeclaration(ParsoTangueParser.VarDeclarationContext ctx) {
        var type = visitType(ctx.type());
        var name = ctx.NAME().getText();
        var value = visit(ctx.val);
        return new VarDeclarationNode(type, name, value);
    }

    @Override
    public TypeNode visitType(ParsoTangueParser.TypeContext ctx) {
        return new TypeNode(ctx.getText());
    }

    @Override
    public TypeNode visitVoidType(ParsoTangueParser.VoidTypeContext ctx) {
        return new TypeNode(ctx.getText());
    }

    @Override
    public FunctionDeclNode visitFunctionDecl(ParsoTangueParser.FunctionDeclContext ctx) {
        var params = ctx.paramsList() == null ? new ArrayList<ParamNode>() :
                ctx.paramsList().param().stream()
                        .map(this::visitParam)
                        .toList();
        var type = ctx.type() == null? visitVoidType(ctx.voidType()) : visitType(ctx.type());
        return new FunctionDeclNode(
                type,
                ctx.NAME().getText(),
                params,
                visitBlock(ctx.block())
        );
    }
    @Override
    public ParamNode visitParam(ParsoTangueParser.ParamContext ctx) {
        return new ParamNode(visitType(ctx.type()), ctx.NAME().getText());
    }

    @Override
    public BlockNode visitBlock(ParsoTangueParser.BlockContext ctx) {
        var innerDescr = ctx.inFuncDescription();
        if (innerDescr == null){
            return new BlockNode(new ArrayList<>());
        }
        var contents = innerDescr.stream()
                .map((inner)->(DescriptionNode)visit(inner))
                .toList();

        return new BlockNode(contents);
    }

    @Override
    public IfOperatorNode visitIfOp(ParsoTangueParser.IfOpContext ctx) {
        var true_statement = (OperatorNode)visit(ctx.true_st);
        var false_statement = ctx.false_st == null ? null : (OperatorNode)visit(ctx.false_st);
        var cond = visitExpr(ctx.expr());

        return new IfOperatorNode(cond, true_statement, false_statement);
    }
    private ExprNode visitExpr(ParsoTangueParser.ExprContext ctx){
        return (ExprNode)visit(ctx);
    }

    @Override
    public AssignOpNode visitAssignOperator(ParsoTangueParser.AssignOperatorContext ctx){
        var name = ctx.NAME().getText();
        var value = ctx.expr() == null ? null : visitExpr(ctx.expr());
        return new AssignOpNode(name, value);
    }
    @Override
    public ReturnOpNode visitRetOp(ParsoTangueParser.RetOpContext ctx){
        var value = ctx.expr() == null ? null : visitExpr(ctx.expr());
        return new ReturnOpNode(value);
    }

    @Override
    public InfixExprNode visitInfixExpr(ParsoTangueParser.InfixExprContext ctx) {
        return new InfixExprNode(visitExpr(ctx.left),ctx.op.getText(), visitExpr(ctx.right));
    }

    @Override
    public PrefixExprNode visitUnaryExpr(ParsoTangueParser.UnaryExprContext ctx) {
        return new PrefixExprNode(ctx.op.getText(), visitExpr(ctx.expr()));
    }

    @Override
    public ExprNode visitBracketsExpr(ParsoTangueParser.BracketsExprContext ctx) {
        return visitExpr(ctx.expr());
    }

    @Override
    public FunctionCallExprNode visitFunctionCallExpr(ParsoTangueParser.FunctionCallExprContext ctx) {
        var name = ctx.NAME().getText();
        var args = (ctx.argsList() == null) ? new ArrayList<ExprNode>() :
                ctx.argsList().expr().stream()
                        .map(this::visitExpr).toList();
        return new FunctionCallExprNode(name, args);
    }

    @Override
    public VarExpr visitVarExpr(ParsoTangueParser.VarExprContext ctx) {
        return new VarExpr(ctx.getText());
    }

    @Override
    public ASTNode visitLiteral(ParsoTangueParser.LiteralContext ctx) {
        return new LiteralExpr(ctx.getText());
    }
}

