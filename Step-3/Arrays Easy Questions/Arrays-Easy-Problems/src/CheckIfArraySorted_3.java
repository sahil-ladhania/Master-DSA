public class CheckIfArraySorted_3 {
    public static void main(String[] args) {
        int[] arr = {1,2,30,4};
        System.out.println("There's no better method to solve this Question with better TC !!!");
        boolean bruteForceAnswer = bruteForceCheckSorted(arr);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        String betterAnswer = betterCheckSorted(arr);
        System.out.println("Better Answer : " + betterAnswer);
        boolean optimalAnswer = optimalCheckSorted(arr);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    // Brute Force Approach
    public static boolean bruteForceCheckSorted(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(arr[i] > arr[j]){
                    return false;
                }
            }
        }
        return true;
    }
    /*
    TC : O(n^2) ---> The outer for loop runs  n  times, and for each iteration of the outer loop, the inner for
                     loop runs  n-i-1  times. This results in a quadratic time complexity of  O(n^2) .
    SC : O(1) ---> The space complexity is  O(1)  because only a few extra variables (n, i, and j) are used. No
                   additional space that grows with the input size is required.
    */

    // Better Approach
    public static String  betterCheckSorted(int[] arr) {
        String str = "There is no better solution of this Problem.";
        return str;
    }

    // Optimal Approach
    public static boolean optimalCheckSorted(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if(arr[i] < arr[i - 1]){
                return false;
            }
        }
        return true;
    }
    /*
    TC : O(n) ---> The for loop iterates through the array once, comparing each element to the previous one. This
                   results in a linear time complexity of  O(n) .
    SC : O(1) ---> The space complexity is  O(1)  because only a few extra variables (n and i) are used. No additional
                   space that grows with the input size is required.
    */

}