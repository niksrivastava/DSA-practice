package Recursion;

public class Linear_search_with_recursion {
    public static void main(String[] args) {
        int arr[] = {1,2,3523,4,853};
        System.out.println(LS_value(arr,0,0)+"," + " Which means: " +LS_bool(arr, 0, 0));

    }
    static int LS_value(int arr[] , int index, int target){
        if(index == arr.length){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }

        return LS_value(arr, index + 1, target);
    }

        static boolean LS_bool(int arr[] , int index, int target){
        if(index == arr.length){
            return false;
        }

        return arr[index] == target || LS_bool(arr, index + 1, target);
    }
}
