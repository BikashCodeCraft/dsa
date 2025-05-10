package com.bikash.dsa.striver.a2z.recursion.medium.p1;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceOfArr {
    /**
     * A subsequence means elements from the array with order
     * Eg : [3,1,2] => then subsequence would be
     * [3,1,2],[3,1],[3,2],[1,2],[3],[2],[1],[] => Total of 8 subsequence
     * Here if you notice we didn't consider [3,2,1] or [1,2,3] or [2,1] etc, because the order matter in subsequence
       if 1 is before 2 nad after 3 then in any subsequence this order will be maintained.
     * Intuition : If you observe we picked 3, we picked 1, we picked 2 to form first sequence,
     *              we pucked 3, picked 1 but not picked 2 to form 2nd seq.
     *              we pucked 3, not picked 1 but picked 2 to form 3rd seq.
     *              And so on
     */
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        getSequence(0, arr,new ArrayList<>());
    }

    public static void getSequence(int i, int[] arr, List<Integer> subSeq){
        if(i>=arr.length) {
            System.out.println(subSeq);
            return;
        }
        // pick the element into the subsequence
        subSeq.add(arr[i]);
        getSequence(i+1, arr, subSeq);
        subSeq.remove(Integer.valueOf(arr[i]));
        // Not pick the element into the subsequence.
        getSequence(i+1, arr, subSeq);
    }
}
