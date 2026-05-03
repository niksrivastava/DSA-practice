package Super_Easy_Problems;

public class Type_of_Triangle {
    public static void main(String[] args) {
        int[] nums = {2,3,4};
        System.out.println(triangle(nums));
    }
    static String triangle(int[] nums){
        if(nums[0] == nums[1] && nums[1] == nums[nums.length-1]){
                return "equilateral";
            }
            else if((nums[0] == nums[1] || nums[1] == nums[2] || nums[2] == nums[0]) && (nums[0] + nums[1] > nums[2] && nums[0] + nums[2] > nums[1] && nums[1] + nums[2] > nums[0])){
                return "isosceles";
            }
            else if(nums[0] + nums[1] > nums[2] && nums[0] + nums[2] > nums[1] && nums[1] + nums[2] > nums[0]){
                return "scalene";
            }

        return "none";
    }
}
