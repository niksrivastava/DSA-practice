package com.nikhil.DsaPatterns.BinarySearch;

import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 8, 9};
        int ans = aggressiveCows(arr, 3);
        System.out.println(ans);
    }

    public static int aggressiveCows(int arr[], int k){
        Arrays.sort(arr);
        int s = 1;
        int e = arr[arr.length-1] - arr[0];
        int result = -1;

        while (s <= e) {
            int m = s - (s-e)/2;
            if(helper(arr, k, m)){
                result = m;
                s = m+1;
            }
            else{
                e = m-1;
            }
        }
        return result;
    }

    public static boolean helper(int arr[], int k, int m){
        int cows = 1;
        int prevPos = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int dist = arr[i] - prevPos;
            if(dist < m){
                continue;
            }
            cows++;
            prevPos = arr[i];
        }

        if(cows >= k){
            return true;
        }
        return false;
    }
}
