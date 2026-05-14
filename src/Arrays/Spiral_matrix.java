package Arrays;

// import java.util.ArrayList;
// import java.util.List;
import java.util.*;
public class Spiral_matrix {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> ans = spiral(arr);
        System.out.println(ans);
    }
    static List<Integer> spiral(int[][] arr){
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int m = arr[0].length;

        int startingRow= 0;
        int endingRow= n -1;
        int startingCol= 0;
        int endingCol=m-1;

        while(startingRow <= endingRow && startingCol <= endingCol){

            // row wise left to right..

            for (int col = startingCol; col <= endingCol; col++) {
                ans.add(arr[startingRow][col]);
            }
            startingRow++;

            // col wise top to bottom..

                for (int row = startingRow; row <= endingRow; row++) {
                    ans.add(arr[row][endingCol]);
                }
                endingCol--;

            
            // row wise right to left..
            if(startingRow <= endingRow){
                for (int col = endingCol; col >= startingCol; col--) {
                ans.add(arr[endingRow][col]);
            }
            endingRow--;
            }
            
            
            // col wise bottom to top..

            if(startingCol <= endingCol){
                for (int row = endingRow; row >= startingRow; row--) {
                ans.add(arr[row][startingCol]);
            }
            startingCol++;
            }

        }
        return ans;
    }
}
