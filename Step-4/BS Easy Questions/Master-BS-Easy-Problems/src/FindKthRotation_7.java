public class FindKthRotation_7 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        int bruteForceAnswer = bruteForceFindKthRotation(arr);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        String betterAnswer = betterFindKthRotation(arr);
        System.out.println("Better Answer : " + betterAnswer);
        int optimalAnswer = optimalFindKthRotation(arr);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    public static int bruteForceFindKthRotation(int[] arr) {
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if(arr[i] < min){
                min = arr[i];
                ans = i;
            }
        }
        return ans;
    }
    /*
    TC : O(n) ---> Because it iterates through the entire array to find the minimum element.
    SC : O(1) ---> Because it uses only a few extra variables, regardless of input size.
    */

    public static String betterFindKthRotation(int[] arr) {
        String str = "There is no better solution to this Problem.";
        return str;
    }

    public static int optimalFindKthRotation(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans = -1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[start] <= arr[end]) {
                ans = start;
                break;
            }
            else if (arr[start] <= arr[mid]) {
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return ans;
    }
    /*
    TC : O(log n) ---> Because it uses binary search to find the minimum element efficiently.
    SC : O(1) ---> Because it only uses a fixed amount of extra space.
    */

}
