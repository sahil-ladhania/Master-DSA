public class SelectionSortQuestions {
    public static void main(String[] args) {
        int[] arr1 = {5,2,9,1,5,6};
        int answer1 = Question1(arr1);
        System.out.println(answer1);
//        Question2();
//        Question3();
//        Question4();
//        Question5();
        int[] arr6 = {5,4,3,2,100};
        int answer6 = Question6(arr6);
        System.out.println(answer6);
//        Question7();
//        Question8();
//        Question9();
//        Question10();
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
    public static void Question2(int[] arr2) {

    }

//    Find the second-smallest element in the array [1, 4, 3, 2] using the logic of Selection Sort. ----> Output : 2
    public static void Question3(int[] arr3) {

    }

//    Sort the array [10, 5, 2, 7, 1, 9] in descending order using Selection Sort. ----> Output : [10, 9, 7, 5, 2, 1]
    public static void Question4(int[] arr4) {

    }

//    Sort only the even numbers in the array [12, 11, 15, 10, 14, 13] using Selection Sort. ----> Output : [10, 11, 15, 12, 14, 13]
    public static void Question5(int[] arr5) {

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

//    Sort only the elements at odd indices in the array [20, 10, 30, 50, 40] using Selection Sort. ----> Output : [20, 10, 30, 40, 50]
    public static void Question7(int[] arr7) {

    }

//    Sort the array [2, 8, 5, 3, 9] using Selection Sort and then reverse the sorted array. ----> Output : [9, 8, 5, 3, 2]
    public static void Question8(int[] arr8) {

    }

//    Find the third-largest element in the array [7, 6, 5, 4, 3, 2, 1] using the logic of Selection Sort. ----> Output : 5
    public static void Question9(int[] arr9) {

    }

//    Sort the array [9, 8, 7, 6, 5] using Selection Sort and then find the median of the sorted array. ----> Output : [5, 6, 7, 8, 9] and 7
    public static void Question10(int[] arr10) {

    }

}
