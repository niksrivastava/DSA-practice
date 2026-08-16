package DsaPatterns.TwoPointers;

import java.util.Arrays;

public class SortArrayByParity {

    public static void swap(int arr[], int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    public static void main(String[] args) {
        int arr[] = {6,3,1,2,5,4};
        int [] nums = sortArrayByParity(arr);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] sortArrayByParity(int arr[]){
        int i = 0;
        int j = arr.length-1;
        while(i <= j){

            if(arr[i]%2 == 0){
                i++;
            }
            else if(arr[j]%2 != 0){
                j--;
            }
            else if(arr[i]%2 != 0 && arr[j]%2 == 0){
                swap(arr, i, j);
                i++;
                j--;
            }

        }
        return arr;
    }
}
