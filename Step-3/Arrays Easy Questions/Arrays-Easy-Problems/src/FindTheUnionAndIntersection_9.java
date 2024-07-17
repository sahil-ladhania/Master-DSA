import java.util.ArrayList;

public class FindTheUnionAndIntersection_9 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,3,3,3,4,5};
        int[] arr2 = {1,1,1,2,3,3,4,5,6};
        String bruteForceAnswer = bruteForceUnion(arr1 , arr2);
        System.out.println("Brute Force Answer : " + bruteForceAnswer);
        String betterAnswer = betterUnion(arr1 , arr2);
        System.out.println("Better Answer : " + betterAnswer);
        ArrayList<Integer> optimalAnswer = optimalUnion(arr1 , arr2);
        System.out.println("Optimal Answer : " + optimalAnswer);
    }

    // Brute Force Approach -----> TC :
    public static String bruteForceUnion(int[] arr1 , int[] arr2) {
        String str = "The brute force of this question was solved using Sets.";
        return str;
    }

    // Better Approach ---> TC : O(n)
    public static String betterUnion(int[] arr1 , int[] arr2) {
        String str = "There is No better solution for this Question.";
        return str;
    }

    // Optimal Approach ---> TC :
    public static ArrayList<Integer> optimalUnion(int[] arr1 , int[] arr2) {
        int i = 0;
        int j = 0;
        ArrayList <Integer> union = new ArrayList<>();
        while ((i < arr1.length) || j < arr2.length){
            if(arr1[i] < arr2[j] && arr1[i] != union.get(j)){
                union.set(i , arr1[i]);
            }
        }
        return union;
    }

}
