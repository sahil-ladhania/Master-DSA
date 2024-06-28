public class FibonacciNumber {
    public static void main(String[] args) {
        int answer = fibonacci(6);
        System.out.println(answer);
    }

    public static int fibonacci(int n) {
        if(n <= 1){
            return n;
        }
        return (fibonacci(n-1) + fibonacci(n-2));
    }
}
