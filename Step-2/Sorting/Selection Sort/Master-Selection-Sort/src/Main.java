import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Master Selection Sort :");
        int[] arr = {3 , 11 , 50 , 9 , 6};
        // Call the selectionSort method to sort the array
        selectionSort(arr);
        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }

    // Method to perform selection sort on an array
    static void selectionSort(int[] arr) {
        // Loop through the array, moving the boundary of the unsorted subarray
        for (int i = 0; i < arr.length; i++) {
            // Determine the index of the last element in the unsorted subarray
            int last = arr.length - i - 1;
            // Find the index of the maximum element in the unsorted subarray
            int maxIndex = getMaxIndex(arr, 0, last);
            // Swap the maximum element with the last element of the unsorted subarray
            swap(arr, maxIndex, last);
        }
    }

    // Method to swap two elements in an array
    static void swap(int[] arr, int first, int second) {
        // Store the value of the first element in a temporary variable
        int temp = arr[first];
        // Assign the value of the second element to the first element
        arr[first] = arr[second];
        // Assign the value stored in the temporary variable to the second element
        arr[second] = temp;
    }

    // Method to find the index of the maximum element in a subarray
    static int getMaxIndex(int[] arr, int start, int end) {
        // Assume the first element is the maximum
        int max = start;
        // Loop through the subarray to find the actual maximum element
        for (int i = start; i <= end; i++) {
            // Update the maximum index if a larger element is found
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        // Return the index of the maximum element
        return max;
    }
}