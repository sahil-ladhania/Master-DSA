import java.util.Arrays;

public class CielTheFloor_1 {
    public static void main(String[] args) {
        int[] arr = {3,4,4,7,8,10};
        String bruteForceAnswer = bruteForceCielTheFloor(arr , 5);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        String betterAnswer = betterCielTheFloor(arr , 5);
        System.out.println("Better Answer : " + betterAnswer);
        int[] optimalAnswer = optimalCielTheFloor(arr , 5);
        System.out.println("Optimal Answer : " + Arrays.toString(optimalAnswer));
    }

    // Brute Force Approach
    public static String bruteForceCielTheFloor(int[] arr , int x) {
        String str = "There is no brute force solution to this Problem.";
        return str;
    }

    // Brute Force Approach
    public static String betterCielTheFloor(int[] arr , int x) {
        String str = "There is no better solution to this Problem.";
        return str;
    }

    // Optimal Approach
    public static int[] optimalCielTheFloor(int[] arr , int x) {
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int floor = -1;
        int ciel = -1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == x){
                floor = x;
                ciel = x;
                break;
            }
            else if (arr[mid] < x) {
                floor = arr[mid];
                start = mid + 1;
            }
            else{
                ciel = arr[mid];
                end = mid - 1;
            }
        }
        return new int[]{floor , ciel};
    }
    /*
    TC : O(log n) ---> Binary search is used to narrow down the search space, halving it each time.
    SC : O(1) ---> Only a constant amount of extra space is used for variables (floor, ciel, start, end, mid).
    */

}
