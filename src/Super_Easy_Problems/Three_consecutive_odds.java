package Super_Easy_Problems;

public class Three_consecutive_odds {
    public static void main(String[] args) {
        int nums[] = {1,2,34,3,4,5,7,23,12};
        System.out.println(three_odds(nums));
    }
    static boolean three_odds(int [] nums){
        boolean ans = false;
        for (int i = 0; i < nums.length-2; i++) {
            if(nums[i]%2!=0){
                if((nums[i+1]%2 != 0) && (nums[i+2]%2 !=0)){
                    ans = true;
                    break;
                }
            }
        }
        return ans;
    }
}
