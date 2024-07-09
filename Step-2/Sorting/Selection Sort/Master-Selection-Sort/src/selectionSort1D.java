import java.util.Arrays;

public class selectionSort1D {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println("Original Array: " + Arrays.toString(arr));
        selectionSort1(arr); // Call selectionSort1 to sort the array
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    // Function to Find the Minimum Index -----> Returns Minimum Index
    public static int minimumIndex(int[] arr, int start) {
        int minIndex = start;
        for (int i = start + 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    // Function to Swap the Index -----> Returns Nothing
    public static void swapElements(int[] arr, int currentPosition, int minimumIndex) {
        int temp = arr[currentPosition];
        arr[currentPosition] = arr[minimumIndex];
        arr[minimumIndex] = temp;
    }

    // Selection Sort Algorithm
    public static void selectionSort1(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Find the index of the minimum element in the unsorted portion
            int minIndex = minimumIndex(arr, i);

            // Swap the current element at position i with the smallest element found
            if (minIndex != i) {
                swapElements(arr, i, minIndex);
            }
        }
    }
}
