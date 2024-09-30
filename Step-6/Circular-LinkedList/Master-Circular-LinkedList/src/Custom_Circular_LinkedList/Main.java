package Custom_Circular_LinkedList;

public class Main {
    public static void main(String[] args) {
        Circular_LL list = new Circular_LL();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.delete(3);

        list.display();
    }
}
