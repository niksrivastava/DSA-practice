package com.nikhil.StacksAndQueues.Questions;

import java.util.Stack;

public class ImplementQueueUsingStacks{
    private Stack<Integer> first;
    private Stack<Integer> second;

    public ImplementQueueUsingStacks(){
        first = new Stack<>();
        second = new Stack<>();

    }

    public void add(int item){
        first.push(item);
    }

    public int remove() throws Exception{
        while(!first.isEmpty()){
            second.push(first.pop());
        }

        int removed = second.pop();

        while(!second.isEmpty()){
            first.push(second.pop());
        }

        return removed;
    }

    public int peek() throws Exception{
        while(!first.isEmpty()){
            second.push(first.pop());
        }

        int peeked = second.peek();

        while(!second.isEmpty()){
            first.push(second.pop());
        }

        return peeked;
    }

    public boolean isEmpty(){
        return first.isEmpty();
    }
}


class ImplementQueueUsingStacksRemoveEfficient{
    private Stack<Integer> first;
    private Stack<Integer> second;

    public ImplementQueueUsingStacksRemoveEfficient(){
        first = new Stack<>();
        second = new Stack<>();

    }

    public void add(int item) throws Exception{
        while(!first.isEmpty()){
            second.push(first.pop());
        }

        first.push(item);

        while(!second.isEmpty()){
            first.push(second.pop());
        }
    }

    public int remove() throws Exception{
        return first.pop();
    }

    public int peek() throws Exception{
        return first.peek();
    }

    public boolean isEmpty(){
        return first.isEmpty();
    }
}
