package com.bikash.dsa.striver.a2z.shorting.part1;

public class InsertionSort {
    // Compare with one position back from the current position and swap each time.

    public static void main(String[] args) {
        int[] arr = {14,9,15,12,6,8,13};
        for(int i=1; i<arr.length; i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                //Swap
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }

        for (int i : arr){
            System.out.print(i+" ");
        }
    }

}
