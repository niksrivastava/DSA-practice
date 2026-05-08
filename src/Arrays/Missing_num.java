package Arrays;

public class Missing_num {
    public static void main(String[] args) {
        int n = 5;
        int [] nums = {2,4,1,0,5};
        int ans = missing(nums, n);
        System.out.println(ans);
    }
    static int missing(int[] nums, int n){
        int sum = 0;
        int range_sum = 0; 
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        for (int i = 0; i <= n; i++) {
            range_sum += i;
        }
        return Math.abs(sum-range_sum);
    }
}
