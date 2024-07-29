public class LinearSearch_8 {
    public static void main(String[] args) {
        System.out.println("Brute Force is the most Optimal Solution for this Problem.");
        int[] arr = {1,2,3,4,5};
        int target = 21;
        String bruteForceAnswer = bruteForceLinearSearch(arr , target);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        String betterAnswer = betterLinearSearch(arr , target);
        System.out.println("Better Answer : " + betterAnswer);
        boolean optimalAnswer = optimalForceLinearSearch(arr , target);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    // Brute Force Approach -----> TC : O(n)
    public static String bruteForceLinearSearch(int[] arr , int target) {
        String str2 = "There is no Brute Force Solution for this Problem.";
        System.out.println(str2);
        return str2;
    }

    // Better Approach ---> TC : O(n)
    public static String betterLinearSearch(int[] arr , int target) {
        String str1 = "There is no better Solution for this Problem.";
        System.out.println(str1);
        return str1;
    }

    // Optimal Approach ---> TC : O(n)
    public static boolean optimalForceLinearSearch(int[] arr , int target) {
        return true;
    }
}
