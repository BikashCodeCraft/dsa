package com.bikash.dsa.striver.a2z.patterns;

public class Pattern17 {

    /*
                A                       i=0;    [4-spaces,1-Alpha,4-spaces]
              A B A                     i=1;    [3-spaces,3-Alpha,3-spaces]
            A B C B A                   i=2;    [2,5,2]
          A B C D C B A                 i=3;    [1,7,1]
        A B C D E D C B A

     */

    public static void main(String[] args) {
      print17(5);
    }

    public static void print17(int n){
        for(int i=0; i<n; i++){
            char c = 'A';
            for(int j=0; j<n-i-1; j++){
                System.out.print("  ");
            }
            int breakPoint = (2*i+1)/2;
            for(int k=1; k<=2*i+1; k++){
                System.out.print(c+" ");
                if(k<=breakPoint) c++;
                else c--;
            }

            for(int j=i+1; j<n-i-1; j++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
