package com.bikash.dsa.striver.a2z.recursion;

public class ReverseNumInArray {

    public static int[] arr = {2,1,3,4,2,5};
    public static void main(String[] args) {
//        int x = 5;
//        int y =6;
//        System.out.println(x+", "+y);
//        x = x+y;
//        y = x-y;
//        x = x-y;
//        System.out.println(x+", "+y);
//        int[] arr = {2,1,3,4,2,5};
        for (int i : arr){
            System.out.print(i+" ");
        }
//        reverseArr(0, arr.length-1);
        reverse(0, arr, arr.length);
        System.out.println();
        for (int i : arr){
            System.out.print(i+" ");
        }
    }

//    public static void reverseArr(int[] arr, int a, int n){
//        if(a>=n) return;
//        int temp = arr[a];
//        arr[a] = arr[n];
//        arr[n] = temp;
////        arr[a] = arr[a] + arr[n];
////        arr[n] = arr[a] - arr[n];
////        arr[a] = arr[a] - arr[n];
//        reverseArr(arr, ++a, --n);
//    }

    //Reverse using two pointers
    public static void reverseArr(int a, int n){
        if(a>=n) return;
        int temp = arr[a];
        arr[a] = arr[n];
        arr[n] = temp;
        reverseArr(++a, --n);
    }

    //Reverse without two pointers
    public static void reverse(int i, int[] arr, int n){
        if(i>=n/2) return;
        //Swap 0,n-1
        int temp = arr[i];
        arr[i] = arr[n-1-i];
        arr[n-1-i] = temp;
        reverse(++i, arr, n);
    }
}
