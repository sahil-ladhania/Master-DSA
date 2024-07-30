import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FindTheUnionAndIntersection_9 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,3,3,3,4,5};
        int[] arr2 = {1,1,1,2,3,3,4,5,6};
        int[] arr3 = {1, 2, 2, 1};
        int[] arr4 = {2, 2};
        // Union of Two Arrays
        HashSet<Integer> bruteForceAnswer = bruteForceUnion(arr1, arr2);
        System.out.println("Brute Force Answer Union : " + bruteForceAnswer);
        String betterAnswer = betterUnion(arr1 , arr2);
        System.out.println("Better Answer Union : " + betterAnswer);
        ArrayList<Integer> optimalAnswer = optimalUnion(arr1 , arr2);
        System.out.println("Optimal Answer Union : " + optimalAnswer);
        // Intersection of Two Arrays
        ArrayList<Integer> bruteForceAnswerI = bruteForceIntersection(arr3 , arr4);
        System.out.println("Brute Force Answer Intersection : " + bruteForceAnswerI);
        String betterAnswerI = betterIntersection(arr3 , arr4);
        System.out.println("Better Answer Intersection : " + betterAnswerI);
        ArrayList<Integer> optimalAnswerI = optimalIntersection(arr3 , arr4);
        System.out.println("Optimal Answer Intersection : " + optimalAnswerI);
    }

    // Brute Force Approach
    public static HashSet<Integer> bruteForceUnion(int[] arr1 , int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int j = 0; j < arr2.length; j++) {
            set.add(arr2[j]);
        }
        return set;
    }
    /*
    TC : O(n + m) ---> Because you iterate over both arrays once.
    SC : O(n + m) ---> Because the HashSet will store up to n + m unique elements.
    */

    // Better Approach
    public static String betterUnion(int[] arr1 , int[] arr2) {
        String str = "There is No better solution for this Question.";
        return str;
    }

    // Optimal Approach
    public static ArrayList<Integer> optimalUnion(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0, j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
                    list.add(arr1[i]);
                }
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != arr2[j]) {
                    list.add(arr2[j]);
                }
                j++;
            } else {
                if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
                    list.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        while (i < n1) {
            if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
                list.add(arr1[i]);
            }
            i++;
        }
        while (j < n2) {
            if (list.isEmpty() || list.get(list.size() - 1) != arr2[j]) {
                list.add(arr2[j]);
            }
            j++;
        }
        return list;
    }
    /*
    TC : O(n1 + n2) ---> Each element is processed once.
    SC : O(n1 + n2) ---> Due to storing elements in the ArrayList.
    */

    // Brute Force Approach
    public static ArrayList<Integer> bruteForceIntersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();
        // Iterate through the first array
        for (int i = 0; i < arr1.length; i++) {
            // For each element in arr1, iterate through arr2
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    // Check if the element is not already in the result set
                    if (!set.contains(arr1[i])) {
                        set.add(arr1[i]);
                        result.add(arr1[i]);
                    }
                    break; // Break as soon as a match is found
                }
            }
        }
        return result;
    }
    /*
    TC : O(n * m) ---> Because n and m are the lengths of arr1 and arr2, respectively.
    SC : O(n) ---> Due to the space used by the HashSet and ArrayList to store the intersecting elements.
    */


    // Better Approach
    public static String betterIntersection(int[] arr1 , int[] arr2) {
        String str = "There is No better solution for this Question.";
        return str;
    }

    // Optimal Approach
    public static ArrayList<Integer> optimalIntersection(int[] arr1 , int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0, j = 0;
        ArrayList<Integer> result = new ArrayList<>();
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                // Avoid adding duplicates
                if (result.isEmpty() || result.get(result.size() - 1) != arr1[i]) {
                    result.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        return result;
    }
    /*
    TC : O(n log n + m log m) ---> Where n and m are the lengths of arr1 and arr2, respectively, due to the sorting
                                   step. The two-pointer traversal adds O(n + m) complexity.
    SC : O(k) ---> Where k is the number of intersecting elements. This space is used by the ArrayList to store
                   the result.
    */

}
