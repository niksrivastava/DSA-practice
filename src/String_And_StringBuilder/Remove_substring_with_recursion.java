package String_And_StringBuilder;

public class Remove_substring_with_recursion {
    public static void main(String[] args) {
        System.out.println(skipapple("bdappledg"));
        System.out.println(skipAppNotApple("bahapphsga"));
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

    static String skipAppNotApple(String up){
        if(up.isEmpty()){
            return "";
        }


        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        }
        else{
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}
