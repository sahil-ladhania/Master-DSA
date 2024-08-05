import java.util.HashMap;
import java.util.HashSet;

public class PrefixSumHashing {
    public static void main(String[] args) {
        System.out.println("Master Prefix-Sum with Hashing !!!");
        int[] arr1 = {1, 1, 1, 2, 2, 2, 3};
        int k1 = 4;
        System.out.println("Count SubArrays With Sum = k: " + countSubArraysWithSum(arr1, k1)); // Expected: 3 -> [1,1,2] , [2,2] , [2,2]
        int[] arr2 = {1, -1, 2, -2, 3};
        System.out.println("Has SubArray With Zero Sum: " + hasSubArrayWithZeroSum(arr2)); // Expected: true
        int[] arr3 = {1, 2, 1, 2, 1};
        int k2 = 4;
        System.out.println("Longest SubArray With Sum = k: " + longestSubArrayWithSum(arr3, k2)); // Expected: 3
        int[] arr4 = {23, 2, 4, 6, 7};
        int k3 = 6;
        System.out.println("Check Continuous SubArray Sum Multiple Of k: " + checkContinuousSubArraySum(arr4, k3)); // Expected: true
        int[] arr5 = {1, 2, 3, 4, 5};
        int k4 = 11;
        System.out.println("Max SubArray Sum Less Than or Equal to k: " + maxSubArraySumLessThanOrEqualToK(arr5, k4)); // Expected: 10
        int[] arr6 = {1, 2, 3, 4};
        System.out.println("Count SubArrays With Even Sum: " + countSubArraysWithEvenSum(arr6)); // Expected: 4
        int[] arr7 = {1, 2, 3, 4};
        System.out.println("Count SubArrays With Odd Sum: " + countSubArraysWithOddSum(arr7)); // Expected: 6
        int[] arr8 = {4, 5, 0, -2, -3, 1, 4};
        int k5 = 5;
        System.out.println("Has SubArray Sum Divisible By k: " + hasSubArraySumDivisibleByK(arr8, k5)); // Expected: true
        int[] arr9 = {1, 2, 3, 4, 5};
        int startIdx = 1;
        int endIdx = 3;
        System.out.println("Sum Between Indices: " + sumBetweenIndices(arr9, startIdx, endIdx)); // Expected: 9
        int[] arr10 = {1, 1, 0, 0, 1, 1, 0, 0};
        System.out.println("Count SubArrays With Equal Zeroes And Ones: " + countSubArraysWithEqualZeroesAndOnes(arr10)); // Expected: 6
    }

    // Given an array of integers arr and an integer k, count the number of sub-arrays that sum to k.
    public static int countSubArraysWithSum(int[] arr, int k) {
        HashMap<Integer , Integer> prefixSumMap = new HashMap<>();
        int prefixSum = 0;
        int count = 0;
        int n = arr.length;
        prefixSumMap.put(0 , 1);
        for (int i = 0; i < n; i++) {
            int element = arr[i];
            prefixSum += element;
            int complement = (prefixSum - k);
            if(prefixSumMap.containsKey(complement)){
                count += prefixSumMap.get(complement);
            }
            int currentCount = prefixSumMap.getOrDefault(prefixSum , 0);
            prefixSumMap.put(prefixSum , currentCount + 1);
        }
        return count;
    }

    // Given an array of integers arr, check if there is a subarray with a sum equal to zero.
    public static boolean hasSubArrayWithZeroSum(int[] arr) {
        HashSet<Integer> prefixSumSet = new HashSet<>();
        int n = arr.length;
        int prefixSum = 0;
        prefixSumSet.add(0);
        for (int i = 0; i < n; i++) {
            int element = arr[i];
            prefixSum += element;
            if(prefixSumSet.contains(prefixSum)){
                return true;
            }
            prefixSumSet.add(prefixSum);
        }
        return false;
    }

    // Given an array of integers arr and an integer k, find the length of the longest subarray that sums to k.
    public static int longestSubArrayWithSum(int[] arr, int k) {
        HashMap<Integer , Integer> prefixSumMap = new HashMap<>();
        int n = arr.length;
        int prefixSum = 0;
        int maxLength = 0;
        prefixSumMap.put(0 , -1);
        for (int i = 0; i < n; i++) {
            int element = arr[i];
            prefixSum += element;
            int complement = (prefixSum - k);
            if(prefixSumMap.containsKey(complement)){
                int length = i - prefixSumMap.get(complement);
                maxLength = Math.max(maxLength , length);
            }
            if (!prefixSumMap.containsKey(prefixSum)) {
                prefixSumMap.put(prefixSum, i);
            }
        }
        return maxLength;
    }

    // Given an array of integers arr and an integer k, check if the array has a continuous subarray of size at least two that sums up to a multiple of k.
    public static boolean checkContinuousSubArraySum(int[] arr, int k) {
        return false;
    }

    // Given an array of integers arr and an integer k, find the maximum sum of a subarray that is less than or equal to k.
    public static int maxSubArraySumLessThanOrEqualToK(int[] arr, int k) {
        return 1;
    }

    // Given an array of integers arr, count the number of sub-arrays with an even sum.
    public static int countSubArraysWithEvenSum(int[] arr) {
        return 1;
    }

    // Given an array of integers arr, count the number of sub-arrays with an odd sum.
    public static int countSubArraysWithOddSum(int[] arr) {
        return 1;
    }

    // Given an array of integers arr and an integer k, find if there is a subarray whose sum is divisible by k.
    public static boolean hasSubArraySumDivisibleByK(int[] arr, int k) {
        return false;
    }

    // Given an array of integers arr, compute the prefix sums of the array and use them to find the sum of elements.
    public static int sumBetweenIndices(int[] arr, int startIdx, int endIdx) {
        return 1;
    }

    // Given a binary array arr containing only 0s and 1s, find the number of sub-arrays with an equal number of 0s and 1s.
    public static int countSubArraysWithEqualZeroesAndOnes(int[] arr) {
        return 1;
    }

}