package com.nikhil.DsaPatterns.SlidingWindow;
import java.util.*;
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int ans = substring(s);
        System.out.println(ans);
    }

    public static int substring(String s){
        int n = s.length();
        int low = 0;
        int high = 0;
        int maxLen = 0;

        Map<Character, Integer> map = new HashMap<>();

        while(high < n){
            
            char ch = s.charAt(high);

            if(map.containsKey(ch)){
                low = Math.max(low, map.get(ch) + 1);
            }

            map.put(ch, high);
            maxLen = Math.max(maxLen, high-low+1);
            high++;
        }
        return maxLen;
    }
}
