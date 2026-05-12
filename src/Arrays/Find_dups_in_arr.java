package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Find_dups_in_arr {
    public static void main(String[] args) {
        int [] nums = {4,3,2,7,8,2,3,1};
        List<Integer> ans = find_dups(nums);
        System.out.println(ans);
    }
    static List<Integer> find_dups(int [] nums){
        
        List<Integer> ans = new ArrayList<>();

        int n = nums.length;

        for (int index = 0; index < n; index++) {
            int value = Math.abs(nums[index]);
            int position = value - 1;

            //Marking....

            if(nums[position] > 0){
                nums[position] = -nums[position];
            }
            else if(nums[position] < 0){
                ans.add(value);
            }


        }

        return ans;
    }
}
