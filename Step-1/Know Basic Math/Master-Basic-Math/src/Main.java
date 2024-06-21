public class Main {
    public static void main(String[] args) {
        System.out.println("Count Digits :");
        countDigit(12345);
        System.out.println("Reverse Number :"); // IMP
        reverseNumber(12300);
        System.out.println("Check Palindrome :");
        checkPalindrome(404);
        System.out.println("Check Armstrong :"); // IMP
        checkArmstrong(153);
        System.out.println("Return Divisors :");
        returnDivisors(36);
        System.out.println("Check Prime :");
        checkPrime(17);
        System.out.println("Find GCD :");
        findGCD(50 , 10);
    }

//    Basic Math Questions :-

//    Problem : 1
//    Given a number N. Count the number of digits in N which evenly divide N.
    public static void countDigit(int n) {
        int number = n;
        int count = 0;
        while(number > 0){
            int digit = (number % 10);
            if((digit != 0) && (n % digit == 0)){
                count++;
            }
            number = (number / 10);
        }
        System.out.println("Total Digits that divides N evenly : " +  count);
    }

//    Problem : 2
//    Given an integer N return the reverse of the given number.
    public static void reverseNumber(int n) {
        int number = n;
        int reversedNumber = 0;
        while(number > 0){
            int digit = (number % 10);
            reversedNumber = (reversedNumber * 10) + digit;
            number = (number / 10);
        }
        System.out.println("Reverse of N : " + reversedNumber);
    }

//    Problem : 3
//    Given an integer N, return true if it is a palindrome else return false.
    public static void checkPalindrome(int n) {
        int orgNumber = n;
        int reversedNumber = 0;
        while (orgNumber > 0){
            int digit = (orgNumber % 10);
            reversedNumber = (reversedNumber * 10) + digit;
            orgNumber = (orgNumber / 10);
        }
        if(n == reversedNumber){
            System.out.println("Is it a Palindrome : Yes");
        }
        else{
            System.out.println("Is it a Palindrome : No");
        }
    }

//    Problem : 4
//    Given an integer N, return true it is an Armstrong number otherwise return false.
    public static void checkArmstrong(int n) {
        int number = n;
        int tD = String.valueOf(n).length();
        int sum = 0;
        while(number > 0){
            int digit = (number % 10);
//            sum += Math.pow(digit, tD); -----> Isme Kyu incompatible data types ka issue nhi hua ?
            sum = (int) (sum + Math.pow(digit , tD)); // ----> And isme hi kyu hua ?
            number = (number / 10);
        }
        if(sum == n){
            System.out.println("Is n Armstrong number : " + "Yes");
        }
        else{
            System.out.println("Is n Armstrong number : " + "No");
        }
    }

//    Problem : 5
//    Given an integer N, return all divisors of N.
    public static void returnDivisors(int n) {
        int number = n;
        System.out.println("Divisors of n :");
        for (int i = 1; i <= n; i++) {
            if(number % i == 0){
                System.out.println(i);
            }
        }
    }

//    Problem : 6
//    Given an integer N, check whether it is prime or not.
    public static void checkPrime(int n) {

    }

//    Problem : 7
//    Given two integers N1 and N2, find their greatest common divisor.
    public static void findGCD(int n1 , int n2) {

    }

}