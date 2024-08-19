public class LongestCommonPrefix_4 {
    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        String bruteForceAnswer = bruteForceLongestCommonPrefix(str);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        String betterAnswer = betterLongestCommonPrefix(str);
        System.out.println("Better Answer : " + betterAnswer);
        String optimalAnswer = optimalLongestCommonPrefix(str);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    // Brute Force Approach
    public static String bruteForceLongestCommonPrefix(String[] str) {
        if (str.length == 0){
            return "";
        }
        String shortestString = str[0];
        for (int i = 1; i < str.length; i++) {
            if (str[i].length() < shortestString.length()) {
                shortestString = str[i];
            }
        }
        String longestCommonPrefix = "";
        for (int i = 0; i < shortestString.length(); i++) {
            char currentChar = shortestString.charAt(i);
            for (int j = 0; j < str.length; j++) {
                if (i >= str[j].length() || str[j].charAt(i) != currentChar) {
                    System.out.println(str[j]);
                    return longestCommonPrefix;
                }
            }
            longestCommonPrefix += currentChar;
        }
        return longestCommonPrefix;
    }
    /*
    TC : O(mn) ---> You iterate through each character of the shortest string (length m) and compare it across all strings (count n). Thus, the time complexity is proportional to the product of the number of strings and the length of the shortest string.
    SC : O(1) ---> The space used is constant, aside from the output string which depends on the common prefix length, but it does not scale with the input size beyond the prefix length.
    */

    // Better Approach
    public static String betterLongestCommonPrefix(String[] str) {
        String strr = "There is no better solution to this Problem.";
        return strr;
    }
    /*
    TC : O() --->
    SC : O() --->
    */

    // Optimal Approach
    public static String optimalLongestCommonPrefix(String[] str) {
        String strr = "Solve Using Binary Search.";
        return strr;
    }
    /*
    TC : O() --->
    SC : O() --->/
    */

}
