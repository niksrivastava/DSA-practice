package Recursion;

public class Fibo_formula {
    public static void main(String[] args) {
        System.out.println(fibo_formula(50));
        System.out.println(fibo(5));
    }
    static int fibo_formula(int n){
        //just for demo, use long instead....
        return (int)(Math.pow(((1+ Math.sqrt(5)) / 2), n));
    }
    static int fibo(int n){
        // bas condition
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
