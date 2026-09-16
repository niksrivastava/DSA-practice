package com.nikhil.DsaPatterns.SlidingWindow;
import java.util.*;
public class FindAllAnagramsInAString {
    public static void main(String[] args) {
        String s = "abab";
        String p = "ab";
        List<Integer> ans = anagrams(s, p);
        System.out.println(ans);
    }

    public static List<Integer> anagrams(String s, String p){

        List<Integer> list = new ArrayList<>();

        int low = 0;
        int high = p.length()-1;

        String str = "";

        char[] arr1 = p.toCharArray();
        Arrays.sort(arr1);
        String sorted1 = new String(arr1);

        while(high < s.length()){

            str = s.substring(low, high+1);
            char[] arr2 = str.toCharArray();
            Arrays.sort(arr2);
            String sorted2 = new String(arr2);


            if(sorted2.equals(sorted1)){
                list.add(low);
            }

            low++;
            high++;
        }
        return list;
    }
}
