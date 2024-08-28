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
        int firstOcc = -1;
        int lastOcc = -1;
        for (int i = 0; i < n; i++) {
            if(arr[i] !=  target){
                continue;
            }
            else{
                if(firstOcc == -1){
                    firstOcc = i;
                }
                lastOcc = i;
            }
        }
        return new int[] {firstOcc , lastOcc};
    }
    /*
    TC : O(n) ---> The algorithm scans the array once, so it operates in linear time relative to the size of the array.
    SC : O(1) ---> The algorithm uses a fixed amount of extra space (for firstOcc and lastOcc), regardless of the array size.
    */

    // Better Approach
    public static String betterFirstAndLastPositionOfElement(int[] arr , int target) {
        String str = "There is no better solution to this Problem.";
        return str;
    }

    // Optimal Approach
    public static int[] optimalFirstAndLastPositionOfElement(int[] arr, int target) {
        int first = firstOccurence(arr , target);
        int last = lastOccurence(arr , target);
        return new int[] {first , last};
    }

    public static int firstOccurence(int[] arr , int target) {
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int first = -1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                first = mid;
                end = mid - 1;
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return first;
    }
    public static int lastOccurence(int[] arr , int target) {
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int last = -1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                last = mid;
                start = mid + 1;
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return last;
    }
    /*
    TC : O(log n) ---> Both firstOccurence and lastOccurence use binary search, which operates in logarithmic time.
    SC : O(1) ---> The approach uses a constant amount of extra space for variables.
    */

}
