package com.bikash.dsa.striver.a2z.arrays.easy;

public class CheckIfArrSorted {

    // Check if array is sorted
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,5};
        int[] arr1 = {1,2,3,4,5};

        System.out.println(check(arr));
        System.out.println(check(arr1));
    }

    public static boolean check(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
