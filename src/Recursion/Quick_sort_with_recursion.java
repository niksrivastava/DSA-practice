package Recursion;

import java.util.Arrays;

public class Quick_sort_with_recursion {
    public static void main(String[] args) {
        int arr[] = {6,2,3,7,5,9,1};
        quick_sort_InPlace(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quick_sort_InPlace(int arr[], int low, int high){

        if(low >= high){
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e - s)/2;
        int pivot = arr[m];

        while(s<=e){

            // this is also a reason if it is already sorted, it wil not swap- on the reason to choose quick sort over merge sort.
            while(arr[s]<pivot){
                s++;
            }

            while(arr[e]>pivot){
                e--;
            }

            if(s <= e){
                int t = arr[s];
                arr[s] = arr[e];
                arr[e] = t;
                s++;
                e--;
            }

            quick_sort_InPlace(arr, low, e);
            quick_sort_InPlace(arr, s, high);
        }
    }
}
