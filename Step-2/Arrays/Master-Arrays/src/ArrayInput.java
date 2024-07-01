import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 233;
        arr[3] = 543;
        arr[4] = 3;
        System.out.println(arr[3]);
        //        Input using for Loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        //        Output using for Loop
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //        Output using for-each Loop
        for(int num : arr){ // For every element in Array , Print the element
            System.out.print(num + " "); // Here num represents element of the Array
        }
        System.out.println();
        //        Output using toString() Method
        System.out.println(Arrays.toString(arr));
        //        Index out of Bound Error
        //        System.out.println(arr[5]);
        //        Array of Objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));
        //        Modifying Array
        str[1] = "Sahil";
        System.out.println(Arrays.toString(str));
    }
}
