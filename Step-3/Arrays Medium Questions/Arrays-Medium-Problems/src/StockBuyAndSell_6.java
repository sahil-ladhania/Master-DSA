public class StockBuyAndSell_6 {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int bruteForceAnswer = bruteForceStockBuyAndSell(arr);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        String betterAnswer = betterStockBuyAndSell(arr);
        System.out.println("Better Answer : " + betterAnswer);
        int optimalAnswer = optimalStockBuyAndSell(arr);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    // Brute Force Approach
    public static int bruteForceStockBuyAndSell(int[] arr) {
        int n = arr.length;
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            int profit = 0;
            for (int j = i; j < n; j++) {
                if(i < j){
                    profit = arr[j] - arr[i];
                    if(profit > maxProfit){
                        maxProfit = profit;
                    }
                }
            }
        }
        return maxProfit;
    }
    /*
    TC : O(n^2) ---> Due to the nested loops iterating through all possible pairs of days.
    SC : O(1) ---> Only a few extra variables are used.
    */

    // Better Approach
    public static String betterStockBuyAndSell(int[] arr) {
        String str = "There is no better solution for this Problem.";
        return str;
    }

    // Optimal Approach
    public static int optimalStockBuyAndSell(int[] arr) {
        int n = arr.length;
        int profit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            minPrice = Math.min(minPrice , arr[i]);
            profit = Math.max(profit , arr[i] - minPrice);
        }
        return profit;
    }
    /*
    TC : O(n) ---> Achieved by a single pass through the array to compute the maximum profit.
    SC : O(1) ---> Only a few extra variables are used.
    */
}
