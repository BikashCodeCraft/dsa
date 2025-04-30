package com.bikash.dsa.queue.tutorial;

import com.bikash.dsa.Employee;

public class TestArrayQueue {

    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(5);
        arrayQueue.add(new Employee(1,"Jhon"));
        arrayQueue.add(new Employee(2,"Jack"));
//        arrayQueue.add(new Employee(3,"Bruno"));
//        arrayQueue.add(new Employee(4,"Bill"));
        arrayQueue.remove();
        arrayQueue.add(new Employee(3,"Bruno"));
        arrayQueue.remove();
        arrayQueue.add(new Employee(4,"Bill"));
        arrayQueue.remove();
        arrayQueue.add(new Employee(5,"Max"));
        arrayQueue.remove();
        arrayQueue.add(new Employee(6,"Marry"));
        System.out.println(arrayQueue.size());
        arrayQueue.printQueue();
        System.out.println();
//        System.out.println(arrayQueue.peek());
//        System.out.println(arrayQueue.peek());
//        System.out.println(arrayQueue.peek());
//        System.out.println(arrayQueue.remove());
//        System.out.println(arrayQueue.remove());
//        System.out.println(arrayQueue.peek());
//        System.out.println(arrayQueue.peek());
//        arrayQueue.printQueue();
//        System.out.println(arrayQueue.size());
    }
}
