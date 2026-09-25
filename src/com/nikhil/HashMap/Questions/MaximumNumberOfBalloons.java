package com.nikhil.HashMap.Questions;

import java.util.HashMap;

public class MaximumNumberOfBalloons {
    public static void main(String[] args) {
        String s = "leetcode";
        int ans = maxBalloons(s);
        System.out.println(ans);
        int betterAns = better(s);
        System.out.println(betterAns);
    }

    public static int maxBalloons(String s){
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);

            }else{
                map.put(ch , 1);
            }
        }

        int b = 0;
        int a = 0;
        int l = 0;
        int o = 0;
        int n = 0;

        int count = 0;
        if(!map.containsKey('b')){
            return 0;
        }
        else{
            b = map.get('b');
                count = b;
            }

        if(!map.containsKey('a')){
            return 0;
        }
        else{
            a = map.get('a');
            if(a < b){
                count = a;
            }
        }

        if(!map.containsKey('l')){
            return 0;
        }
        else{
            l = map.get('l')/2;
            if(l < a){
                count = l;
            }
        }

        if(!map.containsKey('o')){
            return 0;
        }
        else{
            o = map.get('o')/2;
            if(o < l){
                count = o;
            }
        }

        if(!map.containsKey('n')){
            return 0;
        }
        else{
            n = map.get('n');
            if(n < o){
                count = n;
            }
        }
        return count;
    }

    public static int better(String s){
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);

            }else{
                map.put(ch , 1);
            }
        }

        if(!map.containsKey('b') || !map.containsKey('a') || !map.containsKey('l') || !map.containsKey('o') || !map.containsKey('n')){
            return 0;
        }
        
        int b = map.get('b');
        int a = map.get('a');
        int l = map.get('l')/2;
        int o = map.get('o')/2;
        int n = map.get('n');
        return Math.min(b, Math.min(a, Math.min(l, Math.min(o, n))));
    }
}
