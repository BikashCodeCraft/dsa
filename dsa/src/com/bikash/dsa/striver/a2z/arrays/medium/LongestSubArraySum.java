package com.bikash.dsa.striver.a2z.arrays.medium;

import java.util.HashMap;

public class LongestSubArraySum {

    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 1, 1, 1, 1, 1, 4, 2, 3};
//        int[] arr1 = {2, 0, 0, 0, 3};
//        System.out.println(brute(arr, 10));
//        System.out.println(optimal(arr, 11));
//        System.out.println(better(arr1, 3));
        int[] arr = {1,3,4,-1,1,1,4,-3,7,3};
        System.out.println(better(arr, 9));
    }

    // TC : O(n*k)
    // SC : O(1)
    public static int brute(int[] nums, int k) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {   // O(n)
            int sum = 0;
            for (int j = i; j < nums.length; j++) {   //O(k)
                sum += nums[j];
                if (sum == k) {
                    result = Math.max(result, j - i + 1);
                } else if (sum > k) {
                    break;
                }
            }
        }

        return result;
    }

    // TC : O(n log n)
    // SC : O(n)
    // For array containing Negative numbers then this better method is optimal solution,
    //But if an array contain only Positive and zero optimal method is the optimal method
    // [1,3,4,-1,1,1,4,-2,7,3] or [1,2,3,-3,1,1,1,4,2,-3]
    //sum is the prefix sum, to exist a sub array sum with 3 there should be a sub array of sum-k,
    // because till the end point the prefix sum is sum. =>[. . . . . .]
    public static int better(int[] nums, int k) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int length = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == k) {
                length = Math.max(length, i + 1);
            }
            if (hmap.containsKey(sum - k)) {                    // O(log n)
                length = Math.max(length, i - hmap.get(sum - k));
            }
            if (!hmap.containsKey(sum)) {
                hmap.put(sum, i);
            }

        }

        return length;
    }


    //if an array contain only Positive and zero optimal method is the optimal solution
    // TC : O(2n)           [1, 2, 2, 3, 1, 1, 1, 1, 1, 4, 2, 3]    5
    public static int optimal(int[] nums, int k) {
        int length = 0;
        int sum = 0;
        int left = 0;
        int right = 0;
        while (right < nums.length) {
            sum += nums[right];
            while (left<=right && sum > k) {
                sum -= nums[left];
                left++;
            }
            if (sum == k) {
                length = Math.max(length, right - left + 1);
            }
            right++;
        }
        return length;
    }


}
