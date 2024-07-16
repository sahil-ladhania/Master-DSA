import java.util.Arrays;

public class ArraysRotationByK {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        rightRotationByK(arr1, 2);
        System.out.println("Array Right Rotation By 2: " + Arrays.toString(arr1));

        int[] arr2 = {1, 2, 3, 4, 5};
        leftRotationByK(arr2, 2); // Implement this function later
        System.out.println("Array Left Rotation By 2: " + Arrays.toString(arr2));
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

    // Algorithm for Array Right Rotation by K
    public static void rightRotationByK(int[] arr, int K) {
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

    // Algorithm for Array Left Rotation by K
    public static void leftRotationByK(int[] arr, int K) {
        int N = arr.length;
        if(K > N){
            K = K % N;
        }
        // Reverse the First K Elements
        reverse(arr , 0 , K-1);
        // Reverse the Remaining (N-K) Elements
        reverse(arr , K , N-1);
        // Reverse Entire Array
        reverse(arr , 0 , N-1);
    }

}
