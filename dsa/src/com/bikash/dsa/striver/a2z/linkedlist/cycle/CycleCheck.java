package com.bikash.dsa.striver.a2z.linkedlist.cycle;

class LinkedList {

    int data;
    LinkedList next;

    LinkedList(int data){
        this.data=data;
        this.next = null;
    }

}

public class CycleCheck{
    public static void main(String[] args) {
        LinkedList head = new LinkedList(1);
        head.next = new LinkedList(2);
        head.next.next = new LinkedList(3);
        head.next.next.next = new LinkedList(4);
        head.next.next.next.next=head;
        System.out.println("Is the LL a cycle : "+detectCycle(head));
    }

    public static boolean detectCycle(LinkedList head){
        LinkedList slop = head;
        LinkedList fasp = head;

        while (fasp!=null && fasp.next!=null){
            slop = slop.next;
            fasp = fasp.next.next;
            if(slop==fasp){
                return true;
            }
        }
        return false;
    }
}

