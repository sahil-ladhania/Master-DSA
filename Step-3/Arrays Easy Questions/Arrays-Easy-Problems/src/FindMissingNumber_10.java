import java.util.Arrays;

public class FindMissingNumber_10 {
    public static void main(String[] args) {
        int[] arr = {1,4,3};
        int bruteForceAnswer = bruteForceMissingNumber(arr);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        int  betterAnswer = betterMissingNumber(arr);
        System.out.println("Better Answer : " + betterAnswer);
        int optimalAnswer = optimalMissingNumber(arr);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    // Brute Force Approach -----> TC :
    public static int bruteForceMissingNumber(int[] arr) {
        return 1;
    }


    // Better Approach ---> TC :
    public static int  betterMissingNumber(int[] arr) {
        return 1;
    }

    // Optimal Approach ---> TC :
    public static int optimalMissingNumber(int[] arr) {
        return 1;
    }

}
