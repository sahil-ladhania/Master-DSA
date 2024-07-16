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

    // Brute Force Approach -----> TC : O(n)
    public static boolean bruteForceCheckSorted(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if(arr[i] <  arr[i-1]){
                return true;
            }
            else{
                return false;
            }
        }
        return true;
    }

    // Better Approach -----> TC : O(n)
    public static boolean betterCheckSorted(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if(arr[i] <  arr[i-1]){
                return true;
            }
            else{
                return false;
            }
        }
        return true;
    }

    // Optimal Approach ---> TC : O(n)
    public static boolean optimalCheckSorted(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if(arr[i] <  arr[i-1]){
                return true;
            }
            else{
                return false;
            }
        }
        return true;
    }

}
