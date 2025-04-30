package com.bikash.dsa.striver.a2z.arrays.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;

public class LargestInArray {
    //Given an array, we have to find the largest element in the array.

    public static void main(String[] args) {
        int[] arr = {3,2,1,5,2};
        int largest = 0;
        int count = 0;
        for(int i=1; i<arr.length; i++){
            count++;
            if(arr[i]>arr[largest]){
                largest=i;
            }
        }
        System.out.println("Largest : "+ arr[largest]);

        System.out.println(get(arr));
        System.out.println("C : "+count);
    }

    public static int get(int[] arr){
        return Arrays.stream(arr)
                .max().orElse(0);
    }
}
