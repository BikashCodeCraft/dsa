package com.bikash.dsa.striver.a2z.patterns;

public class Pattern10 {

    /*

     *                          i=1;
     * *                        i=2;
     * * *                      i=3;
     * * * *                   i=4;
     * * * * *                 i=5; Till this point symmetry
     * * * *                  i=6;
     * * *                    i=7;
     * *                      i=8;
     *                        i=9;

     */

    public static void main(String[] args) {
        print10(5);
    }

    public static void print10(int n){
//        for(int i=1; i<=n; i++){
//            for (int j=1; j<=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(int i=n-1; i>0; i--){
//            for (int j=i; j>0; j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i=1; i<=2*n-1;i++){
//            if(i<=n){
//                for(int j=0; j<i; j++){
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }else{
//                for(int j=i; j<=2*n-1; j++){
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }
//        }
        for(int i=1; i<=2*n-1;i++){
            int stars = i;
            if (i>n) stars=2*n-i;
            for(int j=0; j<stars; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
