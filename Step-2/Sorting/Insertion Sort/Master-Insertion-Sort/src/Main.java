import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Master Insertion Sort :");
        int[] arr = {5,3,40,11,2};
        // Call the insertionSort method to sort the array
        insertionSort(arr);
        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }

    // Method to perform insertion sort on the array
    public static void insertionSort(int[] arr) {
        // Loop through the array starting from the second element
        for (int i = 0; i < arr.length - 1; i++) {
            // Inner loop to compare and shift elements as needed
            for (int j = i+1; j > 0; j--) {
                // If the current element is less than the previous element, swap them
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                }
                // If the current element is not less than the previous, break the loop
                else {
                    break;
                }
            }
        }
    }

    // Method to swap two elements in the array
    public static void swap(int[] arr, int first, int second) {
        // Store the value of the first element in a temporary variable
        int temp = arr[first];
        // Assign the value of the second element to the first
        arr[first] = arr[second];
        // Assign the value of the temporary variable to the second element
        arr[second] = temp;
    }
}