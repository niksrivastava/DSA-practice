package com.nikhil.Arrays.Questions;

import java.util.*;

public class SumOfEachRow2DArr {
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        List<Integer> ans = sum(arr);
        System.out.println(ans);
    }
    static List<Integer> sum(int[][] arr){
        List<Integer> result = new ArrayList<>();
        int sum = 0;
        for(int row = 0; row<arr.length;row++){
            sum = 0;
            for(int col = 0; col<arr[row].length;col++){
                sum += arr[row][col];
            }
            result.add(sum);
        }

        return result;
    }
}
