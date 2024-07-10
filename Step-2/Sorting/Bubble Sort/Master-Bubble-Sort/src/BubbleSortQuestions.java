import java.util.Arrays;

public class BubbleSortQuestions {
    public static void main(String[] args) {
        int[] arr1 = {4,3,2,1};
        int answer1 = Question1(arr1);
        System.out.println("Answer 1 : " + answer1);
        int[] arr2 = {7,2,9,4,3,8};
        Question2(arr2);
        int n2 = arr2.length;
        System.out.println("Answer 2 : " + arr2[n2-2]);
        int[] arr3 = {5,1,4,2,8};
        Question3(arr3);
        System.out.println("Answer 3 : " + Arrays.toString(arr3));
        int[] arr4 = {3,0,2,5,-1,4,1};
        Question4(arr4);
        int n4 = arr4.length;
        System.out.println("Answer 4 : " + Arrays.toString(arr4) + " , " + arr4[n4-1]);
        int[] arr5 = {8,9,10,7,6,4,5};
        Question5(arr5);
        System.out.println("Answer 5 : " + Arrays.toString(arr5));
        int[] arr6 = {1,3,4,2,5};
        Question6(arr6);
        System.out.println("Answer 6 : " + arr6[0]);
        int[] arr7 = {8,5,2,6,9,3};
        int answer7 = Question7(arr7);
        System.out.println("Answer 7 : " + answer7);
        int[] arr9 = {11,15,9,3,7,2,1};
        int answer9 = Question9(arr9);
        System.out.println("Answer 9 : " + answer9);
        int[] arr10 = {6,1,2,7,9,3};
        Question10(arr10);
        int n10 = arr10.length;
        double median = (arr10[n10/2 - 1] + arr10[n10/2]) / 2.0;
        System.out.println("Answer 10 : " + Arrays.toString(arr10) + " , " + median);
    }

//    Sort the array [4, 3, 2, 1] using Bubble Sort and count the number of swaps performed. -----> Output : [1, 2, 3, 4] and 6
    public static int Question1(int[] arr1) {
        int n = arr1.length;
        boolean swapped;
        int counter = 0;
        for (int i = 0; i < n-1; i++) {
            swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if(arr1[j] > arr1[j+1]){
                    int temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;
                    swapped = true;
                    counter++;
                }
            }
            if(!swapped){
                break;
            }
        }
        return counter;
    }

//    Use the logic of Bubble Sort to find the second-largest element in the array [7, 2, 9, 4, 3, 8]. -----> Output : 8
    public static void Question2(int[] arr2) {
        int n = arr2.length;
        boolean swapped;
        for (int i = 0; i < n-1; i++) {
            swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if(arr2[j] > arr2[j+1]){
                    int temp = arr2[j];
                    arr2[j] = arr2[j+1];
                    arr2[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

//    Sort only the first three elements of the array [5, 1, 4, 2, 8] using Bubble Sort. -----> Output : [1, 4, 5, 2, 8]
    public static void Question3(int[] arr3) {
        int n = 3;
        boolean swapped;
        for (int i = 0; i < n-1; i++) {
            swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if(arr3[j] > arr3[j+1]){
                    int temp = arr3[j];
                    arr3[j] = arr3[j+1];
                    arr3[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

//    Sort the array [3, 0, 2, 5, -1, 4, 1] using Bubble Sort and find the maximum element. -----> Output : [-1, 0, 1, 2, 3, 4, 5] and 5
    public static void Question4(int[] arr4) {
        int n = arr4.length;
        boolean swapped;
        for (int i = 0; i < n-1; i++) {
            swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if(arr4[j] > arr4[j+1]){
                    int temp = arr4[j];
                    arr4[j] = arr4[j+1];
                    arr4[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

//    Sort the array [8, 9, 10, 7, 6, 4, 5] in descending order using Bubble Sort. -----> Output : [10, 9, 8, 7, 6, 5, 4]
    public static void Question5(int[] arr5) {
        int n = arr5.length;
        boolean swapped;
        for (int i = 0; i < n-1; i++) {
            swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if(arr5[j] < arr5[j+1]){
                    int temp = arr5[j];
                    arr5[j] = arr5[j+1];
                    arr5[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

//    Use the logic of Bubble Sort to find the smallest element in the array [1, 3, 4, 2, 5]. -----> Output : 1
    public static void Question6(int[] arr6) {
        int n = arr6.length;
        boolean swapped;
        for (int i = 0; i < n-1; i++) {
            swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if(arr6[j] > arr6[j+1]){
                    int temp = arr6[j];
                    arr6[j] = arr6[j+1];
                    arr6[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

//    Sort the array [8, 5, 2, 6, 9, 3] using Bubble Sort and count the number of comparisons made. -----> Output : [2, 3, 5, 6, 8, 9] and 15
    public static int Question7(int[] arr7) {
        int n = arr7.length;
        boolean swapped;
        int comparisons = 0;
        for (int i = 0; i < n-1; i++) {
            swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                comparisons++;
                if(arr7[j] > arr7[j+1]){
                    int temp = arr7[j];
                    arr7[j] = arr7[j+1];
                    arr7[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return comparisons;
    }

//    Sort the array [11, 15, 9, 3, 7, 2, 1] using Bubble Sort and find the sum of the sorted array. -----> Output : 48
    public static int Question9(int[] arr9) {
        int n = arr9.length;
        boolean swapped;
        int sum = 0;
        for (int i = 0; i < n-1; i++) {
            swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if(arr9[j] > arr9[j+1]){
                    int temp = arr9[j];
                    arr9[j] = arr9[j+1];
                    arr9[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        for (int element : arr9){
            sum = element + sum;
        }
        return sum;
    }

//    Sort the array [6, 1, 2, 7, 9, 3] using Bubble Sort and find the median of the sorted array. -----> Output :  4.5
    public static void Question10(int[] arr10) {
        int n = arr10.length;
        boolean swapped;
        for (int i = 0; i < n-1; i++) {
            swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if(arr10[j] > arr10[j+1]){
                    int temp = arr10[j];
                    arr10[j] = arr10[j+1];
                    arr10[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

}
