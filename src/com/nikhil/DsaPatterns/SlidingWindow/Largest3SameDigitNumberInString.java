package com.nikhil.DsaPatterns.SlidingWindow;

public class Largest3SameDigitNumberInString {
    public static void main(String[] args) {
        String num = "2300019";
        String ans = number(num);
        System.out.println(ans);
    }

    public static String number(String num){
        String ans = "";
        int count = 0;

        int low = 0;
        int high = 0;

        while(high < num.length()-1){
            high++;

            if(num.charAt(low) == num.charAt(high)){
                
                count = high - low + 1;
                
            }
            else{
                low = high;
            }

            if(count == 3){

                if (ans.isEmpty()) {
                    ans = "" + num.charAt(low) + num.charAt(low) + num.charAt(low); 
                }
                else if(ans.charAt(0) < num.charAt(low)){
                    ans = "" + num.charAt(low) + num.charAt(low) + num.charAt(low); 
                }
                count = 0;
            }
        }

        return ans;
    }
}
