package org.parsotangue.ast.nodes;

import lombok.Getter;
import org.parsotangue.ast.nodes.operators.BlockNode;

import java.util.List;
public class FunctionDeclNode implements ASTNode {
    private final String name;
    @Getter
    private final List<ParamNode> args;
    private final TypeNode retType;
    private final BlockNode inner;
    public FunctionDeclNode(TypeNode type, String name, List<ParamNode> args, BlockNode content){
        this.retType = type;
        this.name = name;
        this.args = args;
        this.inner = content;
    }

}
