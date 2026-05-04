package Pattern_Printing;
public class Pattern14 {
    public static void main(String[] args) {
    int n = 5;
    int sub = 1;
    for(int row=1 ; row<=n; row++){
        for(int col=1; col<=row; col++){
            int a = col;
            int b = 'E' - sub;
            int ans = a + b;
            char final_ans = (char)ans;
            System.out.print(final_ans + " ");
            sub--;
        }
            System.out.println();
        }
    }
}
