package org.parsotangue.ast.nodes.operators;

import org.parsotangue.ast.nodes.ASTNode;

public class ReturnOpNode extends OperatorNode {
    public ReturnOpNode(ASTNode value){
        this.value = value;
    }
    private final ASTNode value;
}
