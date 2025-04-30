package com.bikash.dsa.striver.a2z.arrays.easy;

public class FindNumOnce {
    // find the number which is only once but other number are twice

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4,5,5};
        System.out.println(optimal(arr));
    }


    // TC : O(n*n)
    // SC : O(1)
    public static int bruite(int[] nums){

        for(int i=0; i<nums.length; i++){
            int count =0;
            for(int j=0; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }

            if(count<=1){
                return nums[i];
            }
        }
        return 0;
    }


    // TC : O(n)
    // SC : O(1)
    public static int optimal(int[] nums){
        int xor = 0;
        for(int i : nums){
            xor^=i;
        }
        return xor;
    }


}
