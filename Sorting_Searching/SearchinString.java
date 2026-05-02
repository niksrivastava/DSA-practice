

public class SearchinString {
    public static void main(String[] args) {
    String name = "Nikhil";
    char target = 'k';
    boolean ans = search(name, target);
    System.out.println(ans);
    }
    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
}
