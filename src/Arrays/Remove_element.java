package Arrays;

public class Remove_element {
    public static void main(String[] args) {
        int [] nums = {3,2,2,3};
        int ans = remove(nums, 3);
        System.out.println(ans);
    }
    static int remove(int [] nums, int target){
        int j = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                continue;
            }
            else{
                nums[j] = nums[i];
                j++;
                count += 1;

            }
        }
        return count;
    }
}
