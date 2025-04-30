package com.bikash.dsa.striver.a2z.tree.traversal;

import com.bikash.dsa.tree.wo.Tree;
import com.bikash.dsa.tree.wo.TreeNode;

public class InOrder {

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
        inOrderTraversal(bst.getRoot());
    }
    //In-Order left-root-right
    public static void inOrderTraversal(TreeNode root){
        if(root!=null){
            if(root.getleftChild() !=null){
                inOrderTraversal(root.getleftChild());
            }
            System.out.print(root.getData()+ ", ");
            if(root.getrightChild() !=null){
                inOrderTraversal(root.getrightChild());
            }
        }
    }
}
