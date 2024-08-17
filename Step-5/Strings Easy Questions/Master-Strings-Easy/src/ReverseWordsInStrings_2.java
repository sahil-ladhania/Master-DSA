import java.util.Arrays;

public class ReverseWordsInStrings_2 {
    public static void main(String[] args) {
        String str = "the sky is blue";
        String bruteForceAnswer = bruteForceReverseWordsInStrings(str);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        String betterAnswer = betterReverseWordsInStrings(str);
        System.out.println("Better Answer : " + betterAnswer);
        String optimalAnswer = optimalReverseWordsInStrings(str);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    // Brute Force Approach
    public static String bruteForceReverseWordsInStrings(String str)  {
        String[] wordsArray = str.trim().split("\\s+");
        int left = 0;
        int right = wordsArray.length - 1;
        while (left < right){
            String temp = wordsArray[left];
            wordsArray[left] = wordsArray[right];
            wordsArray[right] = temp;
            left++;
            right--;
        }
        String result = String.join(" " , wordsArray);
        return result;
    }
    /*
    TC : O(n) ---> All operations—trimming, splitting, reversing, and joining—each process the string linearly.
    SC : O(n) ---> The space is dominated by the array of words and the final result string, both of which require O(n) space.
    */

    // Better Approach
    public static String betterReverseWordsInStrings(String str)  {
        String strr = "There is no better solution for this Problem.";
        return strr;
    }

    // Optimal Approach
    public static void reverse(char[] str, int left, int right) {
        while (left < right) {
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }
    }
    public static String optimalReverseWordsInStrings(String s)  {
        char[] str = s.toCharArray();
        int n = str.length;
        reverse(str, 0, n - 1);
        int start = 0;
        for (int end = 0; end <= n; end++) {
            if (end == n || str[end] == ' ') {
                reverse(str, start, end - 1);
                start = end + 1;
            }
        }
        StringBuilder result = new StringBuilder();
        boolean inWord = false;
        for (char c : str) {
            if (c != ' ') {
                if (!inWord && result.length() > 0) {
                    result.append(' ');
                }
                result.append(c);
                inWord = true;
            } else if (inWord) {
                inWord = false;
            }
        }
        return result.toString();
    }
    /*
    TC : O(n) ---> The algorithm processes the string in linear time, reversing the entire string, each word, and collapsing spaces.
    SC : O(1) ---> Space complexity is O(1) as the operations are performed in-place with minimal extra space.
    */

}
