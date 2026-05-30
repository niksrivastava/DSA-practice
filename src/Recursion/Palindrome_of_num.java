package Recursion;

public class Palindrome_of_num {
    public static void main(String[] args) {
        int n = 123454321;
        reverse(n);

        System.out.println(palin(n, sum));
    }
    static int sum = 0;
    static void reverse(int n){
        if(n == 0){
            return;
        }
        int rem = n%10;
        sum = sum*10 + rem;
        reverse(n/10);

    }

    static boolean palin(int n, int reverse){
        return n == reverse;
        
    }
}
