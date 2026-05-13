package Super_Easy_Problems;

public class No_of_digits_in_binary_representation_num {
    public static void main(String[] args) {
        int n =10;
        int base = 2;
        int ans = digits(n, base);
        System.out.println(ans);
    }
    static int digits(int n, int base){
        int digits = (int)(Math.log(n)/Math.log(base)) + 1;
        return digits;
    }
}
