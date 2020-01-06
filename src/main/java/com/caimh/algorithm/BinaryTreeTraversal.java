package com.caimh.algorithm;

/**
 * Created by caimh on 2019/12/30.
 */
public class BinaryTreeTraversal {

    public static void main(String[] args) {
        TreeNode root = getTreeNode();
        //前序遍历
        System.out.println("==============前序遍历============");
        preOrderTraversal(root);
        //中序遍历
        System.out.println();
        System.out.println("==============中序遍历============");
        inOrderTraversal(root);
        //后序遍历
        System.out.println();
        System.out.println("==============后序遍历============");
        postOrderTraversal(root);
    }

    public static TreeNode getTreeNode(){
        TreeNode[] treeNodes = new TreeNode[10];
        for (int i = 0; i < treeNodes.length; i++) {
            treeNodes[i]=new TreeNode(i);
        }
        treeNodes[0].setLeft(treeNodes[1]);
        treeNodes[0].setRight(treeNodes[2]);
        treeNodes[1].setLeft(treeNodes[3]);
        treeNodes[1].setRight(treeNodes[4]);
        treeNodes[2].setLeft(treeNodes[5]);
        treeNodes[2].setRight(treeNodes[6]);
        treeNodes[3].setLeft(treeNodes[7]);
        treeNodes[3].setRight(treeNodes[8]);
        treeNodes[5].setLeft(treeNodes[9]);

        return treeNodes[0];

    }

    public static void preOrderTraversal(TreeNode root){
        if (root==null) return;
        System.out.print(root.getData());
        preOrderTraversal(root.getLeft());
        preOrderTraversal(root.getRight());
    }
    public static void inOrderTraversal(TreeNode root){
        if (root == null) return;
        inOrderTraversal(root.getLeft());
        System.out.print(root.getData());
        inOrderTraversal(root.getRight());
    }

    public static void postOrderTraversal(TreeNode root){
        if (root==null) return;
        postOrderTraversal(root.getLeft());
        postOrderTraversal(root.getRight());
        System.out.print(root.getData());
    }
}

class TreeNode{
    private int data;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
