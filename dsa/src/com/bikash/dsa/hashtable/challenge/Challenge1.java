package com.bikash.dsa.hashtable.challenge;

public class Challenge1 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        int[] numsToAdd = {59382, 43, 6894, 500, 99, -58};

        for(int i=0; i<numsToAdd.length; i++){
            nums[hash(numsToAdd[i])] = numsToAdd[i];
        }
//        for(int j : nums){
//            System.out.println(j);
//        }

        System.out.println("Get : "+nums[hash(99)]);

    }


    public static int hash(int value){
        return Math.abs(value % 10);
    }
}
