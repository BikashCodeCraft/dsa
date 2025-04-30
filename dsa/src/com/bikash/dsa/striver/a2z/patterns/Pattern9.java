package com.bikash.dsa.striver.a2z.patterns;

public class Pattern9 {
    /*
               *                       i=0;    [4-spaces,1-*,4-spaces]
             * * *                     i=1;    [3-spaces,3-*,3-spaces]
           * * * * *                   i=2;    [2,5,2]
         * * * * * * *                 i=3;    [1,7,1]
       * * * * * * * * *               i=4;    [0,9,0]
       * * * * * * * * *               i=0;    [0-spaces,9-*,0-spaces]
         * * * * * * *                 i=1;    [1-spaces,7-*,1-spaces]
           * * * * *                   i=2;    [2-spaces,5-*,2-spaces]
             * * *                     i=3;    [3,3,3]
               *                       i=4;    [4,1,4]

     */
//    COMBINE Pattern7 and Pattern8

    public static void main(String[] args) {
//        print9(5);
        Pattern7.print7(5);
        Pattern8.print8(5);
    }
//    private static void print9(int n) {
//        for (int i=0; i<n;i++){
//            //Print Spaces
//            for(int j=0; j<n-1-i;j++){
//                System.out.print(" ");
//            }
//            //Print Stars
//            for(int j=0;j<(i*2+1);j++){
//                System.out.print("*");
//            }
//            //Print Spaces
//            for(int j=0; j<n-1-i;j++){
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<n;i++){
//            for(int j=0; j<i; j++){
//                System.out.print(" ");
//            }
//            for(int j=0; j<(n*2-1)-2*i; j++){
//                System.out.print("*");
//            }
//
//            for(int j=0; j<i; j++){
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//
//    }
}
