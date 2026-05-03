public class Pattern8 {
    public static void main(String[] args) {
        int n = 4;
        for(int row = 1; row <= n; row++){
            if(row==1 || row ==4){
            for(int col_star = 1; col_star <=6 ; col_star++){
                System.out.print("*" + " ");
            }
        }
            else{
            for(int col_space = 1; col_space <=6 ; col_space++){
                if(col_space==1 || col_space==6){
                    System.out.print("*" + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
        }
            System.out.println();
        }
    }
}
