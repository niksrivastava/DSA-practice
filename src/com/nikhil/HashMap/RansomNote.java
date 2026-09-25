package com.nikhil.HashMap;

import java.util.HashMap;

public class RansomNote {
    public static void main(String[] args) {
        String s1 = "aba";
        String s2 = "aa";
        boolean ans = canConstruct(s1, s2);
        System.out.println(ans);
    }

    public static boolean canConstruct(String s1, String s2){
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if(map1.containsKey(ch)){
                map1.put(ch, map1.get(ch) + 1);
            }
            else{
                map1.put((ch), 1);
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if(map2.containsKey(ch)){
                map2.put(ch, map2.get(ch) + 1);
            }
            else{
                map2.put((ch), 1);
            }
        }

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if(map2.containsKey(ch) == false || map1.get(ch) > map2.get(ch)){
                return false;
            }
        }
        return true;
    }
}
