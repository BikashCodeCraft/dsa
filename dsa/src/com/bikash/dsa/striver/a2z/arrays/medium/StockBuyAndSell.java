package com.bikash.dsa.striver.a2z.arrays.medium;

public class StockBuyAndSell {

    public static void main(String[] args) {
        int[] arr = {7,4,5,3,6,1,9};
//        System.out.println(brute(arr));
        System.out.println(optimalWithIndex(arr));
    }

    // TC : O(n square)
    public static int brute(int[] nums){
        int profit = 0;
        for(int i = nums.length-1; i>=0;i--){
            for(int j=i-1; j>=0; j--){
                profit = Math.max(profit, nums[i]-nums[j]);
            }
        }
        return profit;
    }


    // TC : O(n)
    // SC : O(1)
    public static int optimal(int[] nums){
        int buyAtMin = nums[0];
        int profit = 0;
        for(int sellAt=1; sellAt<nums.length; sellAt++){
            int newProfit = nums[sellAt]-buyAtMin;
            profit= Math.max(profit,newProfit);
            buyAtMin = Math.min(buyAtMin, nums[sellAt]);
        }
        return profit;
    }

    public static int optimalWithIndex(int[] nums){
        int buyAtMin = nums[0];
        int profit = 0;
        int buyIndex = 0;
        int sellIndex = 0;
        int set = 0;
        for(int i=1; i<nums.length; i++){
            int cost = nums[i]-buyAtMin;
            if(nums[i]<buyAtMin){
                buyAtMin = nums[i];
                set = i;
            }
            if(cost>profit){
                profit = cost;
                buyIndex = set;
                sellIndex = i;
            }

        }
        System.out.println("Buy At Price : "+ nums[buyIndex]);
        System.out.println("Sell at Price : "+ nums[sellIndex]);
        return profit;
    }
}
