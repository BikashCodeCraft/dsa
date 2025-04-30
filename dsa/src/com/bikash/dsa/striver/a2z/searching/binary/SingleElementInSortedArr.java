package com.bikash.dsa.striver.a2z.searching.binary;

public class SingleElementInSortedArr {

    /*
        Problem Statement: Given an numsay of N integers. Every number in the nums array except one appears twice.
        Find the single number in the numsay.
        Example 1:
            Input Format: nums[] = {1,1,2,2,3,3,4,5,5,6,6}
            Result: 4
            Explanation: Only the number 4 appears once in the numsay.

        Example 2:
            Input Format: nums[] = {1,1,3,5,5}
            Result: 3
            Explanation: Only the number 3 appears once in the numsay.
        Observation :
           1.  All the pair of duplicate like (1,1) (2,2) (3,3) - are (even,odd) index
           which means element is to the right half hence eliminate the left half.
           2. Similarly, All the pair of duplicate like (5,5) (6,6) - are (odd, even) index
           which means element is to the left half hence eliminate the right half.
     */
    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        int[] nums1 = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        int result = optimal(nums1);
        System.out.println(result);
    }

    public static int optimal(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0]; // Edge case : here if mid is 0 then mid-1 will out of bound, similarly below.
        if (nums[nums.length - 1] != nums[nums.length - 2]) return nums[nums.length - 1];

        int low = 1;
        int high = nums.length - 2;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]) return nums[mid];
            if ((mid % 2 == 1 && nums[mid - 1] == nums[mid]) || (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
