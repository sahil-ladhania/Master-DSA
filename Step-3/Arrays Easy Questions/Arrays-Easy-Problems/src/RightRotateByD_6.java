import java.util.Arrays;

public class RightRotateByD_6 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        int[] arr3 = {1,2,3,4,5};
        bruteForceRightRotateByD(arr1 , 2);
        System.out.println("Brute Force Answer : " + Arrays.toString(arr1));
        String betterAnswer = betterRightRotateByD(arr2 , 2);
        System.out.println("Better Answer : " + betterAnswer);
        optimalRightRotateByD(arr3 , 2);
        System.out.println("Optimal Answer : " + Arrays.toString(arr3));
    }

    // Brute Force Approach
    public static void bruteForceRightRotateByD(int[] arr, int K) {
        int N = arr.length;
        if(N == 0){
            return;
        }
        K = K % N;
        if(K > N){
            return;
        }
        //  Understand the Working of Loops
        int[] temp = new int[K];
        for (int i = N - K; i < N; i++) {
            temp[i - N + K] = arr[i];
        }
        for (int i = N - K - 1; i >= 0; i--) {
            arr[i + K] = arr[i];
        }
        for (int i = 0; i < K; i++) {
            arr[i] = temp[i];
        }
    }
    /*
    TC : O(3n) ---> There are three main steps, each of which runs in  O(n)  or  O(K) . The combined operations still
                    result in  O(n)  since  O(n) + O(n) + O(K) = O(3n) = O(n) .
    SC : O(k) ---> We use a temporary array of size  K  to store the last K elements.
    */

    // Better Approach
    public static String betterRightRotateByD(int[] arr, int K) {
        String str = "There is no better solution for this problem.";
        return str;
    }

    // Optimal Approach
    public static void reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void optimalRightRotateByD(int[] arr, int K) {
        int n = arr.length;
        K = K % n;
        reverse(arr , 0 , n-1);
        reverse(arr , 0 , K - 1);
        reverse(arr , K , n - 1);
    }
    /*
    TC : O(n) ---> Each reverse operation takes  O(n)  time in total since the array is reversed in parts.
    SC : O(1) ---> No extra space is used other than a few variables for swapping elements.
    */

}
