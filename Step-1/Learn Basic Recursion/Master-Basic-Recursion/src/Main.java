import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N to Print from N to 1 :");
        int N1 = 5;
        printNTo1(N1);
        System.out.println("Enter N to Print from 1 to N :");
        int N2 = 1;
        print1ToN(N2);
        System.out.println("Enter I , N , Sum to Print Sum :");
        int I = scanner.nextInt();
        int N3 = scanner.nextInt();
        int Sum = scanner.nextInt();
        printSum(I , N3 , Sum);
        System.out.println("Enter n to Find Factorial :");
        int n = scanner.nextInt();
        int answer = factorial(n);
        System.out.println("Factorial of n : " + answer);
        System.out.println("Enter x to Find Power :");
        int x = scanner.nextInt();
        int answer2 = power(x);
        System.out.println("Power of x : " + answer2);
    }

//    Examples :-

//    Example 1 : Print N to 1 recursively.
    public static void printNTo1(int n) {
        if(n == 0){
            return;
        }
        else{
            System.out.println(n);
            printNTo1(n - 1);
        }
    }

//    Example 2 : Print 1 to N recursively.
    public static void print1ToN(int n) {
        if(n == 6){
            return;
        }
        else{
            System.out.println(n);
            print1ToN(n + 1);
        }
    }

//    Example 3 : Print sum of first n Natural Numbers
    public static void printSum(int i , int n , int sum) {
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        else{
            sum += i;
            printSum(i + 1 , n , sum);
        }
    }

//     Example 3: Factorial Calculation with Base Case ----> Why in this when I am putting bigger values in n like 90 , 100 , im getting the values in negative or zero.
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
//      Example 3: Factorial Calculation without Base Case ----> Will Give Segmentation Error because of Stack Overflow
//    public static int factorial(int n) {
//        System.out.println(n);
//        return n * factorial(n - 1);
//    }

//    Example 4: Calculate Power of 2 with Base Case
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
    //    Example 4: Calculate Power of 2 without Base Case ----> Will Give Segmentation Error because of Stack Overflow
//    public static int power(int x) {
//        System.out.println(x);
//        int smallerProblem = power(x - 1);
//        int biggerProblem = 2 * smallerProblem;
//        return biggerProblem;
//    }

}

