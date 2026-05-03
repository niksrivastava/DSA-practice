package Super_Easy_Problems;
public class Count_the_digits_that_divide_a_number {
    public static void main(String[] args) {
        int num = 121;
        int count = 0;
        int n = num;
        while(n>0){
        int div = n%10;
        
        if(num%div==0 && div != 0){
            count++;
            }
            n = n/10;
        }
        
    
        System.out.println(count);
    }
}
