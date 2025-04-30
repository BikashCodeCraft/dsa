package com.bikash.dsa.striver.a2z.hashing;

import java.util.*;

public class HashUsingMap {

    public static void main(String[] args) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int[] arr = {1,2,3,1,3,2,12,1};
        for(int i=0; i< arr.length; i++){
            hmap.put(arr[i], hmap.get(arr[i])==null?1: hmap.get(arr[i])+1);
        }
        Integer[] find = {1,2,3,4,12};
        for (Integer j : find){
            System.out.println(j+" : "+hmap.get(j));
        }
        Map.Entry<Integer, Integer> highest = null;
        Map.Entry<Integer, Integer> lowest = null;
        Integer highestFreq = 0;
        Integer lowestFreq = 1;
        for(Map.Entry<Integer, Integer> e : hmap.entrySet()){
            if(e.getValue()>=highestFreq){
                highest = e;
                highestFreq=e.getValue();
            }
            if (e.getValue()<=lowestFreq){
                lowest=e;
                lowestFreq=e.getValue();
            }

        }
        System.out.println("Highest Key : "+highest.getKey()+" Highest Value : "+highest.getValue());
        System.out.println("Lowest Key : "+lowest.getKey()+" Lowest Value : "+lowest.getValue());

        hmap.entrySet().stream().forEach(System.out::println);


        //Find min and max frequency
        hmap.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Comparator.comparingLong(Map.Entry::getValue)))
                .filter(entry-> entry.getValue()==1 || entry.getValue()==3)
                .forEach(System.out::println);

    }
}
