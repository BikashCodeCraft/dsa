package com.bikash.dsa.striver.a2z.patterns;

public class Pattern13 {

     /*
           1
           2 3
           4 5 6
           7 8 9 10
           11 12 13 14 15



     */

    public static void main(String[] args) {
        print13(5);
    }

    public static void print13(int n) {
        int p = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(p+++" ");
            }
            System.out.println();
        }
    }

}
