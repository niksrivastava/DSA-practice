package Recursion;
import java.util.*;
public class Fibonacci_no {

    static void fibo(int n){
        int a = 0;
        int b = 1;
        int sum = 0;
        System.out.println(a);
        System.out.println(b);

        for(int i = 2; i < n; i++){
            sum = a + b;
            System.out.println(sum);
            a = b;
            b = sum;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();
        fibo(n);
        sc.close();
    }    
}
