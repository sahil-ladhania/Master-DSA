public class Main {
    public static void main(String[] args) {
        System.out.println("Mastering Linear Search :");
        int[] number = {12 , 23 , 22 , 30 , 19 , 2 , 9};
        int target = 19;
        int answer = linearSearch(number , target);
        System.out.println(answer);
        int answer2 = linearSearch2(number , target);
        System.out.println(answer2);
    }
    
    //   Returning Index
    public static int linearSearch(int[] arr , int target) {
        if(arr.length == 0){
            return -1;
        }
        else{
            for (int index = 0; index < arr.length; index++) {
                int element = arr[index];
                if(element == target){
                    return index;
                }
            }
        }
        return -1;
    }

    //   Returning Element
    public static int linearSearch2(int[] arr , int target) {
        if(arr.length == 0){
            return -1;
        }
        else{
            for (int index = 0; index < arr.length; index++) {
                int element = arr[index];
                if(element == target){
                    return element;
                }
            }
        }
        return -1;
    }
 }