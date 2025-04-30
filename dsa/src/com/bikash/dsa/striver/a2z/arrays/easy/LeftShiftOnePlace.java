package com.bikash.dsa.striver.a2z.arrays.easy;

public class LeftShiftOnePlace {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int i=0; i<arr.length-1; i++){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
        }

        int[] arr1 = {1,2,3,4,5};
        alt(arr1);
        for (int i : arr){
            System.out.print(i+" ");
        }
        int[] arr2 = {1,2,3,4,5};
        System.out.println("RightShift : ");
        rightShift(arr2);
    }

    public static void alt(int[] arr){
        int temp = arr[0];
        for(int i=1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        for (int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void rightShift(int[] arr){
        int temp = arr[arr.length-1];
        for(int i=arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        for (int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
