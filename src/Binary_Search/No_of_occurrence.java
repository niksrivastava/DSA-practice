package Binary_Search;

public class No_of_occurrence {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,2,3};
        int ans = upper(arr, 3) - lower(arr, 3);
        System.out.println(ans);
    }
    static int upper(int[] nums, int target){
        int s = 0;
        int e = nums.length -1;
        int m = s+ (e-s)/2;
        int ans = nums.length;
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
    static int lower(int[] nums, int target){
        int s = 0;
        int e = nums.length -1;
        int m = s+ (e-s)/2;
        int ans = nums.length;
        while(s<=e){
            if(target <= nums[m]){
                ans = m;
                e = m -1;
            }
            if(target > nums[m]){
                s = m+1;
            }
            // if(target< nums[m]){
            //     e=m-1;
            // }
            m = s + (e-s)/2;
        }
        return ans;
    }
}
