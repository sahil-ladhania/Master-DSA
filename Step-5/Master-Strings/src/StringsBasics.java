public class StringsBasics {
    public static void main(String[] args) {
        /*
        1. Defining a String using String Literal
        String str1 = "Hello, World!";

        2. Defining a String using new Keyword
        String str2 = new String("Hello, World!");

        3. Basic String Operations
        int length = str1.length(); ----> Find Length of a String

        char ch = str1.charAt(int index); -----> Find character at specific Index

        String substr = str1.substring(int beginIndex); -----> Find sub-string
        String substr2 = str1.substring(int beginIndex, int endIndex); -----> Find sub-string

        String str3 = str1 + " How are you?"; -----> Concatenation of String
        String str4 = str1.concat(String str); -----> Concatenation of String

        4. String Comparison
        boolean isEqual = str1.equals(String anotherString); ----> Comparison using .equals()

        int comparison = str1.compareTo(String anotherString); -----> Comparison using .compareTo()

        5. Searching in String
        int index = str1.indexOf(int ch); -----> Searching using .indexOf()
        int index2 = str1.indexOf(String str); -----> Searching using .indexOf()
        int lastIndex = str1.lastIndexOf(int ch); -----> Searching using .indexOf()

        boolean contains = str1.contains(CharSequence s); -----> Searching using .contains()

        6. String Modification
        String replacedStr = str1.replace(char oldChar, char newChar); -----> Modifying String using .replace()
        String replacedStr2 = str1.replace(CharSequence target, CharSequence replacement); -----> Modifying String using .replace()

        String trimmedStr = str1.trim(); -----> Modifying String using .trim()

        String upperCaseStr = str1.toUpperCase(); -----> Modifying String using .toUpperCase()
        String lowerCaseStr = str1.toLowerCase(); -----> Modifying String using .toLowerCase()

        7. String to Array Conversion
        String[] words = str1.split(String regex); ----> Converting String to Array using .split()

        char[] charArray = str1.toCharArray(); ----> Converting String to Array using .toCharArray()

        8. Defining StringBuilder
        StringBuilder sb = new StringBuilder(); ----> Default constructor

        StringBuilder sb = new StringBuilder(int capacity); ----> Initial capacity

        StringBuilder sb = new StringBuilder(String str); ------> Initialize with a string

        */
        String str1 = "Hello, World!";
        String str2 = new String("Hello, World!");
        int length = str1.length();
        System.out.println(length);
        char ch = str1.charAt(0);
        System.out.println(ch);
        String substr = str1.substring(7);
        System.out.println(substr);
        String substr2 = str1.substring(0, 5);
        System.out.println(substr2);
        String str3 = str1 + " How are you?";
        System.out.println(str3);
        String str4 = str1.concat(" How are you?");
        System.out.println(str4);
        boolean isEqual = str1.equals(str2);
        System.out.println(isEqual);
        int comparison = str1.compareTo(str2);
        System.out.println(comparison);
        int index = str1.indexOf('W');
        System.out.println(index);
        int index2 = str1.indexOf("World");
        System.out.println(index2);
        int lastIndex = str1.lastIndexOf('o');
        System.out.println(lastIndex);
        boolean contains = str1.contains("World");
        System.out.println(contains);
        String replacedStr = str1.replace('H', 'h');
        System.out.println(replacedStr);
        String replacedStr2 = str1.replace("World", "Java");
        System.out.println(replacedStr2);
        String strWithSpaces = "   Hello, World!   ";
        System.out.println(strWithSpaces);
        String trimmedStr = strWithSpaces.trim();
        System.out.println(trimmedStr);
        String upperCaseStr = str1.toUpperCase();
        System.out.println(upperCaseStr);
        String lowerCaseStr = str1.toLowerCase();
        System.out.println(lowerCaseStr);
        String[] words = str1.split(" ");
        System.out.println(words);
        char[] charArray = str1.toCharArray();
        System.out.println(charArray);
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        sb.append(", World!");
        System.out.println(sb);
        sb.insert(5, " Java");
        System.out.println(sb);
        sb.delete(5, 10);
        System.out.println(sb);
        String finalStr = sb.toString();
        System.out.println(finalStr);
    }
}
