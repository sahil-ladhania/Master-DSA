import java.util.Arrays;

public class SortArrayZerosOnesTwos_2 {
    public static void main(String[] args) {
        int[] arr1 = {2,0,2,1,1,0};
        bruteForceSortArr(arr1);
        System.out.println("Brute Force Answer : " + Arrays.toString(arr1));
        int[] arr2 = {2,0,2,1,1,0};
        betterSortArr(arr2);
        System.out.println("Better Answer : " + Arrays.toString(arr2));
        int[] arr3 = {2,0,2,1,1,0};
        optimalSortArr(arr3);
        System.out.println("Optimal Answer : " + Arrays.toString(arr3));
    }

    // Brute Force Approach
    public static void bruteForceSortArr(int[] arr) {
        Arrays.sort(arr); // We can use any Sorting Algorithm here , But because we already have Sort Method , We will use it.
    }
    /*
    TC : O(n log n) ---> The built-in sort method typically uses a variant of quicksort or mergesort, both of which have average time complexity of O(n log n).
    SC : O(1) ---> O(1) if in-place sorting is used, otherwise it may use O(n) space depending on the implementation.
    */

    // Better Approach
    public static void betterSortArr(int[] arr) {
        int n = arr.length;
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == 0){
                count0++;
            }
            else if (arr[i] == 1) {
                count1++;
            }
            else{
                count2++;
            }
        }
        int index = 0;
        for (int i = 0; i < count0; i++) {
            arr[index++] = 0;
        }
        for (int i = 0; i < count1; i++) {
            arr[index++] = 1;
        }
        for (int i = 0; i < count2; i++) {
            arr[index++] = 2;
        }
    }
    /*
    TC : O(2n) ---> We traverse the array twice, once for counting and once for updating the array.
    SC : O(1) ---> We use only a few extra variables for counting and indexing, and we modify the array in place.
    */

    // Optimal Approach
    public static void optimalSortArr(int[] arr) {
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;
        while (mid <= high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if (arr[mid] == 1) {
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
    /*
    TC : O(n) ---> We traverse the array once with a single while loop.
    SC : O(1) ---> We only use a few extra variables for pointers and swaps, and we modify the array in place.
    */
}
