package Arrays;

import java.util.Arrays;

public class Third_max_no {
    public static void main(String[] args) {
        int [] nums ={1,2,3,2};
        int ans = max(nums);
        System.out.println(ans);
    }
    static int max(int nums[]){
         Arrays.sort(nums);
        int store = Integer.MIN_VALUE;
        int count = 0;
        for(int i = nums.length-1; i >= 0; i--){
            if(nums[i] == store){
                continue;
            }else{
                store = nums[i];
                count++;
            }
            if(count==3){
                return store;
            }
                
            
        }
        return nums[nums.length-1];
    }
}
