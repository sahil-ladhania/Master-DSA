public class SubArrayWithMaxSubArraySum_5 {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        printSubArrayWithMaxSum(arr);
    }

    // Optimal Approach (Extended Version of Maximum SubArray Sum)
    public static void printSubArrayWithMaxSum(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0;
        int ansStart = -1;
        int ansEnd = -1;
        for (int i = 0; i < n; i++) {
            if(sum == 0){
                start = i;
            }
            sum = sum + arr[i];
            if(sum > maxSum){
                maxSum = sum;
                ansStart = start;
                ansEnd = i;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        for (int j = ansStart; j <= ansEnd ; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        System.out.println("Max Sum : " + maxSum);
    }
    /*
    TC : O(2n) ---> The algorithm iterates through the array twice: once to find the maximum subarray sum and once to print the subarray, resulting in linear time complexity.
    SC : O(1) ---> Only a few extra variables are used, so space complexity is constant.
    */
}
