package DsaPatterns.SlidingWindow;

import java.util.*;

public class LongestSubstringWithKUniques {
    public static void main(String[] args) {
        String s = "aabacbebebe" ;
        int k = 3;
        int result = length(s, k);
        System.out.println(result); 
    }
    public static int length(String s, int k){

        HashMap<Character, Integer> map = new HashMap<>();

        int low = 0;
        int res = -1;
        int n = s.length();

        for(int high = 0; high < n; high++){
            char ch = s.charAt(high);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while(map.size() > k){
                char leftChar = s.charAt(low);
                map.put(leftChar, map.get(leftChar) -1);
                if(map.get(leftChar)==0){
                    map.remove(leftChar);
                }
                low++;
            }
            if(map.size() == k){
                res = Math.max(res, high-low+1);
            }
        }

        return res;

    }

}
