package com.bikash.dsa.striver.a2z.basicMath;

public class HCF {
    public static void main(String[] args) {
        System.out.println(hcfEquilodianAlgo(52,10));
        System.out.println(hcfEquil(20,10));
        System.out.println(hcfEquilodianAlgoByPercentile(52,10));
    }

    public static int hcfEquil(int n1, int n2){
        while(n1>0 && n2>0){
            if(n1>n2) n1 = n1%n2;
            else n2 = n2%n1;
        }
        if(n1==0) return n2;
        return n1;
    }

    public static int hcfEquilodianAlgo(int n1, int n2){
        int big = n1>n2?n1:n2;
        int small = Math.min(n1,n2);
        if(small== 0 ) return big;
        return hcfEquilodianAlgo(big-small,small);

    }

    public static int hcfEquilodianAlgoByPercentile(int n1, int n2){
        if(n1==0) return n2;
        else if (n2==0) return n1;
        else return hcfEquilodianAlgoByPercentile(n1>n2?n1%n2:n2%n1, Math.min(n1, n2));
    }
}
