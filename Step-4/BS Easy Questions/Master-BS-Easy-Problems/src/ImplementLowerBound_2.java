import java.util.Arrays;

public class ImplementLowerBound_2 {
    public static void main(String[] args) {
        int[] arr = {3,5,8,15,19};
        int bruteForceAnswer = bruteForceLowerBound(arr , 20);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        String betterAnswer = betterLowerBound(arr , 20);
        System.out.println("Better Answer : " + betterAnswer);
        int optimalAnswer = optimalLowerBound(arr , 20);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    // Brute Force Approach
    public static int bruteForceLowerBound(int[] arr , int x) {
        int n = arr.length;
        return n;
    }
    /*
    TC : O(n) ---> In the worst case, the loop will iterate through all n elements of the array before finding the element or reaching the end of the array.
    SC : O(1) ---> The brute force approach only uses a few integer variables for tracking the array length and the loop index, so the space complexity is constant, O(1).
    */

    // Better Approach
    public static String betterLowerBound(int[] arr , int x) {
        String str = "There is no better solution to this Problem.";
        return str;
    }

    // Optimal Approach
    public static int optimalLowerBound(int[] arr , int x) {
        int n = arr.length;
        return n;
    }
    /*
    TC : O(log n) ---> Binary search works by dividing the array into halves in each iteration. This results in logarithmic time complexity, as each step reduces the search space by half. Specifically, after log n steps, the search space reduces to a single element.
    SC : O(1) ---> The optimal approach uses a few variables (low, high, mid, ans) to keep track of the current bounds and result. Since these variables do not depend on the size of the input array, the space complexity remains constant, O(1).
    */

}

