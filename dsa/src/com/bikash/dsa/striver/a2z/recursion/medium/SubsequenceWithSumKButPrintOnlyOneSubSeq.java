package com.bikash.dsa.striver.a2z.recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceWithSumKButPrintOnlyOneSubSeq {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int target = 2;
        getSubsequenceOnlyOne(0, arr, new ArrayList<>(), 0, target);
    }

    public static boolean getSubsequenceOnlyOne(int i, int[] arr, List<Integer> list, int sum, int target) {
        if (i >= arr.length) {
            if (sum == target) {
                System.out.println(list);
                return true;
            } else {
                return false;
            }
        }
        list.add(arr[i]);
        sum += arr[i];
        if (getSubsequenceOnlyOne(i + 1, arr, list, sum, target))
            return true;
        list.remove(Integer.valueOf(arr[i]));
        sum -= arr[i];
        if(getSubsequenceOnlyOne(i + 1, arr, list, sum, target)) {
            return true;
        }
        return false;
    }
}
