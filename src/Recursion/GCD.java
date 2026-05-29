package Recursion;

public class GCD {
    public static void main(String[] args) {
        int a = 25;
        int b =100;
        int ans = gcd(a, b);
        System.out.println(ans);
        
    }
    static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a,a);
    }
}
