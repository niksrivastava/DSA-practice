package com.nikhil.DsaPatterns.PrefixSum;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] arr= {1};
        int ans = pivot(arr);
        System.out.println(ans);
        int betterAns = better(arr);
        System.out.println(betterAns);
        int optimizedAns = optimized(arr);
        System.out.println(optimizedAns);
    }
    public static int pivot(int[] arr){
        int i_sum = 0;
        int j_sum = 0;

        if(arr.length == 1){
            return arr.length-1;
        }

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {
                if(j>arr.length-1){
                    j_sum = 0;
                    break;
                }else
                    {
                    j_sum += arr[j];
                }
            }
            if(i_sum == j_sum){
                return i;

            }
            else{
                i_sum += arr[i];
            }
            j_sum = 0;
        }

        return -1;
    }

    public static int better(int[] arr){
        int i = 1;
        int j = arr.length-2;
        int[] prefix = new int[arr.length];
        int[] suffix = new int[arr.length];

        if(arr.length == 1){
            return arr.length-1;
        }

        while(i < prefix.length && j >= 0) {
            prefix[i] = prefix[i-1] + arr[i-1];
            i++;

            suffix[j] = suffix[j+1] + arr[j+1];
            j--;
        }

        for(int k = 0; k < arr.length; k++){
            if(prefix[k] == suffix[k]){
                return k;
            }
        }
        return -1;
    }

    public static int optimized(int arr[]){
        int prefix = 0;
        int sum = 0;

        if(arr.length == 1){
            return arr.length-1;
        }

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int suffix = sum - prefix - arr[i];

            if(prefix == suffix){
                return i;
            }
            prefix += arr[i];
        }
        return -1;
    }
}
