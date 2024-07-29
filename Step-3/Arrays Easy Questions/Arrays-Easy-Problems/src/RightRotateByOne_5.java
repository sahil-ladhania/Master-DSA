import java.util.Arrays;

public class RightRotateByOne_5 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        bruteForceRightRotateBy1(arr1);
        System.out.println("Brute Force Answer : " + Arrays.toString(arr1));
        String betterAnswer = betterRightRotateBy1(arr1);
        System.out.println("Better Answer : " + betterAnswer);
        optimalRightRotateBy1(arr2);
        System.out.println("Optimal Answer : " + Arrays.toString(arr2));
    }

    // Brute Force Approach
    public static void bruteForceRightRotateBy1(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int lastElement = arr[n - 1];
        for (int i = 0; i < n - 1; i++) {
            temp[i + 1] = arr[i];
        }
        temp[0] = lastElement;
        for (int j = 0; j < n; j++) {
            arr[j] = temp[j];
        }
    }
    /*
    TC : O(2n) ---> The loop iterates  n  times to copy elements to the temporary array and back to the original array.
    SC : O(n) ---> The temporary array temp of size  n  is used.
    */

    // Better Approach
    public static String betterRightRotateBy1(int[] arr) {
        String str = "There is no better solution for this problem.";
        return str;
    }

    // Optimal Approach
    public static void optimalRightRotateBy1(int[] arr) {
        int n = arr.length;
        int lastElement = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastElement;
    }
    /*
    TC : O(n) ---> The loop iterates  n - 1  times, performing a constant-time assignment in each iteration.
    SC : O(1) ---> Only a single additional variable (lastElement) is used, regardless of the input size.
    */

}
