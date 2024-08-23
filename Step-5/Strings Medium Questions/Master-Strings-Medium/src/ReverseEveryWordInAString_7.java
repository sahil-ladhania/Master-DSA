public class ReverseEveryWordInAString_7 {
    public static void main(String[] args) {
        String s = "  hello world  ";
        String bruteForceAnswer = bruteForceReverseEveryWordInAString(s);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        String betterAnswer = betterReverseEveryWordInAString(s);
        System.out.println("Better Answer : " + betterAnswer);
        String optimalAnswer = optimalReverseEveryWordInAString(s);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    public static String bruteForceReverseEveryWordInAString(String s) {
        String str = "There is no brute force solution for this Problem.";
        return str;
    }

    public static String betterReverseEveryWordInAString(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--){
            ans.append(words[i]);
            if(i != 0){
                ans.append(" ");
            }
        }
        return ans.toString();
    }
    /*
    TC : O(n) ---> Each operation (trimming, splitting, and reversing) iterates through the string once, where n is the length of the input string. Thus, the overall time complexity is linear with respect to the length of the input.
    SC : O(n) ---> The space complexity is linear because the algorithm uses extra space for storing the split words array and the resulting StringBuilder, both of which can be proportional to the length of the input string.
    */

    public static String optimalReverseEveryWordInAString(String s) {
        String str = "There can be solution where we can reduce SC to O(1).";
        return str;
    }

}
