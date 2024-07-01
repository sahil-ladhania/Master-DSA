import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
            1 2 3
            4 5 6
            7 8 9
        */
        //        Syntax of M-D Arrays
        //        int[][] arr = new int[No of Row][No of Columns]; ---> Two Brackets for 2-D Arrays and not imp to specify No of Columns
        int[][] arr2D = {
                {1 , 2 , 3},
                {4 , 5},
                {6 , 7 , 8 , 9}
        };
        int[][] arr = new int[3][3];
        System.out.println(arr2D.length); // This will print No of Rows in M-D Arrays
        //        Input using for Loop
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
        }
        //        Output using for Loop
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        //        Output using for-each Loop
        for (int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
        //        Output using toString Method
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
