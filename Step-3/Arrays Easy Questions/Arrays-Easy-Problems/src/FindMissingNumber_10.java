import java.util.Arrays;

public class FindMissingNumber_10 {
    public static void main(String[] args) {
        int[] arr = {1,4,3};
        int bruteForceAnswer = bruteForceMissingNumber(arr);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        String  betterAnswer = betterMissingNumber(arr);
        System.out.println("Better Answer : " + betterAnswer);
        int optimalAnswer = optimalMissingNumber(arr);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    // Brute Force Approach -----> TC : O(n^2)
    public static int bruteForceMissingNumber(int[] arr) {
        int n = arr.length + 1;
        for (int i = 1; i <= n; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i;
            }
        }
        return -1;
    }


    // Better Approach ---> TC :
    public static String  betterMissingNumber(int[] arr) {
        String str = "The better solution for this question can be solved using Hashing.";
        return str;
    }

    // Optimal Approach ---> TC :
    public static int optimalMissingNumber(int[] arr) {
        int n = arr.length;
        int Sn = (n + 1) * (n + 2) / 2;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int missingNum = Sn - sum;
        return missingNum;
    }

}
