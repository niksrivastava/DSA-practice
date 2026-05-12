package Arrays;

public class Maximum_subarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = max_sum(nums);
        System.out.println(ans);
    }
    static int max_sum(int [] nums){
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(sum > maxi){
                maxi = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return maxi;
    }
}
