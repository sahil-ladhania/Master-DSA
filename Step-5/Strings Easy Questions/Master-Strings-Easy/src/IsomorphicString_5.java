import java.util.HashMap;

public class IsomorphicString_5 {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        boolean bruteForceAnswer = bruteForceIsomorphicString(s , t);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        String betterAnswer = betterIsomorphicString(s , t);
        System.out.println("Better Answer : " + betterAnswer);
        boolean optimalAnswer = optimalIsomorphicString(s , t);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }
    // Brute Force Approach
    public static boolean bruteForceIsomorphicString(String s , String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> isomorphicMap = new HashMap<>();
        HashMap<Character, Character> reverseMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);
            if (isomorphicMap.containsKey(chS)) {
                if (isomorphicMap.get(chS) != chT) {
                    return false;
                }
            } else {
                isomorphicMap.put(chS, chT);
            }
            if (reverseMap.containsKey(chT)) {
                if (reverseMap.get(chT) != chS) {
                    return false;
                }
            } else {
                reverseMap.put(chT, chS);
            }
        }
        return true;
    }
    /*
    TC : O(n) ---> You iterate through both strings once, performing constant-time operations (like put, get, and containsKey in the HashMaps), so the overall time complexity is O(n), where n is the length of the strings.
    SC : O(n) ---> In the worst case, you store each character of both strings in the two HashMaps, which gives a space complexity of O(n).
    */

    // Better Approach
    public static String betterIsomorphicString(String s , String t) {
        String str = "There is no better solution for this Problem.";
        return str;
    }
    /*
     */

    // Optimal Approach
    public static boolean optimalIsomorphicString(String s , String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] mapS = new int[128];
        int[] mapT = new int[128];
        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);
            if (mapS[chS] != mapT[chT]) {
                return false;
            }
            mapS[chS] = i + 1;
            mapT[chT] = i + 1;
        }
        return true;
    }
    /*
    TC : O(n) ---> Similar to the HashMap approach, you iterate through both strings once, performing constant-time operations on the arrays, leading to O(n) time complexity.
    SC : O(1) ---> The space complexity is O(1) because the arrays used for tracking the last seen positions are of fixed size (128 or 256), independent of the input size. This makes it more space-efficient than the HashMap approach.
    */

}
