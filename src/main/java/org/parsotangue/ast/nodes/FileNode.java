package org.parsotangue.ast.nodes;

import java.util.ArrayList;
import java.util.List;
import lombok.AccessLevel;
import lombok.Getter;

public class FileNode implements ASTNode{
    public void addChild(FunctionDeclNode node){
        children.add(node);
    }
    @Getter private ArrayList<FunctionDeclNode> children = new ArrayList<>();


}
