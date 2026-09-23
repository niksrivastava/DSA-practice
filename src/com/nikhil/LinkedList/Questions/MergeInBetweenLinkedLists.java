package com.nikhil.LinkedList.Questions;

import com.nikhil.LinkedList.SLL;

public class MergeInBetweenLinkedLists {
    public static void main(String[] args) {
        SLL list1 = new SLL();
        SLL list2 = new SLL();
        
        list1.insertLast(10);
        list1.insertLast(1);
        list1.insertLast(13);
        list1.insertLast(6);
        list1.insertLast(9);
        list1.insertLast(5);
        list2.insertLast(1000);
        list2.insertLast(1002);
        list2.insertLast(1003);
        SLL.Node ans = merge(list1, list2, 3, 4);
        System.out.println(ans);
    }
    public static SLL.Node merge(SLL list1, SLL list2, int a, int b){
        SLL.Node first = list1.head;
        SLL.Node second = list2.head;

        int count = 1;
        while(count < a){
            count++;
            first = first.next;
        }

        SLL.Node firstTail = list1.head;
        count = 0;

        while(count < b+1){
            count++;
            firstTail = firstTail.next;
        }

        SLL.Node secondTail = list2.head;

        while(secondTail.next != null){
            secondTail = secondTail.next;
        }

        first.next = second;
        secondTail.next = firstTail;

        return list1.head;
    }
}
