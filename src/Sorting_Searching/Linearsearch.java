package Sorting_Searching;
public class Linearsearch {
    public static void main(String[] args) {
        int[] arr = {2, 3 ,1 ,87, 45, 9, 90, 56, 5};
        int target = 56;
        int ans = search(arr, target);
        System.out.println(ans);
        
    }
    static int search(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return arr[i];
            }
        }
        return -1;
    }
}
