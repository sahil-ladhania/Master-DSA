public class BinarySearch_1 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 7, 9, 12, 16, 17};
        boolean iterativeBSAnswer = iterativeBinarySearch(arr , 6);
        System.out.println("Iterative BS Answer : " + iterativeBSAnswer);
        boolean recursiveBSAnswer = recursiveBinarySearch(arr , 0 , 7 , 6);
        System.out.println("Recursive BS Answer : " + recursiveBSAnswer);
    }

    // Iterative Approach
    public static boolean iterativeBinarySearch(int[] arr , int target) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while (low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == target){
                return true;
            }
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return false;
    }
    /*
    TC : O(log n) ---> Each iteration reduces the search space by half, leading to a logarithmic number of iterations in the worst case.
    SC : O(1) ---> Because you are only using a few extra variables (low, high, mid) and no additional memory that scales with the input size.
    */

    // Recursive Approach
    public static boolean recursiveBinarySearch(int[] arr , int low , int high , int target) {
        if(low > high){
            return false;
        }
        else{
            int mid = (low + high) / 2;
            if(arr[mid] == target){
                return true;
            }
            else if (arr[mid] < target) {
                return recursiveBinarySearch(arr , mid + 1 , high , target);
            }
            else{
                return recursiveBinarySearch(arr , low , mid - 1 , target);
            }
        }
    }
    /*
    TC : O(log n) ---> Each iteration reduces the search space by half, leading to a logarithmic number of iterations in the worst case.
    SC : O(log n) ---> Because of the additional space required by the call stack. In the worst case, the recursion depth can go up to log n, which contributes to the space complexity.
    */

}
