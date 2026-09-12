package com.nikhil.DsaPatterns.SlidingWindow;

import java.util.Arrays;

public class DefuseTheBomb {
    public static void main(String[] args) {
        int arr[] = {2,4,9,3};
        int k = -2;
        int ans[] = decript(arr, k);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] decript(int arr[] , int k){

        int result[] = new int[arr.length];

        int n = arr.length;

        if(k == 0){
            for (int i = 0; i < arr.length; i++) {
                result[i] = 0;
            }
        }
        else if(k > 0){
            for (int i = 0; i < arr.length; i++) {

                for (int j = 1; j <= k ; j++) {
                    result[i] +=  arr[(i+j)%n];
                }
            }
        }
        else{
            for (int i = 0; i < arr.length; i++) {

                for (int j = 1; j <= -k; j++) {
                    result[i] += arr[(i-j+n)%n];
                }
            }
        }

        return result;
        
    }
}
