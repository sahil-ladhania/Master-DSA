public class SquareRootOfANumber_5 {
    public static void main(String[] args) {
        int n = 38;
        int bruteForceAnswer = bruteForceSquareRootOfANumber(n);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        int betterAnswer = betterSquareRootOfANumber(n);
        System.out.println("Better Answer : " + betterAnswer);
        int optimalAnswer = optimalSquareRootOfANumber(n);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    public static int bruteForceSquareRootOfANumber(int n) {
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            if(i*i <= n){
                ans = i;
            }
            else {
                break;
            }
        }
        return ans;
    }
    /*
    TC : O(n) ---> The loop runs from 0 to n, checking each number.
    SC : O(1) ---> Only a constant amount of extra space is used for variables like ans and i.
    */

    public static int betterSquareRootOfANumber(int n) {
        int ans = (int) Math.sqrt(n);
        return ans;
    }
    /*
    TC : O(1) ---> Math.sqrt() computes the square root in constant time using efficient internal algorithms.
    SC : O(1) ---> Only a constant amount of extra space is used for the result.
    */

    public static int optimalSquareRootOfANumber(int n) {
        int start = 1;
        int end = n;
        int ans = 0;
        while (start <= end){
            int mid = start + (end - start) / 2;
            long midSquared = (long) mid * mid;
            if(midSquared == n){
                ans = mid;
                return ans;
            }
            else if (midSquared > n) {
                end = mid - 1;
            }
            else{
                ans = mid;
                start = mid + 1;
            }
        }
        return ans;
    }
    /*
    TC : O(log n) ---> Binary search divides the search space in half at each step, reducing the time complexity to logarithmic.
    SC : O(1) ---> Only a constant amount of extra space is used for variables like start, end, mid, and ans.
    */

}
