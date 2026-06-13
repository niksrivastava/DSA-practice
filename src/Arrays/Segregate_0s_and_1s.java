package Arrays;

import java.util.Arrays;

public class Segregate_0s_and_1s {
    public static void main(String[] args) {
        int arr[] = {0,1,0,1,0,1,0,1,1,0,0};
        segregate(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void segregate(int[] arr) {
        // code here
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            if(arr[i] == 0){
                i++;
            }
            else if(arr[j]==1){
                j--;
            }
            else{
            swap(arr, i , j);
            i++;
            j--;
            }
        }
        
    }
    static void swap(int arr[], int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
