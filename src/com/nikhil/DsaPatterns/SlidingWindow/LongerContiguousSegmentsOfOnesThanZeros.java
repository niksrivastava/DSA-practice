package com.nikhil.DsaPatterns.SlidingWindow;

public class LongerContiguousSegmentsOfOnesThanZeros {
    public static void main(String[] args) {
        String s = "01";
        boolean ans = segments(s);
        System.out.println(ans);

    }
    
    public static boolean segments(String s){

        boolean ans = false;

        int one = 0;
        int zero = 0;

        int low = 0;
        int high = 0;

        if(s.length() == 1){
            if(s.charAt(0) == '1'){
                return true;
            }
            else{
                return false;
            }
        }

        while(high < s.length()-1){
            high++;
            if(s.charAt(low) == '0'){
                low=high;
                continue;
            }

            if(s.charAt(high) == '1'){
                one = Math.max(one, high-low+1);
            }
            else{
                one = Math.max(one, high-low);
                low = high+1;
            }
        }

        if (low < s.length() && s.charAt(low) == '1') {
            one = Math.max(one, s.length() - low);
        }

        low = 0;
        high = 0;
        while(high < s.length()-1){
            high++;
            if(s.charAt(low) == '1'){
                
                low=high;
                continue;
            }

            if(s.charAt(high) == '0'){
                zero = Math.max(zero, high-low+1);
            }
            else{
                zero = Math.max(zero, high-low);
                low = high+1;
                
            }
        }

        if (low < s.length() && s.charAt(low) == '0') {
            zero = Math.max(zero, s.length() - low);
        }

        if(one>zero){
            return true;
        }
        return ans;
    }

}

