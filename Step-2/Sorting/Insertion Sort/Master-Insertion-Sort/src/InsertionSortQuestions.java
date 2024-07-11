import java.util.Arrays;

public class InsertionSortQuestions {
    public static void main(String[] args) {
        int[] arr1 = {3,1,2,5,4};
        Question1(arr1);
        System.out.println("Answer 1 : " + Arrays.toString(arr1));
        int[] arr2 = {8,4,1,3,7,6,5};
        Question2(arr2);
        System.out.println("Answer 2 : " + Arrays.toString(arr2));
        int[] arr3 = {5,6,2,4,1,3};
        Question3(arr3);
        System.out.println("Answer 3 : " + Arrays.toString(arr3) + " , " + arr3[1]);
        int[] arr4 = {9,7,5,8,6};
        Question4(arr4);
        System.out.println("Answer 4 : " + Arrays.toString(arr4));
        int[] arr5 = {12,11,13,5,6};
        Question5(arr5);
        int n5 = arr5.length;
        System.out.println("Answer 5 : " + Arrays.toString(arr5) + " , " + arr5[n5-3]);
        int[] arr7 = {10,9,8,7,6};
        Question7(arr7);
        int n7 = arr7.length;
        System.out.println("Answer 7 : " + Arrays.toString(arr7) + " , " + arr7[n7-1]);
        int[] arr9 = {1,3,5,2,4,7};
        int answer9 = Question9(arr9);
        System.out.println("Answer 9 : " + Arrays.toString(arr9) + " , " + answer9);
        int[] arr10 = {7,2,4,1,5,3};
        Question10(arr10);
        System.out.println("Answer 10 : " + Arrays.toString(arr10));
    }

//    Sort the array [3, 1, 2, 5, 4] using Insertion Sort and find the minimum element. -----> Output : [1,2,3,4,5] and 1
    //    Method to Swap Elements.
    public static void swapElements1(int[] arr , int first , int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void Question1(int[] arr1) {
        int n = arr1.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if(arr1[j] < arr1[j-1]){
                    swapElements1(arr1 , j , j-1);
                }
                else{
                    break;
                }
            }
        }
    }

//    Sort only the first half of the array [8, 4, 1, 3, 7, 6, 5] using Insertion Sort. ----> Output : [1, 3, 4, 8, 7, 6, 5]
    //    Method to Swap Elements.
    public static void swapElements2(int[] arr , int first , int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void Question2(int[] arr2) {
        int n = arr2.length;
        int midpoint = n / 2;
        for (int i = 1; i <= midpoint; i++) {
            for (int j = i; j > 0; j--) {
                if(arr2[j] < arr2[j-1]){
                    swapElements2(arr2 , j , j-1);
                }
                else{
                    break;
                }
            }
        }
    }

//    Sort the array [5, 6, 2, 4, 1, 3] using Insertion Sort and find the second-smallest element. ----> Output : [1, 2, 3, 4, 5, 6] and 2
    //    Method to Swap Elements.
    public static void swapElements3(int[] arr , int first , int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void Question3(int[] arr3) {
        int n = arr3.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if(arr3[j] < arr3[j-1]){
                    swapElements3(arr3 , j , j-1);
                }
                else{
                    break;
                }
            }
        }
    }

//    Sort the array [9, 7, 5, 8, 6] in descending order using Insertion Sort. -----> Output : [9, 8, 7, 6, 5]
    //    Method to Swap Elements.
    public static void swapElements4(int[] arr , int first , int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void Question4(int[] arr4) {
        int n = arr4.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if(arr4[j] > arr4[j-1]){
                    swapElements4(arr4 , j , j-1);
                }
                else{
                    break;
                }
            }
        }
    }

//    Use the logic of Insertion Sort to find the third-largest element in the array [12, 11, 13, 5, 6]. ----> Output : 11
    //    Method to Swap Elements.
    public static void swapElements5(int[] arr , int first , int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void Question5(int[] arr5) {
        int n = arr5.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if(arr5[j] < arr5[j-1]){
                    swapElements5(arr5 , j , j-1);
                }
                else{
                    break;
                }
            }
        }
    }

//    Sort the array [10, 9, 8, 7, 6] using Insertion Sort and find the maximum element. -----> Output : [6, 7, 8, 9, 10] and 10
    //    Method to Swap Elements.
    public static void swapElements7(int[] arr , int first , int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void Question7(int[] arr7) {
        int n = arr7.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if(arr7[j] < arr7[j-1]){
                    swapElements7(arr7 , j , j-1);
                }
                else{
                    break;
                }
            }
        }
    }

//    Sort the array [1, 3, 5, 2, 4, 6] using Insertion Sort and find the sum of the sorted array. ----> Output : [1, 2, 3, 4, 5, 6] and 21
    //    Method to Swap Elements.
    public static void swapElements9(int[] arr , int first , int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static int Question9(int[] arr9) {
        int n = arr9.length;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if(arr9[j] < arr9[j-1]){
                    swapElements9(arr9 , j , j-1);
                }
                else{
                    break;
                }
            }
        }
        for(int element : arr9){
            sum = element + sum;
        }
        return sum;
    }

//    Sort the array [7, 2, 4, 1, 5, 3] using Insertion Sort and find the median of the sorted array. -----> Output : [1, 2, 3, 4, 5, 7] and 3.5
    //    Method to Swap Elements.
    public static void swapElements10(int[] arr , int first , int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void Question10(int[] arr10) {
        int n = arr10.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if(arr10[j] < arr10[j-1]){
                    swapElements10(arr10 , j , j-1);
                }
                else{
                    break;
                }
            }
        }
    }

}