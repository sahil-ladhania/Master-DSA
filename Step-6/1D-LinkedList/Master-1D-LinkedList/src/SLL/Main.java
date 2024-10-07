package SLL;

public class Main {
    public static void main(String[] args) {
        // Creation of SLL
        System.out.println("-----Creation of SLL-----");
        SinglyLinkedList SLL = new SinglyLinkedList();
        System.out.println(SLL.head);

        // Insertion at Head
        System.out.println("-----Insertion at Head-----");
        SLL.insertAtHead(4);
        SLL.insertAtHead(3);
        SLL.insertAtHead(2);
        SLL.insertAtHead(1);
        System.out.println(SLL.head);
        System.out.println(SLL.head.data);

        // Display a SLL
        System.out.println("-----Display a SLL-----");
        SLL.displaySLL();

        // Size of SLL
        System.out.println("-----Size of SLL-----");
        System.out.println(SLL.sizeOfSLL());

        // Insertion at Tail
        System.out.println("-----Insertion at Tail-----");
        SLL.insertAtTail(5);
        SLL.displaySLL();

        // Insertion at given Index
        System.out.println("-----Insertion at Index-----");
        SLL.insertAtIndex(8 , 3);
        SLL.displaySLL();

        // Deletion at Head
        System.out.println("-----Deletion at Head-----");
        SLL.deleteAtHead();
        SLL.displaySLL();

        // Deletion at Tail
        System.out.println("-----Deletion at Head-----");
        SLL.deleteAtTail();
        SLL.displaySLL();

        // Deletion at given Index
        System.out.println("-----Deletion at Index-----");
        SLL.deleteAtIndex(2);
        SLL.displaySLL();

        // Search at given Index
        System.out.println("-----Search at Index-----");
        System.out.println(SLL.searchForElement(30));

    }
}
