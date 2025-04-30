package com.bikash.dsa.striver.a2z.arrays.easy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UniqueElementsInArr {

    //Remove duplicates from a sorted array.
    public static void main(String[] args) {

        int[] arr = {1,1,3,3,2,2,4,4};
        bruteForce(arr);
        int[] array = {1,1,2,2,3,3,4,4,5,5};
        int size = optimal(array);
        for (int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i : array){
            System.out.print(i+" ");
        }
        System.out.println("size : "+size);
    }

    public static void bruteForce(int[] arr){
        Set<Integer> set = new HashSet<>();
        for (int j : arr) {
            set.add(j);
        }
        Iterator<Integer> itr = set.iterator();
        int index = 0;
        while(itr.hasNext()){
            arr[index]=itr.next();
            index++;
        }
    }

    public static int optimal(int[] arr){
        int first = 0;
        int second = 1;
        while (second<=arr.length-1){
            if(arr[first] != arr[second]){
                arr[++first] = arr[second];
            }
            second++;
        }
        return first+1;
    }


}
