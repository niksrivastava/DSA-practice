

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {2, 4, 6, 7, 23, 34, 45, 56, 57, 67, 89, 90};
        int target = 9;
        int ans = search(arr, target);
        System.out.println(ans);
    }
    static int search(int[] arr, int target){
        int s;
        int e = arr.length - 1;
        
        for(s = 0; s <= e;){
            int m = s +(e - s)/2;
            if (target > arr[m]){
                s = m + 1;
            }else if(target < arr[m]){
                e = m - 1;
            }else return m;
        }
        return -1;
    }
}
