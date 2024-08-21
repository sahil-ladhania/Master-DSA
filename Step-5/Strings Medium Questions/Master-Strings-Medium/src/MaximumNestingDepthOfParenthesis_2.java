public class MaximumNestingDepthOfParenthesis_2 {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        String bruteForceAnswer = bruteForceMaximumNestingDepthOfParenthesis(s);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        String betterAnswer = betterMaximumNestingDepthOfParenthesis(s);
        System.out.println("Better Answer : " + betterAnswer);
        int optimalAnswer = optimalMaximumNestingDepthOfParenthesis(s);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    public static String bruteForceMaximumNestingDepthOfParenthesis(String s) {
        String str = "There is no brute force solution for this Problem.";
        return str;
    }

    public static String betterMaximumNestingDepthOfParenthesis(String s) {
        String str = "There is no better solution for this Problem.";
        return str;
    }

    public static int optimalMaximumNestingDepthOfParenthesis(String s) {
        int n = s.length();
        int counter = 0;
        int maxDepth = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(ch == '('){
                counter++;
                if(counter > maxDepth){
                    maxDepth = counter;
                }
            }
            else if (ch == ')') {
                counter--;
                if(counter > maxDepth){
                    maxDepth = counter;
                }
            }
        }
        return maxDepth;
    }
    /*
    TC : O(n) ---> Traversing the string once with a single loop results in O(n) time complexity.
    SC : O(1) ---> Only a few variables are used for counting, leading to O(1) space complexity.
    */

}
