package com.nikhil.DsaPatterns.SlidingWindow;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s = "ABBB";
        int k = 2;
        int ans = charReplacement(s, k);
        System.out.println(ans);
    }

    public static int charReplacement(String s, int k ){
        int maxFreq = 0;
        int maxLen = 0;
        int low = 0; 
        int high = 0;

        int [] count = new int[26];

        while(high < s.length()){

            char ch = s.charAt(high);
            count[ch - 'A']++;

            maxFreq = Math.max(maxFreq, count[ch - 'A']);

            while((high - low + 1) - maxFreq > k){
                count[s.charAt(low) - 'A']--;
                low++;
            }

            maxLen = Math.max(maxLen, high-low+1);
            high++;

        }

        return maxLen;
    }
}
