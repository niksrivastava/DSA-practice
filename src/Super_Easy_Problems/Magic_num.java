package Super_Easy_Problems;

import java.util.Scanner;

public class Magic_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ans = magic_no(n);
        System.out.println(ans);
        sc.close();
    }
    static int magic_no(int n){
        int magic = 0;
        int base = 5;
        while(n>0){
            int last = n &1;
            n = n>>1;
            magic += last*base;
            base *= 5;
        }

        
        return magic;
    }
}
