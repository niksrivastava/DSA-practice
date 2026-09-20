package com.nikhil.StacksAndQueues.Queue;

public class QueueMain {
    public static void main(String[] args) throws Exception{
        DynamicQueue queue = new DynamicQueue(5);
        queue.insert(45);
        queue.insert(42);
        queue.insert(3);
        queue.insert(5);
        queue.insert(34);
        queue.insert(4);


        queue.display();

        // System.out.println(queue.remove());
        // queue.insert(33);
        // queue.display();

        // System.out.println(queue.remove());
        // queue.insert(99);
        // queue.display();
    }
}
