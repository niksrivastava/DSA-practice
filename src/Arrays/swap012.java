package Arrays;
import java.util.*;
public class swap012 {
    public static void main(String[] args) {
        int arr[] = {0, 2, 2, 1, 0, 1, 1, 0, 2};

        int ans[] = sort(arr);
        System.out.println(Arrays.toString(ans)); 
    }
    
    public static int[] sort(int arr[]){
        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while(mid<=high){
            if(arr[mid] == 0){
                swap(arr, mid,low);
                mid++;
                low++;
               
            }
            else if(arr[mid] == 1){
                
                mid++;
            }
            else{
                swap(arr, mid,high);
                high--;
            }
        }
        return arr;
    }


    public static void swap(int arr[], int i , int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;    
    }    
}
