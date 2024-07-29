public class LinearSearch_8 {
    public static void main(String[] args) {
        System.out.println("Brute Force is the most Optimal Solution for this Problem.");
        int[] arr = {1,2,3,4,5};
        int target = 4;
        String bruteForceAnswer = bruteForceLinearSearch(arr , target);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        String betterAnswer = betterLinearSearch(arr , target);
        System.out.println("Better Answer : " + betterAnswer);
        boolean optimalAnswer = optimalForceLinearSearch(arr , target);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    // Brute Force Approach
    public static String bruteForceLinearSearch(int[] arr , int target) {
        String str2 = "There is no Brute Force Solution for this Problem.";
        System.out.println(str2);
        return str2;
    }

    // Better Approach
    public static String betterLinearSearch(int[] arr , int target) {
        String str1 = "There is no better Solution for this Problem.";
        System.out.println(str1);
        return str1;
    }

    // Optimal Approach
    public static boolean optimalForceLinearSearch(int[] arr , int target) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            if(target == arr[i]){
                return true;
            }
        }
        return false;
    }
    /*
    TC : O(n) ---> The for loop iterates through the array once, comparing each element to the target. This results
                   in a linear time complexity of  O(n) .
    SC : O(1) ---> The space complexity is  O(1)  because only a few extra variables (n and i) are used. No additional
                   space that grows with the input size is required.
    */

}
