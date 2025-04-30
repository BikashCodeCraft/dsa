package com.bikash.dsa.striver.a2z.searching.binary;

public class LowerBound {
    // Question : Find the smallest index that satisfies arr[index] >= target
    //Eg : [2,3,5,7,8,9,11,15] target = 7, O/P : 3, target = 10, O/P : 6
    // target = 20, O/P : size of Arr.

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 8, 9, 11, 15};
        int target = 10;
        int result = optimal(arr, target);
        System.out.println(result);
    }

    public static int optimal(int[] arr, int target) {
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
