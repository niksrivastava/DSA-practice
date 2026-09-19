package com.nikhil.LinkedList.Questions;
import com.nikhil.LinkedList.SLL;
public class ReverseLinkedList2 {
    public static void main(String[] args) {
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);

        SLL.Node ans = reverseBetween(list.head, 2, 4);
        
        while (ans != null) {
            System.out.print(ans.value + " -> ");
            ans = ans.next;
        }

        System.out.println("End");;
    }

    static SLL list = new SLL();

    public static SLL.Node reverseBetween(SLL.Node head, int left, int right){
        
        if(left == right){
            return head;
        }

        SLL.Node prev = null;
        SLL.Node present = head;

        for (int i = 0; present != null && i < left-1; i++) {
            prev = present;
            present = present.next;
        }

        SLL.Node last = prev;
        SLL.Node newEnd = present;

        // Now, reverse between left and right.....

        SLL.Node next = present.next;

        for (int i = 0; present != null && i < right-left+1; i++){
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
        return head;
    }
}
