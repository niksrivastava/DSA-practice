package DsaPatterns.TwoPointers;

import java.util.*;

public class DuplicateZeros {
    public static void main(String[] args) {
        int arr[] = {0,0,0,0,0,0,0};
        int nums[] = duplicateZeros_notInPlace(arr);
        int num[] = duplicateZeros_InPlace(arr);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(num));
    }    

    public static int[] duplicateZeros_notInPlace(int arr[]){
        int nums[] = new int[arr.length];
        int k = 0;

        for(int i = 0;i < arr.length;i++){
            if(arr[i] != 0){
                nums[k] = arr[i];
                k++;
            }else{
                nums[k] = arr[i];
                if(k+1 < arr.length){
                    nums[k+1] = arr[i];
                }
                
                k += 2;
            }
            if(k >= nums.length){
                break;
            }
        }
        return nums;
    }
    public static int[] duplicateZeros_InPlace(int arr[]){

        for(int i =0; i < arr.length; i++){
            if(arr[i] == 0){
                for(int j = arr.length-1; j > i; j--){
                    arr[j] = arr[j-1];
                }

                if(i < arr.length-1){
                    arr[i+1] = 0;
                    i++;
                }
                
                
            }
        }
        return arr;
    }
}
