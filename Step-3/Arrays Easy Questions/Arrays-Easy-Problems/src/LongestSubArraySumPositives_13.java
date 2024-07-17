public class LongestSubArraySumPositives_13 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1,4,2,3};
        int k = 3;
        int bruteForceAnswer = bruteForceLongestSubArray(arr , k);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        int betterAnswer = betterLongestSubArray(arr , k);
        System.out.println("Better Answer : " + betterAnswer);
        int optimalAnswer = optimalLongestSubArray(arr , k);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    public static int bruteForceLongestSubArray(int[] arr , int k) {
        return 1;
    }

    public static int betterLongestSubArray(int[] arr , int k) {
        return 1;
    }

    public static int optimalLongestSubArray(int[] arr, int k) {
        return 1;
    }

}
