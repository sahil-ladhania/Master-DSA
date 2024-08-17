public class LargestOddNumberString_3 {
    public static void main(String[] args) {
        String num = "2224124";
        String bruteForceAnswer = bruteForceLargestOddNumberString(num);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        String betterAnswer = betterLargestOddNumberString(num);
        System.out.println("Better Answer : " + betterAnswer);
        String optimalAnswer = optimalLargestOddNumberString(num);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    // Brute Force Approach
    public static String bruteForceLargestOddNumberString(String num) {
        int length = num.length();
        if ((num.charAt(length - 1) - '0') % 2 != 0) {
            return num;
        }
        String largestOdd = "";
        for (int i = length - 1; i >= 0; i--) {
            if ((num.charAt(i) - '0') % 2 != 0) {
                String currentOdd = num.substring(0, i + 1);
                if (currentOdd.compareTo(largestOdd) > 0) {
                    largestOdd = currentOdd;
                }
            }
        }
        return largestOdd;
    }
    /*
    TC : O(n^2) ---> The substring method and compareTo operation within the loop both contribute to the time complexity. Each call to substring(0, i + 1) involves copying part of the string, leading to a time complexity of O(n) for each iteration of the loop. With the loop running n times, this results in O(n^2) time complexity.
    SC : O(n) ---> The space complexity is O(n) because, in the worst case, the largestOdd string can be as long as the input string, which takes up linear space relative to the size of the input.
    */

    // Better Approach
    public static String betterLargestOddNumberString(String num) {
        String str = "There is no better solution for this Problem.";
        return str;
    }

    // Optimal Approach
    public static String optimalLargestOddNumberString(String num) {
        int length = num.length();
        String largestOdd = "";
        if ((num.charAt(length - 1) - '0') % 2 != 0) {
            return num;
        }
        for (int i = length-2; i > 0; i--) {
            if((num.charAt(i) - '0') % 2 != 0){
                String currentOdd = num.substring(0, i + 1);
                if (currentOdd.compareTo(largestOdd) > 0) {
                    largestOdd = currentOdd;
                }
            }
        }
        return largestOdd;
    }
    /*
    TC : O(n) ---> Since we traverse the string once and use efficient substring operations.
    SC : O(1) ---> As we only need a fixed amount of extra space to store variables.
    */

}
