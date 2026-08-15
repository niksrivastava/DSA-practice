package DsaPatterns.TwoPointers;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        String a = "abcd";
        String b = "efg";
        String ans = mergeString(a,b);
        System.out.println(ans);
    }
    public static String mergeString(String a, String b){
        String ans = "";
        int i = 0;
        int j = 0;
        while(i < a.length() && j < b.length()){
            ans = ans + a.charAt(i) + b.charAt(j);
            i++;
            j++;
        } 

        while(i < a.length()){
            ans = ans + a.charAt(i);
            i++;
        }

        while (j < b.length()) {
            ans = ans + b.charAt(j);
            j++;
        }
        return ans;
    }
}
