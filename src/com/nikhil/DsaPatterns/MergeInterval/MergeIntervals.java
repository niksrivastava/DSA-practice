package com.nikhil.DsaPatterns.MergeInterval;

import java.util.Arrays;

public class MergeIntervals {
    public static void main(String[] args) {
        int arr[][] = {
            {1,3},
            {2,6},
            {8,10},
            {15,18}
        };

        int ans[][] = checkMerge(arr);
        System.out.println(Arrays.deepToString(ans));
    }

    public static int[][] checkMerge(int arr[][]){

        Arrays.sort(arr, (a,b) -> Integer.compare(a[0], b[0]));
        int result[][] = new int[arr.length][2];
        int start1 = arr[0][0];
        int end1 = arr[0][1];

        int ind = 0;

        for (int i = 1; i < arr.length; i++) {
            int start2 = arr[i][0];
            int end2 = arr[i][1];
            if(end1 >= start2){
                end1 = Math.max(end1, end2);
            }
            else{
                result[ind][0] = start1;
                result[ind][1] = end1;
                ind++;

                start1 = start2;
                end1 = end2;
            }
        }
        result[ind][0] = start1;
        result[ind][1] = end1;
        ind++;
        return Arrays.copyOf(result, ind);
    }
}
