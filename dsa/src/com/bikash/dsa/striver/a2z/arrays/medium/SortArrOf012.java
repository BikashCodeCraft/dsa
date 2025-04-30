package com.bikash.dsa.striver.a2z.arrays.medium;

import java.util.Arrays;


public class SortArrOf012 {

    public static void main(String[] args) {
        int[] arr = {0,1,1,0,1,2,1,2,0,0,0};
//        brute(arr);
//        better(arr);
        optimalDutchFlagAlgo(arr);
        for (int a : arr){
            System.out.print(a+" ");
        }
    }

    // TC : O(nlog n) //Implement the merge sort for brute force
    // SC : O(n)
    public static void brute(int[] nums){
        Arrays.sort(nums);
        for (int i : nums){
            System.out.print(i + " ");
        }
    }


    // TC : O(2n)
    // SC : O(1)
    public static void better(int[] nums){
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int num : nums) {
            if (num == 0) {
                count0++;
            } else if (num == 1) {
                count1++;
            } else {
                count2++;
            }
        }
        for(int i=0; i<nums.length; i++){
            if(i<count0){
                nums[i] = 0;
            } else if ((i-count0)<count1) {
                nums[i] = 1;
            }else {
                nums[i] = 2;
            }
        }
    }


    // TC : O(n)
    // SC : O(1)
    public static void optimalDutchFlagAlgo(int[] nums){
        int mid = 0;
        int low = 0;
        int high = nums.length-1;

        while(mid<=high){
            if(nums[mid] == 0){
                swap(mid,low,nums);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(mid,high,nums);
                high--;
            }
        }
    }

    public static void swap(int to, int from, int[] nums){
        int temp = nums[to];
        nums[to] = nums[from];
        nums[from] = temp;
    }
}
