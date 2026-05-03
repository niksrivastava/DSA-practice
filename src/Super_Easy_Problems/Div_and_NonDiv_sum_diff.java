package Super_Easy_Problems;
public class Div_and_NonDiv_sum_diff {

    public static void main(String[] args) {
        int n = 10;
        int m = 3;
        System.out.println(find_diff(n,m));
    }
    static int find_diff(int n, int m){
        int num1 = 0;
        int num2 = 0;
        for (int i = 1; i <= n; i++) {
            if(i%m == 0){
                num2 += i;
            }
            else if(i%m != 0){

                num1 += i; 
            }
        }
        return num1 - num2;
    }
}