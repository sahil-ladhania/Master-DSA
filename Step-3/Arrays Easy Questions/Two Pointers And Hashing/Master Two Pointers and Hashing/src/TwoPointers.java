import java.util.ArrayList;
import java.util.Arrays;

public class TwoPointers {
    public static void main(String[] args) {
        System.out.println("Master Two Pointers !!!");
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int target1 = 10;
        boolean answer1 = findSumPair(arr1 , target1);
        System.out.println("Answer 1 : " + answer1); // True (4,6)
        int[] arr2 = {1, 2, 3, 4, 5};
        reverseArray(arr2);
        System.out.println("Answer 2 : " + Arrays.toString(arr2)); // [5,4,3,2,1]
        int[] arr3 = {0, 1, 0, 3, 12};
        moveZeroes(arr3);
        System.out.println("Answer 3 : " + Arrays.toString(arr3)); // [1, 3, 12, 0, 0]
        int[] arr4 = {1, 5, 3, 4, 2};
        int targetDiff1 = 2;
        boolean answer4 = findPairWithDifference(arr4 , targetDiff1);
        System.out.println("Answer 4 : " + answer4); // True (1,3) / (3,5)
        int[] arr5 = {3, 2, 2, 3, 4, 2, 5};
        int val1 = 2;
        int answer5 = removeElement(arr5 , val1);
        System.out.println("Answer 5 : " + answer5); // 4 ([3,3,4,5])
        int[] arr6 = {-4, -1, 0, 3, 10};
        int[] answer6 = squareAndSort(arr6);
        System.out.println("Answer 6 : " + Arrays.toString(answer6)); // [-4, -1, 0, 3, 10]
        int[] arr7_1 = {1, 3, 5, 7 , 9};
        int[] arr7_2 = {2, 4, 6, 8};
        ArrayList<Integer> answer7 = mergeSortedArrays(arr7_1 , arr7_2);
        System.out.println("Answer 7 : " + answer7); // [1, 2, 3, 4, 5, 6, 7, 8]
        int[] arr8 = {1, 2, 3, 4, 5, 6};
        boolean answer8 = isSorted(arr8);
        System.out.println("Answer 8 : " + answer8); // True
        int[] arr9 = {1, 1, 2, 2, 3, 4, 4, 5};
        int answer9 = removeDuplicates(arr9);
        System.out.println("Answer 9 : " + answer9); // 5 ([1,2,3,4,5])
        int[] arr10 = {1, 2, 3, 4, 5, 6};
        int answer10 = findMiddleElement(arr10);
        System.out.println("Answer 10 : " + answer10); // 4 ([1,2,3,4,5,6,7])
    }

    // Given an array of integers arr, find if there are two numbers that add up to a specific target sum.
    public static boolean findSumPair(int[] arr, int target) {
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while (left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                return true;
            }
            else if (sum < target) {
                left++;
            }
            else{
                right--;
            }
        }
        return false;
    }

    // Given an array of integers arr, reverse the elements in place.
    public static void reverseArray(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Given two sorted arrays arr1 and arr2, merge them into a single sorted array.
    public static ArrayList<Integer> mergeSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0;
        int j = 0;
        ArrayList<Integer> mergeSortedArr = new ArrayList<>(n1 + n2);
        while (i < n1 && j < n2){
            if(arr1[i] < arr2[j]){
                mergeSortedArr.add(arr1[i]);
                i++;
            }
            else{
                mergeSortedArr.add(arr2[j]);
                j++;
            }
        }
        while (i < n1){
            mergeSortedArr.add(arr1[i]);
            i++;
        }
        while (j < n2){
            mergeSortedArr.add(arr2[j]);
            j++;
        }
        return mergeSortedArr;
    }

    // Given an array of integers arr, check if the array is sorted in non-decreasing order.
    public static boolean isSorted(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while (start < end){
            if(arr[start] > arr[start + 1] || arr[end] < arr[end - 1]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Given an array of integers arr, find the middle element of the array.
    public static int findMiddleElement(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while (start < end){
            start++;
            end--;
        }
        if(n % 2 == 0){
            return arr[start - 1];
        }
        return arr[start];
    }

    // Given an array of integers arr, move all zeroes to the end while maintaining the relative order of the non-zero elements.
    public static void moveZeroes(int[] arr) {

    }

    // Given an array of integers arr and a number k, find a pair of elements in the array whose difference is k.
    public static boolean findPairWithDifference(int[] arr, int k) {
        return false;
    }

    // Given an array of integers arr and an integer val, remove all instances of val in-place and return the new length.
    public static int removeElement(int[] arr, int val) {
        return 0;
    }

    // Given a sorted array of integers arr, return a new array containing the squares of each number sorted in non-decreasing order.
    public static int[] squareAndSort(int[] arr) {
        return new int[] {};
    }

    // Given a sorted array of integers arr, remove duplicates in-place such that each element appears only once and return the new length.
    public static int removeDuplicates(int[] arr) {
        return 0;
    }

}