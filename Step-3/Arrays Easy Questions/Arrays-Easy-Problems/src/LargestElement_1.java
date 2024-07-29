import java.util.Arrays;

public class LargestElement_1 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,4,5,4,9};
        largestElementBruteForce(arr);
        int n = arr.length;
        System.out.println("Brute Force Answer : " + arr[n-1]);
        String betterAnswer = largestElementBetter(arr);
        System.out.println("Better Answer : " + betterAnswer);
        int optimalAnswer = largestElementOptimal(arr);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    // Brute Force Approach -----> TC :
    public static int minIndex(int[] arr , int currentIndex) {
        return 1;
    }
    public static void swapElements(int[] arr , int minIndex , int currentIndex) {

    }
    public static void largestElementBruteForce(int[] arr) {

    }

    // Better Approach
    public static String largestElementBetter(int[] arr) {
        String str = "We dont have a better Solution in this Question !!!";
        return str;
    }

    // Optimal Approach ---> TC :
    public static int largestElementOptimal(int[] arr) {
        return 1;
    }

}
