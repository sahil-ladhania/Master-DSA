import java.util.Arrays;

public class ArraysRotationBy1 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        rightRotationBy1(arr1);
        System.out.println("Array Right Rotation By 1 : " + Arrays.toString(arr1));
        int[] arr2 = {1,2,3,4,5};
        leftRotationBy1(arr2);
        System.out.println("Array Left Rotation By 1 : " + Arrays.toString(arr2));
    }

    // Algorithm for Array Right Rotation by 1
    public static void rightRotationBy1(int[] arr) {
        int N = arr.length;
        int lastElement = arr[N-1];
        for (int i = N-1; i > 0 ; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = lastElement;
    }

    // Algorithm for Array Left Rotation by 1
    public static void leftRotationBy1(int[] arr) {
        int N = arr.length;
        int firstElement = arr[0];
        for (int i = 1; i < N; i++) {
            arr[i-1] = arr[i];
        }
        arr[N-1] = firstElement;
    }

}
