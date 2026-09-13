package com.nikhil.DsaPatterns.SlidingWindow;

import java.util.HashMap;

public class MaximumLengthSubstringWithTwoOccurrences {
    public static void main(String[] args) {
        String s = "bcbbbcba";
        int ans = maxLenght(s);
        System.out.println(ans);
    }

    public static int maxLenght(String s){
        int ans = 0;
        HashMap <Character, Integer> map = new HashMap<>();
        int low = 0;
        int high = 0;

        while(high < s.length()){
            char ch = s.charAt(high);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            }  else {
                map.put(ch, 1);
            }

            while (map.get(ch) > 2) {

                

                char first = s.charAt(low);

                map.put(first, map.get(first) - 1);

                if (map.get(first) == 0) {
                    map.remove(first);
                }

                low++;
                
            }
            ans = Math.max(ans, high - low + 1);
            high++;
        }
        return ans;
    }
}
