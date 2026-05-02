public class Pattern17 {
    public static void main(String[] args) {
        int n = 4;
        int val = 0;
        int num=1;
        for(int row = 1; row <= n; row++){
            for(int col_space = 1; col_space <= (n-row); col_space++){
                System.out.print("  ");
            }
            for(int col_num=1; col_num<= (row+val); col_num++){
                System.out.print(num + " ");
                if(col_num!=row){
                    num++;
                }
                else if(col_num==row){
                    num--;
                }
                
            }
            num = 1;
            val++;
            System.out.println();
        }

    }
}
