package String_And_StringBuilder;

public class SubSeq_with_recursion {
    public static void main(String[] args) {
        sub_seq("", "abc");
        
    }
    static void sub_seq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        sub_seq(p + ch, up.substring(1));
        sub_seq(p, up.substring(1));
    }
}
