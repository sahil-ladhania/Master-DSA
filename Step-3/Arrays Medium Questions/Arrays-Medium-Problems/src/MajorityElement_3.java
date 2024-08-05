import java.util.HashMap;

public class MajorityElement_3 {
    public static void main(String[] args) {
//        int[] arr = {2,2,1,1,1,2,2};
        int[] arr = {4,4,2,4,3,4,4,3,2,4};
        int bruteForceAnswer = bruteForceMajorityElement(arr);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        int betterAnswer = betterMajorityElement(arr);
        System.out.println("Better Answer : " + betterAnswer);
        int optimalAnswer = optimalMajorityElement(arr);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    // Brute Force Approach
    public static int bruteForceMajorityElement(int[] arr) {
        int n = arr.length;
        int target = n / 2;
        int majorityElement = 0;
        for (int i = 0; i < n; i++) {
            int elementCount = 0;
            for (int j = 0; j < n; j++) {
                if(arr[i] == arr[j]){
                    elementCount++;
                    if(elementCount > target){
                        majorityElement = arr[j];
                    }
                }
            }
        }
        return majorityElement;
    }
    /*
    TC : O(n^2) ---> Nested loops result in O(n^2) operations.
    SC : O(1) ---> Only a few variables used, independent of input size.
    */

    // Better Approach
    public static int betterMajorityElement(int[] arr) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int n = arr.length;
        int target = n / 2;
        for (int i = 0; i < n; i++) {
            int element = arr[i];
            map.put(element , map.getOrDefault(element , 0) + 1);
            if(map.get(element) > target){
                return element;
            }
        }
        return -1;
    }
    /*
    TC : O(n) ---> One pass through the array and constant time operations for HashMap.
    SC : O(n) ---> In the worst case, all elements are unique and stored in the HashMap.
    */

    // Optimal Approach
    public static int optimalMajorityElement(int[] arr) {
        int element = 0;
        int count = 0;
        int n = arr.length;
        int target = n / 2;
        for (int i = 0; i < n; i++) {
            if(count == 0){
                count = 1;
                element = arr[i];
            }
            else if (arr[i] == element) {
                count++;
            }
            else{
                count--;
            }
        }
        int count2 = 0;
        for (int j = 0; j < n; j++) {
            if(arr[j] == element){
                count2++;
            }
        }
        if(count2 > target){
            return element;
        }
        return -1;
    }
    /*
    TC : O(2n) ---> Two passes through the array, each O(n).
    SC : O(1) ---> Only a few variables used, independent of input size.
    */
}
