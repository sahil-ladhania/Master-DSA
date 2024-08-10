import java.util.Arrays;

public class RotateMatrixBy90Degree_12 {
    public static void main(String[] args) {
        int[][] arr1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] arr2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] arr3 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] bruteForceAnswer = bruteForceRotateMatrixBY90Degree(arr1);
        System.out.println("Brute Force Answer : " + Arrays.deepToString(bruteForceAnswer));
        String betterSolution = betterRotateMatrixBY90Degree(arr2);
        System.out.println("Better Answer : " + betterSolution);
        optimalRotateMatrixBY90Degree(arr3);
        System.out.println("Optimal Answer : " + Arrays.deepToString(arr3));
    }

    // Brute Force Approach
    public static int[][] bruteForceRotateMatrixBY90Degree(int[][] arr) {
        int[][] ansArr = new int[3][3];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                ansArr[j][n-1-i] = arr[i][j];
            }
        }
        return ansArr;
    }
    /*
    TC : O(n2) --->  Because it iterates through all elements to create a new matrix of the same size.
    SC : O(n2) --->  Because it iterates through all elements to create a new matrix of the same size.
    */

    // Better Approach
    public static String betterRotateMatrixBY90Degree(int[][] arr) {
        String str = "There is no better solution for this Problem.";
        return str;
    }

    // Optimal Approach
    public static void optimalRotateMatrixBY90Degree(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int temp = 0;
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length / 2; j++) {
                int temp = 0;
                temp = arr[i][j];
                arr[i][j] = arr[i][arr.length - 1 - j];
                arr[i][arr.length - 1 - j] = temp;
            }
        }
    }
    /*
    TC : O(2n^2) ---> Because it performs two O(n^2) operations (transposition and reversal) directly on the original matrix without using extra space.
    SC : O(1) ---> Because it performs two O(n^2) operations (transposition and reversal) directly on the original matrix without using extra space.
    */
}
