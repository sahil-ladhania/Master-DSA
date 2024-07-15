import java.util.Scanner;

public class BasicExamples {
    public static void main(String[] args) {
//        Define Scanner Object
        Scanner scanner = new Scanner(System.in);

//        Take User Input for Different Problems
        System.out.println("Enter N to Print from 1 to N : ");
        int N1 = scanner.nextInt();
        print1ToN(N1);

        System.out.println("Enter N to Print from N to 1 : ");
        int N2 = scanner.nextInt();
        printNTo1(N2);

        System.out.println("Enter N to Print GFG N-times : ");
        int N3 = scanner.nextInt();
        printSomethingNTimes(N3);

        System.out.println("Enter N to Print Sum till Nth Term : ");
        int N4 = scanner.nextInt();
        int answer1 = sumOfN(N4);
        System.out.println(answer1);
    }

//    Recursion Examples

//    Problem : 1 - Print 1 To N Without Loop. -----> Head Recursion
    public static void print1ToN(int N) {
        //        Define Base Case
        if(N == 1){
            System.out.println(1);
            return;
        }
        else{
            //            Recursive Call
            print1ToN(N - 1);
            //            Processing
            System.out.println(N);
        }
    };

//    Problem : 2 - Print N to 1 without loop. -----> Tail Recursion
    public static void printNTo1(int N) {
        //        Define Base Case
        if(N == 1){
            System.out.println(1);
            return;
        }
        else{
            //            Processing
            System.out.println(N);
            //            Recursive Call
            printNTo1(N - 1);
        }
    };

//    Problem : 3 - Print GFG n times.
    public static void printSomethingNTimes(int N) {
        //        Define Base Case
        if(N == 1){
            System.out.println("GFG");
            return;
        }
        else{
            //            Recursive Call
            printSomethingNTimes(N - 1);
            //            Processing
            System.out.println("GFG");
        };
    };

//    Problem : 4 - Sum of first n terms.
    public static int sumOfN(int N) {
        //        Define Base Case
        if(N == 1){
            return 1;
        }
        else{
            //            Recursive Call
            int sum = sumOfN(N - 1);
            int totalSum = sum + N;
            //            Processing
            return totalSum;
        }
    };

}
