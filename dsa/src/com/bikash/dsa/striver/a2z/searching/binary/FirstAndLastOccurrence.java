package com.bikash.dsa.striver.a2z.searching.binary;

import java.util.ArrayList;
import java.util.List;

public class FirstAndLastOccurrence {

    /*
        Given a sorted array of N integers, write a program to find the index of the last occurrence of the target key.
        If the target is not found then return -1.
        Example 1:
            Input: N = 7, target=13, array[] = {3,4,13,13,13,20,40}
            Output: 4
            Explanation: As the target value is 13 , it appears for the first time at index number 2.

        Example 2:
            Input: N = 7, target=60, array[] = {3,4,13,13,13,20,40}
            Output: -1
            Explanation: Target value 60 is not present in the array
     */

    public static void main(String[] args) {
        int[] nums = {1};
        int target = 1;
        List<Integer> result = optimal(nums,target);
        System.out.println(result);
    }

    public static List<Integer> optimal(int[] nums, int target){
        List<Integer> result = new ArrayList<>();
        int firstOcc = -1;
        int lastOcc = -1;
        int left = 0;
        int right = nums.length-1;
        int mid = 0;
        while (left<=right){
            mid = (left+right)/2;
            if(nums[mid]==target){
                break;
            } else if (nums[mid]>target) {
                right = mid-1;
            }else{
                left = mid+1;
            }

        }
        int firstIndex = mid;
        while(firstIndex>=0 && nums[firstIndex] == target){
            firstOcc= firstIndex;
            firstIndex--;
        }
        while(mid<nums.length && nums[mid] == target){
            lastOcc = mid;
            mid++;
        }
        result.add(firstOcc);
        result.add(lastOcc);
        return result;

    }
}
