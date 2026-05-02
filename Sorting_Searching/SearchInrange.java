

public class SearchInrange {
    public static void main(String[] args) {
        int [] arr = {18, 12, -7, 3, 14, 28};
        int target = 3;
        int ans = search(arr, target, 1, 4);
        System.out.println(ans);
    }
    static int search(int[] arr , int tar, int start, int end){
        if (arr.length == 0){
            return -1;
        }
        end = arr.length - 1;
        for(start = 1; start < end; start++){
            if(arr[start] == tar){
                return arr[start];
            }
        }
        return -1;
    }
    
}
