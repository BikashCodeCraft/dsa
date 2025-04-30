package com.bikash.dsa.striver.a2z.basicMath;

import static java.lang.Math.log10;

public class Count {

    // find the no of digits in a number 'n'

    public static void main(String[] args) {
//        System.out.println(noOfDigits(153859));
        System.out.println(nOfDigit(25953056));

    }

    public static int noOfDigits(int n){
        int count =0;
        while (n>0){
            n=n/10;
            count++;
        }
        return count;
    }

    public static int nOfDigit(int n){
        return (int)log10(n)+1;
    }
}
