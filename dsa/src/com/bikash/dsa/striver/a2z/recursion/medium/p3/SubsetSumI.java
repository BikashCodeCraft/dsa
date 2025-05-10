package com.bikash.dsa.striver.a2z.recursion.medium.p3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsetSumI {

    public static void main(String[] args) {
        int[] arr = {3,1,2};
        List<Integer> result = new ArrayList<>();
        getSumOfAllSeq(0, arr, 0, result);
        Collections.sort(result);
        System.out.println(result);

    }

    public static void getSumOfAllSeq(int i, int[] arr, int sum, List<Integer> result){
        if(i>=arr.length){
            result.add(sum);
            return;
        }
        getSumOfAllSeq(i+1, arr, sum+arr[i], result);
        getSumOfAllSeq(i+1, arr, sum, result);
    }
}
