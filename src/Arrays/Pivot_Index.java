package Arrays;

public class Pivot_Index {
    public static void main(String[] args) {
        int[] nums= {1};
         int ans = pivot(nums);
         System.out.println(ans);
    }
    static int pivot(int[] nums){
        // int pivot = 0;

        int s = 0;
        int e = nums.length -1;
        int i_sum = 0;
        int j_sum = 0;

        if(nums.length == 1){
            return nums.length-1;
        }

        for (int i = 0; i < nums.length; i++) {

            for (int j = i+1; j < nums.length; j++) {
                if(j>nums.length-1){
                    j_sum = 0;
                    break;
                }else
                    {
                    j_sum += nums[j];
                }
            }
            if(i_sum == j_sum){
                return i;

            }
            else{
                i_sum += nums[i];
            }
            j_sum = 0;
        }


        // while(s<e){

        //     left_sum += nums[s];
            
        //     if(left_sum == right_sum){
        //         return s+1;
        //         // break;
        //     }

        //     right_sum += nums[e];

        //     if(left_sum == right_sum){
        //         return e-1;
        //         // break;
        //     }
        //     s++;
        //     e--;

            
        // }



        return -1;
    }
}
