import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n to Find Factorial :");
        int n = scanner.nextInt();
        int answer = factorial(n);
        System.out.println("Factorial of n : " + answer);
        System.out.println("Enter x to Find Power :");
        int x = scanner.nextInt();
        int answer2 = power(x);
        System.out.println("Power of x : " + answer2);
    }

//     Example 1: Factorial Calculation with Base Case ----> Why in this when I am putting bigger values in n like 90 , 100 , im getting the values in negative or zero.
    public static int factorial(int n) {
        //        Base Case
        if (n == 0) {
            return 1;
        }
        else {
            //            Recursive Relation
            int smallerProblem = factorial(n - 1);
            int biggerProblem = n * smallerProblem;
            return biggerProblem;
        }
    }
//      Example 1: Factorial Calculation without Base Case ----> Will Give Segmentation Error because of Stack Overflow
//    public static int factorial(int n) {
//        System.out.println(n);
//        return n * factorial(n - 1);
//    }

//    Example 2: Calculate Power of 2 with Base Case
    public static int power(int x) {
        //        Base Case
        if(x == 0){
            return 1;
        }
        else{
            //            Recursive Relation
            int smallerProblem = power(x - 1);
            int biggerProblem = 2 * smallerProblem;
            return biggerProblem;
        }
    }
    //    Example 2: Calculate Power of 2 without Base Case ----> Will Give Segmentation Error because of Stack Overflow
//    public static int power(int x) {
//        System.out.println(x);
//        int smallerProblem = power(x - 1);
//        int biggerProblem = 2 * smallerProblem;
//        return biggerProblem;
//    }

}

