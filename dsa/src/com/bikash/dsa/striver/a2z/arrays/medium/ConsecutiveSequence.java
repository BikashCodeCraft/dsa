package com.bikash.dsa.striver.a2z.arrays.medium;

import java.util.HashSet;
import java.util.Set;

public class ConsecutiveSequence {

    public static void main(String[] args) {
        int[] arr = {102,4,100,1,101,3,2,1,1,105,104,103};
        getMaxConsecutiveSeq(arr);
    }

    public static void getMaxConsecutiveSeq(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int a : arr){
            set.add(a);
        }
        int length = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                int count=0;
                while (set.contains(num)){
                    count++;
                    num+=1;
                }
                length=Math.max(length,count);
            }
        }
        System.out.println(length);

//        int maxLen = 0;
//        for(int i=0; i<arr.length;i++){
//            int count=0;
//            if(set.contains(arr[i]-1)){
//                int startNum = arr[i]-1;
//                while (set.contains(startNum)){
//                    count++;
//                    startNum=startNum+1;
//                }
//            }
//            maxLen=Math.max(maxLen,count);
//        }
//        System.out.println(maxLen);
    }
}
