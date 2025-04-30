package com.bikash.dsa.striver.a2z.arrays.medium;

public class MergeTwoSortedWithoutUsingExtraArr {

    /*
    I/P :
        arr1 = {2,4,6,8,0,0,0,0}
        arr2 = {1,3,5,7}
    O/P :
        arr1 = {1,2,3,4,5,6,7,8}

        Hint : Use two pointer but start from end of the arr.
     */


    public static void main(String[] args) {

        int[] arr1 = {2,4,6,8,0,0,0,0};
        int[] arr2 = {1,3,5,7};
        int nonZeroNumInArr1 = 4;
        int nonZeroNumInArr2 = 4;
        merge(arr1,arr2,nonZeroNumInArr1,nonZeroNumInArr2);
    }

    public static void merge(int[] arr1, int[] arr2, int m, int n){
        int i = m-1;
        int j = n-1;
        int k = arr1.length>arr2.length ? arr1.length-1 : arr2.length-1;

        while (i>=0 && j>=0){
            if(arr1[i]>arr2[j]){
                arr1[k--] = arr1[i--];
            }else{
                arr1[k--] = arr2[j--];
            }
        }
        while(j>=0){
            arr1[k--]=arr2[j--];
        }
        for(int a : arr1){
            System.out.print(a+", ");
        }

    }
}
