package Arrays;
import java.util.*;
public class Extreme_ele_in_alt_manner {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        extreme(nums);
        // System.out.println(Arrays.toString(ans));
    }
    static void extreme(int[] nums){
        int s = 0;
        int e = nums.length-1;
        while(s<e){
            System.out.print(nums[s] + ", ");
            s++;
            System.out.println(nums[e]);
            e--;
        } 
    }
}
