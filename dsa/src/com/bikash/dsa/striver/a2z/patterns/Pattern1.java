package com.bikash.dsa.striver.a2z.patterns;

public class Pattern1 {
    /*
        * * * * *
        * * * * *
        * * * * *
        * * * * *
     */
    public static void main(String[] args) {
        print1(5);
    }
    public static void print1(int n){
        for (int i=0;i<n;i++){
            for (int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
