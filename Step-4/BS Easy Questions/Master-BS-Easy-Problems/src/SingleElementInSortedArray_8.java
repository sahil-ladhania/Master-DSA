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
        int n = arr.length;
        int count = 1;
        for (int i = 1; i < n; i++) {
            int element = arr[i];
            int prevElement = arr[i - 1];
            if (element == prevElement) {
                count++;
            }
            else {
                if (count == 1) {
                    return prevElement;
                }
                count = 1;
            }
        }
        if (count == 1) {
            return arr[n - 1];
        }
        return -1;
    }
    /*
    TC : O(n)
    SC : O(1)
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
