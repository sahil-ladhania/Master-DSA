import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> set = new HashSet<>();
        // Inserting Elements
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Grapes");
        set.add("Apple"); // -----> Duplicates wont be added !!!
        System.out.println("Set : " + set);
        // Removing Elements
        set.remove("Banana");
        System.out.println("Set : " + set);
        // Checking if an Element exists
        boolean hasApple = set.contains("Apple");
        System.out.println("Contains Apple : " + hasApple);
        // Iterating over elements
        for(String element : set){
            System.out.println("Elements : " + element);
        }
    }
}
