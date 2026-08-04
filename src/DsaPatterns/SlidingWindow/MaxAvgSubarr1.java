package DsaPatterns.SlidingWindow;

public class MaxAvgSubarr1 {
    public static void main(String[] args) {
        int arr[] = {100, 200, 300, 400};
        double res = maxSum(arr, 2);
        System.out.println(res);
    }
        public static double maxSum(int arr[], int size){
        double sum =0;
        double res = Integer.MIN_VALUE;
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

        
        return res/size;
        

    }
}
