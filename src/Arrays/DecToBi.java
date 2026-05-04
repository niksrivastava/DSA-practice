package Arrays;
import java.util.*;
import java.lang.Math;

public class DecToBi {
    public static void main(String[] args) {
        int ans = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        while(n!=0){
            int bit = n&1;
            ans= (bit * (int)Math.pow(10, i)) + ans;
            n= n>>1;
            i++;
        }
        System.out.println("Ans is:" + ans);
        sc.close();

    }
}
