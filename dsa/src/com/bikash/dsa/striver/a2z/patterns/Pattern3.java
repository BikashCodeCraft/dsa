package com.bikash.dsa.striver.a2z.patterns;

public class Pattern3 {

    /*

     1              i=1 j[1]
     1 2            i=2 j[1,2]
     1 2 3          i=3 j[1,2,3]
     1 2 3 4
     1 2 3 4 5

     */
    public static void main(String[] args) {
        print3(5);
    }

    public static void print3(int n){
        for (int i=1;i<=n;i++){
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
