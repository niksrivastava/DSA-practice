package com.nikhil.DsaPatterns.Stack;

import java.util.ArrayList;
import java.util.Stack;

public class PreviousSmallerElement {
    public static void main(String[] args) {
        int arr[] = {1, 6, 2};
        ArrayList<Integer> list = previousSmaller(arr);
        System.out.println(list);
    }

    public static ArrayList<Integer> previousSmaller(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1);
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            while(!st.isEmpty() && st.peek() >= arr[i]){
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
