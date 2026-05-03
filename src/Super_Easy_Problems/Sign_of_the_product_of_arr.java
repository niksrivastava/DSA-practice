package Super_Easy_Problems;

public class Sign_of_the_product_of_arr {
    public static void main(String[] args) {
        int[] nums = {1,2,1,4,5,-1};
        System.out.println(sign(nums));
    }
    static int sign(int[] nums){
        int count = 0;
        int sign = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                return 0;
            }
            else if(nums[i]<0){
                count++;
            }
        }
        if(count%2 == 0){
            sign = 1;
        }
        else{
            sign = -1;
        }
        return sign;
        
    }
}
