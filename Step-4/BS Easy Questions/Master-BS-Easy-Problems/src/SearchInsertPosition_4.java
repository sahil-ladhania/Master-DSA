public class SearchInsertPosition_4 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7};
        int bruteForceAnswer = bruteForceSearchInsertPosition(arr , 6);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        String betterAnswer = betterSearchInsertPosition(arr , 6);
        System.out.println("Better Answer : " + betterAnswer);
        int optimalAnswer = optimalSearchInsertPosition(arr , 6);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    // Brute Force Approach
    public static int bruteForceSearchInsertPosition(int[] arr , int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i] >= x){
                return i;
            }
        }
        return -1;
    }
    /*
    TC : O(n) ---> Because in the worst case, it checks each element of the array.
    SC : O(1) ---> It uses a constant amount of extra space.
    */

    // Better Approach
    public static String betterSearchInsertPosition(int[] arr , int x) {
        String str = "There is no better solution to this Problem.";
        return str;
    }

    // Optimal Approach
    public static int optimalSearchInsertPosition(int[] arr , int x) {
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans = n;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] >= x){
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
    TC : O(log n) ---> Because it reduces the problem size by half with each iteration.
    SC : O(1) ---> It uses a constant amount of extra space.
    */

}
