package com.bikash.dsa.striver.a2z.arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class AlternatePositiveNegNum {

    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
//        brute(arr);
        int[] res = optimalWithEvenSize(arr);
        for (int a : res){
            System.out.print(a+" ");
        }
        int[] unEvenArr = {3,1,-2,5,2,4,7};
        optimalWithUnevenSize(unEvenArr);
        System.out.println("Uneven result : ");
        for (int a : unEvenArr){
            System.out.print(a+" ");
        }
    }

    // TC : O(n+n/2)
    // SC : O(n)
    public static void brute(int[] nums){
        List<Integer> posList = new ArrayList<>();
        List<Integer> neglist = new ArrayList<>();
        for(int i=0; i< nums.length; i++){
            if(nums[i]>=0){
                posList.add(nums[i]);
            }else {
                neglist.add(nums[i]);
            }
        }
        for(int i=0; i<nums.length/2; i++) {
            nums[2*i] = posList.get(i);
            nums[2*i+1] = neglist.get(i);
        }
    }

    public static int[] optimalWithEvenSize(int[] nums){
        int[] result = new int[nums.length];
        int posIndex = 0;
        int negInd = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>=0){
                result[posIndex] = nums[i];
                posIndex+=2;
            }else {
                result[negInd] = nums[i];
                negInd+=2;
            }
        }
        return result;
    }
//{3,1,-2,5,2,-4,7}
    public static void optimalWithUnevenSize(int[] nums) {
        List<Integer> posList = new ArrayList<>();
        List<Integer> negList = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] >= 0){
                posList.add(nums[i]);
            }else {
                negList.add(nums[i]);
            }
        }
        //3,-5,1,-4,
        if(posList.size()>negList.size()){
            for(int i=0; i<negList.size(); i++){
                nums[2*i] = posList.get(i);
                nums[2*i+1] = negList.get(i);
            }
            int index = 2*negList.size();
            for(int j=negList.size(); j<posList.size(); j++){
                nums[index] = posList.get(j);
                index++;
            }
        }else{
            for(int i=0; i<posList.size(); i++){
                nums[2*i] = posList.get(i);
                nums[2*i+1] = negList.get(i);
            }
            int index = 2*posList.size();
            for(int j=posList.size(); j<negList.size(); j++){
                nums[index] = negList.get(j);
                index++;
            }
        }
    }

}
