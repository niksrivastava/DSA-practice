package Arrays;

import java.util.Arrays;

public class Triplets_with_Smaller_Sum {
    public static void main(String[] args) {
        int arr[] = {5, 1, 3, 4, 7};
        int sum = 12;
        int ans = smaller_sum(arr, sum);
        System.out.println(ans);
    }
    public static int smaller_sum(int arr[], int sum){
        Arrays.sort(arr);
        int count = 0;

        for(int i = 0; i < arr.length-2; i++){
            int left = i+1;
            int right = arr.length-1;
            while(left<right){
                int min_sum = arr[i] + arr[left] + arr[right];
                if(min_sum < sum){
                    count = count + (right-left);
                    left++;
                }else if(min_sum >= sum){
                    right--;
                }
            }
        }
        return count;
    }
}
