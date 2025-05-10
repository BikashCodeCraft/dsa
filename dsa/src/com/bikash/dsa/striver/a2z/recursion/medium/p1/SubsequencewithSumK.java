package com.bikash.dsa.striver.a2z.recursion.medium.p1;

import java.util.ArrayList;
import java.util.List;

public class SubsequencewithSumK {

    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int target = 2;
        getSubsequence(0, arr,new ArrayList<>(), 0, target);
    }

    public static void getSubsequence(int i, int[] arr, List<Integer> list, int sum, int target){
        if(i>=arr.length){
            if(sum==target){
                System.out.println(list);
            }
            return;
        }
        list.add(arr[i]);
        sum+=arr[i];
        getSubsequence(i+1, arr, list, sum, target);
        list.remove(Integer.valueOf(arr[i]));
        sum-=arr[i];
        getSubsequence(i+1, arr,list, sum, target);
    }
}
