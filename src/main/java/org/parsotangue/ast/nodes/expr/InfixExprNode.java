package org.parsotangue.ast.nodes.expr;

public class InfixExprNode extends ExprNode{
    private final ExprNode left, right;
    private final String op;
    public InfixExprNode(ExprNode left_operand, String operation,  ExprNode right_operand){
        left = left_operand;
        right = right_operand;
        op = operation;
    }

}
