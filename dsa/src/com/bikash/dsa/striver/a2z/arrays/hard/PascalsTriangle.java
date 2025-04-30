package com.bikash.dsa.striver.a2z.arrays.hard;


/* PASCAL's Triangle
                            1          -> Row 1 starts with 1
                           1 1         -> Row 2 starts with 1 and ends with 1
                          1 2 1        -> Row 3 starts and ends with one and mid num is Row 2 addition
                         1 3 3 1       -> Row 4 starts and ends with 1 in between addition of prev row
                        1 4 6 4 1
                       1 5 10 10 5 1

 */
public class PascalsTriangle {

    public static void main(String[] args) {
        System.out.println("The number at row : 5 and col : 3 is : "+findTheNumAtRowAndColumn(5,3));
        printAllNumBrute(5);
        printAllNumOptimal(5);
    }

    // Variation-1 [ Find the number present in pascal's triangle exactly at the given row and column ]
    public static int findTheNumAtRowAndColumn(int row, int col){
        int calRow = row-1;
        int calCol = col-1;
        int result = 1;
        for(int i=0; i<calCol; i++){
            result = result*(calRow-i);
            result = result/(i+1);
        }
        return result;
//        System.out.println("The number at row : "+row+" and col :"+col+" is : "+result);
    }

    // Variation-2 [ Print all the numbers at the given row ] eg=> n=6, print [1,5,10,10,5,1]
    //Brute force solution O(n*r)
    public static void printAllNumBrute(int row){
        for(int i=1; i<=row; i++){
            System.out.print(findTheNumAtRowAndColumn(row,i)+", ");
        }
        System.out.println();
    }

    // Variation-2 [ Print all the numbers at the given row ] eg=> n=6, print [1,5,10,10,5,1]
    //Optimal solution O(n)
    public static void printAllNumOptimal(int row) {
        int calRow = row;
        int res = 1;
        System.out.print(res + ", ");
        for (int i = 1; i < row; i++) {
            res = res * (--calRow);
            res = res / i;
            System.out.print(res + ", ");
        }
    }

}
