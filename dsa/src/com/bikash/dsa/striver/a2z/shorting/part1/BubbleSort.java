package com.bikash.dsa.striver.a2z.shorting.part1;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};

        for (int i= arr.length-1; i>0; i--){
            int didSwap = 0;
            for(int j=0; j< i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap++;
                }
            }
            if(didSwap==0) break;
        }

        for (int i : arr){
            System.out.print(i+" ");
        }
    }
}
