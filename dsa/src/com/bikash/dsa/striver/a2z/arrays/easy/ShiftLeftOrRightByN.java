package com.bikash.dsa.striver.a2z.arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class ShiftLeftOrRightByN {

    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7};
////        left(arr,2);
////        optimal(arr,7);
//        leftBetter(arr, 2);
//        for(int i : arr){
//            System.out.print(i+" ");
//        }

        int[] arrRight = {1,2,3,4,5,6,7,8};
//        rightBrute(arrRight,7);
//        rightBetter(arrRight, 15);
        optimalRight(arrRight, 12);
        for(int i : arrRight){
            System.out.print(i+" ");
        }
    }


    //O(nsq.)
    public static void left(int[] arr, int n){
        n=n%arr.length;
        while(n>0){
            int temp = arr[0];
            for(int i=0; i<arr.length-1; i++){
                arr[i] = arr[i+1];
            }
            arr[arr.length-1]=temp;
            n--;
        }

    }
    //TC: O(d+n-d+d) = O(n+d)
    // SC : O(d) temp of size d used
    public static void leftBetter(int[] arr, int d){
        d%=7;
        if(d==0) return;
        List<Integer> temp = new ArrayList<>();
        for(int i=0; i<d; i++){         //O(d)
            temp.add(arr[i]);
        }
        for(int i=d; i<arr.length; i++){            // O(n-d)
            arr[i-d] = arr[i];
        }
        for(int i= arr.length-d; i<arr.length; i++){        //O(d)
            arr[i] = temp.get(i-(arr.length - d));
        }
    }

    // TC : O(2n)
    // SC : O(1)
    public static void optimal(int[] arr, int d){
        d%=7;
        if(d==0) return;
        reverse(arr, 0,d-1);                // O(d) +
        reverse(arr, d, arr.length-1);           //  O(n-d) +
        reverse(arr, 0, arr.length-1);      // O(n)  +
    }

    public static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }



    //TC : O(n*m)
    //SC : O(1)
    public static void rightBrute(int[] arr, int n){
        //[1,2,3,4,5,6,7], n=2
        n=n%arr.length;
        while(n>0){                             //O(n)
            int temp = arr[arr.length-1];
            for(int i=arr.length-1; i>0; i--){      //O(m)
                arr[i] = arr[i-1];
            }
            arr[0] = temp;
            n--;
        }
    }

    //TC : O(n+d)
    //SC : O(d)
    public static void rightBetter(int[] arr, int n){
        n%=arr.length;
        List<Integer> rList = new ArrayList<>();
        int l = arr.length-1;
        for(int i=0; i<n; i++){         // O(d)
            rList.add(arr[l]);
            l--;
        }
        for(int i=arr.length-1; i>=n; i--){     // O(n-d)
            arr[i] = arr[i-n];
        }

        for(int i=0; i<rList.size(); i++){      // (d)
            arr[i] = rList.get(i);
        }

    }

    // O(2n)
    //O(1)
    public static void optimalRight(int[] arr, int d){
        d %= arr.length;
        if(d == 0) return;
        reverse(arr, arr.length-1, arr.length-d);   //O(d)
        reverse(arr, 0, arr.length-1-d);        // O(n-d)
        reverse(arr, 0, arr.length-1);          // O(n)
    }
}
