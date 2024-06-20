/*
Some concepts that will help you to instantly code in JAVA :-

1. How to take user input and give output ?
   * To take input from the user, you can use the Scanner class from the java.util package.
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter your name: ");
        String name = scanner.nextLine(); // Read user input
        System.out.println("Hello, " + name); // Output user input
        System.out.println("Enter your age: ");
        int age = scanner.nextInt(); // Read user input
        System.out.println("You are " + age + " years old."); // Output user input
    * To give output, you use the System.out.println method. There are different methods to print output.
        * System.out.print - Prints text to the console without moving to a new line.
        * System.out.println - Prints text to the console and then moves to a new line.
        * System.out.printf - Provides formatted output. Allows you to include format specifiers within the text.
        * System.out.format - Identical to printf. Used for formatted output.
        * String.format - Creates a formatted string that can be printed or used later.
    * Different Format Specifiers :
        %d - Integer
        %f - Floating-point number
        %.2f - Formats to 2 decimal places
        %s - String
        %n - Platform-independent newline character


2. How many Data types are there in JAVA ?
   * There are two types of Data Types :-
        Primitive Data Types
        Non-Primitive Data Types
   * Primitive Data Type - Most basic data types available in Java.
   * Non-Primitive Data Type - Also known as reference data types, are more complex data types. They refer
     to objects and are created using defined constructors. Unlike primitive data types, which hold their
     values directly, non-primitive types hold references to objects.
   * Types of Primitive Data Types :-
        byte : 8-bit signed integer
        short : 16-bit signed integer
        int : 32-bit signed integer
        long : 64-bit signed integer
        float : 32-bit floating-point
        double : 64-bit floating-point
        char : 16-bit Unicode character
        boolean : Represents two values: true and false
   * Types of Non-Primitive Data Types :-
        Classes
        Interfaces
        Arrays
        Enumerations (Enums)
        Annotations


3. How if-else works in JAVA ?
   * Syntax of if-else :-
   if() {

   }
   else if() {

   }
   else {

   }

4. How SWITCH statement works in JAVA ?
   * Syntax of SWITCH Statement :-
   switch (expression) {
    case value1:
        // Code to be executed if expression equals value1
        break; // Optional, but necessary to prevent fall-through

    case value2:
        // Code to be executed if expression equals value2
        break; // Optional, but necessary to prevent fall-through

    // You can have any number of case statements
    default:
        // Code to be executed if none of the cases match
        // This is optional
    }

5. What are Arrays and Strings in JAVA ?
   * Arrays - Container object that holds a fixed number of values of a single type.
   * Strings - String is a sequence of characters. In Java, strings are objects.

6. How does for Loops works ?
   * Syntax of for Loop :-
   for (initialization; condition; update) {
    // Code to be executed
    }

7. How does while Loops works ?
   * Syntax of while Loop :-
   while (condition) {
    // Code to be executed
    }

8. What are Functions ?
   * Collection of statements grouped together to perform a specific task.
   * In Java, all functions are defined within classes, and they can be used to perform operations, return
     values, and accept parameters.

9. How to Define a Function ?
   * To define a function in Java, you need to specify the method signature, which includes the access
     modifier, return type, method name, and parameters (if any).
   * Syntax of Defining a Function :-
    accessModifier returnType methodName(parameterList) {
    // Body of the function
    }
   * accessModifier - Controls the visibility of the method (e.g., public, private, protected).
   * returnType - Specifies the type of value the method returns. Use void if the method does not return
     a value.
   * methodName - The name of the method.
   * parameterList - A comma-separated list of input parameters, each with a type and name. Can be empty
     if no parameters are needed.

10. How to call a Function ?
    * To call a function, you use the method name followed by parentheses containing any required
      arguments.

11. What is Pass By Value in JAVA ?
    In Java, all primitive data types (int, float, double, etc.) and references to objects are passed by
    value. This means that a copy of the actual value is passed to the function. Changes to the parameters
    within the function do not affect the original values.
    Example :-
    public class PassByValueExample {
    public static void modifyValue(int value) {
        value = 100; // This change will not affect the original value
    }

    public static void main(String[] args) {
        int originalValue = 50;
        modifyValue(originalValue);
        System.out.println("Original Value: " + originalValue); // Output: 50
    }
}

12. What is Pass By Reference in JAVA ?
    * Java does not support pass by reference. However, when an object is passed to a method, the reference
     to the object is passed by value. This means that changes to the object's fields inside the method
     affect the original object since both the original reference and the method's parameter reference
     point to the same object.
    * Example :-
    public class PassByReferenceExample {
        public static void modifyObject(MyObject obj) {
            obj.value = 100; // This change will affect the original object
        }

        public static void main(String[] args) {
            MyObject originalObject = new MyObject();
            originalObject.value = 50;
            modifyObject(originalObject);
            System.out.println("Object Value: " + originalObject.value); // Output: 100
        }
    }

    class MyObject {
        int value;
    }

*/