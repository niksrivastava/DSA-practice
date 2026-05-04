package Pattern_Printing;
public class Pattern15 {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=row; col++){
                int a= col;
                int b= 'A'-1;
                int ans= a+b;
                char final_ans= (char)ans;
                System.out.print(final_ans+ " ");

            }
            System.out.println();
        }
    }
}
