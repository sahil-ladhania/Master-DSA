public class NumbersProblem {
    public static void main(String[] args) {
        // write a function that takes in a number and prints it
        // print first 5 numbers: 1 2 3 4 5
        print1(1); // Add a breakpoint and step into to understand the flow of a Function inside Function
    }

    public static void print1(int n) {
        System.out.println(n);
        print2(2);
    }
    public static void print2(int n) {
        System.out.println(n);
        print3(3);
    }
    public static void print3(int n) {
        System.out.println(n);
        print4(4);
    }
    public static void print4(int n) {
        System.out.println(n);
        print5(5);
    }
    //    Function body changes here
    public static void print5(int n) {
        System.out.println(n);
    }
}
