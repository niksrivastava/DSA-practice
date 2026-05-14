package Arrays;

public class Rotate_image {
    public static void main(String[] args) {
        int arr[][]= {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        int ans[][]= rotate(arr);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] +" ");

            }
            System.out.println();
        }
    }
    static int[][] rotate(int arr[][]){
        for (int r = 0; r < arr.length; r++) {
            for (int c = r+1; c < arr[0].length; c++) {
                int t = arr[r][c];
                arr[r][c] = arr[c][r];
                arr[c][r] = t;
            }
            
        }

        for (int r = 0; r < arr.length; r++) {

            int s = 0;
            int e = arr[r].length-1;
            while(s<e){
                int t = arr[r][e];
                arr[r][e] = arr[r][s];
                arr[r][s] = t;
                s++;
                e--;

            }
            
        }
        return arr;
    }
}
