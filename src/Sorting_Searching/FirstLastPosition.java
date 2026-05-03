
import java.util.Arrays;
public class FirstLastPosition {
    public static void main(String[] args) {
        int [] nums = {5,7,7,8,8,10};
        int target = 7;
        int [] ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchRange(int[] nums, int target) {
        int findfirst = search1(nums, target);
        int findsecond = search2(nums, target);
        return new int[]{findfirst, findsecond};
       
    }

    // find first index
    static int search1(int []nums, int target){
    int s = 0;
    int e = nums.length - 1;
    int ans = -1;
        for(; s <= e;){
            int m = s + (e - s)/2;      
                if(target == nums[m]){
                    ans = m;
                    e = m - 1;
                }else if (target > nums[m]){
                    s = m + 1;
                }else{
                    e = m - 1;
                }
            }
            return ans;
        }

    // find second index
    static int search2(int []nums, int target){   
    int s = 0;
    int e = nums.length - 1;
    int ans = -1;
        for(; s <= e;){
            int m = s + (e - s)/2;
                if(target == nums[m]){
                    ans = m;
                    s = m + 1;
                }else if (target > nums[m]){
                    s = m + 1;
                }else{
                    e = m - 1;
                    }
            }
        return ans;
    }
}
