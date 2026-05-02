

public class BinarySearchforDecending {
    public static void main(String[] args) {
        int [] arr = {90, 89, 78, 67, 56, 45, 41, 34, 23, 12};
        int target = 56;
        int ans = search(arr, target);
        System.out.println(ans);
    }   
    static int search(int[] arr, int target){
        int s;
        int e = arr.length - 1;
        
        for(s = 0; s <= e;){
            int m = s +(e - s)/2;
            if (target > arr[m]){
                e = m - 1;
            }else if(target < arr[m]){
                s = m + 1;
            }else return m;
        }
        return -1;
    }
}
