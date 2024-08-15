public class SingleElementInSortedArray_8 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,5,5,6,6};
        int bruteForceAnswer = bruteForceSingleElementInSortedArray(arr);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        String betterAnswer = betterSingleElementInSortedArray(arr);
        System.out.println("Better Answer : " + betterAnswer);
        int optimalAnswer = optimalSingleElementInSortedArray(arr);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    // Brute Force Approach
    public static int bruteForceSingleElementInSortedArray(int[] arr) {
        return -1;
    }
    /*
    TC :
    SC :
    */

    // Better Approach
    public static String betterSingleElementInSortedArray(int[] arr) {
        String str = "There is no better solution to this Problem.";
        return str;
    }

    // Optimal Approach
    public static int optimalSingleElementInSortedArray(int[] arr) {
        return -1;
    }
    /*
    TC :
    SC :
    */

}
