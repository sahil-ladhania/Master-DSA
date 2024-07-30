import java.util.Arrays;

public class MoveZeroesToEnd_7 {
    public static void main(String[] args) {
        System.out.println("To solve this problem optimally we need to use 2 Pointer Technique.");
        int[] arr1 = {0,1,0,3,12};
        int[] arr2 = {0,1,0,3,12};
        int[] arr3 = {0,1,0,3,12};
        bruteForceMoveZeroes(arr1);
        System.out.println("Brute Force Answer : " + Arrays.toString(arr1));
        String betterAnswer = betterMoveZeroes(arr2);
        System.out.println("Better Answer : " + betterAnswer);
        optimalMoveZeroes(arr3);
        System.out.println("Optimal Answer : " + Arrays.toString(arr3));
    }

    // Brute Force Approach
    public static void bruteForceMoveZeroes(int[] arr) {
        int n = arr.length;
        int index = 0;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            if(arr[i] != 0){
                temp[index++] = arr[i];
            }
        }
        while (index < n){
            temp[index++] = 0;
        }
        for (int j = 0; j < n; j++) {
            arr[j] = temp[j];
        }
    }
    /*
    TC : O(3n) ---> Combining all steps, the total time complexity is O(3n).
    SC : O(n) ---> The algorithm uses a temporary array of the same size as the input array to store the intermediate
                   result. Thus, the space complexity is O(n).
    */

    // Better Approach
    public static String betterMoveZeroes(int[] arr) {
        String str = "There is no better solution to this problem.";
        return str;
    }

    // Optimal Approach
    public static void optimalMoveZeroes(int[] arr) {
        int n = arr.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
    /*
    TC : O(n) ---> Because each element is processed once.
    SC : O(1) ---> Because the algorithm uses a constant amount of extra space.
    */

}
