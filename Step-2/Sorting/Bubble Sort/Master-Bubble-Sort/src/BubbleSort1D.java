import java.util.Arrays;

public class BubbleSort1D {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println("Original Array: " + Arrays.toString(arr));
        BubbleSort(arr); // Call BubbleSort to sort the array
        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }

    // Bubble Sort Algorithm
    public static void BubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
