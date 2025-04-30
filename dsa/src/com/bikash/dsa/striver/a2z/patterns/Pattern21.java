package com.bikash.dsa.striver.a2z.patterns;

public class Pattern21 {

    /*

            * * * *         i=1 [4,0,4]
            *     *         i=2 [1,2,1]
            *     *         i=3 [1,2,1]
            * * * *         i=4 [4,0,4]

// Its a square of side=4 so stars are printed on the boundries.
     */

    public static void main(String[] args) {
       print21(5);
    }

    public static void print21(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 || i==n-1 || j==0 || j==n-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
