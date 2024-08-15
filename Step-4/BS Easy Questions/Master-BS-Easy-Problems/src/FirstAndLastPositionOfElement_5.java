import java.util.Arrays;

public class FirstAndLastPositionOfElement_5 {
    public static void main(String[] args) {
        int[] arr = {3,4,13,13,13,20,40};
        int[] bruteForceAnswer = bruteForceFirstAndLastPositionOfElement(arr , 13);
        System.out.println("Brute Force Answer : " + Arrays.toString(bruteForceAnswer));
        String betterAnswer = betterFirstAndLastPositionOfElement(arr , 13);
        System.out.println("Better Answer : " + betterAnswer);
        int[] optimalAnswer = optimalFirstAndLastPositionOfElement(arr , 13);
        System.out.println("Optimal Answer : " + Arrays.toString(optimalAnswer));
    }

    // Brute Force Approach
    public static int[] bruteForceFirstAndLastPositionOfElement(int[] arr , int target) {
        int n = arr.length;
        int[] ansArr = new int[2];
        int firstOccurrence = -1;
        int lastOccurrence = -1;
        for (int i = 0; i < n; i++) {
            int element = arr[i];
            if(element == target){
                if(firstOccurrence == -1 && lastOccurrence == -1){
                    firstOccurrence = i;
                    lastOccurrence = i;
                }
                else if (firstOccurrence != -1) {
                    lastOccurrence = i;
                }
            }
        }
        ansArr[0] = firstOccurrence;
        ansArr[1] = lastOccurrence;
        return ansArr;
    }
    /*
    TC : O(n) ---> The algorithm iterates through the entire array to find the first and last occurrences of the target, which requires a full scan of the array.
    SC : O(1) ---> The space complexity is O(1) for variables, but since an extra array ansArr of size 2 is used to store the result, the overall space complexity remains effectively O(1), as it’s a fixed size regardless of input. If the array’s size were not fixed, we’d consider it part of the complexity, but here it’s constant.
    */

    // Better Approach
    public static String betterFirstAndLastPositionOfElement(int[] arr , int target) {
        String str = "There is no better solution to this Problem.";
        return str;
    }

    // Optimal Approach
    public static int[] optimalFirstAndLastPositionOfElement(int[] arr, int target) {
        int n = arr.length;
        int[] ansArr = new int[2];
        ansArr[0] = findFirstOccurrence(arr, target);
        ansArr[1] = findLastOccurrence(arr, target);
        return ansArr;
    }
    private static int findFirstOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int firstOccurrence = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                firstOccurrence = mid;
                high = mid - 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return firstOccurrence;
    }
    private static int findLastOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int lastOccurrence = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                lastOccurrence = mid;
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return lastOccurrence;
    }
    /*
    TC : O(log n) ---> The binary search algorithm is used, reducing the search space by half each time, resulting in logarithmic time complexity.
    SC : O(1) ---> The algorithm uses only a fixed amount of extra space for variables like low, high, and mid, with no extra space required for storage beyond the result array, which is also of constant size.
    */

}
