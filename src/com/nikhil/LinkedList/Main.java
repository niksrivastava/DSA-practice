package com.nikhil.LinkedList;

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
        // list.insertWithRecursion(88,2);
        // list.display();

        // DLL list = new DLL();
        // list.insertFirst(3);
        // list.insertFirst(2);
        // list.insertFirst(8);
        // list.insertFirst(17);
        // list.insertLast(5);
        // list.insert(3, 90);
        // list.display();
        // System.out.println();
        // list.displayReverse();

        // CLL list = new CLL();
        // list.insert(3);
        // list.insert(2);
        // list.insert(8);
        // list.insert(17);
        // list.insert(5);
        // list.delete(17);
        // list.display();

        SLL first = new SLL();
        SLL second = new SLL();

        first.insertLast(1);
        first.insertLast(4);
        first.insertLast(2);

        second.insertLast(3);
        second.insertLast(1);
        second.insertLast(8);
        second.insertLast(14);

        first.bubbleSort();
        second.bubbleSort();
        first.display();
        second.display();
    }
}

