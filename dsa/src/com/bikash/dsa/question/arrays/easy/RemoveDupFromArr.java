package com.bikash.dsa.question.arrays.easy;

public class RemoveDupFromArr {

    // Remove Duplicate from sorted array
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,4,5,5,6,6,7,8,8,9,9};
        optimal(arr);
    }

    public static void optimal(int[] arr){
        int i = 0;
        int j = 1;

        while(j<arr.length){
            if(arr[i] != arr[j]){
                arr[++i] = arr[j++];
            }else{
                j++;
            }
        }

        for (int a : arr){
            System.out.print(a+", ");
        }

    }
}
