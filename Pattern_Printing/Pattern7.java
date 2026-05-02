public class Pattern7 {
    public static void main(String[] args) {
        int  n = 5;
        int val = 4;
        for(int row = 1; row <= n; row++){
            for(int col_space = 1; col_space<=(row-1); col_space++){
                System.out.print("  ");
            }
            for(int col_star = 1; col_star<=((n+val)-(row-1)); col_star++){
                System.out.print("*" + " ");
            }
            System.out.println();
            val--;
        }
    }
}
