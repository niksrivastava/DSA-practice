package com.nikhil.DsaPatterns.Stack;

import java.util.ArrayList;
import java.util.Stack;

public class PreviousGreaterElement {
    public static void main(String[] args) {
        int arr[] = {10, 4, 2, 20, 40, 12, 30};
        ArrayList<Integer> list = previousGreater(arr);
        System.out.println(list);
    }

    public static ArrayList<Integer> previousGreater(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1);
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                list.add(-1);

            }else{
                list.add(st.peek());
                
            }
            st.push(arr[i]);
        }
        return list;

    }
}