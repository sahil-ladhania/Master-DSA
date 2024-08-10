import java.util.Arrays;
import java.util.HashSet;

public class LargestConsecutiveSequence_10 {
    public static void main(String[] args) {
        int[] arr1 = {100, 200, 1, 3, 2, 4};
        int[] arr2 = {100, 200, 1, 3, 2, 4};
        int[] arr3 = {100, 200, 1, 3, 2, 4};
        int bruteForceAnswer = bruteForceLongestConsecutiveSequence(arr1);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        int betterAnswer = betterLongestConsecutiveSequence(arr2);
        System.out.println("Better Answer : " + betterAnswer);
        int optimalAnswer = optimalLongestConsecutiveSequence(arr3);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    // Brute Force Approach
    public static boolean linearSearch(int[] arr , int num){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }
    public static int bruteForceLongestConsecutiveSequence(int[] arr) {
        int n = arr.length;
        int longest = 1;
        for (int i = 0; i < n; i++) {
            int x = arr[i];
            int count = 1;
            while (linearSearch(arr , x + 1)){
                x += 1;
                count += 1;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
    /*
    TC : O(n^2) ---> Each element requires a linear search through the array for consecutive elements.
    SC : O(1) ---> Only a few extra variables are used, so space complexity is constant.
    */

    // Better Approach
    public static int betterLongestConsecutiveSequence(int[] arr) {
        int n = arr.length;
        if (n == 0){
            return 0;
        }
        Arrays.sort(arr);
        int count = 0;
        int maxCount = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                count++;
            }
            else if (arr[i] != arr[i - 1]) {
                count = 0;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount + 1;
    }
    /*
    TC : O(n log n) ---> Sorting the array dominates the time complexity.
    SC : O() ---> Sorting is done in-place, and no additional data structures are used.
    */

    // Optimal Approach
    public static int optimalLongestConsecutiveSequence(int[] arr) {
        int n = arr.length;
        int longest = 1;
        if (n == 0) {
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            int currentElement = arr[i];
            if (!set.contains(currentElement - 1)) {
                int count = 1;
                int nextElement = currentElement;
                while (set.contains(nextElement + 1)) {
                    nextElement = nextElement + 1;
                    count = count + 1;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
    /*
    TC : O(2n) ---> Each element is processed once to add to the set and once to find sequences.
    SC : O(n) ---> A HashSet is used to store all elements, requiring linear space.
    */
}
