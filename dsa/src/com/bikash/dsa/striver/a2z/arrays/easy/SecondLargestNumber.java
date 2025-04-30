package com.bikash.dsa.striver.a2z.arrays.easy;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestNumber {

    //Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 7, 5,0};
//        tryMethod(arr);
//        System.out.println(secondLargestBrute(arr));
//        System.out.println(secondLargestBetter(arr));
        System.out.println("Optimal Solution : " + secondLargestOptimal(arr));
        System.out.println("Third Largest : " + thirdLargest(arr));
        System.out.println("Second Smallest : "+secondSmallest(arr));
    }

//    // Second largest {Big O(nlogn + n)}
//    public static int secondLargestBrute(int[] arr){
//        Arrays.sort(arr);
//        for(int i=arr.length-2; i>=0; i--){
//            if(arr[i]<arr[arr.length-1]){
//                return arr[i];
//            }
//        }
//        return -1;
//    }
//
//    // Second largest Big O (N)+Big O(n) = Big O (2N)
//    public static int secondLargestBetter(int[] arr){
//        int largest = arr[0];
//        for(int i=1; i<arr.length;i++){
//            if(arr[i]>largest){
//                largest=arr[i];
//            }
//        }
//        int secondLar = arr[0];
//        for(int i=1; i<arr.length;i++){
//            if(arr[i]>secondLar && arr[i]<largest){
//                secondLar=arr[i];
//            }
//        }
//        return secondLar;
//    }

    //Optimal Solution
    public static int secondLargestOptimal(int[] arr) {
        int largest = arr[0];
        int secondLargest = -1;
        //{1,2,4,7,7,5,0}
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    //1,3,2,4,7,7,5
    public static int thirdLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = -1;
        int thirdLargest = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < largest) {
                thirdLargest = secondLargest;
                secondLargest = arr[i];
            }
        }
        return thirdLargest;
    }

    //Second Smallest
    public static int secondSmallest(int[] arr) {
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];

            }else if (arr[i] != smallest && arr[i]<secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }

    //{1, 2, 4, 7, 7, 5,0};
    public static void tryMethod(int[] arr){
        int lar =0;
        int secLar=0;
        for(int a:arr){
            if(a>lar){
                secLar=lar;
                lar=a;
            } else if (a>secLar && lar != a) {
                secLar=a;
            }
        }
        System.out.println("Sec Lar : "+ secLar);

        int secLarByStr = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(1)
                .findFirst()
                .orElse(-1);
        System.out.println("Sec Lar By Streams : "+secLarByStr);

    }

}
