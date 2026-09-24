package com.nikhil.DsaPatterns.KadanesAlgorithm;

public class MaximumSumCircularSubarray {
    public static void main(String[] args) {
        int arr[] = {5,-3,5};
        int ans = maxCircular(arr);
        System.out.println(ans);

    }

    public static int maxCircular(int arr[]){

        int n = arr.length;
        int bestEnd = arr[0];
        int res = arr[0];

        for (int i = 1; i < n; i++) {
            int prevBest = bestEnd;
            bestEnd = Math.max(prevBest+ arr[i], arr[i]);
            res = Math.max(res, bestEnd);
        }

        int A1 = res;
        res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
        }

        int arrSum = res;
        res = arr[0];
        bestEnd = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int prevBest = bestEnd;
            bestEnd = Math.min(prevBest+ arr[i], arr[i]);
            res = Math.min(res, bestEnd);
        }

        if(res == arrSum){
            return A1;
        }

        int A2 = arrSum - res;
        int maxSum = Math.max(A1, A2);
        
        return maxSum;
    }
}
