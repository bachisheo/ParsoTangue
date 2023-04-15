package org.parsotangue.ast.nodes.operators;

import org.parsotangue.ast.nodes.expr.ExprNode;

public class IfOperatorNode extends OperatorNode {
    public IfOperatorNode(ExprNode condition, OperatorNode statementTrue, OperatorNode statementFalse){
        this.condition = condition;
        this.statementTrue = statementTrue;
        this.statementFalse = statementFalse;
    }
    ExprNode condition;
    OperatorNode statementTrue, statementFalse;
}
