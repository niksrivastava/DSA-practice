package com.nikhil.LinkedList.Questions;

public class HappyNumber {
    public static void main(String[] args) {
        int num = 5;
        boolean ans = isHappy(num);
        System.out.println(ans);
    }

    public static boolean isHappy(int n){

        int slow = n;
        int fast = n;

        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while(slow != fast);

        if(slow == 1){
            return true;
        }

        return false;
    }

    private static  int findSquare(int num){
        int ans = 0;
        while(num > 0){
            int rem = num % 10;
            ans += rem*rem;
            num /= 10;
        }

        return ans;
    }
}
