package com.nikhil.DsaPatterns.PrefixSum;

public class SmallestMissingIntegerGreaterThanEqualToSequentialPrefixSum {
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,12,14,13};
        int ans = missingInteger(arr);
        System.out.println(ans);
    }

    public static int missingInteger(int arr[]){
        int prefix = 0;
        int i = 1;

        if(arr.length == 1){
            return arr[0] + 1;
        }

        while(i < arr.length){
            prefix = prefix + arr[i-1];
            if(arr[i-1] >= arr[i] || arr[i-1] + 1 < arr[i]){
                break; 
            }
            i++;
        }

        if(i == arr.length){
            prefix += arr[arr.length-1];
            
        }
        
        i = 0;
        int ans = prefix;

        while(i < arr.length){
            if(arr[i] == ans){
                ans = ans + 1;
                i = 0;
            }
            i++;
        }

        return ans;
    }
}
