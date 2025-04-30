package com.bikash.dsa.striver.a2z.arrays.medium;

public class SetMatrixZero {
    public static void main(String[] args) {
        better();
    }

    // For brute force we need to iterate over the matrix and mark all the row and column that has zero in it
    // as -1 so tha when we move forward in the loop it will not take the update value of zero
    // Now itterate once again and mark the -1 to 0, you got your result matrix.

    public static void better() {       // O(2(n*m))
        int n=4, m=4;
        int[][] arr = {{1, 1, 1, 1}, {1, 0, 1, 1}, {1, 1, 0, 1}, {1, 0, 0, 1}};
        int[] col = {0,0,0,0};
        int[] row = {0,0,0,0};
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){       //O(n*m)
                if(arr[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for(int r = 0; r<n; r++){
            for(int c = 0; c<m; c++){       //O(n*m)
                if(row[r] == 1 || col[c] == 1){
                    arr[r][c] = 0;
                }
            }
        }

        for(int r = 0; r<n; r++) {
            for (int c = 0; c < m; c++) {
                System.out.print(arr[r][c]+" ");
            }
            System.out.println();
        }
    }


//    public static int[][] get2dArr(int n, int m){
//        int[][] arr = new int[n][m];
//        arr[0]
//    }
}
