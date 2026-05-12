package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Print_matrix_in_wave_in_reverse {
    
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        List<Integer> ans = sum(arr);
        System.out.println(ans);
    }
    static List<Integer> sum(int[][] arr){
        List<Integer> result = new ArrayList<>();
        int row = 0;
        for (int col = arr[0].length-1; col >= 0; col--) {
            if(col%2 != 0){
                row = arr[0].length-1;
            }
            else{
                row = 0;
            }

            if(row == 0){
                while(row < arr.length){
                    result.add(arr[row][col]);
                    row++;
                }
            }
            else if(row == arr[0].length-1){
                while (row >= 0) {
                    result.add(arr[row][col]);
                    row--;
                }
            }
        
        
            
            
        }
        return result;
    }
}
