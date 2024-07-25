import java.util.HashMap;

public class HashingQuestions {
    public static void main(String[] args) {
    //    Create a HashMap and insert key-value pairs of your name and age. Retrieve the age by your name.
        HashMap<String , Integer> map1 = new HashMap<>();
        map1.put("Sahil Ladhania" , 23);
        int myAge = map1.get("Sahil Ladhania");
        System.out.println("Question 1 : " + myAge);

    //    Create a HashMap of country names as keys and their capitals as values. Remove an entry by the country name.
        HashMap<String , String> map2 = new HashMap<>();
        map2.put("Country 1" , "Capital 1");
        map2.put("Country 2" , "Capital 2");
        map2.put("Country 3" , "Capital 3");
        map2.remove("Country 3");
        System.out.println("Question 2 : " + map2);

    //    Create a HashMap of product names and their prices. Check if a specific product exists in the map.
        HashMap <String , Integer> map3 = new HashMap<>();
        map3.put("Product 1" , 100);
        map3.put("Product 2" , 200);
        map3.put("Product 3" , 300);
        boolean checkProduct = map3.containsKey("Product 2");
        System.out.println("Question 3 : " + checkProduct);

    //    Create a HashMap of student names and their scores. Iterate over the entries and print each student’s name and score.
        HashMap <String , Integer> map4 = new HashMap<>();
        map4.put("Student 1" , 50);
        map4.put("Student 2" , 60);
        map4.put("Student 3" , 70);
        for(HashMap.Entry<String , Integer> entry : map4.entrySet()){
            System.out.println("Answer 4 : " + "Key - " + entry.getKey() + " , " + "Value - " + entry.getValue());
        }

    //    Create a HashMap of employee IDs and their names. Update the name for a specific employee ID.
        HashMap <Integer , String> map5 = new HashMap<>();
        map5.put(1 , "Student 1");
        map5.put(2 , "Student 2");
        map5.put(3 , "Student 3");
        map5.put(2 , "Updated");
        System.out.println("Question 5 : " + map5);
    }
}
