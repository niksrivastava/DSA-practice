package com.nikhil.DsaPatterns.BinarySearch;

public class Search2DMatrix2 {
    public static void main(String[] args) {
        int arr[][] = {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };
        boolean ans = BS2(arr, 16);
        System.out.println(ans);
    }
    public static boolean BS2(int arr[][], int target){
        int n = arr.length;
        int m = arr[0].length;
        int row = n-1;
        int col = 0;
        while(row >= 0 && col < m){
            if(arr[row][col] == target){
                return true;
            }

            if(arr[row][col] > target){
                row--;
            }
            else{
                col++;
            }
        }
        return false;
    }
}
