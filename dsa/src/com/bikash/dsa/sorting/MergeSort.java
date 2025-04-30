package com.bikash.dsa.sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {20,35,-15,7,55,1,-22};
        devide(arr,0, arr.length);
        for(int a : arr){
            System.out.print(a+", ");
        }
    }

    public static void devide(int[] arr, int start, int end){
        if((end-start)<2){
            return;
        }
        int mid = (end+start)/2;
        devide(arr, start, mid);
        devide(arr, mid, end);
        merge(arr, start,mid,end);
    }
    public static void merge(int[] arr, int start, int mid, int end){
        if(arr[mid]>=arr[mid-1]){
            return;
        }
        int i = start;
        int j = mid;
        int tempIdx = 0;
        int[] tempArr = new int[end-start];

        while (i<mid && j<end){
            tempArr[tempIdx++] = arr[i]<=arr[j] ? arr[i++] : arr[j++];
        }
        System.arraycopy(arr, i, arr, start+tempIdx,mid-i);
        System.arraycopy(tempArr,0, arr, start, tempIdx);
    }
}
