package com.nikhil.DsaPatterns.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {-1,0,3,5,9,12};
        int ans = BS(arr, 9);
        System.out.println(ans);
    }

    public static int BS(int arr[], int target){
        int s = 0;
        int e = arr.length-1;
        int m = s-(s-e)/2;

        while(s <= e){
            if(arr[m] == target){
                return m;
            }

            if(target > arr[m]){
                s = m+1;
            }
            else{
                e = m-1;
            }

            m = s - (s-e)/2;
        }
        return -1;
    }
}
