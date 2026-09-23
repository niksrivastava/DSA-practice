package com.nikhil.DsaPatterns.TwoPointers;

import com.nikhil.DsaPatterns.SlowAndFastPointer.LL;

public class PartitionList {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(1);
        list.insertLast(4);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(5);
        list.insertLast(2);

        LL.Node ans = partition(list.head, 3);
        System.out.println(ans);
    }

    public static LL.Node partition(LL.Node head, int x){
        LL.Node first = null;
        LL.Node second = null;
        LL.Node temp1 = head;
        LL.Node firstHead = null;
        LL.Node secondHead = null;

        while(temp1 != null){
            LL.Node next = temp1.next;
            temp1.next = null;
            if(temp1.value < x){
                if (firstHead == null) {
                    firstHead = temp1;
                    first = temp1;
                } else {
                    first.next = temp1;
                    first = temp1;
                }

            }
            else{

                if (secondHead == null) {
                    secondHead = temp1;
                    second = temp1;
                } else {
                    second.next = temp1;
                    second = temp1;
                }
            }

            temp1 = next;
        }

        if (firstHead == null) {
            return secondHead;
        }

        first.next = secondHead;
        return firstHead;
    }
}
