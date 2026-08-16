package DsaPatterns.TwoPointers;

import java.util.*;

public class SortArrayByParity2 {

    public static void swap(int arr[], int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    public static void main(String[] args) {
        int arr[] = {1,4,2,5,7,8};
        int nums[] = sortArrayByParity2(arr);
        System.out.println(Arrays.toString(nums));
        
    }
    public static int[] sortArrayByParity2(int arr[]){

        int i = 0;
        int j = 1;

        while(i < arr.length && j < arr.length){
            if(arr[i]%2 == 0 && i%2 == 0){
                i += 2;
            }
            if(arr[j]%2 != 0 && j%2 != 0){
                j += 2;
            }else if((arr[i]%2 != 0 && i%2 == 0) && (arr[j]%2 == 0 && j%2 != 0)){
                swap(arr,i,j);
                i += 2;
                j += 2;
            }
        }
        return arr;
    }
}
