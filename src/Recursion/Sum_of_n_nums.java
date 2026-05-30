package Recursion;

import java.util.Scanner;

public class Sum_of_n_nums {
    static int sum(int n){
        if(n<=1){
            return 1;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = sum(n);
        System.out.println(ans);
        sc.close();
    }
}
