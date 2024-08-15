public class NumberOfOccurences_6 {
    public static void main(String[] args) {
        int[] arr = {2,2,3,3,3,3,4};
        int bruteForceAnswer = bruteForceNumberOfOccurences(arr , 3);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        String betterAnswer = betterNumberOfOccurences(arr , 3);
        System.out.println("Better Answer : " + betterAnswer);
        int optimalAnswer = optimalNumberOfOccurences(arr , 3);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    public static int bruteForceNumberOfOccurences(int[] arr , int target) {
        int n = arr.length;
        int occurences = 0;
        for (int i = 0; i < n; i++) {
            int element = arr[i];
            if(element == target){
                occurences++;
            }
        }
        return occurences;
    }
    /*
    TC : O(n) ---> Iterates through each element in the array to count occurrences.
    SC : O(1) ---> Uses a constant amount of extra space regardless of the input size.
    */

    public static String betterNumberOfOccurences(int[] arr , int target) {
        String str = "There is no better solution for this Problem.";
        return str;
    }

    public static int optimalNumberOfOccurences(int[] arr, int target) {
        int n = arr.length;
        int first = firstOccurrence(arr, n, target);
        if (first == -1) {
            return 0;
        }
        int last = lastOccurrence(arr, n, target);
        return last - first + 1;
    }
    private static int firstOccurrence(int[] arr, int n, int x) {
        int low = 0;
        int high = n - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                result = mid;
                high = mid - 1;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
    private static int lastOccurrence(int[] arr, int n, int x) {
        int low = 0;
        int high = n - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                result = mid;
                low = mid + 1;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
    /*
    TC : O(log n) ---> Uses binary search to efficiently find the first and last occurrences.
    SC : O(1) ---> Uses a constant amount of extra space beyond the input.
    */

}
