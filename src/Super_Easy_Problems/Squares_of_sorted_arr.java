package Super_Easy_Problems;
import java.util.Arrays;
public class Squares_of_sorted_arr {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        // int ans[] = sqrs(nums);
        Arrays.sort(sqrs(nums));
        System.out.println(Arrays.toString(nums));
    }
    static int[] sqrs(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i]; 
        }
        return nums;
    }
}
