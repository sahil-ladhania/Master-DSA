import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Master Merge Sort:");
        int[] arr = {50, 14, 30, 2, 1};
        int[] answer = mergeSort(arr);
        System.out.println(Arrays.toString(answer));
    }

    // Main mergeSort function that recursively splits and merges the array
    public static int[] mergeSort(int[] arr) {
        // Base case: if the array has only one element, it's already sorted
        if (arr.length == 1) {
            return arr;
        }

        // Finding the midpoint to split the array into two halves
        int mid = arr.length / 2;
        // Recursively splitting the array into left and right halves
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        // Merging the sorted halves
        return merge(left, right);
    }

    // Merge function that combines two sorted arrays into one sorted array
    public static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0; // Pointer for first array
        int j = 0; // Pointer for second array
        int k = 0; // Pointer for mix array

        // Comparing elements from both arrays and adding the smaller one to mix
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // Adding any remaining elements from first array to mix
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        // Adding any remaining elements from second array to mix
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        // Returning the merged and sorted array
        return mix;
    }
}
