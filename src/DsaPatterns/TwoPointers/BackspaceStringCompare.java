package DsaPatterns.TwoPointers;


public class BackspaceStringCompare {
    public static void main(String[] args) {
        String s = "a##c";
        String t = "#a#c";
        boolean ans = compare(s, t);
        boolean ans2 = optimalCompare(s, t);
        System.out.println(ans);
        System.out.println(ans2);
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

    public static boolean optimalCompare(String s, String t){
        boolean ans = false;

        int i = s.length()-1;
        while(i>0){
            if(s.charAt(i) == '#' && s.charAt(i-1) == '#'){
                i--;
            }else if(s.charAt(i) == '#' && s.charAt(i-1) != '#'){
                if(i == 0){
                        continue;
                    }
                s = s.substring(0, i-1) + s.substring(i+1);
                i--;
            }
        }

        int j = t.length()-1;
        while(j>0){
            if(t.charAt(j) == '#' && t.charAt(j-1) == '#'){
                j--;
            }else if(t.charAt(j) == '#' && t.charAt(j-1) != '#'){
                if(j == 0){
                        continue;
                    }
                t = t.substring(0, j-1) + t.substring(j+1);
                j--;
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
