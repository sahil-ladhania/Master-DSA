public class ImplementUpperBound_3 {
    public static void main(String[] args) {
        int[] arr = {3,5,8,15,19};
        int bruteForceAnswer = bruteForceUpperBound(arr , 8);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        String betterAnswer = betterUpperBound(arr , 8);
        System.out.println("Better Answer : " + betterAnswer);
        int optimalAnswer = optimalUpperBound(arr , 8);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    // Brute Force Approach
    public static int bruteForceUpperBound(int[] arr , int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i] > x){
                return i;
            }
        }
        return n;
    }
    /*
    TC : O(n) ---> Because it iterates through each element in the array.
    SC : O(1) ---> Uses a constant amount of extra space.
    */

    // Better Approach
    public static String betterUpperBound(int[] arr , int x) {
        String str = "There is no better solution to this Problem.";
        return str;
    }

    // Optimal Approach
    public static int optimalUpperBound(int[] arr , int x) {
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans = n;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > x){
                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }
    /*
    TC : O(log n) ---> Because it performs binary search to find the upper bound.
    SC : O(1) ---> Uses a constant amount of extra space.
    */

}
