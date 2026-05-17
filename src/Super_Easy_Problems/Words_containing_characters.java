package Super_Easy_Problems;

import java.util.ArrayList;
import java.util.List;

public class Words_containing_characters {
    public static void main(String[] args) {
        String[] words = {"leet", "code", "hbcw"};
        List<String> ans = words(words, "e");
        System.out.println(ans);
    }
    static List<String> words(String[] words, String x){

        List<String> ans = new ArrayList<>();
        
        for (int i = 0; i < words.length; i++) {

            String str = words[i];

            for (int j = 0; j < str.length(); j++) {

                if(str.charAt(j)== x.charAt(0)){
                    ans.add(str);
                    break;
                }

            }

        }

        return ans;
    }

}
