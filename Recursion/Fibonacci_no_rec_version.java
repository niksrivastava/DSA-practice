import java.util.*;
public class Fibonacci_no_rec_version {

    static void fibo(int n, int a, int b, int sum){
        sum = a+b;
        n--;
        if(n==0){
            System.out.println(sum);
            return;
        }
        // a = b;
        // b = sum;
        fibo(n, b, sum, sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();
        int a = 0;
        int b = 1;
        int sum = 0;
        if(n==0){
            System.out.println(a);
        }else if(n==1){
            System.out.println(b);
        }
        fibo(n-2, a, b, sum);
        sc.close();
    }
}
