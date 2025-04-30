package com.bikash.dsa.striver.a2z.tree.traversal;

import com.bikash.dsa.tree.wo.Tree;
import com.bikash.dsa.tree.wo.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {

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
        levelOrderTraversal(bst.getRoot());
    }

    public static void levelOrderTraversal(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();

        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            List<Integer> tempList = new ArrayList<>();
            for(int i=0; i<levelNum; i++){
                if(queue.peek().getleftChild()!=null){
                    queue.offer(queue.peek().getleftChild());
                }
                if(queue.peek().getrightChild() != null){
                    queue.offer(queue.peek().getrightChild());
                }
                tempList.add(queue.poll().getData());
            }

            result.add(tempList);
        }

        for(List<Integer> lst : result){
            System.out.println(lst);
        }
    }
}
