package com.nikhil.DsaPatterns.SlowAndFastPointer;
import com.nikhil.LinkedList.*;

public class MergeSort {

    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertLast(4);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(1);
        SLL.Node ans = sortList(list.head);

        while (ans != null) {
            System.out.print(ans.value + " -> ");
            ans = ans.next;
        }

        System.out.println("End");
    }

    public static SLL.Node sortList(SLL.Node head){
        if(head == null || head.next == null){
            return head;
        }

        SLL.Node mid = getMid(head);
        SLL.Node left = sortList(head);
        SLL.Node right = sortList(mid);

        return merge(left, right);

    }

    public static SLL.Node merge(SLL.Node list1, SLL.Node list2) {

        SLL.Node dummyHead = new SLL.Node(0);
        SLL.Node tail = dummyHead;

        while (list1 != null && list2 != null) {

            if (list1.value <= list2.value) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }

            tail = tail.next;
        }

        if (list1 != null) {
            tail.next = list1;
        } else {
            tail.next = list2;
        }

        return dummyHead.next;
    }

    public static SLL.Node getMid(SLL.Node head){
        SLL.Node midPrev = null;
        while(head != null && head.next != null){
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }

        SLL.Node mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
}
