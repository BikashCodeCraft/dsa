package com.bikash.dsa.question.arrays.easy;

public class CheckIfArrSorted {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,5};
        optimal(arr);
    }

    public static void optimal(int[] arr){
        boolean flag = false;
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("Array is UnSorted");
        } else {
            System.out.println("Array is Sorted");
        }

    }
}
