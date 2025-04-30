package com.bikash.dsa.striver.a2z.basicMath;

public class PrimeNum {

    // A prime no has exactly two factors [1 and the no. itself]

    public static void main(String[] args) {
        System.out.println(isPrime(17));
    }

    public static boolean isPrime(int n){
        int count =0;
        // count the no of factors.
        for(int i=1; i*i<=n; i++){
            if(n%i==0) {
                count++;
                if(n/i != i)
                    count++;
            }
            if(count>2) break;

        }

        return count==2;
    }
}
