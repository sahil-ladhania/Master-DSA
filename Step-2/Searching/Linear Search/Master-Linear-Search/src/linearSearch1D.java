import java.util.Scanner;

public class linearSearch1D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter What to Search For : ");
        int elementToSearch = input.nextInt();
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        boolean isFound = linearSearch1(arr , elementToSearch);
        if (isFound){
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
    public static boolean linearSearch1(int[] arr , int elementToSearch) {
        //        Check if the Array is Empty or Not
        if(arr.length == 0){
            System.out.println("Empty Array !!!");
            return false;
        }
        //        Iterate through the Array and Compare each element with elementToSearch
        else{
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == elementToSearch){
                    return true;
                }
            }
        }
        return false;
    }

    //    Linear Search Algorithm -----> Returns Index
    public static int linearSearch2(int[] arr , int elementToSearch) {
        //        Check if the Array is Empty or Not
        if(arr.length == 0){
            System.out.println("Empty Array !!!");
            return -1;
        }
        //        Iterate through the Array and Compare each element with elementToSearch
        else{
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == elementToSearch){
                    return i;
                }
            }
        }
        return -1;
    }

    //    Linear Search Algorithm -----> Returns Element
    public static int linearSearch3(int[] arr , int elementToSearch) {
        //        Check if the Array is Empty or Not
        if(arr.length == 0){
            System.out.println("Empty Array !!!");
            return -1;
        }
        //        Iterate through the Array and Compare each element with elementToSearch
        else{
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == elementToSearch){
                    return arr[i];
                }
            }
        }
        return -1;
    }

}
