package org.parsotangue.ast.nodes.operators;

import org.parsotangue.ast.nodes.ASTNode;

public class AssignOpNode extends OperatorNode {
    public AssignOpNode(String name, ASTNode value){
        this.name = name;
        this.value = value;
    }

    private final String name;
    private final ASTNode value;

}
