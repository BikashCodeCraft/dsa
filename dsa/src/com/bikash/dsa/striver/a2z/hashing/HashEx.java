package com.bikash.dsa.striver.a2z.hashing;

public class HashEx {
    public static void main(String[] args) {
        int[] arr = {10,5,10,15,10,5};
        //1,4,2,3,12
        int[] hashArr = new int[16];

        for (int j : arr) {
            hashArr[j] = hashArr[j] + 1;
        }
        System.out.println(hashArr[15]);
        int maxVal = 0;
        int maxKey = 0;
        int minVal = 1;
        int minKey = 1;
        for(int i : arr){
            if(hashArr[i]>maxVal){
                maxVal = hashArr[i];
                maxKey = i;
            }
            if(hashArr[i]<=minVal){
                maxVal=hashArr[i];
                minKey=i;
            }
        }

        System.out.println("Max Key : "+maxKey+" Max Val : "+maxVal);
        System.out.println("Min Key : "+minKey+" Min Val : "+minVal);

    }
}
