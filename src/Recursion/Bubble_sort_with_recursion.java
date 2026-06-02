package Recursion;
import java.util.*;
public class Bubble_sort_with_recursion {
    public static void main(String[] args) {
        int arr[] = {6,2,3,7,5,9,1};
        bubble(arr, arr.length-1, 1);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int arr[], int r, int c){
        if(r==0){
            return ;
        }

        if(c<r){

            if(arr[c]>arr[c+1]){
                int t = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = t;
            }

            bubble(arr, r, c+1);
        }
        else{
            bubble(arr, r-1, 0);
        }
    }
}
