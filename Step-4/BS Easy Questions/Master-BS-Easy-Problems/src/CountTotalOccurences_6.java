public class CountTotalOccurences_6 {
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
            if(arr[i] == target){
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
        int leftCount = countLeftSideOccurences(arr , target);
        int rightCount = countRightSideOccurences(arr , target);
        int totalOccurences = leftCount + rightCount;
        return totalOccurences;
    }

    // First Occ
    public static int countLeftSideOccurences(int[] arr , int target) {
        int n = arr.length;
        int leftCount = 1;
        int start = 0;
        int end = n-1;
        while (start <= end){
            int mid = start + (end - start) / 2;
        }
        return leftCount;
    }

    // Last Occ
    public static int countRightSideOccurences(int[] arr , int target) {
        int n = arr.length;
        int rightCount = 1;
        int start = 0;
        int end = n-1;
        while (start <= end){
            int mid = start + (end - start) / 2;
        }
        return rightCount;
    }

    /*
    TC : O(log n) ---> Uses binary search to efficiently find the first and last occurrences.
    SC : O(1) ---> Uses a constant amount of extra space beyond the input.
    */

}