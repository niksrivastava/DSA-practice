package Super_Easy_Problems;

public class Sum_Multiples {
    public static void main(String[] args) {
        System.out.println(find_sum(10));
    }
    static int find_sum(int n){
    int sum = 0;
        
        for(int i = 1; i <= n;i++){
            if(i%3==0 || i%5==0 || i%7==0){
                sum += i;
            }
        }
        return sum;
    }
}
