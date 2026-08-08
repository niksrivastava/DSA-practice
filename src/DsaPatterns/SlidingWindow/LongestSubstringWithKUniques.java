package DsaPatterns.SlidingWindow;

// import java.util.*;

public class LongestSubstringWithKUniques {
    public static void main(String[] args) {
        String s = "aabacbebebe" ;
        int k = 3;
        int result = length(s, k);
        System.out.println(result); 
    }
    public static int length(String s, int k){
        int len = 0;
        int low = 0;
        int high = 1;
        int count = 0;
        int n = s.length();
        while(high<n){
                
                if (s.charAt(high) == s.charAt(high-1)) {
                    high++;
                }
                else if(s.charAt(high) != s.charAt(high-1)){
                    
                    
                    for(int i = low; i <= high; i++){
                        if(s.charAt(i) != s.substring(low, high)){
                            count++;
                            
                        }
                        if(count>k){
                            
                            break;
                        }
                
                    }
                    count = 0;
                    low++;
                }
            
        }
    }

}
