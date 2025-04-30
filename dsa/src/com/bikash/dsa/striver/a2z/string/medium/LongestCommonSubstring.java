package com.bikash.dsa.striver.a2z.string.medium;

public class LongestCommonSubstring {

    public static void main(String[] args) {
        String[] strs = {"flight","flower","flow","flaw"};
        check(strs);
    }

    public static void check(String[] strs){
        String prefix = strs[0];
        for(int i=1; i<strs.length; i++){
           while (strs[i].indexOf(prefix) != 0){
               prefix = prefix.substring(0, prefix.length() - 1);
               if (prefix.isEmpty()) {
                   System.out.println("No Common SubStr");
               }
           }
        }
        System.out.println(prefix);
    }
}
