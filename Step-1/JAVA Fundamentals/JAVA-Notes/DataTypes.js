/*

1. How Many Data Types are there in JAVA ?
Answer :-
* Java has 8 primitive data types and several non-primitive data types.

2. What are Primitive Data Types in JAVA ?
Answer :-
* Primitive data are only single values and have no special capabilities. 
* Primitive data types in Java are :
    byte -
        The byte data type is an 8-bit signed two’s complement integer. The byte data type is useful for saving memory in large arrays.
        Syntax - byte byteVar;
        Size - 1 byte (8 bits)
    short -
        The short data type is a 16-bit signed two’s complement integer. Similar to byte, use a short to save memory in large arrays, in situations where the memory savings actually matters.
        Syntax - short shortVar;
        Size - 2 bytes (16 bits)
    int - 
        It is a 32-bit signed two’s complement integer.
        Syntax - int intVar;
        Size - 4 bytes (32 bits)
    long -
        The range of a long is quite large. The long data type is a 64-bit two’s complement integer and is useful for those occasions where an int type is not large enough to hold the desired value.
        Syntax - long longVar;
        Size - 8 bytes (64 bits)
    float -
        The float data type is a single-precision 32-bit IEEE 754 floating-point. Use a float (instead of double) if you need to save memory in large arrays of floating-point numbers. 
        Syntax - float floatVar;
        Size - 4 bytes (32 bits)
    double -
        The double data type is a double-precision 64-bit IEEE 754 floating-point. For decimal values, this data type is generally the default choice. Both float and double data types were designed especially for scientific calculations, where approximation errors are acceptable. If accuracy is the most prior concern then, it is recommended not to use these data types and use BigDecimal class instead. 
        Syntax - double doubleVar;
        Size - 8 bytes (64 bits)
    char - 
        The char data type is a single 16-bit Unicode character with the size of 2 bytes (16 bits).
        Syntax - char charVar;
        Size - 2 bytes (16 bits)
    boolean - 
        Boolean data type represents only one bit of information either true or false which is intended to represent the two truth values of logic and Boolean algebra, but the size of the boolean data type is virtual machine-dependent. Values of type boolean are not converted implicitly or explicitly (with casts) to any other type. But the programmer can easily write conversion code.
        Syntax - boolean booleanVar;
        Size - 1 bit

3. What are Non-Primitive Data Types in JAVA ?
Answer :-
* The Reference Data Types will contain a memory address of variable values because the reference types won’t store the variable value directly in memory.
*  Reference Data Types mein variable values ke memory address stored hota hai kyunki ye types variable values ko seedha memory mein store nahi karte.
* Jab hum kisi reference data type ka variable create karte hain, toh usmein variable value ki jagah uski memory address store hoti hai. Matlab, variable ke andar woh value ka pata hota hai ki wo kis memory location pe stored hai, lekin wo value khud seedhe variable ke andar nahi hoti. Iska matlab hai ki jab hum us value ko access karte hain, toh hum us memory address pe jaake value ko retrieve karte hain. Is tareeke se, reference data types variable values ko indirectly point karte hain rather than directly store karte hain.
* Non-primitive data types in Java are :
    string
    class
    object
    interface
    array

4. What is Boolean Data Type ?
Answer :-
* Boolean data type represents two possible values :
    True 
    False
* Syntax - boolean booleanVar;

5. What is Char Data Type ?
Answer :-
* Char data type is used to store a single character. 

6. What is Integer Data Type ?
Answer :-
* Integer data type is used to store whole numbers. 

7. How many Integer Data Types ?
Answer :-
* It includes : 
    byte 
    short
    int
    long

8. What is Floating Point Data Type ?
Answer :-
* Floating point data type is used to store decimal numbers. 

9. How many Floating Point Data Types ?
Answer :-
* It includes :
    float
    double

10. How many Non-Primitives Data Types ?
Answer :-
* Non-primitive data types in Java are numerous and include :
    string
    class
    object
    interface
    array

11. Why is the Size of char 2 bytes in Java ? 
Answer :-
So, other languages like C/C++ use only ASCII characters, and to represent all ASCII characters 8 bits is enough. But Java uses the Unicode system not the ASCII code System and to represent the Unicode system 8 bits is not enough to represent all characters so Java uses 2 bytes for characters. Unicode defines a fully international character set that can represent most of the world’s written languages. It is a unification of dozens of character sets, such as Latin, Greek, Cyrillic, Katakana, Arabic, and many more.

12. What are Identifiers in JAVA ?
Answer :-
* Identifiers in Java are names given to variables, methods, classes, etc., which are used to identify and refer to them in the code.

13. What are Literals in JAVA ?
Answer :-
* Literals in Java are fixed values that are directly used in the code. 
* For example, "hello" is a string literal and 10 is an integer literal.

*/