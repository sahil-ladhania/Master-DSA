import java.util.Arrays;

public class ValidAnagram_7 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        Boolean bruteForceAnswer = bruteForceValidAnagram(s , t);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        String betterAnswer = betterValidAnagram(s , t);
        System.out.println("Better Answer : " + betterAnswer);
        Boolean optimalAnswer = optimalValidAnagram(s , t);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    // Brute Force Approach
    public static boolean bruteForceValidAnagram(String s , String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        if (s.length() != t.length()) {
            return false;
        }
        if((s.length()) == (t.length())){
            for (int i = 0; i < s.length(); i++) {
                if(sArr[i] != tArr[i]){
                    return false;
                }
            }
        }
        return true;
    }
    /*
    TC : O(n log n) ---> Sorting both strings using Arrays.sort() dominates the time complexity, which is O(n \log n).
    SC : O(n) ---> Temporary storage for the two character arrays (sArr and tArr) requires O(n) space, where n is the length of the string.
    */

    // Better Approach
    public static String betterValidAnagram(String s , String t) {
        String str = "There is no better solution for this Problem.";
        return str;
    }

    // Optimal Approach
    public static boolean optimalValidAnagram(String s , String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] frequency = new int[26];
        for (int i = 0; i < s.length(); i++) {
            frequency[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            frequency[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (frequency[i] != 0)
                return false;
        }
        return true;
    }
    /*
    TC : O(n) ---> Because the algorithm processes each character of the strings s and t exactly once, where n is the length of the strings.
    SC : O(1) ---> Because the size of the frequency array is constant (26), regardless of the input size.
    */

}