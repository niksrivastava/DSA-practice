package Arrays;

public class Flipping_an_image {
    public static void main(String[] args) {
        int [][] arr ={
            {1,1,0},
            {1,0,1},
            {0,0,0}
        };
        int ans[][] = flip(arr);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] flip(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        int arr2[][] = new int[n][m];
        for (int row = 0; row < arr.length; row++) {
            int s = 0;
            int e = arr[0].length-1;

            while(s<e){
                swap(arr[row],s,e);
                s++;
                e--;
            }
        }

            for (int r = 0; r < arr.length; r++) {

                for (int c = 0; c < arr[0].length; c++) {
                    if(arr[r][c] == 1){
                        arr2[r][c] =0;
                    }
                    else{
                        arr2[r][c]=1;
                    }
                }
            }

            return arr2;

        }
    
        static void swap(int[] nums, int s, int e ){
        int t = nums[s];
        nums[s] = nums[e];
        nums[e] = t;
    
    }
    
}
