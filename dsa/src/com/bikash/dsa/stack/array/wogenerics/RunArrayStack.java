package com.bikash.dsa.stack.array.wogenerics;

import com.bikash.dsa.Employee;

public class RunArrayStack {
    public static void main(String[] args) {

        ArrayStack arrayStack = new ArrayStack(5);

        arrayStack.push(new Employee(1, "Jhon"));
        arrayStack.push(new Employee(2, "Jack"));
        arrayStack.push(new Employee(3, "Marry"));
        arrayStack.push(new Employee(4, "Bruk"));

//        System.out.println(arrayStack.pop());
//        System.out.println(arrayStack.peek());
//        System.out.println(arrayStack.peek());
//        System.out.println(arrayStack.peek());
//        System.out.println(arrayStack.peek());
//        while (!arrayStack.isEmpty()){
//            System.out.println(arrayStack.pop());
//        }
        arrayStack.printStack();
    }


}
