package Arrays;
import java.util.*;
public class Pivot_index_optimum {
    public static void main(String[] args) {
        
    int[] nums= {1,-1,2};
    int ans = pivot(nums);
    System.out.println(ans);

    }
    static int pivot(int[] nums){
        int left = 0;
        int right = nums.length-1;
        int left_sum = 0;
        int right_sum = 0;
        int[] nums2 = new int[nums.length];
        int[] nums3 = new int[nums.length];


        while(left < nums2.length && right >= 0) {

            left_sum += nums[left];
            nums2[left] = left_sum;
            left++;

            right_sum += nums[right];
            nums3[right] = right_sum;
            right--;

        }



        for(int i = 0; i < nums.length; i++){

            if(nums2[i] == nums3[i]){
                return i;
            }

            
        }


        return -1;
    }
}
