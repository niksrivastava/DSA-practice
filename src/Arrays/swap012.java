package Arrays;
import java.util.*;
public class swap012 {

    public static void swap(int arr[], int i , int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;    
    }

    public static void main(String[] args) {
        int arr[] = {0, 2, 2, 1, 0, 1, 1, 0, 2};
        int left = 0;
        int right = arr.length -1;
        int mid = 0 ;
        while(mid<=right ){
            if(arr[mid]==0){
                swap(arr,left,mid);
                left++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{ // arr[mid]==2;
                swap(arr, mid, right);
                
                right--;
            }

        }
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }    
}
