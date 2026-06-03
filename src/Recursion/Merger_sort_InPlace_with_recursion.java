package Recursion;

import java.util.Arrays;

public class Merger_sort_InPlace_with_recursion {
    public static void main(String[] args) {
        int arr[] = {6,2,3,7,5,9,1};
        merge_sort_InPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void merge_sort_InPlace(int arr[], int s, int e){

        if(e -s == 1){
            return;
        }

        int mid = s + (e-s)/2;

        merge_sort_InPlace(arr, s, mid);
        merge_sort_InPlace(arr, mid, e);

        merge_sort_InPlace(arr, s, mid, e);
    }

    private static void merge_sort_InPlace(int[] arr, int s, int m, int e){

        int mix[] = new int[e-s];

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {

            if(arr[i] < arr[j]){
                mix[k++] = arr[i++];
            }
            else{
                mix[k++] = arr[j++];
            }
        }

        while(i < m){
            mix[k++] = arr[i++];
        }

        while(j < e){
            mix[k++] = arr[j++];
        }
        
        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}
