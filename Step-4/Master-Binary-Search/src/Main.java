public class Main {
    public static void main(String[] args) {
        System.out.println("Master Binary Search !!!");
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {10,9,8,7,6,5,4,3,2,1};
        int[][] arr3 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] arr4 = {
                {9,8,7},
                {6,5,4},
                {3,2,1}
        };
        int target = 4;
        int binarySearchAsc1D = binarySearchAsc1D(arr1 , target);
        int binarySearchDec1D = binarySearchDesc1D(arr2 , target);
        int binarySearchOrderAgnostic1D = binarySearchOrderAgnostic1D(arr2 , target);
        System.out.println("Answer of binarySearchAsc1D : " + binarySearchAsc1D);
        System.out.println("Answer of binarySearchDesc1D : " + binarySearchDec1D);
        System.out.println("Answer of binarySearchOrderAgnostic1D : " + binarySearchOrderAgnostic1D);
        int binarySearchAsc2D = binarySearchAsc2D(arr3 , target);
        int binarySearchDec2D = binarySearchDesc2D(arr4 , target);
        int binarySearchOrderAgnostic2D = binarySearchOrderAgnostic2D(arr4 , target);
        System.out.println("Answer of binarySearchAsc2D : " + binarySearchAsc2D);
        System.out.println("Answer of binarySearchDesc2D : " + binarySearchDec2D);
        System.out.println("Answer of binarySearchOrderAgnostic2D : " + binarySearchOrderAgnostic2D);
    }

    // BS on 1D Arrays :-

    // For 1D Arrays Sorted in Ascending Order
    public static int binarySearchAsc1D(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    // For 1D Arrays Sorted in Descending Order
    public static int binarySearchDesc1D(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    // For Order Agnostic 1D Arrays
    public static int binarySearchOrderAgnostic1D(int[] arr , int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    // BS on 2D Arrays :-

    // For 2D Arrays Sorted in Ascending Order
    public static int binarySearchAsc2D(int[][] arr , int target) {
        return 1;
    }

    // For 2D Arrays Sorted in Descending Order
    public static int binarySearchDesc2D(int[][] arr , int target) {
        return 1;
    }

    // For Order Agnostic 2D Arrays
    public static int binarySearchOrderAgnostic2D(int[][] arr , int target) {
        return 1;
    }
}