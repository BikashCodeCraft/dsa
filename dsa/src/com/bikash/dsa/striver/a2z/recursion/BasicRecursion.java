package com.bikash.dsa.striver.a2z.recursion;

public class BasicRecursion {

    public static void main(String[] args) {
//        printName("Bikash", 5);
//        printLinear(1,10);
        printLinear(10);
//        System.out.println();
//        printLinearReverse(10);
//        printLinearReverseBT(1,5);
    }

    // Print the name for 5 times using Recursion
    public static void printName(String name, int n){
        if(n==0) return;
        System.out.println(name);
        printName(name, n-1);
        System.out.println("Done : "+n);
    }

    //Print linearly from 1-n o/p : 1 2 3 4  . . . . n
    public static void printLinear(int i, int n){
        if(i>n) return;
        System.out.print(i+" ");
        printLinear(++i,n);
    }
    //This is called backtrack where printing is done after all the function call.
    public static void printLinear(int n){
        if(n==0) return;
        printLinear(n-1);
        System.out.print(n+", ");
    }

    //Print linearly from n - 1 o/p : n n-1 n-2 . . . . 2 1
    public static void printLinearReverse(int n){
        if(n<1) return;
        System.out.print(n+" ");
        printLinearReverse(n-1);
    }

    //Print linearly from 1-n o/p : 1 2 3 4  . . . . n but by Backtrack
    public static void printLinearBT(int i, int n){
        if(i<1) return;
        printLinearBT(i-1, n);
        System.out.print(i+" ");
    }

    //Print linearly from n - 1 o/p : n n-1 n-2 . . . . 2 1 but by Backtrack
    public static void printLinearReverseBT(int i, int n){
        if(i>n) return;
        printLinearReverseBT(i+1,n);
        System.out.print(i+" ");
    }

}
