package com.bikash.dsa.striver.a2z.basicMath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintAllDivisors {

    public static void main(String[] args) {
        divisors(5);
    }

    /*

    36   => 1*36
            2*18
            3*12
            4*9
            6*6
            It will repeat after this.

     */


    public static void divisors(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i*i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
                if (n / i != i) {
                    list.add(n/i);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
