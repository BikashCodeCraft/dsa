package com.bikash.dsa.striver.a2z.tree.medium;

import com.bikash.dsa.tree.wo.Tree;
import com.bikash.dsa.tree.wo.TreeNode;

public class DepthOfBT {

    public static void main(String[] args) {
        Tree bst = new Tree();
        bst.put(20);
        bst.put(15);
        bst.put(27);
        bst.put(30);
        bst.put(100);
        bst.put(29);
        bst.put(26);
        bst.put(22);
        bst.put(32);
        bst.put(2);
        bst.put(10);
        bst.put(33);
        bst.put(9);
        TreeNode root = bst.getRoot();
        System.out.println("Height of BST is : "+getDepth(root));
//        postOrder(root);
    }

    public static int getDepth(TreeNode root){
        if(root == null) return 0;
        int leftHeight = getDepth(root.getleftChild());
        int rightHeight = getDepth(root.getrightChild());

        return 1+Math.max(leftHeight,rightHeight);
    }

}
