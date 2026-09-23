package com.nikhil.DsaPatterns.KadanesAlgorithm;

public class MaxSubarrayProduct {
    public static void main(String[] args) {
        int [] nums = {0, 2};
        int ans = product(nums);
        System.out.println(ans);
        int optimizedAns = optimized(nums);
        System.out.println(optimizedAns);
    }
    static int product(int nums[]){

        int product = 1;
        int max_product = Integer.MIN_VALUE;
        

        for (int i = 0; i < nums.length; i++) {   
            for (int j = i; j < nums.length; j++) {
                product *= nums[j];
                max_product = Math.max(product, max_product);
            }
            product = 1;
        }

        return max_product;

    }

    public static int optimized(int arr[]){
        int result = arr[0];
        int minEnd = arr[0];
        int maxEnd = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int v1 = arr[i];
            int v2 = minEnd*arr[i];
            int v3 = maxEnd*arr[i];

            maxEnd = Math.max(v1, Math.max(v2, v3));
            minEnd = Math.min(v1, Math.min(v2, v3));

            result = Math.max(result, Math.max(maxEnd, minEnd));
        }

        return result;
    }
}
