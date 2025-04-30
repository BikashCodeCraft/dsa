package com.bikash.dsa.striver.a2z.tree.traversal;

import com.bikash.dsa.striver.a2z.tree.WorkingWithBST;
import com.bikash.dsa.tree.wo.TreeNode;

import java.util.Stack;

public class PostOrderUsing2Stack {

    public static void main(String[] args) {
        TreeNode root = WorkingWithBST.buildTree();
        postOrder(root);
    }

    public static void postOrder(TreeNode root) {
        Stack<TreeNode> stack1 = new Stack<>();
        stack1.push(root);
        Stack<TreeNode> stack2 = new Stack<>();
        while (!stack1.empty()) {
            TreeNode node = stack1.pop();
            stack2.push(node);
            if (node.getleftChild() != null) {
                stack1.push(node.getleftChild());
            }
            if (node.getrightChild() != null) {
                stack1.push(node.getrightChild());
            }
        }

        while (!stack2.empty()) {
            System.out.print(stack2.pop().getData() + ", ");
        }
    }
}
