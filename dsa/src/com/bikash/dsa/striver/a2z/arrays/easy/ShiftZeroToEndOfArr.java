package com.bikash.dsa.striver.a2z.arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class ShiftZeroToEndOfArr {

    public static void main(String[] args) {
        int[] arr = {0,1,0,2,3,2,0,0,4,5,1};
//        brute(arr);
        optimal(arr);
        for (int i : arr){
            System.out.print(i+" ");
        }
    }

    // TC : O(2n)
    // SC : O(n)
    public static void brute(int[] arr){
        List<Integer> tempList = new ArrayList<>();
        for (int i=0; i< arr.length; i++){      // O(n)
            if(arr[i] != 0){
                tempList.add(arr[i]);
            }
        }
        for(int i=0; i<arr.length; i++){        // O(n)
            if(i<tempList.size()){
                arr[i] = tempList.get(i);
            }else {
                arr[i] = 0;
            }
        }
    }


    // TC : O(x) + O(n-x) = O(n)
    // SC : O(1) no extra space used.
    //Using two pointer
    public static void optimal(int[] arr){
        int j =-1;
        for(int i=0; i<arr.length; i++){            // O(x) => say x= no of element traversed to get index of 0;
            if(arr[i] ==0){
                j =i;
                break;
            }
        }
        for(int i=j+1; i<arr.length; i++){         // O(n-x) => the remaining elements will be traversed as the x is already done
            if(arr[i] !=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

    }
}
