package com.nikhil.Stack;

public class StackMain {
    public static void main(String[] args) throws Exception{
        CustomStack stack = new CustomStack(5);
        stack.push(45);
        stack.push(42);
        stack.push(3);
        stack.push(5);
        stack.push(4);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
