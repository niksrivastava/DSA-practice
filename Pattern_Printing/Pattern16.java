public class Pattern16 {
    public static void main(String[] args) {
        int n= 5; 
        for(int row=1; row<= n; row++){
            for(int col=1; col<=row; col++){
                int a = n - col + 'A';
                // int b=  'A';
                // int ans = a+ b;
                // char final_ans = (char)a;
                System.out.print((char)a +" ");
            }
            System.out.println();
        }
    }
}
