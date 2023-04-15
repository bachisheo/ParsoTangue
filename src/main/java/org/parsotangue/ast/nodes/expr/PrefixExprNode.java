package org.parsotangue.ast.nodes.expr;

public class PrefixExprNode extends ExprNode{
    private final ExprNode expr;
    private final String op;
    public PrefixExprNode(String operation, ExprNode expr){
        this.expr = expr;
        op = operation;
    }

}
