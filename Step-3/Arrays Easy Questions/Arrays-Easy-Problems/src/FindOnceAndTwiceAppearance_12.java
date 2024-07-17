import java.util.Arrays;

public class FindOnceAndTwiceAppearance_12 {
    public static void main(String[] args) {
        System.out.println("The Optimal Solution is solved using XOR , try to go in depth of XOR.");
        int[] arr = {4,1,3,2,6,2,3,4,1};
        int bruteForceAnswer = bruteForceFindOnceAppereance(arr);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        String  betterAnswer = betterFindOnceAppereance(arr);
        System.out.println("Better Answer : " + betterAnswer);
        int optimalAnswer = optimalFindOnceAppereance(arr);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    // Brute Force Approach -----> TC : O(n^2)
    public static int bruteForceFindOnceAppereance(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int count = 0;
            for (int j = 0; j < n; j++) {
                if(arr[j] == num){
                    count++;
                }
            }
            if(count == 1){
                return num;
            }
        }
        return -1;
    }

    // Better Approach ---> TC :
    public static String  betterFindOnceAppereance(int[] arr) {
        String str = "The better solution of this problem is solved using Hashing.";
        return str;
    }

    // Optimal Approach ---> TC : O(N)
    public static int optimalFindOnceAppereance(int[] arr) {
        int n = arr.length;
        int XOR = 0;
        for (int i = 0; i < n; i++) {
            XOR = XOR ^ arr[i];
        }
        return XOR;
    }

}
