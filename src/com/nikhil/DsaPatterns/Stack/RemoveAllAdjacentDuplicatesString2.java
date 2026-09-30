package com.nikhil.DsaPatterns.Stack;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesString2 {
    public static void main(String[] args) {
        String s = "deeedbbcccbdaa";
        String ans = removeAdjacent(s,3);
        System.out.println(ans);
    }

    public static String removeAdjacent(String s, int k){
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{s.charAt(0), 1});

        for (int i = 1; i < s.length(); i++) {

            if (!stack.isEmpty() && stack.peek()[0] == s.charAt(i)) {

                if (stack.peek()[1] < k - 1) {
                    stack.peek()[1]++;
                } else {
                    stack.pop();
                }

            } else {
                stack.push(new int[]{s.charAt(i), 1});
            }
        }

        s = "";

        while (!stack.isEmpty()) {
            
            int[] pair = stack.pop();
            for (int i = 0; i < pair[1]; i++) {
                s = (char)pair[0] + s;
            }
        }

        return s;
    }
}
