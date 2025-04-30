package com.bikash.dsa.striver.a2z.arrays.medium;

public class MedianOfTwoSortedArray {

    public static void main(String[] args) {
        int[] arr1 = {2,4,6,8,10,12,14,16,18,20,22};
        int[] arr2 = {1,3,5};
        System.out.println(getMedian(arr1,arr2));
    }

    public static double getMedian(int[] arr1, int[] arr2){
        int arr1Size = arr1.length;
        int arr2Size = arr2.length;
        int medianIdx = (arr1Size+arr2Size)/2;
        int count = 0;
        int i = 0;
        int j = 0;
        while (i<arr1.length && j<arr2.length){
            //calculate the median and retun
            if((arr1Size+arr2Size)%2==0){
                if(count==medianIdx-1){
                    return (double) (arr1[i] + arr2[j]) /2;
                }
            }else{
                if(count==medianIdx){
                    return Math.min(arr1[i], arr2[j]);
                }

            }
            if(arr1[i]<arr2[j]){
                i++;
            }else{
                j++;
            }
            count++;
        }
        while (i<arr1.length && count<=medianIdx){
            if((arr1Size+arr2Size)%2==0){
                if(count==medianIdx-1){
                    return (double) (arr1[i] + arr1[i + 1]) /2;
                }
            }else{
                if(count==medianIdx){
                    return arr1[i];
                }
            }
            i++;
            count++;
        }
        while (j<arr2.length && count<=medianIdx){
            if((arr1Size+arr2Size)%2==0){
                if(count==medianIdx-1){
                    return (double) (arr2[j] + arr2[j + 1]) /2;
                }
            }else{
                if(count==medianIdx){
                    return arr1[j];
                }

            }
            j++;
            count++;

        }

        return -1;
    }
}
