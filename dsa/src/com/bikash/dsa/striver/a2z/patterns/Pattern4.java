package com.bikash.dsa.striver.a2z.patterns;

public class Pattern4 {
    /*

        1
        2 2
        3 3 3
        4 4 4 4
        5 5 5 5 5

     */
    public static void main(String[] args) {
        print4(5);
    }

    public static void print4(int n){
        for (int i=1;i<=n;i++){
            for (int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
