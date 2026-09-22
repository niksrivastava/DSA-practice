package com.nikhil.DsaPatterns.SlowAndFastPointer;

public class MaximumTwinSumLinkedList {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(5);

        int ans = maxSum(list.head);
        System.out.println(ans);
    }

    public static int maxSum(LL.Node head){
        int maxSum = 0;

        LL.Node dummy = new LL.Node(0);
        dummy.next = head;

        LL.Node fast = dummy;
        LL.Node slow = dummy;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        LL.Node prev = slow;
        LL.Node present = slow.next;

        while(present != null){
            LL.Node next = present.next;
            present.next = prev;
            prev = present;
            present = next;
        }

        LL.Node left = head;
        LL.Node right = prev;

        while(slow != right){
            maxSum = Math.max(left.value + right.value, maxSum);
            left = left.next;
            right = right.next;
        }

        return maxSum;
    }
}
