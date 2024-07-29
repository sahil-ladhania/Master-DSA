public class CheckIfArraySorted_3 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,5};
        System.out.println("There's no better method to solve this Question with better TC !!!");
        boolean bruteForceAnswer = bruteForceCheckSorted(arr);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        boolean betterAnswer = betterCheckSorted(arr);
        System.out.println("Better Answer : " + betterAnswer);
        boolean optimalAnswer = optimalCheckSorted(arr);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    // Brute Force Approach -----> TC :
    public static boolean bruteForceCheckSorted(int[] arr) {
        return true;
    }

    // Better Approach -----> TC :
    public static boolean betterCheckSorted(int[] arr) {
        return true;
    }

    // Optimal Approach ---> TC :
    public static boolean optimalCheckSorted(int[] arr){
        return true;
    }

}
