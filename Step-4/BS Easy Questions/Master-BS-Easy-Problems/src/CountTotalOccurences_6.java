public class CountTotalOccurences_6 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 3, 3, 4};
        int bruteForceAnswer = bruteForceNumberOfOccurences(arr, 3);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        String betterAnswer = betterNumberOfOccurences(arr, 3);
        System.out.println("Better Answer : " + betterAnswer);
        int optimalAnswer = optimalNumberOfOccurences(arr, 3);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    public static int bruteForceNumberOfOccurences(int[] arr, int target) {
        int n = arr.length;
        int occurences = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                occurences++;
            }
        }
        return occurences;
    }
    /*
    TC : O(n) ---> Iterates through each element in the array to count occurrences.
    SC : O(1) ---> Uses a constant amount of extra space regardless of the input size.
    */

    public static String betterNumberOfOccurences(int[] arr, int target) {
        String str = "There is no better solution for this Problem.";
        return str;
    }

    public static int optimalNumberOfOccurences(int[] arr, int target) {
        int firstCount = firstOccurence(arr, target);
        int lastCount = lastOccurence(arr, target);
        int totalOccurences = lastCount - firstCount + 1;
        return totalOccurences;
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
    TC : O(2 log n) ---> Uses binary search to efficiently find the first and last occurrences.
    SC : O(1) ---> Uses a constant amount of extra space beyond the input.
    */

}