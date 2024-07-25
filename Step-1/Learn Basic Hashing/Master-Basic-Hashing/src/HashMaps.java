import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String , Integer> map = new HashMap<>();
        // Inserting Elements
        map.put("Apple" , 3);
        map.put("Banana" , 2);
        map.put("Orange" , 5);
        System.out.println("Map : " + map);
        // Retrieving Elements
        int count = map.get("Apple");
        System.out.println("Apple Count : " + count);
        // Removing elements
        map.remove("Banana");
        System.out.println("Map : " + map);
        // Checking if a Key exists
        boolean hasApple = map.containsKey("Apple");
        System.out.println("Contains Apple : " + hasApple);
        // Checking if a Value exists
        boolean hasFive = map.containsValue(5);
        System.out.println("Contains Value 5 : " + hasFive);
        // Iterating over Keys
        for(String key : map.keySet()){
            System.out.println("Key : " + key);
        }
        // Iterating over Values
        for(int value : map.values()){
            System.out.println("Values : " + value);
        }
        // Iterating over Key-Value pairs
        for(HashMap.Entry<String, Integer> entry : map.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
