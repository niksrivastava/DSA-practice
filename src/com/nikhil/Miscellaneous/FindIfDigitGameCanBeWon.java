package com.nikhil.Miscellaneous;

public class FindIfDigitGameCanBeWon {
    public static void main(String[] args) {
        int[] nums={5,5,5,25};
        System.out.println(game(nums));
    }
    static boolean game(int[] nums){
        boolean win = false;
        int one_digit_sum = 0;
        int two_digit_sum =0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<=9){
                one_digit_sum += nums[i];
            }
            else{
                two_digit_sum += nums[i];
            }
        }
        if(one_digit_sum!=two_digit_sum){
            win = true;
        }
        return win;
    }
}
