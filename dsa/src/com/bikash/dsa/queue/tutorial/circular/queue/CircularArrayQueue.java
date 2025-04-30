package com.bikash.dsa.queue.tutorial.circular.queue;

import com.bikash.dsa.Employee;

import java.util.NoSuchElementException;

public class CircularArrayQueue {

    private Employee[] queue;
    private int front;
    private int back;

    public CircularArrayQueue(int capacity) {
        queue = new Employee[capacity];
    }

    // 0-  asd
    // 1-  dfg
    // 2-          -back
    // 3-  Jhon   -front
    // 4-  bill
    public void add(Employee employee) {
        if (size() == queue.length - 1) {
            int numItem = size();
            Employee[] newQueue = new Employee[2 * queue.length];
            System.arraycopy(queue, front, newQueue, 0, queue.length - front);
            System.arraycopy(queue, 0, newQueue, queue.length - front, back);

            queue = newQueue;

            front = 0;
            back = numItem;
        }
        queue[back] = employee;
        if (back < queue.length - 1) {
            back++;
        } else {
            back = 0;
        }
    }

    public Employee peek() {
        if (size() == 0) {
            System.out.println("Empty Queue !!!");
            throw new NoSuchElementException();
        }
        return queue[front];
    }

    public Employee remove() {
        if (size() == 0) {
            System.out.println("Empty Queue !!!");
            throw new NoSuchElementException();
        }

        Employee result = queue[front];
        queue[front] = null;
        front++;
        if (size() == 0) {
            front = 0;
            back = 0;
        } else if (front == queue.length) {
            front = 0;
        }

        return result;
    }

    public void printQueue() {
        if (size() == 0) {
            System.out.println("Empty Queue !!!");
            throw new NoSuchElementException();
        }
        if (back >= front) {
            for (int i = front; i < back; i++) {
                System.out.print(queue[i] + ", ");
            }
        }else {
            for (int i = front; i < queue.length; i++) {
                System.out.print(queue[i] + ", ");
            }
            for (int i = 0; i < back; i++) {
                System.out.print(queue[i] + ", ");
            }
        }

    }

    public void printAll(){
        for(Employee e : queue){
            System.out.print(e+"--");
        }
    }

    public int size() {
        if (back >= front) {
            return back - front;
        } else {
            return (queue.length - front) + back;
//            return back-front+ queue.length; -> Tutors code
        }

    }
}
