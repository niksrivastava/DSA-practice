package Arrays;

public class Unsorted_ele_in_arr {
    public static void main(String[] args) {
        int[] nums = {3, 6, 8, 8, 9, 10, 35};
        System.out.println(unsorted_ele(nums));

    }
    static int unsorted_ele(int[] nums){
        int ele = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]>=nums[i+1]){
                ele = nums[i+1];
            }
        }
        return ele;
    }
}
