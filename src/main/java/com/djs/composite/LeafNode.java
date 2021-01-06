package com.djs.composite;

/**
 * 叶子节点
 */
public class LeafNode  extends Node{
    String content;

    public LeafNode(String content) {
        this.content = content;
    }

    @Override
    void p() {
        System.out.println(this.content);
    }
}
