package com.bikash.dsa.striver.a2z.arrays.easy;

import java.util.*;

public class UnionArr {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 4, 5, 6};
//        int[] union = bruteUnion(arr1, arr2);
//        for (int i : union) {
//            System.out.print(i + " ");
//        }
        System.out.println(optimalUnion(arr1, arr2));

    }

    //TC : O(n1logn)+O(n2logn)+O(n1+n2)
    //SC : O(2(n1+n2))
    public static int[] bruteUnion(int[] arr1, int[] arr2) {
        Set<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < arr1.length; i++) {       // O(n1)        n1: size of arr1
            treeSet.add(arr1[i]);               // O(logn)
        }                                       // Mul : O(n1logn)

        for (int i = 0; i < arr2.length; i++) {       // O(n2)        n2: size of arr2
            treeSet.add(arr2[i]);               // O(logn)
        }                                        // Mul : O(n2logn)

        int[] union = new int[treeSet.size()];
        Iterator<Integer> setItr = treeSet.iterator();
        int j = 0;
        while (setItr.hasNext()) {               // O(n1+n2)         worst case when all elemens are unique.
            union[j] = setItr.next();
            j++;
        }
        return union;

    }

    // TC : O(n1+n2)  exactly once both the array was iterated in whole method
    // SC : O(n1+n2)
    public static List<Integer> optimalUnion(int[] arr1, int[] arr2) {
        List<Integer> union = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                if (!union.contains(arr1[i])) {
                    union.add(arr1[i]);
                }
                i++;
            } else {
                if (!union.contains(arr2[j])) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }

        while (i < arr1.length) {
            if (!union.contains(arr1[i])) {
                union.add(arr1[i]);
            }
            i++;
        }


        while (j < arr2.length) {
            if (!union.contains(arr2[j])) {
                union.add(arr2[j]);
            }
            j++;
        }


        return union;
    }
}
