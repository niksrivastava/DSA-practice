package Arrays;

import java.util.Arrays;

public class Majority_ele {
    public static void main(String[] args) {
        int [] nums = {0};
        int ans = ele(nums);
        System.out.println(ans);
    }
    static int ele(int [] nums){
        int count = 0;
        int count_max1 = 0;
        int store = 0;
        int ele = nums[0];
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]){
                count = count + 1;
                count_max1 = Math.max(count_max1, count);
                if(count_max1> store){
                    ele = nums[i];
                }
            }
            else{
                store = count_max1;
                count = 0;
                count = count + 1;
                
            }
        }
        return ele;
    }
}
