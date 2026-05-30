package Recursion;

public class Count_zeros {
    static int c = 0;
    public static void main(String[] args) {
        int n = 3000201;
        int ans = count_zero(n, c);
        System.out.println(ans);
        
    }
    
    static int count_zero(int n, int c){
        if(n == 0){
            return c;
        }

        if(n%10 == 0){
            return count_zero(n/10, c+1);
        
        }
        else{
            return count_zero(n/10, c);
        }
    }
}
