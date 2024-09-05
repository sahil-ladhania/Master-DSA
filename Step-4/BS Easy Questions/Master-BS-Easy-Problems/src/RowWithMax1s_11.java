public class RowWithMax1s_11 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 1},
                {0, 0, 1},
                {0, 0, 0}
        };
        int bruteForceAnswer = bruteForceRowWithMax1s(arr);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        String betterAnswer = betterRowWithMax1s(arr);
        System.out.println("Better Answer : " + betterAnswer);
        int optimalAnswer = optimalRowWithMax1s(arr);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    public static int bruteForceRowWithMax1s(int[][] arr) {
        int rowLength = arr.length;
        int count = 0;
        int maxCount = -1;
        int ans = -1;
        for (int i = 0; i < rowLength; i++) {
            count = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == 1){
                    count++;
                }
            }
            if(maxCount < count){
                maxCount = count;
                ans = i;
            }
        }
        return ans;
    }
    /*
    TC : O(mn) ---> Because for each of the m rows, you are traversing all n columns.
    SC : O(1) ---> Only a few variables are used for counting, no extra space is required.
    */

    public static String betterRowWithMax1s(int[][] arr) {
        String str = "There is no better solution to this Problem.";
        return str;
    }

    public static int lowerBound(int[][] arr , int rowNum , int x) {
        int colLength = arr[rowNum].length;
        int start = 0;
        int end = colLength - 1;
        int LBIndex = -1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(arr[rowNum][mid] >= x){
                LBIndex = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return LBIndex;
    }
    public static int optimalRowWithMax1s(int[][] arr) {
        int n = arr.length;
        int maxCount = 0;
        int ans = -1;
        for (int i = 0; i < n; i++) {
            int LBIndex = lowerBound(arr , i , 1);
            if(LBIndex != -1){
                int count = arr[i].length - LBIndex;
                if(maxCount < count){
                    maxCount = count;
                    ans = i;
                }
            }
        }
        return ans;
    }
    /*
    TC : O(m log n) ---> Because for each of the m rows, you perform a binary search (log(n) complexity) to find the first occurrence of 1.
    SC : O(1) ---> No extra space is used apart from a few variables.
    */

}
