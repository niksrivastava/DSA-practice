package com.nikhil.DsaPatterns.TwoPointers;

import com.nikhil.DsaPatterns.SlowAndFastPointer.LL;

public class SwappingNodesLinkedList {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(7);
        list.insertLast(9);
        list.insertLast(6);
        list.insertLast(6);
        list.insertLast(7);
        list.insertLast(8);
        list.insertLast(3);
        list.insertLast(0);
        list.insertLast(9);
        list.insertLast(5);

        LL.Node ans = swap(list.head, 2);
        System.out.println(ans);
    }

    public static LL.Node swap(LL.Node head, int k){
        LL.Node bp = head;
        int count = 1;

        if(head == null){
            return head;
        }
        while(count < k){
            count++;
            bp = bp.next;
        }

        LL.Node temp = head;

        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }

        LL.Node ep = head;
        count = size - k + 1;
        int n = count;
        count = 1;

        while(count < n){
            count++;
            ep = ep.next;
        }

        int t = bp.value;
        bp.value = ep.value;
        ep.value = t;

        return head;
    }
}
