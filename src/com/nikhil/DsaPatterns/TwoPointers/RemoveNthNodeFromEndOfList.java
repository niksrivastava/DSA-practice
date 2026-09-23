package com.nikhil.DsaPatterns.TwoPointers;

import com.nikhil.DsaPatterns.SlowAndFastPointer.LL;

public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(1);
        // list.insertLast(2);
        // list.insertLast(3);
        // list.insertLast(4);
        // list.insertLast(5);

        LL.Node ans = remove(list.head, 1);
        System.out.println(ans);
    }

    public static LL.Node remove(LL.Node head, int n){

        LL.Node temp = head;
        int count = 0;

        while (temp.next != null) {
            count++;
            temp = temp.next;
        }

        if(n == count+1){
            head = head.next;
            return head;
        }

        n = count - n;
        count = 1;
        temp = head;

        while (count <= n) {
            count++;
            temp = temp.next;
        }

        if(temp.next != null){
            temp.next = temp.next.next;
        }
        return head;
    }
}
