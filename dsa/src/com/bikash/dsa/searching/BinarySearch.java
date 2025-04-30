package com.bikash.dsa.searching;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {-15, -5, 1, 8, 24, 46, 67, 75, 88, 98};
        System.out.println(search(-15, arr));
    }

    public static int search(int value, int[] arr){
        int start = 0;
        int end=arr.length;

        while (start<end){
            int mid = (start+end) / 2;
            if(value == arr[mid]){
                return mid;
            } else if (value>arr[mid]) {
                start = mid+1;
            }else {
                end=mid;
            }

        }
        return -1;
    }
}
