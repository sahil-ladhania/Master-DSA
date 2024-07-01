import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        /*

            1. How to Define an 1D Array ?
            dataType[] arrayName;

            2. How to Initialize an 1D Array ?
            arrayName = new dataType[size];

            3. How to Assign Values to an 1D Array ?
            arrayName[index] = value;

            4. How to Access elements from 1D Array ?
            dataType element = arrayName[index];

            5. How to Iterate through 1D Array ?
            Use a for Loop or forEach Loop to Iterate.
            for Loop -
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            };
            forEach Loop -
            for (int number : numbers) {
                System.out.println(number);
            };

            6. How to Define an 2D Array ?
            dataType[][] arrayName;

            7. How to Initialize an 2D Array ?
            arrayName = new dataType[rows][columns];

            8. How to Assign Values to an 2D Array ?
            arrayName[rowIndex][colIndex] = value;

            9. How to Access elements from 1D Array ?
            dataType element = arrayName[rowIndex][colIndex];

            10. How to Iterate through 2D Array ?
            Use Nested for Loop or forEach Loop to Iterate.
            Nested for Loop -
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.println(matrix[i][j]);
                }
            };
            Nested forEach Loop -
            for (int[] row : matrix) {
                for (int value : row) {
                    System.out.println(value);
                }
            };

         */
        Scanner input = new Scanner(System.in);
        int[] numbers;
        numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        int firstNumber = numbers[0];
        System.out.println(firstNumber);
        int[][] matrix;
        matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[1][1] = 5;
        int value = matrix[1][1];
        System.out.println(value);
    }
}
