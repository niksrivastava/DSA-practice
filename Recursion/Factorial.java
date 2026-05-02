import java.util.*;
public class Factorial {

    static int fact(int n){
        if(n==0){
            return 1;
        }
        int cal = fact(n-1);
        int final_ans = n*cal;
        return final_ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = fact(n);
        System.out.println(ans);
        sc.close();
    }
}
