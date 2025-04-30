package com.bikash.dsa.striver.a2z.arrays.easy;

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        System.out.println(linearBrute(arr,7));
    }

    public static int linearBrute(int[] arr, int num){
        for(int i=0; i<arr.length;i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }
}
