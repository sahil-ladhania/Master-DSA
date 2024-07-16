import java.util.Arrays;

public class SecondLargestElement_2 {
    public static void main(String[] args) {
        int[] arr = {1,4,2,7,5,7};
        int bruteForceAnswer = secondLargestElementBruteForce(arr);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        int betterAnswer = secondLargestElementBetter(arr);
        System.out.println("Better Answer : " + betterAnswer);
        int optimalAnswer = secondLargestElementOptimal(arr);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    // Brute Force Approach ----> TC : O(n log n)
    public static int secondLargestElementBruteForce(int[] arr) {
        int n = arr.length;
        if(n < 2){
            return -1;
        }
        Arrays.sort(arr);
        int largest = arr[n-1];
        for (int i = n-2; i >= 0 ; i--) {
            if(arr[i] != largest){
               return arr[i];
            }
        }
        return -1;
    }

    // Better Approach ---> TC : O(2n)
    public static int secondLargestElementBetter(int[] arr) {
        int n = arr.length;
        if(n < 2){
            return -1;
        }
        int largest = arr[0];
        int secondLargest = -1;
        for (int i = 0; i < n; i++) {
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if((arr[i] > secondLargest) && (arr[i] < largest)){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    // Optimal Approach ---> TC : O(n)
    public static int secondLargestElementOptimal(int[] arr) {
        int n = arr.length;
        if(n < 2){
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(largest < arr[i]){
                secondLargest = largest;
                largest = arr[i];
            }
            else if((arr[i] > secondLargest) && (arr[i] != largest)){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
