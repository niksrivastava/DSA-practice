package Arrays;
import java.util.*;
public class Two_sum {
    public static void main(String[] args) {
        int [] nums = {2,7,11,19};
        int target = 30;
        int ans[] = sum(nums, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] sum(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{};
    }
}
