public class GeneralRecursionProblems {
    public static void main(String[] args) {
        System.out.println("Basic General Questions on Recursion :- ");
        int answer1 = sumOfN(5);
        System.out.println("Answer 1 : " + answer1);
        int answer2 = factorialOfN(5);
        System.out.println("Answer 2 : " + answer2);
        int answer3 = powerOfX(2 , 5);
        System.out.println("Answer 3 : " + answer3);
        int answer4 = fibonacciOfN(5);
        System.out.println("Answer 5 : " + answer4);
    }

    // Sum of Natural Numbers: Write a recursive function to find the sum of the first n natural numbers.
    public static int sumOfN(int n) {
        int sum = 1;
        // Base Case
        if(n <= 1){
            return sum;
        }
        else{
            // Recursive Relation
            return n + sumOfN(n-1);
        }
    }

    // Factorial Calculation: Write a recursive function to calculate the factorial of a given number n.
    public static int factorialOfN(int n) {
        // Base Case
        if(n <= 1){
            return 1;
        }
        else{
            // Recursive Relation
            return n * factorialOfN(n-1);
        }
    }

    // Power Calculation: Write a recursive function to calculate x raised to the power ie-(x^y).
    public static int powerOfX(int x , int y) {
        int power = 1;
        // Base Case
        if(y <= 0){
            return power;
        }
        else{
            // Recursive Relation
            return x * powerOfX(x , y-1);
        }
    }

    // Fibonacci Sequence: Write a recursive function to find the nth Fibonacci number.
    public static int fibonacciOfN(int n) {
        // Base Case
        if(n <= 1){
            return n;
        }
        else{
            // Recursive Relation
            int left = fibonacciOfN(n-1);
            int right = fibonacciOfN(n-2);
            int sum = left + right;
            return sum;
        }
    }

}
