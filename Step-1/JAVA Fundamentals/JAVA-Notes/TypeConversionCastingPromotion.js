/*

1. What is Type Conversion ?
Answer :-
* Refers to converting the data type of a variable into another data type. 
* It can be either implicit or explicit.
* Immplicit Conversion -
    Automatic type conversion, occurs when the compiler automatically converts one data type to another without any explicit instructions from the programmer.
    Typically happens when a value of one data type is assigned to a variable of another data type, and the conversion is considered safe and lossless.
* Example of Implicit Conversion -
int numInt = 10;
double numDouble = numInt; // Implicit conversion from int to double
System.out.println("Double value: " + numDouble); // Output: 10.0
* Explicit Conversion -
    Also known as Type Casting, occurs when the programmer explicitly specifies the conversion of one data type to another.
    Done by using parentheses and specifying the desired data type before the value or variable to be converted.
    Syntax - (targetDataType) valueOrVariableToConvert
* Example of Explicit Conversion -
double numDouble = 10.5;
int numInt = (int) numDouble; // Explicitly converting double to int
System.out.println("Integer value: " + numInt); // Output: 10

2. What is Type Promotion ?
Answer :-
* Also known as implicit type conversion, occurs when operators are applied to operands of different data types, and the lower data type is promoted to the higher data type to perform the operation.
* Example of Type Promotion -
int numInt = 5;
double numDouble = 10.5;
double result = numInt + numDouble; // Type promotion of int to double
System.out.println("Result: " + result); // Output: 15.5

*/