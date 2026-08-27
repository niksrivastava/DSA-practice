package DsaPatterns.SlidingWindow;

import java.util.HashSet;


public class SubstringsOfSizeThreeWithDistinctCharacters {
    public static void main(String[] args) {
        String s = "aababcabc";
        int size = 3;
        int ans = countGoodSubstrings(s, size);
        int optimizedAns = countGoodSubstringsOptimized(s, size);
        System.out.println(optimizedAns);
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
    public static int countGoodSubstringsOptimized(String s, int k){

        int count = 0;
        int i = 0;

        while(i < s.length()-2){

            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i+1);
            char ch3 = s.charAt(i+2);

            if(ch1 != ch2 && ch2 != ch3 && ch3 != ch1){
                count++;
            }

            i++;

        }
        return count;
    }
}
