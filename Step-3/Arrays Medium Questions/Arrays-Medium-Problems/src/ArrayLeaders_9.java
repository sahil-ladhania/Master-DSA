import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeaders_9 {
    public static void main(String[] args) {
        int[] arr = {4,7,1,0};
        ArrayList<Integer> bruteForceAnswer = bruteForceArrayLeaders(arr);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        String betterAnswer = betterArrayLeaders(arr);
        System.out.println("Better Answer : " + betterAnswer);
        ArrayList<Integer> optimalAnswer = optimalArrayLeaders(arr);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    // Brute Force Approach
    public static ArrayList<Integer> bruteForceArrayLeaders(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> leaders = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < n; j++) {
                if(arr[i] <= arr[j]){
                    isLeader = false;
                    break;
                }
            }
            if(isLeader){
                leaders.add(arr[i]);
            }
        }
        return leaders;
    }
    /*
    TC : O(n^2) ---> It uses two nested loops to compare each element with all elements to its right.
    SC : O(n) ---> It uses an additional list to store the leaders, with a maximum size of n.
    */

    // Better Approach
    public static String betterArrayLeaders(int[] arr) {
        String str = "There is no better solution for this Problem.";
        return str;
    }

    // Optimal Approach
    public static ArrayList<Integer> optimalArrayLeaders(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> leaders = new ArrayList<>(n);
        for (int i = n-1; i >= 0; i--) {
            if(arr[i] > max){
                leaders.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }
    /*
    TC : O(n) --->  It iterates through the array once from right to left.
    SC : O(n) ---> It uses an additional list to store the leaders, with a maximum size of n, and an integer variable.
    */
}
