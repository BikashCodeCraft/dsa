package com.bikash.dsa.striver.a2z.arrays.medium;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {2,3,6,5,8,11};
//        System.out.println(optimal(arr, 20));
//        System.out.println(brute(arr, 11));
//        for (int i : bruteReturnIndex(arr, 17)){
//            System.out.print(i +" ");
//        }
        for (int i : better(arr, 14)){
            System.out.print(i +" ");
        }
    }

// TC : O(n2) slightly less than n square
    public static boolean brute(int[] nums, int target){
        for(int i=0; i<nums.length; i++){
            for(int j= i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    return true;
                }
            }
        }

        return false;
    }


    // TC : O(nlog n)
    // SC : O(n)
    public static int[] better(int[] nums, int target){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] result = new int[2];
        for (int i=0; i<nums.length; i++){
            if(hashMap.containsKey(target-nums[i])){
                result[0] = hashMap.get(target-nums[i]);
                result[1] = i;
                return result;
            }else {
                hashMap.put(nums[i], i);
            }
        }
        return result;
    }

    public static int[] bruteReturnIndex(int[] nums, int target){
        int[] result = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j= i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                   result[0] = i;
                   result[1] = j;
                   return result;
                }
            }
        }

        return result;
    }

    // TC : O(n)
    // SC : O(1)
    //Only if the array is sorted
    public static boolean optimal(int[] nums, int sum){
        int left =0;
        int right = nums.length-1;
        while(left<right){
            if(nums[left] + nums[right] == sum){
                return true;
            } else if (nums[left] + nums[right]>sum) {
                right--;
            }else {
                left++;
            }
        }
        return false;
    }
}
