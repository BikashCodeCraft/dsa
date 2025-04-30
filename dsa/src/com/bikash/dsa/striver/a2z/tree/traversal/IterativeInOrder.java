package com.bikash.dsa.striver.a2z.tree.traversal;

import com.bikash.dsa.tree.wo.Tree;
import com.bikash.dsa.tree.wo.TreeNode;

import java.util.Stack;

public class IterativeInOrder {

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
        iterativeInOrder(bst.getRoot());
    }

    //Inorder - Left-Root-Right
    public static void iterativeInOrder(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node=root;
        while (true){
            if(node != null){
                stack.push(node);
                node=node.getleftChild();
            }else{
                if(stack.empty()){
                    break;
                }
                node=stack.pop();
                System.out.print(node.getData()+", ");
                node=node.getrightChild();
            }
        }
    }
}
