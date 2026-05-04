package Binary_Search;
public class Sqrt_of_X {
    public static void main(String[] args) {
        int x = 37;
        int ans = -1;
        int s = 0;
        int e = x;
        int m = s+ (e-s)/2;
        while (s<=e) {
            if((m * m) == x){
                System.out.println(m);
            }
            else if((m*m) > x){
                e = m-1;
            }
            else{
                ans = m;
                s = m+1;
            }
            m = s+ (e-s)/2;
        }
        System.out.println(ans);
    }
}
