package String_And_StringBuilder;

import java.util.ArrayList;

public class SubSeq_with_recursion {
    public static void main(String[] args) {
        sub_seq("", "abc");
        System.out.println(sub_seq_return("", "abc"));
        
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

    static ArrayList<String> sub_seq_return(String p, String up){
        
        ArrayList<String> list = new ArrayList<>();

        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = sub_seq_return(p + ch, up.substring(1));
        ArrayList<String> right = sub_seq_return(p, up.substring(1));

        left.addAll(right);
        return left;
    }


}
