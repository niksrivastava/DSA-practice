package Recursion;

public class Reverse_num {
    public static void main(String[] args) {
        int n = 12345;
        reverse(n);
    }
    static void reverse(int n){
        if(n == 0){
            return;
        }
        System.out.print(n%10);
        reverse(n/10);
    }
}
