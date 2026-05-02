import java.util.*;
public class Print_counting_inc {

    static void count(int n){
        if(n==0){
            return;
        }
        
        count(n-1);
        System.out.println(n);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();
        count(n);
        sc.close();
    }
}