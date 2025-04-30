package com.bikash.dsa.striver.a2z.arrays.easy;

public class CountMaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,1,0,1,1};
        System.out.println(check(arr));
    }

    // TC : O(n)
    // SC : O(2)
    public static int check(int[] nums){
        int count = 0;
        int result = 0;

        for (int i=0; i< nums.length; i++){
            if(nums[i] == 1){
                count++;
                result = Math.max(count, result);
            }else {
//                if(result<count){
//                    result=count;
                    count=0;
//                }
            }
        }
        return result;
    }
}

