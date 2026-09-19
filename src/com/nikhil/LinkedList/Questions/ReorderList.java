package com.nikhil.LinkedList.Questions;
import com.nikhil.LinkedList.SLL;

public class ReorderList {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);
        reorderList(list.head);
        list.display();
    }

    public static void reorderList(SLL.Node head){
        if(head == null || head.next == null){
            return;
        }

        SLL.Node mid = middleNode(head);
        SLL.Node headSecond = reverseList(mid);
        SLL.Node headFirst = head;

        while(headFirst != null && headSecond != null){
            SLL.Node temp = headFirst.next;
            headFirst.next = headSecond;
            headFirst = temp;

            temp = headSecond.next;
            headSecond.next = headFirst;
            headSecond = temp;
        }

        if(headFirst != null){
            headFirst.next = null;
        }

    }

    public static SLL.Node reverseList(SLL.Node head){
        
        if (head == null || head.next == null) {
            return head;
        }

        SLL.Node prev = null;
        SLL.Node present = head;
        SLL.Node next = present.next;

        while(present != null){
            present.next = prev;
            prev = present;
            present = next;
            if(next != null){
                next = next.next;
            }
        }
        return prev;
    }

    public static SLL.Node middleNode(SLL.Node head){
        SLL.Node slow = head;
        SLL.Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
