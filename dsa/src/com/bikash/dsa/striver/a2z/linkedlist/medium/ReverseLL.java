package com.bikash.dsa.striver.a2z.linkedlist.medium;

import com.bikash.dsa.singleList.generic.Node;
import com.bikash.dsa.striver.a2z.linkedlist.CreateLL;

import java.util.Stack;

public class ReverseLL {

    public static void main(String[] args) {
        int[] arr = {2,1,3,4,5};
        Node<Integer> head = CreateLL.getLL(arr);
        CreateLL.printEl(head);
//        reverse(head);
//        CreateLL.printEl(head);
        optimalRev(head);
        CreateLL.printEl(head);
    }

    public static void reverse(Node<Integer> tempHead){
        Stack<Integer> tempStack = new Stack<>();
        Node<Integer> temp = tempHead;
        while (temp!=null){
            tempStack.push(temp.getData());
            temp= temp.getNext();
        }
        temp = tempHead;
        while(!tempStack.empty()){
            temp.setData(tempStack.pop());
            temp=temp.getNext();
        }


    }

    public static void optimalRev(Node<Integer> tempHead){
        Node<Integer> prev = null;
        while (tempHead != null){
            Node<Integer> frontNode = tempHead.getNext();
            tempHead.setNext(prev) ;
            prev=tempHead;
            tempHead = frontNode;
        }
        tempHead = prev;
        CreateLL.printEl(tempHead);
    }

}
