package com.bikash.dsa.queue.tutorial.circular.queue;

import com.bikash.dsa.Employee;

public class TestCircularQueue {
    public static void main(String[] args) {
        CircularArrayQueue circularArrayQueue = new CircularArrayQueue(5);
        circularArrayQueue.add(new Employee(1,"Jhon"));
        circularArrayQueue.add(new Employee(2,"Jack"));
//        circularArrayQueue.remove();
        circularArrayQueue.add(new Employee(3,"Jill"));
//        circularArrayQueue.remove();
        circularArrayQueue.add(new Employee(4,"Marry"));
//        circularArrayQueue.remove();
        circularArrayQueue.add(new Employee(5,"Bill"));
//        circularArrayQueue.remove();
        circularArrayQueue.add(new Employee(6,"Bruk"));
        System.out.println(circularArrayQueue.size());
        circularArrayQueue.printQueue();
        System.out.println("===================");
        circularArrayQueue.printAll();
    }
}
