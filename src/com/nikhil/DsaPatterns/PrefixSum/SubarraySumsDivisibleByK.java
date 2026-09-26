package com.nikhil.DsaPatterns.PrefixSum;

import java.util.HashMap;

public class SubarraySumsDivisibleByK {
    public static void main(String[] args) {
        int arr[] = {5};
        int ans = subarraySumsDivisibleByK(arr, 9);
        System.out.println(ans);
    }

    public static int subarraySumsDivisibleByK(int arr[], int k){
        HashMap <Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0, 1);
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            int rem = Math.floorMod(sum, k);
            int freq = map.getOrDefault(rem, 0);
            res += freq;
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        return res;
    }
}
