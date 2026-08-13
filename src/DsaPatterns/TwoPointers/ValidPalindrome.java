package DsaPatterns.TwoPointers;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = " ";
        Boolean ans = Palin(s);
        System.out.println(ans);
    }
    public static boolean Palin(String s){
        Boolean ans = true;
        s = s.toLowerCase();
        // s = s.replace(" ", "").replace(",", "").replace(":", "").replace(".", "").replace("-", "");
        // s = s.replaceAll("[ ,.-:]", "");

        s = s.replaceAll("[^a-z0-9]", "");
        int i = 0;
        int j = s.length()-1;
        while (i<j){
            char left = s.charAt(i);
            char right = s.charAt(j);
            if(left != right){
                ans = false;
                break;
            }
            i++;
            j--;

        }
        return ans;

    }
}
