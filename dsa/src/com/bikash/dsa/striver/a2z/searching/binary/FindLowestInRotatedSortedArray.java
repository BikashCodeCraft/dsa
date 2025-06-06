package com.bikash.dsa.striver.a2z.searching.binary;

public class FindLowestInRotatedSortedArray {
    /*
        Problem Statement: Given an integer array arr of size N, sorted in ascending order (with distinct values).
        Now the array is rotated between 1 to N times which is unknown. Find the minimum element in the array.

        Example 1:
            Input Format: arr = [4,5,6,7,0,1,2,3]
            Result: 0
            Explanation: Here, the element 0 is the minimum element in the array.

        Example 2:
            Input Format: arr = [3,4,5,1,2]
            Result: 1
            Explanation: Here, the element 1 is the minimum element in the array.

     */

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        int result = optimal(arr);
        System.out.println(result);
    }


    public static int optimal(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int result = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = (low + high) / 2;
            //Left sorted
            if (nums[low] <= nums[mid]) {
                result = Math.min(result, nums[low]);
                low = mid + 1;
            } else {  // Right Sorted
                result = Math.min(result, nums[mid]);
                high = mid - 1;
            }
        }
        return result;
    }
}
