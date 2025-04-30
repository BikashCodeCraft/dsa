package com.bikash.dsa.striver.a2z.tree.traversal;

import com.bikash.dsa.tree.wo.Tree;
import com.bikash.dsa.tree.wo.TreeNode;

public class PreOrder {

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
        preOrderTraversal(bst.getRoot());
    }

    //PreOrder Root-Left-Right
    public static void preOrderTraversal(TreeNode root){
        if(null!=root){
            System.out.print(root.getData()+", ");
            if(root.getleftChild()!=null){
                preOrderTraversal(root.getleftChild());
            }
            if (root.getrightChild()!=null) {
                preOrderTraversal(root.getrightChild());
            }
        }
    }

}
