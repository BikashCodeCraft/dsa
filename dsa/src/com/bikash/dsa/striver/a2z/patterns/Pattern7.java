package com.bikash.dsa.striver.a2z.patterns;

public class Pattern7 {
    /*
                    *                       i=0;    [4-spaces,1-*,4-spaces]
                  * * *                     i=1;    [3-spaces,3-*,3-spaces]
                * * * * *                   i=2;    [2,5,2]
              * * * * * * *                 i=3;    [1,7,1]
            * * * * * * * * *               i=4;    [0,9,0]

     */

    public static void main(String[] args) {
        print7(5);
    }

    public static void print7(int n) {
        for (int i=0; i<n;i++){
            //Print Spaces
            for(int j=0; j<n-1-i;j++){
                System.out.print(" ");
            }
            //Print Stars
            for(int j=0;j<(i*2+1);j++){
                System.out.print("*");
            }
            //Print Spaces
            for(int j=0; j<n-1-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }


}
