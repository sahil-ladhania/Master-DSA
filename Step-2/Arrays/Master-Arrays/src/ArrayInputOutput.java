import java.util.Arrays;
import java.util.Scanner;

public class ArrayInputOutput {
    public static void main(String[] args) {
        /*
            1. How to take 1D Array as User Input ?
            2. How to give output using for Loop , for each Loop and toString Method ?
            3. How to take 2D Array as User Input ?
            4. How to give output using for Loop , for each Loop and toString Method ?
        */

        //        1. How to take 1D Array as User Input ?
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = input.nextInt();
        int[] arr =  new int[size];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        };

        //        2. How to give output using for Loop , for each Loop and toString Method ?
        //        Using for Loop
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        };
        System.out.println();
        //        Using for-each Loop
        for(int element : arr){
            System.out.print(element + " ");
        };
        System.out.println();
        //        Using toString Method
        System.out.println(Arrays.toString(arr));

        //        3. How to take 2D Array as User Input ?
        System.out.println("Enter number of rows : ");
        int rows = input.nextInt();
        System.out.println("Enter number of columns : ");
        int cols = input.nextInt();
        int[][] arr2 = new int[rows][cols];
        System.out.println("Enter elements of the array : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr2[i][j] = input.nextInt();
            }
        };
        input.close();

        //        4. How to give output using for Loop , for each Loop and toString Method ?
        //        Using for Loop
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
