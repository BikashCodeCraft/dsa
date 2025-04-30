package com.bikash.dsa.striver.a2z.searching.binary;

public class NumberOfTimeArrayRotated {

    /*
            Problem Statement: Given an integer array arr of size N, sorted in ascending order (with distinct values).
            Now the array is rotated between 1 to N times which is unknown. Find how many times the array has been rotated.

            Example 1:
                Input Format: arr = [4,5,6,7,0,1,2,3]
                Result: 4
                Explanation: The original array should be [0,1,2,3,4,5,6,7]. So, we can notice that the array has been rotated 4 times.

            Example 2:
                Input Format: arr = [3,4,5,1,2]
                Result: 3
                Explanation: The original array should be [1,2,3,4,5]. So, we can notice that the array has been rotated 3 times.

     */
    public static void main(String[] args) {

        int[] arr = {4,5,6,7,8,9,1,2,3};
        int result = optimalRightShift(arr);
        System.out.println(result);

        int[] arr1 = {3,4,5,1,2};
        int result1 = optimalLeftShift(arr1);
        System.out.println(result1);
    }

    public static int optimalRightShift(int[] nums){
        int low = 0 ;
        int high = nums.length-1;
        int largest = Integer.MIN_VALUE;
        int index = Integer.MIN_VALUE;

        while (low<=high){
            int mid = (low+high)/2;
            // Left Sorted
            if(nums[low]<=nums[mid]){
                if(largest<nums[mid]){
                    index = mid;
                    largest = nums[mid];
                }
                low=mid+1;
            }else{ // Right Sorted
                if(largest<nums[high]){
                    largest = nums[high];
                    index = high;
                }
                high = mid-1;
            }
        }
        if(index == nums.length-1){
            return 0;
        }else{
            return index+1;
        }
    }

    public static int optimalLeftShift(int[] arr){
        int left = 0;
        int right = arr.length-1;
        int lowest = Integer.MAX_VALUE;
        int lowestIndex = Integer.MAX_VALUE;

        while (left<=right){
            int mid = (left+right)/2;
            //Left Sorted
            if(arr[left]<=arr[mid]){
                if(lowest>arr[left]){
                    lowestIndex = left;
                    lowest = arr[left];
                }
                left = mid+1;
            } else{ // Right Sorted
                if(lowest>arr[right]){
                    lowestIndex = mid;
                    lowest = arr[mid];
                }
                right = mid-1;
            }
        }

        return  arr.length - lowestIndex;

    }

}
