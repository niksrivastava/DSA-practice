package Recursion;

public class LCM {
    public static void main(String[] args){
        int a = 17;
        int b = 34;
        int ans = (a*b)/gcd(a,b);
        System.out.println(ans);
    }
    static int gcd(int a, int b){
        if(a==0){
            return b;

        }
        return gcd(b%a, a);
    }
}
