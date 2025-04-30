package com.bikash.dsa.question.arrays.easy;

public class ReverseArr {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        optimal(arr);
    }

    public static void optimal(int[] arr){
        int i = 0;
        int j= arr.length-1;
        while (i<j){
            int temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
//            arr[i] = arr[i]+arr[j];
//            arr[j] = arr[i] - arr[j];
//            arr[i] = arr[i] - arr[j];
//            i++;
//            j--;
        }
        for (int a : arr){
            System.out.print(a+", ");
        }
    }
}
