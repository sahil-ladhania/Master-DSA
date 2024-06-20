public class Main {
    public static void main(String[] args) {
        System.out.println("Pattern : 1");
        pattern1(5);
        System.out.println();
        System.out.println("Pattern : 2");
        pattern2(5);
        System.out.println();
        System.out.println("Pattern : 3");
        pattern3(5);
        System.out.println();
        System.out.println("Pattern : 4");
        pattern4(5);
        System.out.println();
        System.out.println("Pattern : 5"); // IMP
        pattern5(9);
        System.out.println();
        System.out.println("Pattern : 6"); // IMP
        pattern6(5);
        System.out.println();
        System.out.println("Pattern : 7"); // IMP
        pattern7(5);
        System.out.println();
        System.out.println("Pattern : 8"); // IMP
        pattern8(5);
        System.out.println();
        System.out.println("Pattern : 9"); // IMP
        pattern9(5);
        System.out.println();
        System.out.println("Pattern : 10");
        pattern10(5);
        System.out.println();
        System.out.println("Pattern : 11");
        pattern11(5);
        System.out.println();
        System.out.println("Pattern : 12"); // IMP
        pattern12(5);
        System.out.println();
        System.out.println("Pattern : 13");
        pattern13(5);
        System.out.println();
        System.out.println("Pattern : 14"); // IMP
        pattern14(5);
        System.out.println();
        System.out.println("Pattern : 15");
        pattern15(5);
        System.out.println();
        System.out.println("Pattern : 16"); // IMP
        pattern16(5);
        System.out.println();
        System.out.println("Pattern : 17"); // IMP
        pattern17(6);
        System.out.println();
        System.out.println("Pattern : 18"); // IMP
        pattern18(6);
        System.out.println();
        System.out.println("Pattern : 19"); // IMP
        pattern19(6);
        System.out.println();
        System.out.println("Pattern : 20"); // IMP
        pattern20(6);
        System.out.println();
        System.out.println("Pattern : 21"); // IMP
        pattern21(6);
        System.out.println();
        System.out.println("Pattern : 22"); // IMP
        pattern22(6);
        System.out.println();
        System.out.println("Pattern : 23"); // IMP
        pattern23(6);
        System.out.println();
        System.out.println("Pattern : 24"); // IMP
        pattern24(6);
        System.out.println();

    }

//    Pattern : 1
//    * * * * *
//    * * * * *
//    * * * * *
//    * * * * *
//    * * * * *
    public static void pattern1(int n){ // n - No of Rows
//        No of Rows = No of times outer loop will run
        for (int row = 0; row < n ; row++) {
//            No of rows = No of Columns in each row(Curating Formula)
            for (int col = 0; col < n; col++) {
//                Print *
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//    Pattern : 2
//    *
//    * *
//    * * *
//    * * * *
//    * * * * *
    public static void pattern2(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < (row + 1); col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//    Pattern : 3
//    * * * * * 
//    * * * * 
//    * * * 
//    * * 
//    * 
    public static void pattern3(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < (n-row); col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//    Pattern : 4
//    1
//    1 2
//    1 2 3
//    1 2 3 4
//    1 2 3 4 5
    public static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

//    Pattern : 5
//    *
//    * *
//    * * *
//    * * * *
//    * * * * *
//    * * * *
//    * * *
//    * *
//    *
    public static void pattern5(int n){
        int mD = (n + 1) / 2;
        for (int row = 0; row < mD; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = mD - 1; row > 0; row--) {
            for (int col = 0; col < row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//    Pattern : 6
//         *
//        **
//       ***
//      ****
//     *****
    public static void pattern6(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if(col < (n - row - 1)){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

//    Pattern : 7
//     *****
//      ****
//       ***
//        **
//         *
    public static void pattern7(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if(col < row){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

//    Pattern : 8
//        *
//       ***
//      *****
//     *******
//    *********
    public static void pattern8(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < (2 * n -1); col++) {
                if(col < (n - row - 1)){
                    System.out.print(" ");
                }
                else if(col < (n + row)){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

//    Pattern : 9
//    *********
//     *******
//      *****
//       ***
//        *
    public static void pattern9(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < (2 * n - 1); col++) {
                if(col < row){
                    System.out.print(" ");
                }
                else if(col < (2 * n - row - 1)){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

//    Pattern : 10
//    1
//    22
//    333
//    4444
//    55555
    public static void pattern10(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }

//    Pattern : 11
//    12345
//    1234
//    123
//    12
//    1
    public static void pattern11(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= (n + 1 - row); col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

//    Pattern : 12
//    1
//    0 1
//    1 0 1
//    0 1 0 1
//    1 0 1 0 1
    public static void pattern12(int n) {
        int start = 1; // Can start with either 1 / 0 -> Pattern will be different for both case
        for (int row = 0; row < n; row++) {
//          For odd row no -> Starts with 1
            if(row % 2 == 0){
                start = 1;
            }
//          For even row no -> Starts with 0
            else{
                start = 0;
            }
            for (int col = 0; col < (row + 1); col++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

//    Pattern : 13
//    1
//    2 3
//    4 5 6
//    7 8 9 10
//    11 12 13 14 15
    public static void pattern13(int n) {
        int currentNumber = 1;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < (row + 1); col++) {
                System.out.print(currentNumber++ + " ");
            }
            System.out.println();
        }
    }

//  Pattern : 14
//  A
//  AB
//  АВС
//  ABCD
//  ABCDE
    public static void pattern14(int n) {
        for (int row = 0; row < n; row++) {
            char A = 65;
            for (int col = 0; col < (row + 1); col++) {
                System.out.print(A++);
            }
            System.out.println();
        }
    }

//    Pattern : 15
//    ABCDE
//    ABCD
//    ABC
//    AB
//    A
    public static void pattern15(int n) {
        for (int row = 0; row < n; row++) {
            char A = 65;
            for (int col = 0; col < (n - row); col++) {
                System.out.print(A++);
            }
            System.out.println();
        }
    }

//    Pattern : 16
//    A
//    BB
//    CCC
//    DDDD
//    EEEEE
    public static void pattern16(int n) {
        for (int row = 0; row < n; row++) {
            char ch = (char) ('A' + row);
            for (int col = 0; col < (row + 1); col++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

//    Pattern : 17
//    1      1
//    12    21
//    123  321
//    12344321
    public static void pattern17(int n) {

    }

//    Pattern : 18
//          A
//         ABA
//        ABCBA
//       ABCDDCBA
    public static void pattern18(int n) {

    }

//    Pattern : 19
//    E
//    DE
//    CDE
//    BCDE
//    ABCDE
    public static void pattern19(int n) {

    }

//    Pattern : 20
//    ******
//    *    *
//    *    *
//    *    *
//    *    *
//    ******
    public static void pattern20(int n) {

    }

//    Pattern : 21
//    4 4 4 4 4 4 4
//    4 3 3 3 3 3 4
//    4 3 2 2 2 3 4
//    4 3 2 1 2 3 4
//    4 3 2 2 2 3 4
//    4 3 3 3 3 3 4
//    4 4 4 4 4 4 4
    public static void pattern21(int n) {

    }

//    Pattern : 22
//    *          *
//    **        **
//    ***      ***
//    ****    ****
//    *****  *****
//    ************
//    *****  *****
//    ****    ****
//    ***      ***
//    **        **
//    *          *
    public static void pattern22(int n) {

    }

//    Pattern : 23
//    ************
//    *****  *****
//    ****    ****
//    ***      ***
//    **        **
//    *          *
//    *          *
//    **        **
//    ***      ***
//    ****    ****
//    *****  *****
//    ************
    public static void pattern23(int n) {

    }

//    Pattern : 24
//         *
//        ***
//       *****
//      *******
//     *********
//    ***********
//    ***********
//     *********
//      *******
//       *****
//        ***
//         *
    public static void pattern24(int n) {

    }

}