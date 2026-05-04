package Binary_Search;
import java.util.Arrays;
public class Median_of_two_sorted_arr {
    public static void main(String[] args) {
        int[] num1 = {1,2};
        int[] num2 = {3,4};
        System.out.println(median(num1, num2));
    }
    static double median(int[] num1, int[] num2){
        double med = 0;
        int[] nums3 = new int[num1.length+num2.length];
        int s = 0;
        int e = nums3.length-1;
        // System.out.println(num3.length);
        int m = s + (e-s)/2;
        // System.out.println(m);
        for (int i = 0; i < nums3.length-1; i++) {
            if(nums3[i]>nums3[i+1]){
                nums3[i]=nums3[i+1];
            }
        }
        System.out.println(Arrays.toString(nums3));
        // if(nums3.length%2 != 0){
        //     med = nums3[m];
        // }else{
        //     med = m+(m+1);
        //     System.out.println(med);
        // }
        return med;
    }
}
