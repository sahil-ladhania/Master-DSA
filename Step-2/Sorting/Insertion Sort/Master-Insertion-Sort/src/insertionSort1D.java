import java.util.Arrays;

public class insertionSort1D {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println("Unsorted Array : " + Arrays.toString(arr));
        insertionSort1(arr);
        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }

    //    Method to Swap Elements
    public static void swapElements(int[] arr , int first , int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    //    Insertion Sort Algorithm
    public static void insertionSort1(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    swapElements(arr , j , j-1);
                }
                else{
                    break;
                }
            }
        }
    }

}
