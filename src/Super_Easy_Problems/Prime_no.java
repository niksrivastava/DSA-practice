package Super_Easy_Problems;

public class Prime_no {
    public static void main(String[] args) {
        int num = 20;
        for (int i = 0; i <= num; i++) {
            System.out.println(i + " " + prime(i));
        }

    }
    static boolean prime(int n ){
        if(n <= 1){
            return false;

        }

        int c = 2;
        while(c*c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return true;

    }
}
