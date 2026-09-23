package com.nikhil.DsaPatterns.SlowAndFastPointer;

import com.nikhil.LinkedList.SLL;

public class LinkedListCycle2 {
        public static void main(String[] args) {
        SLL list = new SLL();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);
        list.tail.next = list.get(2);

        SLL.Node ans = cycle(list); 
        System.out.println(ans);

    }

    public static SLL.Node cycle(SLL list){

        boolean cycle = false;

        SLL.Node fast = list.head;
        SLL.Node slow = list.head;

        while(fast != null && fast.next != null){
            
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                cycle = true;
                fast = list.head;
                break;
            }
        }

        if(cycle == false){
            return null;
        }

        while(slow != fast){
            fast = fast.next;
            slow = slow.next;

        }

        return fast;
    }
}
