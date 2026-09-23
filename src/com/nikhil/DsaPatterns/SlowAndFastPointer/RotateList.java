package com.nikhil.DsaPatterns.SlowAndFastPointer;

import com.nikhil.LinkedList.SLL;

public class RotateList {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        // list.insertLast(6);
        // list.insertLast(7);

        SLL.Node ans = rotateList(list.head, 3);
        
        while (ans != null) {
            System.out.print(ans.value + " -> ");
            ans = ans.next;
        }

        System.out.println("End");
    }

    public static SLL.Node rotateList(SLL.Node head, int k){

        if(head == null || head.next == null || k <= 0){
            return head;
        }

        SLL.Node last = head;
        int length = 1;
        while(last.next != null){
            last = last.next;
            length++;
        }

        last.next = head;
        int rotations = k % length;

        int skip = length - rotations;
        SLL.Node newLast = head;

        for (int i = 0; i < skip - 1; i++) {
            newLast = newLast.next;
        }

        head = newLast.next;
        newLast.next = null;

        return head;
    }
}
