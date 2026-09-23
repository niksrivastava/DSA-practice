package com.nikhil.DsaPatterns.SlowAndFastPointer;

public class DeleteMiddleNodeLinkedList {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(5);

        LL.Node ans = deleteMiddle(list.head);
        System.out.println(ans);

        LL.Node ansOptimized = deleteMiddleOptimized(list.head);
        System.out.println(ansOptimized);
    }

    public static LL.Node deleteMiddle(LL.Node head){
        LL.Node slow = head;
        LL.Node fast = head;
        int size = 0;  

        if (head == null || head.next == null) {
            return null;
        }

        while(fast != null){
            size++;
            fast = fast.next;
        }

        fast = head;

        if(size % 2 == 0){
            while(fast.next != null && fast.next.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }

            slow.next = slow.next.next;
            return head;
        }
        else{
            LL.Node dummy = new LL.Node(0);
            dummy.next = head;
            fast = dummy;
            slow = dummy;
            while(fast.next != null && fast.next.next != null){
                    slow = slow.next;
                    fast = fast.next.next;
                }

            slow.next = slow.next.next;
            return head;
        }
    }   

    public static LL.Node deleteMiddleOptimized(LL.Node head) {

        if (head == null || head.next == null) {
            return null;
        }

        LL.Node slow = head;
        LL.Node fast = head.next;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;

        return head;
    }
}
