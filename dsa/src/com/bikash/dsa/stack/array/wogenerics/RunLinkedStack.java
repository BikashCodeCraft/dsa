package com.bikash.dsa.stack.array.wogenerics;

import com.bikash.dsa.Employee;

import java.util.LinkedList;

public class RunLinkedStack {

    public static void main(String[] args) {

        LinkedStack linkedStack = new LinkedStack();
        linkedStack.push(new Employee(1, "Jhon"));
        linkedStack.push(new Employee(2, "Jill"));
        linkedStack.push(new Employee(3, "Bill"));
        linkedStack.push(new Employee(4, "Marry"));
//        System.out.println(linkedStack.peek());
        linkedStack.printStack();
//        LinkedList<Employee> stack = new LinkedList<>();
//        stack.
    }
}
