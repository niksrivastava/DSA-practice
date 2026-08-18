package DsaPatterns.TwoPointers;


public class BackspaceStringCompare {
    public static void main(String[] args) {
        String s = "a##c";
        String t = "#a#c";
        boolean ans = compare(s, t);
        System.out.println(ans);
    }

    public static boolean compare(String s, String t) {
        boolean ans = false;

        for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '#'){
                    if(i == 0){
                        continue;
                    }
                    s = s.substring(0, i-1) + s.substring(i+1);
                    i = i - 2;
                }
        }

        for(int i = 0; i < t.length(); i++){
                if(t.charAt(i) == '#'){
                    if(i == 0){
                        continue;
                    }
                    t = t.substring(0, i-1) + t.substring(i+1);
                    i = i - 2;
                }

        }

        s = s.replace("#", "");
        t = t.replace("#", "");

        if(s.equalsIgnoreCase(t)){
            ans = true;
        }

        return ans;
    }
}
