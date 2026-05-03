
import java.util.Arrays;
public class SearchIn2dArray {
    public static void main(String[] args) {
        int [][] arr = {
            {2, 3, 7, 12, 9, 32},
            {6, 34, 90, 12},
            {78, 8, 0, 4, 56},
            {23, 76, 9, 67, 45, 123, 45, 98},
        };
        int target = 56;
        int [] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int [][] arr, int tar){
        if (arr.length == 0){
            return new int[]{-1, -1};
        }

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == tar){
                    return new int[]{row, col};
                }
            }  
        }return new int[]{-1, -1};
    }
}
