package com.bikash.dsa.question.arrays.easy;

public class MoveZeroToEnd {

    public static void main(String[] args) {
        int[] arr = {0,2,0,1,0,5,7,4,0};
        optimal(arr);
    }

    public static void optimal(int[] arr){
        int i = 0;
        int j = arr.length-1;

        while (i<j){
            if(arr[i] == 0 && arr[j] != 0){
                arr[i++] = arr[j];
                arr[j--] = 0;
            } else if (arr[j] == 0) {
                j--;
            } else {
                i++;
            }
        }
        for (int a : arr){
            System.out.print(a+", ");
        }

    }
}
