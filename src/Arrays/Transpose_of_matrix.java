package Arrays;
import java.util.*;
public class Transpose_of_matrix {
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int result[][] = transpose(arr);
        // System.out.println(Arrays.toString(ans));

        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    static int[][] transpose(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        int[][] nums = new int[m][n];
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                nums[col][row] = arr[row][col];
            }
            
        }
        return nums;
    }
}
