public class RemoveDuplicateFromSortedArray_4 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3,4,4,5};
        System.out.println("Though my Optimal and his Optimal has the same TC , but may be it depends on the Question.");
        System.out.println("In Striver Video , he solved brute force using Set DS.");
        int bruteForceAnswer = bruteForceRemoveDuplicateFromSorted(arr);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        int betterAnswer = betterRemoveDuplicateFromSorted(arr);
        System.out.println("Better Answer : " + betterAnswer);
        System.out.println("In Striver Video , he solved optimal using Two Pointer Approach.");
        int optimalAnswer = optimalRemoveDuplicateFromSorted(arr);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    // Brute Force Approach -----> TC : O(n)
    public static int bruteForceRemoveDuplicateFromSorted(int[] arr) {
        // Return Length of Distinct Array
        int n = arr.length;
        int length = 1;
        if(n < 2){
            return length;
        }
        for (int i = 1; i < n; i++) {
            if(arr[i] != arr[i - 1]){
                length++;
            }
        }
        return length;
    }

    // Better Approach -----> TC : O(n)
    public static int betterRemoveDuplicateFromSorted(int[] arr) {
        // Return Length of Distinct Array
        int n = arr.length;
        int length = 1;
        if(n < 2){
            return length;
        }
        for (int i = 1; i < n; i++) {
            if(arr[i] != arr[i - 1]){
                length++;
            }
        }
        return length;
    }

    // Optimal Approach ---> TC : O(n)
    public static int optimalRemoveDuplicateFromSorted(int[] arr) {
        // Return Length of Distinct Array
        int n = arr.length;
        int length = 1;
        if(n < 2){
            return length;
        }
        for (int i = 1; i < n; i++) {
            if(arr[i] != arr[i - 1]){
                length++;
            }
        }
        return length;
    }

}
