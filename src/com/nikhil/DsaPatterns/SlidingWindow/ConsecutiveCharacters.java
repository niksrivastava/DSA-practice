package com.nikhil.DsaPatterns.SlidingWindow;

public class ConsecutiveCharacters {
    public static void main(String[] args) {
        String s = "abbcccddddeeeeedcba";
        int ans = maxChar(s);
        System.out.println(ans);
    }

    public static int maxChar(String s){
        int ans = 1;
        int max = 1;

        int low = 0;
        int high = 0;

        while(high < s.length()-1){
            high++;
            if(s.charAt(low) == s.charAt(high)){
                ans++;
                max = Math.max(max, ans);
            }
            else{
                low = high;
                ans = 1;
            }
        }
        return max;
    }
}
