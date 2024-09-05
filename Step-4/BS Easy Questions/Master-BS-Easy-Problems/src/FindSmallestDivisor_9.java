public class FindSmallestDivisor_9 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int limit = 8;
        int bruteForceAnswer = bruteForceFindSmallestDivisor(arr , limit);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        int betterAnswer = betterFindSmallestDivisor(arr , limit);
        System.out.println("Better Answer : " + betterAnswer);
        int optimalAnswer = optimalFindSmallestDivisor(arr , limit);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    public static int bruteForceFindSmallestDivisor(int[] arr , int limit) {
        return -1;
    }

    public static int betterFindSmallestDivisor(int[] arr , int limit) {
        return -1;
    }

    public static int optimalFindSmallestDivisor(int[] arr , int limit) {
        return -1;
    }

}
