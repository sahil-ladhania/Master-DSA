import java.util.Arrays;

public class LargestElement_1 {
    public static void main(String[] args) {
        int[] arr = {1,3,50,2,4,5,4,9};
        largestElementBruteForce(arr);
        int n = arr.length;
        System.out.println("Brute Force Answer : " + arr[n-1]);
        String betterAnswer = largestElementBetter(arr);
        System.out.println("Better Answer : " + betterAnswer);
        int optimalAnswer = largestElementOptimal(arr);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    // Brute Force Approach
    public static int largestElementBruteForce(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        return arr[n-1];
    }
    /*
    TC : O(n log n) ---> For the Arrays.sort(arr) method, the worst-case time complexity is  O(n^2)  when using
                         quicksort. However, the dual-pivot quicksort used in Java’s Arrays.sort() typically has
                         a worst-case of  O(n \log n)  due to optimizations, even for pathological cases. Thus,
                         the more accurate worst-case time complexity is  O(n \log n) .
    SC : O(n) ---> The space complexity of the Arrays.sort(arr) method is  O(n)  due to the space required for the
                   sorting process in the worst case.
    */

    // Better Approach
    public static String largestElementBetter(int[] arr) {
        String str = "We dont have a better Solution in this Question !!!";
        return str;
    }

    // Optimal Approach ---> TC :
    public static int largestElementOptimal(int[] arr) {
        int n = arr.length;
        int largest = arr[0];
        for(int i = 1; i < n; i++) {
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }
    /*
    TC : O(n) ---> The for loop iterates through the array once, comparing each element to find the largest one.
                   This results in a linear time complexity of  O(n) .
    SC : O(1) ---> The space complexity here is  O(1)  because only a few extra variables (n and largest) are used,
                   and no additional space is required that grows with the input size.
    */

}
