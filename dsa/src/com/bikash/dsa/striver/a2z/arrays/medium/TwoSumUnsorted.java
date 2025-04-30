package com.bikash.dsa.striver.a2z.arrays.medium;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TwoSumUnsorted {

    /*
        I/P : arr = {2,7,1,8,9,4} , target = 15

        O/P : [8,7]
    */

    public static void main(String[] args) {
        int[] arr = {2,7,1,8,9,4,6};
        int target = 12;
        optimal(arr, target);
    }

    public static void optimal(int[] arr, int k){
        Map<Integer, Integer> hmap = new LinkedHashMap<>();
        for (int j : arr) {
            if (hmap.containsKey(j)) {
                System.out.println("["+j+","+hmap.get(j)+"]");
            }else{
                hmap.put(k-j, j);
            }
        }
    }
}
