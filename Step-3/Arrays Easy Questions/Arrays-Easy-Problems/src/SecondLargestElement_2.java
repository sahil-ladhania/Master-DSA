import java.util.Arrays;

public class SecondLargestElement_2 {
    public static void main(String[] args) {
        int[] arr = {1,4,2,7,50};
        int bruteForceAnswer = secondLargestElementBruteForce(arr);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        int betterAnswer = secondLargestElementBetter(arr);
        System.out.println("Better Answer : " + betterAnswer);
        int optimalAnswer = secondLargestElementOptimal(arr);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    // Brute Force Approach ---> This approach works only where there are no Duplicates.
    public static int secondLargestElementBruteForce(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        return arr[n-2];
    }
    /*
    TC : O(n log n) ---> For the Arrays.sort(arr) method, the worst-case time complexity is  O(n^2)  when using
                         quicksort. However, the dual-pivot quicksort used in Java’s Arrays.sort() typically has
                         a worst-case of  O(n log n)  due to optimizations, even for pathological cases. Thus,
                         the more accurate worst-case time complexity is  O(n log n) .
    SC : O(n) ---> The space complexity of the Arrays.sort(arr) method is  O(n)  due to the additional space required
                   for sorting in the worst case.
    */

    // Better Approach
    public static int secondLargestElementBetter(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            largest = Math.max(largest , arr[i]);
        }
        for (int j = 0; j < n; j++) {
            if(secondLargest < arr[j] && arr[j] != largest){
                secondLargest = arr[j];
            }
        }
        return secondLargest;
    }
    /*
    TC : O(2n) ---> Since these two loops run sequentially, the combined time complexity is  O(n) + O(n) = O(2n) ,
                    which simplifies to  O(n) .
    SC : O(1) ---> The space complexity is  O(1)  because only a few extra variables (largest, secondLargest, and n)
                   are used. No additional space that grows with the input size is required.
    */

    // Optimal Approach
    public static int secondLargestElementOptimal(int[] arr) {
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            if(largest < arr[i]){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(secondLargest < arr[i] && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    /*
    TC : O(n) ---> The for loop iterates through the array once, comparing each element to find the largest and the
                   second-largest elements. This results in a linear time complexity of  O(n) .
    SC : O(1) ---> The space complexity here should be  O(1)  because only a few extra variables (largest, secondLargest,
                   and n) are used. No additional space that grows with the input size is required.
     */
}