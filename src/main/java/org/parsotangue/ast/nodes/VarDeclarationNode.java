package org.parsotangue.ast.nodes;

public class VarDeclarationNode implements DescriptionNode {
    public VarDeclarationNode(TypeNode type, String name, ASTNode value){
        this.type = type;
        this.name = name;
        this.value = value;
    }

    private final TypeNode type;
    private final String name;
    private final ASTNode value;

}
