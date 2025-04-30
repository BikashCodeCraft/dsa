package com.bikash.dsa.striver.a2z.patterns;

public class Pattern11 {

    /*
           1
           0 1
           1 0 1
           0 1 0 1
           1 0 1 0 1

           For all the even rows it starts with one.

     */
    public static void main(String[] args) {
       print11(5);
    }

    public static void print11(int n){
//        for(int i=0; i<n; i++){
//            for(int j=0; j<=i; j++){
//                if((i+j) % 2 == 0){
//                    System.out.print("1 ");
//                }else{
//                    System.out.print("0 ");
//                }
//            }
//            System.out.println();
//        }
        for(int i=0; i<n; i++){
            int start =1;
            if(i%2==0) start=1;
            else start =0;
            for(int j=0; j<=i; j++){
                System.out.print(start+" ");
                start=1-start;
            }
            System.out.println();
        }
    }
}
