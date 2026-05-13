package Arrays;

public class Best_time_buy_and_sell_stocks_optimized {
    public static void main(String[] args) {
        int [] nums = {7,1,5,3,6,4};
        int ans = profit(nums);
        System.out.println(ans);
    }
    static int profit(int[] nums){
        
        int profit = 0;
        int max_profit = 0;
        int buy = 0;
        int sell = buy + 1;
        while(sell< nums.length){
            if(nums[sell] <= nums[buy]){
                buy = sell;
                sell = buy +1;
                continue;
            }
            profit = nums[sell] - nums[buy];
            max_profit = Math.max(max_profit, profit);
            sell++;
        }
        return max_profit;


    }
}
