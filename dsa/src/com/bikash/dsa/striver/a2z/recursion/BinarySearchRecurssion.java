package com.bikash.dsa.striver.a2z.recursion;

public class BinarySearchRecurssion {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 7, 15, 16, 18, 19, 27};
        int target = 3;
        int index = checkRecurr(arr, 0, arr.length - 1, target);
        if (index > 0) {
            System.out.println(target + " found at index : " + index);
        } else {
            System.out.println(target + " not found");
        }
    }

    public static int check(int[] arr, int low, int high, int target) {
        if (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                return check(arr, mid + 1, high, target);
            }
            return check(arr, low, mid - 1, target);

        } else {
            return -1;
        }
    }


    // Mine code
    public static int checkRecurr(int[] arr, int low, int high, int target) {
        if (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            return checkRecurr(arr, low,high,target);

        } else {
            return -1;
        }
    }
}
