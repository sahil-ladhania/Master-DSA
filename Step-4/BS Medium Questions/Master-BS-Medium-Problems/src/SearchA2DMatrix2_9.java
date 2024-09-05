public class SearchA2DMatrix2_9 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30},
        };
        boolean bruteForceAnswer = bruteForceSearchA2DMatrix2(arr , 14);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        boolean betterAnswer = betterSearchA2DMatrix2(arr , 14);
        System.out.println("Better Answer : " + betterAnswer);
        boolean optimalAnswer = optimalSearchA2DMatrix2(arr , 14);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    public static boolean bruteForceSearchA2DMatrix2(int[][] arr , int target) {
        int rowLength = arr.length;
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
    /*
    TC : O(mn) --->  You are iterating over every element in the 2D matrix.
    SC : O(1) ---> No extra space used apart from a few variables.
    */
    public static boolean targetElement(int[][]arr , int rowNum , int target) {
        int colLength = arr[rowNum].length;
        int start = 0;
        int end = colLength - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(arr[rowNum][mid] == target){
                return true;
            }
            else if (arr[rowNum][mid] < target) {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return false;
    }
    public static boolean betterSearchA2DMatrix2(int[][] arr , int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean targetElement = targetElement(arr , i , target);
            if(targetElement){
                return true;
            }
        }
        return false;
    }
    /*
    TC : O(n log m) ---> You perform binary search on each row, and there are n rows. Here m = No of Columns
    SC : O(1) ---> No extra space used apart from variables.
    */

    public static boolean optimalSearchA2DMatrix2(int[][] arr , int target) {
        int rowLength = arr.length;
        int colLength = arr[0].length;
        int row = 0;
        int col = colLength - 1;
        while (row < rowLength && col >= 0){
            if(arr[row][col] == target){
                return true;
            }
            else if (arr[row][col] < target) {
                row++;
            }
            else{
                col--;
            }
        }
        return false;
    }
    /*
    TC : O(m + n) ---> Traverses the matrix from the top-right corner to bottom-left corner.
    SC : O(1) ---> Uses a constant amount of extra space.
    */

}
