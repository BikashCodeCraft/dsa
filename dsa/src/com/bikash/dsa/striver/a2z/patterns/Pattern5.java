package com.bikash.dsa.striver.a2z.patterns;

public class Pattern5 {
    /*

        * * * * *       i=1, j[1,2,3,4,5] 5-times
        * * * *         i=2, j[1,2,3,4]     4-times
        * * *           i=3, 3-times
        * *             i=4, 2-times
        *
                                totalNoOfRows-CurrentRow+1
     */
    public static void main(String[] args) {
        print4(5);
    }

    public static void print4(int n){
//        for (int i=1;i<=n;i++) {
//            for (int j = n; j >= i; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        for (int i=1;i<=n;i++){
            for (int j=0; j<n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
