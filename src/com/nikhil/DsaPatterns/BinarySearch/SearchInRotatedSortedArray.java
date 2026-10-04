package com.nikhil.DsaPatterns.BinarySearch;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int ans = BS(arr, 0);
        System.out.println(ans);
    }

    public static int BS(int arr[], int target){
        int s = 0;
        int e = arr.length-1;

        while(s <= e){
            int m = s - (s-e)/2;
            if(arr[m] == target){
                return m;
            }

            if(arr[m] > arr[arr.length-1]){
                if(arr[m] < target){
                    s = m+1;
                }
                else{
                    if(arr[0] > target){
                        s = m+1;
                    }
                    else{
                        e = m-1;
                    }
                    continue;
                }
            }
            else{
                if(arr[m] > target){
                    e = m-1;
                }
                else{
                    if(arr[arr.length-1] < target){
                        e = m-1;
                    }
                    else{
                        s = m+1;
                    }
                    continue;
                }
            }
        }
        return -1;
    }
}
