public class SearchInRotatedSortedArray2_3 {
    public static void main(String[] args) {
        int[] arr = {7,8,1,2,3,3,3,4,5,6};
        boolean bruteForceAnswer = bruteForceSearchInRotatedSortedArray2(arr , 3);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        String betterAnswer = betterSearchInRotatedSortedArray2(arr , 3);
        System.out.println("Better Answer : " + betterAnswer);
        boolean optimalAnswer = optimalSearchInRotatedSortedArray2(arr , 3);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    public static boolean bruteForceSearchInRotatedSortedArray2(int[] arr , int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
    /*
    TC : O(n) ---> Every element in the array is checked one by one.
    SC : O(1) ---> No extra space is used, only a few variables.
    */

    public static String betterSearchInRotatedSortedArray2(int[] arr , int target) {
        String str = "There is no better approach to this Problem.";
        return str;
    }

    public static boolean optimalSearchInRotatedSortedArray2(int[] arr , int target) {
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return true;
            }
            else if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                start = start + 1;
                end = end - 1;
                continue;
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
        return false;
    }
    /*
    TC : O(log n) ---> Binary search is used to narrow down the search space, halving it each time.
    SC : O(1) ---> Only a constant amount of extra space is used for variables (floor, ciel, start, end, mid).
    */

}
