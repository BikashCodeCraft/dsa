package com.bikash.dsa.striver.a2z.slidingWindow;

public class MaxConsOnes {

    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        impl(arr,2);
    }
//Find max consecutive ones allowed k zeros to flip.
    public static void impl(int[] arr, int k){
        int left = 0;
        int right = 0;
        int len = 0;
        int zeros = 0;
        while (right< arr.length){
            if(arr[right]==0) zeros++;
            if(zeros<=k){
                len = Math.max(len, right-left+1);
            }else{
                if(arr[left] == 0) zeros--;
                left++;
            }
            right++;
        }
        System.out.println("MaxLen : "+len);
    }
}
