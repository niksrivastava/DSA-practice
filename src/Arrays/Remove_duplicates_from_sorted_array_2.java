package Arrays;

import java.util.Arrays;

public class Remove_duplicates_from_sorted_array_2 {
    public static void main(String[] args) {
        int arr[] = {0,0,0,1,1,2,3,3,3,3,4};
        
        System.out.println(remove_dups(arr));
    }
    static int remove_dups(int nums[]){
        int k = 1;
        int i = 0;
        int j = 1;
        int n = nums.length;
            while (j < n) {
                if(nums[i] == nums[j]){
                    if(k==2){
                        j++;
                        continue;
                    }
                    i++;
                    nums[i] = nums[j];
                    k = 2;
                    j++;
                }
            else{
                i++;
                nums[i] = nums[j];
                k=1;
                j++;
            }
        }
        return i+1;
    }
}
