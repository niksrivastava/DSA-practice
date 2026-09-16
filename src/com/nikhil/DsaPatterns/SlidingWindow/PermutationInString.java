package com.nikhil.DsaPatterns.SlidingWindow;

import java.util.Arrays;

public class PermutationInString {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        boolean ans = permutation(s1, s2);
        System.out.println(ans);
    }

    public static boolean permutation(String s1, String s2){

        int low = 0;
        int high = s1.length()-1;

        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);
        String sorted1 = new String(arr1);

        while(high < s2.length()){

            String str = s2.substring(low, high+1);
            char[] arr2 = str.toCharArray();
            Arrays.sort(arr2);
            String sorted2 = new String(arr2);

            if(sorted2.equals(sorted1)){
                return true;
            }

            low++;
            high++;
        }

        return false;
    }
}
