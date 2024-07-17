public class MaximumConsecutiveOnes_11 {
    public static void main(String[] args) {
        System.out.println("ChatGPT says my Optimal Solution is not completely correct , but Im getting the correct answers.");
        int[] arr = {1, 1, 0, 1, 1, 1, 0, 1, 1};
        String  bruteForceAnswer = bruteForceMaxConsecutive1(arr);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        String  betterAnswer = betterMaxConsecutive1(arr);
        System.out.println("Better Answer : " + betterAnswer);
        int  optimalAnswer = optimalMaxConsecutive1(arr);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    // Brute Force Approach -----> TC :
    public static String bruteForceMaxConsecutive1(int[] arr) {
        String str = "No Brute Force Answer Available.";
        return str;
    }

    // Better Approach ---> TC :
    public static String betterMaxConsecutive1(int[] arr) {
        String str = "No Better Force Answer Available.";
        return str;
    }

    // Optimal Approach ---> TC :
    public static int optimalMaxConsecutive1(int[] arr) {
        int n = arr.length;
        int count = 0;
        int prevCount = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == 1){
                count++;
            }
            else{
                prevCount = count;
                count = 0;
                continue;
            }
        }
        if(prevCount > count){
            return prevCount;
        }
        else{
            return count;
        }
    }

}
