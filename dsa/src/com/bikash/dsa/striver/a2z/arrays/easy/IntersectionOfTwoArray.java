package com.bikash.dsa.striver.a2z.arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 2, 3, 3, 4, 5, 6};
        int[] arr2 = {2, 3, 3, 4, 4, 5, 6, 6, 7};
//        brute(arr1, arr2);
        System.out.println(optimal(arr1, arr2));

    }


//    public static void brute(int[] arr1, int[] arr2) {
//        List<Integer> result = new ArrayList<>();
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr2.length; j++) {
//                if (arr1[i] == arr2[j]) {
//                    result.add(arr1[i]);
//                }
//            }
//        }
//        System.out.println(result);
//    }

    // TC : O(n1) n1>n2 or O(n2) n2>n1
    // SC : O(n1 or n2)
    public static List<Integer> optimal(int[] arr1, int[] arr2) {

        List<Integer> intersection = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                intersection.add(arr1[i]);
                i++;
                j++;
            } else if (intersection.contains(arr2[j])) {
                j++;
            } else {
                i++;
            }
        }
        return intersection;
    }
}
