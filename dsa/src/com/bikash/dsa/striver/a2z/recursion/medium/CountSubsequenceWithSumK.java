package com.bikash.dsa.striver.a2z.recursion.medium;

public class CountSubsequenceWithSumK {

    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int target = 2;
        System.out.println("Total subseq Count : "+ getSubSeqCount(0, arr,0, target));
    }

    public static int getSubSeqCount(int i, int[] arr, int sum, int target){
        if(i>=arr.length){
            if(sum==target){
                return 1;
            }else {
                return 0;
            }
        }

        sum += arr[i];
        int l =getSubSeqCount(i+1, arr, sum, target);
        sum -= arr[i];
        int r = getSubSeqCount(i+1, arr, sum, target);
        return l+r;
    }
}
