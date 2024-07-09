import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Master Bubble Sort : ");
        int[] arr = {50, 30, 4, 1, 2};
        // Call the bubbleSort function to sort the array
        bubbleSort(arr);
        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }

    // Bubble Sort Algorithm
    public static void bubbleSort(int[] arr) {
        int n = arr.length; // Length of the array
        boolean swapped; // Flag to track if any elements were swapped
        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false; // Reset swapped flag for each pass
            // Inner loop for comparisons and swapping
            // Last i elements are already sorted, so compare and swap till n-i-1
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; // Set swapped flag to true
                }
            }
            // If no elements were swapped in this pass, array is already sorted
            if (!swapped) {
                break; // Exit the outer loop
            }
        }
    }
}