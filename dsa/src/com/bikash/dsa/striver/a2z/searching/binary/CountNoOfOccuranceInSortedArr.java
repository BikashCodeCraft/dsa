package com.bikash.dsa.striver.a2z.searching.binary;

import java.util.List;

public class CountNoOfOccuranceInSortedArr {

    /*
        Problem Statement: You are given a sorted array containing N integers and a number X, you have to
        find the occurrences of X in the given array.
        Example 1:
            Input: N = 7,  X = 3 , array[] = {2, 2 , 3 , 3 , 3 , 3 , 4}
            Output: 4
            Explanation: 3 is occurring 4 times in the given array so it is our answer.

        Example 2:
            Input: N = 8,  X = 2 , array[] = {1, 1, 2, 2, 2, 2, 2, 3}
            Output: 5
            Explanation: 2 is occurring 5 times in the given array so it is our answer.
    */

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,8,8,8,8};
        int target1 = 8;
        int[] arr1 = {2, 2 , 3 , 3 , 3 , 3 , 4};
        int target2 = 3;
        int[] arr3 = {1, 1, 2, 2, 2, 2, 2, 3};
        int target3 = 4;

        List<Integer> test1 = FirstAndLastOccurrence.optimal(arr,target1);
        System.out.println(test1.get(0)>0?test1.get(1)-test1.get(0)+1:0);
        List<Integer> test2 = FirstAndLastOccurrence.optimal(arr1,target2);
        System.out.println(test2.get(0)>0?test2.get(1)-test2.get(0)+1:0);
        List<Integer> test3 = FirstAndLastOccurrence.optimal(arr3,target3);
        System.out.println(test3.get(0)>0?test3.get(1)-test3.get(0)+1:0);
    }

}
