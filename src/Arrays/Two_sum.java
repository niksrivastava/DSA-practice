package Arrays;
import java.util.*;
public class Two_sum {
    public static void main(String[] args) {
        int [] nums = {2,7,11,19};
        int target = 30;
        int ans[] = sum(nums, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] sum(int[] nums, int target){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i==j){
                    continue;
                }
                sum = nums[i] + nums[j];
                if(sum == target){
                    return new int [] {i+1, j+1};
                } 
                sum = 0;  
            }
        }
         return new int[]{};
    }
}
