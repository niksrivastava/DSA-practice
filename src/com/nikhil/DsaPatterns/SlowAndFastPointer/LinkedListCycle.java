package com.nikhil.DsaPatterns.SlowAndFastPointer;
import com.nikhil.LinkedList.SLL;
public class LinkedListCycle {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);
        list.tail.next = list.get(2);

        boolean ans = cycle(list); 
        System.out.println(ans);
        int len = cycleLen(list);
        System.out.println(len);

    }

    public static boolean cycle(SLL list){
        boolean ans = false;

        SLL.Node fast = list.head;
        SLL.Node slow = list.head;

        while(fast != null && fast.next != null){
            
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                return true;
            }
        }

        return ans;
    }

    // Find the length of the cycle....

    public static int cycleLen(SLL list){
        int len = 0;

        SLL.Node fast = list.head;
        SLL.Node slow = list.head;

        while(fast != null && fast.next != null){
            
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                break;
            }
        }

        do{
            len++;
            slow = slow.next;
        }while(slow != fast);

        return len;
    }
}
