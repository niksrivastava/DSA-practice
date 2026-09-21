package com.nikhil.StacksAndQueues.Questions;

import java.util.Stack;

public class MinimumAddToMakeParenthesesValid {
    public static void main(String[] args) {
        String s = "(((";
        int ans = minInsertions(s);
        System.out.println(ans);
    }

    public static int minInsertions(String s){

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if(ch == ')'){
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }
                else{
                    stack.push(ch);
                }
            }
            else{
                stack.push(ch);
            }
        }

        return stack.size();
    }
}
