package Pattern_Printing;
public class Pattern19 {
    public static void main(String[] args) {
        int  n = 4;
        // int val = 0;
        for(int row=1; row<=n; row++){
            for(int col_space=1; col_space<=(n-row); col_space++){
                System.out.print("  ");
            }
            for(int col_str_1=1; col_str_1<=(row); col_str_1++){
                int a = col_str_1;
                int b = 'A' - 1;
                int ans = a+b;
                char final_ans = (char)ans;
                System.out.print(final_ans+ " ");
            }
            char To_Print = (char)(row + 'A' - 2);
            for(int col_str_2=1; col_str_2<=(row-1); col_str_2++){
                System.out.print(To_Print + " ");
                To_Print--;
            }

            System.out.println();
        }
    }
}
