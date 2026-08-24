package DsaPatterns.TwoPointers;
import java.util.*;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "a good   example";
        String ans = reverse(s);
        System.out.println(ans);
    }
    public static String reverse(String s){

        while(true){
            if(s.startsWith(" ") && s.endsWith(" ")){
            s = s.substring(1, s.length()-1);
            }
            else{
                break;
            }
        }

        // if(s.startsWith(" ")){
        //     s = s.substring(1);
        // }

        // if(s.endsWith(" ")){
        //     s = s.substring(0, s.length()-1);
        // }
        
        s = s.trim();
        
        s = s.replaceAll(" +", " ");
        
        int count = 0;

        for (int k = 0; k < s.length(); k++) {
            if(s.charAt(k) == ' '){
                count += 1;
            }
        }

        String arr[] = new String[1 + 2*count];
        int n = 0;
        int m = arr.length-1;

        for (int k = 0; k < s.length(); k++) {
            if(s.charAt(k) != ' ' && k == s.length()-1){
                arr[m] = s.substring(n, k+1);
            }
            else if(s.charAt(k) == ' ' && k < s.length()-1){
                arr[m--] = s.substring(n, k);
                n = k+1;
                arr[m--] = " ";

            }
            
        }
        s = "";

        for (int k = 0; k < arr.length; k++) {
            s += arr[k];
        }
        return s;

    }
}
