package com.bikash.dsa.stack.array.wogenerics;


import com.bikash.dsa.Employee;

import java.util.LinkedList;

public class LinkedStack {
   private LinkedList<Employee> stack;

    public LinkedStack() {
        stack = new LinkedList<>();
    }

    public void push(Employee employee){
        stack.push(employee);
    }

    public Employee pop(){
       return stack.pop();
    }

    public Employee peek(){
        return stack.peek();
    }

    public void printStack(){
        stack.stream().forEach(System.out::println);
    }

}
