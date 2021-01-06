package com.djs.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 枝干节点
 */
public class BranchNode extends Node {
   private List<Node> nodes=new ArrayList<>();
   private String name;

    public BranchNode(String name) {
        this.name = name;
    }

    @Override
    void p() {
        System.out.println(name);
    }

    public void add(Node n){

        nodes.add(n);
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
