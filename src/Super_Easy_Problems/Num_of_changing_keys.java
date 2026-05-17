package Super_Easy_Problems;

public class Num_of_changing_keys {
    public static void main(String[] args) {
        String s = "aAbBcC";
        int ans = key(s);
        System.out.println(ans);
    }
    static int key(String s){
        s = s.toLowerCase();
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) != s.charAt(i-1)){
                count++;
            }
        }
        return count;
    }
}
