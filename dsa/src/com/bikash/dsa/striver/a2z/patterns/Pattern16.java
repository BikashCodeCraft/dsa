package com.bikash.dsa.striver.a2z.patterns;

public class Pattern16 {

    /*
           A
           B B
           C C C
           D D D D
           E E E E E

     */

    public static void main(String[] args) {
        print16(5);
    }

    public static void print16(int n){
        char c = 'A';
        for(int i=0; i<n; i++){
            for(int j=0; j<=i;j++){
                System.out.print(c+" ");
            }
            c++;
            System.out.println();
        }
    }

}
