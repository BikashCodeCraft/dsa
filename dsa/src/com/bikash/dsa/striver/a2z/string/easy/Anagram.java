package com.bikash.dsa.striver.a2z.string.easy;

import java.util.*;

public class Anagram {

    //    String[] inputArray = { "abcd", "java", "dcba", "ajav", "xyz", "epam", "pame", "aepm" };
//    expected output :
//          "epam", "pame", "aepm"
//          "abcd" "dcba"
//          "java" "ajav"

    public static void main(String[] args) {
        String[] inputArray = { "abcd", "java", "dcba", "ajav", "xyz", "epam", "pame", "aepm" };
        optimal(inputArray);
    }

    public static void optimal(String[] strings){

        Map<String, List<String>> result = new HashMap<>();

        for(String str : strings){
            char[] chars =  str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            if(!result.containsKey(sortedStr)){
                result.put(sortedStr,new ArrayList<>());
            }
            result.get(sortedStr).add(str);
        }

        for(Map.Entry<String,List<String>> entry : result.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}
