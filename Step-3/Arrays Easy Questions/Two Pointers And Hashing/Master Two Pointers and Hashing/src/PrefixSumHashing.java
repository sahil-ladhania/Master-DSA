public class PrefixSumHashing {
    public static void main(String[] args) {
        System.out.println("Master Prefix-Sum with Hashing !!!");
        int[] arr1 = {1, -1, 2, -2, 3};
        System.out.println("Has SubArray With Zero Sum: " + hasSubArrayWithZeroSum(arr1)); // Expected: true
        int[] arr2 = {1, 1, 1, 2, 2, 2, 3};
        int k1 = 4;
        System.out.println("Count SubArrays With Sum = k: " + countSubArraysWithSum(arr2, k1)); // Expected: 4
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

    public static boolean hasSubArrayWithZeroSum(int[] arr) {
        return false;
    }

    public static int countSubArraysWithSum(int[] arr, int k) {
        return 1;
    }

    public static int longestSubArrayWithSum(int[] arr, int k) {
        return 1;
    }

    public static boolean checkContinuousSubArraySum(int[] arr, int k) {
        return false;
    }

    public static int maxSubArraySumLessThanOrEqualToK(int[] arr, int k) {
        return 1;
    }

    public static int countSubArraysWithEvenSum(int[] arr) {
        return 1;
    }

    public static int countSubArraysWithOddSum(int[] arr) {
        return 1;
    }

    public static boolean hasSubArraySumDivisibleByK(int[] arr, int k) {
        return false;
    }

    public static int sumBetweenIndices(int[] arr, int startIdx, int endIdx) {
        return 1;
    }

    public static int countSubArraysWithEqualZeroesAndOnes(int[] arr) {
        return 1;
    }

}