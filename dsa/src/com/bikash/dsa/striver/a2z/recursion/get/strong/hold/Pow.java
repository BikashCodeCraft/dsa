package com.bikash.dsa.striver.a2z.recursion.get.strong.hold;

public class Pow {
    public static void main(String[] args) {
        System.out.println("n to the power of p : "+powOf(3,2));
        System.out.println(getPower(2,-2));
    }
    public static int powOf(int n, int p){
        if(p==0) return 1;
        return n*powOf(n,p-1);
    }

    public static double getPower(int x, int n){
        int nn = n;
        if(n<0) nn = -1*n;
        double result = optimal(x,nn);
        if(n>0) return result;
        else return 1/result;
    }

    public static double optimal(int x, int n){
        if(n==0) return 1;
        if(n%2==1){
           return x * optimal(x,n-1);
        }else{
            return optimal(x*x, n/2);
        }
    }
}
