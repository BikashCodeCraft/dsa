package com.bikash.dsa.striver.a2z.string.easy;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseSentence {

    public static void main(String[] args) {
        String s = "this is an amazing program";
        reverseSentenceUsingMetod(s);
        optimal(s);
    }

    public static void reverseSentenceUsingMetod(String sentence) {
        String[] arr = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println("Reverse Sentence : " + sb);
    }

    public static void optimal(String sentence) {
        String word = "";
        String result = "";
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != ' ') {
                word += sentence.charAt(i);
            } else if (sentence.charAt(i) == ' ') {
                if (!result.isEmpty()) {
                    result = word + " " + result;
                } else {
                    result = word;
                }
                word = "";
            }
        }
        result = word+" "+result;
        System.out.println("Reversed String Optimal : "+result);

    }

}
