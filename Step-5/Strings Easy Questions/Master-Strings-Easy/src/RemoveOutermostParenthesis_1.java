public class RemoveOutermostParenthesis_1 {
    public static void main(String[] args) {
        String str1 = "(()())(())";
        String str2 = "(()())(())";
        String str3 = "(()())(())";
        String bruteForceAnswer = bruteForceRemoveOutermostParenthesis(str1);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        String betterAnswer = betterRemoveOutermostParenthesis(str2);
        System.out.println("Better Answer : " + betterAnswer);
        String optimalAnswer = optimalRemoveOutermostParenthesis(str3);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    // Brute Force Approach
    public static String bruteForceRemoveOutermostParenthesis(String str) {
        int lengthofStr = str.length();
        String ansStr = "";
        String subStr = "";
        int counter = 0;
        int start = 0;
        for (int i = 0; i < lengthofStr; i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                counter++;
                if(counter == 1){
                    start = i;
                }
            }
            else if (ch == ')') {
                counter--;
                if(counter == 0){
                    subStr = str.substring(start + 1 , i);
                    ansStr = ansStr + subStr;
                }
            }
        }
        return ansStr;
    }
    /*
    TC : O(n) ---> The algorithm processes each character in the string exactly once.
    SC : O(n) ---> The space required is proportional to the size of the input string due to storing substrings and the final result.
    */

    // Better Approach
    public static String betterRemoveOutermostParenthesis(String str) {
        String strr = "There is no better solution for this Problem.";
        return strr;
    }

    // Optimal Approach
    public static String optimalRemoveOutermostParenthesis(String str) {
        int lengthofStr = str.length();
        StringBuilder ansStr = new StringBuilder();
        int counter = 0;
        int start = 0;
        for (int i = 0; i < lengthofStr; i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                counter++;
                if (counter == 1) {
                    start = i;
                }
            } else if (ch == ')') {
                counter--;
                if (counter == 0) {
                    ansStr.append(str, start + 1, i);
                }
            }
        }
        return ansStr.toString();
    }
    /*
    TC : O(n) ---> The algorithm iterates through each character of the string once.
    SC : O(1) ---> Space used is constant beyond the output string, as we avoid additional storage for intermediate substrings.
    */

}
