package SLL;

/*
    1. How to create a Singly LinkedList ?
    2. How to Insert a Node at the Head ?
    3. How to Display a Singly LinkedList ?
    4. How to find the Length of a Singly LinkedList ?
    5. How to Insert a Node at the Tail ?
    6. How to Insert a Node at the given Index ?
    7. How to Delete a Node at the Head ?
    8. How to Delete a Node at the Tail ?
    9. How to Delete a Node at the given Index ?
    10. How to Search in a Singly LinkedList ?
*/

// Define a SinglyLinkedList class
public class SinglyLinkedList {

    // Adding an attribute head
    Node head = null;

    // 1. Define a Node Class
    static class Node{
        int data;
        Node next;

        // Define a Constructor to initialize Node data
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // 2. Define a Method to Insert at Head
    public void insertAtHead(int value){
        // Creating a New Node
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    // 3. Display the SLL
    public void displaySLL(){
        Node current = head;
        while (current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // 4. Length of SLL
    public int sizeOfSLL(){
        int counter = 0;
        Node current = head;
        while (current != null){
            counter++;
            current = current.next;
        }
        return counter;
    }

    // 5. Define a Method to Insert at Tail
    public void insertAtTail(int value){
        // Creating a New Node
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    // 6. Define a Method to Insert at a given Index
    public void insertAtIndex(int value , int index){
        // Creating a New Node
        Node newNode = new Node(value);
        int size = sizeOfSLL();
        if (index < 0 || index > size) {
            return;
        }
        if (index == 0) {
            insertAtHead(value);
        }
        else if (index == size) {
            insertAtTail(value);
        }
        else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // 7. Define a Method to Delete at Head
    public void deleteAtHead(){
        if(head == null){
            System.out.println("Cant Delete, Empty LL !");
            return;
        }
        else{
            head = head.next;
        }
    }

    // 8. Define a Method to Delete at Tail
    public void deleteAtTail(){
        if(head == null){
            System.out.println("Cant Delete, Empty LL !");
            return;
        }
        else if (head.next == null) {
            head = null;
        }
        else{
            Node current = head;
            while (current.next.next != null){
                current = current.next;
            }
            current.next = null;
        }
    }

    // 9. Define a Method to Delete at given Index
    public void deleteAtIndex(int index){
        int size = sizeOfSLL();
        if(head == null){
            System.out.println("Cant Delete, Empty LL !");
            return;
        }
        else if (index == 0) {
            deleteAtHead();
        }
        else if (index == size  - 1) {
            deleteAtTail();
        }
        else{
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
    }

    // 10. Define a Method to Search in SLL
    public boolean searchForElement(int value){
        Node current = head;
        while (current != null){
            if(current.data == value){
                return true;
            }
            current = current.next;
        }
        return false;
    }

}
