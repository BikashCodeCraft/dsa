package com.bikash.dsa.striver.a2z.basicMath;

import static java.lang.Math.log10;
import static java.lang.Math.pow;

public class ReverseNumber {

    public static void main(String[] args) {
//        System.out.println(reverseNum(778900));
//        System.out.println((int)log10(74748856)+1);
        int check=74748;
        System.out.println(armstrong(check, (int)log10(check)+1));
    }

    public static int reverseNum(int num){
        int revNum = 0;
        while (num>0){
            int digit = num%10;
            revNum = (revNum*10)+digit;
            num/=10;
        }
        return revNum;
    }

    public static int armstrong(int n, int count){
        int result =0;
        while (n>0){
            int digit = n%10;
//            result +=(digit*digit*digit*digit);
            result+= (int) pow(digit,count);
            n=n/10;
        }
        return result;
    }

}
