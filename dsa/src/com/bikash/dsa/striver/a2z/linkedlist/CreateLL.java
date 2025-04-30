package com.bikash.dsa.striver.a2z.linkedlist;

import com.bikash.dsa.singleList.generic.CustomList;
import com.bikash.dsa.singleList.generic.Node;

public class CreateLL {

    public static Node<Integer> getLL(int[] arr){
        CustomList<Integer> ll = new CustomList<>();
        for (int j : arr) {
            ll.add(j);
        }
        return ll.getNode();
    }

    public static void printEl(Node<Integer> tempHead){
        System.out.print("Head -> ");
        while (tempHead!=null){
            System.out.print(tempHead.getData()+" -> ");
            tempHead=tempHead.getNext();
        }
        System.out.print(" -> null");
        System.out.println();

    }
}
