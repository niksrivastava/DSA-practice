package com.nikhil.DsaPatterns.Stack;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        int arr[] = {73,74,75,71,69,72,76,73};
        int[] ans = dailyTemperatures(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] dailyTemperatures(int arr[]){
        int res[] = new int[arr.length];
        res[arr.length-1] = 0;

        Stack<Integer> st = new Stack<>();
        st.push(arr.length-1);

        for(int i = arr.length-2; i >= 0; i--){

            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                res[i] = 0;

            }else{
                res[i]= st.peek()-i;
                
            }
            st.push(i);
        } 

        return res;
    }
}
