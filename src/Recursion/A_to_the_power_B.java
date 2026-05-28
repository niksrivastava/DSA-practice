package Recursion;

import java.util.Scanner;

public class A_to_the_power_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = power(a, b);
        System.out.println(ans);
        sc.close();
    }
    static int power(int a, int b){
        if(b == 0){
            return 1;
        }
        if(b == 1){
            return a;
        }

        int ans = power(a, b/2);

        if(b%2 == 0){
            return ans * ans;
        }
        else{
            return a* (ans * ans);
        }
    }
}
