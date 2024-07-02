import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayQuestions {
    public static void main(String[] args) {

//        Create a 2D array of size 2x2 and initialize it with values {{1, 2}, {3, 4}}. Print the 2D array.
        int[][] matrix1 = new int[2][2];
        matrix1[0][0] = 1;
        matrix1[0][1] = 2;
        matrix1[1][0] = 3;
        matrix1[1][1] = 4;
        System.out.println(Arrays.deepToString(matrix1));
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

//        Take 4 integer inputs from the user and store them in a 2x2 array. Print the 2D array elements.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter No of Rows : ");
        int rows = input.nextInt();
        System.out.println("Enter No of Columns : ");
        int cols = input.nextInt();
        int[][] matrix2 = new int[rows][cols];
        System.out.println("Enter elements of Matrix2 :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

//        Create a 2D array and print the number of rows and columns.
        int[][] matrix3 = new int[3][2];
        matrix3[0][0] = 1;
        matrix3[0][1] = 2;
        matrix3[1][0] = 3;
        matrix3[1][1] = 4;
        matrix3[2][0] = 5;
        matrix3[2][1] = 6;
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[i].length; j++) {
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("No of Rows : " + matrix3.length);
        System.out.println("No of Columns : " + matrix3[0].length);

//        Create a 2D array of size 3x3 and initialize it with values {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}. Print the element at row 2, column 3.
        int[][] matrix4 = new int[3][3];
        matrix4[0][0] = 1;
        matrix4[0][1] = 2;
        matrix4[0][2] = 3;
        matrix4[1][0] = 4;
        matrix4[1][1] = 5;
        matrix4[1][2] = 6;
        matrix4[2][0] = 7;
        matrix4[2][1] = 8;
        matrix4[2][2] = 9;
        System.out.println(matrix4[1][2]);

//        Create a 2D array of size 2x3 and initialize it with values {{1, 2, 3}, {4, 5, 6}}. Update the element at row 1, column 2 to 9 and print the 2D array.
        int[][] matrix5 = new int[2][3];
        matrix5[0][0] = 1;
        matrix5[0][1] = 2;
        matrix5[0][2] = 3;
        matrix5[1][0] = 4;
        matrix5[1][1] = 5;
        matrix5[1][2] = 6;
        System.out.println(Arrays.deepToString(matrix5));
        matrix5[0][1] = 9;
        System.out.println(Arrays.deepToString(matrix5));

//        Create a 2D array of size 2x2 and initialize it with values {{1, 2}, {3, 4}}. Use a loop to print each element.
        int[][] matrix6 = new int[2][2];
        matrix6[0][0] = 1;
        matrix6[0][1] = 2;
        matrix6[1][0] = 3;
        matrix6[1][1] = 4;
        for (int i = 0; i < matrix6.length; i++) {
            for (int j = 0; j < matrix6[i].length; j++) {
                System.out.println(matrix6[i][j]);
            }
        }

//        Create a 2D array of size 2x2 and initialize it with values {{2, 4}, {6, 8}}. Calculate and print the sum of all elements.
        int[][] matrix7 = new int[2][2];
        matrix7[0][0] = 2;
        matrix7[0][1] = 4;
        matrix7[1][0] = 6;
        matrix7[1][1] = 8;
        int sum = 0;
        for (int i = 0; i < matrix7.length; i++) {
            for (int j = 0; j < matrix7[i].length; j++) {
                sum = matrix7[i][j] + sum;
            }
        }
        System.out.println(sum);

//        Create a 2D array of size 2x2 and initialize it with values {{9, 8}, {7, 6}}. Create another 2D array and copy the elements from the first array into it. Print the new 2D array.
        int[][] matrix8 = new int[2][2];
        matrix8[0][0] = 9;
        matrix8[0][1] = 8;
        matrix8[1][0] = 7;
        matrix8[1][1] = 6;
        System.out.println(Arrays.deepToString(matrix8));
        int[][] copyOfMatrix8 = matrix8.clone();
        System.out.println(Arrays.deepToString(copyOfMatrix8));

    }
}
