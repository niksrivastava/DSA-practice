package com.nikhil.DsaPatterns.KadanesAlgorithm;

public class MaximumSubarraySumWithOneDeletion {
    public static void main(String[] args) {
        int arr[] = {1,-2,0,3};
        int ans = oneDelete(arr);
        System.out.println(ans);
    }

    public static int oneDelete(int arr[]){
        int noDelete = arr[0];
        int oneDelete = Integer.MIN_VALUE;
        int res = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int prevNoDelete = noDelete;
            int prevOneDelete = oneDelete;

            noDelete = Math.max(noDelete+arr[i], arr[i]);

            int temp;
            if(prevOneDelete == Integer.MIN_VALUE){
                temp = arr[i];
            }
            else{
                temp = prevOneDelete + arr[i];
            }

            oneDelete = Math.max(temp, prevNoDelete);
            res = Math.max(res, Math.max(noDelete, oneDelete));
        }
        return res;
    }
}
