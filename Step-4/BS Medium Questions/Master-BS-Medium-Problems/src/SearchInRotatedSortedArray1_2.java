public class SearchInRotatedSortedArray1_2 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        int bruteForceAnswer = bruteForceSearchInRotatedSortedArray(arr , 0);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        String betterAnswer = betterSearchInRotatedSortedArray(arr , 0);
        System.out.println("Better Answer : " + betterAnswer);
        int optimalAnswer = optimalSearchInRotatedSortedArray(arr , 0);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    public static int bruteForceSearchInRotatedSortedArray(int[] arr , int target) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == target){
                ans = i;
                return ans;
            }
        }
        return -1;
    }
    /*
    TC : O(n) ---> Every element in the array is checked one by one.
    SC : O(1) ---> No extra space is used, only a few variables.
    */

    public static String betterSearchInRotatedSortedArray(int[] arr , int target) {
        String str = "There is no better approach to this Problem.";
        return str;
    }

    public static int optimalSearchInRotatedSortedArray(int[] arr , int target) {
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans = -1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                ans = mid;
                return ans;
            }
            else if (arr[mid] >= arr[start]) {
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else{
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return ans;
    }
    /*
    TC : O(log n) ---> Binary search is used to narrow down the search space, halving it each time.
    SC : O(1) ---> Only a constant amount of extra space is used for variables (floor, ciel, start, end, mid).
    */

}
