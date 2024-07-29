import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateFromSortedArray_4 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3, 4, 4, 5};
        int[] arrCopy1 = arr.clone(); // To keep the original array intact for other methods
        int[] arrCopy2 = arr.clone(); // To keep the original array intact for other methods
        int bruteForceAnswer = bruteForceRemoveDuplicateFromSorted(arrCopy1);
        System.out.println("Brute Force Answer: ");
        for (int i = 0; i < bruteForceAnswer; i++) {
            System.out.print(arrCopy1[i] + " ");
        }
        System.out.println();
        String betterAnswer = betterRemoveDuplicateFromSorted(arrCopy2);
        System.out.println("Better Answer: " + betterAnswer);
        int optimalAnswer = optimalRemoveDuplicateFromSorted(arr);
        System.out.println("Optimal Answer: ");
        for (int i = 0; i < optimalAnswer; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Brute Force Approach
    public static int bruteForceRemoveDuplicateFromSorted(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        for(int num : set){
            arr[j++] = num;
        }
        return k;
    }
    /*
    TC : O(2n) ---> Therefore, the overall time complexity is  O(n) + O(n) = O(2n) , which simplifies to  O(n) .
    SC : O(n) ---> The space complexity of using a HashSet is  O(n)  because, in the worst case, all elements in the array are unique,
                   and thus, all elements will be stored in the HashSet.
    */

    // Better Approach
    public static String betterRemoveDuplicateFromSorted(int[] arr) {
        String str = "There is no better approach to this Problem.";
        return str;
    }

    // Optimal Approach
    public static int optimalRemoveDuplicateFromSorted(int[] arr) {
        int n = arr.length;
        int k = 0;
        for (int i = 1; i < n; i++) {
            if (arr[k] != arr[i]) {
                k++;
                arr[k] = arr[i];
            }
        }
        return k + 1;
    }
    /*
    TC : O(n) ---> Overall, the time complexity is  O(n) , where  n  is the length of the array. This is because
                   the method performs a single pass through the array.
    SC : O(1) ---> Thus, the space complexity is  O(1)  because the extra space used is independent of the input
                   size.
    */

}
