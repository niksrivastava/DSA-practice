package com.nikhil.HashMap;

import java.util.HashMap;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "abccccdd";
        int ans = longest(s);
        System.out.println(ans);
    }

    public static int longest(String s){
        HashMap <Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }
            else{
                map.put(ch, 1);
            }
        }

        boolean hasOdd = false;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(map.get(ch)%2 == 0){
                count += map.get(ch);
                map.put(ch, 0);
            }
            else if(map.get(ch)%2 == 1){
                count += map.get(ch) - 1;
                hasOdd = true;
            }
        }

        if(hasOdd){
            return count + 1;
        }

        return count;
    }
}
