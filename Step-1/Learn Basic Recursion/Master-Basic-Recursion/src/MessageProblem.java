public class MessageProblem {
    public static void main(String[] args) {
        // write a function to print a message 5 times
        System.out.println("Recursion In-Depth !!!");
        message1(); // Add a breakpoint and step into to understand the flow of a Function inside Function
    }

    public static void message() {
        System.out.println("Recursion In-Depth !!!");
        message1();
    }
    public static void message1() {
        System.out.println("Recursion In-Depth !!!");
        message2();
    }
    public static void message2() {
        System.out.println("Recursion In-Depth !!!");
        message3();
    }
    public static void message3() {
        System.out.println("Recursion In-Depth !!!");
        message4();
    }
    //    Function body changes here
    public static void message4() {
        System.out.println("Recursion In-Depth !!!");
    }
}
