public class Main {
    public static void main(String[] args) {
        System.out.println("Arrays In-Depth :");
        int[] roll_num = new int[5];
        int[] roll_num2 = {1 , 2 , 3 , 4 , 5};
        //        Few Things to Note Down :
        int[] RN; // Declaration of Array ---> RN is getting defined in the Stack.
        RN = new int[5]; // Initialisation of Array ---> Actually here Object is being created in the memory(heap).
        System.out.println(roll_num[0]); // By default the value will be 0. Its like [0 , 0 , 0 , 0 , 0].
        //        String Arrays
        String[] arr = new String[4];
        System.out.println(arr[0]); // Why getting null ? What is it ? ---> It is basically a special kind of Literal.
    };
}