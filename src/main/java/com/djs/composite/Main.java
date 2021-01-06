package com.djs.composite;


import java.util.List;

/**
 * 结构模式
 */
public class Main {


    public static void main(String[] args) {

        BranchNode root=new BranchNode("根节点");
        BranchNode node01=new BranchNode("node01");
        BranchNode node02=new BranchNode("node02");
        LeafNode leafNode01=new LeafNode("叶子01");
        LeafNode leafNode02=new LeafNode("叶子02");
        LeafNode leafNode03=new LeafNode("叶子03");


        root.add(node01);
        root.add(node02);
        node01.add(leafNode01);
        node01.add(leafNode02);
        root.add(leafNode03);

        tree(root);
    }

    private static void tree(Node root) {

        root.p();

        if(root instanceof BranchNode){
            List<Node> nodes = ((BranchNode)root).getNodes();
            for (Node node : nodes) {
                tree(node);
            }
        }

    }
}
