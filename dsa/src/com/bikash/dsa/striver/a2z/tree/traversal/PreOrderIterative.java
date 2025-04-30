package com.bikash.dsa.striver.a2z.tree.traversal;

import com.bikash.dsa.tree.wo.Tree;
import com.bikash.dsa.tree.wo.TreeNode;

import java.util.Stack;

public class PreOrderIterative {

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
        itterativePreOrder(bst.getRoot());
    }

    public static void itterativePreOrder(TreeNode root){
        if(root!=null){
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            while (!stack.empty()){
                TreeNode temNode = stack.pop();
                System.out.print(temNode.getData()+", ");
                if(temNode.getrightChild()!=null){
                    stack.push(temNode.getrightChild());
                }
                if(temNode.getleftChild() != null){
                    stack.push(temNode.getleftChild());
                }

            }
        }
    }
}
