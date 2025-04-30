package com.bikash.dsa.striver.a2z.recursion;

public class Pallindrome {

    public static void main(String[] args) {
        String s = "ABCDEDCBA";
        System.out.println(pallindrome(s.toLowerCase(), 0));
    }

    public static boolean pallindrome(String string, int f){
        if(string.charAt(f) != string.charAt(string.length()-1-f)) return false;
        else if(f>=string.length()/2) return true;
        return pallindrome(string, ++f);
    }
}

