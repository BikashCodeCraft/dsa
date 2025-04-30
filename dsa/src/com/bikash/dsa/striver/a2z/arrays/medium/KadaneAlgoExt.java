package com.bikash.dsa.striver.a2z.arrays.medium;

public class KadaneAlgoExt {
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,2,-3};
//        System.out.println(brute(arr));
        System.out.println(optimal(arr));
    }

    public static int brute(int[] nums){
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i< nums.length; i++){
            int sum =0;
            for(int j=i; j<nums.length; j++){
                sum += nums[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }


    // TC : O(n)
    // SC : O(1)
    public static int optimal(int[] nums){
        int max= nums[0];
        int sum = 0;
        int start = 0;
        int ansEnd = -1;
        int ansStart = -1;
        for(int i=0; i<nums.length; i++){
            if(sum==0) start =i;
            sum+=nums[i];
            if(sum>max){
                max = sum;
                ansStart = start;
                ansEnd=i;
            }
            if(sum<0){
                sum = 0;
            }
        }
        for (int i = ansStart; i<=ansEnd; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        return max;
    }
}
