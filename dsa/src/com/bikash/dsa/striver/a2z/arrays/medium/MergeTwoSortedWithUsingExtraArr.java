package com.bikash.dsa.striver.a2z.arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedWithUsingExtraArr {

    /*
    I/P :
        arr1 = {2,4,6,8}
        arr2 = {1,3,5,7}
    O/P :
        arr3 = {1,2,3,4,5,6,7,8}

        Hint : Use two pointer.
     */

    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 8};
        int[] arr2 = {1, 3, 5, 7};
        merge(arr1, arr2);
    }

    public static void merge(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        List<Integer> lst = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] > arr2[j]) {
                lst.add(arr2[j++]);
            } else {
                lst.add(arr1[i++]);
            }
        }
        while (i <= arr1.length-1) {
            lst.add(arr1[i++]);
        }
        while (j <= arr2.length-1) {
            lst.add(arr2[j++]);
        }
        int[] arr3 = lst.stream().mapToInt(Integer::intValue).toArray();
//        System.out.println(lst);
        for(int a : arr3){
            System.out.print(a+", ");
        }
    }
}
