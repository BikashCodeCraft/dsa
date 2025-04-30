package com.bikash.dsa.question.arrays.easy;

public class MissingNumberInSeq {

    public static void main(String[] args) {
       int[] arr = {3,4,2,1,6,7,5,8};
       withoutUpperLimit(arr);
    }

    public static void withUpperLimit(int[] arr, int n){
        // 1st Solution
        int actualSum = (n*(n+1))/2;
        int sum = 0;
        for(int a : arr){
            sum += a;
        }
        System.out.println("Missing Num : "+(actualSum-sum));

        // 2nd Solution
        int actualXor = 0;
        int calcXor = 0;

        for(int i = 0; i<arr.length; i++){
            actualXor ^= i+1;
            calcXor ^= arr[i];
        }
        actualXor ^= n;
        System.out.println("Missing Num Using XOR : "+(actualXor^calcXor));

    }

    public static void withoutUpperLimit(int[] arr){
        int n = arr.length+1; // upperLimit
        // 1st Solution
        int actualSum = (n*(n+1))/2;
        int sum = 0;
        for(int a : arr){
            sum += a;
        }
        System.out.println("Missing Num : "+(actualSum-sum));

        // 2nd Solution
        int actualXor = 0;
        int calcXor = 0;

        for(int i = 0; i<arr.length; i++){
            actualXor ^= i+1;
            calcXor ^= arr[i];
        }
        actualXor ^= n;
        System.out.println("Missing Num Using XOR : "+(actualXor^calcXor));
    }
}
