package com.nikhil.Miscellaneous;

public class OddEven {
    public static void main(String[] args) {
        int n = 68;
        System.out.println(is_odd(n));
    }
    static boolean is_odd(int n){
        return (n&1) == 1;
    }
}
