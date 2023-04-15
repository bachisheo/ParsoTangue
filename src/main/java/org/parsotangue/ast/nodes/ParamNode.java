package org.parsotangue.ast.nodes;

public class ParamNode implements ASTNode {
    public ParamNode(TypeNode type, String name){
        this.type = type;
        this.name = name;
    }

    private final TypeNode type;
    private final String name;

}
