package DsaPatterns.TwoPointers;

import java.util.*;

public class DuplicateZeros {
    public static void main(String[] args) {
        int arr[] = {1,0,2,3,0,4,5,0};
        int nums[] = duplicateZeros_notInPlace(arr);
        System.out.println(Arrays.toString(nums));
    }    

    public static int[] duplicateZeros_notInPlace(int arr[]){
        int nums[] = new int[arr.length];
        int k =0;

        for(int i = 0;i < arr.length;i++){
            if(arr[i] != 0){
                nums[k] = arr[i];
                k++;
            }else if(arr[i] == 0){
                nums[k] = arr[i];
                nums[k+1] = arr[i];
                k += 2;
            }
            if(k >= nums.length){
                break;
            }
        }
        return nums;
    }
}
