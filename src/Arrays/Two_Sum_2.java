package Arrays;

import java.util.Arrays;

public class Two_Sum_2 {
    public static void main(String[] args) {
        int [] nums = {2,7,11,19};
        int target = 30;
        int ans[] = sum(nums, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] sum(int[] nums, int target){
        int sum = 0;

        int i = 0;
        int j = nums.length-1;
        while(i<j){
            sum = nums[i] + nums[j];
            if(sum == target){
                    return new int [] {i+1, j+1};
                } 
            else if(sum > target){
                j--;
            }
            else{
                i++;
            }
        }


         return new int[]{};
    }
}
