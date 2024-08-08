import java.util.HashMap;

public class CountSubArraysWithGivenSum_14 {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        int bruteAnswer = bruteForceCountSubArrWithGivenSum(arr , 6);
        System.out.println("Brute Force Answer : " + bruteAnswer);
        int betterAnswer = betterCountSubArrWithGivenSum(arr , 6);
        System.out.println("Better Answer : " + betterAnswer);
        int optimalAnswer = optimalCountSubArrWithGivenSum(arr , 6);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    // Brute Force Approach
    public static int bruteForceCountSubArrWithGivenSum(int[] arr , int k) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int m = i; m <= j; m++) {
                    sum = sum + arr[m];
                }
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
    /*
    TC : O(n^3) ---> Due to three nested loops iterating through all possible subarrays and their elements.
    SC : O(1) ---> No additional space is required beyond variables.
    */

    // Better Approach
    public static int betterCountSubArrWithGivenSum(int[] arr , int k) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + arr[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
    /*
    TC : O(n^2) ---> Due to two nested loops iterating through all possible subarrays, calculating their sums.
    SC : O(1) ---> No additional space is required beyond variables.
    */

    // Optimal Approach
    public static int optimalCountSubArrWithGivenSum(int[] arr , int k) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int count = 0;
        map.put(0, 1);
        for (int i = 0; i < n; i++) {
            prefixSum = prefixSum + arr[i];
            int remove = prefixSum - k;
            count = count +  map.getOrDefault(remove, 0);
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }
    /*
    TC : O(n) ---> Due to a single loop iterating through the array, with constant-time operations using a hash map.
    SC : O(n) ---> Due to the hash map storing prefix sums.
    */
}
