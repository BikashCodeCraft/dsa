package com.bikash.dsa.striver.a2z.patterns;

public class Pattern12 {

    /*
           1                 1          i=1; [1,8,1]        space = 2n-2i
           1 2             2 1          i=2; [2,6,2]
           1 2 3         3 2 1
           1 2 3 4     4 3 2 1
           1 2 3 4 5 5 4 3 2 1



     */
    public static void main(String[] args) {
        print12(9);
    }


    public static void print12(int n){
        for(int i=1;i<=n;i++){
            for(int j=1; j<=i;j++){
                System.out.print(j+"");
            }
            for(int k=0; k<2*(n-i); k++){
                System.out.print(" ");
            }
            for(int j=i; j>0;j--){
                System.out.print(j+"");
            }
            System.out.println();
        }
    }
}
