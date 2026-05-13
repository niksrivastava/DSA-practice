package Arrays;

public class Best_time_buy_and_sell_stocks_optimized {
    public static void main(String[] args) {
        int [] nums = {7,1,5,3,6,4};
        int ans = profit(nums);
        System.out.println(ans);
    }
    static int profit(int[] nums){
        
        int min_ele_value = Integer.MAX_VALUE;
        int min_ind =0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < min_ele_value){
                min_ele_value = nums[i];
                min_ind =i;
            }
        }

        int profit =0;
        int max_profit =0;

        int buy = nums[min_ind];
        int sell = min_ind+1;
        while(sell<(nums.length)){
            
            profit = nums[sell]-buy;
            
            max_profit = Math.max(max_profit, profit);
            
            sell++;

        }
        return max_profit;
    }
}
