package com.bikash.dsa.striver.a2z.searching.binary;

public class FloorAndCeil {

    /*
        Condition :
        Floor : Largest no in array <= target
        Ceil : Smallest no in array >= target

        Eg : [10,20,30,40,50] , target = 25
        floor : 20 (20<=25) Largest in arr that satisfy the floor condition
        ceil : 30 (30>=25) Smallest in arr that satisfy the ceil condition

    */

    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int target = 2;
        optimal(arr,target);
    }

    public static void optimal(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        int floor = -1;
        int ceil = -1;
        while (left<=right){
            int mid = (left+right)/2;
            if(arr[mid]<=target){
                floor = mid;
                left = mid+1;
            }
            if (arr[mid]>= target) {
                ceil = mid;
                right = mid-1;
            }
        }
        System.out.println("Floor : "+floor+"    Ceil : "+ceil);
    }

}
