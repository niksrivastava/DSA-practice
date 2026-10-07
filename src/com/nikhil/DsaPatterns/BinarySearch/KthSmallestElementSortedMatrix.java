package com.nikhil.DsaPatterns.BinarySearch;

public class KthSmallestElementSortedMatrix {
    public static void main(String[] args) {
        int arr[][] = {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };
        int ans = BS(arr, 11);
        System.out.println(ans);
    }

    public static int BS(int arr[][], int k){
        int n = arr.length;
        int m = arr[0].length;
        int s = arr[0][0];
        int e = arr[n-1][m-1];
        int result = -1;

        while(s <= e){
            int mid = s - (s-e)/2;
            int ans = helper(arr, n, m, mid);

            if(ans < k){
                s = mid + 1;
            }
            else{
                result = mid;
                e = mid - 1;
            }
        }
        return result;
    }

    public static int helper(int arr[][], int n, int m, int mid){
        int row = n-1;
        int col = 0;
        int count = 0;
        while(row >= 0 && col < m){
            if(arr[row][col] <= mid){
                count = count + row + 1;
                col++;
            }
            else{
                row--;
            }
        }
        return count;
    }
}
