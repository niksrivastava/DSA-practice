package Arrays;

public class unique_ele_in_arr {
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        int ans = unique(nums);
        System.out.println(ans);
    }
    static int unique(int [] nums){
        int xor = -1;
        if(nums.length == 1){
            return nums[0];
        }
        System.out.println(nums.length-1);
        for (int i = 0; i < nums.length; i++) {
            if(i == nums.length-1  && xor == -1 ){
                return nums[i];
            }
            for (int j = 0; j < nums.length; j++) {
                if(i==j){
                    continue;
                    }
                if(nums[i] == nums[j]){
                    xor = nums[i] ^ nums[j];
                    break;
                }
            }

            if(xor!=0){
                return nums[i];
            }
            xor = -1;
        }
        return -1; 
    }
}
