package Super_Easy_Problems;

public class Double_reverse {
    public static void main(String[] args) {
        int num = 19;
        boolean ans = DR(num);
        System.out.println(ans);
    }
    static boolean DR(int num){
        if(num%10 == 0 && num != 0){
            return false;
        }
        return true;
    }
}
