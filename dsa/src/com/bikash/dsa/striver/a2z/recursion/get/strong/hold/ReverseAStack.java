package com.bikash.dsa.striver.a2z.recursion.get.strong.hold;

import java.util.Stack;

public class ReverseAStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(7);
        stack.push(6);
        System.out.println(stack);
        reverse(stack);
        System.out.println(stack);
    }

    public static void reverse(Stack<Integer> stack){
        if(stack.isEmpty()) return;
        int x = stack.pop();
        reverse(stack);
        insertAtBottom(stack, x);
    }

    public static void insertAtBottom(Stack<Integer> stack, int value){
        if(stack.isEmpty()) {
            stack.push(value);
            return;
        }
        int top = stack.pop();
        insertAtBottom(stack, value);
        stack.push(top);
    }
}
