package com.nikhil.DsaPatterns.BinarySearch;

public class Search2DMatrix {
    public static void main(String[] args) {
        int arr[][] = {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };
        boolean ans = BS(arr, 16);
        System.out.println(ans);
    }

    public static boolean BS(int matrix[][], int target){
        int m = matrix.length;
        int n = matrix[0].length;

        int low = 0;
        int high = (m * n) - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int r = mid / n;
            int c = mid % n;

            if (matrix[r][c] == target) return true;
            else if (matrix[r][c] > target) high = mid - 1;
            else low = mid + 1;
        }

        return false;
    }
}
