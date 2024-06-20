/*

1. What is a Variable ?
Answer :-
* A variable is a named memory location that holds a value that can be changed during the program execution.

2. How to Declare a Variable ?
Answer :-
* To declare a variable in Java, you specify the data type followed by the variable name. 
* Syntax - Datatype VarName;
* For example: int num;

3. How to Initialize a Variable ?
Answer :-
* Variable initialization is the process of assigning a value to a variable. 
* It can be done at the time of declaration or later in the program. 
* For example - int num = 10;

4. How many types of Variable ae there in JAVA ?
Answer :-
* In Java, there are 3 types of variables -
    Local variables 
    Instance variables
    Static variables

5. What is a Local Variable ?
Answer :-
* A local variable is declared within a method, constructor, or block and is accessible only within that scope.
* Example -
public class Example {
    public void method() {
        // Declaring and initializing a local variable
        int num = 10;
        // Accessing the local variable within the method
        System.out.println("Local variable num: " + num);
    }

6. What is Instance Variable ?
Answer :-
* An instance variable is declared within a class but outside any method, constructor, or block.
* Each instance of the class has its own copy of the instance variables.
* Example -
public class Example {
    // Declaring an instance variable
    int age;
    public void setAge(int a) {
        // Assigning a value to the instance variable
        age = a;
    }
    public void displayAge() {
        // Accessing the instance variable within the method
        System.out.println("Age: " + age);
    }

7. What is Static Variable ?
Answer :-
* A static variable, also known as a class variable, is declared with the static keyword and is shared among all instances of the class.
* Example -
public class Example {
    // Declaring a static variable
    static int count;
    public Example() {
        // Incrementing the static variable in the constructor
        count++;
    }

8. What is the difference between Instance Variable & Static Variable ?
Answer :-
* Instance variables belong to individual instances of a class and each instance has its own copy, whereas Static variables are shared among all instances of the class and belong to the class itself.

9. What is a Scope of Variable ?
Answer :-
* The scope of a variable refers to the region of the program where the variable is accessible.
* It defines the visibility and lifetime of the variable.

10. How many types of Scopes are there in JAVA ?
Answer :-
* In Java, there are 3 types of variable scopes - 
    Local scope 
    Instance scope
    Class (Static) scope

*/