package com.bikash.dsa.question.arrays.easy;

public class FinLarAndSmallest {

    public static void main(String[] args) {
        int[] arr = {2,5,1,4,8,3,9,6,7};
        optimal(arr);
    }

    public static void optimal(int[] arr){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int a : arr){
            if(a>largest){
                largest=a;
            }
            if (a<smallest){
                smallest = a;
            }
        }
        System.out.println("Largest : "+ largest);
        System.out.println("Smallest : "+ smallest);
    }
}
