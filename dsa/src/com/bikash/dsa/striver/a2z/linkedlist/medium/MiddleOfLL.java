package com.bikash.dsa.striver.a2z.linkedlist.medium;

import com.bikash.dsa.singleList.generic.Node;
import com.bikash.dsa.striver.a2z.linkedlist.CreateLL;

public class MiddleOfLL {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node<Integer> tempHead = CreateLL.getLL(arr);
        getMiddle(tempHead);
    }

    public static void getMiddle(Node<Integer> tempHead){
        Node<Integer> slow = tempHead;
        Node<Integer> fast = tempHead;

        int count = 0;
        while (fast!=null && fast.getNext()!=null){
            slow=slow.getNext();
            fast=fast.getNext().getNext();
            count++;
        }
        count=count*2;
        if(fast != null){
            count++;
        }
        System.out.println("Middle Num is : "+ slow.getData());
        System.out.println("Size : "+count);
    }
}
