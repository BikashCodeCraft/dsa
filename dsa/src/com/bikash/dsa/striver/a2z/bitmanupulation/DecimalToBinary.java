package com.bikash.dsa.striver.a2z.bitmanupulation;

public class DecimalToBinary {
    public static void main(String[] args) {
        deciToBinary(13);
    }

    // TC : log2(n) => 2 is base
    // SC : log2(n) => 2 is base, as it result store 0,1 as many as reminders are produced
    public static void deciToBinary(int num){
        StringBuilder result = new StringBuilder();
        while(num>0){
            result.insert(0, num%2);
            num /=2;
        }
        System.out.println(result);
        binaryToDecimal(result.toString());
    }

    // TC : O(n)
    // SC : O(1)
    public static void binaryToDecimal(String num){
        int p2 = 1;
        double result = 0;
        for(int i= num.length()-1; i>=0; i--){

            if((Integer.parseInt(num.charAt(i)+"") == 1)){
                result += p2;
            }
            p2 *= 2;
        }
        System.out.println((int)result);
    }
}
