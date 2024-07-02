import java.util.Arrays;
import java.util.Scanner;

public class OneDArrayQuestions {
    public static void main(String[] args) {

//        Create an array of size 5 and initialize it with the values {1, 2, 3, 4, 5}. Print the elements.
        int[] arr1;
        arr1 = new int[5];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;
        arr1[4] = 5;
        System.out.println(Arrays.toString(arr1));

//        Take 5 integer inputs from the user and store them in an array. Print the array elements.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 integers to store it in Array : ");
        int[] arr2 = new int[5];
        for (int i = 0; i < 5; i++) {
            arr2[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr2));

//        Create an array and print its length.
        System.out.println("Enter the size of Array you want : ");
        int size = input.nextInt();
        System.out.println(size);
        System.out.println("Enter the elements of Array : ");
        int[] arr3 = new int[size];
        for (int i = 0; i < size; i++) {
            arr3[i] = input.nextInt();
        }
        System.out.println(arr3.length);

//        Create an array of size 3 and initialize it with values {10, 20, 30}. Print the second element.
        int[] arr4 = {10,20,30};
        System.out.println(arr4[1]);

//        Create an array of size 4 and initialize it with values {5, 10, 15, 20}. Update the third element to 50 and print the array.
        int[] arr5 = {5,10,15,20};
        arr5[2] = 50;
        System.out.println(Arrays.toString(arr5));

//        Create an array of size 6 and initialize it with values {1, 2, 3, 4, 5, 6}. Use a loop to print each element.
        int[] arr6 = {1,2,3,4,5,6};
        for (int i = 0; i < arr6.length; i++) {
            System.out.println(arr6[i]);
        }

//        Create an array of size 4 and initialize it with values {2, 4, 6, 8}. Calculate and print the sum of all elements.
        int[] arr7 = {2,4,6,8};
        int sum = 0;
        for (int i = 0; i < arr7.length; i++) {
            sum = sum + arr7[i];
        }
        System.out.println(sum);

//        Create an array of size 3 and initialize it with values {9, 8, 7}. Create another array and copy the elements from the first array into it. Print the new array.
        int[] arr8 = {9,8,7};
        int[] copyOfArr8 = arr8.clone();
        System.out.println(Arrays.toString(copyOfArr8));
        System.out.println(Arrays.toString(arr8));

    }
}
