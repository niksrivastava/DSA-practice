package com.nikhil.Arrays.Questions;
// import java.util.*;
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int [] nums = {0,0,1,1,1,2,2,3,3,4};
        int ans = dup(nums);
        System.out.println(ans);
    }
    static int dup(int[] nums){
        int i = 0;
        int j = 1;
        int n = nums.length;
            while ( j < n) {

                if(nums[i] == nums[j]){
                    j++;
            }
            else{
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return i+1;
    }
}


