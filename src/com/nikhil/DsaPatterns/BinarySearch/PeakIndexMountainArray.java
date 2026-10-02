package com.nikhil.DsaPatterns.BinarySearch;

public class PeakIndexMountainArray {
    public static void main(String[] args) {
        int arr[] = {0,10,5,2};
        int ans = mountain(arr);
        System.out.println(ans);
    }

    public static int mountain(int arr[]){
        int s = 0;
        int e = arr.length-1;
        int m = s - (s-e)/2;

        while(s <= e){
            if(arr[m] < arr[m+1]){
                s = m+1;
            }
            else{
                e = m-1;
            }
            m = s - (s-e)/2;
        }
        return s;
    }
}
