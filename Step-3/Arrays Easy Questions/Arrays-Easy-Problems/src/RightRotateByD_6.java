import java.util.Arrays;

public class RightRotateByD_6 {
    public static void main(String[] args) {
        System.out.println("The Brute Force Approach Striver taught is Complex and that basically took less TC than Optimal but SC is better in Optimal.");
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        int[] arr3 = {1,2,3,4,5};
        bruteForceRightRotateByD(arr1 , 2);
        System.out.println("Brute Force Answer : " + Arrays.toString(arr1));
        betterRightRotateByD(arr2 , 2);
        System.out.println("Better Answer : " + Arrays.toString(arr2));
        optimalRightRotateByD(arr3 , 2);
        System.out.println("Optimal Answer : " + Arrays.toString(arr3));
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Brute Force Approach -----> TC : O(2n)
    public static void bruteForceRightRotateByD(int[] arr, int K) {
        int N = arr.length;
        if (K > N) {
            K = K % N;
        }
        // Reverse Entire Array
        reverse(arr, 0, N - 1);
        // Reverse First K Elements
        reverse(arr, 0, K - 1);
        // Reverse Remaining (N-K) Elements
        reverse(arr, K, N - 1);
    }

    // Better Approach -----> TC : O(2n)
    public static void betterRightRotateByD(int[] arr, int K) {
        int N = arr.length;
        if (K > N) {
            K = K % N;
        }
        // Reverse Entire Array
        reverse(arr, 0, N - 1);
        // Reverse First K Elements
        reverse(arr, 0, K - 1);
        // Reverse Remaining (N-K) Elements
        reverse(arr, K, N - 1);
    }

    // Optimal Approach ---> TC : O(2n)
    public static void optimalRightRotateByD(int[] arr, int K) {
        int N = arr.length;
        if (K > N) {
            K = K % N;
        }
        // Reverse Entire Array
        reverse(arr, 0, N - 1);
        // Reverse First K Elements
        reverse(arr, 0, K - 1);
        // Reverse Remaining (N-K) Elements
        reverse(arr, K, N - 1);
    }

}
