import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Master Quick Sort : ");

        // Initialize array to be sorted
        int[] arr = {5, 4, 3, 2, 1};

        // Call the quickSort function
        quickSort(arr, 0, arr.length - 1);

        // Print sorted array
        System.out.println(Arrays.toString(arr));
    }

    // Quick Sort function
    public static void quickSort(int[] nums, int low, int hi) {
        // Base case: if the low index is greater than or equal to high index, return
        if (low >= hi) {
            return;
        }

        // Initialize the start, end, and pivot variables
        int s = low;
        int e = hi;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        // Partitioning the array
        while (s <= e) {
            // Move the start index forward while the element is less than the pivot
            while (nums[s] < pivot) {
                s++;
            }

            // Move the end index backward while the element is greater than the pivot
            while (nums[e] > pivot) {
                e--;
            }

            // Swap elements if the start index is less than or equal to the end index
            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        // Recursively apply quickSort to the left and right subarrays
        quickSort(nums, low, e); // Left subarray
        quickSort(nums, s, hi);  // Right subarray
    }
}
