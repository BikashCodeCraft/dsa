package com.bikash.dsa.question.arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
//        int[] sortedArr = {2,5,7,8,9,12,16};
//        optimalSorted(sortedArr, 20);

        int[] unSortedArr = {5,2,8,9,12,7};
        optimalUnSorted(unSortedArr,20);
    }

    public static void optimalSorted(int[] arr, int target){
        int i = 0;
        int j = arr.length-1;
        while (i<j){
            if(arr[i]+arr[j] == target){
                System.out.println("Indexes are : "+i+", "+j+" and numbers are : "+arr[i]+", "+arr[j]);
                break;
            } else if (arr[i]+arr[j] > target) {
                j--;
            } else {
                i++;
            }
        }
    }

    public static void optimalUnSorted(int[] arr, int target){
        Map<Integer, Integer> hmap= new HashMap<>();

        for(int i = 0; i< arr.length; i++){
            if(hmap.containsKey(target-arr[i])){
                System.out.println("Indexes are : "+hmap.get(target-arr[i])+", "+i+" and numbers are : "+arr[i]+", "+arr[hmap.get(target-arr[i])]);
            }else{
                hmap.put(arr[i], i);
            }
        }
    }
}
