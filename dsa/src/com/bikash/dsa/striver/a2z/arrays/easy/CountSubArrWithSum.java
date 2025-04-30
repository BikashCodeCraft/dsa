package com.bikash.dsa.striver.a2z.arrays.easy;

import java.util.HashMap;

public class CountSubArrWithSum {

    public static void main(String[] args) {
        int[] arr = {3,-3,1,1,1};
        optimal(arr, 3);
        int[] arrBetter = {3,-3,1,1,1};
        better(arrBetter,3);
    }

    //Prefix sum is the sum with arr[i] as last element, to exist a sub array sum with 'k'
    // there should be a sub array of prefixSum-k,
    // because if the sum of subArray to be k with arr[i] as last element in it
    // the remaining subArray sum should be prefixSum-k. => [. . . . . .]
    public static void optimal(int[] arr, int k){
        HashMap<Integer, Integer> hmap = new HashMap<>();
        hmap.put(0,1);
        int prefixSum = 0;
        int count = 0;
        for(int i=0; i<arr.length; i++){
            prefixSum+=arr[i];
            if(hmap.containsKey(prefixSum-k)){
                count += hmap.get(prefixSum-k); //There could be multiple sub array whose sum could be (prefixSum-k)
            }
            if(!hmap.containsKey(prefixSum)){
                hmap.put(prefixSum,1);
            } else {
                hmap.put(prefixSum, hmap.get(prefixSum)+1);
            }
//            if(prefixSum==k){
//                count++;
//            }
        }
        System.out.println("Count sum arr : "+ count);

    }

//    TC : O(n*n)
    public static void better(int[] arr, int k){
        int count = 0;
        for (int i=0; i<arr.length; i++){
            int sum=0;
            for(int j=i; j<arr.length;j++){
                sum+=arr[j];
                if(sum==k){
                    count++;
                }
            }
        }
        System.out.println("Max arr of count : "+ count);
    }
}
