package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Sum_of_each_col_2d_arr {
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
        int sum = 0;
        for(int col = 0; col<arr[0].length;col++){
            sum = 0;
            for(int row= 0; row < arr.length;row++){

                sum += arr[row][col];
                
            }
            result.add(sum);
        }
        return result;
    }
}
