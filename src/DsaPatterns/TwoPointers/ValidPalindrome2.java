package DsaPatterns.TwoPointers;

public class ValidPalindrome2 {
    public static void main(String[] args) {
        String s = "cdbeeeabddddbaeedebdc";
        boolean ans = IsPalindrome(s);
        System.out.println(ans);
    }

    public static boolean IsPalindrome(String s){
        boolean ans = true;
        boolean ans2 = true;
        
        int j = 0;
        int k = s.length()-1;


        while(j < k){
            
            char ch1 = s.charAt(j);
            char ch2 = s.charAt(k);

            if(ch1 != ch2){
                

                int i = j;
                int n = k;

                j++;

                while(j < k){
                    char ch4 = s.charAt(j);
                    char ch5 = s.charAt(k);
                    if(ch4 != ch5){
                        ans = false;
                        break;
                    }
                    else{
                        ans = true;
                    }
                    j++;
                    k--;
                }

                n--;

                while(i < n){
                    char ch6 = s.charAt(i);
                    char ch7 = s.charAt(n);
                    if(ch6 != ch7){
                        ans2 = false;
                        break;
                        
                    }
                    i++;
                    n--;
                }

                // if(ans == false & ans2 == false){
                //     return false;
                // }
                // else{
                //     return true;
                // }

                return ans || ans2;

            }
            j++;
            k--;
        }
        return ans;
    }
}
 