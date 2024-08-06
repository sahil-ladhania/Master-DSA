import java.util.Arrays;

public class MaximumSubArraySum_4 {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int bruteForceAnswer = bruteForceMaxSubArraySum(arr);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        int betterAnswer = betterMaxSubArraySum(arr);
        System.out.println("Better Answer : " + betterAnswer);
        int optimalAnswer = optimalMaxSubArraySum(arr);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    // Brute Force Approach
    public static int bruteForceMaxSubArraySum(int[] arr) {
        int n = arr.length;
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                }
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }
    /*
    TC : O(n^3) ---> Three nested loops result in cubic time complexity as each loop contributes to the total computation.
    SC : O(1) ---> Only a few extra variables are used, so space complexity is constant.
    */

    // Better Approach
    public static int betterMaxSubArraySum(int[] arr) {
        int n = arr.length;
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + arr[j];
                if(sum > maxSum){
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }
    /*
    TC : O(n^2) ---> Two nested loops result in quadratic time complexity since the inner loop iterates n-i times for each i.
    SC : O(1) ---> Only a few extra variables are used, so space complexity is constant.
    */

    // Optimal Approach
    public static int optimalMaxSubArraySum(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            if(sum > maxSum){
                maxSum = sum;
            }
            if(sum < 0){
               sum = 0;
            }
        }
        return maxSum;
    }
    /*
    TC : O(n) ---> A single loop iterates through the array once, resulting in linear time complexity.
    SC : O(1) ---> Only a few extra variables are used, so space complexity is constant.
    */
}
