package com.nikhil.DsaPatterns.SlidingWindow;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int arr[] = {1,0,1,1,0,1};
        int ans = maxConsecutiveOnes(arr);
        System.out.println(ans);
    }

    public static int maxConsecutiveOnes(int arr[]){
        int ans = 0;
        int maxAns = 0;
        int low = 0;
        int high = low;

        while(high < arr.length){
            if(arr[high] == 1){
                ans++;
                maxAns = Math.max(maxAns, ans);
                high++;
            }
            else{
                ans = 0;
                low = high+1;
                high = low;
            }
        }
        return maxAns;
    }
}
