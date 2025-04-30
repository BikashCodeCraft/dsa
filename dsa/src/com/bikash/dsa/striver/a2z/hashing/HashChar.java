package com.bikash.dsa.striver.a2z.hashing;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HashChar {

    public static void main(String[] args) {
        String s = "abcdabehfg";
        alter(s);
        char base = 'a';
        int[] hashChar = new int[26];
        for(int i=0; i<s.length(); i++){
            hashChar[s.charAt(i)-base] +=1;
        }
        Scanner scn = new Scanner(System.in);
        String find = scn.next();
        for(char ch : find.toCharArray()){
            System.out.println(ch+" : "+hashChar[ch-base]);
        }

        Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .forEach(System.out::print);


    }

    public static void alter(String s){
        //256 is the total number of ASCII on the keyboard like a->97, etc
        int[] hashArr = new int[256];
        for(int i=0; i<s.length(); i++){
            hashArr[s.charAt(i)]++;
        }
        Scanner scn = new Scanner(System.in);
        String find = scn.next();
        for(char ch : find.toCharArray()){
            System.out.println(ch+" : "+hashArr[ch]);
        }

    }
}
