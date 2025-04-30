package com.bikash.dsa.doublelinklist.emp.generic;

public class Node<T> {
    private Node<T> previous;
    private T t;
    private Node<T> next;

    public Node(T t) {
        this.t = t;
    }

    public Node<T> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
