package com.nikhil.DsaPatterns.KadanesAlgorithm;

public class MaximumAbsoluteSumOfAnySubarray {
    public static void main(String[] args) {
        int arr[] = {-7,-1,0,-2,1,3,8,-2,-6,-1,-10,-6,-6,8,-4,-9,-4,1,4,-9};
        int ans = maxAbsSum(arr);
        System.out.println(ans);
    }

    public static int maxAbsSum(int arr[]){

        int bestEnd = arr[0];
        int res = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int presBest = bestEnd;
            bestEnd = Math.max(arr[i], presBest + arr[i]);
            res = Math.max(res, bestEnd);
        }

        int maxBest = res;

        res = arr[0];
        bestEnd = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int presBest = bestEnd;
            bestEnd = Math.min(arr[i], presBest + arr[i]);
            res = Math.min(res, bestEnd);
        }

        int minBest = Math.abs(res);

        return Math.max(maxBest, minBest);
    }
}
