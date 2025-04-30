package com.bikash.dsa.striver.a2z.shorting.part2;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {1,5,4,3,2};
        mergeSort(arr,0,arr.length-1);
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void mergeSort(int[] arr, int first, int last){

        if(first>=last) return;

        int mid = (first+last)/2;
        mergeSort(arr, first, mid);
        mergeSort(arr, mid+1, last);
        merge(arr, first, mid, last);
//        mergeOpt(arr, first, mid, last);
    }
    public static void merge(int[] arr, int first, int mid, int last){

        int left = first;
        int right = mid+1;
        List<Integer> temp = new ArrayList<>();
        while(left<=mid && right<=last){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=last){
            temp.add(arr[right]);
            right++;
        }
        for(int j=first; j<=last; j++){
            arr[j] = temp.get(j-first);
        }

    }

//    public static void mergeOpt(int[] arr, int first, int mid, int last){
//        int[] temp = new int[first+last];
//        int i = 0;
//        int left=first;
//        int right = mid+1;
//        while(left<=mid && right<=last){
//            temp[i++] = arr[left]<arr[right]?arr[left++]:arr[right++];
//        }
//        System.arraycopy(temp,0, arr,first,first);

//    }
}
