package com.bikash.dsa.striver.a2z.arrays.medium;

public class NextPermutation {

    public static void main(String[] args) {
        optimal();
    }

    public static void optimal(){
        int[] arr = {2,1,5,4,3,0,0};
        int index = -1;
     // Step-1 : Find the breaking point where you see the dip
        for(int i= arr.length-2; i>=0; i--){
            if(arr[i] < arr[i+1]){
                index = i;
                break;
            }
        }

        // TODO : If the index remains -1 return the array by sorting or reversing as it will be the same.
        // Step-2 : Find the number just grater than the number at index (Breaking Point) and swap.
        for(int j= arr.length-1; j>=index; j--){
            if(arr[j]>arr[index]){
                int temp = arr[index];
                arr[index] = arr[j];
                arr[j] = temp;
                break;
            }
        }

        // Step-3 : As swapping is done the longest match is set which is 2,3 which is the start of next permutation
        // now we have to reverse the array from (index+1, n-1)
        int left = index+1;
        int right = arr.length-1;
        while (left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        // Print the Next Permutation
        System.out.print("[");
        for(int k : arr){
            System.out.print(k+",");
        }
        System.out.println("]");
    }
}
