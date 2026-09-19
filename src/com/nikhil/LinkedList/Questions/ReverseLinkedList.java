package com.nikhil.LinkedList.Questions;
import com.nikhil.LinkedList.SLL;
public class ReverseLinkedList {
    public static void main(String[] args) {
        
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);
        recursionReverse(list.head);
        list.display();
        inPlaceReverse();
        list.display();
    }

    static SLL list = new SLL();

    public static void recursionReverse(SLL.Node node){
        if(node == list.tail){
            list.head = node;
            return;
        }

        recursionReverse(node.next);

        list.tail.next = node;
        list.tail = node;
        list.tail.next = null;
    }

    public static void inPlaceReverse(){
        if(list.size < 2){
            return;
        }

        SLL.Node prev = null;
        SLL.Node present = list.head;
        SLL.Node next = present.next;

        while(present != null){
            present.next = prev;
            prev = present;
            present = next;
            if(next != null){
                next = next.next;
            }
        }
        list.head = prev;
    }
}
