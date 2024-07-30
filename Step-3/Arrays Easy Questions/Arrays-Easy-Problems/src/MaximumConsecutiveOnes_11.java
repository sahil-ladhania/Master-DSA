public class MaximumConsecutiveOnes_11 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,0,1,1,1};
        String  bruteForceAnswer = bruteForceMaxConsecutive1(arr);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        String  betterAnswer = betterMaxConsecutive1(arr);
        System.out.println("Better Answer : " + betterAnswer);
        int  optimalAnswer = optimalMaxConsecutive1(arr);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    // Brute Force Approach
    public static String bruteForceMaxConsecutive1(int[] arr) {
        String str = "There is no brute force solution to this problem.";
        return str;
    }

    // Better Approach
    public static String betterMaxConsecutive1(int[] arr) {
        String str = "There is no better solution to this problem.";
        return str;
    }

    // Optimal Approach
    public static int optimalMaxConsecutive1(int[] arr) {
        int n = arr.length;
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] != 0){
                count++;
            }
            else{
                maxCount = Math.max(count , maxCount);
                count = 0;
            }
        }
        return Math.max(count , maxCount);
    }
    /*
    TC : O(n) ---> The array is traversed once.
    SC : O(1) ---> Only a constant amount of extra space is used.
    */

}
