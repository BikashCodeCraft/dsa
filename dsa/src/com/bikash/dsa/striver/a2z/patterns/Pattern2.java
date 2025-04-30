package com.bikash.dsa.striver.a2z.patterns;

public class Pattern2 {
    /*

     *              i=0 j[1]
     * *            i=1 j[1,2]
     * * *          i=2 j[1,2,3]
     * * * *
     * * * * *

     */
    public static void main(String[] args) {
        print2(5);
    }

    public static void print2(int n){
        for (int i=0;i<n;i++){
            for (int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
