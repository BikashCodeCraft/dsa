package com.bikash.dsa.striver.a2z.arrays.medium;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MajorityElement {

    public static void main(String[] args) {
        int[] arr = {2,2,3,3,1,3,3,3};
//        System.out.println(betterJava8(arr));
        int[] arr1 = {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
        System.out.println(optima(arr1));
    }

    // TC : O((n+1)log n) ~ O(nlog n)
    // SC : O(n)
    public static int better(int[] nums){
        Map<Integer, Integer> hmap = new HashMap<>();
        for (int i : nums){                     // O(n)
            if (hmap.containsKey(i)){
                hmap.put(i, hmap.get(i)+1);
            } else {
                hmap.put(i,1);                  // O(log n)
            }
        }
        for (Map.Entry<Integer, Integer> entry : hmap.entrySet()){          // O(log n)
            if(entry.getValue()>nums.length/2){
                return entry.getKey();
            }
        }
        return -1;
    }

    public static int betterJava8(int[] nums){
        Map.Entry<Integer, Long> entry = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .get();
        System.out.println(entry.getKey()+"  "+ entry.getValue());
        if(entry.getValue()>nums.length/2){
            return entry.getKey();
        }else {
            return -1;
        }

    }

    // Moore's Voting Algorithm [Increment on majEl and Decrement on non majEl]
    // TC : O(2n)
    // SC : O(1)
    public static int optima(int[] nums){
        int majorityElement = nums[0];
        int count = 0;
        for( int num : nums){               // O(n)
            if(count==0){
                majorityElement=num;
                count++;
            } else if(num==majorityElement){
                count++;
            }else{
                count--;
            }
        }
        count=0;
        for (int num : nums){           //O(n)
            if(num == majorityElement){
                count++;
            }
        }
        if(count > nums.length/2){
            return majorityElement;
        }else {
            return -1;
        }

    }
}
