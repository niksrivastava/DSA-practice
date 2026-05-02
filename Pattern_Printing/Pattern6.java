public class Pattern6 {
    public static void main(String[] args) {
        int n = 5;
        int val = 0;
        for(int row = 1; row<=n; row++){
            for(int col_space= 1; col_space<=(n-row); col_space++){
                System.out.print("  ");
            }
            
            for(int col_star=1; col_star<=(row+val); col_star++){
                System.out.print("*" +" ");
            }
            System.out.println();
            val++;
        }
    }
}
