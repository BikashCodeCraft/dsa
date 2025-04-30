package com.bikash.dsa.striver.a2z.patterns;

public class Pattern14 {

    /*
           A
           A B
           A B C
           A B C D
           A B C D E

     */

    public static void main(String[] args) {
        print14(5);
    }

    public static void print14(int n){
//        for(int i=1; i<=n; i++){
//            char p = 'A';
//            for(int j=1; j<=i; j++){
//                System.out.print(p+++" ");
//            }
//            System.out.println();
//        }
        for(int i=1; i<=n; i++){
            for(char c='A'; c<'A'+i; c++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
