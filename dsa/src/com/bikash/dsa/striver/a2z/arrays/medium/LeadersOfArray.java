package com.bikash.dsa.striver.a2z.arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class LeadersOfArray {
    public static void main(String[] args) {
//        brute();
        optimal();
    }

    public static void brute() {
        int[] arr = {10, 22, 12, 3, 0, 6};
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int leader = arr[i];
            int j = i + 1;
            for (; j < arr.length; j++) {
                if (leader < arr[j]) {
                    break;
                }
            }
            if (j == arr.length) {
                result.add(leader);
            }
        }
        System.out.println("Leaders are : " + result);
    }


    public static void optimal(){
        int[] arr = {10, 22, 12, 3, 0, 6};
        List<Integer> res = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i = arr.length-1; i>=0; i--){
            if(arr[i]>max){
                res.add(arr[i]);
                max = arr[i];
            }
        }

        System.out.println("Leaders are : "+res);
    }
}
