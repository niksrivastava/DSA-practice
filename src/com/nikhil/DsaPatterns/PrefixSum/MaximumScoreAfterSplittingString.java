package com.nikhil.DsaPatterns.PrefixSum;

public class MaximumScoreAfterSplittingString {
    public static void main(String[] args) {
        String s = "01001";
        int ans = maxScore(s);
        System.out.println(ans);
    }

    public static int maxScore(String s){
        int n = s.length();
        int prefix = 0;
        int suffix = 0;
        int i = 0;
        int max = 0;

        while(i < n-1){
            if(s.charAt(i) == '0'){
                prefix = prefix + 1;
            }

            for (int k = i+1; k < s.length(); k++) {
                if(s.charAt(k) == '1'){
                    suffix = suffix + 1;
                }
            }
            i++;
            max = Math.max(max, prefix + suffix);
            suffix = 0;
            
        }
        return max;
    }
}
