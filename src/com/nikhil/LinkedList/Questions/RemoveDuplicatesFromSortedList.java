package com.nikhil.LinkedList.Questions;

public class RemoveDuplicatesFromSortedList {

        Node head;
        Node tail;
        int size;

        RemoveDuplicatesFromSortedList(){
            this.size = 0;
        }

    public class Node {
        
        int value;
        Node next;
        Node() {}
        Node(int value) { this.value = value; }
        Node(int value,   Node next) { this.value = value; this.next = next; }
    }
    
    public static void main(String[] args) {

        RemoveDuplicatesFromSortedList list = new RemoveDuplicatesFromSortedList();

        // For taking inputs and checking it....
        
        // list.insert(3);
        // list.insert(3);
        // list.insert(8);
        // list.insert(9);
        // list.insert(9);

        // List.duplicate();
        // list.display();

        
    }

    public void duplicate(){
        Node node = head;

        while(node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }
            else{
                node = node.next;
            }
        }

        tail = node;
        tail.next = null;

        
    }
}
