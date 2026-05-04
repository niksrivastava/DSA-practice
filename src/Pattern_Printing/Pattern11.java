package Pattern_Printing;
public class Pattern11 {
    public static void main(String[] args) {
        int n =4;
        int val = 0;
        for(int row = 1; row<=n; row++){
            for(int col_space0= 1; col_space0<=(n-row); col_space0++){
                System.out.print("  ");
            }
            for(int col_space1 =1 ; col_space1<=row+val; col_space1++){
                    if(col_space1 == row-val || col_space1 == row+val){
                        System.out.print("*" + " ");
                    }
                    else{
                        System.out.print("  ");
                    }
            }
            System.out.println();
            val++;
        }
        val=4;
        for(int row=1 ; row<=n-1; row++){
            for(int col_space=1; col_space<= row; col_space++){
                System.out.print("  ");
            }
            for(int col_star=1; col_star<=row+val;col_star++){
                if(col_star==1 || col_star==row+val){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            val -=3;
        }

    }
}
