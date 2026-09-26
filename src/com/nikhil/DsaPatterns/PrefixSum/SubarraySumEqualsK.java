package com.nikhil.DsaPatterns.PrefixSum;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int ans = subarraySums(arr, 3);
        System.out.println(ans);
    }

    public static int subarraySums(int arr[], int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            int seen = sum - k;
            int freq = map.getOrDefault(seen, 0);
            res += freq;
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return res;
    }
}
