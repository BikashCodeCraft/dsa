package com.bikash.dsa.striver.a2z.patterns;

public class Pattern6 {

    /*

        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1
                    n-row+1
     */
    public static void main(String[] args) {
        print5(5);
    }
    public static void print5(int n){
        for (int i=1;i<=n;i++){
            for (int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

//        for(int i=5; i>=1; i--){
//            for(int j=1; j<=i; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
    }
}
