package Recursion;
import java.util.*;
public class Print_counting_dec {

    static void count(int n){
        if(n==0){
            return;
        }

        System.out.println(n);
        count(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();
        count(n);
        sc.close();
    }
}
