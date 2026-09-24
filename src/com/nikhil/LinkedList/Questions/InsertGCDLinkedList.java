package com.nikhil.LinkedList.Questions;

import com.nikhil.LinkedList.SLL;

public class InsertGCDLinkedList {
    public static void main(String[] args) {
        SLL list = new SLL();

        list.insertLast(4);
        list.insertLast(1);
        list.insertLast(8);
        list.insertLast(4);
        list.insertLast(5);

        SLL.Node ans = insert(list.head);
        System.out.println(ans);
    }

    public static SLL.Node insert(SLL.Node head){
        SLL.Node first = head;
        SLL.Node second = head.next;

        while(second != null){

            int gcd = GCD(first.value, second.value);

            SLL.Node node = new SLL.Node(gcd);
            
            first.next = node;
            node.next = second;
            first = second;
            second = second.next;

        }

        System.out.println(second);

        return head;
    }

    public static int GCD(int a, int b){

        int rem = -1;
        while(rem != 0){
            rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
}
