import java.util.Arrays;

public class ArraysRecursionProblems {
    public static void main(String[] args) {
        System.out.println("Basic Arrays Questions on Recursion :- ");
        int[] arr1 = {1,2,3,4,5};
        int answer1 = sumOfArray(arr1 , 0);
        System.out.println("Answer 1 : " + answer1);
        int[] arr2 = {1,2,3,4,5};
        int answer2 = productOfArray(arr2 , 0);
        System.out.println("Answer 2 : " + answer2);
        int[] arr3 = {1,2,3,4,5,1,6,1};
        int x  = 1;
        int answer3 = countOccurrences(arr3 , 0 , x);
        System.out.println("Answer 3 : " + answer3);
        int[] arr4 = {1,2,3,4,5};
        int answer4 = maxElement(arr4);
        System.out.println("Answer 4 : " + Arrays.toString(arr4));
        int[] arr5 = {1,2,3,4,5};
        int answer5 = reverseArray(arr5);
        System.out.println("Answer 5 : " + Arrays.toString(arr5));
        int[] arr6 = {1,2,6,4,5};
        boolean answer6 = isArraySorted(arr6 , 0);
        System.out.println("Answer 6 : " + answer6);
        int[] arr7 = {1,2,6,4,5,6,7,8,9,10};
        boolean answer7 = isTargetPresent(arr6 , 0 ,  5);
        System.out.println("Answer 7 : " + answer7);
    }

    // Array Sum: Write a recursive function to find the sum of all elements in an array.
    public static int sumOfArray(int[] arr , int index) {
        int n = arr.length;
        // Base Case
        if(index == n-1){
            return arr[n-1];
        }
        else{
            // Recursive Relation
            return arr[index] + sumOfArray(arr , index + 1);
        }
    }

    // Array Product: Write a recursive function to find the product of all elements in an array.
    public static int productOfArray(int[] arr , int index) {
        int n = arr.length;
        // Base Case
        if(index == n-1){
            return arr[n-1];
        }
        else{
            // Recursive Relation
            return arr[index] * productOfArray(arr , index + 1);
        }
    }

    // Count Occurrences in Array: Write a recursive function to count the number of times a given element appears in an array. ---> IMP Question
    public static int countOccurrences(int[] arr, int index, int x) {
        int n = arr.length;
        // Base Case: Reached end of array or found an invalid index
        if (index == n || index < 0) {
            return 0;
        }
        // Flag to indicate if current element matches the target
        boolean isMatch = arr[index] == x;
        // Count to keep track of occurrences (initially 0)
        int count = 0;
        // Handle the match case
        if (isMatch) {
            count++; // Add 1 for the current element's occurrence
        }
        // Recursive call for the next element (add count from next calls)
        return count + countOccurrences(arr, index + 1, x);
    }

    // Maximum Element in Array: Write a recursive function to find the maximum element in an array.
    public static int maxElement(int[] arr) {
        // Base Case
        if(true){
            return 1;
        }
        else{
            // Recursive Relation
            // Processing
        }
        return 1;
    }

    // Reverse Array: Write a recursive function to reverse an array.
    public static int reverseArray(int[] arr) {
        // Base Case
        if(true){
            return 1;
        }
        else{
            // Recursive Relation
            // Processing
        }
        return 1;
    }

    // Is Array Sorted : Write a recursive function to check if the Array is Sorted.
    public static boolean isArraySorted(int[] arr , int index) {
        // Base Case
        if(index == arr.length - 1){
            return true;
        }
        else{
            // Recursive Relation
            return arr[index] < arr[index + 1] && isArraySorted(arr , index + 1);
        }
    }

    // Is Target Present : Write a recursive function to check if the Target is Present in the Array.
    public static boolean isTargetPresent(int[] arr , int index , int target) {
        // Base Case
        if(index == arr.length){
            return false;
        }
        else{
            // Recursive Relation
            return arr[index] == target || isTargetPresent(arr , index + 1, target);
        }
    }

}
