package com.bikash.dsa.striver.a2z.searching.binary;

public class SearchInsertPosition {
    // Question : Given a sorted distinct array return the index if the target is found
    // else return the index such that inserting at that index will maintain the sorted array

    // Solution : It is same as Lower bound, we have to find the smallest index which is greater than the target

    public static void main(String[] args) {
        int[] arr = {1,2,4,7};
        int target = 3;
        int result = optimal(arr,target);
        System.out.println(result);
    }
    public static int optimal(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        int result = arr.length;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (arr[mid] >= target) {
                result = mid;
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return result;
    }
}
