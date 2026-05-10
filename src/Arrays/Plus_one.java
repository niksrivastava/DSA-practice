package Arrays;
import java.util.*;
public class Plus_one {
    public static void main(String[] args) {
        int nums[] = {9,9,9};
        int [] ans = plus(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] plus(int[] digits){
        for(int i = digits.length-1; i >= 0; i--){

            if(digits[i]< 9){

                digits[i] = digits[i] +1;
                return digits;

            }else{

                digits[i] = 0;
            }

        }

        int[] arr = new int [digits.length+1];
        arr[0] = 1;
                    
        return arr;
    }
}
