package com.nikhil.LinkedList.Questions;
import com.nikhil.LinkedList.SLL;
public class MergeTwoSortedLists {
    public static void main(String[] args) {
        SLL list1 = new SLL();
        SLL list2 = new SLL();
        
        list1.insertLast(1);
        list1.insertLast(2);
        list1.insertLast(4);
        list2.insertLast(1);
        list2.insertLast(3);
        list2.insertLast(4);
        SLL list = merge(list1, list2);
        list.display();
        
        
    }

    public static SLL merge(SLL list1, SLL list2){

        SLL.Node one = list1.head;
        SLL.Node two = list2.head;
        SLL list = new SLL();

        while(one != null && two != null){
            if(one.value <= two.value){
                list.insertLast(one.value);
                one = one.next;
            }
            else{
                list.insertLast(two.value);
                two = two.next;
            }
        }

        while(one != null){
            list.insertLast(one.value);
            one = one.next;
        }

        while(two != null){
            list.insertLast(two.value);
            two = two.next;
        }

        return list;

    }
}
