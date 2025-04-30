package com.bikash.dsa.question.arrays.easy;

public class FirstAndSecondSmallest {

    public static void main(String[] args) {
        int[] arr = {3,1,2,5,4,8,6,9};
        optimal(arr);
    }

    public static void optimal(int[] arr){
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 1; i<arr.length; i++){
            if(smallest>arr[i]){
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (secondSmallest>arr[i] && secondSmallest>smallest) {
                secondSmallest = arr[i];
            }
        }
        System.out.println("Smallest : "+smallest+" Second Smallest : "+secondSmallest);
    }
}
