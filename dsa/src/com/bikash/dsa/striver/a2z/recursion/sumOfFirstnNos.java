package com.bikash.dsa.striver.a2z.recursion;

public class sumOfFirstnNos {

    public static void main(String[] args) {
        System.out.println(sum(9));
        sumParam(9  , 0);
    }

    //Functional Recursion
    public static int sum(int n){
        if(n==1) return 1;
        return n+sum(n-1);
    }

    //Parameterized recursion
    public static void sumParam(int n, int sum){
        if(n==0){
            System.out.println("Sum : "+ sum);
            return;
        }
        sumParam(n-1, sum+n);
    }
}
