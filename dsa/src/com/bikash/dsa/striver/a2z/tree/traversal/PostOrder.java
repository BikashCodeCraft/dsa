package com.bikash.dsa.striver.a2z.tree.traversal;

import com.bikash.dsa.tree.wo.Tree;
import com.bikash.dsa.tree.wo.TreeNode;

public class PostOrder {

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
        postOrderTraversal(bst.getRoot());
    }

    //PostOrder Left-Right-Root
    private static void postOrderTraversal(TreeNode root) {
        if(root!=null){
            if (root.getleftChild() != null){
                postOrderTraversal(root.getleftChild());
            }
            if (root.getrightChild()!=null){
                postOrderTraversal(root.getrightChild());
            }
            System.out.print(root.getData()+", ");
        }
    }
}
