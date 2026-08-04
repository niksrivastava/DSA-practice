package DsaPatterns.SlidingWindow;

public class MaxSumSubarrayOfSizeK {
    public static void main(String[] args) {
        int arr[] = {100, 200, 300, 400};
        int res = maxSum(arr, 2);
        System.out.println(res);
    }
    public static int maxSum(int arr[], int size){
        int sum =0;
        int res = Integer.MIN_VALUE;
        int low = 0;
        int high = size-1;
        for(int i = low; i <= high; i++){
            sum = sum + arr[i] ;
        }
            while(high < arr.length){
                res = Math.max(res, sum);
                low++;
                high++;
                if(high == arr.length){
                    break;
                }
                sum = sum - arr[low-1] + arr[high];

            }

        
        return res;
        

    }
}
