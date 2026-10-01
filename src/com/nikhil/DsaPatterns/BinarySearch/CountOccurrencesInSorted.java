package com.nikhil.DsaPatterns.BinarySearch;

public class CountOccurrencesInSorted {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 2, 3};
        int ans = BS(arr, 2);
        System.out.println(ans);
    }

    public static int BS(int arr[], int target){

        if(arr[0] > target || arr[arr.length-1] < target){
            return 0;
        }

        int s = 0;
        int e = arr.length-1;
        int m = s - (s-e)/2;

        int start = arr.length;
        
        while(s <= e){
            if(arr[m] == target){
                start = Math.min(start, m);
                e = m-1;
            }

            else if(arr[m] > target){
                e = m-1;
            }
            else{
                s = m+1;
            }
            m = s - (s-e)/2;
        }

        if(start == arr.length){
            return 0;
        }

        s = 0;
        e = arr.length-1;
        m = s - (s-e)/2;
        int end = -1;

        while(s <= e){
            if(arr[m] == target){
                end = Math.max(end, m);
                s = m+1;
            }

            else if(arr[m] > target){
                e = m-1;
            }
            else{
                s = m+1;
            }
            m = s - (s-e)/2;
        }
        return end - start + 1;
    }
}
