package DsaPatterns.TwoPointers;

import java.util.Arrays;

public class Three_sum_closest {
    public static void main(String[] args) {
        int arr[] = {0,0,0};
        int result = closest(arr, 1);
        System.out.println(result);
    }
    public static int closest(int arr[], int target){

        Arrays.sort(arr);

        int ans = -1;
        int diff = 0;
        int max_diff = Integer.MAX_VALUE;
        int sum = 0;

        
        for(int i = 0; i < arr.length-2; i++){
        
            int left = i+1;
            int right = arr.length-1;

            while(left<right){

                sum = arr[i] + arr[left] + arr[right];
                
                diff = Math.abs(target-sum);
                if (max_diff > diff) {

                    max_diff = diff;
                    ans = sum;

                }
                
                if(sum == target){
                
                    ans = target;
                    return ans;
                
                }else if(sum < target){
                
                    left++;

                }else{
                    right--;
                }

                

            }
        }
        return ans;
    }
}
