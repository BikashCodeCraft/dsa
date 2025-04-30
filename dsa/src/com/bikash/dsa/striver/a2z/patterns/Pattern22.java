package com.bikash.dsa.striver.a2z.patterns;

public class Pattern22 {

    /*

            4 4 4 4 4 4 4
            4 3 3 3 3 3 4
            4 3 2 2 2 3 4
            4 3 2 1 2 3 4
            4 3 2 2 2 3 4
            4 3 3 3 3 3 4
            4 4 4 4 4 4 4

     */

    public static void main(String[] args) {
     print22(4);
    }

    public static void print22(int n){
        int digit =n;
        int boundry = 1;
        for(int i=boundry; i<=2*n-1; i++){
            for(int j=boundry; j<=2*n-1; j++){
                if(i==boundry || j==boundry || i==2*n-1 || j==2*n-1){
                    System.out.print(digit);
                }else {
                    System.out.print(" ");
                }
            }
            digit--;

            System.out.println();
        }
    }
}
