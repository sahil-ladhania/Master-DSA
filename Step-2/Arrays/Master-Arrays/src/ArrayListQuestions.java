import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListQuestions {
    public static void main(String[] args) {

//        Create an ArrayList of integers and add the elements {1, 2, 3}. Print the ArrayList.
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        System.out.println(arr1);

//        Take 3 integer inputs from the user and store them in an ArrayList. Print the ArrayList elements.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 Integers to Store it in ArrayList :");
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arr2.add(input.nextInt());
        }
        System.out.println(arr2);

//        Create an ArrayList and print its size.
        ArrayList<Integer> arr3 = new ArrayList<>();
        arr3.add(1);
        arr3.add(2);
        arr3.add(3);
        arr3.add(4);
        arr3.add(5);
        System.out.println(arr3.size());

//        Create an ArrayList of integers and add the elements {10, 20, 30}. Print the second element.
        ArrayList<Integer> arr4 = new ArrayList<>();
        arr4.add(10);
        arr4.add(20);
        arr4.add(30);
        System.out.println(arr4.get(1));

//        Create an ArrayList of integers and add the elements {5, 10, 15, 20}. Update the third element to 50 and print the ArrayList.
        ArrayList<Integer> arr5 = new ArrayList<>();
        arr5.add(5);
        arr5.add(10);
        arr5.add(15);
        arr5.add(20);
        System.out.println(arr5);
        arr5.set(2 , 50);
        System.out.println(arr5);

//        Create an ArrayList of integers and add the elements {1, 2, 3, 4, 5}. Use a loop to print each element.
        ArrayList<Integer> arr6 = new ArrayList<>();
        arr6.add(1);
        arr6.add(2);
        arr6.add(3);
        arr6.add(4);
        arr6.add(5);
        int size = arr6.size();
        for (int i = 0; i < size; i++) {
            System.out.println(arr6.get(i));
        }

//        Create an ArrayList of integers and add the elements {2, 4, 6, 8}. Calculate and print the sum of all elements.
        ArrayList<Integer> arr7 = new ArrayList<>();
        arr7.add(2);
        arr7.add(4);
        arr7.add(6);
        arr7.add(8);
        int sum = 0;
        int sizee = arr7.size();
        for (int i = 0; i < sizee; i++) {
            sum = arr7.get(i) + sum;
        }
        System.out.println(sum);

//        Create an ArrayList of integers and add the elements {9, 8, 7}. Create another ArrayList and copy the elements from the first ArrayList into it. Print the new ArrayList.
        ArrayList<Integer> arr8 = new ArrayList<>();
        arr8.add(9);
        arr8.add(8);
        arr8.add(7);
        ArrayList<Integer> copyOfArr8 = new ArrayList<>();
        copyOfArr8.addAll(arr8);
        System.out.println(arr8);
        System.out.println(copyOfArr8);
    }
}
