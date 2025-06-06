package com.bikash.dsa.tree.wo;

public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int value) {
        data = value;
    }

    public void insert(int value) {

        if (value == data) {
            return;
        } else {
            if (value < data) {
                if (leftChild == null) {
                    leftChild = new TreeNode(value);
                } else {
                    leftChild.insert(value);
                }
            } else {
                if (rightChild == null) {
                    rightChild = new TreeNode(value);
                } else {
                    rightChild.insert(value);
                }
            }
        }
    }

//    public TreeNode get(int value) {
//        if (data == value) {
////            System.out.println("Found : " + value);
//            return this;
//        }
//        if (value < data) {
//            if (leftChild != null) {
//                return leftChild.get(value);
//            }
//        } else {
//            if (rightChild != null) {
//                return rightChild.get(value);
//            }
//        }
//        return null;
//    }

    public boolean get(int value) {
        if (data == value) {
//            System.out.println("Found : " + value);
            return true;
        }
        if (value < data) {
            if (leftChild != null) {
                return leftChild.get(value);
            }
        } else {
            if (rightChild != null) {
                return rightChild.get(value);
            }
        }
        return false;
    }

    //My Code
    public TreeNode myMin(){
        if(leftChild == null){
            return this;
        }
        return leftChild.myMin();
    }

    public TreeNode myMax(){
        if(rightChild == null){
            return this;
        }
        return rightChild.myMax();
    }

    public int min(){
        if(leftChild == null){
            return data;
        }else{
            return leftChild.min();
        }
    }

    public int max(){
        if(rightChild == null){
            return data;
        }else{
            return rightChild.max();
        }

    }


    public void traverseInOrder() {
        if (leftChild != null) {
            leftChild.traverseInOrder();
        }
        System.out.print(data + ", ");
        if (rightChild != null) {
            rightChild.traverseInOrder();
        }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getleftChild() {
        return leftChild;
    }

    public void setleftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getrightChild() {
        return rightChild;
    }

    public void setrightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "Data = " + data;
    }
}
