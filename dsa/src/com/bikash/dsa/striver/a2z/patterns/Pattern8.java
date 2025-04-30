package com.bikash.dsa.striver.a2z.patterns;

public class Pattern8 {

    /*
            * * * * * * * * *           i=0;    [0-spaces,9-*,0-spaces]
              * * * * * * *             i=1;    [1-spaces,7-*,1-spaces]
                * * * * *               i=2;    [2-spaces,5-*,2-spaces]
                  * * *                 i=3;    [3,3,3]
                    *                   i=4;    [4,1,4]
     */
    public static void main(String[] args) {
        print8(5);
    }
    public static void print8(int n) {

        for(int i=0;i<n;i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<(n*2-1)-2*i; j++){
                System.out.print("*");
            }

            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
