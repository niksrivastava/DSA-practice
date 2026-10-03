package com.nikhil.Arrays.Questions;

public class MajorityEleForTwoUniqueEleInArr {
    public static void main(String[] args) {
        int [] nums = {1,1,2,2,2,1,1};
        int ans = ele(nums);
        System.out.println(ans);
    }
    static int ele(int[] nums){
        int ele = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(count == 0){
                ele = nums[i];
            }
            if(nums[i] == ele){
                count++;
            }
            else{
                count--;
            }
        }
        return ele;
    }
}
