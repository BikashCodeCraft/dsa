package com.bikash.dsa.striver.a2z.basicMath;

public class Power {

    public static void main(String[] args) {
        System.out.println(optimal(2,-2));
    }

    public static double optimal(int x, int n){ // x to the power of n
        int nn = n;
        if(n<0) nn = -1 * nn;
        double result  = 1;
        while (nn>0){
            if(nn%2==1){
                result = x*result;
                nn = nn-1;
            }else {
                nn = nn/2;
                x=x*x;
            }
        }
        if(n>0){
            return result;
        }else {
            return 1/result;
        }
    }
}
