import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class FindMissingNumber_10 {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        int bruteForceAnswer = bruteForceMissingNumber(arr);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        int  betterAnswer = betterMissingNumber(arr);
        System.out.println("Better Answer : " + betterAnswer);
        int optimalAnswer = optimalMissingNumber(arr);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    // Brute Force Approach
    public static int bruteForceMissingNumber(int[] arr) {
        int n = arr.length;
        for (int num = 0; num <= n; num++) {
            boolean found = false;
            for (int j = 0; j < n; j++) {
                if (arr[j] == num) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return num;
            }
        }
        return -1;
    }
    /*
    TC : O(n^2) ---> The outer loop runs  n+1  times, and for each iteration, the inner loop runs  n  times.
    SC : O(1) ---> Uses a constant amount of extra space.
    */

    // Better Approach
    public static int  betterMissingNumber(int[] arr) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>(n);
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        for (int j = 0; j <= n; j++) {
            if(!set.contains(j)){
                return j;
            }
        }
        return -1;
    }
    /*
    TC : O(2n) ---> Adding elements to the HashSet takes O(2n) time, and checking for the missing number also takes
                    O(2n) time.
    SC : O(n) ---> The HashSet requires additional space to store the elements of the array.
    */

    // Optimal Approach
    public static int optimalMissingNumber(int[] arr) {
        int n = arr.length;
        int missingNum;
        int arrSum = 0;
        int SumN = n * (n + 1) / 2;
        for (int i = 0; i < n; i++) {
            arrSum = arrSum + arr[i];
        }
        missingNum = SumN - arrSum;
        return missingNum;
    }
    /*
    TC : O(n) ---> You iterate through the array once to calculate the sum.
    SC : O(1) ---> You use a constant amount of extra space for variables.
    */

}
