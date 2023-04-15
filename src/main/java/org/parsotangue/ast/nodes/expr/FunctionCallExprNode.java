package org.parsotangue.ast.nodes.expr;

import org.parsotangue.ast.nodes.DescriptionNode;

import java.util.List;

public class FunctionCallExprNode extends ExprNode {
    private final String name;
    private final List<ExprNode> args;
    public FunctionCallExprNode(String name, List<ExprNode> args){
        this.name = name;
        this.args = args;
    }

}
