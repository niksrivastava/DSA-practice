package com.nikhil.LinkedList.Questions;

import com.nikhil.LinkedList.SLL;

public class ReverseNodesInkGroup {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        // list.insertLast(6);
        // list.insertLast(7);

        SLL.Node ans =reverseKGroup(list.head, 3);
        
        while (ans != null) {
            System.out.print(ans.value + " -> ");
            ans = ans.next;
        }

        System.out.println("End");
    }

    public static SLL.Node reverseKGroup(SLL.Node head, int k){

        if(k <= 1 || head == null){
            return head;
        }
        
        SLL.Node prev = null;
        SLL.Node present = head;

        while(true){

            SLL.Node check = present;

            for (int i = 0; i < k; i++) {
                if (check == null) {
                    return head;
                }
                check = check.next;
            }

            SLL.Node last = prev;
            SLL.Node newEnd = present;

            // Now, reverse between left and right.....

            SLL.Node next = present.next;

            for (int i = 0; present != null && i < k; i++){
                present.next = prev;
                prev = present;
                present = next;
                if(next != null){
                    next = next.next;
                }
            }

            if(last != null){
                last.next = prev;
            }
            else{
                head = prev;
            }
            
            newEnd.next = present;

            if(present == null){
                break;
            }

            prev = newEnd;
            
        }
        
        return head;
    }
}
