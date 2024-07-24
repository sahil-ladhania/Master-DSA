/*

1. What is Hashing ?
Answer :-
* Hashing is a technique used to uniquely identify data using a hash code. A hash function converts input (or ‘key’)
into a fixed-size string of bytes, typically a hash code.

2. What is the main Purpose of Hashing ?
Answer :-
* To enable fast data retrieval.
* To avoid collisions where two keys generate the same hash code.

3. What are Hash Functions ?
Answer :-
* A hash function takes an input (or ‘key’) and returns a hash code (an integer).
* For example, a simple hash function could be :
    int hashCode = key.hashCode(); -----> Here, key is the object whose hash code you want to compute.

4. What is Hash Tables ?
Answer :-
* A hash table is a data structure that uses hashing to store and retrieve values efficiently.
* It consists of :
    * Buckets/Slots - An array where data is stored.
	* Hash Function - Determines the index in the array for storing the data.

5. What are the Key Operations ?
Answer :-
* Insert - Store a key-value pair.
* Retrieve - Get the value associated with a key.
* Delete - Remove a key-value pair.

6. What is Java HashMaps ?
Answer :-
* In Java, HashMap is a common implementation of a hash table.

7. What are the Basic Operations in Java HashMaps ?
Answer :-
* Insertion :
    import java.util.HashMap;
    public class HashMapExample {
        public static void main(String[] args) {
            HashMap<String, Integer> map = new HashMap<>();
            map.put("One", 1);
            map.put("Two", 2);
        }
    }
* Retrieval :
    int value = map.get("One"); // Returns 1
* Deletion :
    map.remove("One");
* Checking for Existence :
    boolean exists = map.containsKey("Two"); // Returns true

8. What do you mean by handling Collisions ?
Answer :-
* Collisions occur when two keys produce the same hash code.
* HashMap handles collisions using :
    Chaining - Each bucket points to a linked list of entries.
        class Node {
            String key;
            Integer value;
            Node next;
            Node(String key, Integer value) {
                this.key = key;
                this.value = value;
            }
        }
	Open Addressing - Find another open slot using probing (not used in Java’s HashMap).

9. What is Load Factor and Capacity ?
Answer :-
* Load Factor - Measures how full the hash table is allowed to get before its capacity is automatically increased.
Default load factor is 0.75.
* Capacity - Number of buckets in the hash table.
* Example of Customizing Load Factor and Capacity -
    HashMap<String, Integer> map = new HashMap<>(16, 0.75f);

10. What is the difference between HashMap and Hashtable ?
Answer :-
* HashMap is not synchronized, while Hashtable is synchronized.
* HashMap allows null keys and values, but Hashtable does not.

11.	What is the time complexity of operations in a HashMap ?
Answer :-
* Average time complexity for put, get, and remove operations is O(1).

12. What happens if the hash code function is not well-designed ?
Answer :-
* Poor hash code function can lead to excessive collisions and degrade performance.

*/