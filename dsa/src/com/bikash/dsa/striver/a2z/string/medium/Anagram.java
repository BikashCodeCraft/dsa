package com.bikash.dsa.striver.a2z.string.medium;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "CAT";
        String s2 = "ACT";
        System.out.println(isAnagram(s1, s2));

    }

    public static boolean isAnagram(String s1, String s2){
        Map<String, Long> s1Map = Arrays.stream(s1.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<String, Long> s2Map = Arrays.stream(s2.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        boolean flag = true;
        for(Map.Entry<String,Long> entry : s1Map.entrySet()){
            if(s2Map.get(entry.getKey()) != entry.getValue()){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
