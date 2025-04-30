package com.bikash.dsa.striver.a2z.arrays.medium;

import java.util.Arrays;
import java.util.HashSet;

public class HighestSequenceLength {
    public static void main(String[] args) {
        int[] arr = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        getLen(arr);
        int[] arr2 = {9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6};
        getLen(arr2);
        int[] arr3 = {100, 4, 200, 1, 3, 2};
        getLen(arr3);
    }

/*      Input: nums = [100,4,200,1,3,2]
        Output: 4
        Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

        Example 2:
        Input: nums = [0,3,7,2,5,8,4,6,0,1]
        Output: 9
*/

    public static void getLen(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int j : arr) {
            set.add(j);
        }
        int length = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int startNum = num;
                int currentSeq = 1;
                while (set.contains(startNum + 1)) {
                    currentSeq++;
                    startNum++;
                }
                length = Math.max(length, currentSeq);
            }
        }

        System.out.println("Max seq Len : " + length);
    }
}
