package com.bikash.dsa.striver.a2z.patterns;

public class Pattern19 {

    /*

            * * * * * * * * * *             i=0 [5-*, 0-space, 5-*]
            * * * *     * * * *             i=1 [4-*, 2-space, 4-*]
            * * *         * * *             i=2 [3-*, 4-space, 3-*]
            * *             * *             i=3 [2-*, 6-space, 2-*]
            *                 *             i=4 [1-*, 8-space, 1-*]
        --------------------------------------------------------------------- Symmetrical
            *                 *             i=5 [1-*, 8-space, 1-*]
            * *             * *             i=6 [2-*, 6-space, 2-*]
            * * *         * * *             i=7 [3-*, 4-space, 3-*]
            * * * *     * * * *             i=8 [4-*, 2-space, 4-*]
            * * * * * * * * * *             i=9 [5-*, 0-space, 5-*]

     */

    public static void main(String[] args) {
        print19(5);
    }

    public static void print19(int n){
        //First Half
        for(int i=0; i<n;i++){
            //Stars
            for(int j=0; j<n-i; j++){
                System.out.print("* ");
            }
            //Spaces
            for(int k=0; k<2*i;k++){
                System.out.print("  ");
            }
            //Starts
            for(int j=i; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //Second half Symmetry
        for(int i=1; i<=n;i++){
            //Stars
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            //Spaces
            for(int k=0; k<2*n-2*i;k++){
                System.out.print("  ");
            }
            //Stars
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
