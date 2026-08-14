package DsaPatterns.TwoPointers;


public class IsSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "sahdbjtvgchju";
        Boolean ans = Subsequence(s, t);
        System.out.println(ans);
    }
    public static Boolean Subsequence(String s, String t){
        Boolean ans = false;
        int i = 0;
        int j = 0;
        int count = 0; 

        while (j < t.length() && i < s.length()){

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(j);

            if(ch1 == ch2){
                i++;
                j++;
                count += 1;
            }
            else{
                j++;
            }
            
        }
        
        if(s.length() == count){
            ans = true;
        }
        return ans;
    }
}
