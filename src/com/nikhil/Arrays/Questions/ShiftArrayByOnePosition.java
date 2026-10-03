package com.nikhil.Arrays.Questions;
import java.util.Arrays;
public class ShiftArrayByOnePosition {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        shift(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void shift(int[] arr){
        int n = arr.length-1;
        int temp = arr[arr.length-1];
        for(int i = n; i>0; i--){
            arr[i]= arr[i-1];
        }
        arr[0]= temp;
    }
}
