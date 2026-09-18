package com.nikhil.LinkedList.Questions;

import com.nikhil.LinkedList.SLL;

public class RemoveDuplicatesFromSortedList {
    
    public static void main(String[] args) {

        SLL list = new SLL();
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(3);

        removeDuplicate(list);

        list.display();
        
    }

    public static void removeDuplicate(SLL list){

        SLL.Node node = list.head;

        while(node != null && node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                list.size--;
            }
            else{
                node = node.next;
            }
        }

        list.tail = node;
        list.tail.next = null;

        
    }
}
