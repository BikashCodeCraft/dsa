package com.bikash.dsa.striver.a2z.recursion.medium.p2;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumWithDup {

    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
//        getCombination(0,arr,new ArrayList<>(), 0,11);
        List<List<Integer>> result = new ArrayList<>();
        getCombination(0,arr,new ArrayList<>(),7,result);
        System.out.println(result);
    }

    // With using sum variable
    public static void getCombination(int i, int[] arr, List<Integer> list, int sum, int target){
        if(i>=arr.length || target<=sum){
           if(target==sum) System.out.println(list);
           return;
        }
        list.add(arr[i]);
        sum += arr[i];
        getCombination(i, arr, list, sum,target);
        list.remove(Integer.valueOf(arr[i]));
        sum -= arr[i];
        getCombination(i+1, arr, list,sum, target);
    }

    // Without using sum variable
    public static void getCombination(int i, int[] arr, List<Integer> list, int target, List<List<Integer>> result){
        if(i>=arr.length || target<arr[i]){
            if(target==0) {
                result.add(new ArrayList<>(list));
            }
            return;
        }
        list.add(arr[i]);
        target -= arr[i];
        getCombination(i, arr, list, target, result);
        list.removeLast();
        target += arr[i];
        getCombination(i+1, arr, list, target, result);
    }
}
