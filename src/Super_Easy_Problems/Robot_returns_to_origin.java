package Super_Easy_Problems;

public class Robot_returns_to_origin {
    public static void main(String[] args) {
        String moves = "UD";
        boolean origin = move(s);
        System.out.println(origin);
    }
    static boolean move(String s){
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'U'){
                count1++;
            }
            if(s.charAt(i) == 'D'){
                count1--;
            }
            if(s.charAt(i) == 'R'){
                count2++;
            }
            if(s.charAt(i) == 'L'){
                count2--;
            }

        }
        if(count1 == 0 && count2 == 0){
            return true;
        }
        return false;
    }
}
