package com.nikhil.DsaPatterns.KadanesAlgorithm;

import java.util.ArrayList;

public class KConcatenationMaximumSum {
    public static void main(String[] args) {
        int arr[] = {1,2};
        int ans = maxSum(arr, 3);
        System.out.println(ans);
    
    }

    public static int maxSum(int arr[], int k){
        // Not optimal....
        // ArrayList<Integer> list = new ArrayList<>();

        // int i = 0;
        // while(i < k){
        //     for (int j = 0; j < arr.length; j++) {
        //         list.add(arr[j]);
        //     }
        //     i++;
        // }

        // long bestEnd = list.get(0);
        // long maxSum = list.get(0);

        // for (int j = 1; j < list.size(); j++) {
        //     long prevBest = bestEnd;
        //     bestEnd = Math.max(prevBest+list.get(j), list.get(j));
        //     maxSum = Math.max(maxSum, bestEnd);
        // }

        // return Math.max(0,maxSum) % 1000000007;

        // ............


        //  Optimal approach
        // long sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i] < 0){
        //         sum = 0;
        //         break;
        //     }
        //     sum += arr[i];
        // }

        // if(sum > 0){
        //     return sum*k%1000000007;
        // }

        long bestEnd = arr[0];
        long res = arr[0];

        for (int i = 1; i < arr.length; i++) {
            long prevBest = bestEnd;
            bestEnd = Math.max(prevBest+arr[i], arr[i]);
            res = Math.max(res, bestEnd); 
        }

        long maxSum = res;

        if (maxSum <= 0) {
            return 0;
        }
        
        if (k == 1) {
            return (int)(maxSum % 1000000007);
        }

        long arrSum = 0;

        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }

        bestEnd = arr[0];
        res = arr[0];
        

        for (int i = 1; i < arr.length*2; i++) {
            int value = arr[i % arr.length];
            long prevBest = bestEnd;
            bestEnd = Math.max(prevBest+value, value);
            res = Math.max(res, bestEnd); 
        }

        long circularSum = res;

        if (arrSum > 0) {
            circularSum += (long)(k - 2) * arrSum;
        }

        return (int)(Math.max(maxSum, circularSum) % 1000000007);
    }
}
