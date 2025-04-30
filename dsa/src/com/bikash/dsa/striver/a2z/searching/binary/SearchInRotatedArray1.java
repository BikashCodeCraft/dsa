package com.bikash.dsa.striver.a2z.searching.binary;

public class SearchInRotatedArray1 {

    public static void main(String[] args) {
        int[] nums = {7,8,9,1,2,3,4,5,6};
        int target = 5;
        System.out.println(optimal(nums, target));
    }


    public static int optimal(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if(nums[mid] == target){
                return mid;
            }
            //Check for left half sorted else right sorted
            if(nums[left]<=nums[right]){
                // Check if the target is within the sorted half
                if(target>=nums[left] && target<=nums[mid]){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
            // Right is sorted
            else {
                //check if target is on the right sorted half
                if(target>=nums[mid] && target<=nums[right]){
                    left=mid+1;
                }else {
                    right = mid-1;
                }
            }

        }


        return -1;
    }



    // Own understanding
    public static int optima(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        while (left<=right){
            int mid = (left+right)/2;

            if(arr[mid]>arr[left]){
                if(target>=arr[left] && target<=arr[mid]){
                    if(arr[mid]==target){
                        return mid;
                    } else if (target<arr[mid]) {
                        right = mid-1;
                    }else{
                        left=mid+1;
                    }
                }else{
                    left = mid+1;
                }
            }else{
                if(target>=arr[mid] && target<=arr[right]){
                    if(arr[mid] == target){
                        return mid;
                    }else if (target<arr[mid]){
                        right=mid-1;
                    }else {
                        left = mid+1;
                    }
                }else{
                    right = mid-1;
                }
            }
        }
        return -1;

    }
}
