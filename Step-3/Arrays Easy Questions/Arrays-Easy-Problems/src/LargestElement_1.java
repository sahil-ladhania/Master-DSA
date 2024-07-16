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

    // Brute Force Approach -----> TC : O(n^2)
    public static int minIndex(int[] arr , int currentIndex) {
        int minIndex = currentIndex;
        for (int i = currentIndex + 1; i < arr.length; i++) {
            if(arr[minIndex] > arr[i]){
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static void swapElements(int[] arr , int minIndex , int currentIndex) {
        int temp = arr[minIndex];
        arr[minIndex] = arr[currentIndex];
        arr[currentIndex] = temp;
    }
    public static void largestElementBruteForce(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = minIndex(arr , i);
            if(minIndex != i){
                swapElements(arr , minIndex , i);
            }
        }
    }

    // Better Approach
    public static String largestElementBetter(int[] arr) {
        String str = "We dont have a better Solution in this Question !!!";
        return str;
    }

    // Optimal Approach ---> TC : O(n)
    public static int largestElementOptimal(int[] arr) {
        int n = arr.length;
        int largestElement = arr[0];
        for (int i = 0; i < n; i++) {
            if(largestElement < arr[i]){
                largestElement = arr[i];
            }
        }
        return largestElement;
    }

}
