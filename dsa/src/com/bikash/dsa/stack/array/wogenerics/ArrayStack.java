package com.bikash.dsa.stack.array.wogenerics;

import com.bikash.dsa.Employee;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack {
    private Employee[] stack;
    private int top;

    public ArrayStack(int size) {
        stack = new Employee[size];
    }

    public void push(Employee employee){
        if(top == stack.length){
            Employee[] newStack = new Employee[2 * stack.length];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }
        stack[top++] = employee;
    }

    public Employee peek(){
        if(isEmpty()){
            System.out.println("Statck is Empty !!!!");
            throw new EmptyStackException();
        }
       return stack[top -1];
    }

    public Employee pop(){
        if(isEmpty()){
            System.out.println("Statck is Empty !!!!");
            throw new EmptyStackException();
        }
        Employee result = stack[--top];
        stack[top] =null;
        return result;
    }

    public boolean isEmpty(){
        return top==0;
    }

    public int size(){
        return top;
    }

    public void printStack(){
        for(int i=top-1; i>=0; i--){
            System.out.println(stack[i]);
        }
    }


}
