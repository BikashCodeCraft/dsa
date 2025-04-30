package com.bikash.dsa.striver.a2z.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class FruitInBasket {

    public static void main(String[] args) {

        int[] arr = {3,3,3,2,2,1,1,2,2,3};
        int k = 2;
        optimal(arr, k);
    }

    //Thought Process : Max fruits collected allowed k-type fruits allowed to collect. Each number in array represent a type of fruit.
    /*
        1. Using 2-pointer run over the array and store the number/fruit in the map and increase the frequency of each Number/fruits.
        2. For each iteration check the size of the map which contains the frequency of each fruit
        which should not be greater than 'k' and calculate the length by the window created by i,j.
        3. If the size of the map increases than k, try to eliminate the fruit from i and when that fruit reaches zero remove from the map.
        4. This resulting map only contains k-type of fruits.

     */

    // TC : O(2N) worst case {3,3,3,3,3,2,1}
    // SC : O(const) O(3) it will never store more than k type.
    public static void better(int[] arr, int k){
        int i = 0;
        int j = 0;
        int length = 0;
        Map<Integer, Integer> map = new HashMap<>();

        while (j<arr.length){
            if(map.containsKey(arr[j])){
                map.put(arr[j], map.get(arr[j])+1);
            }else{
                map.put(arr[j],1);
            }
            if(map.size()<=k){
                length = Math.max(length, j-i+1);
            }else {
                while (map.size()>k){
                    if(map.containsKey(arr[i]) && map.get(arr[i]) != 0){
                        map.put(arr[i], map.get(arr[i])-1);
                    }
                    if(map.get(arr[i]) == 0 ){
                        map.remove(arr[i]);
                    }
                    i++;
                }
            }
            j++;
        }
        System.out.println("Length : "+length);
    }

    // TC : O(N)
    // SC : O(const) O(3) it will never store more than k type.
    public static void optimal(int[] arr, int k){
        int i = 0;
        int j = 0;
        int length = 0;
        Map<Integer, Integer> map = new HashMap<>();

        while (j<arr.length){
            if(!map.containsKey(arr[j])){
                map.put(arr[j],1);
            }else{
                map.put(arr[j], map.get(arr[j])+1);
            }

            if(map.size()<=2){
                length= Math.max(length, j-i+1);
            }else{
                if(map.containsKey(arr[i])){
                    map.put(arr[i], map.get(arr[i])-1);
                }
                if(map.get(arr[i])==0){
                    map.remove(arr[i]);
                }
                i++;
            }
            j++;
        }
        System.out.println("Length Optimal : "+length);
    }
}
