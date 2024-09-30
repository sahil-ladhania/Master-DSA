package Custom_Doubly_LinkedList;

public class Main {
    public static void main(String[] args) {
        Doubly_LL list = new Doubly_LL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertLast(0);

        list.display();
    }
}
