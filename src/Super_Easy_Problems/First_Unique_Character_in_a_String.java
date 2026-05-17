package Super_Easy_Problems;

public class First_Unique_Character_in_a_String {
    public static void main(String[] args) {
        String s = "aabb";
        int ans = uniq_char(s);
        System.out.println(ans);
    }
    static int uniq_char(String s){
        boolean found = true;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if(i == j){
                    found = false;
                    continue;
                }
                char ch1 = s.charAt(i);
                char ch2 = s.charAt(j);
                if(ch1 == ch2){
                    found = true;
                    break;
                }
                else if(ch1 != ch2){
                    found = false;
                }
            }
            if(found == false){
                return i;
            }
        }
        return -1;
    }
}
