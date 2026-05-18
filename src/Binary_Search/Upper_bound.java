package Binary_Search;

public class Upper_bound {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,2,3};
        int ans = occur(arr, 1);
        System.out.println(ans);
    }
    static int occur(int[] nums, int target){
        int s = 0;
        int e = nums.length -1;
        int m = s+ (e-s)/2;
        int ans = -1;
        while(s<=e){
            if(target >= nums[m]){
                
                s = m+1;;
            }
            if(target < nums[m]){
                ans = m;
                e = m-1;
            }
          
            m = s + (e-s)/2;
        }
        return ans;
    }
}
