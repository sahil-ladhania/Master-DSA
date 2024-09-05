public class SearchA2DMatrix_8 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        boolean bruteForceAnswer = bruteForceSearchA2DMatrix(arr , 8);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        boolean betterAnswer = betterSearchA2DMatrix(arr , 8);
        System.out.println("Better Answer : " + betterAnswer);
        boolean optimalAnswer = optimalSearchA2DMatrix(arr , 8);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    public static boolean bruteForceSearchA2DMatrix(int[][] arr , int target) {
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
    public static boolean betterSearchA2DMatrix(int[][] arr , int target) {
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

    public static boolean optimalSearchA2DMatrix(int[][] arr , int target) {
        int n = arr.length;
        int m = arr[0].length;
        int start = 0;
        int end = (n * m) - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            int row = mid / m;
            int col = mid % m;
            int midElement = arr[row][col];
            if(midElement == target){
                return true;
            }
            else if (midElement < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return false;
    }
    /*
    TC : O(log mn) ---> Single binary search over the entire matrix flattened as 1D.
    SC : O(1) ---> No extra space used apart from variables.
    */

}
