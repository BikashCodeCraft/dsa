package com.bikash.dsa.striver.a2z.patterns;

public class Pattern18 {
     /*
           E
           D E
           C D E
           B C D E
           A B C D E

     */
     public static void main(String[] args) {
         print18(5);
     }
     public static void print18(int n){

//         for(int i=0; i<n; i++){
//             char c= 'A';
//             c+= (char) (n-1-i);
//             for(int j=0; j<=i; j++){
//                 System.out.print(c+++" ");
//             }
//             System.out.println();
//         }

         for(int i=0; i<n; i++){
             char c='E';
             c-=i;
             for(; c<='E'; c++){
                 System.out.print(c+" ");
             }
             System.out.println();
         }
     }
}
