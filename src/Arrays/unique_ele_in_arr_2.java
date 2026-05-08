package Arrays;

public class unique_ele_in_arr_2 {
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        int ans = unique(nums);
        System.out.println(ans);
    }
    static int unique(int[] nums){
        int xor_sum = 0;
        for (int i = 0; i < nums.length; i++) {
            xor_sum ^= nums[i];
        }
        
        return xor_sum;
    }
}
