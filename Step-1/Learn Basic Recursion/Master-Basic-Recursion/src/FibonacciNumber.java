public class FibonacciNumber {
    public static void main(String[] args) {
        int answer = fibonacci(5);
        System.out.println(answer);
    }

    public static int fibonacci(int n) {
        //        Base Condition 1
        if(n == 0){
            return 0;
        }
        //        Base Condition 2
        else if(n == 1){
            return 1;
        }
        int left = fibonacci(n - 1);
        int right = fibonacci(n - 2);
        return left + right;
    }
}
