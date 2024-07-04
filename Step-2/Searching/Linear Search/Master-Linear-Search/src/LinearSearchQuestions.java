
public class LinearSearchQuestions {
    public static void main(String[] args) {
        int[] arr1 = {3,5,1,2,4};
        int index1 = Question1(arr1);
        System.out.println("Index of 2 : " + index1);

        int[] arr2 = {10,20,30,40,50};
        boolean isFound1 = Question2(arr2);
        if (isFound1){
            System.out.println("Element you are searching is there !!!");
        }
        else{
            System.out.println("Element you are searching is not there !!!");
        }

        String[] arr3 = {"apple", "banana", "cherry", "date"};
        int index3 = Question3(arr3);
        System.out.println("Index of cherry : " + index3);

        int[] arr4 = {1,2,3,4,5,5,5};
        int index4 = Question4(arr4);
        System.out.println("First Occurrence of 5 : " + index4);

        int[] arr5 = {5,10,15,20,25};
        boolean isFound5 = Question5(arr5);
        if (isFound5){
            System.out.println("Element you are searching is there !!!");
        }
        else{
            System.out.println("Element you are searching is not there !!!");
        }

        int[] arr6 = {1,2,3,4,5};
        boolean isFound6 = Question6(arr6);
        if (isFound6){
            System.out.println("Element you are searching is there !!!");
        }
        else{
            System.out.println("Element you are searching is not there !!!");
        }

        int[] arr7 = {7,14,21,28,35};
        int index7 = Question7(arr7);
        System.out.println("Index of 21 : " + index7);

        String[] arr8 = {"red", "blue", "green", "yellow"};
        boolean isFound8 = Question8(arr8);
        if (isFound8){
            System.out.println("Element you are searching is there !!!");
        }
        else{
            System.out.println("Element you are searching is not there !!!");
        }

        int[] arr9 = {8,6,7,5,3,0,9};
        int index9 = Question9(arr9);
        System.out.println("Index of 0 : " + index9);

        int[] arr10 = {11,22,33,44,55};
        boolean isFound10 = Question10(arr10);
        if (isFound10){
            System.out.println("Element you are searching is there !!!");
        }
        else{
            System.out.println("Element you are searching is not there !!!");
        }
    }

//        Given an array [3, 5, 1, 2, 4], find the index of the number 2. -----> Output : 3
    public static int Question1(int[] arr1) {
        if(arr1.length == 0){
            return -1;
        }
        else{
            int elementToSearch = 2;
            for (int i = 0; i < arr1.length; i++) {
                if(arr1[i] == elementToSearch){
                    return i;
                }
            }
        }
        return -1;
    }

//        Search for the number 7 in the array [10, 20, 30, 40, 50]. What is the output? -----> Output : False
    public static boolean Question2(int[] arr2) {
        if(arr2.length == 0){
            return false;
        }
        else{
            int elementToSearch = 7;
            for (int i = 0; i < arr2.length; i++) {
                if(arr2[i] == elementToSearch){
                    return true;
                }
            }
        }
        return false;
    }

//        Given an array of strings ["apple", "banana", "cherry", "date"], find the index of the string "cherry". -----> Output : 2
    public static int Question3(String[] arr3) {
        if(arr3.length == 0){
            return -1;
        }
        else{
            String elementToSearch = "cherry";
            for (int i = 0; i < arr3.length; i++) {
                if(arr3[i] == elementToSearch){
                    return i;
                }
            }
        }
        return -1;
    }

//        Find the first occurrence of the number 5 in the array [1, 2, 3, 4, 5, 5, 5]. -----> Output : 4
    public static int Question4(int[] arr4) {
        if(arr4.length == 0){
            return -1;
        }
        else{
            int elementToSearch = 5;
            for (int i = 0; i < arr4.length; i++) {
                if(arr4[i] == elementToSearch){
                    return i;
                }
            }
        }
        return -1;
    }

//        Check if the number 15 is present in the array [5, 10, 15, 20, 25]. -----> Output : True
    public static boolean Question5(int[] arr5) {
        if(arr5.length == 0){
            return false;
        }
        else{
            int elementToSearch = 15;
            for (int i = 0; i < arr5.length; i++) {
                if(arr5[i] == elementToSearch){
                    return true;
                }
            }
        }
        return false;
    }

//        Search for the number 100 in the array [1, 2, 3, 4, 5]. What is the output? -----> Output : False
    public static boolean Question6(int[] arr6) {
        if(arr6.length == 0){
            return false;
        }
        else{
            int elementToSearch = 100;
            for (int i = 0; i < arr6.length; i++) {
                if(arr6[i] == elementToSearch){
                    return true;
                }
            }
        }
        return false;
    }

//        Given an array [7, 14, 21, 28, 35], find the index of the number 21. -----> Output : 2
    public static int Question7(int[] arr7) {
        if(arr7.length == 0){
            return -1;
        }
        else{
            int elementToSearch = 21;
            for (int i = 0; i < arr7.length; i++) {
                if(arr7[i] == elementToSearch){
                    return i;
                }
            }
        }
        return -1;
    }

//        Search for the string "orange" in the array ["red", "blue", "green", "yellow"]. What is the output? -----> Output : False
    public static boolean Question8(String[] arr8) {
        if(arr8.length == 0){
            return false;
        }
        else{
            String elementToSearch = "orange";
            for (int i = 0; i < arr8.length; i++) {
                if (arr8[i] == elementToSearch){
                    return true;
                }
            }
        }
        return false;
    }

//        Given an array [8, 6, 7, 5, 3, 0, 9], find the index of the number 0. -----> Output : 5
    public static int Question9(int[] arr9) {
        if(arr9.length == 0){
            return -1;
        }
        else{
            int elementToSearch = 0;
            for (int i = 0; i < arr9.length; i++) {
                if(arr9[i] == elementToSearch){
                    return i;
                }
            }
        }
        return -1;
    }

//        Check if the number 12 is present in the array [11, 22, 33, 44, 55]. -----> Output : False
    public static boolean Question10(int[] arr10) {
        if(arr10.length == 0){
            return false;
        }
        else{
            int elementToSearch = 12;
            for (int i = 0; i < arr10.length; i++) {
                if(arr10[i] == elementToSearch){
                    return true;
                }
            }
        }
        return false;
    }

}
