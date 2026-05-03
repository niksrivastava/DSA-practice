public class Pattern18 {
    public static void main(String[] args) {
        int n = 4;
        int val = 0;
        for(int row = 1; row<=n; row++){
            for(int col_space = 1; col_space<=(n-row); col_space++){
                System.out.print("  ");
            }
            for(int col_num =1 ; col_num<=(row+val); col_num++){
                System.out.print(row + " ");
            }
            System.out.println();
            val++;
        }

    }
}
