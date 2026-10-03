package com.nikhil.Recursion.IntroductionAndBasicQuestions;
import java.util.*;
public class PowerOfTwo {

    static int cal(int n){
        if(n == 0){
            return 1;
        }

        int small_problem = cal(n-1);
        int big_problem= 2*small_problem;
        return big_problem;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = cal(n);
        System.out.println(ans);
        sc.close();
    }
}
