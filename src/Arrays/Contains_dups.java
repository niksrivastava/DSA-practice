package Arrays;

public class Contains_dups {
    public static void main(String[] args) {
        int [] nums = {1,2,3,2};
        boolean ans = find(nums);
        System.out.println(ans);
    }
    static boolean find(int []nums){
        boolean dups = false;
        int i = 0;
        int j = 0;
        while(j < nums.length){
            if(i == j){
                j++;
                continue;
            }
            if(nums[i] == nums[j]){
                return true;
            }
            if(j == nums.length-1){
                i++;
                j = 0;
                continue;
            }
            j++;

        }
        return dups;
    }
}
