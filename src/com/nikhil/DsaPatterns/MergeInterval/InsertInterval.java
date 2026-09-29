package com.nikhil.DsaPatterns.MergeInterval;

import java.util.Arrays;

public class InsertInterval {
    public static void main(String[] args) {
        int arr[][] = {
            {1,3},
            {6,9},
        };

        int arr2[] = {2,5};

        int ans[][] = insert(arr, arr2);
        System.out.println(Arrays.deepToString(ans));
    }

    public static int[][] insert(int arr[][], int arr2[]) {

        int newArr[][] = new int[arr.length+1][2];
        
        int ind = 0;

        for (int i = 0; i < arr.length; i++) {
                newArr[ind][0] = arr[i][0]; 
                newArr[ind][1] = arr[i][1];
                ind++;
        }

        newArr[ind][0] = arr2[0];
        newArr[ind][1] = arr2[1];

        arr = newArr;

        Arrays.sort(arr, (a,b) -> Integer.compare(a[0], b[0]));
        int result[][] = new int[arr.length][2];

        int start1 = arr[0][0];
        int end1 = arr[0][1];

        ind = 0;

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
