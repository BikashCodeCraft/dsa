package com.bikash.dsa.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class BucketSort {
    public static void main(String[] args) {
        int[] intArr = {54, 46, 83, 66, 95, 92, 43};
        bucketSortLogic(intArr);
    }

    public static void bucketSortLogic(int[] arr){
        //1. Create array buckets which will again contain linked list for every bucket
        //2. Initialize the buckets
        //3. Get hash code and insert the Integer according to hashCode
        //4. For every bucket run over the linked sort to sort each bucket
        //5. Merge the elements from oth index bucket till the last.
        //6. return the result.
        List<Integer>[] buckets = new List[10];
        for(int i=0; i< buckets.length; i++){
            buckets[i] = new LinkedList<>();
        }
        for (int j : arr) {
            buckets[getHashCode(j)].add(j);
        }
        for(List bucket : buckets){
            Collections.sort(bucket);
        }
//        for(int i=0; i< buckets.length; i++){
//            if(!buckets[i].isEmpty()){
//                buckets[i] = buckets[i].stream()
//                        .sorted()
//                        .toList();
//            }
//        }
        List<Integer> result = new ArrayList<>();
        for(int i=0; i< buckets.length; i++){
            if(!buckets[i].isEmpty()){
                result.addAll(buckets[i]);
            }
        }
        System.out.println(result);

    }

    public static int getHashCode(int num){
        return num/10;
    }
}
