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

    // Function to perform Bubble Sort on an array
    public static void bubbleSort(int[] arr) {
        boolean swapped;
        // Loop through the array n-1 times (where n is the length of the array)
        for (int i = 0; i < arr.length; i++) {
            swapped = false; // Initialize swapped to false at the start of each outer loop
            // Inner loop to compare and swap adjacent elements if needed
            for (int j = 1; j < arr.length - i; j++) {
                // If the current element is smaller than the previous element, swap them
                if (arr[j] < arr[j - 1]) {
                    // Swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true; // Set swapped to true to indicate a swap occurred
                }
            }
            // If no swaps occurred during this pass, the array is already sorted
            if (!swapped) {
                break; // Exit the loop early as no more sorting is needed
            }
        }
    }
}