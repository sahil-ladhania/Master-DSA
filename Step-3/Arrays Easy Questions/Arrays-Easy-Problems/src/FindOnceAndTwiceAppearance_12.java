import java.util.Arrays;

public class FindOnceAndTwiceAppearance_12 {
    public static void main(String[] args) {
        System.out.println("The Optimal Solution is solved using XOR , try to go in depth of XOR.");
        int[] arr = {4,1,3,2,6,2,3,4,1};
        int bruteForceAnswer = bruteForceFindOnceAppereance(arr);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        int  betterAnswer = betterFindOnceAppereance(arr);
        System.out.println("Better Answer : " + betterAnswer);
        int optimalAnswer = optimalFindOnceAppereance(arr);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    // Brute Force Approach -----> TC :
    public static int bruteForceFindOnceAppereance(int[] arr) {
        return 1;
    }

    // Better Approach ---> TC :
    public static int  betterFindOnceAppereance(int[] arr) {
        return 1;
    }

    // Optimal Approach ---> TC : O(N)
    public static int optimalFindOnceAppereance(int[] arr) {
        return 1;
    }

}
