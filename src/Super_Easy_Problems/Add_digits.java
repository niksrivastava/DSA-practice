package Super_Easy_Problems;
public class Add_digits {
    public static void main(String[] args) {

        int ans = addDigits(38);
        System.out.println(ans);
    }
    static int addDigits(int num){
        while(num>=10){
            int sum = 0;
            while(num>0){
                int digit = num%10;
                sum = sum + digit;
                num = num/10;   
            }
            num = sum;
            sum = 0;
        }
    
        return num;
    }

}
