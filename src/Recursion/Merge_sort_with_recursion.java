package Recursion;

import java.util.Arrays;

public class Merge_sort_with_recursion {
    public static void main(String[] args) {
        int arr[] = {6,2,3,7,5,9,1};
        arr = merge_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] merge_sort(int arr[]){

        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = merge_sort(Arrays.copyOfRange(arr, 0, mid));// because copyOfRange method is exclusive
        int[] right = merge_sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second){

        int mix[] = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {

            if(first[i] < second[j]){
                mix[k++] = first[i++];
            }
            else{
                mix[k++] = second[j++];
            }
        }

        while(i < first.length){
            mix[k++] = first[i++];
        }

        while(j < second.length){
            mix[k++] = second[j++];
        }
        return mix;
    }
}
