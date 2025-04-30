package com.bikash.dsa.searching;

import java.util.Arrays;

public class LinearSearch {
    static int[] arr = {98,-5,46,75,24, 1,8,-15,67, 88};
    public static void main(String[] args) {
        System.out.println(search(67));
    }
    public static int search(int num){
        for(int i=0; i<arr.length; i++){
            if(num == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
