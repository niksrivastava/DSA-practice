package com.nikhil.DsaPatterns.Stack;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        String s = "abbaca";
        String ans = removeAdjacent(s);
        System.out.println(ans);
    }

    public static String removeAdjacent(String s){
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(!stack.isEmpty()){
                if(ch == stack.peek()){
                stack.pop();
                continue;
                }
                
            }

            stack.push(ch);
        }

        System.out.println(stack);

        s = "";
        while(!stack.isEmpty()){
            s =stack.pop() + s;

        }

        return s;
    }
}
