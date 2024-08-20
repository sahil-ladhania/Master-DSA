import java.util.spi.ToolProvider;

public class RotateString_6 {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        boolean bruteForceAnswer = bruteForceRotateString(s , goal);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        String betterAnswer = betterRotateString(s , goal);
        System.out.println("Better Answer : " + betterAnswer);
        boolean optimalAnswer = optimalRotateString(s , goal);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    // Brute Force Approach
    public static boolean bruteForceRotateString(String s , String goal) {
        int n = s.length();
        if (s.length() != goal.length()) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            if (rotated.equals(goal)) {
                return true;
            }
        }
        return false;
    }
    /*
    TC : O(n^2) ---> Generating and comparing each rotation takes O(n) time, and there are n rotations.
    SC : O(n) ---> Each rotation requires O(n) space for the new string.
    */

    // Better Approach
    public static String betterRotateString(String s , String goal) {
        String str = "There is no better solution for this Problem.";
        return str;
    }

    // Optimal Approach
    public static boolean optimalRotateString(String s , String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        if(s.equals(goal)){
            return true;
        }
        String concatenated_s = s + s;
        if(concatenated_s.contains(goal)){
            return true;
        }
        return false;
    }
    /*
    TC : O(n) ---> Because the most expensive operation is the substring search.
    SC : O(n) ---> Due to the concatenation of the string.
    */

}
