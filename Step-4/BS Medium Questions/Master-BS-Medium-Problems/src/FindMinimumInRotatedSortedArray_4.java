public class FindMinimumInRotatedSortedArray_4 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        int bruteForceAnswer = bruteForceFindMinimumInRotatedSortedArray(arr);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        String betterAnswer = betterFindMinimumInRotatedSortedArray(arr);
        System.out.println("Better Answer : " + betterAnswer);
        int optimalAnswer = optimalFindMinimumInRotatedSortedArray(arr);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    public static int bruteForceFindMinimumInRotatedSortedArray(int[] arr) {
        int n = arr.length;
        int min =  Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(arr[i] , min);
        }
        return min;
    }
    /*
    TC : O(n) ---> Every element in the array is checked one by one.
    SC : O(1) ---> No extra space is used, only a few variables.
    */

    public static String betterFindMinimumInRotatedSortedArray(int[] arr) {
        String str = "There is no better approach to this Problem.";
        return str;
    }

    public static int optimalFindMinimumInRotatedSortedArray(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int min = Integer.MAX_VALUE;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[start] <= arr[mid]) {
                min = Math.min(min, arr[start]);
                start = mid + 1;
            } else {
                min = Math.min(min, arr[mid]);
                end = mid - 1;
            }
        }
        return min;
    }
    /*
    TC : O(log n) ---> Binary search is used to narrow down the search space, halving it each time.
    SC : O(1) ---> Only a constant amount of extra space is used for variables (floor, ciel, start, end, mid).
    */

}
