package com.nikhil.DsaPatterns.SlidingWindow;

public class LongestContinuousIncreasingSubsequence {
    public static void main(String[] args) {
        int arr[] = {1,3,5,4,7};
        int ans = longest(arr);
        System.out.println(ans);
        System.out.println(longestWithForLoop(arr));
    }

    public static int longest(int arr[]){
        int ans= 1;
        int maxAns = 1;

        int low = 0;
        int high = low;

        while(high < arr.length-1){
            if(arr[high] < arr[high+1]){
                ans++;
                maxAns = Math.max(maxAns, ans);
                high++;
            }
            else{
                ans = 1;
                low = high;
                high++;
            }
        }
        return maxAns;

    }

    public static int longestWithForLoop(int arr[]) {

    int count = 1;
    int maxCount = 1;

    for (int i = 1; i < arr.length; i++) {

        if (arr[i - 1] < arr[i]) {
            count++;
            maxCount = Math.max(maxCount, count);
        } else {
            count = 1;
        }
    }

    return maxCount;
}
}
