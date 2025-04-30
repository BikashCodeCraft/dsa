package com.bikash.dsa.singleList.generic;

import com.bikash.dsa.singleList.CustomListInterface;

import java.util.Comparator;

public class CustomList <T extends Comparable<T>> implements CustomListInterface<T> {
    Node<T> head;
    int size;


    @Override
    public <T> void addToFront(T element) {
        Node node = new Node<>(element);
        node.setNext(head);
        head=node;
        size++;
    }


    @Override
    public <T> void print(){
        try {
            Node tempNode = head;
            System.out.print("Head -> ");
            while (head!=null){
                System.out.print(head.getData()+" -> ");
                head = head.getNext();
            }
            head=tempNode;
            System.out.println("null");
        }catch (Exception e){
            System.out.println("List is Empty !!!!!!!");
            throw new RuntimeException("List is Empty!!!!!!");
        }

    }

    @Override
    public <T> void remove(T element) {
        try{
            if(head==null) throw new RuntimeException("Empty List");
            if(head.getData() == element) {
                removeFromFront();
                return;
            }
            Node current = head;
            Node prev = head;
            while(current != null){
                if(current.getData() == element){
                    prev.setNext(current.getNext());
                    current.setNext(null);
                    break;
                }
                prev=current;
                current=current.getNext();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public boolean isEmpty() {
        return head==null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public <T1> void add(T1 element) {
        if (head == null) {
            addToFront(element);
        }
        else{
            Node tempNode = new Node();
            tempNode=head;
            while (head.getNext() != null){
                head=head.getNext();
            }
            Node newNode = new Node(element);
            head.setNext(newNode);
            head = tempNode;
            size++;
        }

    }

    @Override
    public <T> void removeFromFront() {
        try{
            if(head==null) {
                throw new RuntimeException("Empty List");
            }
            Node tempNode;
            tempNode = head.getNext();
            head.setNext(null);
            head=tempNode;
            size--;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }

    public void insertSorted(T t){
        if(isEmpty() || (head.getData().compareTo(t)>0)){
            addToFront(t);
            return;
        }
        Node<T> current = head;
        Node<T> prev = head;
        Node<T> node = new Node<>(t);
        while(current != null){
            if(current.getData().compareTo(t) > 0){
                prev.setNext(node);
                node.setNext(current);

                break;
            }
            prev=current;
            current = current.getNext();
        }
        if(current == null){
            prev.setNext(node);
        }
        size++;
    }

    public Node<T> getNode(){
        return head;
    }
}
