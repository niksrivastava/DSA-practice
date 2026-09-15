package com.nikhil.DsaPatterns.TwoPointers;

public class TrappingRainWater {
    public static void main(String[] args) {
        int arr[] = {4,2,0,3,2,5};
        int ans = trap(arr);
        System.out.println(ans);
        int betterAns = better(arr);
        System.out.println(betterAns);
        int optimalAns = optimal(arr);
        System.out.println(optimalAns);
        
    }
    public static int trap(int arr[]){

        int ans = 0;

        for (int i = 0; i < arr.length; i++) {

            int leftMax = 0;            
            
            for (int j = 0; j <= i; j++) {
                leftMax = Math.max(leftMax, arr[j]);
            }
            
            int rightMax = 0;
            
            for (int j = i; j < arr.length; j++) {

                rightMax = Math.max(rightMax, arr[j]);
            }
            ans += Math.min(leftMax, rightMax) - arr[i];
        }

        return ans;
    }

    public static int better(int arr[]){

        int ans = 0;
        int n = arr.length;
        int lMax[] = new int[arr.length];
        int rMax[] = new int[arr.length];

        lMax[0] = arr[0];
        rMax[n-1] = arr[n-1];

        for (int i = 1; i < n; i++) {
            lMax[i] = Math.max(lMax[i-1], arr[i]);
        }

        for (int i = n-2; i >= 0; i--) {
            rMax[i] = Math.max(rMax[i+1], arr[i]);
        }

        for (int i = 0; i < n; i++) {
            ans += Math.min(lMax[i], rMax[i]) - arr[i];
        }

        return ans;
    }

    public static int optimal(int arr[]){

        int n = arr.length;
        int ans = 0;
        int l = 0;
        int r = n-1;
        int lMax = 0;
        int rMax = 0;

        while(l<r){

            lMax = Math.max(lMax, arr[l]);
            rMax = Math.max(rMax, arr[r]);

            if(lMax < rMax){
                ans += lMax - arr[l];
                l++;
            }
            else{
                ans += rMax - arr[r];
                r++;
            }
        }

        return ans;
    }
}
