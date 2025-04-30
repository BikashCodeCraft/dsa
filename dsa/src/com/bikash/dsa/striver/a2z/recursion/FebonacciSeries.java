package com.bikash.dsa.striver.a2z.recursion;

public class FebonacciSeries {

    public static void main(String[] args) {
//        System.out.print(0+" "+1+" ");
//        febo(0, 1, 6-1);
        System.out.println(febonth(3));
    }

//    public static void febo(int n1, int n2, int n) {
//        if (n == 0) return;
//        System.out.print(n1+n2+" ");
//        int temp = n2;
//        n2 = n1 + n2;
//        n1 = temp;
//        febo(n1, n2, --n);
//    }

    // 0 1 1 2 3 5 8 13 . . .
    // 0 1 2 3 4 5 6 7 . . . . n - Index

    // f(n) = f(n-1)+f(n-2)
    //  f(4) = f(3) + f(2)
    //  3 = 2+1;
    //f(nth) = f(last) + f(Second Last)
    public static int febonth(int n) {
        if(n<=1) return n;
        int last = febonth(n-1);
        int slast = febonth(n-2);
        return slast+last;
    }

    public static int febonacciNth(int n) {
        if(n<=1) return n;
        return febonth(n-1)+febonth(n-2);
    }

}
