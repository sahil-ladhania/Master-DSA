import java.util.*;

public class HashingWithHashMap {
    public static void main(String[] args) {
        System.out.println("Master Hashing !!!");
        int[] arr1 = {1, 2, 2, 3, 3, 3, 4};
        System.out.println("Count Frequencies: " + countFrequencies(arr1)); // {1=1, 2=2, 3=3, 4=1}
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Has Duplicates (no duplicates): " + hasDuplicates(arr2)); // false
        int[] arr3 = {1, 2, 3, 4, 5, 5, 7};
        System.out.println("Has Duplicates (with duplicates): " + hasDuplicates(arr3)); // true
        int[] arr4 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println("Two Sum: " + twoSum(arr4, target1)); // true (because 2 + 7 = 9)
        int[] arr5 = {1, 2, 3, 4};
        int target2 = 8;
        System.out.println("Two Sum (no pair): " + twoSum(arr5, target2)); // false
        String s1 = "listen";
        String s2 = "silent";
        System.out.println("Are Anagrams: " + areAnagrams(s1, s2)); // true
        String s3 = "hello";
        String s4 = "world";
        System.out.println("Are Anagrams (not anagrams): " + areAnagrams(s3, s4)); // false
        String s5 = "leetcode";
        System.out.println("First Unique Character: " + firstUniqueCharacter(s5)); // 0 (index of 'l')
        String s6 = "aabbcc";
        System.out.println("First Unique Character (none): " + firstUniqueCharacter(s6)); // -1 (no unique character)
        int[] arr7_1 = {1, 3, 5, 7, 9};
        int[] arr7_2 = {2, 4, 5, 6, 8};
        System.out.println("Find Intersection: " + findIntersection(arr7_1, arr7_2)); // [5]
        int[] arr8 = {1, 1, 2, 2, 3, 3, 3, 3};
        int countElement = 2;
        System.out.println("Count Occurrences: " + countOccurrences(arr8, countElement)); // 3
        int[] arr9 = {4, 1, 2, 1, 2};
        System.out.println("Find Single Number: " + findSingleNumber(arr9)); // 4
        String s7 = "banana";
        System.out.println("Track Character Indices: " + trackCharacterIndices(s7)); // {b=[0], a=[1,3,5], n=[2,4]}
    }

    // Given an array of integers arr, count the frequency of each element and return a dictionary with elements as keys and their frequencies as values.
    public static Map<Integer, Integer> countFrequencies(int[] arr) {
        HashMap<Integer , Integer> dictionary = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int element = arr[i];
            if(dictionary.containsKey(element)){
                dictionary.put(element , dictionary.get(element) + 1);
            }
            else{
                dictionary.put(element , 1);
            }
        }
        return dictionary;
    }

    // Given an array of integers arr, check if there are any duplicates.
    public static boolean hasDuplicates(int[] arr) {
        HashMap<Integer , Integer> newArr = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int element = arr[i];
            if(newArr.containsKey(element)){
                return true;
            }
            else{
                newArr.put(element , 1);
            }
        }
        return false;
    }

    // Given an array of integers arr and a target sum target, find if there are two numbers that add up to the target sum.
    public static boolean twoSum(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int complement = target - arr[i];
            if(!set.contains(complement)){
                set.add(arr[i]);
            }
            else{
                return true;
            }
        }
        return false;
    }

    // Given an array of integers arr, count the number of occurrences of a specific element.
    public static int countOccurrences(int[] arr, int element) {
        HashMap<Integer , Integer> newArr = new HashMap();
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] != element){
                continue;
            }
            else{
                newArr.put(element , count++);
            }
        }
        return count;
    }

    // Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.
    public static int findSingleNumber(int[] arr) {
        HashMap<Integer , Integer> newArr = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int element = arr[i];
            if(newArr.containsKey(element)){
                newArr.put(element , newArr.get(element) + 1);
            }
            else{
                newArr.put(element , 1);
            }
        }
        for (int j = 0; j < n; j++) {
            int element = arr[j];
            if(newArr.get(element) == 1){
                return element;
            }
        }
        return -1;
    }

    // Given a string s, track the indices of each character in the string and return a dictionary with characters as keys and lists of indices as values.
    public static Map<Character, List<Integer>> trackCharacterIndices(String s) {
        return null;
    }

    // Given two arrays of integers arr1 and arr2, find their intersection.
    public static List<Integer> findIntersection(int[] arr1, int[] arr2) {
        return null;
    }

    // Given two strings s1 and s2, check if they are anagrams of each other using a hash map.
    public static boolean areAnagrams(String s1, String s2) {
        return false;
    }

    // Given a string s, find the first non-repeating character in it and return its index.
    public static int firstUniqueCharacter(String s) {
        return -1;
    }

}