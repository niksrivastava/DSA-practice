package Binary_Search;
import java.util.Arrays;
public class Median_of_two_sorted_arr {
    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        System.out.println(median(nums1, nums2));
    }
    static double median(int[] nums1, int[] nums2){
        int[] nums3 = new int[nums1.length + nums2.length];
        int nums1_s = 0;
        int nums2_s = 0;
        double med = 0;
        int i = 0;
        while( nums1_s < nums1.length && nums2_s < nums2.length){
            if(nums1[nums1_s] > nums2[nums2_s]){
                nums3[i] = nums2[nums2_s];
                nums2_s++;
            }else{
                nums3[i] = nums1[nums1_s];
                nums1_s++;
            }
            i++;
        }
        System.out.println(Arrays.toString(nums3));
        while(nums1_s<nums1.length){
            nums3[i] = nums1[nums1_s];
            nums1_s++;
            i++;
        }

        while(nums2_s<nums2.length){
            nums3[i] = nums2[nums2_s];
            nums2_s++;
            i++;
        }

        int s = 0;
        int e = nums3.length-1;
        int m = s + (e-s)/2;

        if(nums3.length%2 != 0){
            med = nums3[m];
        }else{
            med = (nums3[m]+nums3[m-1])/2.0;

        }
        return med;
    }
}
