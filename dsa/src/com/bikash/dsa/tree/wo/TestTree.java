package com.bikash.dsa.tree.wo;

public class TestTree {
    public static void main(String[] args) {
        Tree intTree = new Tree();

//        intTree.insert(25);
//        intTree.insert(20);
//        intTree.insert(15);
//        intTree.insert(27);
//        intTree.insert(30);
//        intTree.insert(29);
//        intTree.insert(26);
//        intTree.insert(22);
//        intTree.insert(32);
        intTree.put(25);
        intTree.put(20);
        intTree.put(15);
        intTree.put(27);
        intTree.put(30);
        intTree.put(100);
        intTree.put(29);
        intTree.put(26);
        intTree.put(22);
        intTree.put(32);
        intTree.put(2);

//        intTree.traverse();
//        System.out.println(intTree.get(30));
////        System.out.println(intTree.get(30).getleftChild().getData());
//        System.out.println(intTree.get(11));

        System.out.println(intTree.min());
        System.out.println(intTree.max());
    }
}
