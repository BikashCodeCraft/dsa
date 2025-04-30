package com.bikash.dsa.striver.a2z.arrays.easy;

public class FindTheMissingNum {
    //Find the missing num from the given array of size n.

    public static void main(String[] args) {
        int[] arr = {1,2,7,4,5,6};
        System.out.println("Brute : "+brutr(arr));
        System.out.println("Better : "+better(arr, 7));
        System.out.println("Optimal : "+optimal(arr,7));
        System.out.println("Optimal Xor : "+optimalXor(arr, 7));
    }


    // TC: O(n*n)
    // SC : O(1)
    public static int brutr(int[] arr){
        int n = arr.length+1;

        for(int i=1; i<=n; i++){
            int flag = 0;
            for(int j=0; j< arr.length; j++){
                if(arr[j] == i){
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                return i;
            }
        }
       return -1;
    }

    // TC : O(n) + O(n-1) = O(2n)
    // SC : O(n)
    public static int better(int[] arr, int n){
        int[] hashArr = new int[n];
        for (int i=0; i<arr.length; i++){
            hashArr[arr[i]% hashArr.length] = 1;
        }
        for(int j=1; j<hashArr.length; j++){
            if(hashArr[j] != 1){
                return j;
            }
        }
        return hashArr.length;
    }

    // TC : O(n)
    // SC : O(1)
    public static int optimal(int[] arr, int n){
        int sum = (n * (n+1))/2;
        int sumArr = 0;
        for(int i=0; i<arr.length; i++){
            sumArr+=arr[i];
        }
        return sum-sumArr;
    }

    // TC : O(n)
    // SC : O(1)
    public static int optimalXor(int[] arr, int n){
        int xor1 = 0;
        int xor2 =0;
        for(int i=0; i<arr.length-1; i++){
            xor2 = xor2^arr[i];
            xor1 = xor1 ^ (i+1);
        }
        xor1 = xor1 ^ n;
        return xor1^xor2;
    }
}
