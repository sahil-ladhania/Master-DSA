import java.util.Arrays;
import java.util.HashMap;

public class TwoSumProblem_1 {
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        boolean bruteForceAnswer = bruteForceTwoSum(arr , 14);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        boolean betterAnswer = betterTwoSum(arr , 14);
        System.out.println("Better Answer : " + betterAnswer);
        boolean optimalAnswer = optimalTwoSum(arr , 14);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    // Brute Force Approach
    public static boolean bruteForceTwoSum(int[] arr , int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int element = arr[i];
                int complement = target - element;
                if(complement == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    /*
    TC : O(n^2) ---> There are two nested loops, each running n times.
    SC : O(1) ---> No extra space is used other than a few variables.
    */

    // Better Approach
    public static boolean betterTwoSum(int[] arr , int target) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int element = arr[i];
            int complement = target - element;
            if(map.containsKey(complement)){
                return true;
            }
            else{
                map.put(arr[i] , i);
            }
        }
        return false;
    }
    /*
    TC : O(n) ---> We traverse the array once, and the map operations (put and containsKey) are O(1) on average.
    SC : O(n) ---> In the worst case, the map will store all n elements.
    */

    // Optimal Approach
    public static boolean optimalTwoSum(int[] arr , int target) {
        int n = arr.length;
        Arrays.sort(arr);
        int start = 0;
        int end = n - 1;
        while (start < end){
            int sum = arr[start] + arr[end];
            if(sum == target){
                return true;
            }
            else if (sum < target) {
                start++;
            }
            else{
                end--;
            }
        }
        return false;
    }
    /*
    TC : O(n log n) ---> Sorting the array takes O(n log n), and the two-pointer traversal takes O(n).
    SC : O(1) ---> Only a few extra variables are used; no additional space dependent on input size is required.
    */
}
