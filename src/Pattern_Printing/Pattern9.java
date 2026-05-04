package Pattern_Printing;
public class Pattern9 {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1; row <=n; row++){
            if(row==1 || row==2 || row==5){
            for(int col_star = 1; col_star <= row ; col_star++){
                System.out.print("*" + " ");
            }
        }
        else{
            for(int col_space =1 ; col_space <=row; col_space++){
                if(col_space==1 || col_space==row){
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
