package com.nikhil.DsaPatterns.PrefixSum;

public class FindMiddleIndexArray {
    public static void main(String[] args) {
        int arr[] = {4,0};
        int ans = middle(arr);
        System.out.println(ans);
    }

    public static int middle(int arr[]){
        int pre = 0;
        int suf = 0;
        int sum = 0;

        if(arr.length == 1){
            return 0;
        }

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            
            suf = sum - pre - arr[i];

            if(pre == suf){
                return i;
            }
            pre = pre + arr[i];
        }
        return -1;
    }
}
