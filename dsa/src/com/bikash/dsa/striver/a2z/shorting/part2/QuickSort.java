package com.bikash.dsa.striver.a2z.shorting.part2;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        quickSort(arr,0,arr.length-1);
        for(int a : arr){
            System.out.print(a+", ");
        }
    }

    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {
        int pivot = placePivot(arr, low, high);
//        int pivot = placePivotForDesc(arr, low, high);
        quickSort(arr, low, pivot-1);
        quickSort(arr, pivot+1, high);
        }
    }

    public static int placePivot(int[] arr, int low, int high){
        int pivot = low;
        int i = low;
        int j = high;

        while (i<j){
            while (i<=high && arr[i]<=arr[pivot]){
                i++;
            }
            while (j>=low && arr[j]>arr[pivot]){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[j];
        arr[j] = arr[pivot];
        arr[pivot] = temp;

        return j;
    }

    public static int placePivotForDesc(int[] arr, int low, int high){
        int pivot = low;
        int i=low;
        int j = high;
        while (i<j){
            while (arr[i]>=arr[pivot] && i<=high){
                i++;
            }
            while (arr[j]<=arr[pivot] && j>low){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        int temp = arr[j];
        arr[j] = arr[pivot];
        arr[pivot] = temp;

        return j;
    }
}
