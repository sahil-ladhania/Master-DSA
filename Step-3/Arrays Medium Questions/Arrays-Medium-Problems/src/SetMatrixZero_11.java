import java.util.Arrays;

public class SetMatrixZero_11 {
    public static void main(String[] args) {
        int[][] arr1 = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        int[][] arr2 = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        int[][] arr3 = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        bruteForceSetMatrixZero(arr1);
        System.out.println("Brute Force Answer : " + Arrays.deepToString(arr1));
        betterSetMatrixZero(arr2);
        System.out.println("Better Answer : " + Arrays.deepToString(arr2));
        optimalSetMatrixZero(arr3);
        System.out.println("Optimal Answer : " + Arrays.deepToString(arr3));
    }

    // Brute Force Approach
    public static void markRow(int i , int[][] arr) {
        // Loop through all columns
        for (int j = 0; j < arr[i].length; j++) {
            if(arr[i][j] == 1){
                arr[i][j] = -1;
            }
        }
    }
    public static void markCol(int j , int[][] arr) {
        // Loop through all rows
        for (int i = 0; i < arr.length; i++) {
            if(arr[i][j] == 1){
                arr[i][j] = -1;
            }
        }
    }
    public static void bruteForceSetMatrixZero(int[][] arr) {
        int rowSize = arr.length;
        for (int i = 0; i < rowSize; i++) { // For Row
            for (int j = 0; j < arr[i].length; j++) { // For Col
                if(arr[i][j] == 0){
                    // Change all the 1 to -1 for the Row and Col
                    markRow(i , arr);
                    markCol(j , arr);
                }
            }
        }
        for (int k = 0; k < rowSize; k++) {
            for (int l = 0; l < arr[k].length; l++) {
                if(arr[k][l] == -1){
                    arr[k][l] = 0;
                }
            }
        }
    }
    /*
    TC : O(n^3) ---> The nested loops for marking rows and columns result in O(n^2) complexity, and the final loop to convert -1 to 0 adds another O(n^2). The combined operations result in O(n^3) complexity.
    SC : O(1) ---> No additional space beyond a few variables is used, so the space complexity is O(1).
    */

    // Better Approach
    public static void betterSetMatrixZero(int[][] arr) {
        int rowSize = arr.length;
        int colSize = arr[0].length;
        int[] rowArr = new int[rowSize];
        int[] colArr = new int[colSize];
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                if (arr[i][j] == 0) {
                    rowArr[i] = 1;
                    colArr[j] = 1;
                }
            }
        }
        for (int i = 0; i < rowSize; i++) {
            if (rowArr[i] == 1) {
                for (int j = 0; j < colSize; j++) {
                    arr[i][j] = 0;
                }
            }
        }
        for (int j = 0; j < colSize; j++) {
            if (colArr[j] == 1) {
                for (int i = 0; i < rowSize; i++) {
                    arr[i][j] = 0;
                }
            }
        }
    }
    /*
    TC : O(n^2) ---> The first pass to mark rows and columns is O(n \times m), and the subsequent passes to set rows and columns to zero also take O(n \times m). Combined, this results in O(n^2) complexity.
    SC : O(n+m) ---> Additional arrays for rows and columns take O(n + m) space.
    */

    // Optimal Approach
    public static void optimalSetMatrixZero(int[][] arr) {
        int rowSize = arr.length;
        int colSize = arr[0].length;
        int[] rowArr = new int[rowSize];
        int[] colArr = new int[colSize];
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                if (arr[i][j] == 0) {
                    rowArr[i] = 1;
                    colArr[j] = 1;
                }
            }
        }
        for (int i = 0; i < rowSize; i++) {
            if (rowArr[i] == 1) {
                for (int j = 0; j < colSize; j++) {
                    arr[i][j] = 0;
                }
            }
        }
        for (int j = 0; j < colSize; j++) {
            if (colArr[j] == 1) {
                for (int i = 0; i < rowSize; i++) {
                    arr[i][j] = 0;
                }
            }
        }
    }
    /*
    TC : O(n^2) ---> Similar to the “Better Approach,” the time complexity is O(n \times m) for marking and updating rows and columns.
    SC : O(n+m) ---> Space usage is O(n + m) for the additional row and column marking arrays.
    */
}
