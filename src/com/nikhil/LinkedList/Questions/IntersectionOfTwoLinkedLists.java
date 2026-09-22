package com.nikhil.LinkedList.Questions;

import java.util.HashSet;

import com.nikhil.LinkedList.SLL;

public class IntersectionOfTwoLinkedLists {
    public static void main(String[] args) {
        SLL listA = new SLL();
        SLL listB = new SLL();

        listA.insertLast(4);
        listA.insertLast(1);
        listA.insertLast(8);
        listA.insertLast(4);
        listA.insertLast(5);

        listB.insertLast(5);
        listB.insertLast(6);
        listB.insertLast(1);
        listB.insertLast(8);
        listB.insertLast(4);
        listB.insertLast(5);

        SLL.Node ans = intersectionNode(listA.head, listB.head);
        System.out.println(ans);
    }

    public static SLL.Node intersectionNode(SLL.Node headA, SLL.Node headB){

        HashSet<SLL.Node> set = new HashSet<>();

        SLL.Node first = headA;
        SLL.Node second = headB;

        while(first != null){
            set.add(first);
            first = first.next;
        }

        while(second != null){
            if(set.contains(second)){
                return second;
            }
            second = second.next;
        }

        return null;
    } 
}
