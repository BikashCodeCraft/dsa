package com.bikash.dsa.striver.a2z.searching.binary;

public class SearchInRotatedSortedArrayWithDuplicate2 {

    /*
        Here we cannot directly use the code of SearchInRotatedSorted array with unique because :
        In rotated unique elements the first step we follow is to determine the sorted half, but here we can do
        Lets understand with a couple of example.

        Eg 1 : [6,7,1,2,3,4,4,4,5] target = 4, mid = 3(index =4) and can say the right half is sorted
        Eg 2 : [4,4,5,6,7,1,2,3,4] target = 4, mid = 7(index =4) and can say the left half is sorted
        But :
        Eg 2 : [4,1,2,3,4,4,4,4,4] target = 2, mid = 4(index =4) and we can't determine the sorted half. Hence, can't
        apply the unique rotated logic.
        Here, we need to take care only on scenario that is when
        arr[left]==arr[mid]==arr[right], once this is taken care we can apply the which half is sorted and check
        if that no is present or not.
     */


    public static void main(String[] args) {
        int[] arr = {3,1};
                //{1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        int target = 1;
        System.out.println(optimal(arr,target));
    }

    public static boolean optimal(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if(nums[mid] == target){
                return true;
            }
            if(nums[mid] == nums[left] && nums[mid] == nums[right]){
                left++;
                right--;
            }else{
                if(nums[left]<=nums[mid]){
                    if(target>=nums[left] && target<=nums[mid]){
                        right=mid-1;
                    }else{
                        left = mid+1;
                    }
                }else{
                    if(target>=nums[mid] && target<=nums[right]){
                        left = mid+1;
                    }else{
                        right = mid-1;
                    }
                }
            }
        }
        return false;
    }
}
