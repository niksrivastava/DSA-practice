package com.nikhil.DsaPatterns.Stack;

import java.util.ArrayList;
import java.util.Stack;

public class NextSmallerElement {
    public static void main(String[] args) {
        int arr[] = {4, 8, 5, 2, 25};
        ArrayList<Integer> list = nextSmaller(arr);
        System.out.println(list);
    }

    public static ArrayList<Integer> nextSmaller(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0, -1);
        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length-1]);

        for (int i = arr.length-2; i >= 0; i--) {
            while(!st.isEmpty() && st.peek() >= arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                list.add(0,-1);

            }else{
                list.add(0,st.peek());
                
            }
            st.push(arr[i]);
        }
        return list;
    }
}
