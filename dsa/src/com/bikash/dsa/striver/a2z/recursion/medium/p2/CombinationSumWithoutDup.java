package com.bikash.dsa.striver.a2z.recursion.medium.p2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CombinationSumWithoutDup {

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2};
        int target = 4;
        // Sort the arr if not sorted
//        HashSet<List<Integer>> result = new HashSet<>();
//        brute(0, arr, new ArrayList<>(), target, result);
//        System.out.println(result);
        List<List<Integer>> result = new ArrayList<>();
        optimal(0, arr,new ArrayList<>(), target, result);
        System.out.println(result);

    }

    // O(2^n * klogn) => 2^n for each index either take or not take, klogn => to insert a list into a Hash set(it takes logn to compare)
    public static void brute(int i, int[] arr, List<Integer> list, int target, HashSet<List<Integer>> result){

        if(i>=arr.length || target<=0){
            if(target==0){
                result.add(new ArrayList<>(list));
            }
            return;
        }

        list.add(arr[i]);
        target -= arr[i];
        brute(i+1, arr,list, target, result);
        list.removeLast();
        target += arr[i];
        brute(i+1, arr, list, target, result);
    }


    public static void optimal(int index, int[] arr, List<Integer> list, int target, List<List<Integer>> result){
        if(target==0){
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i=index; i<arr.length; i++){
            if(i>index && arr[i] == arr[i-1]) continue;
            if(arr[i]>target) break;

            list.add(arr[i]);
            optimal(i+1, arr,list,target-arr[i], result);
            list.removeLast();
        }

    }
}
