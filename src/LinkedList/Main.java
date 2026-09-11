package LinkedList;

public class Main {
    public static void main(String[] args) {
        // SLL list = new SLL();
        // list.insertFirst(3);
        // list.insertFirst(2);
        // list.insertFirst(8);
        // list.insertFirst(17);
        // list.insertLast(99);
        // list.insert(56,4);
        // list.deleteFirst();
        // list.deleteLast();
        // list.delete(2);
        // System.out.println(list.find(8));
        // list.display();

        DLL list = new DLL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(5);
        list.insert(3, 90);
        list.display();
        System.out.println();
        // list.displayReverse();
    }
}

