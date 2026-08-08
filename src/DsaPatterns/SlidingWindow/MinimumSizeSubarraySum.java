package DsaPatterns.SlidingWindow;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int [] nums = {2,3,1,2,4,3};
        int ans = length(nums, 7);
        System.out.println(ans);
    }
    public static int length(int[] arr, int target){
        
        int n = arr.length;
        int sum = 0;
        int low = 0;
        int high = 0;
        int res = Integer.MAX_VALUE;
        int len = 0;

            while(high < n){
                sum = sum + arr[high];
                while(sum>=target){
                    len = high-low+1;
                    res = Math.min(res, len);
                    sum = sum - arr[low];
                    low++;
                }
                high++;
                
            }

            if(res == Integer.MIN_VALUE){
                return 0;
            }
            return len;

        

    }
}
