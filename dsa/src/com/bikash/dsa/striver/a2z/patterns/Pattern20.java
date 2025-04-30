package com.bikash.dsa.striver.a2z.patterns;

public class Pattern20 {

    /*

     *                 *             i=0 [1,8,1]            i=1 [1,8,1]
     * *             * *             i=1 [2,6,2]            i=2 [2,6,2]
     * * *         * * *             i=2 [3,4,3]            i=3 [3,4,3]
     * * * *     * * * *             i=3 [4,2,4]            i=4 [4,2,4]
     * * * * * * * * * *             i=4 [5,0,5]            i=5 [5,0,5]
     * * * *     * * * *             i=1 [4,2,4]            i=6 [4,2,4]
     * * *         * * *             i=2 [3,4,3]            i=7 [3,4,3]
     * *             * *                                    i=8 [2,6,2]
     *                 *                                    i=9 [1,8,1]

     */

    public static void main(String[] args) {
        print20(5,1);
    }

    public static void print20(int n) {
//        int space = n * 2 - 2;
        //Either use space variable or use the formula as framed below.
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            for (int k = 0; k < 2*n-2*i; k++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
//            space-=2;
            System.out.println();
        }
//        space+=4;
        for(int i=1; i<n;i++){
            for(int j=i; j<n; j++){
                System.out.print("* ");
            }
            for(int k=0; k<2*i;k++){
                System.out.print("  ");
            }
            for(int j=i; j<n; j++){
                System.out.print("* ");
            }
//            space+=2;
            System.out.println();
        }

    }

    public static void print20(int n, int a){
        int star = 0;
        int space = 2*n;
//        int space = 0;
        for(int i=1; i<=n*2-1; i++){
            if(i<=n) {
                star=i;
                space-=2;
//                space = 2*(n-i);
            }
            else{
                star = n*2-i;
                space+=2;
//                space = 2*(i-n);
            }
            //Star
            for(int j=0; j<star; j++){
                System.out.print("* ");
            }
            //Space
            for(int k=0; k<space; k++){
                System.out.print("  ");
            }
            //Star
            for(int j=0; j<star; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
