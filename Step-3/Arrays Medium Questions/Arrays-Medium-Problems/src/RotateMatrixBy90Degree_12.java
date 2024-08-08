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
        bruteForceRotateMatrixBY90Degree(arr1);
        System.out.println("Brute Force Answer : " + Arrays.deepToString(arr1));
        String betterSolution = betterRotateMatrixBY90Degree(arr2);
        System.out.println("Better Answer : " + betterSolution);
        optimalRotateMatrixBY90Degree(arr3);
        System.out.println("Optimal Answer : " + Arrays.deepToString(arr3));
    }

    // Brute Force Approach
    public static void bruteForceRotateMatrixBY90Degree(int[][] arr) {

    }
    /*
    TC : O() --->
    SC : O() --->
    */

    // Better Approach
    public static String betterRotateMatrixBY90Degree(int[][] arr) {
        String str = "There is no better solution for this Problem.";
        return str;
    }
    /*
    TC : O() --->
    SC : O() --->
    */

    // Optimal Approach
    public static void optimalRotateMatrixBY90Degree(int[][] arr) {

    }
    /*
    TC : O() --->
    SC : O() --->
    */
}
