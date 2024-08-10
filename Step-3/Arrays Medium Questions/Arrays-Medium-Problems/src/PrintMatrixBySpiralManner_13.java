import java.util.ArrayList;
import java.util.Arrays;

public class PrintMatrixBySpiralManner_13 {
    public static void main(String[] args) {
        int[][] arr1 = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int[][] arr2 = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int[][] arr3 = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        String bruteForceAnswer = bruteForcePrintMatrixBySpiralManner(arr1);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        String betterAnswer = betterPrintMatrixBySpiralManner(arr2);
        System.out.println("Better Answer : " + betterAnswer);
        ArrayList<Integer> optimalAnswer = optimalPrintMatrixBySpiralManner(arr3);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    // Brute Force Approach
    public static String bruteForcePrintMatrixBySpiralManner(int[][] arr) {
        String str = "There is no brute force solution to this Problem.";
        return str;
    }

    // Better Approach
    public static String betterPrintMatrixBySpiralManner(int[][] arr) {
        String str = "There is no better solution to this Problem.";
        return str;
    }

    // Optimal Approach
    public static ArrayList<Integer>  optimalPrintMatrixBySpiralManner(int[][] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int m = arr[0].length;
        int top = 0, left = 0, bottom = n - 1, right = m - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++)
                ans.add(arr[top][i]);
            top++;
            for (int i = top; i <= bottom; i++)
                ans.add(arr[i][right]);
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    ans.add(arr[bottom][i]);
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    ans.add(arr[i][left]);
                left++;
            }
        }
        return ans;
    }
    /*
    TC : O(nm) ---> Because it iterates through all elements of the matrix once to collect them in a list, where n is the number of rows and m is the number of columns.
    SC : O(nm) ---> Because it iterates through all elements of the matrix once to collect them in a list, where n is the number of rows and m is the number of columns.
    */
}
