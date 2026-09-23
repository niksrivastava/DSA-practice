package com.nikhil.DsaPatterns.SlowAndFastPointer;
import com.nikhil.LinkedList.*;
public class MiddleOfTheLinkedList {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);

        SLL.Node ans = middle(list);
        System.out.println(ans);
    }

    public static SLL.Node middle(SLL list){
        SLL.Node slow = list.head;
        SLL.Node fast = list.head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
