package com.nikhil.Recursion.IntroductionAndBasicQuestions;

public class NumberOfStepsToReduceANumberToZero {
    static int c = 0;
    public static void main(String[] args) {
        int n = 14;
        int ans = count(n, c);
        System.out.println(ans);
    }
    static int count(int n, int c){
        if(n==0){
            return c;
        }

        if(n%2 == 0){
            return count(n/2, c+1);
        }
        else{
            return count(n-1, c+1);
        }
    }
}
