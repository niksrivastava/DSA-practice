package String_And_StringBuilder;

public class Remove_substring_with_recursion {
    public static void main(String[] args) {
        System.out.println(skipapple("bdappledg"));
    }

    static String skipapple(String up){
        if(up.isEmpty()){
            return "";
        }


        if(up.startsWith("apple")){
            return skipapple(up.substring(5));
        }
        else{
            return up.charAt(0) + skipapple(up.substring(1));
        }
    }
}
