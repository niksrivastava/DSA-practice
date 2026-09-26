package com.nikhil.DsaPatterns.PrefixSum;

import java.util.HashMap;

public class ContiguousArray {
    public static void main(String[] args) {
        int arr[] = {0,1,1,1,1,1,0,0,0};
        int ans = longestSubrray(arr);
        System.out.println(ans);
    }

    public static int longestSubrray(int arr[]){
        HashMap <Integer, Integer> map = new HashMap<>();
        int zero = 0;
        int one = 0;
        int diff = zero - one;
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                zero++;
            }
            else{
                one++;
            }

            diff = zero - one;
            if(diff == 0){
                res = Math.max(res, i+1);
                continue;
            }

            if(!map.containsKey(diff)){
                map.put(diff, i);
            }
            else{
                int ind = map.get(diff);
                int len = i - ind;
                res = Math.max(len, res);
            }
        }

        return res;
    }
}
