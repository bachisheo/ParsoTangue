package org.parsotangue.ast.nodes.operators;

import org.parsotangue.ast.nodes.DescriptionNode;

import java.util.List;

public class BlockNode extends OperatorNode {
    private List<DescriptionNode> contents;
    public BlockNode(List<DescriptionNode> contents){
        this.contents = contents;
    }
}
