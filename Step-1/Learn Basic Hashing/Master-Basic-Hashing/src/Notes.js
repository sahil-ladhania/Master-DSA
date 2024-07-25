/*

1. What is Hashing ?
Answer :-
* Hashing is a technique used to uniquely identify data using a hash code.
* A hash function converts input (or ‘key’) into a fixed-size string of bytes, typically a hash code.

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

*/