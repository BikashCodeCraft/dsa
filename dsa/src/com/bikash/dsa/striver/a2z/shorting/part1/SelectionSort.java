package com.bikash.dsa.striver.a2z.shorting.part1;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        // Select minimums and swap :   Swap at index 0 and minIndex [0 to n-1]
        //                              Swap at index 1 and minIndex [1 to n-1]
        //                              Swap at index 2 and minIndex [2 to n-1]

        for(int i=0; i<arr.length-1; i++){
            int minIndex = i;
            for(int j=i; j<arr.length; j++){
                if(arr[j]<arr[i]){
                    minIndex=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        for (int i: arr){
            System.out.print(i +" ");
        }
    }
}
