package com.nikhil.DsaPatterns.SlidingWindow;

public class LongestHarmoniousSubsequence {
    public static void main(String[] args) {
        int arr [] = {1,3,2,2,5,2,3,7};
        int ans = harmonious(arr);
        System.out.println(ans);     
    }

    public static int harmonious(int arr[]){
        int ans = 0;
        int maxAns = 0;
        int low = 0;
        int max = 0;
        int lowMax = 0;
        int highMax = 0;
        int min = 1;

        while(low < arr.length-1){
            int high = low+1;
            while(high< arr.length){
                int diff = Math.abs(arr[low]-arr[high]);
                if(diff == 1){
                    if(arr[low] < arr[high]){
                        lowMax++;
                    }
                    else{
                        highMax++;
                    }
                    
                    high++;
                }
                else if(diff == 0){
                    min++;
                    high++;
                }
                else{
                    high++;
                }
            }

            if (lowMax > highMax) {
                max = lowMax;
            } else {
                max = highMax;
            }

            lowMax = 0;
            highMax = 0;

            if(max > 0){
                ans = min + max;
                maxAns = Math.max(maxAns, ans);
            }
            else{
                maxAns = Math.max(maxAns, ans);
            }
            
            max = 0;
            min = 1;
            ans = 0;
            low++;
        }

        return maxAns;

    }
}
