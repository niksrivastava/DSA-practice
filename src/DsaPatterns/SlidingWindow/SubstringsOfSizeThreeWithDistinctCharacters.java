package DsaPatterns.SlidingWindow;

import java.util.HashSet;


public class SubstringsOfSizeThreeWithDistinctCharacters {
    public static void main(String[] args) {
        String s = "aababcabc";
        int size = 3;
        int ans = countGoodSubstrings(s, size);
        System.out.println(ans);
    }
    public static int countGoodSubstrings(String s, int k){

        HashSet<Character> seen = new HashSet<>();
        int count = 0;
        

        int low = 0;
        int high = k-1;

        while(high < s.length()){
            boolean saw = false;
            for (int i = low; i <= high; i++) {
                char ch = s.charAt(i);
                if(!seen.add(ch)){
                    saw = true;
                    break;
                }
                
            }

            if(!saw){
                count++;
            }

            low++;
            high++;
            seen.clear();



        }
        return count;
    }
    
}
