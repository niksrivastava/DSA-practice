package Super_Easy_Problems;

public class Diff_Btw_ele_sum_and_digit_sum_of_an_array {
    public static void main(String[] args) {
        int[] nums = {1,15,6,3};
        int diff = find_diff(nums);
        System.out.println(diff);
        
    }    
    static int find_diff(int[] nums){
        int ele_sum = 0;
        int digit_sum=0;
        for (int i = 0; i < nums.length; i++) {
            ele_sum += nums[i];
            while(nums[i]>0){
                int digit = nums[i]%10;
                digit_sum += digit;
                nums[i] = nums[i]/10;
            }
            // System.out.println(digit_sum);
        }
        // System.out.println(ele_sum);
        // System.out.println(digit_sum);
        int abs_diff = ele_sum - digit_sum;
        
        return Math.abs(abs_diff);
    }
}
