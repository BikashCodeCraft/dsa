package com.bikash.dsa.striver.a2z.tree;

import com.bikash.dsa.tree.wo.Tree;
import com.bikash.dsa.tree.wo.TreeNode;

public class WorkingWithBST {

    public static TreeNode buildTree(){
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
        return bst.getRoot();
    }
}
