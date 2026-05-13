package Super_Easy_Problems;

public class Power_of_2 {
    public static void main(String[] args) {
        int n = 0;
        boolean is_power_of_two = false;
        int ans = (n & (n-1));
        if(ans == 0 && n != 0){
            is_power_of_two = true;
        }
        System.out.println(is_power_of_two);

    }
}
