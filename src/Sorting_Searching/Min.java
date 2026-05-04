package Sorting_Searching;

public class Min {
    public static void main(String[] args) {
        int[] arr = {2, 3 ,1 ,87, 45, 9, 90, 56, 5};
        // int min = 0;
        int ans = search(arr);
        System.err.println("min is :" + ans);
    }
    static int search(int [] arr){
        if(arr.length == 0){
            return -1;
        }
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
               min = arr[i];
               
            }
        }
        return min;
    }
}
