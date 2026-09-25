package com.nikhil.DsaPatterns.PrefixSum;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums= {1};
        int ans = pivot(nums);
        System.out.println(ans);
        int optimizedAns = optimized(nums);
        System.out.println(optimizedAns);
    }
    public static int pivot(int[] nums){
        int i_sum = 0;
        int j_sum = 0;

        if(nums.length == 1){
            return nums.length-1;
        }

        for (int i = 0; i < nums.length; i++) {

            for (int j = i+1; j < nums.length; j++) {
                if(j>nums.length-1){
                    j_sum = 0;
                    break;
                }else
                    {
                    j_sum += nums[j];
                }
            }
            if(i_sum == j_sum){
                return i;

            }
            else{
                i_sum += nums[i];
            }
            j_sum = 0;
        }

        return -1;
    }

    public static int optimized(int[] nums){
        int i = 1;
        int j = nums.length-2;
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];

        while(i < prefix.length && j >= 0) {
            prefix[i] = prefix[i-1] + nums[i-1];
            i++;

            suffix[j] = suffix[j+1] + nums[j+1];
            j--;
        }

        for(int k = 0; k < nums.length; k++){
            if(prefix[k] == suffix[k]){
                return k;
            }
        }
        return -1;
    }
}
