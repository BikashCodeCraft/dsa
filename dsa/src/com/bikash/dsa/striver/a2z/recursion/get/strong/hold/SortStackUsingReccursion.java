package com.bikash.dsa.striver.a2z.recursion.get.strong.hold;

import java.util.Stack;

public class SortStackUsingReccursion {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(2);
        stack.push(1);
        stack.push(6);
        stack.push(8);
        System.out.println("Before : "+stack);
        sort(stack);
        System.out.println("After : "+stack);

    }

    public static void sort(Stack<Integer> stack){
        if(stack.isEmpty()) return;
        int x = stack.pop();
        sort(stack);
        insert(stack,x);
    }

    public static void insert(Stack<Integer> stack, int x){
        if(stack.isEmpty()) {
            stack.push(x);
            return;
        }
        int value = stack.peek();
        if(x<value){
            stack.pop();
            insert(stack, x);
            stack.push(value);
        }else{
            stack.push(x);
        }

    }
}
