package com.nikhil.DsaPatterns.MergeInterval;

import java.util.*;

public class IntervalListIntersections {
    public static void main(String[] args) {
        int a[][] = {
            {1,3},
            {6,9},
        };
        int b[][] = {
            {1,3},
            {2,6},
            {8,10},
            {15,18}
        };

        int ans[][] = intervalIntersection(a, b);
        System.out.println(Arrays.deepToString(ans));
    }

    public static int[][] intervalIntersection(int a[][], int b[][]){
        int result[][] = new int[a.length+b.length][2];
        int j = 0;
        int i = 0;
        int ind = 0;
        while(i < a.length && j < b.length){

            int start1 = a[i][0];
            int end1 = a[i][1];
            int start2 = b[j][0];
            int end2 = b[j][1];

            if(start1 <= start2){
                if(end1 >= start2){
                    int s = Math.max(start1, start2);
                    int e = Math.min(end1, end2);

                    result[ind][0] = s;
                    result[ind][1] = e;
                    ind++;
                }

            }else{
                if(end2 >= start1){
                    int s = Math.max(start1, start2);
                    int e = Math.min(end1, end2);

                    result[ind][0] = s;
                    result[ind][1] = e;
                    ind++;
                }

            }

            if(end1 <= end2){
                i++;

            }
            else{
                j++;
            }
        }

        return Arrays.copyOf(result, ind);
        
    }
}
