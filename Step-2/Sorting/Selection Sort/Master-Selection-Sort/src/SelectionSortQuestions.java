import java.util.Arrays;

public class SelectionSortQuestions {
    public static void main(String[] args) {
        int[] arr1 = {5,2,9,1,5,6};
        int answer1 = Question1(arr1);
        System.out.println("Answer 1 : " + answer1);
        int[] arr2 = {8,3,2,7,4,6,5};
        Question2(arr2);
        System.out.println("Answer 2 : " + Arrays.toString(arr2));
        int [] arr3 = {1,4,3,2};
        Question3(arr3);
        System.out.println("Answer 3 : " + arr3[1]);
        int[] arr4 = {10,5,2,7,1,9};
        Question4(arr4);
        System.out.println("Answer 4 : " + Arrays.toString(arr4));
        int[] arr5 = {12,11,15,10,14,13};
        Question5(arr5);
        System.out.println("Answer 5 : " + Arrays.toString(arr5));
        int[] arr6 = {5,4,3,2,1};
        int answer6 = Question6(arr6);
        System.out.println("Answer 6 : " + answer6);
        int[] arr8 = {2,8,5,3,9};
        Question8(arr8);
        reverseArr8(arr8);
        System.out.println("Answer 8 : " + Arrays.toString(arr8));
        int[] arr9 = {7,6,5,4,3,2,1};
        Question9(arr9);
        int n9 = arr9.length;
        System.out.println("Answer 9 : " + arr9[n9-3]);
        int[] arr10 = {9,8,7,6,5};
        Question10(arr10);
        int n10 = arr10.length;
        int median = (n10-1)/2;
        System.out.println("Answer 10 : " + Arrays.toString(arr10) + " , " +  arr10[median]);
    }

//    Given an array [5, 2, 9, 1, 5, 6], find the smallest element using the logic of Selection Sort. ----> Output : 1
    public static int Question1(int[] arr1) {
        int minIndex = 0;
        int n = arr1.length;
        for (int i = 1; i < n; i++) {
            if(arr1[i] < arr1[minIndex]){
                minIndex = i;
            }
        }
        return arr1[minIndex];
    }

//    Sort only the first half of the array [8, 3, 2, 7, 4, 6, 5] using Selection Sort. ----> Output : [2, 3, 8, 7, 4, 6, 5]
    // Method to Find Minimum Element Index.
    public static int minIndex2(int[] arr , int currentValueOf_i , int midPoint) {
        int minIndex = currentValueOf_i;
        for (int i = currentValueOf_i + 1; i < midPoint; i++) {
            if(arr[i] < arr[minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
    }
    // Method to Swap Elements.
    public static void swapElements2(int[] arr , int currentValueOf_i , int minIndex) {
        int temp = arr[currentValueOf_i];
        arr[currentValueOf_i] = arr[minIndex];
        arr[minIndex] = temp;
    }
    public static void Question2(int[] arr2) {
        int n = arr2.length;
        int midpoint = n/2;
        for (int i = 0; i < midpoint; i++) {
            int minIndex = minIndex2(arr2 , i , midpoint);
            if(minIndex != i){
                swapElements2(arr2 , i , minIndex);
            }
        }
    }

//    Find the second-smallest element in the array [1, 4, 3, 2] using the logic of Selection Sort. ----> Output : 2
    // Method to Find Minimum Element Index.
    public static int minIndex3(int[] arr, int currentValueOf_i) {
        int minIndex = currentValueOf_i;
        for (int i = currentValueOf_i + 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
    // Method to Swap Elements.
    public static void swapElements3(int[] arr , int currentValueOf_i , int minIndex) {
        int temp = arr[currentValueOf_i];
        arr[currentValueOf_i] = arr[minIndex];
        arr[minIndex] = temp;
    }
    public static void Question3(int[] arr3) {
        int n = arr3.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = minIndex3(arr3 , i);
            if(minIndex != i){
                swapElements3(arr3 , i , minIndex);
            }
        }
    }

//    Sort the array [10, 5, 2, 7, 1, 9] in descending order using Selection Sort. ----> Output : [10, 9, 7, 5, 2, 1]
    // Method to Find Maximum Element Index.
    public static int maximumIndex4(int[] arr , int currentValueOf_i) {
        int maxIndex = currentValueOf_i;
        for (int i = currentValueOf_i + 1; i < arr.length; i++) {
            if(arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    // Method to Swap Elements.
    public static void swapElements4(int[] arr , int currentValueOf_i , int maxIndex) {
        int temp = arr[currentValueOf_i];
        arr[currentValueOf_i] = arr[maxIndex];
        arr[maxIndex] = temp;
    }
    public static void Question4(int[] arr4) {
        int n = arr4.length;
        for (int i = 0; i < n-1; i++) {
            int maxIndex = maximumIndex4(arr4 , i);
            if(maxIndex != i){
                swapElements4(arr4 , i , maxIndex);
            }
        }
    }

//    Sort only the even numbers in the array [12, 11, 15, 10, 14, 13] using Selection Sort. ----> Output : [10, 11, 15, 12, 14, 13]
    //        Method to Find Minimum Element Index.
    public static int minIndex5(int[] arr , int currentValueOf_i) {
        int minIndex = currentValueOf_i;
        for (int i = currentValueOf_i + 1; i < arr.length; i++) {
            if(arr[i] % 2 == 0 && arr[i] < arr[minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
    }
    //        Method to Swap Elements.
    public static void swapElements5(int[] arr , int currentValueOf_i , int minIndex) {
        if(arr[minIndex] % 2 == 0){
            int temp = arr[currentValueOf_i];
            arr[currentValueOf_i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    public static void Question5(int[] arr5) {
        int n = arr5.length;
        for (int i = 0; i < n-1; i++) {
            if(arr5[i] % 2 == 0){
                int minIndex = minIndex5(arr5 , i);
                if(minIndex != i && arr5[i] % 2 == 0){
                    swapElements5(arr5 , i , minIndex);
                }
            }
        }
    }

//    Given an array [5, 4, 3, 2, 1], find the maximum element using the logic of Selection Sort. ----> Output : 5
    public static int Question6(int[] arr6) {
        int maxIndex = 0;
        int n = arr6.length;
        for (int i = 1; i < n; i++) {
            if(arr6[i] > arr6[maxIndex]){
                maxIndex = i;
            }
        }
        return arr6[maxIndex];
    }


//    Sort the array [2, 8, 5, 3, 9] using Selection Sort and then reverse the sorted array. ----> Output : [9, 8, 5, 3, 2]
    //        Method to Find the Minimum Element Index.
    public static int minIndex8(int[] arr , int currentValueOf_i) {
        int minIndex = currentValueOf_i;
        for (int i = currentValueOf_i + 1; i < arr.length; i++) {
            if(arr[i] < arr[minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
    }
    //        Method to Swap Elements.
    public static void swapElements8(int[] arr , int currentValueOf_i , int minIndex) {
        int temp = arr[currentValueOf_i];
        arr[currentValueOf_i] = arr[minIndex];
        arr[minIndex] = temp;
    }
    public static void Question8(int[] arr8) {
        int n = arr8.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = minIndex8(arr8 , i);
            if(minIndex != i){
                swapElements8(arr8 , i , minIndex);
            }
        }
    }
    public static void reverseArr8(int[] arr8) {
        int n = arr8.length;
        int midpoint = n/2;
        for (int i = 0; i < midpoint; i++) {
            int temp = arr8[i];
            arr8[i] = arr8[n-i-1];
            arr8[n-i-1] = temp;
        }
    }

//    Find the third-largest element in the array [7, 6, 5, 4, 3, 2, 1] using the logic of Selection Sort. ----> Output : 5
    //        Method to Find the Minimum Element Index.
    public static int minIndex9(int[] arr , int currentValueOf_i) {
        int minIndex = currentValueOf_i;
        for (int i = currentValueOf_i + 1; i < arr.length; i++) {
            if(arr[i] < arr[minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static void swapElements9(int[] arr , int currentValueOf_i , int minIndex) {
        int temp = arr[currentValueOf_i];
        arr[currentValueOf_i] = arr[minIndex];
        arr[minIndex] = temp;
    }
    //                Method to Swap the Elements.
    public static void Question9(int[] arr9) {
        int n = arr9.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = minIndex9(arr9 , i);
            if(minIndex != i){
                swapElements9(arr9 , i , minIndex);
            }
        }
    }

//    Sort the array [9, 8, 7, 6, 5] using Selection Sort and then find the median of the sorted array. ----> Output : [5, 6, 7, 8, 9] and 7
    // Method to Find the Minimum Element Index.
    public static int minIndex10(int[] arr , int currentValueOf_i) {
        int minIndex = currentValueOf_i;
        for (int i = currentValueOf_i + 1; i < arr.length; i++) {
            if(arr[i] < arr[minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static void swapElements10(int[] arr , int currentValueOf_i , int minIndex) {
        int temp = arr[currentValueOf_i];
        arr[currentValueOf_i] = arr[minIndex];
        arr[minIndex] = temp;
    }
    // Method to Swap the Elements.
    public static void Question10(int[] arr10) {
        int n = arr10.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = minIndex10(arr10 , i);
            if(minIndex != i){
                swapElements10(arr10 , i , minIndex);
            }
        }
    }

}
