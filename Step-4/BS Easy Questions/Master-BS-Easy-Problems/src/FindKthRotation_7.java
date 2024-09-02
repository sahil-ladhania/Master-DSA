public class FindKthRotation_7 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        int bruteForceAnswer = bruteForceFindKthRotation(arr);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        String betterAnswer = betterFindKthRotation(arr);
        System.out.println("Better Answer : " + betterAnswer);
        int optimalAnswer = optimalFindKthRotation(arr);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    public static int bruteForceFindKthRotation(int[] arr) {
        return -1;
    }
    /*
    TC : O(n) --->
    SC : O(1) --->
    */

    public static String betterFindKthRotation(int[] arr) {
        String str = "There is no better solution to this Problem.";
        return str;
    }

    public static int optimalFindKthRotation(int[] arr) {
        return -1;
    }
    /*
    TC : O(log n) --->
    SC : O(1) --->
    */

}
