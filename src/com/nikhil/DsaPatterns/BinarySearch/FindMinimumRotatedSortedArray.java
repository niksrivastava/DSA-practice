package com.nikhil.DsaPatterns.BinarySearch;

public class FindMinimumRotatedSortedArray {
    public static void main(String[] args) {
        int arr[] = {0,1,2};
        int ans = minimum(arr);
        System.out.println(ans);
    }
    public static int minimum(int arr[]){
        int s = 0;
        int e = arr.length-1;

        while(s <= e){
            int m = s - (s-e)/2;
            if(arr[m] > arr[arr.length-1]){
                s = m+1;
            }
            else{
                e = m-1;
            }
        }
        return arr[s];
    }
}
