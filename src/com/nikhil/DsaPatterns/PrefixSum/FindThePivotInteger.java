package com.nikhil.DsaPatterns.PrefixSum;

public class FindThePivotInteger {
    public static void main(String[] args) {
        int n = 4;
        int ans = pivot(n);
        System.out.println(ans);
    }

    public static int pivot(int n){
        int prefix = 0;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        int suffix = 0;

        for (int i = 1; i <= n; i++) {
            prefix = prefix + i-1;
            suffix = sum - prefix - i;     

            if(prefix == suffix){
                return i;
            }
        }
        return -1;
    }
}