package Recursion;

public class Number_of_Steps_to_Reduce_a_Number_to_Zero {
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
