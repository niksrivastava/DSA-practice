package com.nikhil.DsaPatterns.PrefixSum;
import java.util.*;
public class LeftAndRightSumDifferences {
    public static void main(String[] args) {
        int arr[] = {10,4,8,3};
        int ans[] = sumDifferences(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] sumDifferences(int arr[]){
        int[] ans =  new int[arr.length];
        int pre = 0;
        int suf = 0;
        int sum = 0;

        for (int i = 0; i < ans.length; i++) {
            sum += arr[i];
        }

        for (int i = 0; i < ans.length; i++) {
            suf = sum - pre -arr[i];
            ans[i] = Math.abs(pre-suf);
            pre = pre + arr[i];
        }
        return ans;
    }
}
