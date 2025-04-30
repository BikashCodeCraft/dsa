package com.bikash.dsa.striver.a2z.patterns;

public class Pattern15 {

    /*

        A B C D E
        A B C D
        A B C
        A B
        A

     */

    public static void main(String[] args) {
      print15(5);
    }

    public static void print15(int n){
//        for(char i='A'; i<'A'+n; i++){
//            for(char c='A'; c<=i; c++){
//                System.out.print(c+" ");
//            }
//            System.out.println();
//        }

        for(int i=0; i<n; i++){
            for(char c='A'; c<'A'+n-i; c++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
