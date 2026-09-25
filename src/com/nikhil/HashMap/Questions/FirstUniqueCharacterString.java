package com.nikhil.HashMap.Questions;
import java.util.HashMap;

public class FirstUniqueCharacterString {
    public static void main(String[] args) {
        String s = "aabb";
        int ans = uniq_char(s);
        System.out.println(ans);
    }
    public static int uniq_char(String s){

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }
            else{
                map.put(ch, 1);
            }
        }
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(map.get(ch) == 1){
                index = i;
                break;
            }
        }

        return index;
    }
}
