package com.bikash.dsa.striver.a2z.patterns;

public class Pattern12A {

    /*
                        A
                       A B
                      A B C
                     A B C D
     */
    public static void main(String[] args) {
        print12A("ABCD");
    }

    public static void print12A(String s){
        int n = s.length();
        for (int i=0; i<n; i++){
            for(int j=n-1; j>i; j--){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print(s.charAt(k)+" ");
            }
            for(int j=n-1; j>i; j--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
