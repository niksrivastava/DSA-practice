package Arrays;
import java.util.*;

public class Shift_ele_by_one_pos {
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50,60,70};
        int ans[] = shift(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] shift(int[] nums){

        int store = nums[nums.length-1];
        System.out.println(store);
        for (int i = nums.length-1; i > 0; i--) {      
            nums[i] = nums[i-1]; 
        }
        nums[0] = store;
        return nums;
    }
}
