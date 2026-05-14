package Arrays;

public class Minimum_Size_Subarray_Sum {
    public static void main(String[] args) {
        int [] nums = {2,3,1,2,4,3};
        int ans = length(nums, 7);
        System.out.println(ans);
    }
    static int length(int[] nums, int target){
        int count = 0;
        int sum =0;
        int k = 0;
        int store = Integer.MAX_VALUE;
        for(int j = 0; j < nums.length; j++){
            sum += nums[j];
            count++;
            while(sum >= target){
                store = Math.min(store, count);
                sum = sum - nums[k];
                k++;
                count--;
                
            }
        }
        if(store==Integer.MAX_VALUE){
            return 0;
        }
        return store;
    }
}
