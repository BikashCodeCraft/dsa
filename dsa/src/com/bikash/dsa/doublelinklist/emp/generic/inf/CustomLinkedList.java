package com.bikash.dsa.doublelinklist.emp.generic.inf;

import com.bikash.dsa.doublelinklist.emp.generic.Node;
import java.util.Arrays;

public class CustomLinkedList<T> implements LinkedList<T>, PrintList<T>, Sorting<T> {
    
    Node head;
    Node tail;
    int size;
    
    @Override
    public <T> void addFirst(T t) {
        Node<T> node = new Node<>(t);
        if(isEmpty()){
            tail=node;
        }else{
            head.setPrevious(node);
        }
        node.setNext(head);
        head = node;
        size++;
    }


    @Override
    public <T> void add(T t) {
        Node<T> node = new Node<>(t);
        if(isEmpty()){
            head=node;
        }else{
            tail.setNext(node);
        }
        node.setPrevious(tail);
        tail=node;
        size++;
    }

    @Override
    public <T> void printList() {
        if(isEmpty()) {
            System.out.println("[]");
            return;
        }
        Node<T> current = head;
        while(current != null){
            System.out.println(current.getT());
            current=current.getNext();
        }
    }

    @Override
    public <T> void removeFirst() {
        if(isEmpty()){
            System.out.println("[]");
            return;
        } else if (size == 1) {
            head = tail = null;
        }else {
            head.getNext().setPrevious(null);
            head = head.getNext();
        }
        size-- ;
    }

    @Override
    public <T> void remove() {
        if(isEmpty()){
            System.out.println("[]");
            return;
        } else if (size == 1) {
            head = tail = null;
        }else {
            tail.getPrevious().setNext(null);
            tail = tail.getPrevious();
        }
        size-- ;
    }

    @Override
    public boolean isEmpty() {
        return head==null && tail==null;
    }

    @Override
    public T get(int index) {
        if(isEmpty()) {
            System.out.println("[]");
        }
        T t = null;
        Node<T> current = head;
        for(int i=0; i<=index && i<size && current!=null; i++){
            if(i==index){
                t = current.getT();
            }
            current=current.getNext();
        }
        return t;
    }

    public int size(){
        return size;
    }

    @Override
    public void printInLine(){
        if (isEmpty()){
            System.out.println("[]");
            return;
        }
        Node current = head;
        System.out.print("[");
        while (current != null){
            System.out.print(current.getT());
            System.out.print(", ");
            current=current.getNext();
        }
        System.out.print("]");
        System.out.println();
    }

    public <T> void remove(int index){
        if(isEmpty()){
            System.out.println("[]");
            return;
        }

        if(index==0){
           head = tail = null;
           return;
        }
        Node<T> current = head;
        for(int i =0; i<=index && index<size; i++){
            if(i==index){

                current.getPrevious().setNext(current.getNext());
                current.getNext().setPrevious(current.getPrevious());
                current.setPrevious(null);
                current.setNext(null);
                size--;
            }
            current=current.getNext();
        }
    }

    public void addBefore(T newObj, T existingObj){
        if(isEmpty()){
            System.out.println("[]");
            return;
        }
        Node<T> node = new Node<>(newObj);
        Node current = head;
        if(existingObj.equals(head.getT())){
            node.setNext(current);
            current.setPrevious(node);
            head=node;
            size++;
            return;
        }

        while(current != null){
            if(current.getT().equals(existingObj)){
                node.setPrevious(current.getPrevious());
                node.setNext(current);
                current.getPrevious().setNext(node);
                current.setPrevious(node);
            }
            current=current.getNext();
        }
        size++;
    }


    @Override
    public <T> void sort() {
        Object[] a = this.toArray();
        Arrays.sort(a);
        Node tempNode = head;
        for(int i=0; i<a.length && tempNode != null; i++){
            tempNode.setT((T)a[i]);
            tempNode = tempNode.getNext();
        }

    }

    public Object[] toArray(){
        Object[] objArr = new Object[size];
        Node tempNode = head;
        for (int i=0; i<objArr.length && tempNode !=null; i++){
            objArr[i] = tempNode.getT();
            tempNode= tempNode.getNext();
        }
        return objArr;
    }



}
