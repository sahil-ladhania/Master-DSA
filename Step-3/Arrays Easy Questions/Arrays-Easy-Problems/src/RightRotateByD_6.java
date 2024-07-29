import java.util.Arrays;

public class RightRotateByD_6 {
    public static void main(String[] args) {
        System.out.println("The Brute Force Approach Striver taught is Complex and that basically took less TC than Optimal but SC is better in Optimal.");
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        int[] arr3 = {1,2,3,4,5};
        bruteForceRightRotateByD(arr1 , 2);
        System.out.println("Brute Force Answer : " + Arrays.toString(arr1));
        betterRightRotateByD(arr2 , 2);
        System.out.println("Better Answer : " + Arrays.toString(arr2));
        optimalRightRotateByD(arr3 , 2);
        System.out.println("Optimal Answer : " + Arrays.toString(arr3));
    }

    public static void reverse(int[] arr, int start, int end) {

    }

    // Brute Force Approach -----> TC :
    public static void bruteForceRightRotateByD(int[] arr, int K) {

    }

    // Better Approach -----> TC :
    public static void betterRightRotateByD(int[] arr, int K) {

    }

    // Optimal Approach ---> TC :
    public static void optimalRightRotateByD(int[] arr, int K) {

    }

}
