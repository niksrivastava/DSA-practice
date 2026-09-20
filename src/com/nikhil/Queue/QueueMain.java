package com.nikhil.Queue;

public class QueueMain {
    public static void main(String[] args) throws Exception{
        CustomQueue queue = new CustomQueue(5);
        queue.insert(45);
        queue.insert(42);
        queue.insert(3);
        queue.insert(5);
        queue.insert(4);

        queue.display();

        System.out.println(queue.remove());

        queue.display();
    }
}
