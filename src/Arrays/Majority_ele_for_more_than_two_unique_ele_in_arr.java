package Arrays;

import java.util.Arrays;

public class Majority_ele_for_more_than_two_unique_ele_in_arr {
    public static void main(String[] args) {
        int [] nums = {1,1,2,2,2,3,3,3,3};
        int ans = ele(nums);
        System.out.println(ans);
    }
    static int ele(int [] nums){
        int count = 0;
        int count_max = 0;
        int store = 0;
        int ele = nums[0];
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]){
                count = count + 1;
                count_max = Math.max(count_max, count);
                if(count_max> store){
                    ele = nums[i];
                }
            }
            else{
                store = count_max;
                count = 0;
                count = count + 1;
                
            }
        }
        return ele;
    }
}
