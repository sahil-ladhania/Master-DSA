import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeArrayElementsBySign_7 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,-4,-5};
        int[] arr2 = {1,2,-4,-5};
        int[] arr3 = {1,2,-4,-5};
        bruteForceRearrangeArrElementsBySign(arr1);
        System.out.println("Brute Force Answer : " + Arrays.toString(arr1));
        String betterAnswer = betterRearrangeArrElementsBySign(arr2);
        System.out.println("Better Answer : " + betterAnswer);
        int[] optimalAnswer = optimalRearrangeArrElementsBySign(arr3);
        System.out.println("Optimal Answer : " + Arrays.toString(optimalAnswer));
    }

    // Type-1
    // Brute Force Approach
    public static void bruteForceRearrangeArrElementsBySign(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> positiveNum = new ArrayList<>(n/2);
        ArrayList<Integer> negativeNum = new ArrayList<>(n/2);
        for (int i = 0; i < n; i++) {
            if(arr[i] > 0){
                positiveNum.add(arr[i]);
            }
            else{
                negativeNum.add(arr[i]);
            }
        }
        for (int j = 0; j < n/2; j++) {
            arr[2 * j] = positiveNum.get(j);
            arr[2 * j + 1] = negativeNum.get(j);
        }
    }
    /*
    TC : O(2n) --->  Iterates over the array twice: once to separate positive and negative numbers, and once to rearrange them.
    SC : O(n) ---> Uses additional space for two ArrayLists to store positive and negative numbers.
    */

    // Better Approach
    public static String betterRearrangeArrElementsBySign(int[] arr) {
        String str = "There is no better solution for this Problem.";
        return str;
    }

    // Optimal Approach
    public static int[] optimalRearrangeArrElementsBySign(int[] arr) {
        int n = arr.length;
        int[] ansArr = new int[n];
        int posIndex = 0;
        int negIndex = 1;
        for (int i = 0; i < n; i++) {
            if(arr[i] > 0){
                ansArr[posIndex] = arr[i];
                posIndex = posIndex + 2;
            }
            else{
                ansArr[negIndex] = arr[i];
                negIndex = negIndex + 2;
            }
        }
        return ansArr;
    }
    /*
    TC : O(n) ---> Iterates over the array once to rearrange elements.
    SC : O(n) ---> Uses additional array ansArr to store the rearranged elements.
    */

    // Type-2
}
