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
        int singleElement = -1;
        for (int i = 0; i < n; i++) {
            if(i == 0){
                if(arr[i] != arr[i+1]){
                    singleElement = arr[i];
                    return singleElement;
                }
            }
            else if (i == n-1) {
                if(arr[n-1] != arr[n-2]){
                    singleElement = arr[i];
                    return singleElement;
                }
            }
            else{
                if((arr[i] != arr[i+1]) && (arr[i] != arr[i-1])){
                    singleElement = arr[i];
                    return singleElement;
                }
            }
        }
        return singleElement;
    }
    /*
    TC : O(n) ---> It iterates through the entire array to find the single element.
    SC : O(1) ---> It uses a constant amount of extra space.
    */

    // Better Approach
    public static String betterSingleElementInSortedArray(int[] arr) {
        String str = "There is no better solution to this Problem.";
        return str;
    }

    // Optimal Approach
    public static int optimalSingleElementInSortedArray(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ((mid == 0 || arr[mid] != arr[mid - 1]) && (mid == n - 1 || arr[mid] != arr[mid + 1])) {
                return arr[mid];
            }
            if ((mid % 2 == 0 && arr[mid] == arr[mid + 1]) || (mid % 2 != 0 && arr[mid] == arr[mid - 1])) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
    /*
    TC : O(log n) --->  It uses binary search, reducing the search space by half in each step.
    SC : O(1) --->  It uses a constant amount of extra space.
    */

}
