package com.nikhil.DsaPatterns.SlidingWindow;

import java.util.Arrays;

public class MinimumDifferenceBetweenHighestAndLowestOfKScores {
    public static void main(String[] args) {
        int arr[] = {9};
        int k = 1;
        int ans = minScore(arr, k);
        System.out.println(ans);
    }

    public static int minScore(int arr[], int k){
        Arrays.sort(arr);
        int ans = 0;
        int minAns = Integer.MAX_VALUE;
        int low = 0;
        int high = k-1; 
        while(high < arr.length){

                ans = Math.abs(arr[low] - arr[high]);
                minAns = Math.min(ans, minAns);

            low++;
            high++;
        }
        
        return minAns;
    }
}
