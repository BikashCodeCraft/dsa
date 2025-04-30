package com.bikash.dsa.queue.tutorial;

import com.bikash.dsa.Employee;

import java.util.NoSuchElementException;

public class ArrayQueue {

    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity){
        queue = new Employee[capacity];
    }

    public void add(Employee employee){
        if(back == queue.length){
            Employee[] newQueue = new Employee[2* queue.length];
            System.arraycopy(queue,0,newQueue,0,queue.length);
            queue = newQueue;
        }
        queue[back++] = employee;
    }

    public Employee peek(){
        if (size()==0){
            System.out.println("Empty Queue !!!");
            throw new NoSuchElementException();
        }
        return queue[front];
    }

    public Employee remove(){
        if (size()==0){
            System.out.println("Empty Queue !!!");
            throw new NoSuchElementException();
        }

        Employee result = queue[front];
        queue[front] = null;
        front++;
        if(size()==0){
            front=0;
            back=0;
        }

        return result;
    }

    public void printQueue(){
        if(size()==0){
            System.out.println("Empty Queue !!!");
            throw new NoSuchElementException();
        }
        for(int i=front; i<back ; i++){
            System.out.print(queue[i]+", ");
        }
    }

    public int size(){
        return back-front;
    }
}
