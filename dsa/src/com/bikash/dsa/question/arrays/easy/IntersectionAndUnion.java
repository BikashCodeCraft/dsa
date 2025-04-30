package com.bikash.dsa.question.arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class IntersectionAndUnion {

    public static void main(String[] args) {
        int[] arr1 = {1,2,2,4,5,5,7};
        int[] arr2 = {1,1,2,4,4,5,5,7,7};
        interSection(arr1,arr2);
        union(arr1,arr2);
    }

    public static void interSection(int[] arr1, int[] arr2){
        int i = 0;
        int j = 0;
        List<Integer> result = new ArrayList<>();
        while (i<arr1.length && j<arr2.length){
            if(arr1[i] == arr2[j]){
                result.add(arr1[i]);
                i++;
                j++;
            } else if (result.contains(arr2[j])) {
                j++;
            } else{
                i++;
            }
        }
        System.out.println("Intersection : "+result);
    }

    public static void union(int[] arr1, int[] arr2){
        int i = 0;
        int j = 0;
        List<Integer> result  = new ArrayList<>();
        while (i<arr1.length && i<arr2.length){
            if(arr1[i] <= arr2[j]){
                if(!result.contains(arr1[i])){
                    result.add(arr1[i]);
                }
                i++;
            }else{
                if(!result.contains(arr2[j])){
                    result.add(arr2[j]);
                }
                j++;
            }
        }
        System.out.println("Union : "+result);
    }
}
