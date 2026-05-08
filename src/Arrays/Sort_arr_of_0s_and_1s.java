package Arrays;
import java.util.*;
public class Sort_arr_of_0s_and_1s {
    public static void main(String[] args) {
        int[] nums = {1,0,0,1,0,0,1,1,0,1};
        int ans [] = sort(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] sort(int[] nums){
        int n = nums.length;
        int i = 0;
        int j = n-1;
        while(i<j){
                
                if(nums[i] == 1 && nums[j] == 0){
                    swap(nums,i, j);
                }
                if(nums[i]==0){
                    i++;
                }
                if(nums[j]==1){
                    j--;
                }
            }
            
        
        return nums;
    }
    static void swap(int[] nums, int f, int s){
        int t = nums[f];
        nums[f] = nums[s];
        nums[s] = t;
    }  
}
