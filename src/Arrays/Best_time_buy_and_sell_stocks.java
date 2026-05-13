package Arrays;

public class Best_time_buy_and_sell_stocks {
    public static void main(String[] args) {
        int [] nums = {7,1,5,3,6,4};
        int ans = profit(nums);
        System.out.println(ans);
    }
    static int profit(int[] nums){
        int profit =0;
        int max_profit =0;
        int privious_buy = Integer.MAX_VALUE;

        for (int buy = 0; buy < nums.length; buy++) {
            if(nums[buy] > privious_buy){
                continue;
            }
            
            for (int sell = buy+1; sell < nums.length; sell++) {
                profit = nums[sell] - nums[buy];
                if(profit < 0){
                    break;
                }
                else{
                    max_profit = Math.max(max_profit, profit);
                }

            }
            privious_buy = nums[buy];
        }
        return max_profit;

    }
}
