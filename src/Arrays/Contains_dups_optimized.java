package Arrays;

import java.util.Arrays;

public class Contains_dups_optimized {
    public static void main(String[] args) {
        int [] nums = {1,2,3,2};
        boolean ans = find(nums);
        System.out.println(ans);
    }
    static boolean find(int []nums){

        boolean dups = false;
        int i = 0;
        Arrays.sort(nums);
        while(i < nums.length-1){
            if(nums[i]==nums[i+1]){
                return true;
            }
            i++;
        }
        return dups;
    }   
}
