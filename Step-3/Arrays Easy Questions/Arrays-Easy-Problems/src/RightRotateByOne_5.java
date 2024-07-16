import java.util.Arrays;

public class RightRotateByOne_5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        bruteForceRightRotateBy1(arr);
        System.out.println("Brute Force Answer : " + Arrays.toString(arr));
        betterRightRotateBy1(arr);
        System.out.println("Better Answer : " + Arrays.toString(arr));
        optimalRightRotateBy1(arr);
        System.out.println("Optimal Answer : " + Arrays.toString(arr));
    }

    // Brute Force Approach -----> TC : O(n)
    public static void bruteForceRightRotateBy1(int[] arr) {
        int n = arr.length;
        int lastElement = arr[n-1];
        for (int i = n-1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = lastElement;
    }

    // Better Approach -----> TC : O(n)
    public static void betterRightRotateBy1(int[] arr) {
        int n = arr.length;
        int lastElement = arr[n-1];
        for (int i = n-1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = lastElement;
    }

    // Optimal Approach ---> TC : O(n)
    public static void optimalRightRotateBy1(int[] arr) {
        int n = arr.length;
        int lastElement = arr[n-1];
        for (int i = n-1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = lastElement;
    }

}
