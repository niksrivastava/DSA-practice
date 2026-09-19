package com.nikhil.LinkedList.Questions;
import com.nikhil.LinkedList.SLL;
public class PalindromeLinkedList {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(1);
        boolean ans = isPalindrome(list.head);
        System.out.println(ans);
    }

    public static boolean isPalindrome(SLL.Node head){

        SLL.Node mid = middleNode(head);
        SLL.Node headSecond = reverseList(mid);
        SLL.Node reReverseHead = headSecond;

        while(head != null && headSecond != null){
            if(head.value != headSecond.value){
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }

        reverseList(reReverseHead);

        return head == null || headSecond == null;

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
