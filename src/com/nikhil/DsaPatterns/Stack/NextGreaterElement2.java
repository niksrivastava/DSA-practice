package com.nikhil.DsaPatterns.Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement2 {
    public static void main(String[] args) {
        int arr[] = {1,2,1};
        int[] ans = nextGreater(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] nextGreater(int[] arr){
        int res[] = new int[arr.length];
        res[arr.length-1] = -1;

        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length-1]);

        for(int ind = 2*arr.length-1; ind >= 0; ind--){

            int i = ind % arr.length;
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                res[i] = -1;

            }else{
                res[i]= st.peek();
                
            }
            st.push(arr[i]);
        } 

        return res;
    }
}
