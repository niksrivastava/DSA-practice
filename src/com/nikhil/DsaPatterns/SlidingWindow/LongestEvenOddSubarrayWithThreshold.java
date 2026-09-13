package com.nikhil.DsaPatterns.SlidingWindow;

public class LongestEvenOddSubarrayWithThreshold {
    public static void main(String[] args) {
        int arr[] = {1};
        int threshold = 1;
        int ans = longestAlternatingSubarray(arr, threshold);
        System.out.println(ans);
    }

    public static int longestAlternatingSubarray(int nums[], int threshold){

        int ans = 0;
        int l = 0;
        int maxAns = 0;

        while(l < nums.length){
            if((nums[l] % 2 != 0 || nums[l] > threshold)){
                l++;
                continue;
            }
            int h = l+1;
            ans = h-l;
            maxAns = Math.max(ans, maxAns);
            
            while(h < nums.length){
                if(nums[h] <= threshold && nums[h] % 2 != nums[h-1] % 2){
                    h++;
                }
                else{
                    break;
                }
                ans = h-l;
                maxAns = Math.max(ans, maxAns);
            }
            l = h;
        }

        return maxAns;

    }
}
