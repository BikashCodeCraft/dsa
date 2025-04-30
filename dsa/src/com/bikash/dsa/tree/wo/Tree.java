package com.bikash.dsa.tree.wo;

public class Tree {

    private TreeNode root;

    public Tree() {

    }

    public void put(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
//            insert(root, value);
            root.insert(value);
        }
    }

//    public void insert(TreeNode here, int value){
//
//
//        if(value==here.getData()){
//            return;
//        }else{
//            if(value<here.getData()){
//                if(here.getleftChild() == null){
//                    here.setleftChild(new TreeNode(value));
//                }else{
//                    insert(here.getleftChild(),value);
//                }
//            }else {
//                if(here.getrightChild() == null){
//                    here.setrightChild(new TreeNode(value));
//                }else{
//                    insert(here.getrightChild(),value);
//                }
//            }
//        }
//    }

    public void traverse() {
        root.traverseInOrder();
    }

    public boolean get(int value) {
        if (root != null) {
            return root.get(value);
        } else {
            return false;
        }
    }

    public int min(){
        if(root == null){
            return Integer.MIN_VALUE;
        }else{
            return root.min();
        }
    }

    public int max(){
        if(root == null){
            return Integer.MIN_VALUE;
        }else{
            return root.max();
        }
    }

    public TreeNode getRoot(){
        return root;
    }
}
