package com.nikhil.DsaPatterns.BinarySearch;

public class CeilInSortedArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 8, 10, 11, 12, 19};
        int ans = BS(arr, 0);
        System.out.println(ans);
    }

    public static int BS(int arr[], int x){

        if(x < arr[0]){
            return 0;
        }
        else if(x > arr[arr.length-1]){
            return -1;
        }

        int s = 0;
        int e =arr.length-1;
        int m = s - (s-e)/2;
        int ceil = Integer.MAX_VALUE;

        while(s <= e){
            if(arr[m] >= x){
                ceil = Math.min(m, ceil);
                e = m-1;
            }

            if(arr[m] < x){
                s = m+1;
            }

            m = s - (s-e)/2;
        }

        if(ceil != Integer.MAX_VALUE){
            return ceil;
        }
        return -1;
    }
}
