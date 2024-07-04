import java.util.Arrays;
import java.util.Scanner;

public class linearSearch2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter What to Search For : ");
        int elementToSearch = input.nextInt();
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.deepToString(arr));
        boolean isFound = linearSearch1(arr , elementToSearch);
        if(isFound){
            System.out.println("Element you are searching is there !!!");
        }
        else{
            System.out.println("Element you are searching is not there !!!");
        }
        int index = linearSearch2(arr , elementToSearch);
        System.out.println("Element you are searching for is at Index : " + index);
        int element = linearSearch3(arr , elementToSearch);
        System.out.println("Element you are searching for is : " + element);
    }

    //    Linear Search Algorithm -----> Returns True or False
    public static boolean linearSearch1(int[][] arr , int elementToSearch) {
        //        Check if the Array is Empty or Not
        if(arr.length == 0){
            return false;
        }
        //        Iterate through the Row and Column and Compare each element with elementToSearch
        else{
            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[row].length; col++) {
                    if(arr[row][col] == elementToSearch){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    //    Linear Search Algorithm -----> Returns Index
    public static int linearSearch2(int[][] arr , int elementToSearch) {
        //        Check if the Array is Empty or Not
        if(arr.length == 0){
            return -1;
        }
        //        Iterate through the Row and Column and Compare each element with elementToSearch
        else{
            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[row].length; col++) {
                    if(arr[row][col] == elementToSearch){
                        return col;
                    }
                }
            }
        }
        return -1;
    }

    //    Linear Search Algorithm -----> Returns Element
    public static int linearSearch3(int[][] arr , int elementToSearch) {
        //        Check if the Array is Empty or Not
        if(arr.length == 0){
            return -1;
        }
        //        Iterate through the Row and Column and Compare each element with elementToSearch
        else{
            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[row].length; col++) {
                    if(arr[row][col] == elementToSearch){
                        return arr[row][col];
                    }
                }
            }
        }
        return -1;
    }

}
