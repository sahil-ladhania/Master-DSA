import java.util.Arrays;

public class MoveZeroesToEnd_7 {
    public static void main(String[] args) {
        System.out.println("To solve this problem optimally we need to use 2 Pointer Technique.");
        int[] arr = {1,0,2,3,2,0,0,4,5,1};
        bruteForceMoveZeroes(arr);
        System.out.println("Brute Force Answer : " + Arrays.toString(arr));
        betterMoveZeroes(arr);
        System.out.println("Better Answer : " + Arrays.toString(arr));
        optimalMoveZeroes(arr);
        System.out.println("Optimal Answer : " + Arrays.toString(arr));
    }

    // Brute Force Approach -----> TC : O(3n)
    public static void bruteForceMoveZeroes(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;
        // Copy in temp array
        for (int i = 0; i < n; i++) {
            if(arr[i] != 0){
                temp[j] = arr[i];
                j++;
            }
        }
        while (j < n){
            temp[j] = 0;
            j++;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    // Better Approach -----> TC : O(n)
    public static void betterMoveZeroes(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;
        // Copy in temp array
        for (int i = 0; i < n; i++) {
            if(arr[i] != 0){
                temp[j] = arr[i];
                j++;
            }
        }
        while (j < n){
            temp[j] = 0;
            j++;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    // Optimal Approach ---> TC : O(n)
    public static void optimalMoveZeroes(int[] arr) {
        // Use 2 Pointer to Solve it
    }

}
