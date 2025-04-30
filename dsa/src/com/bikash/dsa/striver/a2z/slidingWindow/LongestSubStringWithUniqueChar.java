package com.bikash.dsa.striver.a2z.slidingWindow;

import java.util.HashMap;

public class LongestSubStringWithUniqueChar {

    public static void main(String[] args) {
        String s = "acdbzefgabcde"; //acdbzefgabcde
        System.out.println("Length of Unique SubString : " + optimal(s));
    }

    // Sliding window problem
    public static int optimal(String s) {
        HashMap<String, Integer> hmap = new HashMap<>();
        int left = 0;
        int right = 0;
        int length = 0;
        while (right < s.length()) {
            if (hmap.containsKey(s.charAt(right) + "") && left <= hmap.get(s.charAt(right) + "")) {
                left = hmap.get(s.charAt(right) + "") + 1;
            }
                length = Math.max(length, right - left + 1);
                hmap.put(s.charAt(right) + "", right);
            right++;
        }
        return length;
    }
}
